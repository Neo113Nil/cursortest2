package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes.dex */
public final class W extends C {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f5115c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f5116d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f5117e;

    public W(int i2, int i3, Object[] objArr) {
        this.f5115c = objArr;
        this.f5116d = i2;
        this.f5117e = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC0325d1.i(i2, this.f5117e);
        Object obj = this.f5115c[i2 + i2 + this.f5116d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5117e;
    }
}
