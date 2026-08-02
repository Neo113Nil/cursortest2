package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
class StreamingAeadEncryptingStream extends java.io.FilterOutputStream {
    java.nio.ByteBuffer ctBuffer;
    private com.google.crypto.tink.subtle.StreamSegmentEncrypter encrypter;
    boolean open;
    private int plaintextSegmentSize;
    java.nio.ByteBuffer ptBuffer;

    public StreamingAeadEncryptingStream(com.google.crypto.tink.subtle.NonceBasedStreamingAead nonceBasedStreamingAead, java.io.OutputStream outputStream, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        super(outputStream);
        this.encrypter = nonceBasedStreamingAead.newStreamSegmentEncrypter(bArr);
        int plaintextSegmentSize = nonceBasedStreamingAead.getPlaintextSegmentSize();
        this.plaintextSegmentSize = plaintextSegmentSize;
        this.ptBuffer = java.nio.ByteBuffer.allocate(plaintextSegmentSize);
        this.ctBuffer = java.nio.ByteBuffer.allocate(nonceBasedStreamingAead.getCiphertextSegmentSize());
        this.ptBuffer.limit(this.plaintextSegmentSize - nonceBasedStreamingAead.getCiphertextOffset());
        java.nio.ByteBuffer header = this.encrypter.getHeader();
        byte[] bArr2 = new byte[header.remaining()];
        header.get(bArr2);
        this.out.write(bArr2);
        this.open = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        synchronized (this) {
            if (!this.open) {
                throw new java.io.IOException("Trying to write to closed stream");
            }
            while (i2 > this.ptBuffer.remaining()) {
                int remaining = this.ptBuffer.remaining();
                java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr, i, remaining);
                i += remaining;
                i2 -= remaining;
                try {
                    this.ptBuffer.flip();
                    this.ctBuffer.clear();
                    this.encrypter.encryptSegment(this.ptBuffer, wrap, false, this.ctBuffer);
                    this.ctBuffer.flip();
                    this.out.write(this.ctBuffer.array(), this.ctBuffer.position(), this.ctBuffer.remaining());
                    this.ptBuffer.clear();
                    this.ptBuffer.limit(this.plaintextSegmentSize);
                } catch (java.security.GeneralSecurityException e) {
                    throw new java.io.IOException(e);
                }
            }
            this.ptBuffer.put(bArr, i, i2);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        synchronized (this) {
            if (this.open) {
                try {
                    this.ptBuffer.flip();
                    this.ctBuffer.clear();
                    this.encrypter.encryptSegment(this.ptBuffer, true, this.ctBuffer);
                    this.ctBuffer.flip();
                    this.out.write(this.ctBuffer.array(), this.ctBuffer.position(), this.ctBuffer.remaining());
                    this.open = false;
                    super.close();
                } catch (java.security.GeneralSecurityException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("ptBuffer.remaining():");
                    sb.append(this.ptBuffer.remaining());
                    sb.append(" ctBuffer.remaining():");
                    sb.append(this.ctBuffer.remaining());
                    throw new java.io.IOException(sb.toString(), e);
                }
            }
        }
    }
}
