package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends AbstractList implements F, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f11790a;

    public j0(E e7) {
        this.f11790a = e7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final List b() {
        return Collections.unmodifiableList(this.f11790a.f11716b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final F c() {
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final Object d(int i7) {
        return this.f11790a.f11716b.get(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f11790a.get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        i0 i0Var = new i0();
        i0Var.f11782a = this.f11790a.iterator();
        return i0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        h0 h0Var = new h0();
        h0Var.f11778a = this.f11790a.listIterator(i7);
        return h0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final void p(AbstractC0829i abstractC0829i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11790a.size();
    }
}
