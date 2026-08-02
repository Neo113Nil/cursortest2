package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class RsaSsaPkcs1Parameters extends com.google.crypto.tink.signature.SignatureParameters {
    public static final java.math.BigInteger F4 = java.math.BigInteger.valueOf(65537);
    private final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType hashType;
    private final int modulusSizeBits;
    private final java.math.BigInteger publicExponent;
    private final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3906name;
        public static final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant TINK = new com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant("TINK");
        public static final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant CRUNCHY = new com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant("CRUNCHY");
        public static final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant LEGACY = new com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant("LEGACY");
        public static final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant NO_PREFIX = new com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3906name = str;
        }

        public final java.lang.String toString() {
            return this.f3906name;
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class HashType {
        public static final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType SHA256 = new com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType("SHA256");
        public static final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType SHA384 = new com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType("SHA384");
        public static final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType SHA512 = new com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType("SHA512");

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3905name;

        private HashType(java.lang.String str) {
            this.f3905name = str;
        }

        public final java.lang.String toString() {
            return this.f3905name;
        }
    }

    public static final class Builder {
        private static final java.math.BigInteger PUBLIC_EXPONENT_UPPER_BOUND;
        private static final java.math.BigInteger TWO;

        @javax.annotation.Nullable
        private com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType hashType;

        @javax.annotation.Nullable
        private java.lang.Integer modulusSizeBits;

        @javax.annotation.Nullable
        private java.math.BigInteger publicExponent;
        private com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant variant;

        private Builder() {
            this.modulusSizeBits = null;
            this.publicExponent = com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.F4;
            this.hashType = null;
            this.variant = com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.NO_PREFIX;
        }

        public final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Builder setModulusSizeBits(int i) {
            this.modulusSizeBits = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Builder setPublicExponent(java.math.BigInteger bigInteger) {
            this.publicExponent = bigInteger;
            return this;
        }

        public final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Builder setVariant(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant variant) {
            this.variant = variant;
            return this;
        }

        public final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Builder setHashType(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType hashType) {
            this.hashType = hashType;
            return this;
        }

        static {
            java.math.BigInteger valueOf = java.math.BigInteger.valueOf(2L);
            TWO = valueOf;
            PUBLIC_EXPONENT_UPPER_BOUND = valueOf.pow(256);
        }

        private void validatePublicExponent(java.math.BigInteger bigInteger) throws java.security.InvalidAlgorithmParameterException {
            int compareTo = bigInteger.compareTo(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.F4);
            if (compareTo != 0) {
                if (compareTo < 0) {
                    throw new java.security.InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
                }
                if (bigInteger.mod(TWO).equals(java.math.BigInteger.ZERO)) {
                    throw new java.security.InvalidAlgorithmParameterException("Invalid public exponent");
                }
                if (bigInteger.compareTo(PUBLIC_EXPONENT_UPPER_BOUND) > 0) {
                    throw new java.security.InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
                }
            }
        }

        public final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters build() throws java.security.GeneralSecurityException {
            java.lang.Integer num = this.modulusSizeBits;
            if (num == null) {
                throw new java.security.GeneralSecurityException("key size is not set");
            }
            if (this.publicExponent == null) {
                throw new java.security.GeneralSecurityException("publicExponent is not set");
            }
            if (this.hashType == null) {
                throw new java.security.GeneralSecurityException("hash type is not set");
            }
            if (this.variant == null) {
                throw new java.security.GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 2048) {
                throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.modulusSizeBits));
            }
            validatePublicExponent(this.publicExponent);
            return new com.google.crypto.tink.signature.RsaSsaPkcs1Parameters(this.modulusSizeBits.intValue(), this.publicExponent, this.variant, this.hashType);
        }
    }

    private RsaSsaPkcs1Parameters(int i, java.math.BigInteger bigInteger, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant variant, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType hashType) {
        this.modulusSizeBits = i;
        this.publicExponent = bigInteger;
        this.variant = variant;
        this.hashType = hashType;
    }

    public static com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Builder builder() {
        return new com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Builder();
    }

    public final int getModulusSizeBits() {
        return this.modulusSizeBits;
    }

    public final java.math.BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    public final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant getVariant() {
        return this.variant;
    }

    public final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType getHashType() {
        return this.hashType;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.signature.RsaSsaPkcs1Parameters)) {
            return false;
        }
        com.google.crypto.tink.signature.RsaSsaPkcs1Parameters rsaSsaPkcs1Parameters = (com.google.crypto.tink.signature.RsaSsaPkcs1Parameters) obj;
        return rsaSsaPkcs1Parameters.getModulusSizeBits() == getModulusSizeBits() && java.util.Objects.equals(rsaSsaPkcs1Parameters.getPublicExponent(), getPublicExponent()) && rsaSsaPkcs1Parameters.getVariant() == getVariant() && rsaSsaPkcs1Parameters.getHashType() == getHashType();
    }

    public final int hashCode() {
        int i = this.modulusSizeBits;
        return java.util.Objects.hash(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.class, java.lang.Integer.valueOf(i), this.publicExponent, this.variant, this.hashType);
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.NO_PREFIX;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RSA SSA PKCS1 Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", hashType: ");
        sb.append(this.hashType);
        sb.append(", publicExponent: ");
        sb.append(this.publicExponent);
        sb.append(", and ");
        sb.append(this.modulusSizeBits);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
