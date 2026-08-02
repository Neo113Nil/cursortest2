package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Nc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0647Nc extends D5 implements InterfaceC0661Pc {
    public C0647Nc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0661Pc
    public final void f() {
        d1(N(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0661Pc
    public final void q(C0387u0 c0387u0) {
        Parcel N5 = N();
        F5.c(N5, c0387u0);
        d1(N5, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0661Pc
    public final void x(int i) {
        Parcel N5 = N();
        N5.writeInt(i);
        d1(N5, 2);
    }
}
