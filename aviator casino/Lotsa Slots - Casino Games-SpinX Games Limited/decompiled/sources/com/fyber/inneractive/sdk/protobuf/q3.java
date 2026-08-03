package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class q3 implements java.util.Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Iterator f4213a;

    public q3(com.fyber.inneractive.sdk.protobuf.r3 r3Var) {
        this.f4213a = r3Var.f4216a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4213a.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return (java.lang.String) this.f4213a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
