package com.google.crypto.tink.internal;

/* loaded from: classes9.dex */
public abstract class PrimitiveFactory<PrimitiveT, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> {
    private final java.lang.Class<PrimitiveT> clazz;

    public abstract PrimitiveT getPrimitive(KeyProtoT keyprotot) throws java.security.GeneralSecurityException;

    public PrimitiveFactory(java.lang.Class<PrimitiveT> cls) {
        this.clazz = cls;
    }

    final java.lang.Class<PrimitiveT> getPrimitiveClass() {
        return this.clazz;
    }
}
