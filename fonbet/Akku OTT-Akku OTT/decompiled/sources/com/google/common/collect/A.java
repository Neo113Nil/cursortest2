package com.google.common.collect;

/* loaded from: classes4.dex */
public abstract class A {
    public abstract Object delegate();

    public String toString() {
        return delegate().toString();
    }
}
