package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.yv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1851yv extends AbstractC1044gv {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1896zv f16504m;

    public C1851yv(C1896zv c1896zv) {
        this.f16504m = c1896zv;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        C1896zv c1896zv = this.f16504m;
        AbstractC1400ot.i(i, c1896zv.f16793p);
        int i5 = i + i;
        Object[] objArr = c1896zv.f16792o;
        Object obj = objArr[i5];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i5 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16504m.f16793p;
    }
}
