package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.Eb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582Eb extends D5 implements InterfaceC0590Fb {
    public C0582Eb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0590Fb
    public final void e3(String[] strArr, int[] iArr, InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        N5.writeStringArray(strArr);
        N5.writeIntArray(iArr);
        F5.e(N5, interfaceC2360a);
        d1(N5, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0590Fb
    public final void g() {
        d1(N(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0590Fb
    public final void g0(Intent intent) {
        Parcel N5 = N();
        F5.c(N5, intent);
        d1(N5, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0590Fb
    public final void i2(InterfaceC2360a interfaceC2360a, R2.a aVar) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, aVar);
        d1(N5, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0590Fb
    public final void x2(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 4);
    }
}
