package org.apache.commons.imaging.common;

/* loaded from: classes17.dex */
public final class ByteConversions {
    private ByteConversions() {
    }

    public static byte[] toBytes(short s, java.nio.ByteOrder byteOrder) {
        byte[] bArr = new byte[2];
        toBytes(s, byteOrder, bArr, 0);
        return bArr;
    }

    public static byte[] toBytes(short[] sArr, java.nio.ByteOrder byteOrder) {
        return toBytes(sArr, 0, sArr.length, byteOrder);
    }

    private static byte[] toBytes(short[] sArr, int i, int i2, java.nio.ByteOrder byteOrder) {
        byte[] bArr = new byte[i2 * 2];
        for (int i3 = 0; i3 < i2; i3++) {
            toBytes(sArr[i + i3], byteOrder, bArr, i3 * 2);
        }
        return bArr;
    }

    private static void toBytes(short s, java.nio.ByteOrder byteOrder, byte[] bArr, int i) {
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            bArr[i] = (byte) (s >> 8);
            bArr[i + 1] = (byte) s;
        } else {
            bArr[i + 1] = (byte) (s >> 8);
            bArr[i] = (byte) s;
        }
    }

    public static byte[] toBytes(int i, java.nio.ByteOrder byteOrder) {
        byte[] bArr = new byte[4];
        toBytes(i, byteOrder, bArr, 0);
        return bArr;
    }

    public static byte[] toBytes(int[] iArr, java.nio.ByteOrder byteOrder) {
        return toBytes(iArr, 0, iArr.length, byteOrder);
    }

    private static byte[] toBytes(int[] iArr, int i, int i2, java.nio.ByteOrder byteOrder) {
        byte[] bArr = new byte[i2 * 4];
        for (int i3 = 0; i3 < i2; i3++) {
            toBytes(iArr[i + i3], byteOrder, bArr, i3 * 4);
        }
        return bArr;
    }

    private static void toBytes(int i, java.nio.ByteOrder byteOrder, byte[] bArr, int i2) {
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            bArr[i2] = (byte) (i >> 24);
            bArr[i2 + 1] = (byte) (i >> 16);
            bArr[i2 + 2] = (byte) (i >> 8);
            bArr[i2 + 3] = (byte) i;
            return;
        }
        bArr[i2 + 3] = (byte) (i >> 24);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2] = (byte) i;
    }

    public static byte[] toBytes(float f, java.nio.ByteOrder byteOrder) {
        byte[] bArr = new byte[4];
        toBytes(f, byteOrder, bArr, 0);
        return bArr;
    }

    public static byte[] toBytes(float[] fArr, java.nio.ByteOrder byteOrder) {
        return toBytes(fArr, 0, fArr.length, byteOrder);
    }

    private static byte[] toBytes(float[] fArr, int i, int i2, java.nio.ByteOrder byteOrder) {
        byte[] bArr = new byte[i2 * 4];
        for (int i3 = 0; i3 < i2; i3++) {
            toBytes(fArr[i + i3], byteOrder, bArr, i3 * 4);
        }
        return bArr;
    }

    private static void toBytes(float f, java.nio.ByteOrder byteOrder, byte[] bArr, int i) {
        int floatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            bArr[i] = (byte) (floatToRawIntBits & 255);
            bArr[i + 1] = (byte) ((floatToRawIntBits >> 8) & 255);
            bArr[i + 2] = (byte) ((floatToRawIntBits >> 16) & 255);
            bArr[i + 3] = (byte) ((floatToRawIntBits >> 24) & 255);
            return;
        }
        bArr[i + 3] = (byte) (floatToRawIntBits & 255);
        bArr[i + 2] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i + 1] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    public static byte[] toBytes(double d, java.nio.ByteOrder byteOrder) {
        byte[] bArr = new byte[8];
        toBytes(d, byteOrder, bArr, 0);
        return bArr;
    }

    public static byte[] toBytes(double[] dArr, java.nio.ByteOrder byteOrder) {
        return toBytes(dArr, 0, dArr.length, byteOrder);
    }

    private static byte[] toBytes(double[] dArr, int i, int i2, java.nio.ByteOrder byteOrder) {
        byte[] bArr = new byte[i2 * 8];
        for (int i3 = 0; i3 < i2; i3++) {
            toBytes(dArr[i + i3], byteOrder, bArr, i3 * 8);
        }
        return bArr;
    }

    private static void toBytes(double d, java.nio.ByteOrder byteOrder, byte[] bArr, int i) {
        long doubleToRawLongBits = java.lang.Double.doubleToRawLongBits(d);
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            bArr[i] = (byte) (doubleToRawLongBits & 255);
            bArr[i + 1] = (byte) ((doubleToRawLongBits >> 8) & 255);
            bArr[i + 2] = (byte) ((doubleToRawLongBits >> 16) & 255);
            bArr[i + 3] = (byte) ((doubleToRawLongBits >> 24) & 255);
            bArr[i + 4] = (byte) ((doubleToRawLongBits >> 32) & 255);
            bArr[i + 5] = (byte) ((doubleToRawLongBits >> 40) & 255);
            bArr[i + 6] = (byte) ((doubleToRawLongBits >> 48) & 255);
            bArr[i + 7] = (byte) ((doubleToRawLongBits >> 56) & 255);
            return;
        }
        bArr[i + 7] = (byte) (doubleToRawLongBits & 255);
        bArr[i + 6] = (byte) ((doubleToRawLongBits >> 8) & 255);
        bArr[i + 5] = (byte) ((doubleToRawLongBits >> 16) & 255);
        bArr[i + 4] = (byte) ((doubleToRawLongBits >> 24) & 255);
        bArr[i + 3] = (byte) ((doubleToRawLongBits >> 32) & 255);
        bArr[i + 2] = (byte) ((doubleToRawLongBits >> 40) & 255);
        bArr[i + 1] = (byte) ((doubleToRawLongBits >> 48) & 255);
        bArr[i] = (byte) ((doubleToRawLongBits >> 56) & 255);
    }

    public static byte[] toBytes(org.apache.commons.imaging.common.RationalNumber rationalNumber, java.nio.ByteOrder byteOrder) {
        byte[] bArr = new byte[8];
        toBytes(rationalNumber, byteOrder, bArr, 0);
        return bArr;
    }

    public static byte[] toBytes(org.apache.commons.imaging.common.RationalNumber[] rationalNumberArr, java.nio.ByteOrder byteOrder) {
        return toBytes(rationalNumberArr, 0, rationalNumberArr.length, byteOrder);
    }

    private static byte[] toBytes(org.apache.commons.imaging.common.RationalNumber[] rationalNumberArr, int i, int i2, java.nio.ByteOrder byteOrder) {
        byte[] bArr = new byte[i2 * 8];
        for (int i3 = 0; i3 < i2; i3++) {
            toBytes(rationalNumberArr[i + i3], byteOrder, bArr, i3 * 8);
        }
        return bArr;
    }

    private static void toBytes(org.apache.commons.imaging.common.RationalNumber rationalNumber, java.nio.ByteOrder byteOrder, byte[] bArr, int i) {
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            bArr[i] = (byte) (rationalNumber.numerator >> 24);
            bArr[i + 1] = (byte) (rationalNumber.numerator >> 16);
            bArr[i + 2] = (byte) (rationalNumber.numerator >> 8);
            bArr[i + 3] = (byte) rationalNumber.numerator;
            bArr[i + 4] = (byte) (rationalNumber.divisor >> 24);
            bArr[i + 5] = (byte) (rationalNumber.divisor >> 16);
            bArr[i + 6] = (byte) (rationalNumber.divisor >> 8);
            bArr[i + 7] = (byte) rationalNumber.divisor;
            return;
        }
        bArr[i + 3] = (byte) (rationalNumber.numerator >> 24);
        bArr[i + 2] = (byte) (rationalNumber.numerator >> 16);
        bArr[i + 1] = (byte) (rationalNumber.numerator >> 8);
        bArr[i] = (byte) rationalNumber.numerator;
        bArr[i + 7] = (byte) (rationalNumber.divisor >> 24);
        bArr[i + 6] = (byte) (rationalNumber.divisor >> 16);
        bArr[i + 5] = (byte) (rationalNumber.divisor >> 8);
        bArr[i + 4] = (byte) rationalNumber.divisor;
    }

    public static short toShort(byte[] bArr, java.nio.ByteOrder byteOrder) {
        return toShort(bArr, 0, byteOrder);
    }

    private static short toShort(byte[] bArr, int i, java.nio.ByteOrder byteOrder) {
        return (short) toUInt16(bArr, i, byteOrder);
    }

    public static short[] toShorts(byte[] bArr, java.nio.ByteOrder byteOrder) {
        return toShorts(bArr, 0, bArr.length, byteOrder);
    }

    private static short[] toShorts(byte[] bArr, int i, int i2, java.nio.ByteOrder byteOrder) {
        int i3 = i2 / 2;
        short[] sArr = new short[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            sArr[i4] = toShort(bArr, (i4 * 2) + i, byteOrder);
        }
        return sArr;
    }

    public static int toUInt16(byte[] bArr, java.nio.ByteOrder byteOrder) {
        return toUInt16(bArr, 0, byteOrder);
    }

    public static int toUInt16(byte[] bArr, int i, java.nio.ByteOrder byteOrder) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        return byteOrder == java.nio.ByteOrder.BIG_ENDIAN ? i3 | (i2 << 8) : (i3 << 8) | i2;
    }

    public static int[] toUInt16s(byte[] bArr, java.nio.ByteOrder byteOrder) {
        return toUInt16s(bArr, 0, bArr.length, byteOrder);
    }

    private static int[] toUInt16s(byte[] bArr, int i, int i2, java.nio.ByteOrder byteOrder) {
        int i3 = i2 / 2;
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i4] = toUInt16(bArr, (i4 * 2) + i, byteOrder);
        }
        return iArr;
    }

    public static int toInt(byte[] bArr, java.nio.ByteOrder byteOrder) {
        return toInt(bArr, 0, byteOrder);
    }

    public static int toInt(byte[] bArr, int i, java.nio.ByteOrder byteOrder) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        int i5 = bArr[i + 3] & 255;
        return byteOrder == java.nio.ByteOrder.BIG_ENDIAN ? i5 | (i2 << 24) | (i3 << 16) | (i4 << 8) : (i5 << 24) | (i4 << 16) | (i3 << 8) | i2;
    }

    public static int[] toInts(byte[] bArr, java.nio.ByteOrder byteOrder) {
        return toInts(bArr, 0, bArr.length, byteOrder);
    }

    private static int[] toInts(byte[] bArr, int i, int i2, java.nio.ByteOrder byteOrder) {
        int i3 = i2 / 4;
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i4] = toInt(bArr, (i4 * 4) + i, byteOrder);
        }
        return iArr;
    }

    public static float toFloat(byte[] bArr, java.nio.ByteOrder byteOrder) {
        return toFloat(bArr, 0, byteOrder);
    }

    private static float toFloat(byte[] bArr, int i, java.nio.ByteOrder byteOrder) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        int i5 = bArr[i + 3] & 255;
        return java.lang.Float.intBitsToFloat(byteOrder == java.nio.ByteOrder.BIG_ENDIAN ? i5 | (i2 << 24) | (i3 << 16) | (i4 << 8) : (i5 << 24) | (i4 << 16) | (i3 << 8) | i2);
    }

    public static float[] toFloats(byte[] bArr, java.nio.ByteOrder byteOrder) {
        return toFloats(bArr, 0, bArr.length, byteOrder);
    }

    private static float[] toFloats(byte[] bArr, int i, int i2, java.nio.ByteOrder byteOrder) {
        int i3 = i2 / 4;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr[i4] = toFloat(bArr, (i4 * 4) + i, byteOrder);
        }
        return fArr;
    }

    public static double toDouble(byte[] bArr, java.nio.ByteOrder byteOrder) {
        return toDouble(bArr, 0, byteOrder);
    }

    private static double toDouble(byte[] bArr, int i, java.nio.ByteOrder byteOrder) {
        long j = bArr[i] & 255;
        long j2 = bArr[i + 1] & 255;
        long j3 = bArr[i + 2] & 255;
        long j4 = bArr[i + 3] & 255;
        long j5 = bArr[i + 4] & 255;
        long j6 = bArr[i + 5] & 255;
        long j7 = bArr[i + 6] & 255;
        long j8 = 255 & bArr[i + 7];
        return java.lang.Double.longBitsToDouble(byteOrder == java.nio.ByteOrder.BIG_ENDIAN ? (j << 56) | (j2 << 48) | (j3 << 40) | (j4 << 32) | (j5 << 24) | (j6 << 16) | (j7 << 8) | j8 : j | (j8 << 56) | (j7 << 48) | (j6 << 40) | (j5 << 32) | (j4 << 24) | (j3 << 16) | (j2 << 8));
    }

    public static double[] toDoubles(byte[] bArr, java.nio.ByteOrder byteOrder) {
        return toDoubles(bArr, 0, bArr.length, byteOrder);
    }

    private static double[] toDoubles(byte[] bArr, int i, int i2, java.nio.ByteOrder byteOrder) {
        int i3 = i2 / 8;
        double[] dArr = new double[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            dArr[i4] = toDouble(bArr, (i4 * 8) + i, byteOrder);
        }
        return dArr;
    }

    public static org.apache.commons.imaging.common.RationalNumber toRational(byte[] bArr, java.nio.ByteOrder byteOrder) {
        return toRational(bArr, 0, byteOrder);
    }

    private static org.apache.commons.imaging.common.RationalNumber toRational(byte[] bArr, int i, java.nio.ByteOrder byteOrder) {
        int i2;
        int i3;
        int i4 = bArr[i] & 255;
        int i5 = bArr[i + 1] & 255;
        int i6 = bArr[i + 2] & 255;
        int i7 = bArr[i + 3] & 255;
        int i8 = bArr[i + 4] & 255;
        int i9 = bArr[i + 5] & 255;
        int i10 = bArr[i + 6] & 255;
        int i11 = bArr[i + 7] & 255;
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            i2 = (i4 << 24) | (i5 << 16) | (i6 << 8) | i7;
            i3 = i11 | (i8 << 24) | (i9 << 16) | (i10 << 8);
        } else {
            i2 = (i7 << 24) | (i6 << 16) | (i5 << 8) | i4;
            i3 = (i11 << 24) | (i10 << 16) | (i9 << 8) | i8;
        }
        return new org.apache.commons.imaging.common.RationalNumber(i2, i3);
    }

    public static org.apache.commons.imaging.common.RationalNumber[] toRationals(byte[] bArr, java.nio.ByteOrder byteOrder) {
        return toRationals(bArr, 0, bArr.length, byteOrder);
    }

    private static org.apache.commons.imaging.common.RationalNumber[] toRationals(byte[] bArr, int i, int i2, java.nio.ByteOrder byteOrder) {
        int i3 = i2 / 8;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArr = new org.apache.commons.imaging.common.RationalNumber[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            rationalNumberArr[i4] = toRational(bArr, (i4 * 8) + i, byteOrder);
        }
        return rationalNumberArr;
    }
}
