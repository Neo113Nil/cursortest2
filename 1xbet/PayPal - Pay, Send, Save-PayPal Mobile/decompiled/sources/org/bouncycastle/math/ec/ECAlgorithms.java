package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public class ECAlgorithms {
    static org.bouncycastle.math.ec.ECPoint Camera2StreamConfigurationMap(org.bouncycastle.math.ec.ECPoint eCPoint) {
        if (eCPoint.getHighSpeedVideoSizes(false, false)) {
            return eCPoint;
        }
        throw new java.lang.IllegalStateException("Invalid result");
    }

    static org.bouncycastle.math.ec.ECPoint getHighSpeedVideoFpsRanges(org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger, org.bouncycastle.math.ec.ECPoint eCPoint2, java.math.BigInteger bigInteger2) {
        org.bouncycastle.math.ec.ECPoint add;
        org.bouncycastle.math.ec.ECPoint offset;
        boolean z = bigInteger.signum() < 0;
        boolean z2 = bigInteger2.signum() < 0;
        java.math.BigInteger abs = bigInteger.abs();
        java.math.BigInteger abs2 = bigInteger2.abs();
        int windowSize = org.bouncycastle.math.ec.WNafUtil.getWindowSize(abs.bitLength(), 8);
        int windowSize2 = org.bouncycastle.math.ec.WNafUtil.getWindowSize(abs2.bitLength(), 8);
        org.bouncycastle.math.ec.WNafPreCompInfo precompute = org.bouncycastle.math.ec.WNafUtil.precompute(eCPoint, windowSize, true);
        org.bouncycastle.math.ec.WNafPreCompInfo precompute2 = org.bouncycastle.math.ec.WNafUtil.precompute(eCPoint2, windowSize2, true);
        int combSize = org.bouncycastle.math.ec.FixedPointUtil.getCombSize(eCPoint.getCurve());
        if (z || z2 || bigInteger.bitLength() > combSize || bigInteger2.bitLength() > combSize || !precompute.isPromoted() || !precompute2.isPromoted()) {
            int min = java.lang.Math.min(8, precompute.getWidth());
            int min2 = java.lang.Math.min(8, precompute2.getWidth());
            return getHighSpeedVideoSizes(z ? precompute.getPreCompNeg() : precompute.getPreComp(), z ? precompute.getPreComp() : precompute.getPreCompNeg(), org.bouncycastle.math.ec.WNafUtil.generateWindowNaf(min, abs), z2 ? precompute2.getPreCompNeg() : precompute2.getPreComp(), z2 ? precompute2.getPreComp() : precompute2.getPreCompNeg(), org.bouncycastle.math.ec.WNafUtil.generateWindowNaf(min2, abs2));
        }
        org.bouncycastle.math.ec.ECCurve curve = eCPoint.getCurve();
        int combSize2 = org.bouncycastle.math.ec.FixedPointUtil.getCombSize(curve);
        if (bigInteger.bitLength() > combSize2 || bigInteger2.bitLength() > combSize2) {
            throw new java.lang.IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        org.bouncycastle.math.ec.FixedPointPreCompInfo precompute3 = org.bouncycastle.math.ec.FixedPointUtil.precompute(eCPoint);
        org.bouncycastle.math.ec.FixedPointPreCompInfo precompute4 = org.bouncycastle.math.ec.FixedPointUtil.precompute(eCPoint2);
        org.bouncycastle.math.ec.ECLookupTable lookupTable = precompute3.getLookupTable();
        org.bouncycastle.math.ec.ECLookupTable lookupTable2 = precompute4.getLookupTable();
        int width = precompute3.getWidth();
        if (width != precompute4.getWidth()) {
            org.bouncycastle.math.ec.FixedPointCombMultiplier fixedPointCombMultiplier = new org.bouncycastle.math.ec.FixedPointCombMultiplier();
            add = fixedPointCombMultiplier.multiply(eCPoint, bigInteger);
            offset = fixedPointCombMultiplier.multiply(eCPoint2, bigInteger2);
        } else {
            int i = ((combSize2 + width) - 1) / width;
            org.bouncycastle.math.ec.ECPoint infinity = curve.getInfinity();
            int i2 = width * i;
            int[] fromBigInteger = org.bouncycastle.math.raw.Nat.fromBigInteger(i2, bigInteger);
            int[] fromBigInteger2 = org.bouncycastle.math.raw.Nat.fromBigInteger(i2, bigInteger2);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = 0;
                int i5 = 0;
                for (int i6 = (i2 - 1) - i3; i6 >= 0; i6 -= i) {
                    int i7 = i6 >>> 5;
                    int i8 = i6 & 31;
                    int i9 = fromBigInteger[i7] >>> i8;
                    i4 = ((i4 ^ (i9 >>> 1)) << 1) ^ i9;
                    int i10 = fromBigInteger2[i7] >>> i8;
                    i5 = ((i5 ^ (i10 >>> 1)) << 1) ^ i10;
                }
                infinity = infinity.twicePlus(lookupTable.lookupVar(i4).add(lookupTable2.lookupVar(i5)));
            }
            add = infinity.add(precompute3.getOffset());
            offset = precompute4.getOffset();
        }
        return add.add(offset);
    }

    private static org.bouncycastle.math.ec.ECPoint getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.math.ec.ECPoint[] eCPointArr, java.math.BigInteger[] bigIntegerArr, org.bouncycastle.math.ec.endo.GLVEndomorphism gLVEndomorphism) {
        boolean z;
        boolean z2 = false;
        java.math.BigInteger order = eCPointArr[0].getCurve().getOrder();
        int length = eCPointArr.length;
        int i = length << 1;
        java.math.BigInteger[] bigIntegerArr2 = new java.math.BigInteger[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            z = true;
            if (i3 >= length) {
                break;
            }
            java.math.BigInteger[] decomposeScalar = gLVEndomorphism.decomposeScalar(bigIntegerArr[i3].mod(order));
            bigIntegerArr2[i2] = decomposeScalar[0];
            bigIntegerArr2[i2 + 1] = decomposeScalar[1];
            i3++;
            i2 += 2;
        }
        if (!gLVEndomorphism.hasEfficientPointMap()) {
            org.bouncycastle.math.ec.ECPoint[] eCPointArr2 = new org.bouncycastle.math.ec.ECPoint[i];
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                org.bouncycastle.math.ec.ECPoint eCPoint = eCPointArr[i4];
                org.bouncycastle.math.ec.ECPoint mapPoint = org.bouncycastle.math.ec.endo.EndoUtil.mapPoint(gLVEndomorphism, eCPoint);
                eCPointArr2[i5] = eCPoint;
                eCPointArr2[i5 + 1] = mapPoint;
                i4++;
                i5 += 2;
            }
            return getHighResolutionOutputSizeshNQ4ISI(eCPointArr2, bigIntegerArr2);
        }
        int length2 = eCPointArr.length;
        int i6 = length2 << 1;
        boolean[] zArr = new boolean[i6];
        org.bouncycastle.math.ec.WNafPreCompInfo[] wNafPreCompInfoArr = new org.bouncycastle.math.ec.WNafPreCompInfo[i6];
        byte[][] bArr = new byte[i6][];
        org.bouncycastle.math.ec.ECPointMap pointMap = gLVEndomorphism.getPointMap();
        int i7 = 0;
        while (i7 < length2) {
            int i8 = i7 << 1;
            int i9 = i8 + 1;
            java.math.BigInteger bigInteger = bigIntegerArr2[i8];
            zArr[i8] = bigInteger.signum() < 0 ? z : z2;
            java.math.BigInteger abs = bigInteger.abs();
            java.math.BigInteger bigInteger2 = bigIntegerArr2[i9];
            zArr[i9] = bigInteger2.signum() < 0 ? z : z2;
            java.math.BigInteger abs2 = bigInteger2.abs();
            int windowSize = org.bouncycastle.math.ec.WNafUtil.getWindowSize(java.lang.Math.max(abs.bitLength(), abs2.bitLength()), 8);
            org.bouncycastle.math.ec.ECPoint eCPoint2 = eCPointArr[i7];
            org.bouncycastle.math.ec.WNafPreCompInfo precompute = org.bouncycastle.math.ec.WNafUtil.precompute(eCPoint2, windowSize, z);
            org.bouncycastle.math.ec.WNafPreCompInfo precomputeWithPointMap = org.bouncycastle.math.ec.WNafUtil.precomputeWithPointMap(org.bouncycastle.math.ec.endo.EndoUtil.mapPoint(gLVEndomorphism, eCPoint2), pointMap, precompute, z);
            int i10 = length2;
            int min = java.lang.Math.min(8, precompute.getWidth());
            int min2 = java.lang.Math.min(8, precomputeWithPointMap.getWidth());
            wNafPreCompInfoArr[i8] = precompute;
            wNafPreCompInfoArr[i9] = precomputeWithPointMap;
            bArr[i8] = org.bouncycastle.math.ec.WNafUtil.generateWindowNaf(min, abs);
            bArr[i9] = org.bouncycastle.math.ec.WNafUtil.generateWindowNaf(min2, abs2);
            i7++;
            pointMap = pointMap;
            length2 = i10;
            z2 = false;
            z = true;
        }
        return getHighSpeedVideoFpsRanges(zArr, wNafPreCompInfoArr, bArr);
    }

    public static org.bouncycastle.math.ec.ECPoint shamirsTrick(org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger, org.bouncycastle.math.ec.ECPoint eCPoint2, java.math.BigInteger bigInteger2) {
        org.bouncycastle.math.ec.ECPoint importPoint = importPoint(eCPoint.getCurve(), eCPoint2);
        org.bouncycastle.math.ec.ECCurve curve = eCPoint.getCurve();
        org.bouncycastle.math.ec.ECPoint infinity = curve.getInfinity();
        org.bouncycastle.math.ec.ECPoint[] eCPointArr = {importPoint, eCPoint.subtract(importPoint), eCPoint, eCPoint.add(importPoint)};
        curve.normalizeAll(eCPointArr);
        org.bouncycastle.math.ec.ECPoint[] eCPointArr2 = {eCPointArr[3].negate(), eCPointArr[2].negate(), eCPointArr[1].negate(), eCPointArr[0].negate(), infinity, eCPointArr[0], eCPointArr[1], eCPointArr[2], eCPointArr[3]};
        byte[] generateJSF = org.bouncycastle.math.ec.WNafUtil.generateJSF(bigInteger, bigInteger2);
        int length = generateJSF.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            byte b = generateJSF[length];
            infinity = infinity.twicePlus(eCPointArr2[(((b << com.google.common.base.Ascii.CAN) >> 28) * 3) + 4 + ((b << com.google.common.base.Ascii.FS) >> 28)]);
        }
        if (infinity.getHighSpeedVideoSizes(false, false)) {
            return infinity;
        }
        throw new java.lang.IllegalStateException("Invalid result");
    }

    public static org.bouncycastle.math.ec.ECPoint sumOfMultiplies(org.bouncycastle.math.ec.ECPoint[] eCPointArr, java.math.BigInteger[] bigIntegerArr) {
        if (eCPointArr == null || bigIntegerArr == null || eCPointArr.length != bigIntegerArr.length || eCPointArr.length <= 0) {
            throw new java.lang.IllegalArgumentException("point and scalar arrays should be non-null, and of equal, non-zero, length");
        }
        int length = eCPointArr.length;
        if (length == 1) {
            return eCPointArr[0].multiply(bigIntegerArr[0]);
        }
        if (length == 2) {
            return sumOfTwoMultiplies(eCPointArr[0], bigIntegerArr[0], eCPointArr[1], bigIntegerArr[1]);
        }
        org.bouncycastle.math.ec.ECPoint eCPoint = eCPointArr[0];
        org.bouncycastle.math.ec.ECCurve curve = eCPoint.getCurve();
        org.bouncycastle.math.ec.ECPoint[] eCPointArr2 = new org.bouncycastle.math.ec.ECPoint[length];
        eCPointArr2[0] = eCPoint;
        for (int i = 1; i < length; i++) {
            eCPointArr2[i] = importPoint(curve, eCPointArr[i]);
        }
        org.bouncycastle.math.ec.endo.ECEndomorphism endomorphism = curve.getEndomorphism();
        if (endomorphism instanceof org.bouncycastle.math.ec.endo.GLVEndomorphism) {
            org.bouncycastle.math.ec.ECPoint highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(eCPointArr2, bigIntegerArr, (org.bouncycastle.math.ec.endo.GLVEndomorphism) endomorphism);
            if (highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(false, false)) {
                return highResolutionOutputSizeshNQ4ISI;
            }
            throw new java.lang.IllegalStateException("Invalid result");
        }
        org.bouncycastle.math.ec.ECPoint highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(eCPointArr2, bigIntegerArr);
        if (highResolutionOutputSizeshNQ4ISI2.getHighSpeedVideoSizes(false, false)) {
            return highResolutionOutputSizeshNQ4ISI2;
        }
        throw new java.lang.IllegalStateException("Invalid result");
    }

    public static org.bouncycastle.math.ec.ECPoint sumOfTwoMultiplies(org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger, org.bouncycastle.math.ec.ECPoint eCPoint2, java.math.BigInteger bigInteger2) {
        org.bouncycastle.math.ec.ECPoint highResolutionOutputSizeshNQ4ISI;
        org.bouncycastle.math.ec.ECCurve curve = eCPoint.getCurve();
        org.bouncycastle.math.ec.ECPoint importPoint = importPoint(curve, eCPoint2);
        if ((curve instanceof org.bouncycastle.math.ec.ECCurve.AbstractF2m) && ((org.bouncycastle.math.ec.ECCurve.AbstractF2m) curve).isKoblitz()) {
            highResolutionOutputSizeshNQ4ISI = eCPoint.multiply(bigInteger).add(importPoint.multiply(bigInteger2));
        } else {
            org.bouncycastle.math.ec.endo.ECEndomorphism endomorphism = curve.getEndomorphism();
            highResolutionOutputSizeshNQ4ISI = endomorphism instanceof org.bouncycastle.math.ec.endo.GLVEndomorphism ? getHighResolutionOutputSizeshNQ4ISI(new org.bouncycastle.math.ec.ECPoint[]{eCPoint, importPoint}, new java.math.BigInteger[]{bigInteger, bigInteger2}, (org.bouncycastle.math.ec.endo.GLVEndomorphism) endomorphism) : getHighSpeedVideoFpsRanges(eCPoint, bigInteger, importPoint, bigInteger2);
        }
        if (highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(false, false)) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw new java.lang.IllegalStateException("Invalid result");
    }

    public static org.bouncycastle.math.ec.ECPoint validatePoint(org.bouncycastle.math.ec.ECPoint eCPoint) {
        if (eCPoint.isValid()) {
            return eCPoint;
        }
        throw new java.lang.IllegalStateException("Invalid point");
    }

    public static org.bouncycastle.math.ec.ECPoint referenceMultiply(org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger) {
        java.math.BigInteger abs = bigInteger.abs();
        org.bouncycastle.math.ec.ECPoint infinity = eCPoint.getCurve().getInfinity();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                infinity = eCPoint;
            }
            for (int i = 1; i < bitLength; i++) {
                eCPoint = eCPoint.twice();
                if (abs.testBit(i)) {
                    infinity = infinity.add(eCPoint);
                }
            }
        }
        return bigInteger.signum() < 0 ? infinity.negate() : infinity;
    }

    public static void montgomeryTrick(org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr, int i, int i2, org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr2 = new org.bouncycastle.math.ec.ECFieldElement[i2];
        int i3 = 0;
        eCFieldElementArr2[0] = eCFieldElementArr[i];
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2) {
                break;
            }
            eCFieldElementArr2[i4] = eCFieldElementArr2[i3].multiply(eCFieldElementArr[i + i4]);
            i3 = i4;
        }
        if (eCFieldElement != null) {
            eCFieldElementArr2[i3] = eCFieldElementArr2[i3].multiply(eCFieldElement);
        }
        org.bouncycastle.math.ec.ECFieldElement invert = eCFieldElementArr2[i3].invert();
        while (i3 > 0) {
            int i5 = i3 - 1;
            int i6 = i3 + i;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = eCFieldElementArr[i6];
            eCFieldElementArr[i6] = eCFieldElementArr2[i5].multiply(invert);
            invert = invert.multiply(eCFieldElement2);
            i3 = i5;
        }
        eCFieldElementArr[i] = invert;
    }

    public static void montgomeryTrick(org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr, int i, int i2) {
        montgomeryTrick(eCFieldElementArr, i, i2, null);
    }

    public static boolean isFpField(org.bouncycastle.math.field.FiniteField finiteField) {
        return finiteField.getDimension() == 1;
    }

    public static boolean isFpCurve(org.bouncycastle.math.ec.ECCurve eCCurve) {
        return isFpField(eCCurve.getField());
    }

    public static boolean isF2mField(org.bouncycastle.math.field.FiniteField finiteField) {
        return finiteField.getDimension() > 1 && finiteField.getCharacteristic().equals(org.bouncycastle.math.ec.ECConstants.TWO) && (finiteField instanceof org.bouncycastle.math.field.PolynomialExtensionField);
    }

    public static boolean isF2mCurve(org.bouncycastle.math.ec.ECCurve eCCurve) {
        return isF2mField(eCCurve.getField());
    }

    public static org.bouncycastle.math.ec.ECPoint importPoint(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint) {
        if (eCCurve.equals(eCPoint.getCurve())) {
            return eCCurve.importPoint(eCPoint);
        }
        throw new java.lang.IllegalArgumentException("Point must be on the same curve");
    }

    private static org.bouncycastle.math.ec.ECPoint getHighSpeedVideoFpsRanges(boolean[] zArr, org.bouncycastle.math.ec.WNafPreCompInfo[] wNafPreCompInfoArr, byte[][] bArr) {
        int length = bArr.length;
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i = java.lang.Math.max(i, bArr2.length);
        }
        org.bouncycastle.math.ec.ECPoint infinity = wNafPreCompInfoArr[0].getPreComp()[0].getCurve().getInfinity();
        int i2 = i - 1;
        int i3 = 0;
        org.bouncycastle.math.ec.ECPoint eCPoint = infinity;
        while (i2 >= 0) {
            org.bouncycastle.math.ec.ECPoint eCPoint2 = infinity;
            for (int i4 = 0; i4 < length; i4++) {
                byte[] bArr3 = bArr[i4];
                byte b = i2 < bArr3.length ? bArr3[i2] : (byte) 0;
                if (b != 0) {
                    int abs = java.lang.Math.abs((int) b);
                    org.bouncycastle.math.ec.WNafPreCompInfo wNafPreCompInfo = wNafPreCompInfoArr[i4];
                    eCPoint2 = eCPoint2.add(((b < 0) == zArr[i4] ? wNafPreCompInfo.getPreComp() : wNafPreCompInfo.getPreCompNeg())[abs >>> 1]);
                }
            }
            if (eCPoint2 == infinity) {
                i3++;
            } else {
                if (i3 > 0) {
                    eCPoint = eCPoint.timesPow2(i3);
                    i3 = 0;
                }
                eCPoint = eCPoint.twicePlus(eCPoint2);
            }
            i2--;
        }
        return i3 > 0 ? eCPoint.timesPow2(i3) : eCPoint;
    }

    private static org.bouncycastle.math.ec.ECPoint getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.math.ec.ECPoint[] eCPointArr, java.math.BigInteger[] bigIntegerArr) {
        int length = eCPointArr.length;
        boolean[] zArr = new boolean[length];
        org.bouncycastle.math.ec.WNafPreCompInfo[] wNafPreCompInfoArr = new org.bouncycastle.math.ec.WNafPreCompInfo[length];
        byte[][] bArr = new byte[length][];
        for (int i = 0; i < length; i++) {
            java.math.BigInteger bigInteger = bigIntegerArr[i];
            zArr[i] = bigInteger.signum() < 0;
            java.math.BigInteger abs = bigInteger.abs();
            org.bouncycastle.math.ec.WNafPreCompInfo precompute = org.bouncycastle.math.ec.WNafUtil.precompute(eCPointArr[i], org.bouncycastle.math.ec.WNafUtil.getWindowSize(abs.bitLength(), 8), true);
            int min = java.lang.Math.min(8, precompute.getWidth());
            wNafPreCompInfoArr[i] = precompute;
            bArr[i] = org.bouncycastle.math.ec.WNafUtil.generateWindowNaf(min, abs);
        }
        return getHighSpeedVideoFpsRanges(zArr, wNafPreCompInfoArr, bArr);
    }

    private static org.bouncycastle.math.ec.ECPoint getHighSpeedVideoSizes(org.bouncycastle.math.ec.ECPoint[] eCPointArr, org.bouncycastle.math.ec.ECPoint[] eCPointArr2, byte[] bArr, org.bouncycastle.math.ec.ECPoint[] eCPointArr3, org.bouncycastle.math.ec.ECPoint[] eCPointArr4, byte[] bArr2) {
        org.bouncycastle.math.ec.ECPoint eCPoint;
        int max = java.lang.Math.max(bArr.length, bArr2.length);
        org.bouncycastle.math.ec.ECPoint infinity = eCPointArr[0].getCurve().getInfinity();
        int i = max - 1;
        int i2 = 0;
        org.bouncycastle.math.ec.ECPoint eCPoint2 = infinity;
        while (i >= 0) {
            byte b = i < bArr.length ? bArr[i] : (byte) 0;
            byte b2 = i < bArr2.length ? bArr2[i] : (byte) 0;
            if ((b | b2) == 0) {
                i2++;
            } else {
                if (b != 0) {
                    eCPoint = infinity.add((b < 0 ? eCPointArr2 : eCPointArr)[java.lang.Math.abs((int) b) >>> 1]);
                } else {
                    eCPoint = infinity;
                }
                if (b2 != 0) {
                    eCPoint = eCPoint.add((b2 < 0 ? eCPointArr4 : eCPointArr3)[java.lang.Math.abs((int) b2) >>> 1]);
                }
                if (i2 > 0) {
                    eCPoint2 = eCPoint2.timesPow2(i2);
                    i2 = 0;
                }
                eCPoint2 = eCPoint2.twicePlus(eCPoint);
            }
            i--;
        }
        return i2 > 0 ? eCPoint2.timesPow2(i2) : eCPoint2;
    }

    static org.bouncycastle.math.ec.ECPoint getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.math.ec.endo.ECEndomorphism eCEndomorphism, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        boolean z = bigInteger.signum() < 0;
        boolean z2 = bigInteger2.signum() < 0;
        java.math.BigInteger abs = bigInteger.abs();
        java.math.BigInteger abs2 = bigInteger2.abs();
        org.bouncycastle.math.ec.WNafPreCompInfo precompute = org.bouncycastle.math.ec.WNafUtil.precompute(eCPoint, org.bouncycastle.math.ec.WNafUtil.getWindowSize(java.lang.Math.max(abs.bitLength(), abs2.bitLength()), 8), true);
        org.bouncycastle.math.ec.WNafPreCompInfo precomputeWithPointMap = org.bouncycastle.math.ec.WNafUtil.precomputeWithPointMap(org.bouncycastle.math.ec.endo.EndoUtil.mapPoint(eCEndomorphism, eCPoint), eCEndomorphism.getPointMap(), precompute, true);
        int min = java.lang.Math.min(8, precompute.getWidth());
        int min2 = java.lang.Math.min(8, precomputeWithPointMap.getWidth());
        return getHighSpeedVideoSizes(z ? precompute.getPreCompNeg() : precompute.getPreComp(), z ? precompute.getPreComp() : precompute.getPreCompNeg(), org.bouncycastle.math.ec.WNafUtil.generateWindowNaf(min, abs), z2 ? precomputeWithPointMap.getPreCompNeg() : precomputeWithPointMap.getPreComp(), z2 ? precomputeWithPointMap.getPreComp() : precomputeWithPointMap.getPreCompNeg(), org.bouncycastle.math.ec.WNafUtil.generateWindowNaf(min2, abs2));
    }

    public static org.bouncycastle.math.ec.ECPoint cleanPoint(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint) {
        if (eCCurve.equals(eCPoint.getCurve())) {
            return eCCurve.decodePoint(eCPoint.getEncoded(false));
        }
        throw new java.lang.IllegalArgumentException("Point must be on the same curve");
    }
}
