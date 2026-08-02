package com.nimbusds.jose.util;

/* loaded from: classes4.dex */
public class BigIntegerUtils {
    public static byte[] toBytesUnsigned(java.math.BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i = 0;
        }
        int i2 = bitLength / 8;
        byte[] bArr = new byte[i2];
        java.lang.System.arraycopy(byteArray, i, bArr, i2 - length, length);
        return bArr;
    }

    private BigIntegerUtils() {
    }
}
