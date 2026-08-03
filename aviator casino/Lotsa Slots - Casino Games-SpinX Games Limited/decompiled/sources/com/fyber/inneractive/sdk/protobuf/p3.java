package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class p3 implements java.util.ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ListIterator f4212a;

    public p3(com.fyber.inneractive.sdk.protobuf.r3 r3Var, int i) {
        this.f4212a = r3Var.f4216a.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4212a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4212a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        return (java.lang.String) this.f4212a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4212a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return (java.lang.String) this.f4212a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4212a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
