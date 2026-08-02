package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Na, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0645Na extends D5 implements InterfaceC0659Pa {
    public C0645Na(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void A1(String str, String str2) {
        Parcel N5 = N();
        N5.writeString(str);
        N5.writeString(str2);
        d1(N5, 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void B(int i) {
        Parcel N5 = N();
        N5.writeInt(i);
        d1(N5, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void D2(String str, int i) {
        Parcel N5 = N();
        N5.writeInt(i);
        N5.writeString(str);
        d1(N5, 22);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void F() {
        d1(N(), 15);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void I0() {
        d1(N(), 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void J() {
        d1(N(), 11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void M0(String str) {
        Parcel N5 = N();
        N5.writeString(str);
        d1(N5, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void W0(C0575Dc c0575Dc) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void X1(U8 u8, String str) {
        Parcel N5 = N();
        F5.e(N5, u8);
        N5.writeString(str);
        d1(N5, 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void a3(C0387u0 c0387u0) {
        Parcel N5 = N();
        F5.c(N5, c0387u0);
        d1(N5, 23);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void b() {
        d1(N(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void c() {
        d1(N(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void l() {
        d1(N(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void m() {
        d1(N(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void n() {
        d1(N(), 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void n1(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void r() {
        d1(N(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void u() {
        d1(N(), 18);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void v() {
        d1(N(), 20);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void v2(C0387u0 c0387u0) {
        Parcel N5 = N();
        F5.c(N5, c0387u0);
        d1(N5, 24);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0659Pa
    public final void w1(InterfaceC0591Fc interfaceC0591Fc) {
        Parcel N5 = N();
        F5.e(N5, interfaceC0591Fc);
        d1(N5, 16);
    }
}
