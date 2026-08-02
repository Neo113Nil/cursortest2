package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
public class AesCtrHmacStreamingParameters extends com.google.crypto.tink.streamingaead.StreamingAeadParameters {
    private final java.lang.Integer ciphertextSegmentSizeBytes;
    private final java.lang.Integer derivedKeySizeBytes;
    private final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType hkdfHashType;
    private final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType hmacHashType;
    private final java.lang.Integer hmacTagSizeBytes;
    private final java.lang.Integer keySizeBytes;

    @com.google.errorprone.annotations.Immutable
    public static final class HashType {
        public static final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType SHA1 = new com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType("SHA1");
        public static final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType SHA256 = new com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType("SHA256");
        public static final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType SHA512 = new com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType("SHA512");

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3909name;

        private HashType(java.lang.String str) {
            this.f3909name = str;
        }

        public final java.lang.String toString() {
            return this.f3909name;
        }
    }

    public static com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.Builder builder() {
        return new com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.Builder();
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer keySizeBytes = null;

        @javax.annotation.Nullable
        private java.lang.Integer derivedKeySizeBytes = null;

        @javax.annotation.Nullable
        private com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType hkdfHashType = null;

        @javax.annotation.Nullable
        private com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType hmacHashType = null;

        @javax.annotation.Nullable
        private java.lang.Integer hmacTagSizeBytes = null;

        @javax.annotation.Nullable
        private java.lang.Integer ciphertextSegmentSizeBytes = null;

        public final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.Builder setKeySizeBytes(int i) {
            this.keySizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.Builder setDerivedKeySizeBytes(int i) {
            this.derivedKeySizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.Builder setHkdfHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType hashType) {
            this.hkdfHashType = hashType;
            return this;
        }

        public final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.Builder setHmacHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType hashType) {
            this.hmacHashType = hashType;
            return this;
        }

        public final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.Builder setHmacTagSizeBytes(java.lang.Integer num) {
            this.hmacTagSizeBytes = num;
            return this;
        }

        public final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.Builder setCiphertextSegmentSizeBytes(int i) {
            this.ciphertextSegmentSizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters build() throws java.security.GeneralSecurityException {
            if (this.keySizeBytes == null) {
                throw new java.security.GeneralSecurityException("keySizeBytes needs to be set");
            }
            java.lang.Integer num = this.derivedKeySizeBytes;
            if (num == null) {
                throw new java.security.GeneralSecurityException("derivedKeySizeBytes needs to be set");
            }
            if (this.hkdfHashType == null) {
                throw new java.security.GeneralSecurityException("hkdfHashType needs to be set");
            }
            if (this.hmacHashType == null) {
                throw new java.security.GeneralSecurityException("hmacHashType needs to be set");
            }
            if (this.hmacTagSizeBytes == null) {
                throw new java.security.GeneralSecurityException("hmacTagSizeBytes needs to be set");
            }
            if (this.ciphertextSegmentSizeBytes == null) {
                throw new java.security.GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
            }
            if (num.intValue() != 16 && this.derivedKeySizeBytes.intValue() != 32) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("derivedKeySizeBytes needs to be 16 or 32, not ");
                sb.append(this.derivedKeySizeBytes);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            if (this.keySizeBytes.intValue() < this.derivedKeySizeBytes.intValue()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("keySizeBytes needs to be at least derivedKeySizeBytes, i.e., ");
                sb2.append(this.derivedKeySizeBytes);
                throw new java.security.GeneralSecurityException(sb2.toString());
            }
            if (this.ciphertextSegmentSizeBytes.intValue() <= this.derivedKeySizeBytes.intValue() + this.hmacTagSizeBytes.intValue() + 8) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("ciphertextSegmentSizeBytes needs to be at least derivedKeySizeBytes + hmacTagSizeBytes + 9, i.e., ");
                sb3.append(this.derivedKeySizeBytes.intValue() + this.hmacTagSizeBytes.intValue() + 9);
                throw new java.security.GeneralSecurityException(sb3.toString());
            }
            int i = this.hmacHashType != com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256 ? this.hmacHashType == com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA1 ? 20 : 0 : 32;
            if (this.hmacHashType == com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA512) {
                i = 64;
            }
            if (this.hmacTagSizeBytes.intValue() < 10 || this.hmacTagSizeBytes.intValue() > i) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("hmacTagSize must be in range [10, ");
                sb4.append(i);
                sb4.append("], but is ");
                sb4.append(this.hmacTagSizeBytes);
                throw new java.security.GeneralSecurityException(sb4.toString());
            }
            return new com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters(this.keySizeBytes, this.derivedKeySizeBytes, this.hkdfHashType, this.hmacHashType, this.hmacTagSizeBytes, this.ciphertextSegmentSizeBytes);
        }
    }

    private AesCtrHmacStreamingParameters(java.lang.Integer num, java.lang.Integer num2, com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType hashType, com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType hashType2, java.lang.Integer num3, java.lang.Integer num4) {
        this.keySizeBytes = num;
        this.derivedKeySizeBytes = num2;
        this.hkdfHashType = hashType;
        this.hmacHashType = hashType2;
        this.hmacTagSizeBytes = num3;
        this.ciphertextSegmentSizeBytes = num4;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes.intValue();
    }

    public int getDerivedKeySizeBytes() {
        return this.derivedKeySizeBytes.intValue();
    }

    public com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType getHkdfHashType() {
        return this.hkdfHashType;
    }

    public com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType getHmacHashType() {
        return this.hmacHashType;
    }

    public int getHmacTagSizeBytes() {
        return this.hmacTagSizeBytes.intValue();
    }

    public int getCiphertextSegmentSizeBytes() {
        return this.ciphertextSegmentSizeBytes.intValue();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters)) {
            return false;
        }
        com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters aesCtrHmacStreamingParameters = (com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters) obj;
        return aesCtrHmacStreamingParameters.getKeySizeBytes() == getKeySizeBytes() && aesCtrHmacStreamingParameters.getDerivedKeySizeBytes() == getDerivedKeySizeBytes() && aesCtrHmacStreamingParameters.getHkdfHashType() == getHkdfHashType() && aesCtrHmacStreamingParameters.getHmacHashType() == getHmacHashType() && aesCtrHmacStreamingParameters.getHmacTagSizeBytes() == getHmacTagSizeBytes() && aesCtrHmacStreamingParameters.getCiphertextSegmentSizeBytes() == getCiphertextSegmentSizeBytes();
    }

    public int hashCode() {
        return java.util.Objects.hash(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.class, this.keySizeBytes, this.derivedKeySizeBytes, this.hkdfHashType, this.hmacHashType, this.hmacTagSizeBytes, this.ciphertextSegmentSizeBytes);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AesCtrHmacStreaming Parameters (IKM size: ");
        sb.append(this.keySizeBytes);
        sb.append(", ");
        sb.append(this.derivedKeySizeBytes);
        sb.append("-byte AES key, ");
        sb.append(this.hkdfHashType);
        sb.append(" for HKDF, ");
        sb.append(this.hkdfHashType);
        sb.append(" for HMAC, ");
        sb.append(this.hmacTagSizeBytes);
        sb.append("-byte tags, ");
        sb.append(this.ciphertextSegmentSizeBytes);
        sb.append("-byte ciphertexts)");
        return sb.toString();
    }
}
