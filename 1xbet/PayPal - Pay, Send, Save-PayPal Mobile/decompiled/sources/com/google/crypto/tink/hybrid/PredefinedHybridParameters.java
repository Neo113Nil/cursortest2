package com.google.crypto.tink.hybrid;

/* loaded from: classes9.dex */
public final class PredefinedHybridParameters {
    public static final com.google.crypto.tink.hybrid.EciesParameters ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM = (com.google.crypto.tink.hybrid.EciesParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.hybrid.PredefinedHybridParameters$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.hybrid.EciesParameters build;
            build = com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.UNCOMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.TINK).setDemParameters(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build()).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.hybrid.EciesParameters ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX = (com.google.crypto.tink.hybrid.EciesParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.hybrid.PredefinedHybridParameters$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.hybrid.EciesParameters build;
            build = com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.COMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.NO_PREFIX).setDemParameters(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build()).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.hybrid.EciesParameters ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256 = (com.google.crypto.tink.hybrid.EciesParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.hybrid.PredefinedHybridParameters$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.hybrid.EciesParameters build;
            build = com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.UNCOMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.TINK).setDemParameters(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(16).setHmacKeySizeBytes(32).setTagSizeBytes(16).setIvSizeBytes(16).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX).build()).build();
            return build;
        }
    });

    private PredefinedHybridParameters() {
    }
}
