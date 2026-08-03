package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public abstract class ForwardingObject {
    protected abstract java.lang.Object delegate();

    protected ForwardingObject() {
    }

    public java.lang.String toString() {
        return delegate().toString();
    }
}
