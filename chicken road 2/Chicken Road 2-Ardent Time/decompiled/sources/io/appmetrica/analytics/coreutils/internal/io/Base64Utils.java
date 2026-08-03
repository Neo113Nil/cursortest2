package io.appmetrica.analytics.coreutils.internal.io;

/* loaded from: classes.dex */
public final class Base64Utils {
    public static final io.appmetrica.analytics.coreutils.internal.io.Base64Utils INSTANCE = new io.appmetrica.analytics.coreutils.internal.io.Base64Utils();
    public static final int IO_BUFFER_SIZE = 4096;

    private Base64Utils() {
    }

    public static final java.lang.String compressBase64(byte[] bArr) {
        try {
            return android.util.Base64.encodeToString(io.appmetrica.analytics.coreutils.internal.io.GZIPUtils.gzipBytes(bArr), 0);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final java.lang.String compressBase64String(java.lang.String str) {
        byte[] bytes;
        if (str != null) {
            try {
                bytes = str.getBytes(y1.a.f8486a);
            } catch (java.lang.Throwable unused) {
                return null;
            }
        } else {
            bytes = null;
        }
        return compressBase64(bytes);
    }

    public static final byte[] decompressBase64GzipAsBytes(java.lang.String str) {
        java.util.zip.GZIPInputStream gZIPInputStream;
        byte[] bArr;
        java.io.ByteArrayInputStream byteArrayInputStream = null;
        try {
            java.io.ByteArrayInputStream byteArrayInputStream2 = new java.io.ByteArrayInputStream(android.util.Base64.decode(str, 0));
            try {
                gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream2);
                try {
                    bArr = u0.AbstractC0995a.x(gZIPInputStream);
                } catch (java.lang.Throwable unused) {
                    byteArrayInputStream = byteArrayInputStream2;
                    try {
                        bArr = new byte[0];
                        byteArrayInputStream2 = byteArrayInputStream;
                        return bArr;
                    } finally {
                        io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(gZIPInputStream);
                        io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(byteArrayInputStream);
                    }
                }
            } catch (java.lang.Throwable unused2) {
                gZIPInputStream = null;
            }
        } catch (java.lang.Throwable unused3) {
            gZIPInputStream = null;
        }
        return bArr;
    }

    public static final java.lang.String decompressBase64GzipAsString(java.lang.String str) {
        try {
            return new java.lang.String(decompressBase64GzipAsBytes(str), y1.a.f8486a);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
