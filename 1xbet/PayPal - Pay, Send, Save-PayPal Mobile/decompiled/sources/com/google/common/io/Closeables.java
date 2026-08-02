package com.google.common.io;

/* loaded from: classes9.dex */
public final class Closeables {
    static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.common.io.Closeables.class.getName());

    private Closeables() {
    }

    public static void close(java.io.Closeable closeable, boolean z) throws java.io.IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException e) {
            if (z) {
                logger.log(java.util.logging.Level.WARNING, "IOException thrown while closing Closeable.", (java.lang.Throwable) e);
                return;
            }
            throw e;
        }
    }

    public static void closeQuietly(java.io.InputStream inputStream) {
        try {
            close(inputStream, true);
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static void closeQuietly(java.io.Reader reader) {
        try {
            close(reader, true);
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
