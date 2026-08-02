package com.google.ads.mediation;

import J2.u;
import W2.j;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0905dr;
import com.google.android.gms.internal.ads.InterfaceC0659Pa;
import m3.v;

/* loaded from: classes.dex */
public final class d extends u {

    /* renamed from: c, reason: collision with root package name */
    public final j f7429c;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, j jVar) {
        this.f7429c = jVar;
    }

    @Override // J2.u
    public final void a() {
        C0905dr c0905dr = (C0905dr) this.f7429c;
        c0905dr.getClass();
        v.c("#008 Must be called on the main UI thread.");
        U2.j.d("Adapter called onAdClosed.");
        try {
            ((InterfaceC0659Pa) c0905dr.f13186l).c();
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // J2.u
    public final void e() {
        C0905dr c0905dr = (C0905dr) this.f7429c;
        c0905dr.getClass();
        v.c("#008 Must be called on the main UI thread.");
        U2.j.d("Adapter called onAdOpened.");
        try {
            ((InterfaceC0659Pa) c0905dr.f13186l).r();
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }
}
