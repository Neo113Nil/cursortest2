package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
class StreamingAeadEncryptingChannel implements java.nio.channels.WritableByteChannel {
    private java.nio.channels.WritableByteChannel ciphertextChannel;
    java.nio.ByteBuffer ctBuffer;
    private com.google.crypto.tink.subtle.StreamSegmentEncrypter encrypter;
    boolean open = true;
    private int plaintextSegmentSize;
    java.nio.ByteBuffer ptBuffer;

    public StreamingAeadEncryptingChannel(com.google.crypto.tink.subtle.NonceBasedStreamingAead nonceBasedStreamingAead, java.nio.channels.WritableByteChannel writableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        this.ciphertextChannel = writableByteChannel;
        this.encrypter = nonceBasedStreamingAead.newStreamSegmentEncrypter(bArr);
        int plaintextSegmentSize = nonceBasedStreamingAead.getPlaintextSegmentSize();
        this.plaintextSegmentSize = plaintextSegmentSize;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(plaintextSegmentSize);
        this.ptBuffer = allocate;
        allocate.limit(this.plaintextSegmentSize - nonceBasedStreamingAead.getCiphertextOffset());
        java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(nonceBasedStreamingAead.getCiphertextSegmentSize());
        this.ctBuffer = allocate2;
        allocate2.put(this.encrypter.getHeader());
        this.ctBuffer.flip();
        writableByteChannel.write(this.ctBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int position;
        int position2;
        synchronized (this) {
            if (!this.open) {
                throw new java.nio.channels.ClosedChannelException();
            }
            if (this.ctBuffer.remaining() > 0) {
                this.ciphertextChannel.write(this.ctBuffer);
            }
            position = byteBuffer.position();
            while (true) {
                if (byteBuffer.remaining() > this.ptBuffer.remaining()) {
                    if (this.ctBuffer.remaining() > 0) {
                        position2 = byteBuffer.position();
                        break;
                    }
                    int remaining = this.ptBuffer.remaining();
                    java.nio.ByteBuffer slice = byteBuffer.slice();
                    slice.limit(remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    try {
                        this.ptBuffer.flip();
                        this.ctBuffer.clear();
                        if (slice.remaining() != 0) {
                            this.encrypter.encryptSegment(this.ptBuffer, slice, false, this.ctBuffer);
                        } else {
                            this.encrypter.encryptSegment(this.ptBuffer, false, this.ctBuffer);
                        }
                        this.ctBuffer.flip();
                        this.ciphertextChannel.write(this.ctBuffer);
                        this.ptBuffer.clear();
                        this.ptBuffer.limit(this.plaintextSegmentSize);
                    } catch (java.security.GeneralSecurityException e) {
                        throw new java.io.IOException(e);
                    }
                } else {
                    this.ptBuffer.put(byteBuffer);
                    position2 = byteBuffer.position();
                    break;
                }
            }
        }
        return position2 - position;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        synchronized (this) {
            if (this.open) {
                while (this.ctBuffer.remaining() > 0) {
                    if (this.ciphertextChannel.write(this.ctBuffer) <= 0) {
                        throw new java.io.IOException("Failed to write ciphertext before closing");
                    }
                }
                try {
                    this.ctBuffer.clear();
                    this.ptBuffer.flip();
                    this.encrypter.encryptSegment(this.ptBuffer, true, this.ctBuffer);
                    this.ctBuffer.flip();
                    while (this.ctBuffer.remaining() > 0) {
                        if (this.ciphertextChannel.write(this.ctBuffer) <= 0) {
                            throw new java.io.IOException("Failed to write ciphertext before closing");
                        }
                    }
                    this.ciphertextChannel.close();
                    this.open = false;
                } catch (java.security.GeneralSecurityException e) {
                    throw new java.io.IOException(e);
                }
            }
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.open;
    }
}
