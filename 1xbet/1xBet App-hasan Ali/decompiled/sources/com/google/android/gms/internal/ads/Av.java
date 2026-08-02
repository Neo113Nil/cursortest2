package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class Av extends AbstractC1177jv {

    /* renamed from: n, reason: collision with root package name */
    public final transient Cv f7738n;

    /* renamed from: o, reason: collision with root package name */
    public final transient Bv f7739o;

    public Av(Cv cv, Bv bv) {
        this.f7738n = cv;
        this.f7739o = bv;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final int c(int i, Object[] objArr) {
        return this.f7739o.c(i, objArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7738n.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1177jv, com.google.android.gms.internal.ads.AbstractC0821bv
    public final AbstractC1044gv f() {
        return this.f7739o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final Lv g() {
        return this.f7739o.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f7739o.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7738n.f8109p;
    }
}
