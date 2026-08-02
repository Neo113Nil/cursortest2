package com.google.crypto.tink.mac;

/* loaded from: classes4.dex */
public abstract class MacKey extends com.google.crypto.tink.Key {
    public abstract com.google.crypto.tink.util.Bytes getOutputPrefix();

    @Override // com.google.crypto.tink.Key
    public abstract com.google.crypto.tink.mac.MacParameters getParameters();
}
