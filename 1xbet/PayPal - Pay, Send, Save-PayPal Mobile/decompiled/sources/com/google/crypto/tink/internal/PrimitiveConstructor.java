package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public abstract class PrimitiveConstructor<KeyT extends com.google.crypto.tink.Key, PrimitiveT> {
    private final java.lang.Class<KeyT> keyClass;
    private final java.lang.Class<PrimitiveT> primitiveClass;

    public interface PrimitiveConstructionFunction<KeyT extends com.google.crypto.tink.Key, PrimitiveT> {
        PrimitiveT constructPrimitive(KeyT keyt) throws java.security.GeneralSecurityException;
    }

    public abstract PrimitiveT constructPrimitive(KeyT keyt) throws java.security.GeneralSecurityException;

    private PrimitiveConstructor(java.lang.Class<KeyT> cls, java.lang.Class<PrimitiveT> cls2) {
        this.keyClass = cls;
        this.primitiveClass = cls2;
    }

    public java.lang.Class<KeyT> getKeyClass() {
        return this.keyClass;
    }

    public java.lang.Class<PrimitiveT> getPrimitiveClass() {
        return this.primitiveClass;
    }

    public static <KeyT extends com.google.crypto.tink.Key, PrimitiveT> com.google.crypto.tink.internal.PrimitiveConstructor<KeyT, PrimitiveT> create(final com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction<KeyT, PrimitiveT> primitiveConstructionFunction, java.lang.Class<KeyT> cls, java.lang.Class<PrimitiveT> cls2) {
        return (com.google.crypto.tink.internal.PrimitiveConstructor<KeyT, PrimitiveT>) new com.google.crypto.tink.internal.PrimitiveConstructor<KeyT, PrimitiveT>(cls, cls2) { // from class: com.google.crypto.tink.internal.PrimitiveConstructor.1
            @Override // com.google.crypto.tink.internal.PrimitiveConstructor
            public PrimitiveT constructPrimitive(KeyT keyt) throws java.security.GeneralSecurityException {
                return (PrimitiveT) primitiveConstructionFunction.constructPrimitive(keyt);
            }
        };
    }
}
