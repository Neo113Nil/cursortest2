package com.google.crypto.tink.hybrid;

/* loaded from: classes9.dex */
public final class EciesParameters extends com.google.crypto.tink.hybrid.HybridParameters {
    private static final java.util.Set<com.google.crypto.tink.Parameters> acceptedDemParameters = (java.util.Set) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.hybrid.EciesParameters$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            java.util.Set listAcceptedDemParameters;
            listAcceptedDemParameters = com.google.crypto.tink.hybrid.EciesParameters.listAcceptedDemParameters();
            return listAcceptedDemParameters;
        }
    });
    private final com.google.crypto.tink.hybrid.EciesParameters.CurveType curveType;
    private final com.google.crypto.tink.Parameters demParameters;
    private final com.google.crypto.tink.hybrid.EciesParameters.HashType hashType;

    @javax.annotation.Nullable
    private final com.google.crypto.tink.hybrid.EciesParameters.PointFormat nistCurvePointFormat;

    @javax.annotation.Nullable
    private final com.google.crypto.tink.util.Bytes salt;
    private final com.google.crypto.tink.hybrid.EciesParameters.Variant variant;

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Set<com.google.crypto.tink.Parameters> listAcceptedDemParameters() throws java.security.GeneralSecurityException {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build());
        hashSet.add(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build());
        hashSet.add(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(16).setHmacKeySizeBytes(32).setTagSizeBytes(16).setIvSizeBytes(16).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX).build());
        hashSet.add(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(32).setHmacKeySizeBytes(32).setTagSizeBytes(32).setIvSizeBytes(16).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX).build());
        hashSet.add(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.create());
        hashSet.add(com.google.crypto.tink.daead.AesSivParameters.builder().setKeySizeBytes(64).setVariant(com.google.crypto.tink.daead.AesSivParameters.Variant.NO_PREFIX).build());
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3884name;
        public static final com.google.crypto.tink.hybrid.EciesParameters.Variant TINK = new com.google.crypto.tink.hybrid.EciesParameters.Variant("TINK");
        public static final com.google.crypto.tink.hybrid.EciesParameters.Variant CRUNCHY = new com.google.crypto.tink.hybrid.EciesParameters.Variant("CRUNCHY");
        public static final com.google.crypto.tink.hybrid.EciesParameters.Variant NO_PREFIX = new com.google.crypto.tink.hybrid.EciesParameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3884name = str;
        }

        public final java.lang.String toString() {
            return this.f3884name;
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class CurveType {
        public static final com.google.crypto.tink.hybrid.EciesParameters.CurveType NIST_P256 = new com.google.crypto.tink.hybrid.EciesParameters.CurveType("NIST_P256");
        public static final com.google.crypto.tink.hybrid.EciesParameters.CurveType NIST_P384 = new com.google.crypto.tink.hybrid.EciesParameters.CurveType("NIST_P384");
        public static final com.google.crypto.tink.hybrid.EciesParameters.CurveType NIST_P521 = new com.google.crypto.tink.hybrid.EciesParameters.CurveType("NIST_P521");
        public static final com.google.crypto.tink.hybrid.EciesParameters.CurveType X25519 = new com.google.crypto.tink.hybrid.EciesParameters.CurveType("X25519");

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3881name;

        private CurveType(java.lang.String str) {
            this.f3881name = str;
        }

        public final java.lang.String toString() {
            return this.f3881name;
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class HashType {
        public static final com.google.crypto.tink.hybrid.EciesParameters.HashType SHA1 = new com.google.crypto.tink.hybrid.EciesParameters.HashType("SHA1");
        public static final com.google.crypto.tink.hybrid.EciesParameters.HashType SHA224 = new com.google.crypto.tink.hybrid.EciesParameters.HashType("SHA224");
        public static final com.google.crypto.tink.hybrid.EciesParameters.HashType SHA256 = new com.google.crypto.tink.hybrid.EciesParameters.HashType("SHA256");
        public static final com.google.crypto.tink.hybrid.EciesParameters.HashType SHA384 = new com.google.crypto.tink.hybrid.EciesParameters.HashType("SHA384");
        public static final com.google.crypto.tink.hybrid.EciesParameters.HashType SHA512 = new com.google.crypto.tink.hybrid.EciesParameters.HashType("SHA512");

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3882name;

        private HashType(java.lang.String str) {
            this.f3882name = str;
        }

        public final java.lang.String toString() {
            return this.f3882name;
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class PointFormat {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3883name;
        public static final com.google.crypto.tink.hybrid.EciesParameters.PointFormat COMPRESSED = new com.google.crypto.tink.hybrid.EciesParameters.PointFormat("COMPRESSED");
        public static final com.google.crypto.tink.hybrid.EciesParameters.PointFormat UNCOMPRESSED = new com.google.crypto.tink.hybrid.EciesParameters.PointFormat("UNCOMPRESSED");
        public static final com.google.crypto.tink.hybrid.EciesParameters.PointFormat LEGACY_UNCOMPRESSED = new com.google.crypto.tink.hybrid.EciesParameters.PointFormat("LEGACY_UNCOMPRESSED");

        private PointFormat(java.lang.String str) {
            this.f3883name = str;
        }

        public final java.lang.String toString() {
            return this.f3883name;
        }
    }

    public static final class Builder {
        private com.google.crypto.tink.hybrid.EciesParameters.CurveType curveType;
        private com.google.crypto.tink.Parameters demParameters;
        private com.google.crypto.tink.hybrid.EciesParameters.HashType hashType;
        private com.google.crypto.tink.hybrid.EciesParameters.PointFormat nistCurvePointFormat;

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.Bytes salt;
        private com.google.crypto.tink.hybrid.EciesParameters.Variant variant;

        private Builder() {
            this.curveType = null;
            this.hashType = null;
            this.nistCurvePointFormat = null;
            this.demParameters = null;
            this.variant = com.google.crypto.tink.hybrid.EciesParameters.Variant.NO_PREFIX;
            this.salt = null;
        }

        public final com.google.crypto.tink.hybrid.EciesParameters.Builder setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType curveType) {
            this.curveType = curveType;
            return this;
        }

        public final com.google.crypto.tink.hybrid.EciesParameters.Builder setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType hashType) {
            this.hashType = hashType;
            return this;
        }

        public final com.google.crypto.tink.hybrid.EciesParameters.Builder setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat pointFormat) {
            this.nistCurvePointFormat = pointFormat;
            return this;
        }

        public final com.google.crypto.tink.hybrid.EciesParameters.Builder setDemParameters(com.google.crypto.tink.Parameters parameters) throws java.security.GeneralSecurityException {
            if (!com.google.crypto.tink.hybrid.EciesParameters.acceptedDemParameters.contains(parameters)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid DEM parameters ");
                sb.append(parameters);
                sb.append("; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported.");
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            this.demParameters = parameters;
            return this;
        }

        public final com.google.crypto.tink.hybrid.EciesParameters.Builder setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant variant) {
            this.variant = variant;
            return this;
        }

        public final com.google.crypto.tink.hybrid.EciesParameters.Builder setSalt(com.google.crypto.tink.util.Bytes bytes) {
            if (bytes.size() == 0) {
                this.salt = null;
                return this;
            }
            this.salt = bytes;
            return this;
        }

        public final com.google.crypto.tink.hybrid.EciesParameters build() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.hybrid.EciesParameters.CurveType curveType = this.curveType;
            if (curveType == null) {
                throw new java.security.GeneralSecurityException("Elliptic curve type is not set");
            }
            if (this.hashType == null) {
                throw new java.security.GeneralSecurityException("Hash type is not set");
            }
            if (this.demParameters == null) {
                throw new java.security.GeneralSecurityException("DEM parameters are not set");
            }
            if (this.variant == null) {
                throw new java.security.GeneralSecurityException("Variant is not set");
            }
            if (curveType != com.google.crypto.tink.hybrid.EciesParameters.CurveType.X25519 && this.nistCurvePointFormat == null) {
                throw new java.security.GeneralSecurityException("Point format is not set");
            }
            if (this.curveType == com.google.crypto.tink.hybrid.EciesParameters.CurveType.X25519 && this.nistCurvePointFormat != null) {
                throw new java.security.GeneralSecurityException("For Curve25519 point format must not be set");
            }
            return new com.google.crypto.tink.hybrid.EciesParameters(this.curveType, this.hashType, this.nistCurvePointFormat, this.demParameters, this.variant, this.salt);
        }
    }

    private EciesParameters(com.google.crypto.tink.hybrid.EciesParameters.CurveType curveType, com.google.crypto.tink.hybrid.EciesParameters.HashType hashType, @javax.annotation.Nullable com.google.crypto.tink.hybrid.EciesParameters.PointFormat pointFormat, com.google.crypto.tink.Parameters parameters, com.google.crypto.tink.hybrid.EciesParameters.Variant variant, com.google.crypto.tink.util.Bytes bytes) {
        this.curveType = curveType;
        this.hashType = hashType;
        this.nistCurvePointFormat = pointFormat;
        this.demParameters = parameters;
        this.variant = variant;
        this.salt = bytes;
    }

    public static com.google.crypto.tink.hybrid.EciesParameters.Builder builder() {
        return new com.google.crypto.tink.hybrid.EciesParameters.Builder();
    }

    public final com.google.crypto.tink.hybrid.EciesParameters.CurveType getCurveType() {
        return this.curveType;
    }

    public final com.google.crypto.tink.hybrid.EciesParameters.HashType getHashType() {
        return this.hashType;
    }

    @javax.annotation.Nullable
    public final com.google.crypto.tink.hybrid.EciesParameters.PointFormat getNistCurvePointFormat() {
        return this.nistCurvePointFormat;
    }

    public final com.google.crypto.tink.Parameters getDemParameters() {
        return this.demParameters;
    }

    public final com.google.crypto.tink.hybrid.EciesParameters.Variant getVariant() {
        return this.variant;
    }

    @javax.annotation.Nullable
    public final com.google.crypto.tink.util.Bytes getSalt() {
        return this.salt;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.hybrid.EciesParameters.Variant.NO_PREFIX;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.hybrid.EciesParameters)) {
            return false;
        }
        com.google.crypto.tink.hybrid.EciesParameters eciesParameters = (com.google.crypto.tink.hybrid.EciesParameters) obj;
        return java.util.Objects.equals(eciesParameters.getCurveType(), getCurveType()) && java.util.Objects.equals(eciesParameters.getHashType(), getHashType()) && java.util.Objects.equals(eciesParameters.getNistCurvePointFormat(), getNistCurvePointFormat()) && java.util.Objects.equals(eciesParameters.getDemParameters(), getDemParameters()) && java.util.Objects.equals(eciesParameters.getVariant(), getVariant()) && java.util.Objects.equals(eciesParameters.getSalt(), getSalt());
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.crypto.tink.hybrid.EciesParameters.class, this.curveType, this.hashType, this.nistCurvePointFormat, this.demParameters, this.variant, this.salt);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.curveType, this.hashType, this.nistCurvePointFormat, this.demParameters, this.variant, this.salt);
    }
}
