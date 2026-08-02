package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.l9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1237l9 extends E5 implements Y8 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0905dr f14330k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1237l9(C0905dr c0905dr) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        this.f14330k = c0905dr;
    }

    @Override // com.google.android.gms.internal.ads.Y8
    public final void q3(U8 u8, String str) {
        C1529ro c1529ro;
        C0905dr c0905dr = this.f14330k;
        com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) c0905dr.f13187m;
        if (eVar == null) {
            return;
        }
        synchronized (c0905dr) {
            c1529ro = (C1529ro) c0905dr.f13188n;
            if (c1529ro == null) {
                c1529ro = new C1529ro(u8);
                c0905dr.f13188n = c1529ro;
            }
        }
        C0905dr c0905dr2 = (C0905dr) ((W2.l) eVar.f7432m);
        c0905dr2.getClass();
        try {
            ((InterfaceC0659Pa) c0905dr2.f13186l).X1((U8) c1529ro.f15382l, str);
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        U8 t8;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            t8 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            t8 = queryLocalInterface instanceof U8 ? (U8) queryLocalInterface : new T8(readStrongBinder);
        }
        String readString = parcel.readString();
        F5.b(parcel);
        q3(t8, readString);
        parcel2.writeNoException();
        return true;
    }
}
