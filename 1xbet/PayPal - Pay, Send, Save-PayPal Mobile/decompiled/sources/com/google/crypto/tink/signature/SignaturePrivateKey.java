package com.google.crypto.tink.signature;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public abstract class SignaturePrivateKey extends com.google.crypto.tink.Key implements com.google.crypto.tink.PrivateKey {
    @Override // com.google.crypto.tink.PrivateKey
    public abstract com.google.crypto.tink.signature.SignaturePublicKey getPublicKey();

    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return getPublicKey().getOutputPrefix();
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public java.lang.Integer getIdRequirementOrNull() {
        return getPublicKey().getIdRequirementOrNull();
    }

    @Override // com.google.crypto.tink.Key
    public com.google.crypto.tink.signature.SignatureParameters getParameters() {
        return getPublicKey().getParameters();
    }
}
