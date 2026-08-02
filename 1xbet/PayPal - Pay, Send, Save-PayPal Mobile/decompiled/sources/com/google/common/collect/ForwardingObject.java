package com.google.common.collect;

/* loaded from: classes4.dex */
public abstract class ForwardingObject {
    protected abstract java.lang.Object delegate();

    public java.lang.String toString() {
        return delegate().toString();
    }
}
