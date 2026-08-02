package com.google.crypto.tink;

/* loaded from: classes9.dex */
public enum PemKeyType {
    RSA_PSS_2048_SHA256("RSA", org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS, 2048, com.google.crypto.tink.subtle.Enums.HashType.SHA256),
    RSA_PSS_3072_SHA256("RSA", org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS, 3072, com.google.crypto.tink.subtle.Enums.HashType.SHA256),
    RSA_PSS_4096_SHA256("RSA", org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS, 4096, com.google.crypto.tink.subtle.Enums.HashType.SHA256),
    RSA_PSS_4096_SHA512("RSA", org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS, 4096, com.google.crypto.tink.subtle.Enums.HashType.SHA512),
    RSA_SIGN_PKCS1_2048_SHA256("RSA", "RSASSA-PKCS1-v1_5", 2048, com.google.crypto.tink.subtle.Enums.HashType.SHA256),
    RSA_SIGN_PKCS1_3072_SHA256("RSA", "RSASSA-PKCS1-v1_5", 3072, com.google.crypto.tink.subtle.Enums.HashType.SHA256),
    RSA_SIGN_PKCS1_4096_SHA256("RSA", "RSASSA-PKCS1-v1_5", 4096, com.google.crypto.tink.subtle.Enums.HashType.SHA256),
    RSA_SIGN_PKCS1_4096_SHA512("RSA", "RSASSA-PKCS1-v1_5", 4096, com.google.crypto.tink.subtle.Enums.HashType.SHA512),
    ECDSA_P256_SHA256("EC", "ECDSA", 256, com.google.crypto.tink.subtle.Enums.HashType.SHA256),
    ECDSA_P384_SHA384("EC", "ECDSA", 384, com.google.crypto.tink.subtle.Enums.HashType.SHA384),
    ECDSA_P521_SHA512("EC", "ECDSA", my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL, com.google.crypto.tink.subtle.Enums.HashType.SHA512);

    private static final java.lang.String BEGIN = "-----BEGIN ";
    private static final java.lang.String END = "-----END ";
    private static final java.lang.String MARKER = "-----";
    private static final java.lang.String PRIVATE_KEY = "PRIVATE KEY";
    private static final java.lang.String PUBLIC_KEY = "PUBLIC KEY";
    public final java.lang.String algorithm;
    public final com.google.crypto.tink.subtle.Enums.HashType hash;
    public final int keySizeInBits;
    public final java.lang.String keyType;

    PemKeyType(java.lang.String str, java.lang.String str2, int i, com.google.crypto.tink.subtle.Enums.HashType hashType) {
        this.keyType = str;
        this.algorithm = str2;
        this.keySizeInBits = i;
        this.hash = hashType;
    }

    @javax.annotation.Nullable
    public final java.security.Key readKey(java.io.BufferedReader bufferedReader) throws java.io.IOException {
        java.lang.String substring;
        int indexOf;
        byte[] decode;
        java.lang.String readLine = bufferedReader.readLine();
        while (readLine != null && !readLine.startsWith(BEGIN)) {
            readLine = bufferedReader.readLine();
        }
        if (readLine == null || (indexOf = (substring = readLine.trim().substring(11)).indexOf(MARKER)) < 0) {
            return null;
        }
        java.lang.String substring2 = substring.substring(0, indexOf);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(END);
        sb.append(substring2);
        sb.append(MARKER);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        while (true) {
            java.lang.String readLine2 = bufferedReader.readLine();
            if (readLine2 != null) {
                if (readLine2.indexOf(io.ktor.sse.ServerSentEventKt.COLON) <= 0) {
                    if (!readLine2.contains(obj)) {
                        sb2.append(readLine2);
                    }
                }
            }
            try {
                decode = com.google.crypto.tink.subtle.Base64.decode(sb2.toString(), 0);
            } catch (java.lang.IllegalArgumentException | java.security.GeneralSecurityException unused) {
            }
            if (substring2.contains("PUBLIC KEY")) {
                return getPublicKey(decode);
            }
            if (substring2.contains("PRIVATE KEY")) {
                return getPrivateKey(decode);
            }
            return null;
        }
    }

    private java.security.Key getPublicKey(byte[] bArr) throws java.security.GeneralSecurityException {
        return validate(com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance(this.keyType).generatePublic(new java.security.spec.X509EncodedKeySpec(bArr)));
    }

    private java.security.Key getPrivateKey(byte[] bArr) throws java.security.GeneralSecurityException {
        return validate(com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance(this.keyType).generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(bArr)));
    }

    private java.security.Key validate(java.security.Key key) throws java.security.GeneralSecurityException {
        if (this.keyType.equals("RSA")) {
            int bitLength = ((java.security.interfaces.RSAKey) key).getModulus().bitLength();
            int i = this.keySizeInBits;
            if (bitLength != i) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("invalid RSA key size, want %d got %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(bitLength)));
            }
        } else {
            java.security.spec.ECParameterSpec params = ((java.security.interfaces.ECKey) key).getParams();
            if (!com.google.crypto.tink.subtle.EllipticCurves.isNistEcParameterSpec(params)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupport EC spec: ");
                sb.append(params.toString());
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            int fieldSizeInBits = com.google.crypto.tink.subtle.EllipticCurves.fieldSizeInBits(params.getCurve());
            int i2 = this.keySizeInBits;
            if (fieldSizeInBits != i2) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("invalid EC key size, want %d got %d", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(fieldSizeInBits)));
            }
        }
        return key;
    }
}
