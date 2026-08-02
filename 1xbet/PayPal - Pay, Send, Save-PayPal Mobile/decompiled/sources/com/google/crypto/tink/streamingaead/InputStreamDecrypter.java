package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
final class InputStreamDecrypter extends java.io.InputStream {
    byte[] associatedData;
    java.io.InputStream ciphertextStream;
    java.util.List<com.google.crypto.tink.StreamingAead> primitives;
    boolean attemptedMatching = false;
    java.io.InputStream matchingStream = null;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public InputStreamDecrypter(java.util.List<com.google.crypto.tink.StreamingAead> list, java.io.InputStream inputStream, byte[] bArr) {
        this.primitives = list;
        if (inputStream.markSupported()) {
            this.ciphertextStream = inputStream;
        } else {
            this.ciphertextStream = new java.io.BufferedInputStream(inputStream);
        }
        this.ciphertextStream.mark(Integer.MAX_VALUE);
        this.associatedData = (byte[]) bArr.clone();
    }

    private void rewind() throws java.io.IOException {
        this.ciphertextStream.reset();
    }

    private void disableRewinding() throws java.io.IOException {
        this.ciphertextStream.mark(0);
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        synchronized (this) {
            java.io.InputStream inputStream = this.matchingStream;
            if (inputStream == null) {
                return 0;
            }
            return inputStream.available();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        synchronized (this) {
            byte[] bArr = new byte[1];
            if (read(bArr) != 1) {
                return -1;
            }
            return bArr[0] & 255;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        int read;
        synchronized (this) {
            read = read(bArr, 0, bArr.length);
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        synchronized (this) {
            if (i2 == 0) {
                return 0;
            }
            java.io.InputStream inputStream = this.matchingStream;
            if (inputStream != null) {
                return inputStream.read(bArr, i, i2);
            }
            if (this.attemptedMatching) {
                throw new java.io.IOException("No matching key found for the ciphertext in the stream.");
            }
            this.attemptedMatching = true;
            java.util.Iterator<com.google.crypto.tink.StreamingAead> it = this.primitives.iterator();
            while (it.hasNext()) {
                try {
                    java.io.InputStream newDecryptingStream = it.next().newDecryptingStream(this.ciphertextStream, this.associatedData);
                    int read = newDecryptingStream.read(bArr, i, i2);
                    if (read == 0) {
                        throw new java.io.IOException("Could not read bytes from the ciphertext stream");
                    }
                    this.matchingStream = newDecryptingStream;
                    disableRewinding();
                    return read;
                } catch (java.io.IOException unused) {
                    rewind();
                } catch (java.security.GeneralSecurityException unused2) {
                    rewind();
                }
            }
            throw new java.io.IOException("No matching key found for the ciphertext in the stream.");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        synchronized (this) {
            this.ciphertextStream.close();
        }
    }
}
