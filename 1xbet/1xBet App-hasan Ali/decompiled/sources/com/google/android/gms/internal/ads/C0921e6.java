package com.google.android.gms.internal.ads;

import Q2.InterfaceC0383s0;
import android.os.Parcel;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0921e6 extends D5 implements InterfaceC0966f6 {
    @Override // com.google.android.gms.internal.ads.InterfaceC0966f6
    public final void R0(InterfaceC2360a interfaceC2360a, InterfaceC1189k6 interfaceC1189k6) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC1189k6);
        d1(N5, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0966f6
    public final InterfaceC0383s0 c() {
        Parcel Y4 = Y(N(), 5);
        InterfaceC0383s0 u32 = Ih.u3(Y4.readStrongBinder());
        Y4.recycle();
        return u32;
    }
}
