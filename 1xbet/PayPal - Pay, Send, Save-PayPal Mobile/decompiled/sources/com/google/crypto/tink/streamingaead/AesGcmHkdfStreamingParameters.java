package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
public class AesGcmHkdfStreamingParameters extends com.google.crypto.tink.streamingaead.StreamingAeadParameters {
    private final java.lang.Integer ciphertextSegmentSizeBytes;
    private final java.lang.Integer derivedAesGcmKeySizeBytes;
    private final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType hkdfHashType;
    private final java.lang.Integer keySizeBytes;

    @com.google.errorprone.annotations.Immutable
    public static final class HashType {
        public static final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType SHA1 = new com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType("SHA1");
        public static final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType SHA256 = new com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType("SHA256");
        public static final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType SHA512 = new com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType("SHA512");

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3910name;

        private HashType(java.lang.String str) {
            this.f3910name = str;
        }

        public final java.lang.String toString() {
            return this.f3910name;
        }
    }

    public static com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.Builder builder() {
        return new com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.Builder();
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer keySizeBytes = null;

        @javax.annotation.Nullable
        private java.lang.Integer derivedAesGcmKeySizeBytes = null;

        @javax.annotation.Nullable
        private com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType hkdfHashType = null;

        @javax.annotation.Nullable
        private java.lang.Integer ciphertextSegmentSizeBytes = null;

        public final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.Builder setKeySizeBytes(int i) {
            this.keySizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.Builder setDerivedAesGcmKeySizeBytes(int i) {
            this.derivedAesGcmKeySizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.Builder setHkdfHashType(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType hashType) {
            this.hkdfHashType = hashType;
            return this;
        }

        public final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.Builder setCiphertextSegmentSizeBytes(int i) {
            this.ciphertextSegmentSizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters build() throws java.security.GeneralSecurityException {
            if (this.keySizeBytes == null) {
                throw new java.security.GeneralSecurityException("keySizeBytes needs to be set");
            }
            java.lang.Integer num = this.derivedAesGcmKeySizeBytes;
            if (num == null) {
                throw new java.security.GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be set");
            }
            if (this.hkdfHashType == null) {
                throw new java.security.GeneralSecurityException("hkdfHashType needs to be set");
            }
            if (this.ciphertextSegmentSizeBytes == null) {
                throw new java.security.GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
            }
            if (num.intValue() != 16 && this.derivedAesGcmKeySizeBytes.intValue() != 32) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("derivedAesGcmKeySizeBytes needs to be 16 or 32, not ");
                sb.append(this.derivedAesGcmKeySizeBytes);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            if (this.keySizeBytes.intValue() < this.derivedAesGcmKeySizeBytes.intValue()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("keySizeBytes needs to be at least derivedAesGcmKeySizeBytes, i.e., ");
                sb2.append(this.derivedAesGcmKeySizeBytes);
                throw new java.security.GeneralSecurityException(sb2.toString());
            }
            if (this.ciphertextSegmentSizeBytes.intValue() <= this.derivedAesGcmKeySizeBytes.intValue() + 24) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("ciphertextSegmentSizeBytes needs to be at least derivedAesGcmKeySizeBytes + 25, i.e., ");
                sb3.append(this.derivedAesGcmKeySizeBytes.intValue() + 25);
                throw new java.security.GeneralSecurityException(sb3.toString());
            }
            return new com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters(this.keySizeBytes, this.derivedAesGcmKeySizeBytes, this.hkdfHashType, this.ciphertextSegmentSizeBytes);
        }
    }

    private AesGcmHkdfStreamingParameters(java.lang.Integer num, java.lang.Integer num2, com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType hashType, java.lang.Integer num3) {
        this.keySizeBytes = num;
        this.derivedAesGcmKeySizeBytes = num2;
        this.hkdfHashType = hashType;
        this.ciphertextSegmentSizeBytes = num3;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes.intValue();
    }

    public int getDerivedAesGcmKeySizeBytes() {
        return this.derivedAesGcmKeySizeBytes.intValue();
    }

    public com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType getHkdfHashType() {
        return this.hkdfHashType;
    }

    public int getCiphertextSegmentSizeBytes() {
        return this.ciphertextSegmentSizeBytes.intValue();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters)) {
            return false;
        }
        com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters aesGcmHkdfStreamingParameters = (com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters) obj;
        return aesGcmHkdfStreamingParameters.getKeySizeBytes() == getKeySizeBytes() && aesGcmHkdfStreamingParameters.getDerivedAesGcmKeySizeBytes() == getDerivedAesGcmKeySizeBytes() && aesGcmHkdfStreamingParameters.getHkdfHashType() == getHkdfHashType() && aesGcmHkdfStreamingParameters.getCiphertextSegmentSizeBytes() == getCiphertextSegmentSizeBytes();
    }

    public int hashCode() {
        return java.util.Objects.hash(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.class, this.keySizeBytes, this.derivedAesGcmKeySizeBytes, this.hkdfHashType, this.ciphertextSegmentSizeBytes);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AesGcmHkdfStreaming Parameters (IKM size: ");
        sb.append(this.keySizeBytes);
        sb.append(", ");
        sb.append(this.derivedAesGcmKeySizeBytes);
        sb.append("-byte AES GCM key, ");
        sb.append(this.hkdfHashType);
        sb.append(" for HKDF ");
        sb.append(this.ciphertextSegmentSizeBytes);
        sb.append("-byte ciphertexts)");
        return sb.toString();
    }
}
