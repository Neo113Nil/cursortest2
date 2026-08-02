package org.jose4j.jws;

/* loaded from: classes18.dex */
public class EcdsaUsingShaAlgorithm extends org.jose4j.jws.BaseSignatureAlgorithm implements org.jose4j.jws.JsonWebSignatureAlgorithm {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoSizes;

    public EcdsaUsingShaAlgorithm(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        super(str, str2, "EC");
        this.Camera2StreamConfigurationMap = str3;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // org.jose4j.jws.BaseSignatureAlgorithm, org.jose4j.jws.JsonWebSignatureAlgorithm
    public boolean verifySignature(byte[] bArr, java.security.Key key, byte[] bArr2, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        if (bArr.length > this.getHighSpeedVideoSizes) {
            return false;
        }
        java.math.BigInteger fromBytes = org.jose4j.keys.BigEndianBigInteger.fromBytes(org.jose4j.lang.ByteUtil.leftHalf(bArr));
        java.math.BigInteger fromBytes2 = org.jose4j.keys.BigEndianBigInteger.fromBytes(org.jose4j.lang.ByteUtil.rightHalf(bArr));
        java.math.BigInteger order = org.jose4j.keys.EllipticCurves.getSpec(this.Camera2StreamConfigurationMap).getOrder();
        if (fromBytes.mod(order).equals(java.math.BigInteger.ZERO) || fromBytes2.mod(order).equals(java.math.BigInteger.ZERO)) {
            return false;
        }
        try {
            return super.verifySignature(convertConcatenatedToDer(bArr), key, bArr2, providerContext);
        } catch (java.io.IOException e) {
            throw new org.jose4j.lang.JoseException("Unable to convert R and S as a concatenated byte array to DER encoding.", e);
        }
    }

    @Override // org.jose4j.jws.BaseSignatureAlgorithm, org.jose4j.jws.JsonWebSignatureAlgorithm
    public byte[] sign(org.jose4j.jwa.CryptoPrimitive cryptoPrimitive, byte[] bArr) throws org.jose4j.lang.JoseException {
        try {
            return convertDerToConcatenated(super.sign(cryptoPrimitive, bArr), this.getHighSpeedVideoSizes);
        } catch (java.io.IOException e) {
            throw new org.jose4j.lang.JoseException("Unable to convert DER encoding to R and S as a concatenated byte array.", e);
        }
    }

    public static byte[] convertConcatenatedToDer(byte[] bArr) throws java.io.IOException {
        int i;
        byte[] bArr2;
        int length = bArr.length / 2;
        int i2 = length;
        while (true) {
            i = 1;
            if (i2 <= 1 || bArr[length - i2] != 0) {
                break;
            }
            i2--;
        }
        int i3 = length - i2;
        int i4 = bArr[i3] < 0 ? i2 + 1 : i2;
        int i5 = length;
        while (i5 > 1 && bArr[(length * 2) - i5] == 0) {
            i5--;
        }
        int i6 = (length * 2) - i5;
        int i7 = bArr[i6] < 0 ? i5 + 1 : i5;
        int i8 = i4 + 4 + i7;
        if (i8 > 255) {
            throw new java.io.IOException("Invalid format of ECDSA signature");
        }
        if (i8 < 128) {
            bArr2 = new byte[i4 + 6 + i7];
        } else {
            bArr2 = new byte[i4 + 7 + i7];
            bArr2[1] = -127;
            i = 2;
        }
        bArr2[0] = 48;
        bArr2[i] = (byte) i8;
        bArr2[i + 1] = 2;
        bArr2[i + 2] = (byte) i4;
        int i9 = i + 3 + i4;
        java.lang.System.arraycopy(bArr, i3, bArr2, i9 - i2, i2);
        bArr2[i9] = 2;
        bArr2[i9 + 1] = (byte) i7;
        java.lang.System.arraycopy(bArr, i6, bArr2, ((i9 + 2) + i7) - i5, i5);
        return bArr2;
    }

    public static byte[] convertDerToConcatenated(byte[] bArr, int i) throws java.io.IOException {
        int i2;
        if (bArr.length < 8 || bArr[0] != 48) {
            throw new java.io.IOException("Invalid format of ECDSA signature");
        }
        byte b = bArr[1];
        if (b > 0) {
            i2 = 2;
        } else {
            if (b != -127) {
                throw new java.io.IOException("Invalid format of ECDSA signature");
            }
            i2 = 3;
        }
        int i3 = bArr[i2 + 1];
        int i4 = i3;
        while (i4 > 0 && bArr[((i2 + 2) + i3) - i4] == 0) {
            i4--;
        }
        int i5 = i2 + 2 + i3;
        int i6 = bArr[i5 + 1];
        int i7 = i6;
        while (i7 > 0 && bArr[((i5 + 2) + i6) - i7] == 0) {
            i7--;
        }
        int max = java.lang.Math.max(java.lang.Math.max(i4, i7), i / 2);
        int i8 = bArr[i2 - 1] & 255;
        if (i8 != bArr.length - i2 || i8 != i3 + 4 + i6 || bArr[i2] != 2 || bArr[i5] != 2) {
            throw new java.io.IOException("Invalid format of ECDSA signature");
        }
        int i9 = max * 2;
        byte[] bArr2 = new byte[i9];
        java.lang.System.arraycopy(bArr, i5 - i4, bArr2, max - i4, i4);
        java.lang.System.arraycopy(bArr, ((i5 + 2) + i6) - i7, bArr2, i9 - i7, i7);
        return bArr2;
    }

    @Override // org.jose4j.jws.BaseSignatureAlgorithm
    public void validatePrivateKey(java.security.PrivateKey privateKey) throws org.jose4j.lang.InvalidKeyException {
        getHighSpeedVideoFpsRanges(privateKey);
    }

    @Override // org.jose4j.jws.BaseSignatureAlgorithm
    public void validatePublicKey(java.security.PublicKey publicKey) throws org.jose4j.lang.InvalidKeyException {
        getHighSpeedVideoFpsRanges(publicKey);
    }

    private void getHighSpeedVideoFpsRanges(java.security.Key key) throws org.jose4j.lang.InvalidKeyException {
        if (key instanceof java.security.interfaces.ECKey) {
            java.lang.String name2 = org.jose4j.keys.EllipticCurves.getName(((java.security.interfaces.ECKey) key).getParams().getCurve());
            if (getCurveName().equals(name2)) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getAlgorithmIdentifier());
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(getJavaAlgorithm());
            sb.append(" expects a key using ");
            sb.append(getCurveName());
            sb.append(" but was ");
            sb.append(name2);
            throw new org.jose4j.lang.InvalidKeyException(sb.toString());
        }
    }

