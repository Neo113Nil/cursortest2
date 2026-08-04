package com.google.ads.mediation;

import F2.C0252s;
import F2.C0254t;
import F2.I;
import F2.I0;
import F2.L0;
import F2.M;
import F2.O0;
import J2.j;
import L2.m;
import L2.o;
import L2.s;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdw;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbhn;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p167y2.C;
import p167y2.f;
import p167y2.g;
import p167y2.h;
import p167y2.i;
import p167y2.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private g adLoader;
    protected AdView mAdView;
    protected K2.a mInterstitialAd;

    public i buildAdRequest(Context context, L2.d dVar, Bundle bundle, Bundle bundle2) {
        h hVar = new h(6);
        Set keywords = dVar.getKeywords();
        L0 l7 = (L0) hVar.f364a;
        if (keywords != null) {
            Iterator it = keywords.iterator();
            while (it.hasNext()) {
                ((HashSet) l7.f2592d).add((String) it.next());
            }
        }
        if (dVar.isTesting()) {
            J2.d dVar2 = C0252s.f2717f.f2718a;
            ((HashSet) l7.f2593e).add(J2.d.q(context));
        }
        if (dVar.taggedForChildDirectedTreatment() != -1) {
            l7.f2589a = dVar.taggedForChildDirectedTreatment() != 1 ? 0 : 1;
        }
        l7.f2591c = dVar.isDesignedForFamilies();
        hVar.a(buildExtrasBundle(bundle, bundle2), AdMobAdapter.class);
        return new i(hVar);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public K2.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public I0 getVideoController() {
        I0 i7;
        AdView adView = this.mAdView;
        if (adView == null) {
            return null;
        }
        y yVar = adView.f18180a.f2618c;
        synchronized (yVar.f18195a) {
            i7 = yVar.f18196b;
        }
        return i7;
    }

    public f newAdLoader(Context context, String str) {
        return new f(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, L2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z4) {
        K2.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.setImmersiveMode(z4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, L2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            zzbby.zza(adView.getContext());
            if (((Boolean) zzbdw.zzg.zze()).booleanValue()) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlf)).booleanValue()) {
                    J2.b.f3804b.execute(new C(adView, 2));
                    return;
                }
            }
            O0 o7 = adView.f18180a;
            o7.getClass();
            try {
                M m7 = o7.f2624i;
                if (m7 != null) {
                    m7.zzz();
                }
            } catch (RemoteException e7) {
                j.i("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, L2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            zzbby.zza(adView.getContext());
            if (((Boolean) zzbdw.zzh.zze()).booleanValue()) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzld)).booleanValue()) {
                    J2.b.f3804b.execute(new C(adView, 0));
                    return;
                }
            }
            O0 o7 = adView.f18180a;
            o7.getClass();
            try {
                M m7 = o7.f2624i;
                if (m7 != null) {
                    m7.zzB();
                }
            } catch (RemoteException e7) {
                j.i("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, L2.i iVar, Bundle bundle, p167y2.j jVar, L2.d dVar, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new p167y2.j(jVar.f18170a, jVar.f18171b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, iVar));
        this.mAdView.b(buildAdRequest(context, dVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, m mVar, Bundle bundle, L2.d dVar, Bundle bundle2) {
        K2.a.load(context, getAdUnitId(bundle), buildAdRequest(context, dVar, bundle2, bundle), new c(this, mVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, o oVar, Bundle bundle, s sVar, Bundle bundle2) {
        e eVar = new e(this, oVar);
        f fVarNewAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        fVarNewAdLoader.c(eVar);
        I i7 = fVarNewAdLoader.f18157b;
        try {
            i7.zzo(new zzbey(sVar.getNativeAdOptions()));
        } catch (RemoteException e7) {
            j.h("Failed to specify native ad options", e7);
        }
        fVarNewAdLoader.d(sVar.getNativeAdRequestOptions());
        if (sVar.isUnifiedNativeAdRequested()) {
            try {
                i7.zzk(new zzbhn(eVar));
            } catch (RemoteException e8) {
                j.h("Failed to add google native ad listener", e8);
            }
        }
        if (sVar.zzb()) {
            for (String str : sVar.zza().keySet()) {
                zzbhk zzbhkVar = new zzbhk(eVar, true != ((Boolean) sVar.zza().get(str)).booleanValue() ? null : eVar);
                try {
                    i7.zzh(str, zzbhkVar.zzd(), zzbhkVar.zzc());
                } catch (RemoteException e9) {
                    j.h("Failed to add custom template ad listener", e9);
                }
            }
        }
        g gVarA = fVarNewAdLoader.a();
        this.adLoader = gVarA;
        gVarA.a(buildAdRequest(context, sVar, bundle2, bundle).f18160a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        K2.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.show(null);
        }
    }
}
