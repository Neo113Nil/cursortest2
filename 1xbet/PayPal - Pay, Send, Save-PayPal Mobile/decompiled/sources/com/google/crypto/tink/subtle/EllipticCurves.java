package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
public final class EllipticCurves {

    public enum CurveType {
        NIST_P256,
        NIST_P384,
        NIST_P521
    }

    public enum EcdsaEncoding {
        IEEE_P1363,
        DER
    }

    public enum PointFormatType {
        UNCOMPRESSED,
        COMPRESSED,
        DO_NOT_USE_CRUNCHY_UNCOMPRESSED
    }

    public static java.security.spec.ECParameterSpec getNistP256Params() {
        return com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P256_PARAMS;
    }

    public static java.security.spec.ECParameterSpec getNistP384Params() {
        return com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P384_PARAMS;
    }

    public static java.security.spec.ECParameterSpec getNistP521Params() {
        return com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P521_PARAMS;
    }

    static void checkPublicKey(java.security.interfaces.ECPublicKey eCPublicKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    public static boolean isNistEcParameterSpec(java.security.spec.ECParameterSpec eCParameterSpec) {
        return com.google.crypto.tink.internal.EllipticCurvesUtil.isNistEcParameterSpec(eCParameterSpec);
    }

    public static boolean isSameEcParameterSpec(java.security.spec.ECParameterSpec eCParameterSpec, java.security.spec.ECParameterSpec eCParameterSpec2) {
        return com.google.crypto.tink.internal.EllipticCurvesUtil.isSameEcParameterSpec(eCParameterSpec, eCParameterSpec2);
    }

    public static void validatePublicKey(java.security.interfaces.ECPublicKey eCPublicKey, java.security.interfaces.ECPrivateKey eCPrivateKey) throws java.security.GeneralSecurityException {
        validatePublicKeySpec(eCPublicKey, eCPrivateKey);
        com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    static void validatePublicKeySpec(java.security.interfaces.ECPublicKey eCPublicKey, java.security.interfaces.ECPrivateKey eCPrivateKey) throws java.security.GeneralSecurityException {
        try {
            if (isSameEcParameterSpec(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
            } else {
                throw new java.security.GeneralSecurityException("invalid public key spec");
            }
        } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException e) {
            throw new java.security.GeneralSecurityException(e);
        }
    }

    public static java.math.BigInteger getModulus(java.security.spec.EllipticCurve ellipticCurve) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.EllipticCurvesUtil.getModulus(ellipticCurve);
    }

    public static int fieldSizeInBits(java.security.spec.EllipticCurve ellipticCurve) throws java.security.GeneralSecurityException {
        return getModulus(ellipticCurve).subtract(java.math.BigInteger.ONE).bitLength();
    }

    public static int fieldSizeInBytes(java.security.spec.EllipticCurve ellipticCurve) throws java.security.GeneralSecurityException {
        return (fieldSizeInBits(ellipticCurve) + 7) / 8;
    }

    private static java.math.BigInteger modSqrt(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) throws java.security.GeneralSecurityException {
        java.math.BigInteger bigInteger3;
        if (bigInteger2.signum() != 1) {
            throw new java.security.InvalidAlgorithmParameterException("p must be positive");
        }
        java.math.BigInteger mod = bigInteger.mod(bigInteger2);
        if (mod.equals(java.math.BigInteger.ZERO)) {
            return java.math.BigInteger.ZERO;
        }
        int i = 0;
        if (bigInteger2.testBit(0) && bigInteger2.testBit(1)) {
            bigInteger3 = mod.modPow(bigInteger2.add(java.math.BigInteger.ONE).shiftRight(2), bigInteger2);
        } else if (!bigInteger2.testBit(0) || bigInteger2.testBit(1)) {
            bigInteger3 = null;
        } else {
            java.math.BigInteger bigInteger4 = java.math.BigInteger.ONE;
            java.math.BigInteger shiftRight = bigInteger2.subtract(java.math.BigInteger.ONE).shiftRight(1);
            while (true) {
                java.math.BigInteger mod2 = bigInteger4.multiply(bigInteger4).subtract(mod).mod(bigInteger2);
                if (mod2.equals(java.math.BigInteger.ZERO)) {
                    return bigInteger4;
                }
                java.math.BigInteger modPow = mod2.modPow(shiftRight, bigInteger2);
                if (!modPow.add(java.math.BigInteger.ONE).equals(bigInteger2)) {
                    if (!modPow.equals(java.math.BigInteger.ONE)) {
                        throw new java.security.InvalidAlgorithmParameterException("p is not prime");
                    }
                    bigInteger4 = bigInteger4.add(java.math.BigInteger.ONE);
                    i++;
                    if (i == 128 && !bigInteger2.isProbablePrime(80)) {
                        throw new java.security.InvalidAlgorithmParameterException("p is not prime");
                    }
                } else {
                    java.math.BigInteger shiftRight2 = bigInteger2.add(java.math.BigInteger.ONE).shiftRight(1);
                    java.math.BigInteger bigInteger5 = java.math.BigInteger.ONE;
                    java.math.BigInteger bigInteger6 = bigInteger5;
                    java.math.BigInteger bigInteger7 = bigInteger4;
                    for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                        java.math.BigInteger multiply = bigInteger7.multiply(bigInteger6);
                        bigInteger7 = bigInteger7.multiply(bigInteger7).add(bigInteger6.multiply(bigInteger6).mod(bigInteger2).multiply(mod2)).mod(bigInteger2);
                        bigInteger6 = multiply.add(multiply).mod(bigInteger2);
                        if (shiftRight2.testBit(bitLength)) {
                            java.math.BigInteger mod3 = bigInteger7.multiply(bigInteger4).add(bigInteger6.multiply(mod2)).mod(bigInteger2);
                            bigInteger6 = bigInteger4.multiply(bigInteger6).add(bigInteger7).mod(bigInteger2);
                            bigInteger7 = mod3;
                        }
                    }
                    bigInteger3 = bigInteger7;
                }
            }
        }
        if (bigInteger3 == null || bigInteger3.multiply(bigInteger3).mod(bigInteger2).compareTo(mod) == 0) {
            return bigInteger3;
        }
        throw new java.security.GeneralSecurityException("Could not find a modular square root");
    }

