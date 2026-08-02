package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class PredefinedAeadParameters {
    public static final com.google.crypto.tink.aead.XAesGcmParameters XAES_256_GCM_160_BIT_NONCE_NO_PREFIX;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.aead.XAesGcmParameters X_AES_GCM_8_BYTE_SALT_NO_PREFIX;
    public static final com.google.crypto.tink.aead.AesGcmParameters AES128_GCM = (com.google.crypto.tink.aead.AesGcmParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.PredefinedAeadParameters$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.aead.AesGcmParameters build;
            build = com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.aead.AesGcmParameters AES256_GCM = (com.google.crypto.tink.aead.AesGcmParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.PredefinedAeadParameters$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.aead.AesGcmParameters build;
            build = com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.aead.AesEaxParameters AES128_EAX = (com.google.crypto.tink.aead.AesEaxParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.PredefinedAeadParameters$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.aead.AesEaxParameters build;
            build = com.google.crypto.tink.aead.AesEaxParameters.builder().setIvSizeBytes(16).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesEaxParameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.aead.AesEaxParameters AES256_EAX = (com.google.crypto.tink.aead.AesEaxParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.PredefinedAeadParameters$$ExternalSyntheticLambda3
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.aead.AesEaxParameters build;
            build = com.google.crypto.tink.aead.AesEaxParameters.builder().setIvSizeBytes(16).setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesEaxParameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.aead.AesCtrHmacAeadParameters AES128_CTR_HMAC_SHA256 = (com.google.crypto.tink.aead.AesCtrHmacAeadParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.PredefinedAeadParameters$$ExternalSyntheticLambda4
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.aead.AesCtrHmacAeadParameters build;
            build = com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(16).setHmacKeySizeBytes(32).setTagSizeBytes(16).setIvSizeBytes(16).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.aead.AesCtrHmacAeadParameters AES256_CTR_HMAC_SHA256 = (com.google.crypto.tink.aead.AesCtrHmacAeadParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.PredefinedAeadParameters$$ExternalSyntheticLambda5
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.aead.AesCtrHmacAeadParameters build;
            build = com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(32).setHmacKeySizeBytes(32).setTagSizeBytes(32).setIvSizeBytes(16).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.aead.ChaCha20Poly1305Parameters CHACHA20_POLY1305 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.create(com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.TINK);
    public static final com.google.crypto.tink.aead.XChaCha20Poly1305Parameters XCHACHA20_POLY1305 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.create(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.TINK);
    public static final com.google.crypto.tink.aead.XAesGcmParameters XAES_256_GCM_192_BIT_NONCE = (com.google.crypto.tink.aead.XAesGcmParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.PredefinedAeadParameters$$ExternalSyntheticLambda6
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.aead.XAesGcmParameters create;
            create = com.google.crypto.tink.aead.XAesGcmParameters.create(com.google.crypto.tink.aead.XAesGcmParameters.Variant.TINK, 12);
            return create;
        }
    });
    public static final com.google.crypto.tink.aead.XAesGcmParameters XAES_256_GCM_192_BIT_NONCE_NO_PREFIX = (com.google.crypto.tink.aead.XAesGcmParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.PredefinedAeadParameters$$ExternalSyntheticLambda7
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.aead.XAesGcmParameters create;
            create = com.google.crypto.tink.aead.XAesGcmParameters.create(com.google.crypto.tink.aead.XAesGcmParameters.Variant.NO_PREFIX, 12);
            return create;
        }
    });

    static {
        com.google.crypto.tink.aead.XAesGcmParameters xAesGcmParameters = (com.google.crypto.tink.aead.XAesGcmParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.PredefinedAeadParameters$$ExternalSyntheticLambda8
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.aead.XAesGcmParameters create;
                create = com.google.crypto.tink.aead.XAesGcmParameters.create(com.google.crypto.tink.aead.XAesGcmParameters.Variant.NO_PREFIX, 8);
                return create;
            }
        });
        XAES_256_GCM_160_BIT_NONCE_NO_PREFIX = xAesGcmParameters;
        X_AES_GCM_8_BYTE_SALT_NO_PREFIX = xAesGcmParameters;
    }

    private PredefinedAeadParameters() {
    }
}
