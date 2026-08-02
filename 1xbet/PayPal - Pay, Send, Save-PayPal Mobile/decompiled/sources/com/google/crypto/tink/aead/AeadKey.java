package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public abstract class AeadKey extends com.google.crypto.tink.Key {
    public abstract com.google.crypto.tink.util.Bytes getOutputPrefix();

    @Override // com.google.crypto.tink.Key
    public abstract com.google.crypto.tink.aead.AeadParameters getParameters();
}
