package com.google.crypto.tink.mac.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class ChunkedAesCmacImpl implements com.google.crypto.tink.mac.ChunkedMac {
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private final com.google.crypto.tink.mac.AesCmacKey key;

    public ChunkedAesCmacImpl(com.google.crypto.tink.mac.AesCmacKey aesCmacKey) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.key = aesCmacKey;
    }

    @Override // com.google.crypto.tink.mac.ChunkedMac
    public final com.google.crypto.tink.mac.ChunkedMacComputation createComputation() throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation(this.key);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMac
    public final com.google.crypto.tink.mac.ChunkedMacVerification createVerification(byte[] bArr) throws java.security.GeneralSecurityException {
        if (bArr.length < this.key.getOutputPrefix().size()) {
            throw new java.security.GeneralSecurityException("Tag too short");
        }
        if (!this.key.getOutputPrefix().equals(com.google.crypto.tink.util.Bytes.copyFrom(bArr, 0, this.key.getOutputPrefix().size()))) {
            throw new java.security.GeneralSecurityException("Wrong tag prefix");
        }
        return new com.google.crypto.tink.mac.internal.ChunkedAesCmacVerification(this.key, bArr);
    }
}
