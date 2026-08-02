package com.google.crypto.tink.mac.internal;

/* loaded from: classes9.dex */
final class ChunkedAesCmacVerification implements com.google.crypto.tink.mac.ChunkedMacVerification {
    private final com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation aesCmacComputation;
    private final com.google.crypto.tink.util.Bytes tag;

    ChunkedAesCmacVerification(com.google.crypto.tink.mac.AesCmacKey aesCmacKey, byte[] bArr) throws java.security.GeneralSecurityException {
        this.aesCmacComputation = new com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation(aesCmacKey);
        this.tag = com.google.crypto.tink.util.Bytes.copyFrom(bArr);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacVerification
    public final void update(java.nio.ByteBuffer byteBuffer) throws java.security.GeneralSecurityException {
        this.aesCmacComputation.update(byteBuffer);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacVerification
    public final void verifyMac() throws java.security.GeneralSecurityException {
        if (!this.tag.equals(com.google.crypto.tink.util.Bytes.copyFrom(this.aesCmacComputation.computeMac()))) {
            throw new java.security.GeneralSecurityException("invalid MAC");
        }
    }
}
