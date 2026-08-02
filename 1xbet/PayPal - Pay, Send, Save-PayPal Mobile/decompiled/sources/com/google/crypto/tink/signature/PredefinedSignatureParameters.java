package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class PredefinedSignatureParameters {
    public static final com.google.crypto.tink.signature.EcdsaParameters ECDSA_P256 = (com.google.crypto.tink.signature.EcdsaParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.PredefinedSignatureParameters$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.signature.EcdsaParameters build;
            build = com.google.crypto.tink.signature.EcdsaParameters.builder().setHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256).setCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256).setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.DER).setVariant(com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.signature.EcdsaParameters ECDSA_P384 = (com.google.crypto.tink.signature.EcdsaParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.PredefinedSignatureParameters$$ExternalSyntheticLambda9
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.signature.EcdsaParameters build;
            build = com.google.crypto.tink.signature.EcdsaParameters.builder().setHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512).setCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384).setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.DER).setVariant(com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.signature.EcdsaParameters ECDSA_P521 = (com.google.crypto.tink.signature.EcdsaParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.PredefinedSignatureParameters$$ExternalSyntheticLambda10
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.signature.EcdsaParameters build;
            build = com.google.crypto.tink.signature.EcdsaParameters.builder().setHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512).setCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521).setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.DER).setVariant(com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.signature.EcdsaParameters ECDSA_P256_IEEE_P1363 = (com.google.crypto.tink.signature.EcdsaParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.PredefinedSignatureParameters$$ExternalSyntheticLambda11
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.signature.EcdsaParameters build;
            build = com.google.crypto.tink.signature.EcdsaParameters.builder().setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363).setCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256).setVariant(com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.signature.EcdsaParameters ECDSA_P384_IEEE_P1363 = (com.google.crypto.tink.signature.EcdsaParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.PredefinedSignatureParameters$$ExternalSyntheticLambda12
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.signature.EcdsaParameters build;
            build = com.google.crypto.tink.signature.EcdsaParameters.builder().setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363).setCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384).setHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512).setVariant(com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.signature.EcdsaParameters ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX = (com.google.crypto.tink.signature.EcdsaParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.PredefinedSignatureParameters$$ExternalSyntheticLambda13
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.signature.EcdsaParameters build;
            build = com.google.crypto.tink.signature.EcdsaParameters.builder().setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363).setCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256).setVariant(com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.signature.EcdsaParameters ECDSA_P521_IEEE_P1363 = (com.google.crypto.tink.signature.EcdsaParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.PredefinedSignatureParameters$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.signature.EcdsaParameters build;
            build = com.google.crypto.tink.signature.EcdsaParameters.builder().setHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512).setCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521).setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363).setVariant(com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.signature.Ed25519Parameters ED25519 = (com.google.crypto.tink.signature.Ed25519Parameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.PredefinedSignatureParameters$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.signature.Ed25519Parameters create;
            create = com.google.crypto.tink.signature.Ed25519Parameters.create(com.google.crypto.tink.signature.Ed25519Parameters.Variant.TINK);
            return create;
        }
    });
    public static final com.google.crypto.tink.signature.Ed25519Parameters ED25519WithRawOutput = (com.google.crypto.tink.signature.Ed25519Parameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.PredefinedSignatureParameters$$ExternalSyntheticLambda3
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.signature.Ed25519Parameters create;
            create = com.google.crypto.tink.signature.Ed25519Parameters.create(com.google.crypto.tink.signature.Ed25519Parameters.Variant.NO_PREFIX);
            return create;
        }
    });
    public static final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters RSA_SSA_PKCS1_3072_SHA256_F4 = (com.google.crypto.tink.signature.RsaSsaPkcs1Parameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.PredefinedSignatureParameters$$ExternalSyntheticLambda4
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.signature.RsaSsaPkcs1Parameters build;
            build = com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setHashType(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA256).setModulusSizeBits(3072).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX = (com.google.crypto.tink.signature.RsaSsaPkcs1Parameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.PredefinedSignatureParameters$$ExternalSyntheticLambda5
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.signature.RsaSsaPkcs1Parameters build;
            build = com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setHashType(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA256).setModulusSizeBits(3072).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.NO_PREFIX).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters RSA_SSA_PKCS1_4096_SHA512_F4 = (com.google.crypto.tink.signature.RsaSsaPkcs1Parameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.PredefinedSignatureParameters$$ExternalSyntheticLambda6
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.signature.RsaSsaPkcs1Parameters build;
            build = com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setHashType(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA512).setModulusSizeBits(4096).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.signature.RsaSsaPssParameters RSA_SSA_PSS_3072_SHA256_SHA256_32_F4 = (com.google.crypto.tink.signature.RsaSsaPssParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.PredefinedSignatureParameters$$ExternalSyntheticLambda7
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.signature.RsaSsaPssParameters build;
            build = com.google.crypto.tink.signature.RsaSsaPssParameters.builder().setSigHashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256).setMgf1HashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256).setSaltLengthBytes(32).setModulusSizeBits(3072).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPssParameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.TINK).build();
            return build;
        }
    });
    public static final com.google.crypto.tink.signature.RsaSsaPssParameters RSA_SSA_PSS_4096_SHA512_SHA512_64_F4 = (com.google.crypto.tink.signature.RsaSsaPssParameters) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.PredefinedSignatureParameters$$ExternalSyntheticLambda8
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.signature.RsaSsaPssParameters build;
            build = com.google.crypto.tink.signature.RsaSsaPssParameters.builder().setSigHashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512).setMgf1HashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512).setSaltLengthBytes(64).setModulusSizeBits(4096).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPssParameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.TINK).build();
            return build;
        }
    });

    private PredefinedSignatureParameters() {
    }
}
