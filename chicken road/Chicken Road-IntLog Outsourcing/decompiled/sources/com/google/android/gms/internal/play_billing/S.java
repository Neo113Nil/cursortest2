package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes.dex */
public final class S extends C {

    /* renamed from: e, reason: collision with root package name */
    public static final S f5100e = new S(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f5101c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f5102d;

    public S(int i2, Object[] objArr) {
        this.f5101c = objArr;
        this.f5102d = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.C, com.google.android.gms.internal.play_billing.AbstractC0382x
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f5101c;
        int i2 = this.f5102d;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final int c() {
        return this.f5102d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final Object[] g() {
        return this.f5101c;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC0325d1.i(i2, this.f5102d);
        Object obj = this.f5101c[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5102d;
    }
}
