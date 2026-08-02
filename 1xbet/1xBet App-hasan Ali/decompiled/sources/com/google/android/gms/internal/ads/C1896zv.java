package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1896zv extends AbstractC1177jv {

    /* renamed from: n, reason: collision with root package name */
    public final transient Cv f16791n;

    /* renamed from: o, reason: collision with root package name */
    public final transient Object[] f16792o;

    /* renamed from: p, reason: collision with root package name */
    public final transient int f16793p;

    public C1896zv(Cv cv, Object[] objArr, int i) {
        this.f16791n = cv;
        this.f16792o = objArr;
        this.f16793p = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final int c(int i, Object[] objArr) {
        return f().c(i, objArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f16791n.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final Lv g() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1177jv
    public final AbstractC1044gv k() {
        return new C1851yv(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f16793p;
    }
}
