package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.g6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011g6 extends D5 implements InterfaceC1101i6 {
    @Override // com.google.android.gms.internal.ads.InterfaceC1101i6
    public final void e2(C0387u0 c0387u0) {
        Parcel N5 = N();
        F5.c(N5, c0387u0);
        d1(N5, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1101i6
    public final void n0(InterfaceC0966f6 interfaceC0966f6) {
        Parcel N5 = N();
        F5.e(N5, interfaceC0966f6);
        d1(N5, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1101i6
    public final void z(int i) {
        Parcel N5 = N();
        N5.writeInt(i);
        d1(N5, 2);
    }
}
