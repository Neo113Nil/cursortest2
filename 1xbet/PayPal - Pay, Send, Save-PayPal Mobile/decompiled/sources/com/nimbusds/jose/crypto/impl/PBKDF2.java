package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public class PBKDF2 {
    static final long MAX_DERIVED_KEY_LENGTH = 4294967295L;
    public static final int MIN_SALT_LENGTH = 8;
    static final byte[] ZERO_BYTE = {0};

    public static byte[] formatSalt(com.nimbusds.jose.JWEAlgorithm jWEAlgorithm, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        byte[] bytes = jWEAlgorithm.toString().getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8);
        if (bArr == null) {
            throw new com.nimbusds.jose.JOSEException("The salt must not be null");
        }
        if (bArr.length < 8) {
            throw new com.nimbusds.jose.JOSEException("The salt must be at least 8 bytes long");
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(ZERO_BYTE);
            byteArrayOutputStream.write(bArr);
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }

    public static javax.crypto.SecretKey deriveKey(byte[] bArr, byte[] bArr2, int i, com.nimbusds.jose.crypto.impl.PRFParams pRFParams) throws com.nimbusds.jose.JOSEException {
        if (bArr2 == null) {
            throw new com.nimbusds.jose.JOSEException("The formatted salt must not be null");
        }
        if (i <= 0) {
            throw new com.nimbusds.jose.JOSEException("The iteration count must be greater than 0");
        }
        javax.crypto.Mac initMac = com.nimbusds.jose.crypto.impl.HMAC.getInitMac(new javax.crypto.spec.SecretKeySpec(bArr, pRFParams.getMACAlgorithm()), pRFParams.getMacProvider());
        int macLength = initMac.getMacLength();
        if (pRFParams.getDerivedKeyByteLength() > 4294967295L) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Derived key too long: ");
            sb.append(pRFParams.getDerivedKeyByteLength());
            throw new com.nimbusds.jose.JOSEException(sb.toString());
        }
        int ceil = (int) java.lang.Math.ceil(pRFParams.getDerivedKeyByteLength() / macLength);
        int derivedKeyByteLength = pRFParams.getDerivedKeyByteLength();
        int i2 = ceil - 1;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i3 = 0;
        while (i3 < ceil) {
            int i4 = i3 + 1;
            byte[] extractBlock = extractBlock(bArr2, i, i4, initMac);
            if (i3 == i2) {
                extractBlock = com.nimbusds.jose.util.ByteUtils.subArray(extractBlock, 0, derivedKeyByteLength - (macLength * i2));
            }
            byteArrayOutputStream.write(extractBlock, 0, extractBlock.length);
            i3 = i4;
        }
        return new javax.crypto.spec.SecretKeySpec(byteArrayOutputStream.toByteArray(), org.jose4j.keys.AesKey.ALGORITHM);
    }

    static byte[] extractBlock(byte[] bArr, int i, int i2, javax.crypto.Mac mac) throws com.nimbusds.jose.JOSEException {
        if (bArr == null) {
            throw new com.nimbusds.jose.JOSEException("The formatted salt must not be null");
        }
        if (i <= 0) {
            throw new com.nimbusds.jose.JOSEException("The iteration count must be greater than 0");
        }
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        for (int i3 = 1; i3 <= i; i3++) {
            if (i3 == 1) {
                bArr2 = mac.doFinal(com.nimbusds.jose.util.ByteUtils.concat(bArr, com.nimbusds.jose.util.IntegerUtils.toBytes(i2)));
                bArr3 = bArr2;
            } else {
                bArr3 = mac.doFinal(bArr3);
                for (int i4 = 0; i4 < bArr3.length; i4++) {
                    bArr2[i4] = (byte) (bArr3[i4] ^ bArr2[i4]);
                }
            }
        }
        return bArr2;
    }

    private PBKDF2() {
    }
}
