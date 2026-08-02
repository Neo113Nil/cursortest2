package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class PasswordBasedEncrypter extends com.nimbusds.jose.crypto.impl.PasswordBasedCryptoProvider implements com.nimbusds.jose.JWEEncrypter {
    public static final int MIN_RECOMMENDED_ITERATION_COUNT = 1000;
    public static final int MIN_SALT_LENGTH = 8;
    private final int iterationCount;
    private final int saltLength;

    public PasswordBasedEncrypter(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 8) {
            throw new java.lang.IllegalArgumentException("The minimum salt length (p2s) is 8 bytes");
        }
        this.saltLength = i;
        if (i2 < 1000) {
            throw new java.lang.IllegalArgumentException("The minimum recommended iteration count (p2c) is 1000");
        }
        this.iterationCount = i2;
    }

    public PasswordBasedEncrypter(java.lang.String str, int i, int i2) {
        this(str.getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8), i, i2);
    }

    @java.lang.Deprecated
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        return encrypt(jWEHeader, bArr, com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader));
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.JWEAlgorithm algorithmAndEnsureNotNull = com.nimbusds.jose.crypto.impl.JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader);
        com.nimbusds.jose.EncryptionMethod encryptionMethod = jWEHeader.getEncryptionMethod();
        byte[] bArr3 = new byte[this.saltLength];
        getJCAContext().getSecureRandom().nextBytes(bArr3);
        javax.crypto.SecretKey deriveKey = com.nimbusds.jose.crypto.impl.PBKDF2.deriveKey(getPassword(), com.nimbusds.jose.crypto.impl.PBKDF2.formatSalt(algorithmAndEnsureNotNull, bArr3), this.iterationCount, com.nimbusds.jose.crypto.impl.PRFParams.resolve(algorithmAndEnsureNotNull, getJCAContext().getMACProvider()));
        com.nimbusds.jose.JWEHeader build = new com.nimbusds.jose.JWEHeader.Builder(jWEHeader).pbes2Salt(com.nimbusds.jose.util.Base64URL.encode(bArr3)).pbes2Count(this.iterationCount).build();
        javax.crypto.SecretKey generateCEK = com.nimbusds.jose.crypto.impl.ContentCryptoProvider.generateCEK(encryptionMethod, getJCAContext().getSecureRandom());
        com.nimbusds.jose.util.Base64URL encode = com.nimbusds.jose.util.Base64URL.encode(com.nimbusds.jose.crypto.impl.AESKW.wrapCEK(generateCEK, deriveKey, getJCAContext().getKeyEncryptionProvider()));
        if (java.util.Arrays.equals(com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader), bArr2)) {
            bArr2 = com.nimbusds.jose.crypto.impl.AAD.compute(build);
        }
        return com.nimbusds.jose.crypto.impl.ContentCryptoProvider.encrypt(build, bArr, bArr2, generateCEK, encode, getJCAContext());
    }

    public int getSaltLength() {
        return this.saltLength;
    }

    public int getIterationCount() {
        return this.iterationCount;
    }
}
