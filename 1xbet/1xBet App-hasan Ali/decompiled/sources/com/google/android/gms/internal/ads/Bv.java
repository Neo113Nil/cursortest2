package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class Bv extends AbstractC1044gv {

    /* renamed from: m, reason: collision with root package name */
    public final transient Object[] f7913m;

    /* renamed from: n, reason: collision with root package name */
    public final transient int f7914n;

    /* renamed from: o, reason: collision with root package name */
    public final transient int f7915o;

    public Bv(Object[] objArr, int i, int i5) {
        this.f7913m = objArr;
        this.f7914n = i;
        this.f7915o = i5;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1400ot.i(i, this.f7915o);
        Object obj = this.f7913m[i + i + this.f7914n];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7915o;
    }
}
