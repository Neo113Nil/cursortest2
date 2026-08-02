package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class AesKeyWrapManagementAlgorithm extends org.jose4j.jwe.WrappingKeyManagementAlgorithm {
    int getHighSpeedVideoFpsRangesFor;

    public AesKeyWrapManagementAlgorithm(java.lang.String str, int i) {
        super("AESWrap", str);
        setKeyType(org.jose4j.jwk.OctetSequenceJsonWebKey.KEY_TYPE);
        setKeyPersuasion(org.jose4j.keys.KeyPersuasion.SYMMETRIC);
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    final org.jose4j.jwe.AesKeyWrapManagementAlgorithm getHighSpeedVideoFpsRanges() {
        this.useSuppliedKeyProviderContext = false;
        return this;
    }

    public static class Aes128 extends org.jose4j.jwe.AesKeyWrapManagementAlgorithm {
        public Aes128() {
            super(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.A128KW, 16);
        }
    }

    public static class Aes192 extends org.jose4j.jwe.AesKeyWrapManagementAlgorithm {
        public Aes192() {
            super(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.A192KW, 24);
        }
    }

    public static class Aes256 extends org.jose4j.jwe.AesKeyWrapManagementAlgorithm {
        public Aes256() {
            super(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.A256KW, 32);
        }
    }

    @Override // org.jose4j.jwa.Algorithm
    public boolean isAvailable() {
        int i = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String javaAlgorithm = getJavaAlgorithm();
        try {
            javax.crypto.Cipher.getInstance(javaAlgorithm);
            return org.jose4j.jwe.CipherStrengthSupport.isAvailable(javaAlgorithm, i);
        } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e) {
            this.log.debug("{} for {} is not available ({}).", javaAlgorithm, getAlgorithmIdentifier(), org.jose4j.lang.ExceptionHelp.toStringWithCauses(e));
            return false;
        }
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public void validateDecryptionKey(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        org.jose4j.jwx.KeyValidationSupport.validateAesWrappingKey(key, getAlgorithmIdentifier(), this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public void validateEncryptionKey(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        org.jose4j.jwx.KeyValidationSupport.validateAesWrappingKey(key, getAlgorithmIdentifier(), this.getHighSpeedVideoFpsRangesFor);
    }
}
