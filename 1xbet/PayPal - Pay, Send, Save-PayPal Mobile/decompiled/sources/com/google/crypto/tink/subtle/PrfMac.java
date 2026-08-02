package com.google.crypto.tink.subtle;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public class PrfMac implements com.google.crypto.tink.Mac {
    static final int MIN_TAG_SIZE_IN_BYTES = 10;
    private static final byte[] formatVersion = {0};
    private final byte[] outputPrefix;
    private final byte[] plaintextLegacySuffix;
    private final int tagSize;
    private final com.google.crypto.tink.prf.Prf wrappedPrf;

    public PrfMac(com.google.crypto.tink.prf.Prf prf, int i) throws java.security.GeneralSecurityException {
        this.wrappedPrf = prf;
        this.tagSize = i;
        this.outputPrefix = new byte[0];
        this.plaintextLegacySuffix = new byte[0];
        if (i < 10) {
            throw new java.security.InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        prf.compute(new byte[0], i);
    }

    private PrfMac(com.google.crypto.tink.mac.AesCmacKey aesCmacKey) throws java.security.GeneralSecurityException {
        this.wrappedPrf = new com.google.crypto.tink.subtle.PrfAesCmac(aesCmacKey.getAesKey().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()));
        this.tagSize = aesCmacKey.getParameters().getCryptographicTagSizeBytes();
        this.outputPrefix = aesCmacKey.getOutputPrefix().toByteArray();
        if (aesCmacKey.getParameters().getVariant().equals(com.google.crypto.tink.mac.AesCmacParameters.Variant.LEGACY)) {
            byte[] bArr = formatVersion;
            this.plaintextLegacySuffix = java.util.Arrays.copyOf(bArr, bArr.length);
        } else {
            this.plaintextLegacySuffix = new byte[0];
        }
    }

    private PrfMac(com.google.crypto.tink.mac.HmacKey hmacKey) throws java.security.GeneralSecurityException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(org.jose4j.keys.HmacKey.ALGORITHM);
        sb.append(hmacKey.getParameters().getHashType());
        this.wrappedPrf = new com.google.crypto.tink.subtle.PrfHmacJce(sb.toString(), new javax.crypto.spec.SecretKeySpec(hmacKey.getKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), org.jose4j.keys.HmacKey.ALGORITHM));
        this.tagSize = hmacKey.getParameters().getCryptographicTagSizeBytes();
        this.outputPrefix = hmacKey.getOutputPrefix().toByteArray();
        if (hmacKey.getParameters().getVariant().equals(com.google.crypto.tink.mac.HmacParameters.Variant.LEGACY)) {
            byte[] bArr = formatVersion;
            this.plaintextLegacySuffix = java.util.Arrays.copyOf(bArr, bArr.length);
        } else {
            this.plaintextLegacySuffix = new byte[0];
        }
    }

    public static com.google.crypto.tink.Mac create(com.google.crypto.tink.mac.AesCmacKey aesCmacKey) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.subtle.PrfMac(aesCmacKey);
    }

    public static com.google.crypto.tink.Mac create(com.google.crypto.tink.mac.HmacKey hmacKey) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.subtle.PrfMac(hmacKey);
    }

    @Override // com.google.crypto.tink.Mac
    public byte[] computeMac(byte[] bArr) throws java.security.GeneralSecurityException {
        byte[] bArr2 = this.plaintextLegacySuffix;
        if (bArr2.length > 0) {
            return com.google.crypto.tink.subtle.Bytes.concat(this.outputPrefix, this.wrappedPrf.compute(com.google.crypto.tink.subtle.Bytes.concat(bArr, bArr2), this.tagSize));
        }
        return com.google.crypto.tink.subtle.Bytes.concat(this.outputPrefix, this.wrappedPrf.compute(bArr, this.tagSize));
    }

    @Override // com.google.crypto.tink.Mac
    public void verifyMac(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.subtle.Bytes.equal(computeMac(bArr2), bArr)) {
            throw new java.security.GeneralSecurityException("invalid MAC");
        }
    }
}
