package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class i1 extends java.util.AbstractList {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f4196a;
    public final com.fyber.inneractive.sdk.protobuf.h1 b;

    public i1(java.util.List list, com.fyber.inneractive.sdk.protobuf.h1 h1Var) {
        this.f4196a = list;
        this.b = h1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        com.fyber.inneractive.sdk.protobuf.h1 h1Var = this.b;
        java.lang.Object obj = this.f4196a.get(i);
        ((com.fyber.inneractive.sdk.bidder.j) h1Var).getClass();
        com.fyber.inneractive.sdk.bidder.o0 a2 = com.fyber.inneractive.sdk.bidder.o0.a(((java.lang.Integer) obj).intValue());
        return a2 == null ? com.fyber.inneractive.sdk.bidder.o0.UNRECOGNIZED : a2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4196a.size();
    }
}
