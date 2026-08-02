package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1586t {

    /* renamed from: a, reason: collision with root package name */
    public int f15621a;

    /* renamed from: b, reason: collision with root package name */
    public int f15622b;

    /* renamed from: c, reason: collision with root package name */
    public int f15623c;

    public C1586t() {
        this.f15621a = 0;
        this.f15622b = 0;
        this.f15623c = 0;
    }

    public static C1586t a(Q2.a1 a1Var) {
        return a1Var.f4977n ? new C1586t(3, 0, 0) : a1Var.f4982s ? new C1586t(2, 0, 0) : a1Var.f4981r ? new C1586t(0, 0, 0) : new C1586t(1, a1Var.f4979p, a1Var.f4976m);
    }

    public boolean b() {
        return this.f15621a == 3;
    }

    public C1586t(int i, int i5, int i6) {
        this.f15621a = i;
        this.f15623c = i5;
        this.f15622b = i6;
    }

    public /* synthetic */ C1586t(int i, int i5, int i6, boolean z3) {
        this.f15621a = i;
        this.f15622b = i5;
        this.f15623c = i6;
    }
}
