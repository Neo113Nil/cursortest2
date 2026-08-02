package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class RsaSsaPssParameters extends com.google.crypto.tink.signature.SignatureParameters {
    public static final java.math.BigInteger F4 = java.math.BigInteger.valueOf(65537);
    private final com.google.crypto.tink.signature.RsaSsaPssParameters.HashType mgf1HashType;
    private final int modulusSizeBits;
    private final java.math.BigInteger publicExponent;
    private final int saltLengthBytes;
    private final com.google.crypto.tink.signature.RsaSsaPssParameters.HashType sigHashType;
    private final com.google.crypto.tink.signature.RsaSsaPssParameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3908name;
        public static final com.google.crypto.tink.signature.RsaSsaPssParameters.Variant TINK = new com.google.crypto.tink.signature.RsaSsaPssParameters.Variant("TINK");
        public static final com.google.crypto.tink.signature.RsaSsaPssParameters.Variant CRUNCHY = new com.google.crypto.tink.signature.RsaSsaPssParameters.Variant("CRUNCHY");
        public static final com.google.crypto.tink.signature.RsaSsaPssParameters.Variant LEGACY = new com.google.crypto.tink.signature.RsaSsaPssParameters.Variant("LEGACY");
        public static final com.google.crypto.tink.signature.RsaSsaPssParameters.Variant NO_PREFIX = new com.google.crypto.tink.signature.RsaSsaPssParameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3908name = str;
        }

        public final java.lang.String toString() {
            return this.f3908name;
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class HashType {
        public static final com.google.crypto.tink.signature.RsaSsaPssParameters.HashType SHA256 = new com.google.crypto.tink.signature.RsaSsaPssParameters.HashType("SHA256");
        public static final com.google.crypto.tink.signature.RsaSsaPssParameters.HashType SHA384 = new com.google.crypto.tink.signature.RsaSsaPssParameters.HashType("SHA384");
        public static final com.google.crypto.tink.signature.RsaSsaPssParameters.HashType SHA512 = new com.google.crypto.tink.signature.RsaSsaPssParameters.HashType("SHA512");

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3907name;

        private HashType(java.lang.String str) {
            this.f3907name = str;
        }

        public final java.lang.String toString() {
            return this.f3907name;
        }
    }

    public static final class Builder {
        private static final int MIN_RSA_MODULUS_SIZE = 2048;
        private static final java.math.BigInteger PUBLIC_EXPONENT_UPPER_BOUND;
        private static final java.math.BigInteger TWO;

        @javax.annotation.Nullable
        private com.google.crypto.tink.signature.RsaSsaPssParameters.HashType mgf1HashType;

        @javax.annotation.Nullable
        private java.lang.Integer modulusSizeBits;

        @javax.annotation.Nullable
        private java.math.BigInteger publicExponent;

        @javax.annotation.Nullable
        private java.lang.Integer saltLengthBytes;

        @javax.annotation.Nullable
        private com.google.crypto.tink.signature.RsaSsaPssParameters.HashType sigHashType;
        private com.google.crypto.tink.signature.RsaSsaPssParameters.Variant variant;

        private Builder() {
            this.modulusSizeBits = null;
            this.publicExponent = com.google.crypto.tink.signature.RsaSsaPssParameters.F4;
            this.sigHashType = null;
            this.mgf1HashType = null;
            this.saltLengthBytes = null;
            this.variant = com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.NO_PREFIX;
        }

        public final com.google.crypto.tink.signature.RsaSsaPssParameters.Builder setModulusSizeBits(int i) {
            this.modulusSizeBits = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.signature.RsaSsaPssParameters.Builder setPublicExponent(java.math.BigInteger bigInteger) {
            this.publicExponent = bigInteger;
            return this;
        }

        public final com.google.crypto.tink.signature.RsaSsaPssParameters.Builder setVariant(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant variant) {
            this.variant = variant;
            return this;
        }

        public final com.google.crypto.tink.signature.RsaSsaPssParameters.Builder setSigHashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType hashType) {
            this.sigHashType = hashType;
            return this;
        }

        public final com.google.crypto.tink.signature.RsaSsaPssParameters.Builder setMgf1HashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType hashType) {
            this.mgf1HashType = hashType;
            return this;
        }

        public final com.google.crypto.tink.signature.RsaSsaPssParameters.Builder setSaltLengthBytes(int i) throws java.security.GeneralSecurityException {
            if (i < 0) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid salt length in bytes %d; salt length must be positive", java.lang.Integer.valueOf(i)));
            }
            this.saltLengthBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        static {
            java.math.BigInteger valueOf = java.math.BigInteger.valueOf(2L);
            TWO = valueOf;
            PUBLIC_EXPONENT_UPPER_BOUND = valueOf.pow(256);
        }

        private void validatePublicExponent(java.math.BigInteger bigInteger) throws java.security.InvalidAlgorithmParameterException {
            int compareTo = bigInteger.compareTo(com.google.crypto.tink.signature.RsaSsaPssParameters.F4);
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

        public final com.google.crypto.tink.signature.RsaSsaPssParameters build() throws java.security.GeneralSecurityException {
            java.lang.Integer num = this.modulusSizeBits;
            if (num == null) {
                throw new java.security.GeneralSecurityException("key size is not set");
            }
            if (this.publicExponent == null) {
                throw new java.security.GeneralSecurityException("publicExponent is not set");
            }
            if (this.sigHashType == null) {
                throw new java.security.GeneralSecurityException("signature hash type is not set");
            }
            if (this.mgf1HashType == null) {
                throw new java.security.GeneralSecurityException("mgf1 hash type is not set");
            }
            if (this.variant == null) {
                throw new java.security.GeneralSecurityException("variant is not set");
            }
            if (this.saltLengthBytes == null) {
                throw new java.security.GeneralSecurityException("salt length is not set");
            }
            if (num.intValue() < 2048) {
                throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; must be at least %d bits", this.modulusSizeBits, 2048));
            }
            if (this.sigHashType != this.mgf1HashType) {
                throw new java.security.GeneralSecurityException("MGF1 hash is different from signature hash");
            }
            validatePublicExponent(this.publicExponent);
            return new com.google.crypto.tink.signature.RsaSsaPssParameters(this.modulusSizeBits.intValue(), this.publicExponent, this.variant, this.sigHashType, this.mgf1HashType, this.saltLengthBytes.intValue());
        }
    }

    private RsaSsaPssParameters(int i, java.math.BigInteger bigInteger, com.google.crypto.tink.signature.RsaSsaPssParameters.Variant variant, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType hashType, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType hashType2, int i2) {
        this.modulusSizeBits = i;
        this.publicExponent = bigInteger;
        this.variant = variant;
        this.sigHashType = hashType;
        this.mgf1HashType = hashType2;
        this.saltLengthBytes = i2;
    }

    public static com.google.crypto.tink.signature.RsaSsaPssParameters.Builder builder() {
        return new com.google.crypto.tink.signature.RsaSsaPssParameters.Builder();
    }

    public final int getModulusSizeBits() {
        return this.modulusSizeBits;
    }

    public final java.math.BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    public final com.google.crypto.tink.signature.RsaSsaPssParameters.Variant getVariant() {
        return this.variant;
    }

    public final com.google.crypto.tink.signature.RsaSsaPssParameters.HashType getSigHashType() {
        return this.sigHashType;
    }

    public final com.google.crypto.tink.signature.RsaSsaPssParameters.HashType getMgf1HashType() {
        return this.mgf1HashType;
    }

    public final int getSaltLengthBytes() {
        return this.saltLengthBytes;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.signature.RsaSsaPssParameters)) {
            return false;
        }
        com.google.crypto.tink.signature.RsaSsaPssParameters rsaSsaPssParameters = (com.google.crypto.tink.signature.RsaSsaPssParameters) obj;
        return rsaSsaPssParameters.getModulusSizeBits() == getModulusSizeBits() && java.util.Objects.equals(rsaSsaPssParameters.getPublicExponent(), getPublicExponent()) && java.util.Objects.equals(rsaSsaPssParameters.getVariant(), getVariant()) && java.util.Objects.equals(rsaSsaPssParameters.getSigHashType(), getSigHashType()) && java.util.Objects.equals(rsaSsaPssParameters.getMgf1HashType(), getMgf1HashType()) && rsaSsaPssParameters.getSaltLengthBytes() == getSaltLengthBytes();
    }

    public final int hashCode() {
        int i = this.modulusSizeBits;
        return java.util.Objects.hash(com.google.crypto.tink.signature.RsaSsaPssParameters.class, java.lang.Integer.valueOf(i), this.publicExponent, this.variant, this.sigHashType, this.mgf1HashType, java.lang.Integer.valueOf(this.saltLengthBytes));
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.NO_PREFIX;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RSA SSA PSS Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", signature hashType: ");
        sb.append(this.sigHashType);
        sb.append(", mgf1 hashType: ");
        sb.append(this.mgf1HashType);
        sb.append(", saltLengthBytes: ");
        sb.append(this.saltLengthBytes);
        sb.append(", publicExponent: ");
        sb.append(this.publicExponent);
        sb.append(", and ");
        sb.append(this.modulusSizeBits);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
