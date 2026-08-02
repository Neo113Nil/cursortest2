package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class HpkeDecrypt implements com.google.crypto.tink.HybridDecrypt {
    private static final byte[] EMPTY_ASSOCIATED_DATA = new byte[0];
    private final com.google.crypto.tink.hybrid.internal.HpkeAead aead;
    private final int encapsulatedKeyLength;
    private final com.google.crypto.tink.hybrid.internal.HpkeKdf kdf;
    private final com.google.crypto.tink.hybrid.internal.HpkeKem kem;
    private final byte[] outputPrefix;
    private final com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey recipientPrivateKey;

    private HpkeDecrypt(com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey, com.google.crypto.tink.hybrid.internal.HpkeKem hpkeKem, com.google.crypto.tink.hybrid.internal.HpkeKdf hpkeKdf, com.google.crypto.tink.hybrid.internal.HpkeAead hpkeAead, int i, com.google.crypto.tink.util.Bytes bytes) {
        this.recipientPrivateKey = hpkeKemPrivateKey;
        this.kem = hpkeKem;
        this.kdf = hpkeKdf;
        this.aead = hpkeAead;
        this.encapsulatedKeyLength = i;
        this.outputPrefix = bytes.toByteArray();
    }

    private static int encodingSizeInBytes(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId) throws java.security.GeneralSecurityException {
        if (kemId.equals(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256)) {
            return 32;
        }
        if (kemId.equals(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256)) {
            return 65;
        }
        if (kemId.equals(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384)) {
            return 97;
        }
        if (kemId.equals(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512)) {
            return com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
        }
        throw new java.security.GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    private static com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey createHpkeKemPrivateKey(com.google.crypto.tink.hybrid.HpkePrivateKey hpkePrivateKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId = hpkePrivateKey.getParameters().getKemId();
        if (kemId.equals(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256) || kemId.equals(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) || kemId.equals(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) || kemId.equals(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512)) {
            return new com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey(com.google.crypto.tink.util.Bytes.copyFrom(hpkePrivateKey.getPrivateKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get())), hpkePrivateKey.getPublicKey().getPublicKeyBytes());
        }
        throw new java.security.GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static com.google.crypto.tink.HybridDecrypt create(com.google.crypto.tink.hybrid.HpkePrivateKey hpkePrivateKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.HpkeParameters parameters = hpkePrivateKey.getParameters();
        return new com.google.crypto.tink.hybrid.internal.HpkeDecrypt(createHpkeKemPrivateKey(hpkePrivateKey), com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKem(parameters.getKemId()), com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKdf(parameters.getKdfId()), com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createAead(parameters.getAeadId()), encodingSizeInBytes(parameters.getKemId()), hpkePrivateKey.getOutputPrefix());
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.outputPrefix;
        int length = bArr3.length + this.encapsulatedKeyLength;
        if (bArr.length < length) {
            throw new java.security.GeneralSecurityException("Ciphertext is too short.");
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return com.google.crypto.tink.hybrid.internal.HpkeContext.createRecipientContext(java.util.Arrays.copyOfRange(bArr, this.outputPrefix.length, length), this.recipientPrivateKey, this.kem, this.kdf, this.aead, bArr2).open(bArr, length, EMPTY_ASSOCIATED_DATA);
    }
}