    public java.lang.String getCurveName() {
        return this.Camera2StreamConfigurationMap;
    }

    public static class EcdsaP256UsingSha256 extends org.jose4j.jws.EcdsaUsingShaAlgorithm {
        public EcdsaP256UsingSha256() {
            super(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P256_CURVE_AND_SHA256, "SHA256withECDSA", org.jose4j.keys.EllipticCurves.P_256, 64);
        }
    }

    public static class EcdsaP384UsingSha384 extends org.jose4j.jws.EcdsaUsingShaAlgorithm {
        public EcdsaP384UsingSha384() {
            super(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P384_CURVE_AND_SHA384, "SHA384withECDSA", org.jose4j.keys.EllipticCurves.P_384, 96);
        }
    }

    public static class EcdsaP521UsingSha512 extends org.jose4j.jws.EcdsaUsingShaAlgorithm {
        public EcdsaP521UsingSha512() {
            super(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P521_CURVE_AND_SHA512, "SHA512withECDSA", org.jose4j.keys.EllipticCurves.P_521, 132);
        }
    }

    public static class EcdsaSECP256K1UsingSha256 extends org.jose4j.jws.EcdsaUsingShaAlgorithm {
        org.slf4j.Logger getHighSpeedVideoFpsRangesFor;

        public EcdsaSECP256K1UsingSha256() {
            super(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_SECP256K1_CURVE_AND_SHA256, "SHA256withECDSA", org.jose4j.keys.EllipticCurves.SECP_256K1, 64);
            this.getHighSpeedVideoFpsRangesFor = org.slf4j.LoggerFactory.getLogger(getClass());
        }

        @Override // org.jose4j.jws.BaseSignatureAlgorithm, org.jose4j.jwa.Algorithm
        public boolean isAvailable() {
            if (super.isAvailable()) {
                try {
                    return sign(prepareForSign(org.jose4j.jwk.PublicJsonWebKey.Factory.newPublicJwk("{\"kty\":\"EC\",\"x\":\"gi0g9DzM2SvjVV7iD_upIU0urmZRjpoIc4Efu8563y8\",\"y\":\"Y5K6GofrdlWNLlfT8-AEyJyVZ3yJJcGgkGroHQCAhmk\",\"crv\":\"secp256k1\",\"d\":\"Vd99BKh6pxt3mXSDJzHuVrCq52xBXAKVahbuFb6dqBc\"}").getPrivateKey(), new org.jose4j.jca.ProviderContext()), new byte[]{2, 6}) != null;
                } catch (org.jose4j.lang.JoseException e) {
                    org.slf4j.Logger logger = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(getAlgorithmIdentifier());
                    sb.append(" is not available due to ");
                    sb.append(org.jose4j.lang.ExceptionHelp.toStringWithCauses(e));
                    logger.debug(sb.toString());
                }
            }
            return false;
        }
    }
}
