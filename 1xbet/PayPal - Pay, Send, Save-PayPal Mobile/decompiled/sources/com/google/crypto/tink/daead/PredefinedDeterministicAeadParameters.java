package com.google.crypto.tink.daead;

/* loaded from: classes4.dex */
public final class PredefinedDeterministicAeadParameters {
    public static final com.google.crypto.tink.daead.AesSivParameters AES256_SIV = (com.google.crypto.tink.daead.AesSivParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.daead.PredefinedDeterministicAeadParameters$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.daead.AesSivParameters build;
            build = com.google.crypto.tink.daead.AesSivParameters.builder().setKeySizeBytes(64).setVariant(com.google.crypto.tink.daead.AesSivParameters.Variant.TINK).build();
            return build;
        }
    });

    private PredefinedDeterministicAeadParameters() {
    }
}
