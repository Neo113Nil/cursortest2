package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1525rk {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15367a;

    /* renamed from: b, reason: collision with root package name */
    public Sm f15368b = new Sm();

    /* renamed from: c, reason: collision with root package name */
    public boolean f15369c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15370d;

    public C1525rk(Object obj) {
        this.f15367a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1525rk.class != obj.getClass()) {
            return false;
        }
        return this.f15367a.equals(((C1525rk) obj).f15367a);
    }

    public final int hashCode() {
        return this.f15367a.hashCode();
    }
}
