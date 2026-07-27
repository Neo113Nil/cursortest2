package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class V extends H {

    /* renamed from: c, reason: collision with root package name */
    public final transient X f5109c;

    /* renamed from: d, reason: collision with root package name */
    public final transient W f5110d;

    public V(X x5, W w3) {
        this.f5109c = x5;
        this.f5110d = w3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final int b(Object[] objArr) {
        return this.f5110d.b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5109c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.H, com.google.android.gms.internal.play_billing.AbstractC0382x
    public final C e() {
        return this.f5110d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f5110d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5109c.f5127f;
    }
}
