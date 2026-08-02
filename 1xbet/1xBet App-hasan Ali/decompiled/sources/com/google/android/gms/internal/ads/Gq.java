package com.google.android.gms.internal.ads;

import Q2.C0370l0;
import android.os.RemoteException;
import d3.InterfaceC1915a;

/* loaded from: classes.dex */
public final class Gq implements InterfaceC1915a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9275k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D5 f9276l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E5 f9277m;

    public /* synthetic */ Gq(E5 e5, D5 d5, int i) {
        this.f9275k = i;
        this.f9276l = d5;
        this.f9277m = e5;
    }

    @Override // d3.InterfaceC1915a
    public final void d() {
        switch (this.f9275k) {
            case 0:
                if (((Iq) this.f9277m).f9636t != null) {
                    try {
                        C0370l0 c0370l0 = (C0370l0) this.f9276l;
                        c0370l0.d1(c0370l0.N(), 1);
                        break;
                    } catch (RemoteException e3) {
                        U2.j.k("#007 Could not call remote method.", e3);
                        return;
                    }
                }
                break;
            default:
                if (((Jq) this.f9277m).f10073n != null) {
                    try {
                        Q2.N n5 = (Q2.N) this.f9276l;
                        n5.d1(n5.N(), 1);
                        break;
                    } catch (RemoteException e5) {
                        U2.j.k("#007 Could not call remote method.", e5);
                    }
                }
                break;
        }
    }
}
