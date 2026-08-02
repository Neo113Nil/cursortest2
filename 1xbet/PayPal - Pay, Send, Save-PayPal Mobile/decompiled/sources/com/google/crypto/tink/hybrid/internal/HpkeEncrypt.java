package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class HpkeEncrypt implements com.google.crypto.tink.HybridEncrypt {
    private static final byte[] EMPTY_ASSOCIATED_DATA = new byte[0];
    private final com.google.crypto.tink.hybrid.internal.HpkeAead aead;
    private final com.google.crypto.tink.hybrid.internal.HpkeKdf kdf;
    private final com.google.crypto.tink.hybrid.internal.HpkeKem kem;
    private final byte[] outputPrefix;
    private final byte[] recipientPublicKey;

    private HpkeEncrypt(com.google.crypto.tink.util.Bytes bytes, com.google.crypto.tink.hybrid.internal.HpkeKem hpkeKem, com.google.crypto.tink.hybrid.internal.HpkeKdf hpkeKdf, com.google.crypto.tink.hybrid.internal.HpkeAead hpkeAead, com.google.crypto.tink.util.Bytes bytes2) {
        this.recipientPublicKey = bytes.toByteArray();
        this.kem = hpkeKem;
        this.kdf = hpkeKdf;
        this.aead = hpkeAead;
        this.outputPrefix = bytes2.toByteArray();
    }

    public static com.google.crypto.tink.HybridEncrypt create(com.google.crypto.tink.hybrid.HpkePublicKey hpkePublicKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.HpkeParameters parameters = hpkePublicKey.getParameters();
        return new com.google.crypto.tink.hybrid.internal.HpkeEncrypt(hpkePublicKey.getPublicKeyBytes(), com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKem(parameters.getKemId()), com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKdf(parameters.getKdfId()), com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createAead(parameters.getAeadId()), hpkePublicKey.getOutputPrefix());
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        com.google.crypto.tink.hybrid.internal.HpkeContext createSenderContext = com.google.crypto.tink.hybrid.internal.HpkeContext.createSenderContext(this.recipientPublicKey, this.kem, this.kdf, this.aead, bArr2);
        byte[] encapsulatedKey = createSenderContext.getEncapsulatedKey();
        byte[] seal = createSenderContext.seal(bArr, this.outputPrefix.length + encapsulatedKey.length, EMPTY_ASSOCIATED_DATA);
        byte[] bArr3 = this.outputPrefix;
        java.lang.System.arraycopy(bArr3, 0, seal, 0, bArr3.length);
        java.lang.System.arraycopy(encapsulatedKey, 0, seal, this.outputPrefix.length, encapsulatedKey.length);
        return seal;
    }
}
