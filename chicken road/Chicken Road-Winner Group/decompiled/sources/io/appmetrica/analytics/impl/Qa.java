package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
public abstract class Qa {
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(File file) {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        FileLock fileLock;
        if (file != null && file.exists()) {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    fileLock = channel.lock(0L, Long.MAX_VALUE, true);
                    try {
                        ByteBuffer allocate = ByteBuffer.allocate((int) file.length());
                        channel.read(allocate);
                        allocate.flip();
                        byte[] array = allocate.array();
                        file.getAbsolutePath();
                        a(fileLock);
                        AbstractC0711no.a((Closeable) randomAccessFile);
                        bArr = array;
                    } catch (IOException | SecurityException unused) {
                        bArr = null;
                        if (bArr != null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            Vj vj = AbstractC0861tj.f8372a;
                            vj.getClass();
                            vj.a(new C0887uj("error_during_file_reading", th));
                            bArr = null;
                            if (bArr != null) {
                            }
                        } finally {
                            file.getAbsolutePath();
                            a(fileLock);
                            AbstractC0711no.a((Closeable) randomAccessFile);
                        }
                    }
                } catch (IOException | SecurityException unused2) {
                    fileLock = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileLock = null;
                }
            } catch (IOException | SecurityException unused3) {
                randomAccessFile = null;
                fileLock = null;
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = null;
                fileLock = null;
            }
            if (bArr != null) {
                return null;
            }
            try {
                return new String(bArr, CharEncoding.UTF_8);
            } catch (UnsupportedEncodingException e3) {
                String str = new String(bArr);
                Vj vj2 = AbstractC0861tj.f8372a;
                vj2.getClass();
                vj2.a(new C0887uj("read_share_file_with_unsupported_encoding", e3));
                return str;
            }
        }
        bArr = null;
        if (bArr != null) {
        }
    }

    public static void a(FileLock fileLock) {
        if (fileLock == null || !fileLock.isValid()) {
            return;
        }
        try {
            fileLock.release();
        } catch (IOException unused) {
        }
    }

    public static void a(String str, FileOutputStream fileOutputStream) {
        FileLock fileLock = null;
        try {
            FileChannel channel = fileOutputStream.getChannel();
            fileLock = channel.lock();
            byte[] bytes = str.getBytes(CharEncoding.UTF_8);
            ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
            allocate.put(bytes);
            allocate.flip();
            channel.write(allocate);
            channel.force(true);
        } catch (IOException unused) {
        } finally {
            a(fileLock);
            AbstractC0711no.a((Closeable) fileOutputStream);
        }
    }
}
