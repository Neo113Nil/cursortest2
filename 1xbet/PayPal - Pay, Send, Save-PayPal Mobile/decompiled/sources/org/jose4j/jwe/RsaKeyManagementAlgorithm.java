package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class RsaKeyManagementAlgorithm extends org.jose4j.jwe.WrappingKeyManagementAlgorithm implements org.jose4j.jwe.KeyManagementAlgorithm {
    public RsaKeyManagementAlgorithm(java.lang.String str, java.lang.String str2) {
        super(str, str2);
        setKeyType("RSA");
        setKeyPersuasion(org.jose4j.keys.KeyPersuasion.ASYMMETRIC);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public void validateEncryptionKey(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        org.jose4j.jwx.KeyValidationSupport.checkRsaKeySize((java.security.PublicKey) org.jose4j.jwx.KeyValidationSupport.castKey(key, java.security.PublicKey.class));
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public void validateDecryptionKey(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        org.jose4j.jwx.KeyValidationSupport.checkRsaKeySize((java.security.PrivateKey) org.jose4j.jwx.KeyValidationSupport.castKey(key, java.security.PrivateKey.class));
    }

    @Override // org.jose4j.jwa.Algorithm
    public boolean isAvailable() {
        return org.jose4j.jwe.CipherUtil.getHighResolutionOutputSizeshNQ4ISI(getJavaAlgorithm(), null) != null;
    }

    public static class RsaOaep extends org.jose4j.jwe.RsaKeyManagementAlgorithm implements org.jose4j.jwe.KeyManagementAlgorithm {
        public RsaOaep() {
            super("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.RSA_OAEP);
        }
    }

    public static class RsaOaep256 extends org.jose4j.jwe.RsaKeyManagementAlgorithm implements org.jose4j.jwe.KeyManagementAlgorithm {
        public RsaOaep256() {
            super("RSA/ECB/OAEPWithSHA-256AndMGF1Padding", org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.RSA_OAEP_256);
            setAlgorithmParameterSpec(new javax.crypto.spec.OAEPParameterSpec("SHA-256", "MGF1", java.security.spec.MGF1ParameterSpec.SHA256, javax.crypto.spec.PSource.PSpecified.DEFAULT));
        }

        @Override // org.jose4j.jwe.RsaKeyManagementAlgorithm, org.jose4j.jwa.Algorithm
        public boolean isAvailable() {
            try {
                return manageForEncrypt(org.jose4j.jwk.JsonWebKey.Factory.newJwk("{\"kty\":\"RSA\",\"n\":\"sXchDaQebHnPiGvyDOAT4saGEUetSyo9MKLOoWFsueri23bOdgWp4Dy1WlUzewbgBHod5pcM9H95GQRV3JDXboIRROSBigeC5yjU1hGzHHyXss8UDprecbAYxknTcQkhslANGRUZmdTOQ5qTRsLAt6BTYuyvVRdhS8exSZEy_c4gs_7svlJJQ4H9_NxsiIoLwAEk7-Q3UXERGYw_75IDrGA84-lA_-Ct4eTlXHBIY2EaV7t7LjJaynVJCpkv4LKjTTAumiGUIuQhrNhZLuF_RJLqHpM2kgWFLU7-VTdL1VbC2tejvcI2BlMkEpk1BzBZI0KQB0GaDWFLN-aEAw3vRw\",\"e\":\"AQAB\"}").getKey(), new org.jose4j.jwe.ContentEncryptionKeyDescriptor(16, org.jose4j.keys.AesKey.ALGORITHM), null, null, new org.jose4j.jca.ProviderContext()) != null;
            } catch (org.jose4j.lang.JoseException e) {
                org.slf4j.Logger logger = this.log;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(getAlgorithmIdentifier());
                sb.append(" is not available due to ");
                sb.append(org.jose4j.lang.ExceptionHelp.toStringWithCauses(e));
                logger.debug(sb.toString());
                return false;
            }
        }
    }

    public static class Rsa1_5 extends org.jose4j.jwe.RsaKeyManagementAlgorithm implements org.jose4j.jwe.KeyManagementAlgorithm {
        public Rsa1_5() {
            super("RSA/ECB/PKCS1Padding", org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.RSA1_5);
        }

        @Override // org.jose4j.jwe.WrappingKeyManagementAlgorithm, org.jose4j.jwe.KeyManagementAlgorithm
        public java.security.Key manageForDecrypt(org.jose4j.jwa.CryptoPrimitive cryptoPrimitive, byte[] bArr, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
            java.security.Key unwrap;
            java.lang.String contentEncryptionKeyAlgorithm = contentEncryptionKeyDescriptor.getContentEncryptionKeyAlgorithm();
            int contentEncryptionKeyByteLength = contentEncryptionKeyDescriptor.getContentEncryptionKeyByteLength();
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(org.jose4j.lang.ByteUtil.randomBytes(contentEncryptionKeyByteLength), contentEncryptionKeyAlgorithm);
            try {
                unwrap = unwrap(cryptoPrimitive, bArr, providerContext, contentEncryptionKeyDescriptor);
            } catch (java.lang.Exception e) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Key unwrap/decrypt failed. Substituting a randomly generated CEK and proceeding. {}", org.jose4j.lang.ExceptionHelp.toStringWithCausesAndAbbreviatedStack(e, org.jose4j.jwe.JsonWebEncryption.class));
                }
            }
            return unwrap.getEncoded().length == contentEncryptionKeyByteLength ? unwrap : secretKeySpec;
        }
    }
}
