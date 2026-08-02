package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1070hc extends D5 implements InterfaceC1115ic {
    @Override // com.google.android.gms.internal.ads.InterfaceC1115ic
    public final void E2(C1428pc c1428pc, InterfaceC1293mc interfaceC1293mc) {
        Parcel N5 = N();
        F5.c(N5, c1428pc);
        F5.e(N5, interfaceC1293mc);
        d1(N5, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1115ic
    public final void Q0(C1428pc c1428pc, InterfaceC1293mc interfaceC1293mc) {
        Parcel N5 = N();
        F5.c(N5, c1428pc);
        F5.e(N5, interfaceC1293mc);
        d1(N5, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1115ic
    public final void r0(String str, InterfaceC1293mc interfaceC1293mc) {
        Parcel N5 = N();
        N5.writeString(str);
        F5.e(N5, interfaceC1293mc);
        d1(N5, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1115ic
    public final void r3(C1428pc c1428pc, InterfaceC1293mc interfaceC1293mc) {
        Parcel N5 = N();
        F5.c(N5, c1428pc);
        F5.e(N5, interfaceC1293mc);
        d1(N5, 5);
    }
}
