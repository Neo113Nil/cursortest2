package com.google.crypto.tink;

/* loaded from: classes4.dex */
public final /* synthetic */ class ConfigurationFips140v2$$ExternalSyntheticLambda3 implements com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction {
    @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
    public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
        return new com.google.crypto.tink.mac.internal.ChunkedHmacImpl((com.google.crypto.tink.mac.HmacKey) key);
    }
}
