package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.wv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1761wv extends AbstractC1044gv {

    /* renamed from: o, reason: collision with root package name */
    public static final C1761wv f16184o = new C1761wv(0, new Object[0]);

    /* renamed from: m, reason: collision with root package name */
    public final transient Object[] f16185m;

    /* renamed from: n, reason: collision with root package name */
    public final transient int f16186n;

    public C1761wv(int i, Object[] objArr) {
        this.f16185m = objArr;
        this.f16186n = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1044gv, com.google.android.gms.internal.ads.AbstractC0821bv
    public final int c(int i, Object[] objArr) {
        Object[] objArr2 = this.f16185m;
        int i5 = this.f16186n;
        System.arraycopy(objArr2, 0, objArr, i, i5);
        return i + i5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final int d() {
        return this.f16186n;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1400ot.i(i, this.f16186n);
        Object obj = this.f16185m[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final Object[] i() {
        return this.f16185m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16186n;
    }
}
