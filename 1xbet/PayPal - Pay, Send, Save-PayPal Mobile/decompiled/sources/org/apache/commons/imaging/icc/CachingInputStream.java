package org.apache.commons.imaging.icc;

/* loaded from: classes17.dex */
class CachingInputStream extends java.io.InputStream {
    private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    private final java.io.InputStream is;

    CachingInputStream(java.io.InputStream inputStream) {
        this.is = inputStream;
    }

    public byte[] getCache() {
        return this.baos.toByteArray();
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        int read = this.is.read();
        this.baos.write(read);
        return read;
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        return this.is.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.is.close();
    }
}
