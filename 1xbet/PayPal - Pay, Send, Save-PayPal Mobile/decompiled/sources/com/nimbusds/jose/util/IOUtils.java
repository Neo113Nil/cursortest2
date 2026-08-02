package com.nimbusds.jose.util;

/* loaded from: classes10.dex */
public class IOUtils {
    public static java.lang.String readInputStreamToString(java.io.InputStream inputStream) throws java.io.IOException {
        return readInputStreamToString(inputStream, com.nimbusds.jose.util.StandardCharset.UTF_8);
    }

    public static java.lang.String readInputStreamToString(java.io.InputStream inputStream, java.nio.charset.Charset charset) throws java.io.IOException {
        char[] cArr = new char[1024];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream, charset);
        while (true) {
            try {
                int read = inputStreamReader.read(cArr, 0, 1024);
                if (read >= 0) {
                    sb.append(cArr, 0, read);
                } else {
                    java.lang.String obj = sb.toString();
                    inputStreamReader.close();
                    return obj;
                }
            } catch (java.lang.Throwable th) {
                try {
                    inputStreamReader.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static java.lang.String readFileToString(java.io.File file) throws java.io.IOException {
        return readInputStreamToString(new java.io.FileInputStream(file));
    }

    public static java.lang.String readFileToString(java.io.File file, java.nio.charset.Charset charset) throws java.io.IOException {
        return readInputStreamToString(new java.io.FileInputStream(file), charset);
    }

    public static void closeSilently(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }

    private IOUtils() {
    }
}
