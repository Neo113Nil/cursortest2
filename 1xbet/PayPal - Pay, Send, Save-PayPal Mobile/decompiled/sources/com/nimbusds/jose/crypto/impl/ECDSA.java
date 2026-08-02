package com.nimbusds.jose.crypto.impl;

/* loaded from: classes4.dex */
public class ECDSA {
    public static com.nimbusds.jose.JWSAlgorithm resolveAlgorithm(java.security.interfaces.ECKey eCKey) throws com.nimbusds.jose.JOSEException {
        return resolveAlgorithm(com.nimbusds.jose.jwk.Curve.forECParameterSpec(eCKey.getParams()));
    }

    public static com.nimbusds.jose.JWSAlgorithm resolveAlgorithm(com.nimbusds.jose.jwk.Curve curve) throws com.nimbusds.jose.JOSEException {
        if (curve == null) {
            throw new com.nimbusds.jose.JOSEException("The EC key curve is not supported, must be P-256, P-384 or P-521");
        }
        if (com.nimbusds.jose.jwk.Curve.P_256.equals(curve)) {
            return com.nimbusds.jose.JWSAlgorithm.ES256;
        }
        if (com.nimbusds.jose.jwk.Curve.SECP256K1.equals(curve)) {
            return com.nimbusds.jose.JWSAlgorithm.ES256K;
        }
        if (com.nimbusds.jose.jwk.Curve.P_384.equals(curve)) {
            return com.nimbusds.jose.JWSAlgorithm.ES384;
        }
        if (com.nimbusds.jose.jwk.Curve.P_521.equals(curve)) {
            return com.nimbusds.jose.JWSAlgorithm.ES512;
        }
        throw new com.nimbusds.jose.JOSEException("Unexpected curve: ".concat(java.lang.String.valueOf(curve)));
    }

