package com.google.ads.mediation;

import J2.f;
import J2.g;
import J2.h;
import J2.i;
import J2.j;
import J2.s;
import J2.t;
import Q2.C0;
import Q2.C0379q;
import Q2.C0397z0;
import Q2.G;
import Q2.InterfaceC0391w0;
import Q2.K;
import Q2.K0;
import Q2.L0;
import Q2.U0;
import Q2.V0;
import Q2.r;
import W2.l;
import W2.n;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.AbstractC0968f8;
import com.google.android.gms.internal.ads.B8;
import com.google.android.gms.internal.ads.BinderC1237l9;
import com.google.android.gms.internal.ads.BinderC1282m9;
import com.google.android.gms.internal.ads.BinderC1372o9;
import com.google.android.gms.internal.ads.C0801bb;
import com.google.android.gms.internal.ads.C0844ca;
import com.google.android.gms.internal.ads.C0905dr;
import com.google.android.gms.internal.ads.F7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private f adLoader;
    protected j mAdView;
    protected V2.a mInterstitialAd;

    public h buildAdRequest(Context context, W2.d dVar, Bundle bundle, Bundle bundle2) {
        g gVar = new g(0);
        Set c5 = dVar.c();
        C0397z0 c0397z0 = (C0397z0) gVar.f2693a;
        if (c5 != null) {
            Iterator it = c5.iterator();
            while (it.hasNext()) {
                c0397z0.f5064a.add((String) it.next());
            }
        }
        if (dVar.b()) {
            U2.e eVar = C0379q.f.f5048a;
            c0397z0.f5067d.add(U2.e.m(context));
        }
        if (dVar.d() != -1) {
            c0397z0.f5070h = dVar.d() != 1 ? 0 : 1;
        }
        c0397z0.i = dVar.a();
        gVar.a(buildExtrasBundle(bundle, bundle2));
        return new h(gVar);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public V2.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public InterfaceC0391w0 getVideoController() {
        InterfaceC0391w0 interfaceC0391w0;
        j jVar = this.mAdView;
        if (jVar == null) {
            return null;
        }
        v3.g gVar = (v3.g) jVar.f2723k.f4904c;
        synchronized (gVar.f20439l) {
            interfaceC0391w0 = (InterfaceC0391w0) gVar.f20440m;
        }
        return interfaceC0391w0;
    }

    public J2.e newAdLoader(Context context, String str) {
        return new J2.e(context, str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(2:5|(2:7|8))|9|10|11|(1:13)|8) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        U2.j.k("#007 Could not call remote method.", r0);
     */
    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, W2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDestroy() {
        j jVar = this.mAdView;
        if (jVar != null) {
            F7.a(jVar.getContext());
            if (((Boolean) AbstractC0968f8.f13458e.s()).booleanValue()) {
                if (((Boolean) r.f5053d.f5056c.a(F7.Ia)).booleanValue()) {
                    U2.c.f5860b.execute(new t(jVar, 1));
                    this.mAdView = null;
                }
            }
            C0 c02 = jVar.f2723k;
            c02.getClass();
            K k5 = (K) c02.i;
            if (k5 != null) {
                k5.v();
            }
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z3) {
        V2.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            try {
                K k5 = ((C0844ca) aVar).f12999c;
                if (k5 != null) {
                    k5.U1(z3);
                }
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, W2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        j jVar = this.mAdView;
        if (jVar != null) {
            F7.a(jVar.getContext());
            if (((Boolean) AbstractC0968f8.f13459g.s()).booleanValue()) {
                if (((Boolean) r.f5053d.f5056c.a(F7.Ja)).booleanValue()) {
                    U2.c.f5860b.execute(new t(jVar, 2));
                    return;
                }
            }
            C0 c02 = jVar.f2723k;
            c02.getClass();
            try {
                K k5 = (K) c02.i;
                if (k5 != null) {
                    k5.j1();
                }
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, W2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        j jVar = this.mAdView;
        if (jVar != null) {
            F7.a(jVar.getContext());
            if (((Boolean) AbstractC0968f8.f13460h.s()).booleanValue()) {
                if (((Boolean) r.f5053d.f5056c.a(F7.Ha)).booleanValue()) {
                    U2.c.f5860b.execute(new t(jVar, 0));
                    return;
                }
            }
            C0 c02 = jVar.f2723k;
            c02.getClass();
            try {
                K k5 = (K) c02.i;
                if (k5 != null) {
                    k5.D();
                }
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, W2.h hVar, Bundle bundle, i iVar, W2.d dVar, Bundle bundle2) {
        j jVar = new j(context);
        this.mAdView = jVar;
        jVar.setAdSize(new i(iVar.f2714a, iVar.f2715b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, hVar));
        this.mAdView.a(buildAdRequest(context, dVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, W2.j jVar, Bundle bundle, W2.d dVar, Bundle bundle2) {
        V2.a.a(context, getAdUnitId(bundle), buildAdRequest(context, dVar, bundle2, bundle), new c(this, jVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, l lVar, Bundle bundle, n nVar, Bundle bundle2) {
        M2.c cVar;
        Z2.d dVar;
        f fVar;
        e eVar = new e(this, lVar);
        J2.e newAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        newAdLoader.getClass();
        try {
            newAdLoader.f2708b.j2(new U0(eVar));
        } catch (RemoteException e3) {
            U2.j.j("Failed to set AdListener.", e3);
        }
        G g5 = newAdLoader.f2708b;
        C0801bb c0801bb = (C0801bb) nVar;
        c0801bb.getClass();
        M2.c cVar2 = new M2.c();
        int i = 3;
        B8 b8 = c0801bb.f12813d;
        if (b8 == null) {
            cVar = new M2.c(cVar2);
        } else {
            int i5 = b8.f7770k;
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 == 4) {
                        cVar2.f3611g = b8.f7776q;
                        cVar2.f3608c = b8.f7777r;
                    }
                    cVar2.f3606a = b8.f7771l;
                    cVar2.f3607b = b8.f7772m;
                    cVar2.f3609d = b8.f7773n;
                    cVar = new M2.c(cVar2);
                }
                V0 v02 = b8.f7775p;
                if (v02 != null) {
                    cVar2.f = new s(v02);
                }
            }
            cVar2.f3610e = b8.f7774o;
            cVar2.f3606a = b8.f7771l;
            cVar2.f3607b = b8.f7772m;
            cVar2.f3609d = b8.f7773n;
            cVar = new M2.c(cVar2);
        }
        try {
            g5.L1(new B8(cVar));
        } catch (RemoteException e5) {
            U2.j.j("Failed to specify native ad options", e5);
        }
        Z2.d dVar2 = new Z2.d();
        dVar2.f6345a = false;
        dVar2.f6346b = 0;
        dVar2.f6347c = false;
        dVar2.f6348d = 1;
        dVar2.f = false;
        dVar2.f6350g = false;
        dVar2.f6351h = 0;
        dVar2.i = 1;
        B8 b82 = c0801bb.f12813d;
        if (b82 == null) {
            dVar = new Z2.d(dVar2);
        } else {
            int i6 = b82.f7770k;
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        dVar2.f = b82.f7776q;
                        dVar2.f6346b = b82.f7777r;
                        dVar2.f6350g = b82.f7779t;
                        dVar2.f6351h = b82.f7778s;
                        int i7 = b82.f7780u;
                        if (i7 != 0) {
                            if (i7 != 2) {
                                if (i7 == 1) {
                                    i = 2;
                                }
                            }
                            dVar2.i = i;
                        }
                        i = 1;
                        dVar2.i = i;
                    }
                    dVar2.f6345a = b82.f7771l;
                    dVar2.f6347c = b82.f7773n;
                    dVar = new Z2.d(dVar2);
                }
                V0 v03 = b82.f7775p;
                if (v03 != null) {
                    dVar2.f6349e = new s(v03);
                }
            }
            dVar2.f6348d = b82.f7774o;
            dVar2.f6345a = b82.f7771l;
            dVar2.f6347c = b82.f7773n;
            dVar = new Z2.d(dVar2);
        }
        try {
            G g6 = newAdLoader.f2708b;
            boolean z3 = dVar.f6345a;
            boolean z5 = dVar.f6347c;
            int i8 = dVar.f6348d;
            s sVar = dVar.f6349e;
            g6.L1(new B8(4, z3, -1, z5, i8, sVar != null ? new V0(sVar) : null, dVar.f, dVar.f6346b, dVar.f6351h, dVar.f6350g, dVar.i - 1));
        } catch (RemoteException e6) {
            U2.j.j("Failed to specify native ad options", e6);
        }
        ArrayList arrayList = c0801bb.f12814e;
        if (arrayList.contains("6")) {
            try {
                g5.Y2(new BinderC1372o9(0, eVar));
            } catch (RemoteException e7) {
                U2.j.j("Failed to add google native ad listener", e7);
            }
        }
        if (arrayList.contains("3")) {
            HashMap hashMap = c0801bb.f12815g;
            for (String str : hashMap.keySet()) {
                BinderC1237l9 binderC1237l9 = null;
                e eVar2 = true != ((Boolean) hashMap.get(str)).booleanValue() ? null : eVar;
                C0905dr c0905dr = new C0905dr(9, eVar, eVar2);
                try {
                    BinderC1282m9 binderC1282m9 = new BinderC1282m9(c0905dr);
                    if (eVar2 != null) {
                        binderC1237l9 = new BinderC1237l9(c0905dr);
                    }
                    g5.i3(str, binderC1282m9, binderC1237l9);
                } catch (RemoteException e8) {
                    U2.j.j("Failed to add custom template ad listener", e8);
                }
            }
        }
        Context context2 = newAdLoader.f2707a;
        try {
            fVar = new f(context2, newAdLoader.f2708b.b());
        } catch (RemoteException e9) {
            U2.j.g("Failed to build AdLoader.", e9);
            fVar = new f(context2, new K0(new L0()));
        }
        this.adLoader = fVar;
        fVar.a(buildAdRequest(context, nVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        V2.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.b(null);
        }
    }
}
