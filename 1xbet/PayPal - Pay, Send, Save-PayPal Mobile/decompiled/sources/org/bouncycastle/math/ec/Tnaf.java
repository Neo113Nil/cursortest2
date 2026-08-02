package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
class Tnaf {
    public static final org.bouncycastle.math.ec.ZTauElement[] Camera2StreamConfigurationMap;
    public static final byte[][] getHighResolutionOutputSizeshNQ4ISI;
    public static final byte[][] getHighSpeedVideoFpsRanges;
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    public static final org.bouncycastle.math.ec.ZTauElement[] getHighSpeedVideoSizes;
    private static final java.math.BigInteger getHighSpeedVideoSizesFor;
    private static final java.math.BigInteger getInputFormats;

    public static byte getHighSpeedVideoFpsRanges(int i) {
        return (byte) (i == 0 ? -1 : 1);
    }

    public static org.bouncycastle.math.ec.ECPoint.AbstractF2m[] getHighSpeedVideoSizes(org.bouncycastle.math.ec.ECPoint.AbstractF2m abstractF2m, byte b) {
        byte[][] bArr = b == 0 ? getHighResolutionOutputSizeshNQ4ISI : getHighSpeedVideoFpsRanges;
        org.bouncycastle.math.ec.ECPoint.AbstractF2m[] abstractF2mArr = new org.bouncycastle.math.ec.ECPoint.AbstractF2m[(bArr.length + 1) >>> 1];
        abstractF2mArr[0] = abstractF2m;
        int length = bArr.length;
        for (int i = 3; i < length; i += 2) {
            int i2 = i >>> 1;
            byte[] bArr2 = bArr[i];
            org.bouncycastle.math.ec.ECPoint.AbstractF2m abstractF2m2 = (org.bouncycastle.math.ec.ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
            org.bouncycastle.math.ec.ECPoint.AbstractF2m abstractF2m3 = (org.bouncycastle.math.ec.ECPoint.AbstractF2m) abstractF2m.negate();
            int i3 = 0;
            for (int length2 = bArr2.length - 1; length2 >= 0; length2--) {
                i3++;
                byte b2 = bArr2[length2];
                if (b2 != 0) {
                    abstractF2m2 = (org.bouncycastle.math.ec.ECPoint.AbstractF2m) abstractF2m2.tauPow(i3).add(b2 > 0 ? abstractF2m : abstractF2m3);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                abstractF2m2 = abstractF2m2.tauPow(i3);
            }
            abstractF2mArr[i2] = abstractF2m2;
        }
        abstractF2m.getCurve().normalizeAll(abstractF2mArr);
        return abstractF2mArr;
    }

    public static java.math.BigInteger[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.math.ec.ECCurve.AbstractF2m abstractF2m) {
        int i;
        if (!abstractF2m.isKoblitz()) {
            throw new java.lang.IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int fieldSize = abstractF2m.getFieldSize();
        int intValue = abstractF2m.getA().toBigInteger().intValue();
        byte b = (byte) (intValue == 0 ? -1 : 1);
        java.math.BigInteger cofactor = abstractF2m.getCofactor();
        if (cofactor != null) {
            if (cofactor.equals(org.bouncycastle.math.ec.ECConstants.TWO)) {
                i = 1;
            } else if (cofactor.equals(org.bouncycastle.math.ec.ECConstants.FOUR)) {
                i = 2;
            }
            java.math.BigInteger[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(b, (fieldSize + 3) - intValue, false);
            if (b == 1) {
                Camera2StreamConfigurationMap2[0] = Camera2StreamConfigurationMap2[0].negate();
                Camera2StreamConfigurationMap2[1] = Camera2StreamConfigurationMap2[1].negate();
            }
            return new java.math.BigInteger[]{org.bouncycastle.math.ec.ECConstants.ONE.add(Camera2StreamConfigurationMap2[1]).shiftRight(i), org.bouncycastle.math.ec.ECConstants.ONE.add(Camera2StreamConfigurationMap2[0]).shiftRight(i).negate()};
        }
        throw new java.lang.IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x011b, code lost:
    
        if (r7.getHighSpeedVideoSizes.compareTo(org.bouncycastle.math.ec.ECConstants.ONE.shiftLeft(r7.getHighResolutionOutputSizeshNQ4ISI)) >= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012c, code lost:
    
        if (r5.getHighSpeedVideoSizes.compareTo(org.bouncycastle.math.ec.Tnaf.getInputFormats.shiftLeft(r5.getHighResolutionOutputSizeshNQ4ISI)) < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.bouncycastle.math.ec.ZTauElement getHighResolutionOutputSizeshNQ4ISI(java.math.BigInteger bigInteger, int i, byte b, java.math.BigInteger[] bigIntegerArr, byte b2) {
        org.bouncycastle.math.ec.SimpleBigDecimal Camera2StreamConfigurationMap2;
        org.bouncycastle.math.ec.SimpleBigDecimal Camera2StreamConfigurationMap3;
        int i2;
        byte b3;
        java.math.BigInteger add = b2 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        java.math.BigInteger bigInteger2 = Camera2StreamConfigurationMap(b2, i, true)[1];
        org.bouncycastle.math.ec.SimpleBigDecimal highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bigInteger, bigIntegerArr[0], bigInteger2, b, i, 10);
        org.bouncycastle.math.ec.SimpleBigDecimal highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(bigInteger, bigIntegerArr[1], bigInteger2, b, i, 10);
        if (highResolutionOutputSizeshNQ4ISI2.getHighResolutionOutputSizeshNQ4ISI != highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        int i3 = -1;
        if (b2 != 1 && b2 != -1) {
            throw new java.lang.IllegalArgumentException("mu must be 1 or -1");
        }
        java.math.BigInteger Camera2StreamConfigurationMap4 = highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
        java.math.BigInteger Camera2StreamConfigurationMap5 = highResolutionOutputSizeshNQ4ISI2.Camera2StreamConfigurationMap();
        org.bouncycastle.math.ec.SimpleBigDecimal simpleBigDecimal = new org.bouncycastle.math.ec.SimpleBigDecimal(highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes.subtract(Camera2StreamConfigurationMap4.shiftLeft(highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI)), highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.math.ec.SimpleBigDecimal simpleBigDecimal2 = new org.bouncycastle.math.ec.SimpleBigDecimal(highResolutionOutputSizeshNQ4ISI2.getHighSpeedVideoSizes.subtract(Camera2StreamConfigurationMap5.shiftLeft(highResolutionOutputSizeshNQ4ISI2.getHighResolutionOutputSizeshNQ4ISI)), highResolutionOutputSizeshNQ4ISI2.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.math.ec.SimpleBigDecimal Camera2StreamConfigurationMap6 = simpleBigDecimal.Camera2StreamConfigurationMap(simpleBigDecimal);
        org.bouncycastle.math.ec.SimpleBigDecimal Camera2StreamConfigurationMap7 = b2 == 1 ? Camera2StreamConfigurationMap6.Camera2StreamConfigurationMap(simpleBigDecimal2) : Camera2StreamConfigurationMap6.Camera2StreamConfigurationMap(new org.bouncycastle.math.ec.SimpleBigDecimal(simpleBigDecimal2.getHighSpeedVideoSizes.negate(), simpleBigDecimal2.getHighResolutionOutputSizeshNQ4ISI));
        org.bouncycastle.math.ec.SimpleBigDecimal Camera2StreamConfigurationMap8 = simpleBigDecimal2.Camera2StreamConfigurationMap(simpleBigDecimal2).Camera2StreamConfigurationMap(simpleBigDecimal2);
        org.bouncycastle.math.ec.SimpleBigDecimal Camera2StreamConfigurationMap9 = Camera2StreamConfigurationMap8.Camera2StreamConfigurationMap(simpleBigDecimal2);
        if (b2 == 1) {
            Camera2StreamConfigurationMap2 = simpleBigDecimal.Camera2StreamConfigurationMap(new org.bouncycastle.math.ec.SimpleBigDecimal(Camera2StreamConfigurationMap8.getHighSpeedVideoSizes.negate(), Camera2StreamConfigurationMap8.getHighResolutionOutputSizeshNQ4ISI));
            Camera2StreamConfigurationMap3 = simpleBigDecimal.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap9);
        } else {
            Camera2StreamConfigurationMap2 = simpleBigDecimal.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap8);
            Camera2StreamConfigurationMap3 = simpleBigDecimal.Camera2StreamConfigurationMap(new org.bouncycastle.math.ec.SimpleBigDecimal(Camera2StreamConfigurationMap9.getHighSpeedVideoSizes.negate(), Camera2StreamConfigurationMap9.getHighResolutionOutputSizeshNQ4ISI));
        }
        if (Camera2StreamConfigurationMap7.getHighSpeedVideoSizes.compareTo(org.bouncycastle.math.ec.ECConstants.ONE.shiftLeft(Camera2StreamConfigurationMap7.getHighResolutionOutputSizeshNQ4ISI)) >= 0) {
            if (Camera2StreamConfigurationMap2.getHighSpeedVideoSizes.compareTo(getHighSpeedVideoFpsRangesFor.shiftLeft(Camera2StreamConfigurationMap2.getHighResolutionOutputSizeshNQ4ISI)) >= 0) {
                b3 = 0;
                i2 = 1;
            }
            b3 = b2;
            i2 = 0;
        } else {
            if (Camera2StreamConfigurationMap3.getHighSpeedVideoSizes.compareTo(org.bouncycastle.math.ec.ECConstants.TWO.shiftLeft(Camera2StreamConfigurationMap3.getHighResolutionOutputSizeshNQ4ISI)) < 0) {
                i2 = 0;
                b3 = 0;
            }
            b3 = b2;
            i2 = 0;
        }
        if (Camera2StreamConfigurationMap7.getHighSpeedVideoSizes.compareTo(getHighSpeedVideoFpsRangesFor.shiftLeft(Camera2StreamConfigurationMap7.getHighResolutionOutputSizeshNQ4ISI)) < 0) {
        }
        b3 = (byte) (-b2);
        i3 = i2;
        org.bouncycastle.math.ec.ZTauElement zTauElement = new org.bouncycastle.math.ec.ZTauElement(Camera2StreamConfigurationMap4.add(java.math.BigInteger.valueOf(i3)), Camera2StreamConfigurationMap5.add(java.math.BigInteger.valueOf(b3)));
        return new org.bouncycastle.math.ec.ZTauElement(bigInteger.subtract(add.multiply(zTauElement.getHighSpeedVideoSizes)).subtract(java.math.BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(zTauElement.getHighSpeedVideoFpsRanges)), bigIntegerArr[1].multiply(zTauElement.getHighSpeedVideoSizes).subtract(bigIntegerArr[0].multiply(zTauElement.getHighSpeedVideoFpsRanges)));
    }

    public static byte[] Camera2StreamConfigurationMap(byte b, org.bouncycastle.math.ec.ZTauElement zTauElement, byte b2, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, org.bouncycastle.math.ec.ZTauElement[] zTauElementArr) {
        java.math.BigInteger subtract;
        boolean z;
        if (b != 1 && b != -1) {
            throw new java.lang.IllegalArgumentException("mu must be 1 or -1");
        }
        java.math.BigInteger multiply = zTauElement.getHighSpeedVideoSizes.multiply(zTauElement.getHighSpeedVideoSizes);
        java.math.BigInteger multiply2 = zTauElement.getHighSpeedVideoSizes.multiply(zTauElement.getHighSpeedVideoFpsRanges);
        java.math.BigInteger shiftLeft = zTauElement.getHighSpeedVideoFpsRanges.multiply(zTauElement.getHighSpeedVideoFpsRanges).shiftLeft(1);
        if (b == 1) {
            subtract = multiply.add(multiply2);
        } else {
            if (b != -1) {
                throw new java.lang.IllegalArgumentException("mu must be 1 or -1");
            }
            subtract = multiply.subtract(multiply2);
        }
        int bitLength = subtract.add(shiftLeft).bitLength();
        byte[] bArr = new byte[bitLength > 30 ? bitLength + 8 : b2 + 34];
        java.math.BigInteger shiftRight = bigInteger.shiftRight(1);
        java.math.BigInteger bigInteger3 = zTauElement.getHighSpeedVideoSizes;
        java.math.BigInteger bigInteger4 = zTauElement.getHighSpeedVideoFpsRanges;
        int i = 0;
        while (true) {
            if (bigInteger3.equals(org.bouncycastle.math.ec.ECConstants.ZERO) && bigInteger4.equals(org.bouncycastle.math.ec.ECConstants.ZERO)) {
                return bArr;
            }
            if (bigInteger3.testBit(0)) {
                java.math.BigInteger mod = bigInteger3.add(bigInteger4.multiply(bigInteger2)).mod(bigInteger);
                if (mod.compareTo(shiftRight) >= 0) {
                    mod = mod.subtract(bigInteger);
                }
                byte intValue = (byte) mod.intValue();
                bArr[i] = intValue;
                if (intValue < 0) {
                    intValue = (byte) (-intValue);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    bigInteger3 = bigInteger3.subtract(zTauElementArr[intValue].getHighSpeedVideoSizes);
                    bigInteger4 = bigInteger4.subtract(zTauElementArr[intValue].getHighSpeedVideoFpsRanges);
                } else {
                    bigInteger3 = bigInteger3.add(zTauElementArr[intValue].getHighSpeedVideoSizes);
                    bigInteger4 = bigInteger4.add(zTauElementArr[intValue].getHighSpeedVideoFpsRanges);
                }
            } else {
                bArr[i] = 0;
            }
            java.math.BigInteger shiftRight2 = bigInteger3.shiftRight(1);
            java.math.BigInteger add = b == 1 ? bigInteger4.add(shiftRight2) : bigInteger4.subtract(shiftRight2);
            java.math.BigInteger negate = bigInteger3.shiftRight(1).negate();
            i++;
            bigInteger3 = add;
            bigInteger4 = negate;
        }
    }

    public static java.math.BigInteger Camera2StreamConfigurationMap(byte b) {
        return java.math.BigInteger.valueOf(b == 1 ? 6L : 10L);
    }

    private static java.math.BigInteger[] Camera2StreamConfigurationMap(byte b, int i, boolean z) {
        java.math.BigInteger bigInteger;
        java.math.BigInteger bigInteger2;
        if (b != 1 && b != -1) {
            throw new java.lang.IllegalArgumentException("mu must be 1 or -1");
        }
        if (z) {
            bigInteger = org.bouncycastle.math.ec.ECConstants.TWO;
            bigInteger2 = java.math.BigInteger.valueOf(b);
        } else {
            bigInteger = org.bouncycastle.math.ec.ECConstants.ZERO;
            bigInteger2 = org.bouncycastle.math.ec.ECConstants.ONE;
        }
        int i2 = 1;
        while (i2 < i) {
            i2++;
            java.math.BigInteger bigInteger3 = bigInteger2;
            bigInteger2 = (b == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger3;
        }
        return new java.math.BigInteger[]{bigInteger, bigInteger2};
    }

    private static org.bouncycastle.math.ec.SimpleBigDecimal getHighResolutionOutputSizeshNQ4ISI(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, byte b, int i, int i2) {
        int i3 = (i + 5) / 2;
        java.math.BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i - (i3 + 10)) - 2) + b));
        java.math.BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i)));
        java.math.BigInteger shiftRight = add.shiftRight(i3);
        if (add.testBit(i3 - 1)) {
            shiftRight = shiftRight.add(org.bouncycastle.math.ec.ECConstants.ONE);
        }
        return new org.bouncycastle.math.ec.SimpleBigDecimal(shiftRight, 10);
    }

    Tnaf() {
    }

    static {
        java.math.BigInteger negate = org.bouncycastle.math.ec.ECConstants.ONE.negate();
        getHighSpeedVideoFpsRangesFor = negate;
        getInputFormats = org.bouncycastle.math.ec.ECConstants.TWO.negate();
        java.math.BigInteger negate2 = org.bouncycastle.math.ec.ECConstants.THREE.negate();
        getHighSpeedVideoSizesFor = negate2;
        Camera2StreamConfigurationMap = new org.bouncycastle.math.ec.ZTauElement[]{null, new org.bouncycastle.math.ec.ZTauElement(org.bouncycastle.math.ec.ECConstants.ONE, org.bouncycastle.math.ec.ECConstants.ZERO), null, new org.bouncycastle.math.ec.ZTauElement(negate2, negate), null, new org.bouncycastle.math.ec.ZTauElement(negate, negate), null, new org.bouncycastle.math.ec.ZTauElement(org.bouncycastle.math.ec.ECConstants.ONE, negate), null};
        getHighResolutionOutputSizeshNQ4ISI = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        org.bouncycastle.math.ec.ZTauElement zTauElement = new org.bouncycastle.math.ec.ZTauElement(org.bouncycastle.math.ec.ECConstants.ONE, org.bouncycastle.math.ec.ECConstants.ZERO);
        org.bouncycastle.math.ec.ZTauElement zTauElement2 = new org.bouncycastle.math.ec.ZTauElement(negate2, org.bouncycastle.math.ec.ECConstants.ONE);
        org.bouncycastle.math.ec.ZTauElement zTauElement3 = new org.bouncycastle.math.ec.ZTauElement(negate, org.bouncycastle.math.ec.ECConstants.ONE);
        java.math.BigInteger bigInteger = org.bouncycastle.math.ec.ECConstants.ONE;
        getHighSpeedVideoSizes = new org.bouncycastle.math.ec.ZTauElement[]{null, zTauElement, null, zTauElement2, null, zTauElement3, null, new org.bouncycastle.math.ec.ZTauElement(bigInteger, bigInteger), null};
        getHighSpeedVideoFpsRanges = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }
}
