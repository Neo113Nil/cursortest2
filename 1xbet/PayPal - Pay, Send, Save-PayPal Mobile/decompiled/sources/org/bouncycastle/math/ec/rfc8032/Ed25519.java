package org.bouncycastle.math.ec.rfc8032;

/* loaded from: classes17.dex */
public abstract class Ed25519 {
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 32;
    public static final int SECRET_KEY_SIZE = 32;
    public static final int SIGNATURE_SIZE = 64;
    private static final byte[] getOutputMinFrameDuration = {83, 105, 103, 69, 100, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 57, 32, 110, 111, 32, 69, 100, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 57, 32, 99, 111, 108, 108, 105, 115, 105, 111, 110, 115};
    private static final int[] getInputSizeshNQ4ISI = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] getInputFormats = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] getHighSpeedVideoFpsRangesFor = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    private static final int[] getHighSpeedVideoFpsRanges = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    private static final int[] getHighSpeedVideoSizes = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    private static final int[] Camera2StreamConfigurationMap = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    private static final java.lang.Object getOutputStallDurationlomOqCM = new java.lang.Object();
    private static org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt[] getHighSpeedVideoSizesFor = null;
    private static int[] getOutputFormats = null;

    public static final class Algorithm {
        public static final int Ed25519 = 0;
        public static final int Ed25519ctx = 1;
        public static final int Ed25519ph = 2;
    }

    public static org.bouncycastle.crypto.Digest createPrehash() {
        return new org.bouncycastle.crypto.digests.SHA512Digest();
    }

    private static boolean getHighSpeedVideoFpsRanges(byte[] bArr, int i, boolean z, org.bouncycastle.math.ec.rfc8032.Ed25519.PointAffine pointAffine) {
        byte[] bArr2 = new byte[32];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, 32);
        int[] iArr = new int[8];
        getHighSpeedVideoSizes(bArr2, 0, iArr);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        if (!(!org.bouncycastle.math.raw.Nat256.gte(iArr, getInputSizeshNQ4ISI))) {
            return false;
        }
        byte b = bArr2[31];
        int i2 = (b & 128) >>> 7;
        bArr2[31] = (byte) (b & Byte.MAX_VALUE);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.decode(bArr2, 0, pointAffine.Camera2StreamConfigurationMap);
        int[] create = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sqr(pointAffine.Camera2StreamConfigurationMap, create);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(getHighSpeedVideoSizes, create, create2);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.subOne(create);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.addOne(create2);
        if (!org.bouncycastle.math.ec.rfc8032.Ed25519.F.sqrtRatioVar(create, create2, pointAffine.getHighResolutionOutputSizeshNQ4ISI)) {
            return false;
        }
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.normalize(pointAffine.getHighResolutionOutputSizeshNQ4ISI);
        if (i2 == 1 && org.bouncycastle.math.ec.rfc8032.Ed25519.F.isZeroVar(pointAffine.getHighResolutionOutputSizeshNQ4ISI)) {
            return false;
        }
        if (z ^ (i2 != (pointAffine.getHighResolutionOutputSizeshNQ4ISI[0] & 1))) {
            org.bouncycastle.math.ec.rfc8032.Ed25519.F.negate(pointAffine.getHighResolutionOutputSizeshNQ4ISI, pointAffine.getHighResolutionOutputSizeshNQ4ISI);
        }
        return true;
    }

    private static void Camera2StreamConfigurationMap(long j, byte[] bArr, int i) {
        getHighResolutionOutputSizeshNQ4ISI((int) j, bArr, i);
        int i2 = (int) (j >>> 32);
        bArr[i + 4] = (byte) i2;
        bArr[i + 5] = (byte) (i2 >>> 8);
        bArr[i + 6] = (byte) (i2 >>> 16);
    }

    private static int getHighSpeedVideoFpsRanges(org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum pointAccum, byte[] bArr, int i) {
        int[] create = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.inv(pointAccum.getHighSpeedVideoFpsRangesFor, create2);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(pointAccum.getHighResolutionOutputSizeshNQ4ISI, create2, create);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(pointAccum.Camera2StreamConfigurationMap, create2, create2);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.normalize(create);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.normalize(create2);
        int[] create3 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create4 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create5 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sqr(create, create4);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sqr(create2, create5);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create4, create5, create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sub(create5, create4, create5);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create3, getHighSpeedVideoSizes, create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.addOne(create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sub(create3, create5, create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.normalize(create3);
        int isZero = org.bouncycastle.math.ec.rfc8032.Ed25519.F.isZero(create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.encode(create2, bArr, i);
        int i2 = i + 31;
        bArr[i2] = (byte) (((create[0] & 1) << 7) | bArr[i2]);
        return isZero;
    }

    public static void generatePublicKey(byte[] bArr, int i, byte[] bArr2, int i2) {
        org.bouncycastle.crypto.digests.SHA512Digest sHA512Digest = new org.bouncycastle.crypto.digests.SHA512Digest();
        byte[] bArr3 = new byte[sHA512Digest.getDigestSize()];
        sHA512Digest.update(bArr, i, 32);
        sHA512Digest.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[32];
        getHighSpeedVideoFpsRanges(bArr3, 0, bArr4);
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum pointAccum = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum((byte) 0);
        Camera2StreamConfigurationMap(bArr4, pointAccum);
        if (getHighSpeedVideoFpsRanges(pointAccum, bArr2, i2) == 0) {
            throw new java.lang.IllegalStateException();
        }
    }

    private static void Camera2StreamConfigurationMap(org.bouncycastle.crypto.Digest digest, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b, byte[] bArr5, int i2, int i3, byte[] bArr6, int i4) {
        getHighSpeedVideoFpsRangesFor(digest, b, bArr4);
        digest.update(bArr, 32, 32);
        digest.update(bArr5, i2, i3);
        digest.doFinal(bArr, 0);
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr);
        byte[] bArr7 = new byte[32];
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum pointAccum = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum((byte) 0);
        Camera2StreamConfigurationMap(highSpeedVideoFpsRanges, pointAccum);
        if (getHighSpeedVideoFpsRanges(pointAccum, bArr7, 0) == 0) {
            throw new java.lang.IllegalStateException();
        }
        getHighSpeedVideoFpsRangesFor(digest, b, bArr4);
        digest.update(bArr7, 0, 32);
        digest.update(bArr3, i, 32);
        digest.update(bArr5, i2, i3);
        digest.doFinal(bArr, 0);
        byte[] highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(bArr);
        int[] iArr = new int[16];
        getHighSpeedVideoSizes(highSpeedVideoFpsRanges, 0, iArr);
        int[] iArr2 = new int[8];
        getHighSpeedVideoSizes(highSpeedVideoFpsRanges2, 0, iArr2);
        int[] iArr3 = new int[8];
        getHighSpeedVideoSizes(bArr2, 0, iArr3);
        org.bouncycastle.math.raw.Nat256.mulAddTo(iArr2, iArr3, iArr);
        byte[] bArr8 = new byte[64];
        for (int i5 = 0; i5 < 16; i5++) {
            getHighResolutionOutputSizeshNQ4ISI(iArr[i5], bArr8, i5 * 4);
        }
        byte[] highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(bArr8);
        java.lang.System.arraycopy(bArr7, 0, bArr6, i4, 32);
        java.lang.System.arraycopy(highSpeedVideoFpsRanges3, 0, bArr6, i4 + 32, 32);
    }

    private static void Camera2StreamConfigurationMap(byte[] bArr, int i, byte[] bArr2, byte b, byte[] bArr3, int i2, int i3, byte[] bArr4, int i4) {
        if (!(bArr2 == null && b == 0) && (bArr2 == null || bArr2.length >= 256)) {
            throw new java.lang.IllegalArgumentException("ctx");
        }
        org.bouncycastle.crypto.digests.SHA512Digest sHA512Digest = new org.bouncycastle.crypto.digests.SHA512Digest();
        byte[] bArr5 = new byte[sHA512Digest.getDigestSize()];
        sHA512Digest.update(bArr, i, 32);
        sHA512Digest.doFinal(bArr5, 0);
        byte[] bArr6 = new byte[32];
        getHighSpeedVideoFpsRanges(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[32];
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum pointAccum = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum((byte) 0);
        Camera2StreamConfigurationMap(bArr6, pointAccum);
        if (getHighSpeedVideoFpsRanges(pointAccum, bArr7, 0) == 0) {
            throw new java.lang.IllegalStateException();
        }
        Camera2StreamConfigurationMap(sHA512Digest, bArr5, bArr6, bArr7, 0, bArr2, b, bArr3, i2, i3, bArr4, i4);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        if (!(bArr3 == null && b == 0) && (bArr3 == null || bArr3.length >= 256)) {
            throw new java.lang.IllegalArgumentException("ctx");
        }
        org.bouncycastle.crypto.digests.SHA512Digest sHA512Digest = new org.bouncycastle.crypto.digests.SHA512Digest();
        byte[] bArr6 = new byte[sHA512Digest.getDigestSize()];
        sHA512Digest.update(bArr, i, 32);
        sHA512Digest.doFinal(bArr6, 0);
        byte[] bArr7 = new byte[32];
        getHighSpeedVideoFpsRanges(bArr6, 0, bArr7);
        Camera2StreamConfigurationMap(sHA512Digest, bArr6, bArr7, bArr2, i2, bArr3, b, bArr4, i3, i4, bArr5, i5);
    }

    private static boolean getHighSpeedVideoSizes(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b, byte[] bArr4, int i3, int i4) {
        if (!(bArr3 == null && b == 0) && (bArr3 == null || bArr3.length >= 256)) {
            throw new java.lang.IllegalArgumentException("ctx");
        }
        byte[] bArr5 = new byte[32];
        byte b2 = 0;
        java.lang.System.arraycopy(bArr, i, bArr5, 0, 32);
        byte[] bArr6 = new byte[32];
        java.lang.System.arraycopy(bArr, i + 32, bArr6, 0, 32);
        int[] iArr = new int[8];
        getHighSpeedVideoSizes(bArr5, 0, iArr);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        if (!(!org.bouncycastle.math.raw.Nat256.gte(iArr, getInputSizeshNQ4ISI))) {
            return false;
        }
        int[] iArr2 = new int[8];
        getHighSpeedVideoSizes(bArr6, 0, iArr2);
        if (!(!org.bouncycastle.math.raw.Nat256.gte(iArr2, getInputFormats))) {
            return false;
        }
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointAffine pointAffine = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointAffine(b2);
        if (!getHighSpeedVideoFpsRanges(bArr2, i2, true, pointAffine)) {
            return false;
        }
        org.bouncycastle.crypto.digests.SHA512Digest sHA512Digest = new org.bouncycastle.crypto.digests.SHA512Digest();
        byte[] bArr7 = new byte[sHA512Digest.getDigestSize()];
        getHighSpeedVideoFpsRangesFor(sHA512Digest, b, bArr3);
        sHA512Digest.update(bArr5, 0, 32);
        sHA512Digest.update(bArr2, i2, 32);
        sHA512Digest.update(bArr4, i3, i4);
        sHA512Digest.doFinal(bArr7, 0);
        int[] iArr3 = new int[8];
        getHighSpeedVideoSizes(getHighSpeedVideoFpsRanges(bArr7), 0, iArr3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum pointAccum = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum(b2);
        precompute();
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(iArr2, 7);
        byte[] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(iArr3, 5);
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(getHighSpeedVideoFpsRanges(pointAffine), 8);
        Camera2StreamConfigurationMap(pointAccum);
        int i5 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
        while (true) {
            byte b3 = highSpeedVideoFpsRangesFor[i5];
            if (b3 != 0) {
                int i6 = b3 >> com.google.common.base.Ascii.US;
                getHighResolutionOutputSizeshNQ4ISI(i6 != 0, getHighSpeedVideoSizesFor[(b3 ^ i6) >>> 1], pointAccum);
            }
            byte b4 = highSpeedVideoFpsRangesFor2[i5];
            if (b4 != 0) {
                int i7 = b4 >> com.google.common.base.Ascii.US;
                getHighResolutionOutputSizeshNQ4ISI(i7 != 0, Camera2StreamConfigurationMap2[(b4 ^ i7) >>> 1], pointAccum);
            }
            i5--;
            if (i5 < 0) {
                break;
            }
            getHighResolutionOutputSizeshNQ4ISI(pointAccum);
        }
        byte[] bArr8 = new byte[32];
        return getHighSpeedVideoFpsRanges(pointAccum, bArr8, 0) != 0 && org.bouncycastle.util.Arrays.areEqual(bArr8, bArr5);
    }

    private static org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt getHighSpeedVideoFpsRanges(org.bouncycastle.math.ec.rfc8032.Ed25519.PointAffine pointAffine) {
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt((byte) 0);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointAffine.getHighResolutionOutputSizeshNQ4ISI, 0, pointExt.Camera2StreamConfigurationMap, 0);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointAffine.Camera2StreamConfigurationMap, 0, pointExt.getHighSpeedVideoSizes, 0);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.one(pointExt.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(pointExt.Camera2StreamConfigurationMap, pointExt.getHighSpeedVideoSizes, pointExt.getHighSpeedVideoFpsRanges);
        return pointExt;
    }

    private static org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt) {
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt2 = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt((byte) 0);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointExt.Camera2StreamConfigurationMap, 0, pointExt2.Camera2StreamConfigurationMap, 0);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointExt.getHighSpeedVideoSizes, 0, pointExt2.getHighSpeedVideoSizes, 0);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointExt.getHighSpeedVideoFpsRangesFor, 0, pointExt2.getHighSpeedVideoFpsRangesFor, 0);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointExt.getHighSpeedVideoFpsRanges, 0, pointExt2.getHighSpeedVideoFpsRanges, 0);
        return pointExt2;
    }

    public static void precompute() {
        synchronized (getOutputStallDurationlomOqCM) {
            if (getOutputFormats == null) {
                byte b = 0;
                org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt(b);
                int[] iArr = getHighSpeedVideoFpsRangesFor;
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(iArr, 0, pointExt.Camera2StreamConfigurationMap, 0);
                int[] iArr2 = getHighSpeedVideoFpsRanges;
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(iArr2, 0, pointExt.getHighSpeedVideoSizes, 0);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.one(pointExt.getHighSpeedVideoFpsRangesFor);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(pointExt.Camera2StreamConfigurationMap, pointExt.getHighSpeedVideoSizes, pointExt.getHighSpeedVideoFpsRanges);
                getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap(pointExt, 32);
                org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum pointAccum = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum(b);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(iArr, 0, pointAccum.getHighResolutionOutputSizeshNQ4ISI, 0);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(iArr2, 0, pointAccum.Camera2StreamConfigurationMap, 0);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.one(pointAccum.getHighSpeedVideoFpsRangesFor);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointAccum.getHighResolutionOutputSizeshNQ4ISI, 0, pointAccum.getHighSpeedVideoSizes, 0);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointAccum.Camera2StreamConfigurationMap, 0, pointAccum.getHighSpeedVideoFpsRanges, 0);
                getOutputFormats = org.bouncycastle.math.ec.rfc8032.Ed25519.F.createTable(192);
                int i = 0;
                for (int i2 = 0; i2 < 8; i2++) {
                    org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt[] pointExtArr = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt[4];
                    org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt2 = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt(b);
                    org.bouncycastle.math.ec.rfc8032.Ed25519.F.zero(pointExt2.Camera2StreamConfigurationMap);
                    org.bouncycastle.math.ec.rfc8032.Ed25519.F.one(pointExt2.getHighSpeedVideoSizes);
                    org.bouncycastle.math.ec.rfc8032.Ed25519.F.one(pointExt2.getHighSpeedVideoFpsRangesFor);
                    org.bouncycastle.math.ec.rfc8032.Ed25519.F.zero(pointExt2.getHighSpeedVideoFpsRanges);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 4) {
                            break;
                        }
                        getHighResolutionOutputSizeshNQ4ISI(true, pointExt2, getHighSpeedVideoFpsRangesFor(pointAccum), pointExt2);
                        getHighResolutionOutputSizeshNQ4ISI(pointAccum);
                        pointExtArr[i3] = getHighSpeedVideoFpsRangesFor(pointAccum);
                        if (i2 + i3 != 10) {
                            for (int i4 = 1; i4 < 8; i4++) {
                                getHighResolutionOutputSizeshNQ4ISI(pointAccum);
                            }
                        }
                        i3++;
                    }
                    org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt[] pointExtArr2 = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt[8];
                    pointExtArr2[0] = pointExt2;
                    int i5 = 1;
                    for (int i6 = 0; i6 < 3; i6++) {
                        int i7 = 1 << i6;
                        int i8 = 0;
                        while (i8 < i7) {
                            org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt3 = pointExtArr2[i5 - i7];
                            org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt4 = pointExtArr[i6];
                            org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt5 = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt(b);
                            pointExtArr2[i5] = pointExt5;
                            getHighResolutionOutputSizeshNQ4ISI(false, pointExt3, pointExt4, pointExt5);
                            i8++;
                            i5++;
                        }
                    }
                    int[] createTable = org.bouncycastle.math.ec.rfc8032.Ed25519.F.createTable(8);
                    int[] create = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
                    org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointExtArr2[0].getHighSpeedVideoFpsRangesFor, 0, create, 0);
                    org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(create, 0, createTable, 0);
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        if (i10 >= 8) {
                            break;
                        }
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create, pointExtArr2[i10].getHighSpeedVideoFpsRangesFor, create);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(create, 0, createTable, i10 * 10);
                        i9 = i10;
                    }
                    org.bouncycastle.math.ec.rfc8032.Ed25519.F.add(create, create, create);
                    org.bouncycastle.math.ec.rfc8032.Ed25519.F.invVar(create, create);
                    int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
                    while (i9 > 0) {
                        int i11 = i9 - 1;
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(createTable, i11 * 10, create2, 0);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create2, create, create2);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(create2, 0, createTable, i9 * 10);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create, pointExtArr2[i9].getHighSpeedVideoFpsRangesFor, create);
                        i9 = i11;
                    }
                    org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(create, 0, createTable, 0);
                    for (int i12 = 0; i12 < 8; i12++) {
                        org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt6 = pointExtArr2[i12];
                        int[] create3 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
                        int[] create4 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(createTable, i12 * 10, create4, 0);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(pointExt6.Camera2StreamConfigurationMap, create4, create3);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(pointExt6.getHighSpeedVideoSizes, create4, create4);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.PointPrecomp pointPrecomp = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointPrecomp(b);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.apm(create4, create3, pointPrecomp.getHighSpeedVideoFpsRanges, pointPrecomp.getHighSpeedVideoSizes);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create3, create4, pointPrecomp.Camera2StreamConfigurationMap);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(pointPrecomp.Camera2StreamConfigurationMap, getHighResolutionOutputSizeshNQ4ISI, pointPrecomp.Camera2StreamConfigurationMap);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.normalize(pointPrecomp.getHighSpeedVideoFpsRanges);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.normalize(pointPrecomp.getHighSpeedVideoSizes);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointPrecomp.getHighSpeedVideoFpsRanges, 0, getOutputFormats, i);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointPrecomp.getHighSpeedVideoSizes, 0, getOutputFormats, i + 10);
                        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointPrecomp.Camera2StreamConfigurationMap, 0, getOutputFormats, i + 20);
                        i += 30;
                    }
                }
            }
        }
    }

    private static void Camera2StreamConfigurationMap(byte[] bArr, org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum pointAccum) {
        precompute();
        int i = 8;
        int[] iArr = new int[8];
        byte b = 0;
        getHighSpeedVideoSizes(bArr, 0, iArr);
        org.bouncycastle.math.raw.Nat.cadd(8, (~iArr[0]) & 1, iArr, getInputFormats, iArr);
        org.bouncycastle.math.raw.Nat.shiftDownBit(8, iArr, 1);
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = org.bouncycastle.math.raw.Interleave.shuffle2(iArr[i2]);
        }
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointPrecomp pointPrecomp = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointPrecomp(b);
        Camera2StreamConfigurationMap(pointAccum);
        int i3 = 28;
        while (true) {
            int i4 = 0;
            while (i4 < i) {
                int i5 = iArr[i4] >>> i3;
                int i6 = (i5 >>> 3) & 1;
                int i7 = (i5 ^ (-i6)) & 7;
                int i8 = i4 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                for (int i9 = 0; i9 < i; i9++) {
                    int i10 = ((i9 ^ i7) - 1) >> 31;
                    org.bouncycastle.math.ec.rfc8032.Ed25519.F.cmov(i10, getOutputFormats, i8, pointPrecomp.getHighSpeedVideoFpsRanges, 0);
                    org.bouncycastle.math.ec.rfc8032.Ed25519.F.cmov(i10, getOutputFormats, i8 + 10, pointPrecomp.getHighSpeedVideoSizes, 0);
                    org.bouncycastle.math.ec.rfc8032.Ed25519.F.cmov(i10, getOutputFormats, i8 + 20, pointPrecomp.Camera2StreamConfigurationMap, 0);
                    i8 += 30;
                }
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.cswap(i6, pointPrecomp.getHighSpeedVideoFpsRanges, pointPrecomp.getHighSpeedVideoSizes);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.cnegate(i6, pointPrecomp.Camera2StreamConfigurationMap);
                int[] create = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
                int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
                int[] create3 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
                int[] iArr2 = pointAccum.getHighSpeedVideoSizes;
                int[] create4 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
                int[] create5 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
                int[] iArr3 = pointAccum.getHighSpeedVideoFpsRanges;
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.apm(pointAccum.Camera2StreamConfigurationMap, pointAccum.getHighResolutionOutputSizeshNQ4ISI, create2, create);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create, pointPrecomp.getHighSpeedVideoSizes, create);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create2, pointPrecomp.getHighSpeedVideoFpsRanges, create2);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(pointAccum.getHighSpeedVideoSizes, pointAccum.getHighSpeedVideoFpsRanges, create3);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create3, pointPrecomp.Camera2StreamConfigurationMap, create3);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.apm(create2, create, iArr3, iArr2);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.apm(pointAccum.getHighSpeedVideoFpsRangesFor, create3, create5, create4);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.carry(create5);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(iArr2, create4, pointAccum.getHighResolutionOutputSizeshNQ4ISI);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create5, iArr3, pointAccum.Camera2StreamConfigurationMap);
                org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create4, create5, pointAccum.getHighSpeedVideoFpsRangesFor);
                i4++;
                i = 8;
            }
            i3 -= 4;
            if (i3 < 0) {
                return;
            }
            getHighResolutionOutputSizeshNQ4ISI(pointAccum);
            i = 8;
        }
    }

    public static void scalarMultBaseYZ(org.bouncycastle.math.ec.rfc7748.X25519.Friend friend, byte[] bArr, int i, int[] iArr, int[] iArr2) {
        if (friend == null) {
            throw new java.lang.NullPointerException("This method is only for use by X25519");
        }
        byte[] bArr2 = new byte[32];
        getHighSpeedVideoFpsRanges(bArr, i, bArr2);
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum pointAccum = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum((byte) 0);
        Camera2StreamConfigurationMap(bArr2, pointAccum);
        int[] iArr3 = pointAccum.getHighResolutionOutputSizeshNQ4ISI;
        int[] iArr4 = pointAccum.Camera2StreamConfigurationMap;
        int[] iArr5 = pointAccum.getHighSpeedVideoFpsRangesFor;
        int[] create = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create3 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create4 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sqr(iArr3, create2);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sqr(iArr4, create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sqr(iArr5, create4);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create2, create3, create);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sub(create3, create2, create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create3, create4, create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sqr(create4, create4);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create, getHighSpeedVideoSizes, create);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.add(create, create4, create);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sub(create, create3, create);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.normalize(create);
        if (org.bouncycastle.math.ec.rfc8032.Ed25519.F.isZero(create) == 0) {
            throw new java.lang.IllegalStateException();
        }
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointAccum.Camera2StreamConfigurationMap, 0, iArr, 0);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointAccum.getHighSpeedVideoFpsRangesFor, 0, iArr2, 0);
    }

    public static boolean validatePublicKeyFull(byte[] bArr, int i) {
        byte b = 0;
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointAffine pointAffine = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointAffine(b);
        if (!getHighSpeedVideoFpsRanges(bArr, i, false, pointAffine)) {
            return false;
        }
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.normalize(pointAffine.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.normalize(pointAffine.Camera2StreamConfigurationMap);
        int[] iArr = pointAffine.getHighResolutionOutputSizeshNQ4ISI;
        int[] iArr2 = pointAffine.Camera2StreamConfigurationMap;
        if (org.bouncycastle.math.ec.rfc8032.Ed25519.F.isZeroVar(iArr) && org.bouncycastle.math.ec.rfc8032.Ed25519.F.isOneVar(iArr2)) {
            return false;
        }
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum pointAccum = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum(b);
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getInputFormats, 5);
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(getHighSpeedVideoFpsRanges(pointAffine), 8);
        Camera2StreamConfigurationMap(pointAccum);
        int i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
        while (true) {
            byte b2 = highSpeedVideoFpsRangesFor[i2];
            if (b2 != 0) {
                int i3 = b2 >> com.google.common.base.Ascii.US;
                getHighResolutionOutputSizeshNQ4ISI(i3 != 0, Camera2StreamConfigurationMap2[(b2 ^ i3) >>> 1], pointAccum);
            }
            i2--;
            if (i2 < 0) {
                break;
            }
            getHighResolutionOutputSizeshNQ4ISI(pointAccum);
        }
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.normalize(pointAccum.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.normalize(pointAccum.Camera2StreamConfigurationMap);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.normalize(pointAccum.getHighSpeedVideoFpsRangesFor);
        return org.bouncycastle.math.ec.rfc8032.Ed25519.F.isZeroVar(pointAccum.getHighResolutionOutputSizeshNQ4ISI) && org.bouncycastle.math.ec.rfc8032.Ed25519.F.areEqualVar(pointAccum.Camera2StreamConfigurationMap, pointAccum.getHighSpeedVideoFpsRangesFor);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3) {
        return getHighSpeedVideoSizes(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, org.bouncycastle.crypto.Digest digest) {
        byte[] bArr4 = new byte[64];
        if (64 == digest.doFinal(bArr4, 0)) {
            return getHighSpeedVideoSizes(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, 0, 64);
        }
        throw new java.lang.IllegalArgumentException("ph");
    }

    public static boolean verify(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4) {
        return getHighSpeedVideoSizes(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4);
    }

    public static boolean verify(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4) {
        return getHighSpeedVideoSizes(bArr, i, bArr2, i2, null, (byte) 0, bArr3, i3, i4);
    }

    public static boolean validatePublicKeyPartial(byte[] bArr, int i) {
        return getHighSpeedVideoFpsRanges(bArr, i, false, new org.bouncycastle.math.ec.rfc8032.Ed25519.PointAffine((byte) 0));
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4, int i3) {
        Camera2StreamConfigurationMap(bArr, i, bArr2, (byte) 1, bArr3, i2, 64, bArr4, i3);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, org.bouncycastle.crypto.Digest digest, byte[] bArr3, int i2) {
        byte[] bArr4 = new byte[64];
        if (64 != digest.doFinal(bArr4, 0)) {
            throw new java.lang.IllegalArgumentException("ph");
        }
        Camera2StreamConfigurationMap(bArr, i, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i2);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, byte[] bArr5, int i4) {
        getHighResolutionOutputSizeshNQ4ISI(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64, bArr5, i4);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, org.bouncycastle.crypto.Digest digest, byte[] bArr4, int i3) {
        byte[] bArr5 = new byte[64];
        if (64 != digest.doFinal(bArr5, 0)) {
            throw new java.lang.IllegalArgumentException("ph");
        }
        getHighResolutionOutputSizeshNQ4ISI(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i3);
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, int i3, byte[] bArr4, int i4) {
        Camera2StreamConfigurationMap(bArr, i, bArr2, (byte) 0, bArr3, i2, i3, bArr4, i4);
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        getHighResolutionOutputSizeshNQ4ISI(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4, bArr5, i5);
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4, byte[] bArr4, int i5) {
        getHighResolutionOutputSizeshNQ4ISI(bArr, i, bArr2, i2, null, (byte) 0, bArr3, i3, i4, bArr4, i5);
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        Camera2StreamConfigurationMap(bArr, i, null, (byte) 0, bArr2, i2, i3, bArr3, i4);
    }

    private static byte[] getHighSpeedVideoFpsRanges(byte[] bArr) {
        long Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr, 0);
        long highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, 4) << 4;
        long Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(bArr, 7);
        long highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(bArr, 11) << 4;
        long Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(bArr, 14);
        long highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(bArr, 18) << 4;
        long Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(bArr, 21);
        long highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(bArr, 25) << 4;
        long Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap(bArr, 28);
        long highResolutionOutputSizeshNQ4ISI5 = getHighResolutionOutputSizeshNQ4ISI(bArr, 32) << 4;
        long Camera2StreamConfigurationMap7 = Camera2StreamConfigurationMap(bArr, 35);
        long highResolutionOutputSizeshNQ4ISI6 = getHighResolutionOutputSizeshNQ4ISI(bArr, 39) << 4;
        long Camera2StreamConfigurationMap8 = Camera2StreamConfigurationMap(bArr, 42);
        long highResolutionOutputSizeshNQ4ISI7 = getHighResolutionOutputSizeshNQ4ISI(bArr, 46) << 4;
        long Camera2StreamConfigurationMap9 = Camera2StreamConfigurationMap(bArr, 49);
        long highResolutionOutputSizeshNQ4ISI8 = getHighResolutionOutputSizeshNQ4ISI(bArr, 53) << 4;
        long Camera2StreamConfigurationMap10 = Camera2StreamConfigurationMap(bArr, 56);
        long j = bArr[63] & 255;
        long highResolutionOutputSizeshNQ4ISI9 = ((getHighResolutionOutputSizeshNQ4ISI(bArr, 60) << 4) & 4294967295L) + ((Camera2StreamConfigurationMap10 & 4294967295L) >> 28);
        long j2 = Camera2StreamConfigurationMap10 & 268435455;
        long j3 = ((Camera2StreamConfigurationMap8 & 4294967295L) - (j * (-6428113))) - (highResolutionOutputSizeshNQ4ISI9 * 5343);
        long j4 = (((highResolutionOutputSizeshNQ4ISI6 & 4294967295L) - (j * 127719000)) - (highResolutionOutputSizeshNQ4ISI9 * (-6428113))) - (j2 * 5343);
        long j5 = (highResolutionOutputSizeshNQ4ISI8 & 4294967295L) + ((Camera2StreamConfigurationMap9 & 4294967295L) >> 28);
        long j6 = Camera2StreamConfigurationMap9 & 268435455;
        long j7 = ((((Camera2StreamConfigurationMap7 & 4294967295L) - (j * 19280294)) - (highResolutionOutputSizeshNQ4ISI9 * 127719000)) - (j2 * (-6428113))) - (j5 * 5343);
        long j8 = (((((highResolutionOutputSizeshNQ4ISI5 & 4294967295L) - (j * (-50998291))) - (highResolutionOutputSizeshNQ4ISI9 * 19280294)) - (j2 * 127719000)) - (j5 * (-6428113))) - (j6 * 5343);
        long j9 = ((highResolutionOutputSizeshNQ4ISI7 & 4294967295L) - (j * 5343)) + (j3 >> 28);
        long j10 = (j3 & 268435455) + (j4 >> 28);
        long j11 = (((((highResolutionOutputSizeshNQ4ISI4 & 4294967295L) - (j2 * (-50998291))) - (j5 * 19280294)) - (j6 * 127719000)) - (j9 * (-6428113))) - (j10 * 5343);
        long j12 = (j4 & 268435455) + (j7 >> 28);
        long j13 = (j7 & 268435455) + (j8 >> 28);
        long j14 = ((((((Camera2StreamConfigurationMap6 & 4294967295L) - (highResolutionOutputSizeshNQ4ISI9 * (-50998291))) - (j2 * 19280294)) - (j5 * 127719000)) - (j6 * (-6428113))) - (j9 * 5343)) + (j11 >> 28);
        long j15 = j14 & 268435455;
        long j16 = j15 >>> 27;
        long j17 = (j8 & 268435455) + (j14 >> 28) + j16;
        long j18 = (Camera2StreamConfigurationMap2 & 4294967295L) - (j17 * (-50998291));
        long j19 = (((highResolutionOutputSizeshNQ4ISI & 4294967295L) - (j13 * (-50998291))) - (j17 * 19280294)) + (j18 >> 28);
        long j20 = ((((Camera2StreamConfigurationMap3 & 4294967295L) - (j12 * (-50998291))) - (j13 * 19280294)) - (j17 * 127719000)) + (j19 >> 28);
        long j21 = (((((highResolutionOutputSizeshNQ4ISI2 & 4294967295L) - (j10 * (-50998291))) - (j12 * 19280294)) - (j13 * 127719000)) - (j17 * (-6428113))) + (j20 >> 28);
        long j22 = ((((((Camera2StreamConfigurationMap4 & 4294967295L) - (j9 * (-50998291))) - (j10 * 19280294)) - (j12 * 127719000)) - (j13 * (-6428113))) - (j17 * 5343)) + (j21 >> 28);
        long j23 = ((((((highResolutionOutputSizeshNQ4ISI3 & 4294967295L) - (j6 * (-50998291))) - (j9 * 19280294)) - (j10 * 127719000)) - (j12 * (-6428113))) - (j13 * 5343)) + (j22 >> 28);
        long j24 = ((((((Camera2StreamConfigurationMap5 & 4294967295L) - (j5 * (-50998291))) - (j6 * 19280294)) - (j9 * 127719000)) - (j10 * (-6428113))) - (j12 * 5343)) + (j23 >> 28);
        long j25 = (j11 & 268435455) + (j24 >> 28);
        long j26 = j15 + (j25 >> 28);
        long j27 = (j26 >> 28) - j16;
        long j28 = (j18 & 268435455) + (j27 & (-50998291));
        long j29 = (j19 & 268435455) + (j27 & 19280294) + (j28 >> 28);
        long j30 = (j20 & 268435455) + (j27 & 127719000) + (j29 >> 28);
        long j31 = (j21 & 268435455) + (j27 & (-6428113)) + (j30 >> 28);
        long j32 = (j22 & 268435455) + (j27 & 5343) + (j31 >> 28);
        long j33 = (j23 & 268435455) + (j32 >> 28);
        long j34 = (j24 & 268435455) + (j33 >> 28);
        long j35 = (j25 & 268435455) + (j34 >> 28);
        byte[] bArr2 = new byte[32];
        Camera2StreamConfigurationMap((j28 & 268435455) | ((j29 & 268435455) << 28), bArr2, 0);
        Camera2StreamConfigurationMap((j30 & 268435455) | ((j31 & 268435455) << 28), bArr2, 7);
        Camera2StreamConfigurationMap(((j33 & 268435455) << 28) | (j32 & 268435455), bArr2, 14);
        Camera2StreamConfigurationMap(((j35 & 268435455) << 28) | (j34 & 268435455), bArr2, 21);
        getHighResolutionOutputSizeshNQ4ISI((int) ((j26 & 268435455) + (j35 >> 28)), bArr2, 28);
        return bArr2;
    }

    private static void getHighSpeedVideoFpsRanges(byte[] bArr, int i, byte[] bArr2) {
        java.lang.System.arraycopy(bArr, i, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b = (byte) (bArr2[31] & Byte.MAX_VALUE);
        bArr2[31] = b;
        bArr2[31] = (byte) (b | 64);
    }

    private static void Camera2StreamConfigurationMap(org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum pointAccum) {
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.zero(pointAccum.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.one(pointAccum.Camera2StreamConfigurationMap);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.one(pointAccum.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.zero(pointAccum.getHighSpeedVideoSizes);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.one(pointAccum.getHighSpeedVideoFpsRanges);
    }

    private static org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt[] Camera2StreamConfigurationMap(org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt, int i) {
        byte b = 0;
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt2 = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt(b);
        getHighResolutionOutputSizeshNQ4ISI(false, pointExt, pointExt, pointExt2);
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt[] pointExtArr = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt[i];
        pointExtArr[0] = getHighResolutionOutputSizeshNQ4ISI(pointExt);
        for (int i2 = 1; i2 < i; i2++) {
            org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt3 = pointExtArr[i2 - 1];
            org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt4 = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt(b);
            pointExtArr[i2] = pointExt4;
            getHighResolutionOutputSizeshNQ4ISI(false, pointExt3, pointExt2, pointExt4);
        }
        return pointExtArr;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum pointAccum) {
        int[] create = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create3 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] iArr = pointAccum.getHighSpeedVideoSizes;
        int[] create4 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create5 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] iArr2 = pointAccum.getHighSpeedVideoFpsRanges;
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sqr(pointAccum.getHighResolutionOutputSizeshNQ4ISI, create);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sqr(pointAccum.Camera2StreamConfigurationMap, create2);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sqr(pointAccum.getHighSpeedVideoFpsRangesFor, create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.add(create3, create3, create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.apm(create, create2, iArr2, create5);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.add(pointAccum.getHighResolutionOutputSizeshNQ4ISI, pointAccum.Camera2StreamConfigurationMap, iArr);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sqr(iArr, iArr);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.sub(iArr2, iArr, iArr);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.add(create3, create5, create4);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.carry(create4);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(iArr, create4, pointAccum.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create5, iArr2, pointAccum.Camera2StreamConfigurationMap);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create4, create5, pointAccum.getHighSpeedVideoFpsRangesFor);
    }

    private static org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt getHighSpeedVideoFpsRangesFor(org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum pointAccum) {
        org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt = new org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt((byte) 0);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointAccum.getHighResolutionOutputSizeshNQ4ISI, 0, pointExt.Camera2StreamConfigurationMap, 0);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointAccum.Camera2StreamConfigurationMap, 0, pointExt.getHighSpeedVideoSizes, 0);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.copy(pointAccum.getHighSpeedVideoFpsRangesFor, 0, pointExt.getHighSpeedVideoFpsRangesFor, 0);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(pointAccum.getHighSpeedVideoSizes, pointAccum.getHighSpeedVideoFpsRanges, pointExt.getHighSpeedVideoFpsRanges);
        return pointExt;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(boolean z, org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt, org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt2, org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] create = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create3 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create4 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create5 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create6 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create7 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create8 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        if (z) {
            iArr2 = create3;
            iArr = create4;
            iArr4 = create6;
            iArr3 = create7;
        } else {
            iArr = create3;
            iArr2 = create4;
            iArr3 = create6;
            iArr4 = create7;
        }
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.apm(pointExt.getHighSpeedVideoSizes, pointExt.Camera2StreamConfigurationMap, create2, create);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.apm(pointExt2.getHighSpeedVideoSizes, pointExt2.Camera2StreamConfigurationMap, iArr2, iArr);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create, create3, create);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create2, create4, create2);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(pointExt.getHighSpeedVideoFpsRanges, pointExt2.getHighSpeedVideoFpsRanges, create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create3, Camera2StreamConfigurationMap, create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(pointExt.getHighSpeedVideoFpsRangesFor, pointExt2.getHighSpeedVideoFpsRangesFor, create4);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.add(create4, create4, create4);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.apm(create2, create, create8, create5);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.apm(create4, create3, iArr4, iArr3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.carry(iArr4);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create5, create6, pointExt3.Camera2StreamConfigurationMap);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create7, create8, pointExt3.getHighSpeedVideoSizes);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create6, create7, pointExt3.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create5, create8, pointExt3.getHighSpeedVideoFpsRanges);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(boolean z, org.bouncycastle.math.ec.rfc8032.Ed25519.PointExt pointExt, org.bouncycastle.math.ec.rfc8032.Ed25519.PointAccum pointAccum) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] create = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create2 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create3 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create4 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] iArr5 = pointAccum.getHighSpeedVideoSizes;
        int[] create5 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] create6 = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        int[] iArr6 = pointAccum.getHighSpeedVideoFpsRanges;
        if (z) {
            iArr2 = create3;
            iArr = create4;
            iArr4 = create5;
            iArr3 = create6;
        } else {
            iArr = create3;
            iArr2 = create4;
            iArr3 = create5;
            iArr4 = create6;
        }
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.apm(pointAccum.Camera2StreamConfigurationMap, pointAccum.getHighResolutionOutputSizeshNQ4ISI, create2, create);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.apm(pointExt.getHighSpeedVideoSizes, pointExt.Camera2StreamConfigurationMap, iArr2, iArr);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create, create3, create);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create2, create4, create2);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(pointAccum.getHighSpeedVideoSizes, pointAccum.getHighSpeedVideoFpsRanges, create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create3, pointExt.getHighSpeedVideoFpsRanges, create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create3, Camera2StreamConfigurationMap, create3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(pointAccum.getHighSpeedVideoFpsRangesFor, pointExt.getHighSpeedVideoFpsRangesFor, create4);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.add(create4, create4, create4);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.apm(create2, create, iArr6, iArr5);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.apm(create4, create3, iArr4, iArr3);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.carry(iArr4);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(iArr5, create5, pointAccum.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create6, iArr6, pointAccum.Camera2StreamConfigurationMap);
        org.bouncycastle.math.ec.rfc8032.Ed25519.F.mul(create5, create6, pointAccum.getHighSpeedVideoFpsRangesFor);
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(int[] iArr, int i) {
        int[] iArr2 = new int[16];
        int i2 = 8;
        int i3 = 0;
        int i4 = 16;
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
        byte[] bArr = new byte[com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE];
        int i7 = 32 - i;
        int i8 = 0;
        int i9 = 0;
        while (i3 < 16) {
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

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private static void getHighSpeedVideoFpsRangesFor(org.bouncycastle.crypto.Digest digest, byte b, byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = getOutputMinFrameDuration;
            int length = bArr2.length;
            int i = length + 2;
            int length2 = bArr.length + i;
            byte[] bArr3 = new byte[length2];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, length);
            bArr3[length] = b;
            bArr3[length + 1] = (byte) bArr.length;
            java.lang.System.arraycopy(bArr, 0, bArr3, i, bArr.length);
            digest.update(bArr3, 0, length2);
        }
    }

    private static void getHighSpeedVideoSizes(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = Camera2StreamConfigurationMap(bArr, i2 * 4);
        }
    }

    private static int Camera2StreamConfigurationMap(byte[] bArr, int i) {
        return (bArr[i + 3] << com.google.common.base.Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static class PointAccum {
        int[] Camera2StreamConfigurationMap;
        int[] getHighResolutionOutputSizeshNQ4ISI;
        int[] getHighSpeedVideoFpsRanges;
        int[] getHighSpeedVideoFpsRangesFor;
        int[] getHighSpeedVideoSizes;

        /* synthetic */ PointAccum(byte b) {
            this();
        }

        private PointAccum() {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
            this.Camera2StreamConfigurationMap = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
            this.getHighSpeedVideoSizes = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        }
    }

    static class PointAffine {
        int[] Camera2StreamConfigurationMap;
        int[] getHighResolutionOutputSizeshNQ4ISI;

        /* synthetic */ PointAffine(byte b) {
            this();
        }

        private PointAffine() {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
            this.Camera2StreamConfigurationMap = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        }
    }

    static class PointExt {
        int[] Camera2StreamConfigurationMap;
        int[] getHighSpeedVideoFpsRanges;
        int[] getHighSpeedVideoFpsRangesFor;
        int[] getHighSpeedVideoSizes;

        /* synthetic */ PointExt(byte b) {
            this();
        }

        private PointExt() {
            this.Camera2StreamConfigurationMap = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
            this.getHighSpeedVideoSizes = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        }
    }

    static class PointPrecomp {
        int[] Camera2StreamConfigurationMap;
        int[] getHighSpeedVideoFpsRanges;
        int[] getHighSpeedVideoSizes;

        /* synthetic */ PointPrecomp(byte b) {
            this();
        }

        private PointPrecomp() {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
            this.getHighSpeedVideoSizes = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
            this.Camera2StreamConfigurationMap = org.bouncycastle.math.ec.rfc8032.Ed25519.F.create();
        }
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    static class F extends org.bouncycastle.math.ec.rfc7748.X25519Field {
        private F() {
        }
    }
}
