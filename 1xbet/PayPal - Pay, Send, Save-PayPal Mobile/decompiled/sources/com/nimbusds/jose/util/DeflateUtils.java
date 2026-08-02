package com.nimbusds.jose.util;

/* loaded from: classes10.dex */
public class DeflateUtils {
    private static final boolean NOWRAP = true;

    public static byte[] compress(byte[] bArr) throws java.io.IOException {
        java.util.zip.Deflater deflater;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.util.zip.DeflaterOutputStream deflaterOutputStream = null;
        try {
            deflater = new java.util.zip.Deflater(8, true);
            try {
                java.util.zip.DeflaterOutputStream deflaterOutputStream2 = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream, deflater);
                try {
                    deflaterOutputStream2.write(bArr);
                    deflaterOutputStream2.close();
                    deflater.end();
                    return byteArrayOutputStream.toByteArray();
                } catch (java.lang.Throwable th) {
                    th = th;
                    deflaterOutputStream = deflaterOutputStream2;
                    if (deflaterOutputStream != null) {
                        deflaterOutputStream.close();
                    }
                    if (deflater != null) {
                        deflater.end();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            deflater = null;
        }
    }

    public static byte[] decompress(byte[] bArr) throws java.io.IOException {
        java.util.zip.Inflater inflater;
        java.util.zip.InflaterInputStream inflaterInputStream = null;
        try {
            inflater = new java.util.zip.Inflater(true);
            try {
                java.util.zip.InflaterInputStream inflaterInputStream2 = new java.util.zip.InflaterInputStream(new java.io.ByteArrayInputStream(bArr), inflater);
                try {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int read = inflaterInputStream2.read(bArr2);
                        if (read > 0) {
                            byteArrayOutputStream.write(bArr2, 0, read);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            inflaterInputStream2.close();
                            inflater.end();
                            return byteArray;
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    inflaterInputStream = inflaterInputStream2;
                    if (inflaterInputStream != null) {
                        inflaterInputStream.close();
                    }
                    if (inflater != null) {
                        inflater.end();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            inflater = null;
        }
    }

    private DeflateUtils() {
    }
}
