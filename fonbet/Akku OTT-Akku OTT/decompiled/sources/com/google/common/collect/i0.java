package com.google.common.collect;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class i0<E> extends G<E> {
    public static final i0 e = new i0(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public i0(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.common.collect.G, com.google.common.collect.E
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.E
    public final Object[] c() {
        return this.c;
    }

    @Override // com.google.common.collect.E
    public final int d() {
        return this.d;
    }

    @Override // com.google.common.collect.E
    public final int e() {
        return 0;
    }

    @Override // com.google.common.collect.E
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final E get(int i) {
        com.google.common.base.k.e(i, this.d);
        E e2 = (E) this.c[i];
        Objects.requireNonNull(e2);
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // com.google.common.collect.G, com.google.common.collect.E
    public Object writeReplace() {
        return super.writeReplace();
    }
}
