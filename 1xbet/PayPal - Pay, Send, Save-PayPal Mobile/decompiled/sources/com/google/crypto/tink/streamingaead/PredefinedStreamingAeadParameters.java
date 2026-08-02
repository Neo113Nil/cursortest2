package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
public final class PredefinedStreamingAeadParameters {
    public static final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters AES128_CTR_HMAC_SHA256_4KB = (com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters build;
            build = com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.builder().setKeySizeBytes(16).setDerivedKeySizeBytes(16).setHkdfHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacTagSizeBytes(32).setCiphertextSegmentSizeBytes(4096).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters AES128_CTR_HMAC_SHA256_1MB = (com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters build;
            build = com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.builder().setKeySizeBytes(16).setDerivedKeySizeBytes(16).setHkdfHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacTagSizeBytes(32).setCiphertextSegmentSizeBytes(1048576).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters AES256_CTR_HMAC_SHA256_4KB = (com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters build;
            build = com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.builder().setKeySizeBytes(32).setDerivedKeySizeBytes(32).setHkdfHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacTagSizeBytes(32).setCiphertextSegmentSizeBytes(4096).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters AES256_CTR_HMAC_SHA256_1MB = (com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters$$ExternalSyntheticLambda3
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters build;
            build = com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.builder().setKeySizeBytes(32).setDerivedKeySizeBytes(32).setHkdfHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacTagSizeBytes(32).setCiphertextSegmentSizeBytes(1048576).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters AES128_GCM_HKDF_4KB = (com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters$$ExternalSyntheticLambda4
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters build;
            build = com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.builder().setKeySizeBytes(16).setDerivedAesGcmKeySizeBytes(16).setHkdfHashType(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType.SHA256).setCiphertextSegmentSizeBytes(4096).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters AES128_GCM_HKDF_1MB = (com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters$$ExternalSyntheticLambda5
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters build;
            build = com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.builder().setKeySizeBytes(16).setDerivedAesGcmKeySizeBytes(16).setHkdfHashType(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType.SHA256).setCiphertextSegmentSizeBytes(1048576).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters AES256_GCM_HKDF_4KB = (com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters$$ExternalSyntheticLambda6
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters build;
            build = com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.builder().setKeySizeBytes(32).setDerivedAesGcmKeySizeBytes(32).setHkdfHashType(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType.SHA256).setCiphertextSegmentSizeBytes(4096).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters AES256_GCM_HKDF_1MB = (com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters$$ExternalSyntheticLambda7
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters build;
            build = com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.builder().setKeySizeBytes(32).setDerivedAesGcmKeySizeBytes(32).setHkdfHashType(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType.SHA256).setCiphertextSegmentSizeBytes(1048576).build();
            return build;
        }
    });

    private PredefinedStreamingAeadParameters() {
    }
}
