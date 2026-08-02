package org.bouncycastle.crypto.fpe;

/* loaded from: classes17.dex */
class SP80038G {
    protected static final double getHighSpeedVideoSizes = java.lang.Math.log(2.0d);
    protected static final double Camera2StreamConfigurationMap = java.lang.Math.pow(2.0d, 96.0d);

    private static java.math.BigInteger Camera2StreamConfigurationMap(org.bouncycastle.crypto.BlockCipher blockCipher, java.math.BigInteger bigInteger, byte[] bArr, int i, int i2, int i3, byte[] bArr2, short[] sArr) {
        int length = bArr.length;
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(getHighSpeedVideoSizes(bigInteger, sArr));
        int i4 = ((-(length + i + 1)) & 15) + length;
        int i5 = i4 + 1 + i;
        byte[] bArr3 = new byte[i5];
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, length);
        bArr3[i4] = (byte) i3;
        java.lang.System.arraycopy(asUnsignedByteArray, 0, bArr3, i5 - asUnsignedByteArray.length, asUnsignedByteArray.length);
        byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(bArr2, bArr3);
        if (concatenate.length % 16 != 0) {
            throw new java.lang.IllegalArgumentException();
        }
        int length2 = concatenate.length / 16;
        byte[] bArr4 = new byte[16];
        for (int i6 = 0; i6 < length2; i6++) {
            getHighResolutionOutputSizeshNQ4ISI(concatenate, i6 * 16, bArr4, 0, 16);
            blockCipher.processBlock(bArr4, 0, bArr4, 0);
        }
        if (i2 > 16) {
            int i7 = (i2 + 15) / 16;
            byte[] bArr5 = new byte[i7 * 16];
            java.lang.System.arraycopy(bArr4, 0, bArr5, 0, 16);
            byte[] bArr6 = new byte[4];
            for (int i8 = 1; i8 < i7; i8++) {
                int i9 = i8 * 16;
                java.lang.System.arraycopy(bArr4, 0, bArr5, i9, 16);
                org.bouncycastle.util.Pack.intToBigEndian(i8, bArr6, 0);
                getHighResolutionOutputSizeshNQ4ISI(bArr6, 0, bArr5, i9 + 12, 4);
                blockCipher.processBlock(bArr5, i9, bArr5, i9);
            }
            bArr4 = bArr5;
        }
        return new java.math.BigInteger(1, org.bouncycastle.util.Arrays.copyOfRange(bArr4, 0, i2));
    }

    private static java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.BlockCipher blockCipher, java.math.BigInteger bigInteger, byte[] bArr, int i, int i2, short[] sArr) {
        byte[] bArr2 = new byte[16];
        org.bouncycastle.util.Pack.intToBigEndian(i2, bArr2, 0);
        getHighResolutionOutputSizeshNQ4ISI(bArr, i, bArr2, 0, 4);
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(getHighSpeedVideoSizes(bigInteger, sArr));
        if (16 - asUnsignedByteArray.length < 4) {
            throw new java.lang.IllegalStateException("input out of range");
        }
        java.lang.System.arraycopy(asUnsignedByteArray, 0, bArr2, 16 - asUnsignedByteArray.length, asUnsignedByteArray.length);
        getHighResolutionOutputSizeshNQ4ISI(bArr2);
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        getHighResolutionOutputSizeshNQ4ISI(bArr2);
        return new java.math.BigInteger(1, org.bouncycastle.util.Arrays.copyOfRange(bArr2, 0, 16));
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.BlockCipher blockCipher, boolean z, int i, byte[] bArr, int i2, int i3) {
        if (16 != blockCipher.getBlockSize()) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i < 2 || i > 256) {
            throw new java.lang.IllegalArgumentException();
        }
        Camera2StreamConfigurationMap(z, i, i3);
        for (int i4 = 0; i4 < i3; i4++) {
            if ((bArr[i2 + i4] & 255) >= i) {
                throw new java.lang.IllegalArgumentException("input data outside of radix");
            }
        }
    }

    private static void Camera2StreamConfigurationMap(org.bouncycastle.crypto.BlockCipher blockCipher, boolean z, int i, short[] sArr, int i2, int i3) {
        if (16 != blockCipher.getBlockSize()) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i < 2 || i > 65536) {
            throw new java.lang.IllegalArgumentException();
        }
        Camera2StreamConfigurationMap(z, i, i3);
        for (int i4 = 0; i4 < i3; i4++) {
            if ((sArr[i2 + i4] & kotlin.UShort.MAX_VALUE) >= i) {
                throw new java.lang.IllegalArgumentException("input data outside of radix");
            }
        }
    }

    static byte[] Camera2StreamConfigurationMap(org.bouncycastle.crypto.BlockCipher blockCipher, int i, byte[] bArr, byte[] bArr2, int i2, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(blockCipher, true, i, bArr2, i2, i3);
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        short[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(blockCipher, i, bArr, i3, i4, i5, getHighResolutionOutputSizeshNQ4ISI(bArr2, i2, i4), getHighResolutionOutputSizeshNQ4ISI(bArr2, i2 + i4, i5));
        int length = highSpeedVideoFpsRanges.length;
        byte[] bArr3 = new byte[length];
        for (int i6 = 0; i6 != length; i6++) {
            bArr3[i6] = (byte) highSpeedVideoFpsRanges[i6];
        }
        return bArr3;
    }

    static byte[] getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.BlockCipher blockCipher, int i, byte[] bArr, byte[] bArr2, int i2, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(blockCipher, false, i, bArr2, i2, i3);
        if (bArr.length != 7) {
            throw new java.lang.IllegalArgumentException("tweak should be 56 bits");
        }
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        short[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(blockCipher, i, getHighSpeedVideoSizes(bArr), i3, i4, i5, getHighResolutionOutputSizeshNQ4ISI(bArr2, i2, i5), getHighResolutionOutputSizeshNQ4ISI(bArr2, i2 + i5, i4));
        int length = Camera2StreamConfigurationMap2.length;
        byte[] bArr3 = new byte[length];
        for (int i6 = 0; i6 != length; i6++) {
            bArr3[i6] = (byte) Camera2StreamConfigurationMap2[i6];
        }
        return bArr3;
    }

    static short[] getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.BlockCipher blockCipher, int i, byte[] bArr, short[] sArr, int i2, int i3) {
        Camera2StreamConfigurationMap(blockCipher, false, i, sArr, i2, i3);
        if (bArr.length != 7) {
            throw new java.lang.IllegalArgumentException("tweak should be 56 bits");
        }
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bArr);
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        short[] sArr2 = new short[i5];
        short[] sArr3 = new short[i4];
        java.lang.System.arraycopy(sArr, i2, sArr2, 0, i5);
        java.lang.System.arraycopy(sArr, i2 + i5, sArr3, 0, i4);
        return Camera2StreamConfigurationMap(blockCipher, i, highSpeedVideoSizes, i3, i4, i5, sArr2, sArr3);
    }

    static byte[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.crypto.BlockCipher blockCipher, int i, byte[] bArr, byte[] bArr2, int i2, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(blockCipher, true, i, bArr2, i2, i3);
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        short[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(blockCipher, i, bArr, i3, i4, i5, getHighResolutionOutputSizeshNQ4ISI(bArr2, i2, i4), getHighResolutionOutputSizeshNQ4ISI(bArr2, i2 + i4, i5));
        int length = highSpeedVideoFpsRangesFor.length;
        byte[] bArr3 = new byte[length];
        for (int i6 = 0; i6 != length; i6++) {
            bArr3[i6] = (byte) highSpeedVideoFpsRangesFor[i6];
        }
        return bArr3;
    }

    static byte[] getHighSpeedVideoSizes(org.bouncycastle.crypto.BlockCipher blockCipher, int i, byte[] bArr, byte[] bArr2, int i2, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(blockCipher, false, i, bArr2, i2, i3);
        if (bArr.length != 7) {
            throw new java.lang.IllegalArgumentException("tweak should be 56 bits");
        }
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bArr);
        getHighResolutionOutputSizeshNQ4ISI(blockCipher, false, i, bArr2, i2, i3);
        int length = highSpeedVideoSizes.length;
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        short[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(blockCipher, i, highSpeedVideoSizes, i3, i4, i5, getHighResolutionOutputSizeshNQ4ISI(bArr2, i2, i5), getHighResolutionOutputSizeshNQ4ISI(bArr2, i2 + i5, i4));
        int length2 = highResolutionOutputSizeshNQ4ISI.length;
        byte[] bArr3 = new byte[length2];
        for (int i6 = 0; i6 != length2; i6++) {
            bArr3[i6] = (byte) highResolutionOutputSizeshNQ4ISI[i6];
        }
        return bArr3;
    }

    static short[] Camera2StreamConfigurationMap(org.bouncycastle.crypto.BlockCipher blockCipher, int i, byte[] bArr, short[] sArr, int i2, int i3) {
        Camera2StreamConfigurationMap(blockCipher, false, i, sArr, i2, i3);
        if (bArr.length != 7) {
            throw new java.lang.IllegalArgumentException("tweak should be 56 bits");
        }
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bArr);
        Camera2StreamConfigurationMap(blockCipher, false, i, sArr, i2, i3);
        int length = highSpeedVideoSizes.length;
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        short[] sArr2 = new short[i5];
        short[] sArr3 = new short[i4];
        java.lang.System.arraycopy(sArr, i2, sArr2, 0, i5);
        java.lang.System.arraycopy(sArr, i2 + i5, sArr3, 0, i4);
        return getHighResolutionOutputSizeshNQ4ISI(blockCipher, i, highSpeedVideoSizes, i3, i4, i5, sArr2, sArr3);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 + i4;
            bArr2[i5] = (byte) (bArr2[i5] ^ bArr[i + i4]);
        }
    }

    private static short[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2) {
        short[] sArr = new short[i2];
        for (int i3 = 0; i3 != i2; i3++) {
            sArr[i3] = (short) (bArr[i + i3] & 255);
        }
        return sArr;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, int i, short[] sArr) {
        if (bigInteger2.signum() < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        for (int i2 = 1; i2 <= i; i2++) {
            java.math.BigInteger[] divideAndRemainder = bigInteger2.divideAndRemainder(bigInteger);
            sArr[i - i2] = (short) divideAndRemainder[1].intValue();
            bigInteger2 = divideAndRemainder[0];
        }
        if (bigInteger2.signum() != 0) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    private static void getHighSpeedVideoSizes(short[] sArr) {
        int length = sArr.length / 2;
        int length2 = sArr.length;
        for (int i = 0; i < length; i++) {
            short s = sArr[i];
            int i2 = (length2 - 1) - i;
            sArr[i] = sArr[i2];
            sArr[i2] = s;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        int length = bArr.length / 2;
        int length2 = bArr.length;
        for (int i = 0; i < 8; i++) {
            byte b = bArr[i];
            int i2 = 15 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
    }

    private static java.math.BigInteger getHighSpeedVideoSizes(java.math.BigInteger bigInteger, short[] sArr) {
        java.math.BigInteger bigInteger2 = org.bouncycastle.util.BigIntegers.ZERO;
        for (short s : sArr) {
            bigInteger2 = bigInteger2.multiply(bigInteger).add(java.math.BigInteger.valueOf(s & kotlin.UShort.MAX_VALUE));
        }
        return bigInteger2;
    }

    static short[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.BlockCipher blockCipher, int i, byte[] bArr, short[] sArr, int i2, int i3) {
        Camera2StreamConfigurationMap(blockCipher, true, i, sArr, i2, i3);
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        short[] sArr2 = new short[i4];
        short[] sArr3 = new short[i5];
        java.lang.System.arraycopy(sArr, i2, sArr2, 0, i4);
        java.lang.System.arraycopy(sArr, i2 + i4, sArr3, 0, i5);
        return getHighSpeedVideoFpsRangesFor(blockCipher, i, bArr, i3, i4, i5, sArr2, sArr3);
    }

    private static short[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.BlockCipher blockCipher, int i, byte[] bArr, int i2, int i3, int i4, short[] sArr, short[] sArr2) {
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(i);
        int i5 = i3;
        java.math.BigInteger[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(valueOf, i5, i4);
        getHighSpeedVideoSizes(sArr);
        getHighSpeedVideoSizes(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i6 = 0;
        while (i6 < 8) {
            i5 = i2 - i5;
            int i7 = i6 & 1;
            getHighResolutionOutputSizeshNQ4ISI(valueOf, getHighSpeedVideoSizes(valueOf, sArr3).add(getHighResolutionOutputSizeshNQ4ISI(blockCipher, valueOf, bArr, 4 - (i7 * 4), i6, sArr4)).mod(Camera2StreamConfigurationMap2[1 - i7]), i5, sArr3);
            i6++;
            short[] sArr5 = sArr4;
            sArr4 = sArr3;
            sArr3 = sArr5;
        }
        getHighSpeedVideoSizes(sArr3);
        getHighSpeedVideoSizes(sArr4);
        return org.bouncycastle.util.Arrays.concatenate(sArr3, sArr4);
    }

    private static short[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.crypto.BlockCipher blockCipher, int i, byte[] bArr, int i2, int i3, int i4, short[] sArr, short[] sArr2) {
        int length = bArr.length;
        int ceil = (((int) java.lang.Math.ceil((java.lang.Math.log(i) * i4) / getHighSpeedVideoSizes)) + 7) / 8;
        int i5 = (ceil + 3) / 4;
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i, (byte) i3, i2, length);
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(i);
        java.math.BigInteger[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(valueOf, i3, i4);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i6 = 0;
        int i7 = i4;
        while (i6 < 10) {
            int i8 = i6;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            i7 = i2 - i7;
            getHighResolutionOutputSizeshNQ4ISI(valueOf, getHighSpeedVideoSizes(valueOf, sArr5).add(Camera2StreamConfigurationMap(blockCipher, valueOf, bArr, ceil, (i5 * 4) + 4, i6, highResolutionOutputSizeshNQ4ISI, sArr3)).mod(Camera2StreamConfigurationMap2[i8 & 1]), i7, sArr5);
            i6 = i8 + 1;
            sArr4 = sArr5;
        }
        return org.bouncycastle.util.Arrays.concatenate(sArr3, sArr4);
    }

    static short[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.crypto.BlockCipher blockCipher, int i, byte[] bArr, short[] sArr, int i2, int i3) {
        Camera2StreamConfigurationMap(blockCipher, true, i, sArr, i2, i3);
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        short[] sArr2 = new short[i4];
        short[] sArr3 = new short[i5];
        java.lang.System.arraycopy(sArr, i2, sArr2, 0, i4);
        java.lang.System.arraycopy(sArr, i2 + i4, sArr3, 0, i5);
        return getHighSpeedVideoFpsRanges(blockCipher, i, bArr, i3, i4, i5, sArr2, sArr3);
    }

    private static short[] Camera2StreamConfigurationMap(org.bouncycastle.crypto.BlockCipher blockCipher, int i, byte[] bArr, int i2, int i3, int i4, short[] sArr, short[] sArr2) {
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(i);
        int i5 = i4;
        java.math.BigInteger[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(valueOf, i3, i5);
        getHighSpeedVideoSizes(sArr);
        getHighSpeedVideoSizes(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i6 = 7;
        while (i6 >= 0) {
            int i7 = i2 - i5;
            int i8 = i6 & 1;
            getHighResolutionOutputSizeshNQ4ISI(valueOf, getHighSpeedVideoSizes(valueOf, sArr4).subtract(getHighResolutionOutputSizeshNQ4ISI(blockCipher, valueOf, bArr, 4 - (i8 * 4), i6, sArr3)).mod(Camera2StreamConfigurationMap2[1 - i8]), i7, sArr4);
            i6--;
            i5 = i7;
            short[] sArr5 = sArr4;
            sArr4 = sArr3;
            sArr3 = sArr5;
        }
        getHighSpeedVideoSizes(sArr3);
        getHighSpeedVideoSizes(sArr4);
        return org.bouncycastle.util.Arrays.concatenate(sArr3, sArr4);
    }

    private static short[] getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.BlockCipher blockCipher, int i, byte[] bArr, int i2, int i3, int i4, short[] sArr, short[] sArr2) {
        int length = bArr.length;
        int ceil = (((int) java.lang.Math.ceil((java.lang.Math.log(i) * i4) / getHighSpeedVideoSizes)) + 7) / 8;
        int i5 = (((ceil + 3) / 4) * 4) + 4;
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i, (byte) i3, i2, length);
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(i);
        java.math.BigInteger[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(valueOf, i3, i4);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i6 = i3;
        int i7 = 9;
        while (i7 >= 0) {
            short[] sArr5 = sArr4;
            sArr4 = sArr3;
            i6 = i2 - i6;
            getHighResolutionOutputSizeshNQ4ISI(valueOf, getHighSpeedVideoSizes(valueOf, sArr5).subtract(Camera2StreamConfigurationMap(blockCipher, valueOf, bArr, ceil, i5, i7, highResolutionOutputSizeshNQ4ISI, sArr4)).mod(Camera2StreamConfigurationMap2[i7 & 1]), i6, sArr5);
            i7--;
            sArr3 = sArr5;
        }
        return org.bouncycastle.util.Arrays.concatenate(sArr3, sArr4);
    }

    private static void Camera2StreamConfigurationMap(boolean z, int i, int i2) {
        int floor;
        if (i2 >= 2) {
            double d = i;
            if (java.lang.Math.pow(d, i2) >= 1000000.0d) {
                if (!z && i2 > (floor = ((int) java.lang.Math.floor(java.lang.Math.log(Camera2StreamConfigurationMap) / java.lang.Math.log(d))) * 2)) {
                    throw new java.lang.IllegalArgumentException("maximum input length is ".concat(java.lang.String.valueOf(floor)));
                }
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("input too short");
    }

    private static byte[] getHighSpeedVideoSizes(byte[] bArr) {
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        byte b4 = bArr[3];
        return new byte[]{b, b2, b3, (byte) (b4 & com.visa.cbp.getEncExpo.onUnminimized), bArr[4], bArr[5], bArr[6], (byte) (b4 << 4)};
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI(int i, byte b, int i2, int i3) {
        byte[] bArr = {1, 2, 1, 0, (byte) (i >> 8), (byte) i, 10, b, 0, 0, 0, 0, 0, 0, 0, 0};
        org.bouncycastle.util.Pack.intToBigEndian(i2, bArr, 8);
        org.bouncycastle.util.Pack.intToBigEndian(i3, bArr, 12);
        return bArr;
    }

    private static java.math.BigInteger[] Camera2StreamConfigurationMap(java.math.BigInteger bigInteger, int i, int i2) {
        java.math.BigInteger pow = bigInteger.pow(i);
        java.math.BigInteger[] bigIntegerArr = {pow, pow};
        if (i2 != i) {
            bigIntegerArr[1] = pow.multiply(bigInteger);
        }
        return bigIntegerArr;
    }

    SP80038G() {
    }
}
