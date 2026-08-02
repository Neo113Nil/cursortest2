package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class F0 extends AbstractList implements Q, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final P f12106a;

    public F0(P p5) {
        this.f12106a = p5;
    }

    @Override // com.google.protobuf.Q
    public final List b() {
        return Collections.unmodifiableList(this.f12106a.f12146b);
    }

    @Override // com.google.protobuf.Q
    public final Q c() {
        return this;
    }

    @Override // com.google.protobuf.Q
    public final Object d(int i7) {
        return this.f12106a.f12146b.get(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f12106a.get(i7);
    }

    @Override // com.google.protobuf.Q
    public final void h(AbstractC0911k abstractC0911k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        E0 e02 = new E0();
        e02.f12105a = this.f12106a.iterator();
        return e02;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        D0 d02 = new D0();
        d02.f12104a = this.f12106a.listIterator(i7);
        return d02;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12106a.f12146b.size();
    }
}
