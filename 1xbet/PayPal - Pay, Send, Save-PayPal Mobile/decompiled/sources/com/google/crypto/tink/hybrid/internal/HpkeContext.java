package com.google.crypto.tink.hybrid.internal;

/* loaded from: classes9.dex */
public final class HpkeContext {
    private static final byte[] EMPTY_IKM = new byte[0];
    private final com.google.crypto.tink.hybrid.internal.HpkeAead aead;
    private final byte[] baseNonce;
    private final byte[] encapsulatedKey;
    private final byte[] key;
    private final java.math.BigInteger maxSequenceNumber;
    private java.math.BigInteger sequenceNumber = java.math.BigInteger.ZERO;

    private HpkeContext(byte[] bArr, byte[] bArr2, byte[] bArr3, java.math.BigInteger bigInteger, com.google.crypto.tink.hybrid.internal.HpkeAead hpkeAead) {
        this.encapsulatedKey = bArr;
        this.key = bArr2;
        this.baseNonce = bArr3;
        this.maxSequenceNumber = bigInteger;
        this.aead = hpkeAead;
    }

    static com.google.crypto.tink.hybrid.internal.HpkeContext createContext(byte[] bArr, byte[] bArr2, byte[] bArr3, com.google.crypto.tink.hybrid.internal.HpkeKem hpkeKem, com.google.crypto.tink.hybrid.internal.HpkeKdf hpkeKdf, com.google.crypto.tink.hybrid.internal.HpkeAead hpkeAead, byte[] bArr4) throws java.security.GeneralSecurityException {
        byte[] hpkeSuiteId = com.google.crypto.tink.hybrid.internal.HpkeUtil.hpkeSuiteId(hpkeKem.getKemId(), hpkeKdf.getKdfId(), hpkeAead.getAeadId());
        byte[] bArr5 = com.google.crypto.tink.hybrid.internal.HpkeUtil.EMPTY_SALT;
        byte[] bArr6 = EMPTY_IKM;
        byte[] concat = com.google.crypto.tink.subtle.Bytes.concat(bArr, hpkeKdf.labeledExtract(bArr5, bArr6, "psk_id_hash", hpkeSuiteId), hpkeKdf.labeledExtract(com.google.crypto.tink.hybrid.internal.HpkeUtil.EMPTY_SALT, bArr4, "info_hash", hpkeSuiteId));
        byte[] labeledExtract = hpkeKdf.labeledExtract(bArr3, bArr6, "secret", hpkeSuiteId);
        return new com.google.crypto.tink.hybrid.internal.HpkeContext(bArr2, hpkeKdf.labeledExpand(labeledExtract, concat, "key", hpkeSuiteId, hpkeAead.getKeyLength()), hpkeKdf.labeledExpand(labeledExtract, concat, "base_nonce", hpkeSuiteId, hpkeAead.getNonceLength()), maxSequenceNumber(hpkeAead.getNonceLength()), hpkeAead);
    }

