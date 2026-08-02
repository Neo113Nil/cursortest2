package com.google.crypto.tink.subtle;

/* loaded from: classes4.dex */
public interface EngineWrapper<T> {
    T getInstance(java.lang.String str, java.security.Provider provider) throws java.security.GeneralSecurityException;

    public static class TCipher implements com.google.crypto.tink.subtle.EngineWrapper<javax.crypto.Cipher> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public javax.crypto.Cipher getInstance(java.lang.String str, java.security.Provider provider) throws java.security.GeneralSecurityException {
            if (provider == null) {
                return javax.crypto.Cipher.getInstance(str);
            }
            return javax.crypto.Cipher.getInstance(str, provider);
        }
    }

    public static class TMac implements com.google.crypto.tink.subtle.EngineWrapper<javax.crypto.Mac> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public javax.crypto.Mac getInstance(java.lang.String str, java.security.Provider provider) throws java.security.GeneralSecurityException {
            if (provider == null) {
                return javax.crypto.Mac.getInstance(str);
            }
            return javax.crypto.Mac.getInstance(str, provider);
        }
    }

    public static class TKeyPairGenerator implements com.google.crypto.tink.subtle.EngineWrapper<java.security.KeyPairGenerator> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public java.security.KeyPairGenerator getInstance(java.lang.String str, java.security.Provider provider) throws java.security.GeneralSecurityException {
            if (provider == null) {
                return java.security.KeyPairGenerator.getInstance(str);
            }
            return java.security.KeyPairGenerator.getInstance(str, provider);
        }
    }

    public static class TMessageDigest implements com.google.crypto.tink.subtle.EngineWrapper<java.security.MessageDigest> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public java.security.MessageDigest getInstance(java.lang.String str, java.security.Provider provider) throws java.security.GeneralSecurityException {
            if (provider == null) {
                return java.security.MessageDigest.getInstance(str);
            }
            return java.security.MessageDigest.getInstance(str, provider);
        }
    }

    public static class TSignature implements com.google.crypto.tink.subtle.EngineWrapper<java.security.Signature> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public java.security.Signature getInstance(java.lang.String str, java.security.Provider provider) throws java.security.GeneralSecurityException {
            if (provider == null) {
                return java.security.Signature.getInstance(str);
            }
            return java.security.Signature.getInstance(str, provider);
        }
    }

    public static class TKeyFactory implements com.google.crypto.tink.subtle.EngineWrapper<java.security.KeyFactory> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public java.security.KeyFactory getInstance(java.lang.String str, java.security.Provider provider) throws java.security.GeneralSecurityException {
            if (provider == null) {
                return java.security.KeyFactory.getInstance(str);
            }
            return java.security.KeyFactory.getInstance(str, provider);
        }
    }

    public static class TKeyAgreement implements com.google.crypto.tink.subtle.EngineWrapper<javax.crypto.KeyAgreement> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public javax.crypto.KeyAgreement getInstance(java.lang.String str, java.security.Provider provider) throws java.security.GeneralSecurityException {
            if (provider == null) {
                return javax.crypto.KeyAgreement.getInstance(str);
            }
            return javax.crypto.KeyAgreement.getInstance(str, provider);
        }
    }
}
