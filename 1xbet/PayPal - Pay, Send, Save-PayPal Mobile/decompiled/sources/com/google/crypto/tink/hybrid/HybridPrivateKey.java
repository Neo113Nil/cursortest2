package com.google.crypto.tink.hybrid;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public abstract class HybridPrivateKey extends com.google.crypto.tink.Key implements com.google.crypto.tink.PrivateKey {
    @Override // com.google.crypto.tink.PrivateKey
    public abstract com.google.crypto.tink.hybrid.HybridPublicKey getPublicKey();

    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return getPublicKey().getOutputPrefix();
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public java.lang.Integer getIdRequirementOrNull() {
        return getPublicKey().getIdRequirementOrNull();
    }

    @Override // com.google.crypto.tink.Key
    public com.google.crypto.tink.hybrid.HybridParameters getParameters() {
        return getPublicKey().getParameters();
    }
}
