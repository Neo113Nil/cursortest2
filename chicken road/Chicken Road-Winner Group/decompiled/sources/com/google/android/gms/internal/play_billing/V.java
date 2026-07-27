package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes.dex */
public final class V extends C {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f2685c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f2686d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f2687e;

    public V(Object[] objArr, int i3, int i4) {
        this.f2685c = objArr;
        this.f2686d = i3;
        this.f2687e = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0181d1.g(i3, this.f2687e);
        Object obj = this.f2685c[i3 + i3 + this.f2686d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2687e;
    }
}
