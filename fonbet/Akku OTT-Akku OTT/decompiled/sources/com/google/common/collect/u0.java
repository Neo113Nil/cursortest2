package com.google.common.collect;

import com.google.common.collect.P;

/* loaded from: classes4.dex */
public final class u0<E> extends M<E> {
    public final transient E d;

    public u0(E e) {
        e.getClass();
        this.d = e;
    }

    @Override // com.google.common.collect.M, com.google.common.collect.E
    public final G<E> a() {
        return G.n(this.d);
    }

    @Override // com.google.common.collect.E
    public final int b(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // com.google.common.collect.E
    public final boolean f() {
        return false;
    }

    @Override // com.google.common.collect.M, com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: g */
    public final y0<E> iterator() {
        return new P.c(this.d);
    }

    @Override // com.google.common.collect.M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }

    @Override // com.google.common.collect.M, com.google.common.collect.E
    public Object writeReplace() {
        return super.writeReplace();
    }
}
