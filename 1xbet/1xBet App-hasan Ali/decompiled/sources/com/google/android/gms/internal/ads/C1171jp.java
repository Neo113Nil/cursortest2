package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.jp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1171jp implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final int f14156a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14157b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14158c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14159d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14160e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14161g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14162h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f14163j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f14164k;

    public C1171jp(int i, boolean z3, boolean z5, int i5, int i6, int i7, int i8, int i9, float f, boolean z6, boolean z7) {
        this.f14156a = i;
        this.f14157b = z3;
        this.f14158c = z5;
        this.f14159d = i5;
        this.f14160e = i6;
        this.f = i7;
        this.f14161g = i8;
        this.f14162h = i9;
        this.i = f;
        this.f14163j = z6;
        this.f14164k = z7;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void o(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8049a;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Ba)).booleanValue()) {
            bundle.putInt("muv_min", this.f14160e);
            bundle.putInt("muv_max", this.f);
        }
        bundle.putFloat("android_app_volume", this.i);
        bundle.putBoolean("android_app_muted", this.f14163j);
        if (this.f14164k) {
            return;
        }
        bundle.putInt("am", this.f14156a);
        bundle.putBoolean("ma", this.f14157b);
        bundle.putBoolean("sp", this.f14158c);
        bundle.putInt("muv", this.f14159d);
        bundle.putInt("rm", this.f14161g);
        bundle.putInt("riv", this.f14162h);
    }
}
