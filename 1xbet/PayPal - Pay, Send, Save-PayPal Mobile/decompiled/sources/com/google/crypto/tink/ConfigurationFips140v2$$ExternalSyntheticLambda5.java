package com.google.crypto.tink;

/* loaded from: classes4.dex */
public final /* synthetic */ class ConfigurationFips140v2$$ExternalSyntheticLambda5 implements com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction {
    @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
    public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
        return com.google.crypto.tink.subtle.AesGcmJce.create((com.google.crypto.tink.aead.AesGcmKey) key);
    }
}
