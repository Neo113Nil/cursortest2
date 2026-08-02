package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class NE implements InterfaceC1556sE {

    /* renamed from: k, reason: collision with root package name */
    public boolean f10784k;

    /* renamed from: l, reason: collision with root package name */
    public long f10785l;

    /* renamed from: m, reason: collision with root package name */
    public long f10786m;

    /* renamed from: n, reason: collision with root package name */
    public Y7 f10787n;

    @Override // com.google.android.gms.internal.ads.InterfaceC1556sE
    public final long a() {
        long j5 = this.f10785l;
        if (!this.f10784k) {
            return j5;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10786m;
        return this.f10787n.f12280a == 1.0f ? AbstractC1260lo.s(elapsedRealtime) + j5 : (elapsedRealtime * r4.f12282c) + j5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1556sE
    public final void b(Y7 y7) {
        if (this.f10784k) {
            c(a());
        }
        this.f10787n = y7;
    }

    public final void c(long j5) {
        this.f10785l = j5;
        if (this.f10784k) {
            this.f10786m = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1556sE
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1556sE
    public final Y7 i() {
        return this.f10787n;
    }
}
