package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public final class BigIntUtils {
    public static byte[] toMinimalByteArray(java.math.BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == 1 || (bigInteger.bitLength() & 7) != 0) {
            return byteArray;
        }
        int bitLength = bigInteger.bitLength() >> 3;
        byte[] bArr = new byte[bitLength];
        java.lang.System.arraycopy(byteArray, 1, bArr, 0, bitLength);
        return bArr;
    }

    public static int[] toIntArrayModQ(int i, java.math.BigInteger[] bigIntegerArr) {
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(i);
        int[] iArr = new int[bigIntegerArr.length];
        for (int i2 = 0; i2 < bigIntegerArr.length; i2++) {
            iArr[i2] = bigIntegerArr[i2].mod(valueOf).intValue();
        }
        return iArr;
    }

    public static int[] toIntArray(java.math.BigInteger[] bigIntegerArr) {
        int[] iArr = new int[bigIntegerArr.length];
        for (int i = 0; i < bigIntegerArr.length; i++) {
            iArr[i] = bigIntegerArr[i].intValue();
        }
        return iArr;
    }

    public static java.math.BigInteger[] subArray(java.math.BigInteger[] bigIntegerArr, int i, int i2) {
        int i3 = i2 - i;
        java.math.BigInteger[] bigIntegerArr2 = new java.math.BigInteger[i3];
        java.lang.System.arraycopy(bigIntegerArr, i, bigIntegerArr2, 0, i3);
        return bigIntegerArr2;
    }

    public static void fill(java.math.BigInteger[] bigIntegerArr, java.math.BigInteger bigInteger) {
        for (int length = bigIntegerArr.length - 1; length >= 0; length--) {
            bigIntegerArr[length] = bigInteger;
        }
    }

    public static boolean equals(java.math.BigInteger[] bigIntegerArr, java.math.BigInteger[] bigIntegerArr2) {
        if (bigIntegerArr.length != bigIntegerArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bigIntegerArr.length; i2++) {
            i |= bigIntegerArr[i2].compareTo(bigIntegerArr2[i2]);
        }
        return i == 0;
    }

    private BigIntUtils() {
    }
}
