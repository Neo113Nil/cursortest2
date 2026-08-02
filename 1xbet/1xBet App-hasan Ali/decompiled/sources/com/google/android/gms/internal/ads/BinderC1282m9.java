package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.m9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1282m9 extends E5 implements InterfaceC0746a9 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0905dr f14479k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1282m9(C0905dr c0905dr) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        this.f14479k = c0905dr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0746a9
    public final void j0(U8 u8) {
        C1529ro c1529ro;
        String str;
        C0905dr c0905dr = this.f14479k;
        com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) c0905dr.f13186l;
        synchronized (c0905dr) {
            c1529ro = (C1529ro) c0905dr.f13188n;
            if (c1529ro == null) {
                c1529ro = new C1529ro(u8);
                c0905dr.f13188n = c1529ro;
            }
        }
        C0905dr c0905dr2 = (C0905dr) ((W2.l) eVar.f7432m);
        c0905dr2.getClass();
        m3.v.c("#008 Must be called on the main UI thread.");
        try {
            str = ((U8) c1529ro.f15382l).e();
        } catch (RemoteException e3) {
            U2.j.g("", e3);
            str = null;
        }
        U2.j.d("Adapter called onAdLoaded with template id ".concat(String.valueOf(str)));
        c0905dr2.f13188n = c1529ro;
        try {
            ((InterfaceC0659Pa) c0905dr2.f13186l).n();
        } catch (RemoteException e5) {
            U2.j.k("#007 Could not call remote method.", e5);
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
        F5.b(parcel);
        j0(t8);
        parcel2.writeNoException();
        return true;
    }
}
