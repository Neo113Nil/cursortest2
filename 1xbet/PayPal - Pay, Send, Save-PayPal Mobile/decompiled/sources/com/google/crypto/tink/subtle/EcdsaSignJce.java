package com.google.crypto.tink.subtle;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class EcdsaSignJce implements com.google.crypto.tink.PublicKeySign {
    private final com.google.crypto.tink.PublicKeySign signer;

    public static com.google.crypto.tink.PublicKeySign create(com.google.crypto.tink.signature.EcdsaPrivateKey ecdsaPrivateKey) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.signature.internal.EcdsaSignJce.create(ecdsaPrivateKey);
    }

    public EcdsaSignJce(java.security.interfaces.ECPrivateKey eCPrivateKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding ecdsaEncoding) throws java.security.GeneralSecurityException {
        this.signer = new com.google.crypto.tink.signature.internal.EcdsaSignJce(eCPrivateKey, hashType, ecdsaEncoding);
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public final byte[] sign(byte[] bArr) throws java.security.GeneralSecurityException {
        return this.signer.sign(bArr);
    }
}