    static com.google.crypto.tink.hybrid.internal.HpkeContext createSenderContext(byte[] bArr, com.google.crypto.tink.hybrid.internal.HpkeKem hpkeKem, com.google.crypto.tink.hybrid.internal.HpkeKdf hpkeKdf, com.google.crypto.tink.hybrid.internal.HpkeAead hpkeAead, byte[] bArr2) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulate = hpkeKem.encapsulate(bArr);
        return createContext(com.google.crypto.tink.hybrid.internal.HpkeUtil.BASE_MODE, encapsulate.getEncapsulatedKey(), encapsulate.getSharedSecret(), hpkeKem, hpkeKdf, hpkeAead, bArr2);
    }

    public static com.google.crypto.tink.hybrid.internal.HpkeContext createAuthSenderContext(com.google.crypto.tink.hybrid.HpkePublicKey hpkePublicKey, com.google.crypto.tink.hybrid.internal.HpkeKem hpkeKem, com.google.crypto.tink.hybrid.internal.HpkeKdf hpkeKdf, com.google.crypto.tink.hybrid.internal.HpkeAead hpkeAead, byte[] bArr, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput authEncapsulate = hpkeKem.authEncapsulate(hpkePublicKey.getPublicKeyBytes().toByteArray(), hpkeKemPrivateKey);
        return createContext(com.google.crypto.tink.hybrid.internal.HpkeUtil.AUTH_MODE, authEncapsulate.getEncapsulatedKey(), authEncapsulate.getSharedSecret(), hpkeKem, hpkeKdf, hpkeAead, bArr);
    }

    public static com.google.crypto.tink.hybrid.internal.HpkeContext createRecipientContext(byte[] bArr, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey, com.google.crypto.tink.hybrid.internal.HpkeKem hpkeKem, com.google.crypto.tink.hybrid.internal.HpkeKdf hpkeKdf, com.google.crypto.tink.hybrid.internal.HpkeAead hpkeAead, byte[] bArr2) throws java.security.GeneralSecurityException {
        return createContext(com.google.crypto.tink.hybrid.internal.HpkeUtil.BASE_MODE, bArr, hpkeKem.decapsulate(bArr, hpkeKemPrivateKey), hpkeKem, hpkeKdf, hpkeAead, bArr2);
    }

    public static com.google.crypto.tink.hybrid.internal.HpkeContext createAuthRecipientContext(byte[] bArr, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey, com.google.crypto.tink.hybrid.internal.HpkeKem hpkeKem, com.google.crypto.tink.hybrid.internal.HpkeKdf hpkeKdf, com.google.crypto.tink.hybrid.internal.HpkeAead hpkeAead, byte[] bArr2, com.google.crypto.tink.hybrid.HpkePublicKey hpkePublicKey) throws java.security.GeneralSecurityException {
        return createContext(com.google.crypto.tink.hybrid.internal.HpkeUtil.AUTH_MODE, bArr, hpkeKem.authDecapsulate(bArr, hpkeKemPrivateKey, hpkePublicKey.getPublicKeyBytes().toByteArray()), hpkeKem, hpkeKdf, hpkeAead, bArr2);
    }

    private static java.math.BigInteger maxSequenceNumber(int i) {
        return java.math.BigInteger.ONE.shiftLeft(i * 8).subtract(java.math.BigInteger.ONE);
    }

    private void incrementSequenceNumber() throws java.security.GeneralSecurityException {
        if (this.sequenceNumber.compareTo(this.maxSequenceNumber) >= 0) {
            throw new java.security.GeneralSecurityException("message limit reached");
        }
        this.sequenceNumber = this.sequenceNumber.add(java.math.BigInteger.ONE);
    }

    private byte[] computeNonce() throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.subtle.Bytes.xor(this.baseNonce, com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(this.sequenceNumber, this.aead.getNonceLength()));
    }

    private byte[] computeNonceAndIncrementSequenceNumber() throws java.security.GeneralSecurityException {
        byte[] computeNonce;
        synchronized (this) {
            computeNonce = computeNonce();
            incrementSequenceNumber();
        }
        return computeNonce;
    }

    final byte[] getKey() {
        return this.key;
    }

    final byte[] getBaseNonce() {
        return this.baseNonce;
    }

    public final byte[] getEncapsulatedKey() {
        return this.encapsulatedKey;
    }

    public final byte[] seal(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return this.aead.seal(this.key, computeNonceAndIncrementSequenceNumber(), bArr, bArr2);
    }

    final byte[] seal(byte[] bArr, int i, byte[] bArr2) throws java.security.GeneralSecurityException {
        return this.aead.seal(this.key, computeNonceAndIncrementSequenceNumber(), bArr, i, bArr2);
    }

    public final byte[] open(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return open(bArr, 0, bArr2);
    }

    final byte[] open(byte[] bArr, int i, byte[] bArr2) throws java.security.GeneralSecurityException {
        return this.aead.open(this.key, computeNonceAndIncrementSequenceNumber(), bArr, i, bArr2);
    }
}
