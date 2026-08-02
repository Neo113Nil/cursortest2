package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final /* synthetic */ class AeadConfigurationV0$$ExternalSyntheticLambda2 implements com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction {
    @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
    public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
        return com.google.crypto.tink.aead.internal.XAesGcm.create((com.google.crypto.tink.aead.XAesGcmKey) key);
    }
}
