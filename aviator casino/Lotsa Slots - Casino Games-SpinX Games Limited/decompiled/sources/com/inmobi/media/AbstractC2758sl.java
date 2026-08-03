package com.inmobi.media;

/* renamed from: com.inmobi.media.sl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2758sl {

    /* renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f5451a = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME);
    public static final java.nio.charset.Charset b = java.nio.charset.Charset.forName("UTF-8");

    public static java.lang.String a(java.io.InputStreamReader inputStreamReader) {
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, read);
            }
        } finally {
            inputStreamReader.close();
        }
    }

    public static void a(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (java.io.File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    throw new java.io.IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new java.io.IOException("not a readable directory: " + file);
    }

    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
