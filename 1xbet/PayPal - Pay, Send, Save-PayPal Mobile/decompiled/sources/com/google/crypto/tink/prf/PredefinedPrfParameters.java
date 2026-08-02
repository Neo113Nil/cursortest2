package com.google.crypto.tink.prf;

/* loaded from: classes9.dex */
public final class PredefinedPrfParameters {
    public static final com.google.crypto.tink.prf.HkdfPrfParameters HKDF_SHA256 = (com.google.crypto.tink.prf.HkdfPrfParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.prf.PredefinedPrfParameters$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.prf.HkdfPrfParameters build;
            build = com.google.crypto.tink.prf.HkdfPrfParameters.builder().setKeySizeBytes(32).setHashType(com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA256).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.prf.HmacPrfParameters HMAC_SHA256_PRF = (com.google.crypto.tink.prf.HmacPrfParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.prf.PredefinedPrfParameters$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.prf.HmacPrfParameters build;
            build = com.google.crypto.tink.prf.HmacPrfParameters.builder().setKeySizeBytes(32).setHashType(com.google.crypto.tink.prf.HmacPrfParameters.HashType.SHA256).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.prf.HmacPrfParameters HMAC_SHA512_PRF = (com.google.crypto.tink.prf.HmacPrfParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.prf.PredefinedPrfParameters$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.prf.HmacPrfParameters build;
            build = com.google.crypto.tink.prf.HmacPrfParameters.builder().setKeySizeBytes(64).setHashType(com.google.crypto.tink.prf.HmacPrfParameters.HashType.SHA512).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.prf.AesCmacPrfParameters AES_CMAC_PRF = (com.google.crypto.tink.prf.AesCmacPrfParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.prf.PredefinedPrfParameters$$ExternalSyntheticLambda3
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.prf.AesCmacPrfParameters create;
            create = com.google.crypto.tink.prf.AesCmacPrfParameters.create(32);
            return create;
        }
    });

    private PredefinedPrfParameters() {
    }
}
