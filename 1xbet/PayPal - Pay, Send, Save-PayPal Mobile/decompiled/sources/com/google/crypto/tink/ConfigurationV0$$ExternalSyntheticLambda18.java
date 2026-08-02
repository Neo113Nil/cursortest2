package com.google.crypto.tink;

/* loaded from: classes9.dex */
public final /* synthetic */ class ConfigurationV0$$ExternalSyntheticLambda18 implements com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction {
    @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
    public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
        return com.google.crypto.tink.hybrid.internal.HpkeDecrypt.create((com.google.crypto.tink.hybrid.HpkePrivateKey) key);
    }
}
