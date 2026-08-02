package org.apache.commons.imaging.common.bytesource;

/* loaded from: classes17.dex */
public class ByteSourceFile extends org.apache.commons.imaging.common.bytesource.ByteSource {
    private final java.io.File file;

    public ByteSourceFile(java.io.File file) {
        super(file.getName());
        this.file = file;
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public java.io.InputStream getInputStream() throws java.io.IOException {
        return new java.io.BufferedInputStream(new java.io.FileInputStream(this.file));
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public byte[] getBlock(long j, int i) throws java.io.IOException {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(this.file, "r");
        if (j >= 0 && i >= 0) {
            long j2 = i + j;
            if (j2 >= 0) {
                try {
                    if (j2 <= randomAccessFile.length()) {
                        byte[] rAFBytes = org.apache.commons.imaging.common.BinaryFunctions.getRAFBytes(randomAccessFile, j, i, "Could not read value from file");
                        randomAccessFile.close();
                        return rAFBytes;
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        try {
                            randomAccessFile.close();
                        } catch (java.lang.Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not read block (block start: ");
        sb.append(j);
        sb.append(", block length: ");
        sb.append(i);
        sb.append(", data length: ");
        sb.append(randomAccessFile.length());
        sb.append(").");
        throw new java.io.IOException(sb.toString());
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public long getLength() {
        return this.file.length();
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public byte[] getAll() throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.InputStream inputStream = getInputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (inputStream != null) {
                inputStream.close();
            }
            return byteArray;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public java.lang.String getDescription() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("File: '");
        sb.append(this.file.getAbsolutePath());
        sb.append("'");
        return sb.toString();
    }
}
