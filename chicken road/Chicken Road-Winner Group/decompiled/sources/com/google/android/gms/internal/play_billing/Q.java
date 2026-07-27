package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes.dex */
public final class Q extends C {

    /* renamed from: e, reason: collision with root package name */
    public static final Q f2666e = new Q(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f2667c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f2668d;

    public Q(int i3, Object[] objArr) {
        this.f2667c = objArr;
        this.f2668d = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.C, com.google.android.gms.internal.play_billing.AbstractC0238x
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f2667c;
        int i3 = this.f2668d;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final int c() {
        return this.f2668d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final Object[] g() {
        return this.f2667c;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0181d1.g(i3, this.f2668d);
        Object obj = this.f2667c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2668d;
    }
}
