package com.fyber.inneractive.sdk.protobuf;

import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class p3 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f5869a;

    public p3(r3 r3Var, int i) {
        this.f5869a = r3Var.f5873a.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5869a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5869a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f5869a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5869a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f5869a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5869a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
