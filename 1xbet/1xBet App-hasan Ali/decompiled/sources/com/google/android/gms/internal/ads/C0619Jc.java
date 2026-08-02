package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Jc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619Jc extends D5 implements InterfaceC0633Lc {
    @Override // com.google.android.gms.internal.ads.InterfaceC0633Lc
    public final void J0(C0387u0 c0387u0) {
        Parcel N5 = N();
        F5.c(N5, c0387u0);
        d1(N5, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633Lc
    public final void b() {
        d1(N(), 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633Lc
    public final void c() {
        d1(N(), 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633Lc
    public final void f() {
        d1(N(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633Lc
    public final void f0(int i) {
        Parcel N5 = N();
        N5.writeInt(i);
        d1(N5, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633Lc
    public final void h() {
        d1(N(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633Lc
    public final void z1(InterfaceC0591Fc interfaceC0591Fc) {
        Parcel N5 = N();
        F5.e(N5, interfaceC0591Fc);
        d1(N5, 3);
    }
}
