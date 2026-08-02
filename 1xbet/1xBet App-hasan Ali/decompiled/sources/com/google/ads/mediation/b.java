package com.google.ads.mediation;

import J2.m;
import Q2.InterfaceC0347a;
import U2.j;
import W2.h;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0905dr;
import com.google.android.gms.internal.ads.InterfaceC0659Pa;
import m3.v;

/* loaded from: classes.dex */
public final class b extends J2.d implements K2.d, InterfaceC0347a {

    /* renamed from: k, reason: collision with root package name */
    public final h f7426k;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, h hVar) {
        this.f7426k = hVar;
    }

    @Override // J2.d
    public final void a() {
        C0905dr c0905dr = (C0905dr) this.f7426k;
        c0905dr.getClass();
        v.c("#008 Must be called on the main UI thread.");
        j.d("Adapter called onAdClosed.");
        try {
            ((InterfaceC0659Pa) c0905dr.f13186l).c();
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // J2.d
    public final void b(m mVar) {
        ((C0905dr) this.f7426k).h(mVar);
    }

    @Override // J2.d
    public final void i() {
        C0905dr c0905dr = (C0905dr) this.f7426k;
        c0905dr.getClass();
        v.c("#008 Must be called on the main UI thread.");
        j.d("Adapter called onAdLoaded.");
        try {
            ((InterfaceC0659Pa) c0905dr.f13186l).n();
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // J2.d
    public final void j() {
        C0905dr c0905dr = (C0905dr) this.f7426k;
        c0905dr.getClass();
        v.c("#008 Must be called on the main UI thread.");
        j.d("Adapter called onAdOpened.");
        try {
            ((InterfaceC0659Pa) c0905dr.f13186l).r();
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // K2.d
    public final void w(String str, String str2) {
        C0905dr c0905dr = (C0905dr) this.f7426k;
        c0905dr.getClass();
        v.c("#008 Must be called on the main UI thread.");
        j.d("Adapter called onAppEvent.");
        try {
            ((InterfaceC0659Pa) c0905dr.f13186l).A1(str, str2);
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // J2.d
    public final void z() {
        C0905dr c0905dr = (C0905dr) this.f7426k;
        c0905dr.getClass();
        v.c("#008 Must be called on the main UI thread.");
        j.d("Adapter called onAdClicked.");
        try {
            ((InterfaceC0659Pa) c0905dr.f13186l).b();
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
        }
    }
}
