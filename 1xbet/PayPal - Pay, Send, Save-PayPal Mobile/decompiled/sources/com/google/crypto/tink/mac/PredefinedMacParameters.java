package com.google.crypto.tink.mac;

/* loaded from: classes4.dex */
public final class PredefinedMacParameters {
    public static final com.google.crypto.tink.mac.HmacParameters HMAC_SHA256_128BITTAG = (com.google.crypto.tink.mac.HmacParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.mac.PredefinedMacParameters$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.mac.HmacParameters build;
            build = com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.TINK).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA256).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.mac.HmacParameters HMAC_SHA256_256BITTAG = (com.google.crypto.tink.mac.HmacParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.mac.PredefinedMacParameters$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.mac.HmacParameters build;
            build = com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(32).setTagSizeBytes(32).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.TINK).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA256).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.mac.HmacParameters HMAC_SHA512_256BITTAG = (com.google.crypto.tink.mac.HmacParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.mac.PredefinedMacParameters$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.mac.HmacParameters build;
            build = com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(64).setTagSizeBytes(32).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.TINK).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA512).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.mac.HmacParameters HMAC_SHA512_512BITTAG = (com.google.crypto.tink.mac.HmacParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.mac.PredefinedMacParameters$$ExternalSyntheticLambda3
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.mac.HmacParameters build;
            build = com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(64).setTagSizeBytes(64).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.TINK).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA512).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.mac.AesCmacParameters AES_CMAC = (com.google.crypto.tink.mac.AesCmacParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.mac.PredefinedMacParameters$$ExternalSyntheticLambda4
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.mac.AesCmacParameters build;
            build = com.google.crypto.tink.mac.AesCmacParameters.builder().setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.mac.AesCmacParameters.Variant.TINK).build();
            return build;
        }
    });

    private PredefinedMacParameters() {
    }
}
