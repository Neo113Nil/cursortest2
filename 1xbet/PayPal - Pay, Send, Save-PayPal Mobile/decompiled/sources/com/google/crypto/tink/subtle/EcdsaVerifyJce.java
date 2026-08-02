package com.google.crypto.tink.subtle;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class EcdsaVerifyJce implements com.google.crypto.tink.PublicKeyVerify {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private final com.google.crypto.tink.PublicKeyVerify verifier;

    public static com.google.crypto.tink.PublicKeyVerify create(com.google.crypto.tink.signature.EcdsaPublicKey ecdsaPublicKey) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.signature.internal.EcdsaVerifyJce.create(ecdsaPublicKey);
    }

    public EcdsaVerifyJce(java.security.interfaces.ECPublicKey eCPublicKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding ecdsaEncoding) throws java.security.GeneralSecurityException {
        this.verifier = new com.google.crypto.tink.signature.internal.EcdsaVerifyJce(eCPublicKey, hashType, ecdsaEncoding);
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public final void verify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        this.verifier.verify(bArr, bArr2);
    }
}
