package org.bouncycastle.math.ec.rfc8032;

/* loaded from: classes17.dex */
public abstract class Ed448 {
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 57;
    public static final int SECRET_KEY_SIZE = 57;
    public static final int SIGNATURE_SIZE = 114;
    private static final byte[] Camera2StreamConfigurationMap = {83, 105, 103, 69, 100, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 56};
    private static final int[] getHighSpeedVideoSizes = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    private static final int[] getHighSpeedVideoFpsRangesFor = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK};
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    private static final int[] getHighSpeedVideoFpsRanges = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    private static final java.lang.Object getOutputMinFrameDuration = new java.lang.Object();
    private static org.bouncycastle.math.ec.rfc8032.Ed448.PointExt[] getOutputFormats = null;
    private static int[] getInputSizeshNQ4ISI = null;

    public static final class Algorithm {
        public static final int Ed448 = 0;
        public static final int Ed448ph = 1;
    }

    public static org.bouncycastle.crypto.Xof createPrehash() {
        return new org.bouncycastle.crypto.digests.SHAKEDigest(256);
    }

    private static boolean getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, boolean z, org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt) {
        byte[] bArr2 = new byte[57];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, 57);
        if (!Camera2StreamConfigurationMap(bArr2)) {
            return false;
        }
        byte b = bArr2[56];
        int i2 = (b & 128) >>> 7;
        bArr2[56] = (byte) (b & Byte.MAX_VALUE);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.decode(bArr2, 0, pointExt.getHighSpeedVideoFpsRanges);
        int[] create = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sqr(pointExt.getHighSpeedVideoFpsRanges, create);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create, 39081, create2);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.negate(create, create);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.addOne(create);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.addOne(create2);
        if (!org.bouncycastle.math.ec.rfc8032.Ed448.F.sqrtRatioVar(create, create2, pointExt.Camera2StreamConfigurationMap)) {
            return false;
        }
        org.bouncycastle.math.ec.rfc8032.Ed448.F.normalize(pointExt.Camera2StreamConfigurationMap);
        if (i2 == 1 && org.bouncycastle.math.ec.rfc8032.Ed448.F.isZeroVar(pointExt.Camera2StreamConfigurationMap)) {
            return false;
        }
        if (z ^ (i2 != (pointExt.Camera2StreamConfigurationMap[0] & 1))) {
            org.bouncycastle.math.ec.rfc8032.Ed448.F.negate(pointExt.Camera2StreamConfigurationMap, pointExt.Camera2StreamConfigurationMap);
        }
        org.bouncycastle.math.ec.rfc8032.Ed448.F.one(pointExt.getHighSpeedVideoFpsRangesFor);
        return true;
    }

    private static void getHighSpeedVideoFpsRangesFor(long j, byte[] bArr, int i) {
        getHighSpeedVideoFpsRanges((int) j, bArr, i);
        int i2 = (int) (j >>> 32);
        bArr[i + 4] = (byte) i2;
        bArr[i + 5] = (byte) (i2 >>> 8);
        bArr[i + 6] = (byte) (i2 >>> 16);
    }

    private static int Camera2StreamConfigurationMap(org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt, byte[] bArr, int i) {
        int[] create = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        org.bouncycastle.math.ec.rfc8032.Ed448.F.inv(pointExt.getHighSpeedVideoFpsRangesFor, create2);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(pointExt.Camera2StreamConfigurationMap, create2, create);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(pointExt.getHighSpeedVideoFpsRanges, create2, create2);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.normalize(create);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.normalize(create2);
        int[] create3 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create4 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create5 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sqr(create, create4);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sqr(create2, create5);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create4, create5, create3);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.add(create4, create5, create4);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create3, 39081, create3);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.subOne(create3);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.add(create3, create4, create3);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.normalize(create3);
        int isZero = org.bouncycastle.math.ec.rfc8032.Ed448.F.isZero(create3);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.encode(create2, bArr, i);
        bArr[i + 56] = (byte) ((create[0] & 1) << 7);
        return isZero;
    }

    public static void generatePublicKey(byte[] bArr, int i, byte[] bArr2, int i2) {
        org.bouncycastle.crypto.digests.SHAKEDigest sHAKEDigest = new org.bouncycastle.crypto.digests.SHAKEDigest(256);
        byte[] bArr3 = new byte[114];
        sHAKEDigest.update(bArr, i, 57);
        sHAKEDigest.doFinal(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        getHighSpeedVideoFpsRanges(bArr3, 0, bArr4);
        org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt = new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt((byte) 0);
        getHighSpeedVideoSizes(bArr4, pointExt);
        if (Camera2StreamConfigurationMap(pointExt, bArr2, i2) == 0) {
            throw new java.lang.IllegalStateException();
        }
    }

    private static void getHighSpeedVideoSizes(org.bouncycastle.crypto.Xof xof, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b, byte[] bArr5, int i2, int i3, byte[] bArr6, int i4) {
        getHighSpeedVideoFpsRangesFor(xof, b, bArr4);
        xof.update(bArr, 57, 57);
        xof.update(bArr5, i2, i3);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr);
        byte[] bArr7 = new byte[57];
        org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt = new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt((byte) 0);
        getHighSpeedVideoSizes(highSpeedVideoFpsRanges, pointExt);
        if (Camera2StreamConfigurationMap(pointExt, bArr7, 0) == 0) {
            throw new java.lang.IllegalStateException();
        }
        getHighSpeedVideoFpsRangesFor(xof, b, bArr4);
        xof.update(bArr7, 0, 57);
        xof.update(bArr3, i, 57);
        xof.update(bArr5, i2, i3);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(bArr);
        int[] iArr = new int[28];
        getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges, 0, iArr);
        int[] iArr2 = new int[14];
        getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges2, 0, iArr2);
        int[] iArr3 = new int[14];
        getHighResolutionOutputSizeshNQ4ISI(bArr2, 0, iArr3);
        org.bouncycastle.math.raw.Nat.mulAddTo(14, iArr2, iArr3, iArr);
        byte[] bArr8 = new byte[114];
        for (int i5 = 0; i5 < 28; i5++) {
            getHighSpeedVideoFpsRanges(iArr[i5], bArr8, i5 * 4);
        }
        byte[] highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(bArr8);
        java.lang.System.arraycopy(bArr7, 0, bArr6, i4, 57);
        java.lang.System.arraycopy(highSpeedVideoFpsRanges3, 0, bArr6, i4 + 57, 57);
    }

    private static void getHighSpeedVideoSizes(byte[] bArr, int i, byte[] bArr2, byte b, byte[] bArr3, int i2, int i3, byte[] bArr4, int i4) {
        if (bArr2 == null || bArr2.length >= 256) {
            throw new java.lang.IllegalArgumentException("ctx");
        }
        org.bouncycastle.crypto.digests.SHAKEDigest sHAKEDigest = new org.bouncycastle.crypto.digests.SHAKEDigest(256);
        byte[] bArr5 = new byte[114];
        sHAKEDigest.update(bArr, i, 57);
        sHAKEDigest.doFinal(bArr5, 0, 114);
        byte[] bArr6 = new byte[57];
        getHighSpeedVideoFpsRanges(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[57];
        org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt = new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt((byte) 0);
        getHighSpeedVideoSizes(bArr6, pointExt);
        if (Camera2StreamConfigurationMap(pointExt, bArr7, 0) == 0) {
            throw new java.lang.IllegalStateException();
        }
        getHighSpeedVideoSizes(sHAKEDigest, bArr5, bArr6, bArr7, 0, bArr2, b, bArr3, i2, i3, bArr4, i4);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        if (bArr3 == null || bArr3.length >= 256) {
            throw new java.lang.IllegalArgumentException("ctx");
        }
        org.bouncycastle.crypto.digests.SHAKEDigest sHAKEDigest = new org.bouncycastle.crypto.digests.SHAKEDigest(256);
        byte[] bArr6 = new byte[114];
        sHAKEDigest.update(bArr, i, 57);
        sHAKEDigest.doFinal(bArr6, 0, 114);
        byte[] bArr7 = new byte[57];
        getHighSpeedVideoFpsRanges(bArr6, 0, bArr7);
        getHighSpeedVideoSizes(sHAKEDigest, bArr6, bArr7, bArr2, i2, bArr3, b, bArr4, i3, i4, bArr5, i5);
    }

    private static boolean getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b, byte[] bArr4, int i3, int i4) {
        if (bArr3 == null || bArr3.length >= 256) {
            throw new java.lang.IllegalArgumentException("ctx");
        }
        byte[] bArr5 = new byte[57];
        byte b2 = 0;
        java.lang.System.arraycopy(bArr, i, bArr5, 0, 57);
        byte[] bArr6 = new byte[57];
        java.lang.System.arraycopy(bArr, i + 57, bArr6, 0, 57);
        if (!Camera2StreamConfigurationMap(bArr5)) {
            return false;
        }
        int[] iArr = new int[14];
        if (bArr6[56] == 0) {
            getHighResolutionOutputSizeshNQ4ISI(bArr6, 0, iArr);
            if (!org.bouncycastle.math.raw.Nat.gte(14, iArr, getHighSpeedVideoFpsRangesFor)) {
                org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt = new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt(b2);
                if (!getHighSpeedVideoFpsRangesFor(bArr2, i2, true, pointExt)) {
                    return false;
                }
                org.bouncycastle.crypto.digests.SHAKEDigest sHAKEDigest = new org.bouncycastle.crypto.digests.SHAKEDigest(256);
                byte[] bArr7 = new byte[114];
                getHighSpeedVideoFpsRangesFor(sHAKEDigest, b, bArr3);
                sHAKEDigest.update(bArr5, 0, 57);
                sHAKEDigest.update(bArr2, i2, 57);
                sHAKEDigest.update(bArr4, i3, i4);
                sHAKEDigest.doFinal(bArr7, 0, 114);
                int[] iArr2 = new int[14];
                getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRanges(bArr7), 0, iArr2);
                org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt2 = new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt(b2);
                precompute();
                byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(iArr, 7);
                byte[] highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(iArr2, 5);
                org.bouncycastle.math.ec.rfc8032.Ed448.PointExt[] highSpeedVideoSizes = getHighSpeedVideoSizes(pointExt, 8);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.zero(pointExt2.Camera2StreamConfigurationMap);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.one(pointExt2.getHighSpeedVideoFpsRanges);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.one(pointExt2.getHighSpeedVideoFpsRangesFor);
                int i5 = 446;
                while (true) {
                    byte b3 = highSpeedVideoFpsRanges[i5];
                    if (b3 != 0) {
                        int i6 = b3 >> com.google.common.base.Ascii.US;
                        getHighSpeedVideoFpsRangesFor(i6 != 0, getOutputFormats[(b3 ^ i6) >>> 1], pointExt2);
                    }
                    byte b4 = highSpeedVideoFpsRanges2[i5];
                    if (b4 != 0) {
                        int i7 = b4 >> com.google.common.base.Ascii.US;
                        getHighSpeedVideoFpsRangesFor(i7 != 0, highSpeedVideoSizes[(b4 ^ i7) >>> 1], pointExt2);
                    }
                    i5--;
                    if (i5 < 0) {
                        break;
                    }
                    getHighSpeedVideoSizes(pointExt2);
                }
                byte[] bArr8 = new byte[57];
                return Camera2StreamConfigurationMap(pointExt2, bArr8, 0) != 0 && org.bouncycastle.util.Arrays.areEqual(bArr8, bArr5);
            }
        }
        return false;
    }

    private static org.bouncycastle.math.ec.rfc8032.Ed448.PointExt getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt) {
        org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt2 = new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt((byte) 0);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(pointExt.Camera2StreamConfigurationMap, 0, pointExt2.Camera2StreamConfigurationMap, 0);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(pointExt.getHighSpeedVideoFpsRanges, 0, pointExt2.getHighSpeedVideoFpsRanges, 0);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(pointExt.getHighSpeedVideoFpsRangesFor, 0, pointExt2.getHighSpeedVideoFpsRangesFor, 0);
        return pointExt2;
    }

    public static void precompute() {
        synchronized (getOutputMinFrameDuration) {
            if (getInputSizeshNQ4ISI == null) {
                byte b = 0;
                org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt = new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt(b);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(getHighResolutionOutputSizeshNQ4ISI, 0, pointExt.Camera2StreamConfigurationMap, 0);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(getHighSpeedVideoFpsRanges, 0, pointExt.getHighSpeedVideoFpsRanges, 0);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.one(pointExt.getHighSpeedVideoFpsRangesFor);
                getOutputFormats = getHighSpeedVideoSizes(pointExt, 32);
                getInputSizeshNQ4ISI = org.bouncycastle.math.ec.rfc8032.Ed448.F.createTable(160);
                int i = 0;
                for (int i2 = 0; i2 < 5; i2++) {
                    org.bouncycastle.math.ec.rfc8032.Ed448.PointExt[] pointExtArr = new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt[5];
                    org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt2 = new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt(b);
                    org.bouncycastle.math.ec.rfc8032.Ed448.F.zero(pointExt2.Camera2StreamConfigurationMap);
                    org.bouncycastle.math.ec.rfc8032.Ed448.F.one(pointExt2.getHighSpeedVideoFpsRanges);
                    org.bouncycastle.math.ec.rfc8032.Ed448.F.one(pointExt2.getHighSpeedVideoFpsRangesFor);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 5) {
                            break;
                        }
                        getHighSpeedVideoFpsRangesFor(true, pointExt, pointExt2);
                        getHighSpeedVideoSizes(pointExt);
                        pointExtArr[i3] = getHighResolutionOutputSizeshNQ4ISI(pointExt);
                        if (i2 + i3 != 8) {
                            for (int i4 = 1; i4 < 18; i4++) {
                                getHighSpeedVideoSizes(pointExt);
                            }
                        }
                        i3++;
                    }
                    org.bouncycastle.math.ec.rfc8032.Ed448.PointExt[] pointExtArr2 = new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt[16];
                    pointExtArr2[0] = pointExt2;
                    int i5 = 1;
                    for (int i6 = 0; i6 < 4; i6++) {
                        int i7 = 1 << i6;
                        int i8 = 0;
                        while (i8 < i7) {
                            org.bouncycastle.math.ec.rfc8032.Ed448.PointExt highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(pointExtArr2[i5 - i7]);
                            pointExtArr2[i5] = highResolutionOutputSizeshNQ4ISI;
                            getHighSpeedVideoFpsRangesFor(false, pointExtArr[i6], highResolutionOutputSizeshNQ4ISI);
                            i8++;
                            i5++;
                        }
                    }
                    int[] createTable = org.bouncycastle.math.ec.rfc8032.Ed448.F.createTable(16);
                    int[] create = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
                    org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(pointExtArr2[0].getHighSpeedVideoFpsRangesFor, 0, create, 0);
                    org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(create, 0, createTable, 0);
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        if (i10 >= 16) {
                            break;
                        }
                        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create, pointExtArr2[i10].getHighSpeedVideoFpsRangesFor, create);
                        org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(create, 0, createTable, i10 * 16);
                        i9 = i10;
                    }
                    org.bouncycastle.math.ec.rfc8032.Ed448.F.invVar(create, create);
                    int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
                    while (i9 > 0) {
                        int i11 = i9 - 1;
                        org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(createTable, i11 * 16, create2, 0);
                        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create2, create, create2);
                        org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(create2, 0, createTable, i9 * 16);
                        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create, pointExtArr2[i9].getHighSpeedVideoFpsRangesFor, create);
                        i9 = i11;
                    }
                    org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(create, 0, createTable, 0);
                    for (int i12 = 0; i12 < 16; i12++) {
                        org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt3 = pointExtArr2[i12];
                        org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(createTable, i12 * 16, pointExt3.getHighSpeedVideoFpsRangesFor, 0);
                        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(pointExt3.Camera2StreamConfigurationMap, pointExt3.getHighSpeedVideoFpsRangesFor, pointExt3.Camera2StreamConfigurationMap);
                        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(pointExt3.getHighSpeedVideoFpsRanges, pointExt3.getHighSpeedVideoFpsRangesFor, pointExt3.getHighSpeedVideoFpsRanges);
                        org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(pointExt3.Camera2StreamConfigurationMap, 0, getInputSizeshNQ4ISI, i);
                        org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(pointExt3.getHighSpeedVideoFpsRanges, 0, getInputSizeshNQ4ISI, i + 16);
                        i += 32;
                    }
                }
            }
        }
    }

    private static byte[] getHighSpeedVideoFpsRanges(byte[] bArr) {
        long Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr, 0);
        long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr, 4) << 4;
        long Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(bArr, 7);
        long highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(bArr, 11) << 4;
        long Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(bArr, 14);
        long highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(bArr, 18) << 4;
        long Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(bArr, 21);
        long highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(bArr, 25) << 4;
        long Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap(bArr, 28);
        long highSpeedVideoFpsRangesFor5 = getHighSpeedVideoFpsRangesFor(bArr, 32) << 4;
        long Camera2StreamConfigurationMap7 = Camera2StreamConfigurationMap(bArr, 35);
        long highSpeedVideoFpsRangesFor6 = getHighSpeedVideoFpsRangesFor(bArr, 39) << 4;
        long Camera2StreamConfigurationMap8 = Camera2StreamConfigurationMap(bArr, 42);
        long highSpeedVideoFpsRangesFor7 = getHighSpeedVideoFpsRangesFor(bArr, 46) << 4;
        long Camera2StreamConfigurationMap9 = Camera2StreamConfigurationMap(bArr, 49);
        long highSpeedVideoFpsRangesFor8 = getHighSpeedVideoFpsRangesFor(bArr, 53) << 4;
        long Camera2StreamConfigurationMap10 = Camera2StreamConfigurationMap(bArr, 56);
        long highSpeedVideoFpsRangesFor9 = getHighSpeedVideoFpsRangesFor(bArr, 60) << 4;
        long Camera2StreamConfigurationMap11 = Camera2StreamConfigurationMap(bArr, 63);
        long highSpeedVideoFpsRangesFor10 = getHighSpeedVideoFpsRangesFor(bArr, 67) << 4;
        long Camera2StreamConfigurationMap12 = Camera2StreamConfigurationMap(bArr, 70);
        long highSpeedVideoFpsRangesFor11 = getHighSpeedVideoFpsRangesFor(bArr, 74) << 4;
        long Camera2StreamConfigurationMap13 = Camera2StreamConfigurationMap(bArr, 77);
        long highSpeedVideoFpsRangesFor12 = getHighSpeedVideoFpsRangesFor(bArr, 81) << 4;
        long Camera2StreamConfigurationMap14 = Camera2StreamConfigurationMap(bArr, 84);
        long highSpeedVideoFpsRangesFor13 = getHighSpeedVideoFpsRangesFor(bArr, 88) << 4;
        long Camera2StreamConfigurationMap15 = Camera2StreamConfigurationMap(bArr, 91);
        long highSpeedVideoFpsRangesFor14 = getHighSpeedVideoFpsRangesFor(bArr, 95) << 4;
        long Camera2StreamConfigurationMap16 = Camera2StreamConfigurationMap(bArr, 98);
        long highSpeedVideoFpsRangesFor15 = getHighSpeedVideoFpsRangesFor(bArr, 102) << 4;
        long Camera2StreamConfigurationMap17 = Camera2StreamConfigurationMap(bArr, 105);
        long j = (((bArr[113] & 255) << 8) | (bArr[112] & 255)) & 4294967295L;
        long highSpeedVideoFpsRangesFor16 = ((getHighSpeedVideoFpsRangesFor(bArr, 109) << 4) & 4294967295L) + ((Camera2StreamConfigurationMap17 & 4294967295L) >>> 28);
        long j2 = Camera2StreamConfigurationMap17 & 268435455;
        long j3 = (highSpeedVideoFpsRangesFor15 & 4294967295L) + ((Camera2StreamConfigurationMap16 & 4294967295L) >>> 28);
        long j4 = Camera2StreamConfigurationMap16 & 268435455;
        long j5 = (Camera2StreamConfigurationMap12 & 4294967295L) + (j * 96434764) + (highSpeedVideoFpsRangesFor16 * 227822194) + (j2 * 149865618) + (j3 * 550336261);
        long j6 = (highSpeedVideoFpsRangesFor14 & 4294967295L) + ((Camera2StreamConfigurationMap15 & 4294967295L) >>> 28);
        long j7 = Camera2StreamConfigurationMap15 & 268435455;
        long j8 = (highSpeedVideoFpsRangesFor9 & 4294967295L) + (j * 30366549) + (highSpeedVideoFpsRangesFor16 * 163752818) + (j2 * 258169998) + (j3 * 96434764) + (j4 * 227822194) + (j6 * 149865618) + (j7 * 550336261);
        long j9 = (highSpeedVideoFpsRangesFor13 & 4294967295L) + ((Camera2StreamConfigurationMap14 & 4294967295L) >>> 28);
        long j10 = (highSpeedVideoFpsRangesFor11 & 4294967295L) + (j * 227822194) + (highSpeedVideoFpsRangesFor16 * 149865618) + (j2 * 550336261) + (j5 >>> 28);
        long j11 = (Camera2StreamConfigurationMap13 & 4294967295L) + (j * 149865618) + (highSpeedVideoFpsRangesFor16 * 550336261) + (j10 >>> 28);
        long j12 = (highSpeedVideoFpsRangesFor12 & 4294967295L) + (j * 550336261) + (j11 >>> 28);
        long j13 = j11 & 268435455;
        long j14 = (Camera2StreamConfigurationMap14 & 268435455) + (j12 >>> 28);
        long j15 = j12 & 268435455;
        long j16 = (Camera2StreamConfigurationMap9 & 4294967295L) + (j2 * 43969588) + (j3 * 30366549) + (j4 * 163752818) + (j6 * 258169998) + (j7 * 96434764) + (j9 * 227822194) + (j14 * 149865618) + (j15 * 550336261);
        long j17 = (Camera2StreamConfigurationMap11 & 4294967295L) + (j * 163752818) + (highSpeedVideoFpsRangesFor16 * 258169998) + (j2 * 96434764) + (j3 * 227822194) + (j4 * 149865618) + (j6 * 550336261) + (j8 >>> 28);
        long j18 = (highSpeedVideoFpsRangesFor10 & 4294967295L) + (j * 258169998) + (highSpeedVideoFpsRangesFor16 * 96434764) + (j2 * 227822194) + (j3 * 149865618) + (j4 * 550336261) + (j17 >>> 28);
        long j19 = (j5 & 268435455) + (j18 >>> 28);
        long j20 = j18 & 268435455;
        long j21 = (j10 & 268435455) + (j19 >>> 28);
        long j22 = j19 & 268435455;
        long j23 = (highSpeedVideoFpsRangesFor8 & 4294967295L) + (highSpeedVideoFpsRangesFor16 * 43969588) + (j2 * 30366549) + (j3 * 163752818) + (j4 * 258169998) + (j6 * 96434764) + (j7 * 227822194) + (j9 * 149865618) + (j14 * 550336261) + (j16 >>> 28);
        long j24 = (Camera2StreamConfigurationMap10 & 4294967295L) + (j * 43969588) + (highSpeedVideoFpsRangesFor16 * 30366549) + (j2 * 163752818) + (j3 * 258169998) + (j4 * 96434764) + (j6 * 227822194) + (j7 * 149865618) + (j9 * 550336261) + (j23 >>> 28);
        long j25 = (j8 & 268435455) + (j24 >>> 28);
        long j26 = (j17 & 268435455) + (j25 >>> 28);
        long j27 = j25 & 268435455;
        long j28 = ((j24 & 268435455) * 4) + ((j23 & 268435455) >>> 26) + 1;
        long j29 = (Camera2StreamConfigurationMap2 & 4294967295L) + (78101261 * j28);
        long j30 = (highSpeedVideoFpsRangesFor & 4294967295L) + (j27 * 43969588) + (141809365 * j28) + (j29 >>> 28);
        long j31 = (Camera2StreamConfigurationMap3 & 4294967295L) + (j26 * 43969588) + (j27 * 30366549) + (175155932 * j28) + (j30 >>> 28);
        long j32 = (highSpeedVideoFpsRangesFor2 & 4294967295L) + (j20 * 43969588) + (j26 * 30366549) + (j27 * 163752818) + (64542499 * j28) + (j31 >>> 28);
        long j33 = (Camera2StreamConfigurationMap4 & 4294967295L) + (j22 * 43969588) + (j20 * 30366549) + (j26 * 163752818) + (j27 * 258169998) + (158326419 * j28) + (j32 >>> 28);
        long j34 = (highSpeedVideoFpsRangesFor3 & 4294967295L) + (j21 * 43969588) + (j22 * 30366549) + (j20 * 163752818) + (j26 * 258169998) + (j27 * 96434764) + (191173276 * j28) + (j33 >>> 28);
        long j35 = (Camera2StreamConfigurationMap5 & 4294967295L) + (j13 * 43969588) + (j21 * 30366549) + (j22 * 163752818) + (j20 * 258169998) + (j26 * 96434764) + (j27 * 227822194) + (104575268 * j28) + (j34 >>> 28);
        long j36 = (highSpeedVideoFpsRangesFor4 & 4294967295L) + (j15 * 43969588) + (j13 * 30366549) + (j21 * 163752818) + (j22 * 258169998) + (j20 * 96434764) + (j26 * 227822194) + (j27 * 149865618) + (j28 * 137584065) + (j35 >>> 28);
        long j37 = (Camera2StreamConfigurationMap6 & 4294967295L) + (j14 * 43969588) + (j15 * 30366549) + (j13 * 163752818) + (j21 * 258169998) + (j22 * 96434764) + (j20 * 227822194) + (j26 * 149865618) + (j27 * 550336261) + (j36 >>> 28);
        long j38 = (highSpeedVideoFpsRangesFor5 & 4294967295L) + (j9 * 43969588) + (j14 * 30366549) + (j15 * 163752818) + (j13 * 258169998) + (j21 * 96434764) + (j22 * 227822194) + (j20 * 149865618) + (j26 * 550336261) + (j37 >>> 28);
        long j39 = (Camera2StreamConfigurationMap7 & 4294967295L) + (j7 * 43969588) + (j9 * 30366549) + (j14 * 163752818) + (j15 * 258169998) + (j13 * 96434764) + (j21 * 227822194) + (j22 * 149865618) + (j20 * 550336261) + (j38 >>> 28);
        long j40 = (highSpeedVideoFpsRangesFor6 & 4294967295L) + (j6 * 43969588) + (j7 * 30366549) + (j9 * 163752818) + (j14 * 258169998) + (j15 * 96434764) + (j13 * 227822194) + (j21 * 149865618) + (j22 * 550336261) + (j39 >>> 28);
        long j41 = (Camera2StreamConfigurationMap8 & 4294967295L) + (j4 * 43969588) + (j6 * 30366549) + (j7 * 163752818) + (j9 * 258169998) + (j14 * 96434764) + (j15 * 227822194) + (j13 * 149865618) + (j21 * 550336261) + (j40 >>> 28);
        long j42 = (highSpeedVideoFpsRangesFor7 & 4294967295L) + (j3 * 43969588) + (j4 * 30366549) + (j6 * 163752818) + (j7 * 258169998) + (j9 * 96434764) + (j14 * 227822194) + (j15 * 149865618) + (j13 * 550336261) + (j41 >>> 28);
        long j43 = (j16 & 268435455) + (j42 >>> 28);
        long j44 = (j23 & 67108863) + (j43 >>> 28);
        long j45 = (j44 >>> 26) - 1;
        long j46 = (j29 & 268435455) - (j45 & 78101261);
        long j47 = ((j30 & 268435455) - (j45 & 141809365)) + (j46 >> 28);
        long j48 = ((j31 & 268435455) - (j45 & 175155932)) + (j47 >> 28);
        long j49 = ((j32 & 268435455) - (j45 & 64542499)) + (j48 >> 28);
        long j50 = ((j33 & 268435455) - (j45 & 158326419)) + (j49 >> 28);
        long j51 = ((j34 & 268435455) - (j45 & 191173276)) + (j50 >> 28);
        long j52 = ((j35 & 268435455) - (j45 & 104575268)) + (j51 >> 28);
        long j53 = ((j36 & 268435455) - (j45 & 137584065)) + (j52 >> 28);
        long j54 = (j37 & 268435455) + (j53 >> 28);
        long j55 = (j38 & 268435455) + (j54 >> 28);
        long j56 = (j39 & 268435455) + (j55 >> 28);
        long j57 = (j40 & 268435455) + (j56 >> 28);
        long j58 = (j41 & 268435455) + (j57 >> 28);
        long j59 = (j42 & 268435455) + (j58 >> 28);
        long j60 = (j43 & 268435455) + (j59 >> 28);
        byte[] bArr2 = new byte[57];
        getHighSpeedVideoFpsRangesFor((j46 & 268435455) | ((j47 & 268435455) << 28), bArr2, 0);
        getHighSpeedVideoFpsRangesFor((j48 & 268435455) | ((j49 & 268435455) << 28), bArr2, 7);
        getHighSpeedVideoFpsRangesFor(((j51 & 268435455) << 28) | (j50 & 268435455), bArr2, 14);
        getHighSpeedVideoFpsRangesFor(((j53 & 268435455) << 28) | (j52 & 268435455), bArr2, 21);
        getHighSpeedVideoFpsRangesFor((j54 & 268435455) | ((j55 & 268435455) << 28), bArr2, 28);
        getHighSpeedVideoFpsRangesFor((j56 & 268435455) | ((j57 & 268435455) << 28), bArr2, 35);
        getHighSpeedVideoFpsRangesFor((j58 & 268435455) | ((j59 & 268435455) << 28), bArr2, 42);
        getHighSpeedVideoFpsRangesFor((j60 & 268435455) | (((67108863 & j44) + (j60 >> 28)) << 28), bArr2, 49);
        return bArr2;
    }

    private static void getHighSpeedVideoSizes(byte[] bArr, org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt) {
        precompute();
        int i = 15;
        int[] iArr = new int[15];
        byte b = 0;
        getHighResolutionOutputSizeshNQ4ISI(bArr, 0, iArr);
        iArr[14] = org.bouncycastle.math.raw.Nat.cadd(14, (~iArr[0]) & 1, iArr, getHighSpeedVideoFpsRangesFor, iArr) + 4;
        org.bouncycastle.math.raw.Nat.shiftDownBit(15, iArr, 0);
        org.bouncycastle.math.ec.rfc8032.Ed448.PointPrecomp pointPrecomp = new org.bouncycastle.math.ec.rfc8032.Ed448.PointPrecomp(b);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.zero(pointExt.Camera2StreamConfigurationMap);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.one(pointExt.getHighSpeedVideoFpsRanges);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.one(pointExt.getHighSpeedVideoFpsRangesFor);
        int i2 = 17;
        while (true) {
            int i3 = b;
            int i4 = i2;
            while (i3 < 5) {
                int i5 = b;
                int i6 = i5;
                while (i5 < 5) {
                    i6 = (i6 & (~(1 << i5))) ^ ((iArr[i4 >>> 5] >>> (i4 & 31)) << i5);
                    i4 += 18;
                    i5++;
                }
                int i7 = (i6 >>> 4) & 1;
                int i8 = ((-i7) ^ i6) & i;
                int i9 = i3 * 512;
                for (int i10 = b; i10 < 16; i10++) {
                    int i11 = ((i10 ^ i8) - 1) >> 31;
                    org.bouncycastle.math.ec.rfc8032.Ed448.F.cmov(i11, getInputSizeshNQ4ISI, i9, pointPrecomp.getHighSpeedVideoSizes, b);
                    org.bouncycastle.math.ec.rfc8032.Ed448.F.cmov(i11, getInputSizeshNQ4ISI, i9 + 16, pointPrecomp.Camera2StreamConfigurationMap, b);
                    i9 += 32;
                }
                org.bouncycastle.math.ec.rfc8032.Ed448.F.cnegate(i7, pointPrecomp.getHighSpeedVideoSizes);
                int[] create = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
                int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
                int[] create3 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
                int[] create4 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
                int[] create5 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
                int[] create6 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
                int[] create7 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
                org.bouncycastle.math.ec.rfc8032.Ed448.F.sqr(pointExt.getHighSpeedVideoFpsRangesFor, create);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(pointPrecomp.getHighSpeedVideoSizes, pointExt.Camera2StreamConfigurationMap, create2);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(pointPrecomp.Camera2StreamConfigurationMap, pointExt.getHighSpeedVideoFpsRanges, create3);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create2, create3, create4);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create4, 39081, create4);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.add(create, create4, create5);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.sub(create, create4, create6);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.add(pointPrecomp.getHighSpeedVideoSizes, pointPrecomp.Camera2StreamConfigurationMap, create);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.add(pointExt.Camera2StreamConfigurationMap, pointExt.getHighSpeedVideoFpsRanges, create4);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create, create4, create7);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.add(create3, create2, create);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.sub(create3, create2, create4);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.carry(create);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.sub(create7, create, create7);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create7, pointExt.getHighSpeedVideoFpsRangesFor, create7);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create4, pointExt.getHighSpeedVideoFpsRangesFor, create4);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create5, create7, pointExt.Camera2StreamConfigurationMap);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create4, create6, pointExt.getHighSpeedVideoFpsRanges);
                org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create5, create6, pointExt.getHighSpeedVideoFpsRangesFor);
                i3++;
                i = 15;
                b = 0;
            }
            i2--;
            if (i2 < 0) {
                return;
            }
            getHighSpeedVideoSizes(pointExt);
            i = 15;
            b = 0;
        }
    }

    public static void scalarMultBaseXY(org.bouncycastle.math.ec.rfc7748.X448.Friend friend, byte[] bArr, int i, int[] iArr, int[] iArr2) {
        if (friend == null) {
            throw new java.lang.NullPointerException("This method is only for use by X448");
        }
        byte[] bArr2 = new byte[57];
        getHighSpeedVideoFpsRanges(bArr, i, bArr2);
        org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt = new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt((byte) 0);
        getHighSpeedVideoSizes(bArr2, pointExt);
        int[] iArr3 = pointExt.Camera2StreamConfigurationMap;
        int[] iArr4 = pointExt.getHighSpeedVideoFpsRanges;
        int[] iArr5 = pointExt.getHighSpeedVideoFpsRangesFor;
        int[] create = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create3 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create4 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sqr(iArr3, create2);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sqr(iArr4, create3);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sqr(iArr5, create4);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create2, create3, create);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.add(create2, create3, create2);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create2, create4, create2);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sqr(create4, create4);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create, 39081, create);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sub(create, create4, create);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.add(create, create2, create);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.normalize(create);
        if (org.bouncycastle.math.ec.rfc8032.Ed448.F.isZero(create) == 0) {
            throw new java.lang.IllegalStateException();
        }
        org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(pointExt.Camera2StreamConfigurationMap, 0, iArr, 0);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.copy(pointExt.getHighSpeedVideoFpsRanges, 0, iArr2, 0);
    }

    public static boolean validatePublicKeyFull(byte[] bArr, int i) {
        byte b = 0;
        org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt = new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt(b);
        if (!getHighSpeedVideoFpsRangesFor(bArr, i, false, pointExt)) {
            return false;
        }
        org.bouncycastle.math.ec.rfc8032.Ed448.F.normalize(pointExt.Camera2StreamConfigurationMap);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.normalize(pointExt.getHighSpeedVideoFpsRanges);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.normalize(pointExt.getHighSpeedVideoFpsRangesFor);
        int[] iArr = pointExt.Camera2StreamConfigurationMap;
        int[] iArr2 = pointExt.getHighSpeedVideoFpsRanges;
        int[] iArr3 = pointExt.getHighSpeedVideoFpsRangesFor;
        if (org.bouncycastle.math.ec.rfc8032.Ed448.F.isZeroVar(iArr) && org.bouncycastle.math.ec.rfc8032.Ed448.F.areEqualVar(iArr2, iArr3)) {
            return false;
        }
        org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt2 = new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt(b);
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor, 5);
        org.bouncycastle.math.ec.rfc8032.Ed448.PointExt[] highSpeedVideoSizes = getHighSpeedVideoSizes(pointExt, 8);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.zero(pointExt2.Camera2StreamConfigurationMap);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.one(pointExt2.getHighSpeedVideoFpsRanges);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.one(pointExt2.getHighSpeedVideoFpsRangesFor);
        int i2 = 446;
        while (true) {
            byte b2 = highSpeedVideoFpsRanges[i2];
            if (b2 != 0) {
                int i3 = b2 >> com.google.common.base.Ascii.US;
                getHighSpeedVideoFpsRangesFor(i3 != 0, highSpeedVideoSizes[(b2 ^ i3) >>> 1], pointExt2);
            }
            i2--;
            if (i2 < 0) {
                break;
            }
            getHighSpeedVideoSizes(pointExt2);
        }
        org.bouncycastle.math.ec.rfc8032.Ed448.F.normalize(pointExt2.Camera2StreamConfigurationMap);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.normalize(pointExt2.getHighSpeedVideoFpsRanges);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.normalize(pointExt2.getHighSpeedVideoFpsRangesFor);
        return org.bouncycastle.math.ec.rfc8032.Ed448.F.isZeroVar(pointExt2.Camera2StreamConfigurationMap) && org.bouncycastle.math.ec.rfc8032.Ed448.F.areEqualVar(pointExt2.getHighSpeedVideoFpsRanges, pointExt2.getHighSpeedVideoFpsRangesFor);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3) {
        return getHighSpeedVideoFpsRangesFor(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, org.bouncycastle.crypto.Xof xof) {
        byte[] bArr4 = new byte[64];
        if (64 == xof.doFinal(bArr4, 0, 64)) {
            return getHighSpeedVideoFpsRangesFor(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, 0, 64);
        }
        throw new java.lang.IllegalArgumentException("ph");
    }

    public static boolean verify(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4) {
        return getHighSpeedVideoFpsRangesFor(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4);
    }

    public static boolean validatePublicKeyPartial(byte[] bArr, int i) {
        return getHighSpeedVideoFpsRangesFor(bArr, i, false, new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt((byte) 0));
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4, int i3) {
        getHighSpeedVideoSizes(bArr, i, bArr2, (byte) 1, bArr3, i2, 64, bArr4, i3);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, org.bouncycastle.crypto.Xof xof, byte[] bArr3, int i2) {
        byte[] bArr4 = new byte[64];
        if (64 != xof.doFinal(bArr4, 0, 64)) {
            throw new java.lang.IllegalArgumentException("ph");
        }
        getHighSpeedVideoSizes(bArr, i, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i2);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, byte[] bArr5, int i4) {
        getHighResolutionOutputSizeshNQ4ISI(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64, bArr5, i4);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, org.bouncycastle.crypto.Xof xof, byte[] bArr4, int i3) {
        byte[] bArr5 = new byte[64];
        if (64 != xof.doFinal(bArr5, 0, 64)) {
            throw new java.lang.IllegalArgumentException("ph");
        }
        getHighResolutionOutputSizeshNQ4ISI(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i3);
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, int i3, byte[] bArr4, int i4) {
        getHighSpeedVideoSizes(bArr, i, bArr2, (byte) 0, bArr3, i2, i3, bArr4, i4);
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        getHighResolutionOutputSizeshNQ4ISI(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4, bArr5, i5);
    }

    private static void getHighSpeedVideoFpsRanges(byte[] bArr, int i, byte[] bArr2) {
        java.lang.System.arraycopy(bArr, i, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    private static org.bouncycastle.math.ec.rfc8032.Ed448.PointExt[] getHighSpeedVideoSizes(org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt, int i) {
        org.bouncycastle.math.ec.rfc8032.Ed448.PointExt highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(pointExt);
        getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.math.ec.rfc8032.Ed448.PointExt[] pointExtArr = new org.bouncycastle.math.ec.rfc8032.Ed448.PointExt[i];
        pointExtArr[0] = getHighResolutionOutputSizeshNQ4ISI(pointExt);
        for (int i2 = 1; i2 < i; i2++) {
            org.bouncycastle.math.ec.rfc8032.Ed448.PointExt highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(pointExtArr[i2 - 1]);
            pointExtArr[i2] = highResolutionOutputSizeshNQ4ISI2;
            getHighSpeedVideoFpsRangesFor(false, highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI2);
        }
        return pointExtArr;
    }

    private static void getHighSpeedVideoSizes(org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt) {
        int[] create = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create3 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create4 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create5 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create6 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        org.bouncycastle.math.ec.rfc8032.Ed448.F.add(pointExt.Camera2StreamConfigurationMap, pointExt.getHighSpeedVideoFpsRanges, create);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sqr(create, create);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sqr(pointExt.Camera2StreamConfigurationMap, create2);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sqr(pointExt.getHighSpeedVideoFpsRanges, create3);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.add(create2, create3, create4);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.carry(create4);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sqr(pointExt.getHighSpeedVideoFpsRangesFor, create5);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.add(create5, create5, create5);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.carry(create5);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sub(create4, create5, create6);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sub(create, create4, create);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sub(create2, create3, create2);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create, create6, pointExt.Camera2StreamConfigurationMap);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create4, create2, pointExt.getHighSpeedVideoFpsRanges);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create4, create6, pointExt.getHighSpeedVideoFpsRangesFor);
    }

    private static void getHighSpeedVideoFpsRangesFor(boolean z, org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt, org.bouncycastle.math.ec.rfc8032.Ed448.PointExt pointExt2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] create = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create3 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create4 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create5 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create6 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create7 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        int[] create8 = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        if (z) {
            org.bouncycastle.math.ec.rfc8032.Ed448.F.sub(pointExt.getHighSpeedVideoFpsRanges, pointExt.Camera2StreamConfigurationMap, create8);
            iArr2 = create2;
            iArr = create5;
            iArr4 = create6;
            iArr3 = create7;
        } else {
            org.bouncycastle.math.ec.rfc8032.Ed448.F.add(pointExt.getHighSpeedVideoFpsRanges, pointExt.Camera2StreamConfigurationMap, create8);
            iArr = create2;
            iArr2 = create5;
            iArr3 = create6;
            iArr4 = create7;
        }
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(pointExt.getHighSpeedVideoFpsRangesFor, pointExt2.getHighSpeedVideoFpsRangesFor, create);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sqr(create, create2);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(pointExt.Camera2StreamConfigurationMap, pointExt2.Camera2StreamConfigurationMap, create3);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(pointExt.getHighSpeedVideoFpsRanges, pointExt2.getHighSpeedVideoFpsRanges, create4);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create3, create4, create5);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create5, 39081, create5);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.add(create2, create5, iArr3);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sub(create2, create5, iArr4);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.add(pointExt2.Camera2StreamConfigurationMap, pointExt2.getHighSpeedVideoFpsRanges, create5);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create8, create5, create8);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.add(create4, create3, iArr);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sub(create4, create3, iArr2);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.carry(iArr);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.sub(create8, create2, create8);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create8, create, create8);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create5, create, create5);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create6, create8, pointExt2.Camera2StreamConfigurationMap);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create5, create7, pointExt2.getHighSpeedVideoFpsRanges);
        org.bouncycastle.math.ec.rfc8032.Ed448.F.mul(create6, create7, pointExt2.getHighSpeedVideoFpsRangesFor);
    }

    private static byte[] getHighSpeedVideoFpsRanges(int[] iArr, int i) {
        int[] iArr2 = new int[28];
        int i2 = 14;
        int i3 = 0;
        int i4 = 28;
        int i5 = 0;
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            int i6 = iArr[i2];
            iArr2[i4 - 1] = (i5 << 16) | (i6 >>> 16);
            i4 -= 2;
            iArr2[i4] = i6;
            i5 = i6;
        }
        byte[] bArr = new byte[447];
        int i7 = 32 - i;
        int i8 = 0;
        int i9 = 0;
        while (i3 < 28) {
            int i10 = iArr2[i3];
            while (i8 < 16) {
                int i11 = i10 >>> i8;
                if ((i11 & 1) == i9) {
                    i8++;
                } else {
                    int i12 = (i11 | 1) << i7;
                    bArr[(i3 << 4) + i8] = (byte) (i12 >> i7);
                    i8 += i;
                    i9 = i12 >>> 31;
                }
            }
            i3++;
            i8 -= 16;
        }
        return bArr;
    }

    public static void generatePrivateKey(java.security.SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    private static void getHighSpeedVideoFpsRanges(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private static void getHighSpeedVideoFpsRangesFor(org.bouncycastle.crypto.Xof xof, byte b, byte[] bArr) {
        byte[] bArr2 = Camera2StreamConfigurationMap;
        int length = bArr2.length;
        int i = length + 2;
        int length2 = bArr.length + i;
        byte[] bArr3 = new byte[length2];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b;
        bArr3[length + 1] = (byte) bArr.length;
        java.lang.System.arraycopy(bArr, 0, bArr3, i, bArr.length);
        xof.update(bArr3, 0, length2);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < 14; i2++) {
            iArr[i2] = Camera2StreamConfigurationMap(bArr, i2 * 4);
        }
    }

    private static int Camera2StreamConfigurationMap(byte[] bArr, int i) {
        return (bArr[i + 3] << com.google.common.base.Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static int getHighSpeedVideoFpsRangesFor(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    static class PointExt {
        int[] Camera2StreamConfigurationMap;
        int[] getHighSpeedVideoFpsRanges;
        int[] getHighSpeedVideoFpsRangesFor;

        /* synthetic */ PointExt(byte b) {
            this();
        }

        private PointExt() {
            this.Camera2StreamConfigurationMap = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        }
    }

    static class PointPrecomp {
        int[] Camera2StreamConfigurationMap;
        int[] getHighSpeedVideoSizes;

        /* synthetic */ PointPrecomp(byte b) {
            this();
        }

        private PointPrecomp() {
            this.getHighSpeedVideoSizes = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
            this.Camera2StreamConfigurationMap = org.bouncycastle.math.ec.rfc8032.Ed448.F.create();
        }
    }

    private static boolean Camera2StreamConfigurationMap(byte[] bArr) {
        if ((bArr[56] & Byte.MAX_VALUE) != 0) {
            return false;
        }
        getHighResolutionOutputSizeshNQ4ISI(bArr, 0, new int[14]);
        return !org.bouncycastle.math.raw.Nat.gte(14, r2, getHighSpeedVideoSizes);
    }

    static class F extends org.bouncycastle.math.ec.rfc7748.X448Field {
        private F() {
        }
    }
}
