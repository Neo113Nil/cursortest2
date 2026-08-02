package com.google.common.io;

/* loaded from: classes9.dex */
final class MultiInputStream extends java.io.InputStream {
    private java.io.InputStream in;
    private final java.util.Iterator<? extends com.google.common.io.ByteSource> it;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public MultiInputStream(java.util.Iterator<? extends com.google.common.io.ByteSource> it) throws java.io.IOException {
        this.it = (java.util.Iterator) com.google.common.base.Preconditions.checkNotNull(it);
        advance();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        java.io.InputStream inputStream = this.in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.in = null;
            }
        }
    }

    private void advance() throws java.io.IOException {
        close();
        if (this.it.hasNext()) {
            this.in = this.it.next().openStream();
        }
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        java.io.InputStream inputStream = this.in;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        while (true) {
            java.io.InputStream inputStream = this.in;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(bArr);
        while (true) {
            java.io.InputStream inputStream = this.in;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                return read;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        java.io.InputStream inputStream = this.in;
        if (inputStream == null || j <= 0) {
            return 0L;
        }
        long skip = inputStream.skip(j);
        if (skip != 0) {
            return skip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.in.skip(j - 1) + 1;
    }
}
