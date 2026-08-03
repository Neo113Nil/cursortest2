package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class o1 implements java.util.Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Iterator f4210a;

    public o1(java.util.Iterator it) {
        this.f4210a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4210a.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.f4210a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4210a.remove();
    }
}
