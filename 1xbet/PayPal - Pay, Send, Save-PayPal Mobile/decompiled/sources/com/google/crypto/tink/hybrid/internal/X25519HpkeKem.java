package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
final class X25519HpkeKem implements com.google.crypto.tink.hybrid.internal.HpkeKem {
    private final com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf hkdf;
    private final com.google.crypto.tink.hybrid.internal.X25519 x25519;

    @com.google.errorprone.annotations.Immutable
    static final class X25519Java implements com.google.crypto.tink.hybrid.internal.X25519 {
        private X25519Java() {
        }

        @Override // com.google.crypto.tink.hybrid.internal.X25519
        public final com.google.crypto.tink.hybrid.internal.X25519.KeyPair generateKeyPair() throws java.security.GeneralSecurityException {
            byte[] generatePrivateKey = com.google.crypto.tink.subtle.X25519.generatePrivateKey();
            return new com.google.crypto.tink.hybrid.internal.X25519.KeyPair(generatePrivateKey, com.google.crypto.tink.subtle.X25519.publicFromPrivate(generatePrivateKey));
        }

        @Override // com.google.crypto.tink.hybrid.internal.X25519
        public final byte[] computeSharedSecret(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            return com.google.crypto.tink.subtle.X25519.computeSharedSecret(bArr, bArr2);
        }
    }

    X25519HpkeKem(com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf hkdfHpkeKdf) {
        com.google.crypto.tink.hybrid.internal.X25519 x25519Java;
        this.hkdf = hkdfHpkeKdf;
        try {
            x25519Java = com.google.crypto.tink.hybrid.internal.X25519Conscrypt.create();
        } catch (java.security.GeneralSecurityException unused) {
            x25519Java = new com.google.crypto.tink.hybrid.internal.X25519HpkeKem.X25519Java();
        }
        this.x25519 = x25519Java;
    }

    private byte[] deriveKemSharedSecret(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        return extractAndExpand(bArr, com.google.crypto.tink.subtle.Bytes.concat(bArr2, bArr3));
    }

    private byte[] deriveKemSharedSecret(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws java.security.GeneralSecurityException {
        return extractAndExpand(bArr, com.google.crypto.tink.subtle.Bytes.concat(bArr2, bArr3, bArr4));
    }

    private byte[] extractAndExpand(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] kemSuiteId = com.google.crypto.tink.hybrid.internal.HpkeUtil.kemSuiteId(com.google.crypto.tink.hybrid.internal.HpkeUtil.X25519_HKDF_SHA256_KEM_ID);
        com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf hkdfHpkeKdf = this.hkdf;
        return hkdfHpkeKdf.extractAndExpand(null, bArr, "eae_prk", bArr2, "shared_secret", kemSuiteId, hkdfHpkeKdf.getMacLength());
    }

    final com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulateWithFixedEphemeralKey(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput(deriveKemSharedSecret(this.x25519.computeSharedSecret(bArr2, bArr), bArr3, bArr), bArr3);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public final com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulate(byte[] bArr) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.internal.X25519.KeyPair generateKeyPair = this.x25519.generateKeyPair();
        return encapsulateWithFixedEphemeralKey(bArr, generateKeyPair.privateKey, generateKeyPair.publicKey);
    }

    final com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput authEncapsulateWithFixedEphemeralKey(byte[] bArr, byte[] bArr2, byte[] bArr3, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput(deriveKemSharedSecret(com.google.crypto.tink.subtle.Bytes.concat(this.x25519.computeSharedSecret(bArr2, bArr), this.x25519.computeSharedSecret(hpkeKemPrivateKey.getSerializedPrivate().toByteArray(), bArr)), bArr3, bArr, hpkeKemPrivateKey.getSerializedPublic().toByteArray()), bArr3);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public final com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput authEncapsulate(byte[] bArr, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.internal.X25519.KeyPair generateKeyPair = this.x25519.generateKeyPair();
        return authEncapsulateWithFixedEphemeralKey(bArr, generateKeyPair.privateKey, generateKeyPair.publicKey, hpkeKemPrivateKey);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public final byte[] decapsulate(byte[] bArr, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey) throws java.security.GeneralSecurityException {
        return deriveKemSharedSecret(this.x25519.computeSharedSecret(hpkeKemPrivateKey.getSerializedPrivate().toByteArray(), bArr), bArr, hpkeKemPrivateKey.getSerializedPublic().toByteArray());
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public final byte[] authDecapsulate(byte[] bArr, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] byteArray = hpkeKemPrivateKey.getSerializedPrivate().toByteArray();
        return deriveKemSharedSecret(com.google.crypto.tink.subtle.Bytes.concat(this.x25519.computeSharedSecret(byteArray, bArr), this.x25519.computeSharedSecret(byteArray, bArr2)), bArr, hpkeKemPrivateKey.getSerializedPublic().toByteArray(), bArr2);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public final byte[] getKemId() throws java.security.GeneralSecurityException {
        if (java.util.Arrays.equals(this.hkdf.getKdfId(), com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA256_KDF_ID)) {
            return com.google.crypto.tink.hybrid.internal.HpkeUtil.X25519_HKDF_SHA256_KEM_ID;
        }
        throw new java.security.GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
