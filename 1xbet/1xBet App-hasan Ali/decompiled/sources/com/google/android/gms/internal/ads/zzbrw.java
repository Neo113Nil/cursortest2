package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* loaded from: classes.dex */
public final class zzbrw implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    public Activity f16802a;

    /* renamed from: b, reason: collision with root package name */
    public W2.j f16803b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f16804c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        U2.j.d("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        U2.j.d("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        U2.j.d("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, W2.j jVar, Bundle bundle, W2.d dVar, Bundle bundle2) {
        this.f16803b = jVar;
        if (jVar == null) {
            U2.j.i("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            U2.j.i("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((C0905dr) this.f16803b).g();
            return;
        }
        if (!Q7.a(context)) {
            U2.j.i("Default browser does not support custom tabs. Bailing out.");
            ((C0905dr) this.f16803b).g();
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            U2.j.i("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            ((C0905dr) this.f16803b).g();
            return;
        }
        this.f16802a = (Activity) context;
        this.f16804c = Uri.parse(string);
        C0905dr c0905dr = (C0905dr) this.f16803b;
        c0905dr.getClass();
        m3.v.c("#008 Must be called on the main UI thread.");
        U2.j.d("Adapter called onAdLoaded.");
        try {
            ((InterfaceC0659Pa) c0905dr.f13186l).n();
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        G.v a5 = new P.W(6).a();
        ((Intent) a5.f1749l).setData(this.f16804c);
        T2.L.f5672l.post(new Kw(9, this, new AdOverlayInfoParcel(new S2.e((Intent) a5.f1749l, null), null, new C1696vb(this), null, new U2.a(0, 0, false, false), null, null, ""), false));
        P2.o oVar = P2.o.f4767B;
        C0560Bd c0560Bd = oVar.f4774g.f8018l;
        c0560Bd.getClass();
        oVar.f4776j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (c0560Bd.f7817a) {
            try {
                if (c0560Bd.f7819c == 3) {
                    if (c0560Bd.f7818b + ((Long) Q2.r.f5053d.f5056c.a(F7.D5)).longValue() <= currentTimeMillis) {
                        c0560Bd.f7819c = 1;
                    }
                }
            } finally {
            }
        }
        oVar.f4776j.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        synchronized (c0560Bd.f7817a) {
            try {
                if (c0560Bd.f7819c != 2) {
                    return;
                }
                c0560Bd.f7819c = 3;
                if (c0560Bd.f7819c == 3) {
                    c0560Bd.f7818b = currentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
