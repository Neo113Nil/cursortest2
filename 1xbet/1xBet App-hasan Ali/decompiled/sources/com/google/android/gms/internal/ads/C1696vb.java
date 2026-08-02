package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.vb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1696vb implements S2.m {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ zzbrw f16008k;

    public C1696vb(zzbrw zzbrwVar) {
        this.f16008k = zzbrwVar;
    }

    @Override // S2.m
    public final void N2() {
        U2.j.d("Opening AdMobCustomTabsAdapter overlay.");
        C0905dr c0905dr = (C0905dr) this.f16008k.f16803b;
        c0905dr.getClass();
        m3.v.c("#008 Must be called on the main UI thread.");
        U2.j.d("Adapter called onAdOpened.");
        try {
            ((InterfaceC0659Pa) c0905dr.f13186l).r();
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // S2.m
    public final void Q1() {
        U2.j.d("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // S2.m
    public final void Z2() {
        U2.j.d("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // S2.m
    public final void d1(int i) {
        U2.j.d("AdMobCustomTabsAdapter overlay is closed.");
        C0905dr c0905dr = (C0905dr) this.f16008k.f16803b;
        c0905dr.getClass();
        m3.v.c("#008 Must be called on the main UI thread.");
        U2.j.d("Adapter called onAdClosed.");
        try {
            ((InterfaceC0659Pa) c0905dr.f13186l).c();
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // S2.m
    public final void h1() {
    }

    @Override // S2.m
    public final void t1() {
        U2.j.d("AdMobCustomTabsAdapter overlay is paused.");
    }
}
