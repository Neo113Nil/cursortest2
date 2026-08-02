package com.google.crypto.tink.mac.internal;

/* loaded from: classes9.dex */
final class ChunkedHmacVerification implements com.google.crypto.tink.mac.ChunkedMacVerification {
    private final com.google.crypto.tink.mac.internal.ChunkedHmacComputation hmacComputation;
    private final com.google.crypto.tink.util.Bytes tag;

    ChunkedHmacVerification(com.google.crypto.tink.mac.HmacKey hmacKey, byte[] bArr) throws java.security.GeneralSecurityException {
        this.hmacComputation = new com.google.crypto.tink.mac.internal.ChunkedHmacComputation(hmacKey);
        this.tag = com.google.crypto.tink.util.Bytes.copyFrom(bArr);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacVerification
    public final void update(java.nio.ByteBuffer byteBuffer) {
        this.hmacComputation.update(byteBuffer);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacVerification
    public final void verifyMac() throws java.security.GeneralSecurityException {
        if (!this.tag.equals(com.google.crypto.tink.util.Bytes.copyFrom(this.hmacComputation.computeMac()))) {
            throw new java.security.GeneralSecurityException("invalid MAC");
        }
    }
}
