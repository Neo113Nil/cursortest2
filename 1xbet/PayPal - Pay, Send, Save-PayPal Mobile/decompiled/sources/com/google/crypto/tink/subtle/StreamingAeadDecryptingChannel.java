package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
class StreamingAeadDecryptingChannel implements java.nio.channels.ReadableByteChannel {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] associatedData;
    private java.nio.channels.ReadableByteChannel ciphertextChannel;
    private java.nio.ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private final com.google.crypto.tink.subtle.StreamSegmentDecrypter decrypter;
    private boolean definedState;
    private boolean endOfCiphertext;
    private boolean endOfPlaintext;
    private final int firstCiphertextSegmentSize;
    private java.nio.ByteBuffer header;
    private boolean headerRead;
    private java.nio.ByteBuffer plaintextSegment;
    private int segmentNr;

    public StreamingAeadDecryptingChannel(com.google.crypto.tink.subtle.NonceBasedStreamingAead nonceBasedStreamingAead, java.nio.channels.ReadableByteChannel readableByteChannel, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        this.decrypter = nonceBasedStreamingAead.newStreamSegmentDecrypter();
        this.ciphertextChannel = readableByteChannel;
        this.header = java.nio.ByteBuffer.allocate(nonceBasedStreamingAead.getHeaderLength());
        this.associatedData = java.util.Arrays.copyOf(bArr, bArr.length);
        int ciphertextSegmentSize = nonceBasedStreamingAead.getCiphertextSegmentSize();
        this.ciphertextSegmentSize = ciphertextSegmentSize;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(ciphertextSegmentSize + 1);
        this.ciphertextSegment = allocate;
        allocate.limit(0);
        this.firstCiphertextSegmentSize = ciphertextSegmentSize - nonceBasedStreamingAead.getCiphertextOffset();
        java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(nonceBasedStreamingAead.getPlaintextSegmentSize() + 16);
        this.plaintextSegment = allocate2;
        allocate2.limit(0);
        this.headerRead = false;
        this.endOfCiphertext = false;
        this.endOfPlaintext = false;
        this.segmentNr = 0;
        this.definedState = true;
    }

    private void readSomeCiphertext(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int read;
        do {
            read = this.ciphertextChannel.read(byteBuffer);
            if (read <= 0) {
                break;
            }
        } while (byteBuffer.remaining() > 0);
        if (read == -1) {
            this.endOfCiphertext = true;
        }
    }

    private boolean tryReadHeader() throws java.io.IOException {
        if (this.endOfCiphertext) {
            throw new java.io.IOException("Ciphertext is too short");
        }
        readSomeCiphertext(this.header);
        if (this.header.remaining() > 0) {
            return false;
        }
        this.header.flip();
        try {
            this.decrypter.init(this.header, this.associatedData);
            this.headerRead = true;
            return true;
        } catch (java.security.GeneralSecurityException e) {
            setUndefinedState();
            throw new java.io.IOException(e);
        }
    }

    private void setUndefinedState() {
        this.definedState = false;
        this.plaintextSegment.limit(0);
    }

    private boolean tryLoadSegment() throws java.io.IOException {
        if (!this.endOfCiphertext) {
            readSomeCiphertext(this.ciphertextSegment);
        }
        byte b = 0;
        if (this.ciphertextSegment.remaining() > 0 && !this.endOfCiphertext) {
            return false;
        }
        if (!this.endOfCiphertext) {
            java.nio.ByteBuffer byteBuffer = this.ciphertextSegment;
            b = byteBuffer.get(byteBuffer.position() - 1);
            java.nio.ByteBuffer byteBuffer2 = this.ciphertextSegment;
            byteBuffer2.position(byteBuffer2.position() - 1);
        }
        this.ciphertextSegment.flip();
        this.plaintextSegment.clear();
        try {
            this.decrypter.decryptSegment(this.ciphertextSegment, this.segmentNr, this.endOfCiphertext, this.plaintextSegment);
            this.segmentNr++;
            this.plaintextSegment.flip();
            this.ciphertextSegment.clear();
            if (!this.endOfCiphertext) {
                this.ciphertextSegment.clear();
                this.ciphertextSegment.limit(this.ciphertextSegmentSize + 1);
                this.ciphertextSegment.put(b);
            }
            return true;
        } catch (java.security.GeneralSecurityException e) {
            setUndefinedState();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(e.getMessage());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            sb.append(toString());
            sb.append("\nsegmentNr:");
            sb.append(this.segmentNr);
            sb.append(" endOfCiphertext:");
            sb.append(this.endOfCiphertext);
            throw new java.io.IOException(sb.toString(), e);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        synchronized (this) {
            if (!this.definedState) {
                throw new java.io.IOException("This StreamingAeadDecryptingChannel is in an undefined state");
            }
            if (!this.headerRead) {
                if (!tryReadHeader()) {
                    return 0;
                }
                this.ciphertextSegment.clear();
                this.ciphertextSegment.limit(this.firstCiphertextSegmentSize + 1);
            }
            if (this.endOfPlaintext) {
                return -1;
            }
            int position = byteBuffer.position();
            while (true) {
                if (byteBuffer.remaining() <= 0) {
                    break;
                }
                if (this.plaintextSegment.remaining() == 0) {
                    if (this.endOfCiphertext) {
                        this.endOfPlaintext = true;
                        break;
                    }
                    if (!tryLoadSegment()) {
                        break;
                    }
                }
                if (this.plaintextSegment.remaining() <= byteBuffer.remaining()) {
                    byteBuffer.put(this.plaintextSegment);
                } else {
                    int remaining = byteBuffer.remaining();
                    java.nio.ByteBuffer duplicate = this.plaintextSegment.duplicate();
                    duplicate.limit(duplicate.position() + remaining);
                    byteBuffer.put(duplicate);
                    java.nio.ByteBuffer byteBuffer2 = this.plaintextSegment;
                    byteBuffer2.position(byteBuffer2.position() + remaining);
                }
            }
            int position2 = byteBuffer.position() - position;
            if (position2 == 0 && this.endOfPlaintext) {
                return -1;
            }
            return position2;
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        synchronized (this) {
            this.ciphertextChannel.close();
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        boolean isOpen;
        synchronized (this) {
            isOpen = this.ciphertextChannel.isOpen();
        }
        return isOpen;
    }

    public java.lang.String toString() {
        java.lang.String obj;
        synchronized (this) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StreamingAeadDecryptingChannel\nsegmentNr:");
            sb.append(this.segmentNr);
            sb.append("\nciphertextSegmentSize:");
            sb.append(this.ciphertextSegmentSize);
            sb.append("\nheaderRead:");
            sb.append(this.headerRead);
            sb.append("\nendOfCiphertext:");
            sb.append(this.endOfCiphertext);
            sb.append("\nendOfPlaintext:");
            sb.append(this.endOfPlaintext);
            sb.append("\ndefinedState:");
            sb.append(this.definedState);
            sb.append("\nHeader position:");
            sb.append(this.header.position());
            sb.append(" limit:");
            sb.append(this.header.position());
            sb.append("\nciphertextSgement position:");
            sb.append(this.ciphertextSegment.position());
            sb.append(" limit:");
            sb.append(this.ciphertextSegment.limit());
            sb.append("\nplaintextSegment position:");
            sb.append(this.plaintextSegment.position());
            sb.append(" limit:");
            sb.append(this.plaintextSegment.limit());
            obj = sb.toString();
        }
        return obj;
    }
}
