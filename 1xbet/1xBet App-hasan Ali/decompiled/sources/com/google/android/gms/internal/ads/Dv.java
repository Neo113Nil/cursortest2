package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class Dv extends AbstractC1177jv {

    /* renamed from: s, reason: collision with root package name */
    public static final Object[] f8413s;

    /* renamed from: t, reason: collision with root package name */
    public static final Dv f8414t;

    /* renamed from: n, reason: collision with root package name */
    public final transient Object[] f8415n;

    /* renamed from: o, reason: collision with root package name */
    public final transient int f8416o;

    /* renamed from: p, reason: collision with root package name */
    public final transient Object[] f8417p;

    /* renamed from: q, reason: collision with root package name */
    public final transient int f8418q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f8419r;

    static {
        Object[] objArr = new Object[0];
        f8413s = objArr;
        f8414t = new Dv(0, 0, 0, objArr, objArr);
    }

    public Dv(int i, int i5, int i6, Object[] objArr, Object[] objArr2) {
        this.f8415n = objArr;
        this.f8416o = i;
        this.f8417p = objArr2;
        this.f8418q = i5;
        this.f8419r = i6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final int c(int i, Object[] objArr) {
        Object[] objArr2 = this.f8415n;
        int i5 = this.f8419r;
        System.arraycopy(objArr2, 0, objArr, i, i5);
        return i + i5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f8417p;
            if (objArr.length != 0) {
                int v4 = AbstractC1400ot.v(obj);
                while (true) {
                    int i = v4 & this.f8418q;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    v4 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final int d() {
        return this.f8419r;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final Lv g() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1177jv, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f8416o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final Object[] i() {
        return this.f8415n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1177jv
    public final AbstractC1044gv k() {
        return AbstractC1044gv.k(this.f8419r, this.f8415n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8419r;
    }
}