    public static java.security.Signature getSignerAndVerifier(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        java.lang.String str;
        if (!jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.ES256) && !jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.ES256K)) {
            if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.ES384)) {
                str = "SHA384withECDSA";
            } else if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.ES512)) {
                str = "SHA512withECDSA";
            } else {
                throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, com.nimbusds.jose.crypto.impl.ECDSAProvider.SUPPORTED_ALGORITHMS));
            }
        } else {
            str = "SHA256withECDSA";
        }
        try {
            if (provider != null) {
                return java.security.Signature.getInstance(str, provider);
            }
            return java.security.Signature.getInstance(str);
        } catch (java.security.NoSuchAlgorithmException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported ECDSA algorithm: ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        }
    }

    public static int getSignatureByteArrayLength(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm) throws com.nimbusds.jose.JOSEException {
        if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.ES256) || jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.ES256K)) {
            return 64;
        }
        if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.ES384)) {
            return 96;
        }
        if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.ES512)) {
            return 132;
        }
        throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, com.nimbusds.jose.crypto.impl.ECDSAProvider.SUPPORTED_ALGORITHMS));
    }

    public static byte[] transcodeSignatureToConcat(byte[] bArr, int i) throws com.nimbusds.jose.JOSEException {
        int i2;
        if (bArr.length < 8 || bArr[0] != 48) {
            throw new com.nimbusds.jose.JOSEException("Invalid ECDSA signature format");
        }
        byte b = bArr[1];
        if (b > 0) {
            i2 = 2;
        } else {
            if (b != -127) {
                throw new com.nimbusds.jose.JOSEException("Invalid ECDSA signature format");
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
            throw new com.nimbusds.jose.JOSEException("Invalid ECDSA signature format");
        }
        int i9 = max * 2;
        byte[] bArr2 = new byte[i9];
        java.lang.System.arraycopy(bArr, i5 - i4, bArr2, max - i4, i4);
        java.lang.System.arraycopy(bArr, ((i5 + 2) + i6) - i7, bArr2, i9 - i7, i7);
        return bArr2;
    }

    public static byte[] transcodeSignatureToDER(byte[] bArr) throws com.nimbusds.jose.JOSEException {
        byte[] bArr2;
        try {
            int length = bArr.length / 2;
            int i = length;
            while (i > 0 && bArr[length - i] == 0) {
                i--;
            }
            int i2 = length - i;
            int i3 = bArr[i2] < 0 ? i + 1 : i;
            int i4 = length;
            while (i4 > 0 && bArr[(length * 2) - i4] == 0) {
                i4--;
            }
            int i5 = (length * 2) - i4;
            int i6 = bArr[i5] < 0 ? i4 + 1 : i4;
            int i7 = i3 + 4 + i6;
            if (i7 > 255) {
                throw new com.nimbusds.jose.JOSEException("Invalid ECDSA signature format");
            }
            int i8 = 1;
            if (i7 < 128) {
                bArr2 = new byte[i3 + 6 + i6];
            } else {
                bArr2 = new byte[i3 + 7 + i6];
                bArr2[1] = -127;
                i8 = 2;
            }
            bArr2[0] = 48;
            bArr2[i8] = (byte) i7;
            bArr2[i8 + 1] = 2;
            bArr2[i8 + 2] = (byte) i3;
            int i9 = i8 + 3 + i3;
            java.lang.System.arraycopy(bArr, i2, bArr2, i9 - i, i);
            bArr2[i9] = 2;
            bArr2[i9 + 1] = (byte) i6;
            java.lang.System.arraycopy(bArr, i5, bArr2, ((i9 + 2) + i6) - i4, i4);
            return bArr2;
        } catch (java.lang.Exception e) {
            if (e instanceof com.nimbusds.jose.JOSEException) {
                throw e;
            }
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }

    public static void ensureLegalSignature(byte[] bArr, com.nimbusds.jose.JWSAlgorithm jWSAlgorithm) throws com.nimbusds.jose.JOSEException {
        if (com.nimbusds.jose.util.ByteUtils.isZeroFilled(bArr)) {
            throw new com.nimbusds.jose.JOSEException("Blank signature");
        }
        java.util.Set<com.nimbusds.jose.jwk.Curve> forJWSAlgorithm = com.nimbusds.jose.jwk.Curve.forJWSAlgorithm(jWSAlgorithm);
        if (forJWSAlgorithm == null || forJWSAlgorithm.size() > 1) {
            throw new com.nimbusds.jose.JOSEException("Unsupported JWS algorithm: ".concat(java.lang.String.valueOf(jWSAlgorithm)));
        }
        com.nimbusds.jose.jwk.Curve next = forJWSAlgorithm.iterator().next();
        java.security.spec.ECParameterSpec eCParameterSpec = com.nimbusds.jose.jwk.ECParameterTable.get(next);
        if (eCParameterSpec == null) {
            throw new com.nimbusds.jose.JOSEException("Unsupported curve: ".concat(java.lang.String.valueOf(next)));
        }
        int signatureByteArrayLength = getSignatureByteArrayLength(jWSAlgorithm);
        if (getSignatureByteArrayLength(jWSAlgorithm) != bArr.length) {
            throw new com.nimbusds.jose.JOSEException("Illegal signature length");
        }
        int i = signatureByteArrayLength / 2;
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, com.nimbusds.jose.util.ByteUtils.subArray(bArr, 0, i));
        java.math.BigInteger bigInteger2 = new java.math.BigInteger(1, com.nimbusds.jose.util.ByteUtils.subArray(bArr, i, i));
        if (bigInteger2.equals(java.math.BigInteger.ZERO) || bigInteger.equals(java.math.BigInteger.ZERO)) {
            throw new com.nimbusds.jose.JOSEException("S and R must not be 0");
        }
        java.math.BigInteger order = eCParameterSpec.getOrder();
        if (order.compareTo(bigInteger) <= 0 || order.compareTo(bigInteger2) <= 0) {
            throw new com.nimbusds.jose.JOSEException("S and R must not exceed N");
        }
        if (bigInteger.mod(order).equals(java.math.BigInteger.ZERO) || bigInteger2.mod(order).equals(java.math.BigInteger.ZERO)) {
            throw new com.nimbusds.jose.JOSEException("R or S mod N != 0 check failed");
        }
    }

    private ECDSA() {
    }
}
