package com.google.crypto.tink.hybrid;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public abstract class HybridPublicKey extends com.google.crypto.tink.Key {
    public abstract com.google.crypto.tink.util.Bytes getOutputPrefix();

    @Override // com.google.crypto.tink.Key
    public abstract com.google.crypto.tink.hybrid.HybridParameters getParameters();
}
