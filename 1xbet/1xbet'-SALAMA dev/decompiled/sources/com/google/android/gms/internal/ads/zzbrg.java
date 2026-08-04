package com.google.android.gms.internal.ads;

import E2.o;
import I2.P;
import J2.j;
import L2.d;
import L2.m;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import p109p.k;
import p109p.l;

/* JADX INFO: loaded from: classes.dex */
public final class zzbrg implements MediationInterstitialAdapter {
    private Activity zza;
    private m zzb;
    private Uri zzc;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        j.b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        j.b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        j.b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, m mVar, Bundle bundle, d dVar, Bundle bundle2) {
        this.zzb = mVar;
        if (mVar == null) {
            j.g("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            j.g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
            return;
        }
        if (!zzbcz.zzg(context)) {
            j.g("Default browser does not support custom tabs. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            j.g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
        } else {
            this.zza = (Activity) context;
            this.zzc = Uri.parse(string);
            this.zzb.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        l lVarA = new k().a();
        Uri uri = this.zzc;
        Intent intent = lVarA.f15656a;
        intent.setData(uri);
        P.f3579l.post(new zzbrf(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(intent, null), null, new zzbre(this), null, new VersionInfoParcel(0, 0, false, false), null, null, "")));
        o.f1952C.f1961g.zzq();
    }
}
