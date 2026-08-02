package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class Io implements Ph {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Eo f9621k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0800ba f9622l;

    public /* synthetic */ Io(Eo eo, C0800ba c0800ba) {
        this.f9621k = eo;
        this.f9622l = c0800ba;
    }

    @Override // com.google.android.gms.internal.ads.Ph
    public final void l0(C0387u0 c0387u0) {
        this.f9621k.l0(c0387u0);
        C0800ba c0800ba = this.f9622l;
        if (c0800ba != null) {
            try {
                Parcel N5 = c0800ba.N();
                F5.c(N5, c0387u0);
                c0800ba.d1(N5, 3);
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            }
        }
        if (c0800ba != null) {
            try {
                int i = c0387u0.f5058k;
                Parcel N6 = c0800ba.N();
                N6.writeInt(i);
                c0800ba.d1(N6, 2);
            } catch (RemoteException e5) {
                U2.j.k("#007 Could not call remote method.", e5);
            }
        }
    }
}
