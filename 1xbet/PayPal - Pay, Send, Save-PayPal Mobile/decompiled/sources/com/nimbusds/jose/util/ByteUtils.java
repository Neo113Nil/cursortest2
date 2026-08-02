package com.nimbusds.jose.util;

/* loaded from: classes4.dex */
public class ByteUtils {
    public static int bitLength(int i) {
        return i * 8;
    }

    public static byte[] concat(byte[]... bArr) {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    byteArrayOutputStream.write(bArr2);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException(e.getMessage(), e);
        }
    }

    public static byte[] subArray(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static int safeBitLength(int i) throws com.nimbusds.jose.util.IntegerOverflowException {
        long j = i * 8;
        int i2 = (int) j;
        if (i2 == j) {
            return i2;
        }
        throw new com.nimbusds.jose.util.IntegerOverflowException();
    }

    public static int bitLength(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bitLength(bArr.length);
    }

    public static int safeBitLength(byte[] bArr) throws com.nimbusds.jose.util.IntegerOverflowException {
        if (bArr == null) {
            return 0;
        }
        return safeBitLength(bArr.length);
    }

    public static int byteLength(int i) {
        return i / 8;
    }

    public static boolean isZeroFilled(byte[] bArr) {
        for (byte b : bArr) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }
}
