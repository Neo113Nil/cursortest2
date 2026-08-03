package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Ja {
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String a(java.io.File file) {
        byte[] bArr;
        java.lang.Throwable th;
        java.io.RandomAccessFile randomAccessFile;
        java.nio.channels.FileLock fileLock;
        if (file != null && file.exists()) {
            try {
                randomAccessFile = new java.io.RandomAccessFile(file, "r");
                try {
                    java.nio.channels.FileChannel channel = randomAccessFile.getChannel();
                    fileLock = channel.lock(0L, Long.MAX_VALUE, true);
                    try {
                        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate((int) file.length());
                        channel.read(allocate);
                        allocate.flip();
                        bArr = allocate.array();
                    } catch (java.io.IOException | java.lang.SecurityException unused) {
                        bArr = null;
                        if (bArr != null) {
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        try {
                            io.appmetrica.analytics.impl.Qj qj = io.appmetrica.analytics.impl.AbstractC0595oj.f6598a;
                            qj.getClass();
                            qj.a(new io.appmetrica.analytics.impl.C0621pj("error_during_file_reading", th));
                            bArr = null;
                            if (bArr != null) {
                            }
                        } finally {
                            file.getAbsolutePath();
                            a(fileLock);
                            io.appmetrica.analytics.impl.AbstractC0522lo.a((java.io.Closeable) randomAccessFile);
                        }
                    }
                } catch (java.io.IOException | java.lang.SecurityException unused2) {
                    fileLock = null;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    fileLock = null;
                }
            } catch (java.io.IOException | java.lang.SecurityException unused3) {
                randomAccessFile = null;
                fileLock = null;
            } catch (java.lang.Throwable th4) {
                th = th4;
                randomAccessFile = null;
                fileLock = null;
            }
            if (bArr != null) {
                return null;
            }
            try {
                return new java.lang.String(bArr, "UTF-8");
            } catch (java.io.UnsupportedEncodingException e2) {
                java.lang.String str = new java.lang.String(bArr);
                io.appmetrica.analytics.impl.Qj qj2 = io.appmetrica.analytics.impl.AbstractC0595oj.f6598a;
                qj2.getClass();
                qj2.a(new io.appmetrica.analytics.impl.C0621pj("read_share_file_with_unsupported_encoding", e2));
                return str;
            }
        }
        bArr = null;
        if (bArr != null) {
        }
    }

    public static void a(java.nio.channels.FileLock fileLock) {
        if (fileLock == null || !fileLock.isValid()) {
            return;
        }
        try {
            fileLock.release();
        } catch (java.io.IOException unused) {
        }
    }

    public static void a(java.lang.String str, java.io.FileOutputStream fileOutputStream) {
        java.nio.channels.FileLock fileLock = null;
        try {
            java.nio.channels.FileChannel channel = fileOutputStream.getChannel();
            fileLock = channel.lock();
            byte[] bytes = str.getBytes("UTF-8");
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bytes.length);
            allocate.put(bytes);
            allocate.flip();
            channel.write(allocate);
            channel.force(true);
        } catch (java.io.IOException unused) {
        } finally {
            a(fileLock);
            io.appmetrica.analytics.impl.AbstractC0522lo.a((java.io.Closeable) fileOutputStream);
        }
    }
}
