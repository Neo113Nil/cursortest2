package com.google.crypto.tink;

/* loaded from: classes4.dex */
public final /* synthetic */ class ConfigurationFips140v2$$ExternalSyntheticLambda4 implements com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction {
    @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
    public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
        return com.google.crypto.tink.subtle.EncryptThenAuthenticate.create((com.google.crypto.tink.aead.AesCtrHmacAeadKey) key);
    }
}
