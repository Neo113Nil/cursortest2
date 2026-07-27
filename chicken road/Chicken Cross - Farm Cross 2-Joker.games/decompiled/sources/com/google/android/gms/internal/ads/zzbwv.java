package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbwv extends zzbvw {
    private final Object zza;
    private zzbwx zzb;
    private zzccs zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private NativeAdMapper zzh;
    private MediationRewardedAd zzi;
    private MediationInterscrollerAd zzj;
    private MediationAppOpenAd zzk;
    private final String zzl = "";

    public zzbwv(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzU(String str, com.google.android.gms.ads.internal.client.zzm zzmVar, String str2) throws RemoteException {
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
            throw new RemoteException();
        }
    }

    private final Bundle zzV(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final boolean zzW(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy();
    }

    private static final String zzX(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        String str2 = zzmVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzA(boolean z) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final com.google.android.gms.ads.internal.client.zzea zzB() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwj zzC() {
        UnifiedNativeAdMapper zzb;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzbwx zzbwxVar = this.zzb;
            if (zzbwxVar == null || (zzb = zzbwxVar.zzb()) == null) {
                return null;
            }
            return new zzbxb(zzb);
        }
        if (!(obj instanceof Adapter)) {
            return null;
        }
        NativeAdMapper nativeAdMapper = this.zzh;
        if (nativeAdMapper != null) {
            return new zzbwz(nativeAdMapper);
        }
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzg;
        if (unifiedNativeAdMapper != null) {
            return new zzbxb(unifiedNativeAdMapper);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzD(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) obj).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzU(str, zzmVar, null), zzV(zzmVar), zzW(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzX(str, zzmVar), ""), new zzbwt(this, zzbwaVar));
                return;
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                zzbvr.zza(iObjectWrapper, e, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.zzi;
        if (mediationRewardedAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } catch (RuntimeException e) {
            zzbvr.zza(iObjectWrapper, e, "adapter.rewarded.showAd");
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzF(IObjectWrapper iObjectWrapper, zzbsl zzbslVar, List list) throws RemoteException {
        char c;
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            throw new RemoteException();
        }
        try {
            zzbwo zzbwoVar = new zzbwo(this, zzbslVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbsr zzbsrVar = (zzbsr) it.next();
                String str = zzbsrVar.zza;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1167692200:
                        if (str.equals(FirebaseAnalytics.Event.APP_OPEN)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1778294298:
                        if (str.equals("app_open_ad")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1911491517:
                        if (str.equals("rewarded_interstitial")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                AdFormat adFormat = null;
                switch (c) {
                    case 0:
                        adFormat = AdFormat.BANNER;
                        break;
                    case 1:
                        adFormat = AdFormat.INTERSTITIAL;
                        break;
                    case 2:
                        adFormat = AdFormat.REWARDED;
                        break;
                    case 3:
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        break;
                    case 4:
                        adFormat = AdFormat.NATIVE;
                        break;
                    case 5:
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    case 6:
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznz)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            break;
                        }
                        break;
                }
                if (adFormat != null) {
                    arrayList.add(new MediationConfiguration(adFormat, zzbsrVar.zzb));
                }
            }
            ((Adapter) obj).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbwoVar, arrayList);
        } catch (Throwable th) {
            zzbvr.zza(iObjectWrapper, th, "adapter.initialize");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzG(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) obj).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzU(str, zzmVar, null), zzV(zzmVar), zzW(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzX(str, zzmVar), ""), new zzbwt(this, zzbwaVar));
                return;
            } catch (Exception e) {
                zzbvr.zza(iObjectWrapper, e, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbyi zzH() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbyi.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbyi zzI() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbyi.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzJ(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting interscroller ad from adapter.");
        try {
            Adapter adapter = (Adapter) obj;
            zzbwn zzbwnVar = new zzbwn(this, zzbwaVar, adapter);
            zzU(str, zzmVar, str2);
            zzV(zzmVar);
            zzW(zzmVar);
            Location location = zzmVar.zzk;
            int i = zzmVar.zzg;
            int i2 = zzmVar.zzt;
            zzX(str, zzmVar);
            com.google.android.gms.ads.zzc.zzc(zzrVar.zze, zzrVar.zzb);
            String simpleName = adapter.getClass().getSimpleName();
            String.valueOf(simpleName);
            zzbwnVar.onFailure(new AdError(7, String.valueOf(simpleName).concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            zzbvr.zza(iObjectWrapper, e, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwd zzK() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzj;
        if (mediationInterscrollerAd != null) {
            return new zzbww(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                zzh();
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.zzf;
            if (mediationInterstitialAd == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
            try {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } catch (RuntimeException e) {
                zzbvr.zza(iObjectWrapper, e, "adapter.interstitial.showAd");
                throw e;
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzM(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting app open ad from adapter.");
            try {
                ((Adapter) obj).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzU(str, zzmVar, null), zzV(zzmVar), zzW(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzX(str, zzmVar), ""), new zzbwu(this, zzbwaVar));
                return;
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                zzbvr.zza(iObjectWrapper, e, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzN(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show app open ad from adapter.");
        MediationAppOpenAd mediationAppOpenAd = this.zzk;
        if (mediationAppOpenAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        try {
            mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } catch (RuntimeException e) {
            zzbvr.zza(iObjectWrapper, e, "adapter.appOpen.showAd");
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwf zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwg zzP() {
        return null;
    }

    final /* synthetic */ void zzQ(NativeAdMapper nativeAdMapper) {
        this.zzh = nativeAdMapper;
    }

    final /* synthetic */ void zzR(MediationRewardedAd mediationRewardedAd) {
        this.zzi = mediationRewardedAd;
    }

    final /* synthetic */ void zzS(MediationInterscrollerAd mediationInterscrollerAd) {
        this.zzj = mediationInterscrollerAd;
    }

    final /* synthetic */ void zzT(MediationAppOpenAd mediationAppOpenAd) {
        this.zzk = mediationAppOpenAd;
    }

    final /* synthetic */ Object zza() {
        return this.zza;
    }

    final /* synthetic */ void zzb(View view) {
        this.zze = view;
    }

    final /* synthetic */ void zzc(MediationInterstitialAd mediationInterstitialAd) {
        this.zzf = mediationInterstitialAd;
    }

    final /* synthetic */ void zzd(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zzg = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        zzj(iObjectWrapper, zzrVar, zzmVar, str, null, zzbwaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final IObjectWrapper zzf() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        zzk(iObjectWrapper, zzmVar, str, null, zzbwaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzh() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzi() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) throws RemoteException {
        String str3;
        Object obj = this.zza;
        boolean z = obj instanceof MediationBannerAdapter;
        if (!z && !(obj instanceof Adapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting banner ad from adapter.");
        AdSize zzb = zzrVar.zzn ? com.google.android.gms.ads.zzc.zzb(zzrVar.zze, zzrVar.zzb) : com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza);
        if (!z) {
            Object obj2 = this.zza;
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzU(str, zzmVar, str2), zzV(zzmVar), zzW(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzX(str, zzmVar), zzb, this.zzl), new zzbwp(this, zzbwaVar));
                    return;
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                    zzbvr.zza(iObjectWrapper, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzmVar.zzb;
            zzbwm zzbwmVar = new zzbwm(j == -1 ? null : new Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzW(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzX(str, zzmVar));
            Bundle bundle = zzmVar.zzm;
            str3 = "";
            try {
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbwx(zzbwaVar), zzU(str, zzmVar, str2), zzb, zzbwmVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
            } catch (Throwable th2) {
                th = th2;
                com.google.android.gms.ads.internal.util.client.zzo.zzg(str3, th);
                zzbvr.zza(iObjectWrapper, th, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        } catch (Throwable th3) {
            th = th3;
            str3 = "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzk(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) throws RemoteException {
        Object obj = this.zza;
        boolean z = obj instanceof MediationInterstitialAdapter;
        if (!z && !(obj instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting interstitial ad from adapter.");
        if (!z) {
            Object obj2 = this.zza;
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzU(str, zzmVar, str2), zzV(zzmVar), zzW(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzX(str, zzmVar), this.zzl), new zzbwq(this, zzbwaVar));
                    return;
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                    zzbvr.zza(iObjectWrapper, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzmVar.zzb;
            zzbwm zzbwmVar = new zzbwm(j == -1 ? null : new Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzW(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzX(str, zzmVar));
            Bundle bundle = zzmVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbwx(zzbwaVar), zzU(str, zzmVar, str2), zzbwmVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
            zzbvr.zza(iObjectWrapper, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzl() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzm() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzn(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzccs zzccsVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = iObjectWrapper;
            this.zzc = zzccsVar;
            zzccsVar.zze(ObjectWrapper.wrap(obj));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        zzv(zzmVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzp() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
            try {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
                return;
            } catch (RuntimeException e) {
                zzbvr.zza(this.zzd, e, "adapter.showVideo");
                throw e;
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final boolean zzq() throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzr(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar, zzbmk zzbmkVar, List list) throws RemoteException {
        Object obj = this.zza;
        boolean z = obj instanceof MediationNativeAdapter;
        if (!z && !(obj instanceof Adapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting native ad from adapter.");
        if (z) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list2 = zzmVar.zze;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j = zzmVar.zzb;
                zzbxa zzbxaVar = new zzbxa(j == -1 ? null : new Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzW(zzmVar), zzmVar.zzg, zzbmkVar, list, zzmVar.zzr, zzmVar.zzt, zzX(str, zzmVar));
                Bundle bundle = zzmVar.zzm;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new zzbwx(zzbwaVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzU(str, zzmVar, str2), zzbxaVar, bundle2);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                zzbvr.zza(iObjectWrapper, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.zza;
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzU(str, zzmVar, str2), zzV(zzmVar), zzW(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzX(str, zzmVar), this.zzl, zzbmkVar), new zzbws(this, zzbwaVar));
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                zzbvr.zza(iObjectWrapper, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    ((Adapter) this.zza).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzU(str, zzmVar, str2), zzV(zzmVar), zzW(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzX(str, zzmVar), this.zzl, zzbmkVar), new zzbwr(this, zzbwaVar));
                } catch (Throwable th3) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th3);
                    zzbvr.zza(iObjectWrapper, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final Bundle zzs() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final Bundle zzt() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final Bundle zzu() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzD(this.zzd, zzmVar, str, new zzbwy((Adapter) obj, this.zzc));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final boolean zzx() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzy(IObjectWrapper iObjectWrapper, zzccs zzccsVar, List list) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbnm zzz() {
        zzbwx zzbwxVar = this.zzb;
        if (zzbwxVar == null) {
            return null;
        }
        zzbnn zze = zzbwxVar.zze();
        if (zze instanceof zzbnn) {
            return zze.zza();
        }
        return null;
    }

    public zzbwv(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
