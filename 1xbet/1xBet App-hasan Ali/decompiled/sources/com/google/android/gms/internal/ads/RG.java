package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class RG implements NG {

    /* renamed from: a, reason: collision with root package name */
    public final NG f11420a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11421b;

    public RG(NG ng, long j5) {
        this.f11420a = ng;
        this.f11421b = j5;
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final int a(long j5) {
        return this.f11420a.a(j5 - this.f11421b);
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final boolean b() {
        return this.f11420a.b();
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final int c(C1667ur c1667ur, OD od, int i) {
        int c5 = this.f11420a.c(c1667ur, od, i);
        if (c5 != -4) {
            return c5;
        }
        od.f10939g += this.f11421b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final void j() {
        this.f11420a.j();
    }
}
