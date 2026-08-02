package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.Jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618Jb extends D5 implements InterfaceC0632Lb {
    public C0618Jb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void I2(int i, String[] strArr, int[] iArr) {
        Parcel N5 = N();
        N5.writeInt(i);
        N5.writeStringArray(strArr);
        N5.writeIntArray(iArr);
        d1(N5, 15);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void J() {
        d1(N(), 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void Y0(Bundle bundle) {
        Parcel N5 = N();
        F5.c(N5, bundle);
        Parcel Y4 = Y(N5, 6);
        if (Y4.readInt() != 0) {
            bundle.readFromParcel(Y4);
        }
        Y4.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void Z1(int i, int i5, Intent intent) {
        Parcel N5 = N();
        N5.writeInt(i);
        N5.writeInt(i5);
        F5.c(N5, intent);
        d1(N5, 12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void e() {
        d1(N(), 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void l() {
        d1(N(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void m2(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void n() {
        d1(N(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final boolean n2() {
        Parcel Y4 = Y(N(), 11);
        ClassLoader classLoader = F5.f8654a;
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void s() {
        d1(N(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void t() {
        d1(N(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void u() {
        d1(N(), 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void v() {
        d1(N(), 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void w() {
        d1(N(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void z0(Bundle bundle) {
        Parcel N5 = N();
        F5.c(N5, bundle);
        d1(N5, 1);
    }
}