    private static java.math.BigInteger computeY(java.math.BigInteger bigInteger, boolean z, java.security.spec.EllipticCurve ellipticCurve) throws java.security.GeneralSecurityException {
        java.math.BigInteger modulus = getModulus(ellipticCurve);
        java.math.BigInteger modSqrt = modSqrt(bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(modulus), modulus);
        return z != modSqrt.testBit(0) ? modulus.subtract(modSqrt).mod(modulus) : modSqrt;
    }

    @java.lang.Deprecated
    public static java.math.BigInteger getY(java.math.BigInteger bigInteger, boolean z, java.security.spec.EllipticCurve ellipticCurve) throws java.security.GeneralSecurityException {
        return computeY(bigInteger, z, ellipticCurve);
    }

    private static byte[] toMinimalSignedNumber(byte[] bArr) {
        int i = 0;
        while (i < bArr.length && bArr[i] == 0) {
            i++;
        }
        if (i == bArr.length) {
            i = bArr.length - 1;
        }
        int i2 = (bArr[i] & 128) == 128 ? 1 : 0;
        byte[] bArr2 = new byte[(bArr.length - i) + i2];
        java.lang.System.arraycopy(bArr, i, bArr2, i2, bArr.length - i);
        return bArr2;
    }

    public static byte[] ecdsaIeee2Der(byte[] bArr) throws java.security.GeneralSecurityException {
        byte[] bArr2;
        int i;
        if (bArr.length % 2 != 0 || bArr.length == 0 || bArr.length > 132) {
            throw new java.security.GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        byte[] minimalSignedNumber = toMinimalSignedNumber(java.util.Arrays.copyOf(bArr, bArr.length / 2));
        byte[] minimalSignedNumber2 = toMinimalSignedNumber(java.util.Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length));
        int length = minimalSignedNumber.length + 4 + minimalSignedNumber2.length;
        if (length >= 128) {
            bArr2 = new byte[length + 3];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) length;
            i = 3;
        } else {
            bArr2 = new byte[length + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) length;
            i = 2;
        }
        bArr2[i] = 2;
        int i2 = i + 2;
        bArr2[i + 1] = (byte) minimalSignedNumber.length;
        java.lang.System.arraycopy(minimalSignedNumber, 0, bArr2, i2, minimalSignedNumber.length);
        int length2 = i2 + minimalSignedNumber.length;
        bArr2[length2] = 2;
        bArr2[length2 + 1] = (byte) minimalSignedNumber2.length;
        java.lang.System.arraycopy(minimalSignedNumber2, 0, bArr2, length2 + 2, minimalSignedNumber2.length);
        return bArr2;
    }

    public static byte[] ecdsaDer2Ieee(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        if (!isValidDerEncoding(bArr)) {
            throw new java.security.GeneralSecurityException("Invalid DER encoding");
        }
        byte[] bArr2 = new byte[i];
        int i2 = (bArr[1] & 255) >= 128 ? 3 : 2;
        int i3 = i2 + 2;
        int i4 = bArr[i2 + 1];
        int i5 = bArr[i3] == 0 ? 1 : 0;
        java.lang.System.arraycopy(bArr, i3 + i5, bArr2, ((i / 2) - i4) + i5, i4 - i5);
        int i6 = i3 + i4 + 1;
        int i7 = i6 + 1;
        int i8 = bArr[i6];
        int i9 = bArr[i7] != 0 ? 0 : 1;
        java.lang.System.arraycopy(bArr, i7 + i9, bArr2, (i - i8) + i9, i8 - i9);
        return bArr2;
    }

    public static boolean isValidDerEncoding(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (bArr.length < 8 || bArr[0] != 48) {
            return false;
        }
        int i6 = bArr[1] & 255;
        if (i6 == 129) {
            i6 = bArr[2] & 255;
            if (i6 < 128) {
                return false;
            }
            i = 2;
        } else {
            if (i6 == 128 || i6 > 129) {
                return false;
            }
            i = 1;
        }
        if (i6 != (bArr.length - 1) - i || bArr[i + 1] != 2 || (i5 = (i4 = (i3 = i + 3) + (i2 = bArr[i + 2] & 255)) + 1) >= bArr.length || i2 == 0) {
            return false;
        }
        byte b = bArr[i3];
        if ((b & 255) >= 128) {
            return false;
        }
        if ((i2 > 1 && b == 0 && (bArr[i + 4] & 255) < 128) || bArr[i4] != 2) {
            return false;
        }
        int i7 = bArr[i5] & 255;
        if (i4 + 2 + i7 != bArr.length || i7 == 0) {
            return false;
        }
        byte b2 = bArr[i + 5 + i2];
        if ((b2 & 255) >= 128) {
            return false;
        }
        return i7 <= 1 || b2 != 0 || (bArr[(i + 6) + i2] & 255) >= 128;
    }

    public static int encodingSizeInBytes(java.security.spec.EllipticCurve ellipticCurve, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType pointFormatType) throws java.security.GeneralSecurityException {
        int fieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[pointFormatType.ordinal()];
        if (i == 1) {
            return (fieldSizeInBytes * 2) + 1;
        }
        if (i == 2) {
            return fieldSizeInBytes * 2;
        }
        if (i == 3) {
            return fieldSizeInBytes + 1;
        }
        throw new java.security.GeneralSecurityException("unknown EC point format");
    }

    public static java.security.spec.ECPoint ecPointDecode(java.security.spec.EllipticCurve ellipticCurve, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType pointFormatType, byte[] bArr) throws java.security.GeneralSecurityException {
        return pointDecode(ellipticCurve, pointFormatType, bArr);
    }

    public static java.security.spec.ECPoint pointDecode(com.google.crypto.tink.subtle.EllipticCurves.CurveType curveType, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType pointFormatType, byte[] bArr) throws java.security.GeneralSecurityException {
        return pointDecode(getCurveSpec(curveType).getCurve(), pointFormatType, bArr);
    }

    public static java.security.spec.ECPoint pointDecode(java.security.spec.EllipticCurve ellipticCurve, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType pointFormatType, byte[] bArr) throws java.security.GeneralSecurityException {
        int fieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[pointFormatType.ordinal()];
        boolean z = false;
        if (i == 1) {
            if (bArr.length != (fieldSizeInBytes * 2) + 1) {
                throw new java.security.GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new java.security.GeneralSecurityException("invalid point format");
            }
            int i2 = fieldSizeInBytes + 1;
            java.security.spec.ECPoint eCPoint = new java.security.spec.ECPoint(new java.math.BigInteger(1, java.util.Arrays.copyOfRange(bArr, 1, i2)), new java.math.BigInteger(1, java.util.Arrays.copyOfRange(bArr, i2, bArr.length)));
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (i == 2) {
            if (bArr.length != fieldSizeInBytes * 2) {
                throw new java.security.GeneralSecurityException("invalid point size");
            }
            java.security.spec.ECPoint eCPoint2 = new java.security.spec.ECPoint(new java.math.BigInteger(1, java.util.Arrays.copyOf(bArr, fieldSizeInBytes)), new java.math.BigInteger(1, java.util.Arrays.copyOfRange(bArr, fieldSizeInBytes, bArr.length)));
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        if (i == 3) {
            java.math.BigInteger modulus = getModulus(ellipticCurve);
            if (bArr.length != fieldSizeInBytes + 1) {
                throw new java.security.GeneralSecurityException("compressed point has wrong length");
            }
            byte b = bArr[0];
            if (b != 2) {
                if (b != 3) {
                    throw new java.security.GeneralSecurityException("invalid format");
                }
                z = true;
            }
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, java.util.Arrays.copyOfRange(bArr, 1, bArr.length));
            if (bigInteger.signum() == -1 || bigInteger.compareTo(modulus) >= 0) {
                throw new java.security.GeneralSecurityException("x is out of range");
            }
            return new java.security.spec.ECPoint(bigInteger, computeY(bigInteger, z, ellipticCurve));
        }
        throw new java.security.GeneralSecurityException("invalid format:".concat(java.lang.String.valueOf(pointFormatType)));
    }

    public static byte[] pointEncode(com.google.crypto.tink.subtle.EllipticCurves.CurveType curveType, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType pointFormatType, java.security.spec.ECPoint eCPoint) throws java.security.GeneralSecurityException {
        return pointEncode(getCurveSpec(curveType).getCurve(), pointFormatType, eCPoint);
    }

    public static byte[] pointEncode(java.security.spec.EllipticCurve ellipticCurve, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType pointFormatType, java.security.spec.ECPoint eCPoint) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(eCPoint, ellipticCurve);
        int fieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[pointFormatType.ordinal()];
        if (i == 1) {
            int i2 = (fieldSizeInBytes * 2) + 1;
            byte[] bArr = new byte[i2];
            byte[] bigEndianBytes = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineX());
            byte[] bigEndianBytes2 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineY());
            java.lang.System.arraycopy(bigEndianBytes2, 0, bArr, i2 - bigEndianBytes2.length, bigEndianBytes2.length);
            java.lang.System.arraycopy(bigEndianBytes, 0, bArr, (fieldSizeInBytes + 1) - bigEndianBytes.length, bigEndianBytes.length);
            bArr[0] = 4;
            return bArr;
        }
        if (i != 2) {
            if (i == 3) {
                int i3 = fieldSizeInBytes + 1;
                byte[] bArr2 = new byte[i3];
                byte[] bigEndianBytes3 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineX());
                java.lang.System.arraycopy(bigEndianBytes3, 0, bArr2, i3 - bigEndianBytes3.length, bigEndianBytes3.length);
                bArr2[0] = (byte) (eCPoint.getAffineY().testBit(0) ? 3 : 2);
                return bArr2;
            }
            throw new java.security.GeneralSecurityException("invalid format:".concat(java.lang.String.valueOf(pointFormatType)));
        }
        int i4 = fieldSizeInBytes * 2;
        byte[] bArr3 = new byte[i4];
        byte[] bigEndianBytes4 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineX());
        if (bigEndianBytes4.length > fieldSizeInBytes) {
            bigEndianBytes4 = java.util.Arrays.copyOfRange(bigEndianBytes4, bigEndianBytes4.length - fieldSizeInBytes, bigEndianBytes4.length);
        }
        byte[] bigEndianBytes5 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineY());
        if (bigEndianBytes5.length > fieldSizeInBytes) {
            bigEndianBytes5 = java.util.Arrays.copyOfRange(bigEndianBytes5, bigEndianBytes5.length - fieldSizeInBytes, bigEndianBytes5.length);
        }
        java.lang.System.arraycopy(bigEndianBytes5, 0, bArr3, i4 - bigEndianBytes5.length, bigEndianBytes5.length);
        java.lang.System.arraycopy(bigEndianBytes4, 0, bArr3, fieldSizeInBytes - bigEndianBytes4.length, bigEndianBytes4.length);
        return bArr3;
    }

    /* renamed from: com.google.crypto.tink.subtle.EllipticCurves$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType;

        static {
            int[] iArr = new int[com.google.crypto.tink.subtle.EllipticCurves.CurveType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = iArr;
            try {
                iArr[com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType = iArr2;
            try {
                iArr2[com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.COMPRESSED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public static java.security.spec.ECParameterSpec getCurveSpec(com.google.crypto.tink.subtle.EllipticCurves.CurveType curveType) throws java.security.NoSuchAlgorithmException {
        int i = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[curveType.ordinal()];
        if (i == 1) {
            return getNistP256Params();
        }
        if (i == 2) {
            return getNistP384Params();
        }
        if (i == 3) {
            return getNistP521Params();
        }
        throw new java.security.NoSuchAlgorithmException("curve not implemented:".concat(java.lang.String.valueOf(curveType)));
    }

    public static java.security.interfaces.ECPublicKey getEcPublicKey(byte[] bArr) throws java.security.GeneralSecurityException {
        return (java.security.interfaces.ECPublicKey) com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new java.security.spec.X509EncodedKeySpec(bArr));
    }

    public static java.security.interfaces.ECPublicKey getEcPublicKey(com.google.crypto.tink.subtle.EllipticCurves.CurveType curveType, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType pointFormatType, byte[] bArr) throws java.security.GeneralSecurityException {
        return getEcPublicKey(getCurveSpec(curveType), pointFormatType, bArr);
    }

    public static java.security.interfaces.ECPublicKey getEcPublicKey(java.security.spec.ECParameterSpec eCParameterSpec, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType pointFormatType, byte[] bArr) throws java.security.GeneralSecurityException {
        return (java.security.interfaces.ECPublicKey) com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new java.security.spec.ECPublicKeySpec(pointDecode(eCParameterSpec.getCurve(), pointFormatType, bArr), eCParameterSpec));
    }

    public static java.security.interfaces.ECPublicKey getEcPublicKey(com.google.crypto.tink.subtle.EllipticCurves.CurveType curveType, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        java.security.spec.ECParameterSpec curveSpec = getCurveSpec(curveType);
        java.security.spec.ECPoint eCPoint = new java.security.spec.ECPoint(new java.math.BigInteger(1, bArr), new java.math.BigInteger(1, bArr2));
        com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(eCPoint, curveSpec.getCurve());
        return (java.security.interfaces.ECPublicKey) com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new java.security.spec.ECPublicKeySpec(eCPoint, curveSpec));
    }

    public static java.security.interfaces.ECPrivateKey getEcPrivateKey(byte[] bArr) throws java.security.GeneralSecurityException {
        return (java.security.interfaces.ECPrivateKey) com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance("EC").generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(bArr));
    }

    public static java.security.interfaces.ECPrivateKey getEcPrivateKey(com.google.crypto.tink.subtle.EllipticCurves.CurveType curveType, byte[] bArr) throws java.security.GeneralSecurityException {
        return (java.security.interfaces.ECPrivateKey) com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance("EC").generatePrivate(new java.security.spec.ECPrivateKeySpec(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(bArr), getCurveSpec(curveType)));
    }

    public static java.security.KeyPair generateKeyPair(com.google.crypto.tink.subtle.EllipticCurves.CurveType curveType) throws java.security.GeneralSecurityException {
        return generateKeyPair(getCurveSpec(curveType));
    }

    public static java.security.KeyPair generateKeyPair(java.security.spec.ECParameterSpec eCParameterSpec) throws java.security.GeneralSecurityException {
        java.security.KeyPairGenerator engineFactory = com.google.crypto.tink.subtle.EngineFactory.KEY_PAIR_GENERATOR.getInstance("EC");
        engineFactory.initialize(eCParameterSpec);
        return engineFactory.generateKeyPair();
    }

    static void validateSharedSecret(byte[] bArr, java.security.interfaces.ECPrivateKey eCPrivateKey) throws java.security.GeneralSecurityException {
        java.security.spec.EllipticCurve curve = eCPrivateKey.getParams().getCurve();
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr);
        if (bigInteger.signum() == -1 || bigInteger.compareTo(getModulus(curve)) >= 0) {
            throw new java.security.GeneralSecurityException("shared secret is out of range");
        }
        computeY(bigInteger, true, curve);
    }

    public static byte[] computeSharedSecret(java.security.interfaces.ECPrivateKey eCPrivateKey, java.security.interfaces.ECPublicKey eCPublicKey) throws java.security.GeneralSecurityException {
        validatePublicKeySpec(eCPublicKey, eCPrivateKey);
        return computeSharedSecret(eCPrivateKey, eCPublicKey.getW());
    }

    public static byte[] computeSharedSecret(java.security.interfaces.ECPrivateKey eCPrivateKey, java.security.spec.ECPoint eCPoint) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(eCPoint, eCPrivateKey.getParams().getCurve());
        java.security.PublicKey generatePublic = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new java.security.spec.ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        javax.crypto.KeyAgreement engineFactory = com.google.crypto.tink.subtle.EngineFactory.KEY_AGREEMENT.getInstance("ECDH");
        engineFactory.init(eCPrivateKey);
        try {
            engineFactory.doPhase(generatePublic, true);
            byte[] generateSecret = engineFactory.generateSecret();
            validateSharedSecret(generateSecret, eCPrivateKey);
            return generateSecret;
        } catch (java.lang.IllegalStateException e) {
            throw new java.security.GeneralSecurityException(e);
        }
    }

    private EllipticCurves() {
    }
}
