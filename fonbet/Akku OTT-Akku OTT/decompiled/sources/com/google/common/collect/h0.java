package com.google.common.collect;

import com.google.common.collect.I;
import com.google.common.collect.j0;

/* loaded from: classes4.dex */
public final class h0<K, V> extends D<K, V> {
    public static final h0<Object, Object> k = new h0<>();
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int i;
    public final transient h0<V, K> j;

    /* JADX WARN: Multi-variable type inference failed */
    public h0() {
        this.d = null;
        this.e = new Object[0];
        this.f = 0;
        this.i = 0;
        this.j = this;
    }

    @Override // com.google.common.collect.I
    public final j0.a c() {
        return new j0.a(this, this.e, this.f, this.i);
    }

    @Override // com.google.common.collect.I
    public final j0.b d() {
        return new j0.b(this, new j0.c(this.e, this.f, this.i));
    }

    @Override // com.google.common.collect.I, java.util.Map
    public final V get(Object obj) {
        V v = (V) j0.k(this.e, this.i, this.f, this.d, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // com.google.common.collect.D
    public final h0 i() {
        return this.j;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    @Override // com.google.common.collect.D, com.google.common.collect.I
    public Object writeReplace() {
        return super.writeReplace();
    }

    public h0(Object obj, Object[] objArr, int i, h0<V, K> h0Var) {
        this.d = obj;
        this.e = objArr;
        this.f = 1;
        this.i = i;
        this.j = h0Var;
    }

    public h0(Object[] objArr, int i) {
        this.e = objArr;
        this.i = i;
        this.f = 0;
        int h = i >= 2 ? M.h(i) : 0;
        Object j = j0.j(objArr, i, h, 0);
        if (!(j instanceof Object[])) {
            this.d = j;
            Object j2 = j0.j(objArr, i, h, 1);
            if (!(j2 instanceof Object[])) {
                this.j = new h0<>(j2, objArr, i, this);
                return;
            }
            throw ((I.a.C0131a) ((Object[]) j2)[2]).a();
        }
        throw ((I.a.C0131a) ((Object[]) j)[2]).a();
    }
}
