package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class EcdsaParameters extends com.google.crypto.tink.signature.SignatureParameters {
    private final com.google.crypto.tink.signature.EcdsaParameters.CurveType curveType;
    private final com.google.crypto.tink.signature.EcdsaParameters.HashType hashType;
    private final com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding signatureEncoding;
    private final com.google.crypto.tink.signature.EcdsaParameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3903name;
        public static final com.google.crypto.tink.signature.EcdsaParameters.Variant TINK = new com.google.crypto.tink.signature.EcdsaParameters.Variant("TINK");
        public static final com.google.crypto.tink.signature.EcdsaParameters.Variant CRUNCHY = new com.google.crypto.tink.signature.EcdsaParameters.Variant("CRUNCHY");
        public static final com.google.crypto.tink.signature.EcdsaParameters.Variant LEGACY = new com.google.crypto.tink.signature.EcdsaParameters.Variant("LEGACY");
        public static final com.google.crypto.tink.signature.EcdsaParameters.Variant NO_PREFIX = new com.google.crypto.tink.signature.EcdsaParameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3903name = str;
        }

        public final java.lang.String toString() {
            return this.f3903name;
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class SignatureEncoding {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3902name;
        public static final com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding IEEE_P1363 = new com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding("IEEE_P1363");
        public static final com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding DER = new com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding(org.bouncycastle.asn1.ASN1Encoding.DER);

        private SignatureEncoding(java.lang.String str) {
            this.f3902name = str;
        }

        public final java.lang.String toString() {
            return this.f3902name;
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class CurveType {
        public static final com.google.crypto.tink.signature.EcdsaParameters.CurveType NIST_P256 = new com.google.crypto.tink.signature.EcdsaParameters.CurveType("NIST_P256", com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P256_PARAMS);
        public static final com.google.crypto.tink.signature.EcdsaParameters.CurveType NIST_P384 = new com.google.crypto.tink.signature.EcdsaParameters.CurveType("NIST_P384", com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P384_PARAMS);
        public static final com.google.crypto.tink.signature.EcdsaParameters.CurveType NIST_P521 = new com.google.crypto.tink.signature.EcdsaParameters.CurveType("NIST_P521", com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P521_PARAMS);

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3900name;
        private final java.security.spec.ECParameterSpec spec;

        private CurveType(java.lang.String str, java.security.spec.ECParameterSpec eCParameterSpec) {
            this.f3900name = str;
            this.spec = eCParameterSpec;
        }

        public final java.lang.String toString() {
            return this.f3900name;
        }

        public final java.security.spec.ECParameterSpec toParameterSpec() {
            return this.spec;
        }

        public static com.google.crypto.tink.signature.EcdsaParameters.CurveType fromParameterSpec(java.security.spec.ECParameterSpec eCParameterSpec) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters.CurveType curveType = NIST_P256;
            if (com.google.crypto.tink.internal.EllipticCurvesUtil.isSameEcParameterSpec(eCParameterSpec, curveType.toParameterSpec())) {
                return curveType;
            }
            com.google.crypto.tink.signature.EcdsaParameters.CurveType curveType2 = NIST_P384;
            if (com.google.crypto.tink.internal.EllipticCurvesUtil.isSameEcParameterSpec(eCParameterSpec, curveType2.toParameterSpec())) {
                return curveType2;
            }
            com.google.crypto.tink.signature.EcdsaParameters.CurveType curveType3 = NIST_P521;
            if (com.google.crypto.tink.internal.EllipticCurvesUtil.isSameEcParameterSpec(eCParameterSpec, curveType3.toParameterSpec())) {
                return curveType3;
            }
            throw new java.security.GeneralSecurityException("unknown ECParameterSpec");
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class HashType {
        public static final com.google.crypto.tink.signature.EcdsaParameters.HashType SHA256 = new com.google.crypto.tink.signature.EcdsaParameters.HashType("SHA256");
        public static final com.google.crypto.tink.signature.EcdsaParameters.HashType SHA384 = new com.google.crypto.tink.signature.EcdsaParameters.HashType("SHA384");
        public static final com.google.crypto.tink.signature.EcdsaParameters.HashType SHA512 = new com.google.crypto.tink.signature.EcdsaParameters.HashType("SHA512");

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3901name;

        private HashType(java.lang.String str) {
            this.f3901name = str;
        }

        public final java.lang.String toString() {
            return this.f3901name;
        }
    }

    public static final class Builder {
        private com.google.crypto.tink.signature.EcdsaParameters.CurveType curveType;
        private com.google.crypto.tink.signature.EcdsaParameters.HashType hashType;
        private com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding signatureEncoding;
        private com.google.crypto.tink.signature.EcdsaParameters.Variant variant;

        private Builder() {
            this.signatureEncoding = null;
            this.curveType = null;
            this.hashType = null;
            this.variant = com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX;
        }

        public final com.google.crypto.tink.signature.EcdsaParameters.Builder setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding signatureEncoding) {
            this.signatureEncoding = signatureEncoding;
            return this;
        }

        public final com.google.crypto.tink.signature.EcdsaParameters.Builder setCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType curveType) {
            this.curveType = curveType;
            return this;
        }

        public final com.google.crypto.tink.signature.EcdsaParameters.Builder setHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType hashType) {
            this.hashType = hashType;
            return this;
        }

        public final com.google.crypto.tink.signature.EcdsaParameters.Builder setVariant(com.google.crypto.tink.signature.EcdsaParameters.Variant variant) {
            this.variant = variant;
            return this;
        }

        public final com.google.crypto.tink.signature.EcdsaParameters build() throws java.security.GeneralSecurityException {
            if (this.signatureEncoding == null) {
                throw new java.security.GeneralSecurityException("signature encoding is not set");
            }
            com.google.crypto.tink.signature.EcdsaParameters.CurveType curveType = this.curveType;
            if (curveType == null) {
                throw new java.security.GeneralSecurityException("EC curve type is not set");
            }
            if (this.hashType == null) {
                throw new java.security.GeneralSecurityException("hash type is not set");
            }
            if (this.variant == null) {
                throw new java.security.GeneralSecurityException("variant is not set");
            }
            if (curveType == com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256 && this.hashType != com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256) {
                throw new java.security.GeneralSecurityException("NIST_P256 requires SHA256");
            }
            if (this.curveType == com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384 && this.hashType != com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA384 && this.hashType != com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512) {
                throw new java.security.GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
            }
            if (this.curveType == com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521 && this.hashType != com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512) {
                throw new java.security.GeneralSecurityException("NIST_P521 requires SHA512");
            }
            return new com.google.crypto.tink.signature.EcdsaParameters(this.signatureEncoding, this.curveType, this.hashType, this.variant);
        }
    }

    private EcdsaParameters(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding signatureEncoding, com.google.crypto.tink.signature.EcdsaParameters.CurveType curveType, com.google.crypto.tink.signature.EcdsaParameters.HashType hashType, com.google.crypto.tink.signature.EcdsaParameters.Variant variant) {
        this.signatureEncoding = signatureEncoding;
        this.curveType = curveType;
        this.hashType = hashType;
        this.variant = variant;
    }

    public static com.google.crypto.tink.signature.EcdsaParameters.Builder builder() {
        return new com.google.crypto.tink.signature.EcdsaParameters.Builder();
    }

    public final com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding getSignatureEncoding() {
        return this.signatureEncoding;
    }

    public final com.google.crypto.tink.signature.EcdsaParameters.CurveType getCurveType() {
        return this.curveType;
    }

    public final com.google.crypto.tink.signature.EcdsaParameters.HashType getHashType() {
        return this.hashType;
    }

    public final com.google.crypto.tink.signature.EcdsaParameters.Variant getVariant() {
        return this.variant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.signature.EcdsaParameters)) {
            return false;
        }
        com.google.crypto.tink.signature.EcdsaParameters ecdsaParameters = (com.google.crypto.tink.signature.EcdsaParameters) obj;
        return ecdsaParameters.getSignatureEncoding() == getSignatureEncoding() && ecdsaParameters.getCurveType() == getCurveType() && ecdsaParameters.getHashType() == getHashType() && ecdsaParameters.getVariant() == getVariant();
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.crypto.tink.signature.EcdsaParameters.class, this.signatureEncoding, this.curveType, this.hashType, this.variant);
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ECDSA Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", hashType: ");
        sb.append(this.hashType);
        sb.append(", encoding: ");
        sb.append(this.signatureEncoding);
        sb.append(", curve: ");
        sb.append(this.curveType);
        sb.append(")");
        return sb.toString();
    }
}
