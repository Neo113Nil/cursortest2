package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Cp implements Mp {

    /* renamed from: a, reason: collision with root package name */
    public final String f8089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8090b;

    public Cp(String str, int i) {
        this.f8089a = str;
        this.f8090b = i;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        return 31;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final E3.a d() {
        return AbstractC1400ot.c0(new C0993fp(this.f8090b, 1, this.f8089a));
    }
}
