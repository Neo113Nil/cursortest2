package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class Jv extends AbstractC1177jv {

    /* renamed from: n, reason: collision with root package name */
    public final transient Object f10083n;

    public Jv(Object obj) {
        obj.getClass();
        this.f10083n = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final int c(int i, Object[] objArr) {
        objArr[i] = this.f10083n;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f10083n.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1177jv, com.google.android.gms.internal.ads.AbstractC0821bv
    public final AbstractC1044gv f() {
        return AbstractC1044gv.n(this.f10083n);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final Lv g() {
        return new C1312mv(this.f10083n);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1177jv, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f10083n.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C1312mv(this.f10083n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return L1.a.n("[", this.f10083n.toString(), "]");
    }
}
