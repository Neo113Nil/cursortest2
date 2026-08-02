package com.google.crypto.tink;

/* loaded from: classes4.dex */
public final /* synthetic */ class ConfigurationV0$$ExternalSyntheticLambda10 implements com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction {
    @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
    public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
        return com.google.crypto.tink.aead.subtle.AesGcmSiv.create((com.google.crypto.tink.aead.AesGcmSivKey) key);
    }
}
