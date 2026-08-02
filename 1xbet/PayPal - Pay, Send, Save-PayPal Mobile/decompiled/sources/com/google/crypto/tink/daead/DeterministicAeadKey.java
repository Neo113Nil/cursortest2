package com.google.crypto.tink.daead;

/* loaded from: classes4.dex */
public abstract class DeterministicAeadKey extends com.google.crypto.tink.Key {
    public abstract com.google.crypto.tink.util.Bytes getOutputPrefix();

    @Override // com.google.crypto.tink.Key
    public abstract com.google.crypto.tink.daead.DeterministicAeadParameters getParameters();
}
