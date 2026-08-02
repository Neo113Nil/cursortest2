package com.google.android.gms.internal.ads;

import Q2.AbstractBinderC0389v0;
import Q2.InterfaceC0383s0;
import Q2.InterfaceC0391w0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.j9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1147j9 extends D5 implements InterfaceC1192k9 {
    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final String A() {
        Parcel Y4 = Y(N(), 10);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final void K2(Bundle bundle) {
        Parcel N5 = N();
        F5.c(N5, bundle);
        d1(N5, 33);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final double b() {
        Parcel Y4 = Y(N(), 8);
        double readDouble = Y4.readDouble();
        Y4.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final E8 e() {
        E8 c8;
        Parcel Y4 = Y(N(), 14);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            c8 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c8 = queryLocalInterface instanceof E8 ? (E8) queryLocalInterface : new C8(readStrongBinder);
        }
        Y4.recycle();
        return c8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final InterfaceC0383s0 f() {
        Parcel Y4 = Y(N(), 31);
        InterfaceC0383s0 u32 = Ih.u3(Y4.readStrongBinder());
        Y4.recycle();
        return u32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final InterfaceC0391w0 g() {
        Parcel Y4 = Y(N(), 11);
        InterfaceC0391w0 u32 = AbstractBinderC0389v0.u3(Y4.readStrongBinder());
        Y4.recycle();
        return u32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final I8 k() {
        I8 h8;
        Parcel Y4 = Y(N(), 5);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            h8 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            h8 = queryLocalInterface instanceof I8 ? (I8) queryLocalInterface : new H8(readStrongBinder);
        }
        Y4.recycle();
        return h8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final InterfaceC2360a l() {
        return L1.a.q(Y(N(), 18));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final String m() {
        Parcel Y4 = Y(N(), 7);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final String n() {
        Parcel Y4 = Y(N(), 4);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final InterfaceC2360a o() {
        return L1.a.q(Y(N(), 19));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final String r() {
        Parcel Y4 = Y(N(), 6);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final String s() {
        Parcel Y4 = Y(N(), 2);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final List u() {
        Parcel Y4 = Y(N(), 3);
        ArrayList readArrayList = Y4.readArrayList(F5.f8654a);
        Y4.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final void v() {
        d1(N(), 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final String w() {
        Parcel Y4 = Y(N(), 9);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1192k9
    public final List y() {
        Parcel Y4 = Y(N(), 23);
        ArrayList readArrayList = Y4.readArrayList(F5.f8654a);
        Y4.recycle();
        return readArrayList;
    }
}
