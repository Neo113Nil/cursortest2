package com.google.ads.mediation;

import J2.m;
import Q2.BinderC0382s;
import Q2.K;
import W2.j;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0844ca;
import com.google.android.gms.internal.ads.C0905dr;
import com.google.android.gms.internal.ads.InterfaceC0659Pa;
import m3.v;

/* loaded from: classes.dex */
public final class c extends L2.a {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractAdViewAdapter f7427c;

    /* renamed from: d, reason: collision with root package name */
    public final j f7428d;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, j jVar) {
        this.f7427c = abstractAdViewAdapter;
        this.f7428d = jVar;
    }

    @Override // J2.u
    public final void b(m mVar) {
        ((C0905dr) this.f7428d).i(mVar);
    }

    @Override // J2.u
    public final void d(Object obj) {
        V2.a aVar = (V2.a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f7427c;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        j jVar = this.f7428d;
        d dVar = new d(abstractAdViewAdapter, jVar);
        C0844ca c0844ca = (C0844ca) aVar;
        c0844ca.getClass();
        try {
            K k5 = c0844ca.f12999c;
            if (k5 != null) {
                k5.X0(new BinderC0382s(dVar));
            }
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
        C0905dr c0905dr = (C0905dr) jVar;
        c0905dr.getClass();
        v.c("#008 Must be called on the main UI thread.");
        U2.j.d("Adapter called onAdLoaded.");
        try {
            ((InterfaceC0659Pa) c0905dr.f13186l).n();
        } catch (RemoteException e5) {
            U2.j.k("#007 Could not call remote method.", e5);
        }
    }
}
