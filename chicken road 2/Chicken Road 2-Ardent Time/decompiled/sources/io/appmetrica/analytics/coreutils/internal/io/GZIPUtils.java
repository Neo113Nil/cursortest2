package io.appmetrica.analytics.coreutils.internal.io;

/* loaded from: classes.dex */
public final class GZIPUtils {
    public static final io.appmetrica.analytics.coreutils.internal.io.GZIPUtils INSTANCE = new io.appmetrica.analytics.coreutils.internal.io.GZIPUtils();

    private GZIPUtils() {
    }

    public static final byte[] gzipBytes(byte[] bArr) {
        java.util.zip.GZIPOutputStream gZIPOutputStream;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr2 = null;
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (bArr != null) {
            try {
                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                } catch (java.lang.Throwable th) {
                    th = th;
                    gZIPOutputStream = null;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
            }
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                bArr2 = byteArrayOutputStream.toByteArray();
                io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(gZIPOutputStream);
                io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(byteArrayOutputStream);
            } catch (java.lang.Throwable th3) {
                th = th3;
                byteArrayOutputStream2 = byteArrayOutputStream;
                io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(gZIPOutputStream);
                io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(byteArrayOutputStream2);
                throw th;
            }
        }
        return bArr2;
    }

    public static final byte[] unGzipBytes(byte[] bArr) {
        java.lang.Throwable th;
        java.util.zip.GZIPInputStream gZIPInputStream;
        java.io.ByteArrayInputStream byteArrayInputStream;
        byte[] bArr2 = null;
        java.io.ByteArrayInputStream byteArrayInputStream2 = null;
        if (bArr != null) {
            try {
                java.io.ByteArrayInputStream byteArrayInputStream3 = new java.io.ByteArrayInputStream(bArr);
                try {
                    gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream3);
                    try {
                        bArr2 = u0.AbstractC0995a.x(gZIPInputStream);
                        io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(gZIPInputStream);
                        io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(byteArrayInputStream3);
                    } catch (java.lang.Throwable th2) {
                        byteArrayInputStream = byteArrayInputStream3;
                        th = th2;
                        byteArrayInputStream2 = byteArrayInputStream;
                        io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(gZIPInputStream);
                        io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(byteArrayInputStream2);
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    byteArrayInputStream = byteArrayInputStream3;
                    th = th3;
                    gZIPInputStream = null;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                gZIPInputStream = null;
            }
        }
        return bArr2;
    }
}
