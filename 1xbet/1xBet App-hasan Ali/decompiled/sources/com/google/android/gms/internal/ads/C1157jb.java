package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1157jb extends D5 implements InterfaceC1202kb {
    public C1157jb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1202kb
    public final void q(C0387u0 c0387u0) {
        Parcel N5 = N();
        F5.c(N5, c0387u0);
        d1(N5, 3);
    }
}
