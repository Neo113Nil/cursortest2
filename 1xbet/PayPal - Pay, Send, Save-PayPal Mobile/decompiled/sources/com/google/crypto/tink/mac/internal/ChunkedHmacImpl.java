package com.google.crypto.tink.mac.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class ChunkedHmacImpl implements com.google.crypto.tink.mac.ChunkedMac {
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private final com.google.crypto.tink.mac.HmacKey key;

    public ChunkedHmacImpl(com.google.crypto.tink.mac.HmacKey hmacKey) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.key = hmacKey;
    }

    @Override // com.google.crypto.tink.mac.ChunkedMac
    public final com.google.crypto.tink.mac.ChunkedMacComputation createComputation() throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.mac.internal.ChunkedHmacComputation(this.key);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMac
    public final com.google.crypto.tink.mac.ChunkedMacVerification createVerification(byte[] bArr) throws java.security.GeneralSecurityException {
        if (bArr.length < this.key.getOutputPrefix().size()) {
            throw new java.security.GeneralSecurityException("Tag too short");
        }
        if (!this.key.getOutputPrefix().equals(com.google.crypto.tink.util.Bytes.copyFrom(bArr, 0, this.key.getOutputPrefix().size()))) {
            throw new java.security.GeneralSecurityException("Wrong tag prefix");
        }
        return new com.google.crypto.tink.mac.internal.ChunkedHmacVerification(this.key, bArr);
    }
}
