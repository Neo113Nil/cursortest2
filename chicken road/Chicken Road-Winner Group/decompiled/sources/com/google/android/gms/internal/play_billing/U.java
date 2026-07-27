package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class U extends H {

    /* renamed from: c, reason: collision with root package name */
    public final transient W f2682c;

    /* renamed from: d, reason: collision with root package name */
    public final transient V f2683d;

    public U(W w3, V v3) {
        this.f2682c = w3;
        this.f2683d = v3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final int b(Object[] objArr) {
        return this.f2683d.b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2682c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.H, com.google.android.gms.internal.play_billing.AbstractC0238x
    public final C e() {
        return this.f2683d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f2683d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2682c.f;
    }
}
