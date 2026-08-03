package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class r3 extends java.util.AbstractList implements com.fyber.inneractive.sdk.protobuf.q1, java.util.RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.protobuf.q1 f4216a;

    public r3(com.fyber.inneractive.sdk.protobuf.q1 q1Var) {
        this.f4216a = q1Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final com.fyber.inneractive.sdk.protobuf.q1 a() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final java.util.List b() {
        return this.f4216a.b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        return (java.lang.String) this.f4216a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return new com.fyber.inneractive.sdk.protobuf.q3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new com.fyber.inneractive.sdk.protobuf.p3(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4216a.size();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final java.lang.Object a(int i) {
        return this.f4216a.a(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q1
    public final void a(com.fyber.inneractive.sdk.protobuf.s sVar) {
        throw new java.lang.UnsupportedOperationException();
    }
}
