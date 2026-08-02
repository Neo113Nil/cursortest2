package com.google.crypto.tink.jwt;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public abstract class JwtSignaturePrivateKey extends com.google.crypto.tink.Key implements com.google.crypto.tink.PrivateKey {
    @Override // com.google.crypto.tink.Key
    public abstract com.google.crypto.tink.jwt.JwtSignatureParameters getParameters();

    @Override // com.google.crypto.tink.PrivateKey
    public abstract com.google.crypto.tink.jwt.JwtSignaturePublicKey getPublicKey();

    public java.util.Optional<java.lang.String> getKid() {
        return getPublicKey().getKid();
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public java.lang.Integer getIdRequirementOrNull() {
        return getPublicKey().getIdRequirementOrNull();
    }
}
