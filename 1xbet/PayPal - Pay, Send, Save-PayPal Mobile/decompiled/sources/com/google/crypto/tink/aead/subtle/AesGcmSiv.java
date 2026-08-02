package com.google.crypto.tink.aead.subtle;

/* loaded from: classes4.dex */
public final class AesGcmSiv implements com.google.crypto.tink.Aead {
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localAesGcmSivCipher = new java.lang.ThreadLocal<javax.crypto.Cipher>() { // from class: com.google.crypto.tink.aead.subtle.AesGcmSiv.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @javax.annotation.Nullable
        public javax.crypto.Cipher initialValue() {
            try {
                javax.crypto.Cipher engineFactory = com.google.crypto.tink.subtle.EngineFactory.CIPHER.getInstance("AES/GCM-SIV/NoPadding");
                if (com.google.crypto.tink.aead.internal.AesGcmSiv.isAesGcmSivCipher(engineFactory)) {
                    return engineFactory;
                }
                return null;
            } catch (java.security.GeneralSecurityException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
    };
    private final com.google.crypto.tink.Aead aead;

    /* JADX INFO: Access modifiers changed from: private */
    public static javax.crypto.Cipher cipherSupplier() throws java.security.GeneralSecurityException {
        try {
            javax.crypto.Cipher cipher = localAesGcmSivCipher.get();
            if (cipher != null) {
                return cipher;
            }
            throw new java.security.GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (java.lang.IllegalStateException e) {
            throw new java.security.GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }

    public static com.google.crypto.tink.Aead create(com.google.crypto.tink.aead.AesGcmSivKey aesGcmSivKey) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.internal.AesGcmSiv.create(aesGcmSivKey, new com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0());
    }

    private static com.google.crypto.tink.Aead createFromRawKey(byte[] bArr) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.internal.AesGcmSiv.create(com.google.crypto.tink.aead.AesGcmSivKey.builder().setKeyBytes(com.google.crypto.tink.util.SecretBytes.copyFrom(bArr, com.google.crypto.tink.InsecureSecretKeyAccess.get())).setParameters(com.google.crypto.tink.aead.AesGcmSivParameters.builder().setKeySizeBytes(bArr.length).setVariant(com.google.crypto.tink.aead.AesGcmSivParameters.Variant.NO_PREFIX).build()).build(), new com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0());
    }

    private AesGcmSiv(com.google.crypto.tink.Aead aead) {
        this.aead = aead;
    }

    public AesGcmSiv(byte[] bArr) throws java.security.GeneralSecurityException {
        this(createFromRawKey(bArr));
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return this.aead.encrypt(bArr, bArr2);
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return this.aead.decrypt(bArr, bArr2);
    }
}
