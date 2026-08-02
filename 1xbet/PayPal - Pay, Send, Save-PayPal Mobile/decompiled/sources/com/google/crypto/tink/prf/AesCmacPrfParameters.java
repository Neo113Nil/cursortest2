package com.google.crypto.tink.prf;

/* loaded from: classes9.dex */
public final class AesCmacPrfParameters extends com.google.crypto.tink.prf.PrfParameters {
    private final int keySizeBytes;

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return false;
    }

    public static com.google.crypto.tink.prf.AesCmacPrfParameters create(int i) throws java.security.GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 128-bit and 256-bit are supported", java.lang.Integer.valueOf(i * 8)));
        }
        return new com.google.crypto.tink.prf.AesCmacPrfParameters(i);
    }

    private AesCmacPrfParameters(int i) {
        this.keySizeBytes = i;
    }

    public final int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.crypto.tink.prf.AesCmacPrfParameters) && ((com.google.crypto.tink.prf.AesCmacPrfParameters) obj).getKeySizeBytes() == getKeySizeBytes();
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.crypto.tink.prf.AesCmacPrfParameters.class, java.lang.Integer.valueOf(this.keySizeBytes));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AesCmac PRF Parameters (");
        sb.append(this.keySizeBytes);
        sb.append("-byte key)");
        return sb.toString();
    }
}
