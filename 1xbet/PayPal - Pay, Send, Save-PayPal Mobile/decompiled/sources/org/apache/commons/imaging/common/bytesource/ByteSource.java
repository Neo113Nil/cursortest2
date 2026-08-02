package org.apache.commons.imaging.common.bytesource;

/* loaded from: classes17.dex */
public abstract class ByteSource {
    private final java.lang.String fileName;

    public abstract byte[] getAll() throws java.io.IOException;

    public abstract byte[] getBlock(long j, int i) throws java.io.IOException;

    public abstract java.lang.String getDescription();

    public abstract java.io.InputStream getInputStream() throws java.io.IOException;

    public abstract long getLength() throws java.io.IOException;

    public ByteSource(java.lang.String str) {
        this.fileName = str;
    }

    public final java.io.InputStream getInputStream(long j) throws java.io.IOException {
        java.io.InputStream inputStream;
        try {
            inputStream = getInputStream();
            try {
                org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, j);
                return inputStream;
            } catch (java.lang.Throwable th) {
                th = th;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public byte[] getBlock(int i, int i2) throws java.io.IOException {
        return getBlock(i & 4294967295L, i2);
    }

    public final java.lang.String getFileName() {
        return this.fileName;
    }
}
