package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
class StreamingAeadDecryptingStream extends java.io.FilterInputStream {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] aad;
    private final java.nio.ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private final com.google.crypto.tink.subtle.StreamSegmentDecrypter decrypter;
    private boolean decryptionErrorOccured;
    private boolean endOfCiphertext;
    private boolean endOfPlaintext;
    private final int firstCiphertextSegmentSize;
    private final int headerLength;
    private boolean headerRead;
    private final java.nio.ByteBuffer plaintextSegment;
    private int segmentNr;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public StreamingAeadDecryptingStream(com.google.crypto.tink.subtle.NonceBasedStreamingAead nonceBasedStreamingAead, java.io.InputStream inputStream, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        super(inputStream);
        this.decrypter = nonceBasedStreamingAead.newStreamSegmentDecrypter();
        this.headerLength = nonceBasedStreamingAead.getHeaderLength();
        this.aad = java.util.Arrays.copyOf(bArr, bArr.length);
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
        this.decryptionErrorOccured = false;
    }

    private void readHeader() throws java.io.IOException {
        if (this.headerRead) {
            setDecryptionErrorOccured();
            throw new java.io.IOException("Decryption failed.");
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(this.headerLength);
        while (allocate.remaining() > 0) {
            int read = this.in.read(allocate.array(), allocate.position(), allocate.remaining());
            if (read == -1) {
                setDecryptionErrorOccured();
                throw new java.io.IOException("Ciphertext is too short");
            }
            if (read == 0) {
                throw new java.io.IOException("Could not read bytes from the ciphertext stream");
            }
            allocate.position(allocate.position() + read);
        }
        allocate.flip();
        try {
            this.decrypter.init(allocate, this.aad);
            this.headerRead = true;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.io.IOException(e);
        }
    }

    private void setDecryptionErrorOccured() {
        this.decryptionErrorOccured = true;
        this.plaintextSegment.limit(0);
    }

    private void loadSegment() throws java.io.IOException {
        byte b;
        while (!this.endOfCiphertext && this.ciphertextSegment.remaining() > 0) {
            int read = this.in.read(this.ciphertextSegment.array(), this.ciphertextSegment.position(), this.ciphertextSegment.remaining());
            if (read > 0) {
                java.nio.ByteBuffer byteBuffer = this.ciphertextSegment;
                byteBuffer.position(byteBuffer.position() + read);
            } else if (read == -1) {
                this.endOfCiphertext = true;
            } else if (read == 0) {
                throw new java.io.IOException("Could not read bytes from the ciphertext stream");
            }
        }
        if (this.endOfCiphertext) {
            b = 0;
        } else {
            java.nio.ByteBuffer byteBuffer2 = this.ciphertextSegment;
            b = byteBuffer2.get(byteBuffer2.position() - 1);
            java.nio.ByteBuffer byteBuffer3 = this.ciphertextSegment;
            byteBuffer3.position(byteBuffer3.position() - 1);
        }
        this.ciphertextSegment.flip();
        this.plaintextSegment.clear();
        try {
            this.decrypter.decryptSegment(this.ciphertextSegment, this.segmentNr, this.endOfCiphertext, this.plaintextSegment);
            this.segmentNr++;
            this.plaintextSegment.flip();
            this.ciphertextSegment.clear();
            if (this.endOfCiphertext) {
                return;
            }
            this.ciphertextSegment.clear();
            this.ciphertextSegment.limit(this.ciphertextSegmentSize + 1);
            this.ciphertextSegment.put(b);
        } catch (java.security.GeneralSecurityException e) {
            setDecryptionErrorOccured();
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read == 1) {
            return bArr[0] & 255;
        }
        if (read == -1) {
            return read;
        }
        throw new java.io.IOException("Reading failed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        synchronized (this) {
            if (this.decryptionErrorOccured) {
                throw new java.io.IOException("Decryption failed.");
            }
            if (!this.headerRead) {
                readHeader();
                this.ciphertextSegment.clear();
                this.ciphertextSegment.limit(this.firstCiphertextSegmentSize + 1);
            }
            if (this.endOfPlaintext) {
                return -1;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (this.plaintextSegment.remaining() == 0) {
                    if (this.endOfCiphertext) {
                        this.endOfPlaintext = true;
                        break;
                    }
                    loadSegment();
                }
                int min = java.lang.Math.min(this.plaintextSegment.remaining(), i2 - i3);
                this.plaintextSegment.get(bArr, i3 + i, min);
                i3 += min;
            }
            if (i3 == 0 && this.endOfPlaintext) {
                return -1;
            }
            return i3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        synchronized (this) {
            super.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int remaining;
        synchronized (this) {
            remaining = this.plaintextSegment.remaining();
        }
        return remaining;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        int read;
        long j2 = this.ciphertextSegmentSize;
        if (j <= 0) {
            return 0L;
        }
        int min = (int) java.lang.Math.min(j2, j);
        byte[] bArr = new byte[min];
        long j3 = j;
        while (j3 > 0 && (read = read(bArr, 0, (int) java.lang.Math.min(min, j3))) > 0) {
            j3 -= read;
        }
        return j - j3;
    }

    public java.lang.String toString() {
        java.lang.String obj;
        synchronized (this) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StreamingAeadDecryptingStream\nsegmentNr:");
            sb.append(this.segmentNr);
            sb.append("\nciphertextSegmentSize:");
            sb.append(this.ciphertextSegmentSize);
            sb.append("\nheaderRead:");
            sb.append(this.headerRead);
            sb.append("\nendOfCiphertext:");
            sb.append(this.endOfCiphertext);
            sb.append("\nendOfPlaintext:");
            sb.append(this.endOfPlaintext);
            sb.append("\ndecryptionErrorOccured:");
            sb.append(this.decryptionErrorOccured);
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
