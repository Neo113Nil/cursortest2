package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbwd extends com.google.android.gms.internal.ads.zzbve {
    private final java.lang.Object zza;
    private com.google.android.gms.internal.ads.zzbwf zzb;
    private com.google.android.gms.internal.ads.zzcca zzc;
    private com.google.android.gms.dynamic.IObjectWrapper zzd;
    private android.view.View zze;
    private com.google.android.gms.ads.mediation.MediationInterstitialAd zzf;
    private com.google.android.gms.ads.mediation.UnifiedNativeAdMapper zzg;
    private com.google.android.gms.ads.mediation.NativeAdMapper zzh;
    private com.google.android.gms.ads.mediation.MediationRewardedAd zzi;
    private com.google.android.gms.ads.mediation.MediationInterscrollerAd zzj;
    private com.google.android.gms.ads.mediation.MediationAppOpenAd zzk;
    private final java.lang.String zzl = "";

    public zzbwd(com.google.android.gms.ads.mediation.Adapter adapter) {
        this.zza = adapter;
    }

    private final android.os.Bundle zzV(java.lang.String str, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str2) throws android.os.RemoteException {
        java.lang.String.valueOf(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Server parameters: ".concat(java.lang.String.valueOf(str)));
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            if (str != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                android.os.Bundle bundle2 = new android.os.Bundle();
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof com.google.ads.mediation.admob.AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
            throw new android.os.RemoteException();
        }
    }

    private final android.os.Bundle zzW(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new android.os.Bundle() : bundle;
    }

    private static final boolean zzX(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy();
    }

    private static final java.lang.String zzY(java.lang.String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        java.lang.String str2 = zzmVar.zzu;
        try {
            return new org.json.JSONObject(str).getString("max_ad_content_rating");
        } catch (org.json.JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzA(boolean z) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener) {
            try {
                ((com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                return;
            }
        }
        java.lang.String canonicalName = com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener.class.getCanonicalName();
        java.lang.String canonicalName2 = obj.getClass().getCanonicalName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 22 + java.lang.String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.ads.internal.client.zzea zzB() {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.internal.ads.zzbvr zzC() {
        com.google.android.gms.ads.mediation.UnifiedNativeAdMapper zzb;
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.MediationNativeAdapter) {
            com.google.android.gms.internal.ads.zzbwf zzbwfVar = this.zzb;
            if (zzbwfVar == null || (zzb = zzbwfVar.zzb()) == null) {
                return null;
            }
            return new com.google.android.gms.internal.ads.zzbwj(zzb);
        }
        if (!(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            return null;
        }
        com.google.android.gms.ads.mediation.NativeAdMapper nativeAdMapper = this.zzh;
        if (nativeAdMapper != null) {
            return new com.google.android.gms.internal.ads.zzbwh(nativeAdMapper);
        }
        com.google.android.gms.ads.mediation.UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzg;
        if (unifiedNativeAdMapper != null) {
            return new com.google.android.gms.internal.ads.zzbwj(unifiedNativeAdMapper);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzD(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting rewarded ad from adapter.");
            try {
                ((com.google.android.gms.ads.mediation.Adapter) obj).loadRewardedAd(new com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new com.google.android.gms.internal.ads.zzbwb(this, zzbviVar));
                return;
            } catch (java.lang.Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, e, "adapter.loadRewardedAd");
                throw new android.os.RemoteException();
            }
        }
        java.lang.String canonicalName = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
        java.lang.String canonicalName2 = obj.getClass().getCanonicalName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 22 + java.lang.String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzE(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (!(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            java.lang.String canonicalName = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
            java.lang.String canonicalName2 = obj.getClass().getCanonicalName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 22 + java.lang.String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show rewarded ad from adapter.");
        com.google.android.gms.ads.mediation.MediationRewardedAd mediationRewardedAd = this.zzi;
        if (mediationRewardedAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation rewarded ad.");
            throw new android.os.RemoteException();
        }
        try {
            mediationRewardedAd.showAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, e, "adapter.rewarded.showAd");
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzF(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbrt zzbrtVar, java.util.List list) throws android.os.RemoteException {
        char c;
        java.lang.Object obj = this.zza;
        if (!(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            throw new android.os.RemoteException();
        }
        try {
            com.google.android.gms.internal.ads.zzbvw zzbvwVar = new com.google.android.gms.internal.ads.zzbvw(this, zzbrtVar);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.ads.zzbrz zzbrzVar = (com.google.android.gms.internal.ads.zzbrz) it.next();
                java.lang.String str = zzbrzVar.zza;
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
                        if (str.equals(com.google.firebase.analytics.FirebaseAnalytics.Event.APP_OPEN)) {
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
                com.google.android.gms.ads.AdFormat adFormat = null;
                switch (c) {
                    case 0:
                        adFormat = com.google.android.gms.ads.AdFormat.BANNER;
                        break;
                    case 1:
                        adFormat = com.google.android.gms.ads.AdFormat.INTERSTITIAL;
                        break;
                    case 2:
                        adFormat = com.google.android.gms.ads.AdFormat.REWARDED;
                        break;
                    case 3:
                        adFormat = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL;
                        break;
                    case 4:
                        adFormat = com.google.android.gms.ads.AdFormat.NATIVE;
                        break;
                    case 5:
                        adFormat = com.google.android.gms.ads.AdFormat.APP_OPEN_AD;
                        break;
                    case 6:
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzno)).booleanValue()) {
                            adFormat = com.google.android.gms.ads.AdFormat.APP_OPEN_AD;
                            break;
                        }
                        break;
                }
                if (adFormat != null) {
                    arrayList.add(new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, zzbrzVar.zzb));
                }
            }
            ((com.google.android.gms.ads.mediation.Adapter) obj).initialize((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), zzbvwVar, arrayList);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.initialize");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzG(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting rewarded interstitial ad from adapter.");
            try {
                ((com.google.android.gms.ads.mediation.Adapter) obj).loadRewardedInterstitialAd(new com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new com.google.android.gms.internal.ads.zzbwb(this, zzbviVar));
                return;
            } catch (java.lang.Exception e) {
                com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, e, "adapter.loadRewardedInterstitialAd");
                throw new android.os.RemoteException();
            }
        }
        java.lang.String canonicalName = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
        java.lang.String canonicalName2 = obj.getClass().getCanonicalName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 22 + java.lang.String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.internal.ads.zzbxq zzH() {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.Adapter) {
            return com.google.android.gms.internal.ads.zzbxq.zza(((com.google.android.gms.ads.mediation.Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.internal.ads.zzbxq zzI() {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.Adapter) {
            return com.google.android.gms.internal.ads.zzbxq.zza(((com.google.android.gms.ads.mediation.Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzJ(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (!(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            java.lang.String canonicalName = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
            java.lang.String canonicalName2 = obj.getClass().getCanonicalName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 22 + java.lang.String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting interscroller ad from adapter.");
        try {
            com.google.android.gms.ads.mediation.Adapter adapter = (com.google.android.gms.ads.mediation.Adapter) obj;
            com.google.android.gms.internal.ads.zzbvv zzbvvVar = new com.google.android.gms.internal.ads.zzbvv(this, zzbviVar, adapter);
            zzV(str, zzmVar, str2);
            zzW(zzmVar);
            zzX(zzmVar);
            android.location.Location location = zzmVar.zzk;
            int i = zzmVar.zzg;
            int i2 = zzmVar.zzt;
            zzY(str, zzmVar);
            com.google.android.gms.ads.zzc.zzc(zzrVar.zze, zzrVar.zzb);
            java.lang.String simpleName = adapter.getClass().getSimpleName();
            java.lang.String.valueOf(simpleName);
            zzbvvVar.onFailure(new com.google.android.gms.ads.AdError(7, java.lang.String.valueOf(simpleName).concat(" does not support interscroller ads."), com.google.android.gms.ads.MobileAds.ERROR_DOMAIN));
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, e, "adapter.loadInterscrollerAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.internal.ads.zzbvl zzK() {
        com.google.android.gms.ads.mediation.MediationInterscrollerAd mediationInterscrollerAd = this.zzj;
        if (mediationInterscrollerAd != null) {
            return new com.google.android.gms.internal.ads.zzbwe(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzL(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if ((obj instanceof com.google.android.gms.ads.mediation.Adapter) || (obj instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter)) {
            if (obj instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter) {
                zzh();
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Show interstitial ad from adapter.");
            com.google.android.gms.ads.mediation.MediationInterstitialAd mediationInterstitialAd = this.zzf;
            if (mediationInterstitialAd == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation interstitial ad.");
                throw new android.os.RemoteException();
            }
            try {
                mediationInterstitialAd.showAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, e, "adapter.interstitial.showAd");
                throw e;
            }
        }
        java.lang.String canonicalName = com.google.android.gms.ads.mediation.MediationInterstitialAdapter.class.getCanonicalName();
        java.lang.String canonicalName2 = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
        java.lang.String canonicalName3 = obj.getClass().getCanonicalName();
        int length = java.lang.String.valueOf(canonicalName).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 4 + java.lang.String.valueOf(canonicalName2).length() + 22 + java.lang.String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzM(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting app open ad from adapter.");
            try {
                ((com.google.android.gms.ads.mediation.Adapter) obj).loadAppOpenAd(new com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new com.google.android.gms.internal.ads.zzbwc(this, zzbviVar));
                return;
            } catch (java.lang.Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, e, "adapter.loadAppOpenAd");
                throw new android.os.RemoteException();
            }
        }
        java.lang.String canonicalName = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
        java.lang.String canonicalName2 = obj.getClass().getCanonicalName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 22 + java.lang.String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzN(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (!(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            java.lang.String canonicalName = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
            java.lang.String canonicalName2 = obj.getClass().getCanonicalName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 22 + java.lang.String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show app open ad from adapter.");
        com.google.android.gms.ads.mediation.MediationAppOpenAd mediationAppOpenAd = this.zzk;
        if (mediationAppOpenAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation app open ad.");
            throw new android.os.RemoteException();
        }
        try {
            mediationAppOpenAd.showAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, e, "adapter.appOpen.showAd");
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.internal.ads.zzbvn zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.internal.ads.zzbvo zzP() {
        return null;
    }

    final /* synthetic */ void zzQ(com.google.android.gms.ads.mediation.UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zzg = unifiedNativeAdMapper;
    }

    final /* synthetic */ void zzR(com.google.android.gms.ads.mediation.NativeAdMapper nativeAdMapper) {
        this.zzh = nativeAdMapper;
    }

    final /* synthetic */ void zzS(com.google.android.gms.ads.mediation.MediationRewardedAd mediationRewardedAd) {
        this.zzi = mediationRewardedAd;
    }

    final /* synthetic */ void zzT(com.google.android.gms.ads.mediation.MediationInterscrollerAd mediationInterscrollerAd) {
        this.zzj = mediationInterscrollerAd;
    }

    final /* synthetic */ void zzU(com.google.android.gms.ads.mediation.MediationAppOpenAd mediationAppOpenAd) {
        this.zzk = mediationAppOpenAd;
    }

    final /* synthetic */ java.lang.Object zzb() {
        return this.zza;
    }

    final /* synthetic */ void zzc(android.view.View view) {
        this.zze = view;
    }

    final /* synthetic */ void zzd(com.google.android.gms.ads.mediation.MediationInterstitialAd mediationInterstitialAd) {
        this.zzf = mediationInterstitialAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        zzj(iObjectWrapper, zzrVar, zzmVar, str, null, zzbviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.dynamic.IObjectWrapper zzf() throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.MediationBannerAdapter) {
            try {
                return com.google.android.gms.dynamic.ObjectWrapper.wrap(((com.google.android.gms.ads.mediation.MediationBannerAdapter) obj).getBannerView());
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new android.os.RemoteException();
            }
        }
        if (obj instanceof com.google.android.gms.ads.mediation.Adapter) {
            return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zze);
        }
        java.lang.String canonicalName = com.google.android.gms.ads.mediation.MediationBannerAdapter.class.getCanonicalName();
        java.lang.String canonicalName2 = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
        java.lang.String canonicalName3 = obj.getClass().getCanonicalName();
        int length = java.lang.String.valueOf(canonicalName).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 4 + java.lang.String.valueOf(canonicalName2).length() + 22 + java.lang.String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        zzk(iObjectWrapper, zzmVar, str, null, zzbviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzh() throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Showing interstitial from adapter.");
            try {
                ((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new android.os.RemoteException();
            }
        }
        java.lang.String canonicalName = com.google.android.gms.ads.mediation.MediationInterstitialAdapter.class.getCanonicalName();
        java.lang.String canonicalName2 = obj.getClass().getCanonicalName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 22 + java.lang.String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzi() throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.MediationAdapter) {
            try {
                ((com.google.android.gms.ads.mediation.MediationAdapter) obj).onDestroy();
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new android.os.RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        java.lang.String str3;
        java.lang.Object obj = this.zza;
        boolean z = obj instanceof com.google.android.gms.ads.mediation.MediationBannerAdapter;
        if (!z && !(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            java.lang.String canonicalName = com.google.android.gms.ads.mediation.MediationBannerAdapter.class.getCanonicalName();
            java.lang.String canonicalName2 = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
            java.lang.String canonicalName3 = obj.getClass().getCanonicalName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 4 + java.lang.String.valueOf(canonicalName2).length() + 22 + java.lang.String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting banner ad from adapter.");
        com.google.android.gms.ads.AdSize zzb = zzrVar.zzn ? com.google.android.gms.ads.zzc.zzb(zzrVar.zze, zzrVar.zzb) : com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza);
        if (!z) {
            java.lang.Object obj2 = this.zza;
            if (obj2 instanceof com.google.android.gms.ads.mediation.Adapter) {
                try {
                    ((com.google.android.gms.ads.mediation.Adapter) obj2).loadBannerAd(new com.google.android.gms.ads.mediation.MediationBannerAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), zzb, this.zzl), new com.google.android.gms.internal.ads.zzbvx(this, zzbviVar));
                    return;
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                    com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.loadBannerAd");
                    throw new android.os.RemoteException();
                }
            }
            return;
        }
        try {
            com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter = (com.google.android.gms.ads.mediation.MediationBannerAdapter) obj;
            java.util.List list = zzmVar.zze;
            java.util.HashSet hashSet = list != null ? new java.util.HashSet(list) : null;
            long j = zzmVar.zzb;
            com.google.android.gms.internal.ads.zzbvu zzbvuVar = new com.google.android.gms.internal.ads.zzbvu(j == -1 ? null : new java.util.Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
            android.os.Bundle bundle = zzmVar.zzm;
            str3 = "";
            try {
                mediationBannerAdapter.requestBannerAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), new com.google.android.gms.internal.ads.zzbwf(zzbviVar), zzV(str, zzmVar, str2), zzb, zzbvuVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
            } catch (java.lang.Throwable th2) {
                th = th2;
                com.google.android.gms.ads.internal.util.client.zzo.zzg(str3, th);
                com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.requestBannerAd");
                throw new android.os.RemoteException();
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            str3 = "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        boolean z = obj instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
        if (!z && !(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            java.lang.String canonicalName = com.google.android.gms.ads.mediation.MediationInterstitialAdapter.class.getCanonicalName();
            java.lang.String canonicalName2 = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
            java.lang.String canonicalName3 = obj.getClass().getCanonicalName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 4 + java.lang.String.valueOf(canonicalName2).length() + 22 + java.lang.String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting interstitial ad from adapter.");
        if (!z) {
            java.lang.Object obj2 = this.zza;
            if (obj2 instanceof com.google.android.gms.ads.mediation.Adapter) {
                try {
                    ((com.google.android.gms.ads.mediation.Adapter) obj2).loadInterstitialAd(new com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl), new com.google.android.gms.internal.ads.zzbvy(this, zzbviVar));
                    return;
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                    com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.loadInterstitialAd");
                    throw new android.os.RemoteException();
                }
            }
            return;
        }
        try {
            com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter = (com.google.android.gms.ads.mediation.MediationInterstitialAdapter) obj;
            java.util.List list = zzmVar.zze;
            java.util.HashSet hashSet = list != null ? new java.util.HashSet(list) : null;
            long j = zzmVar.zzb;
            com.google.android.gms.internal.ads.zzbvu zzbvuVar = new com.google.android.gms.internal.ads.zzbvu(j == -1 ? null : new java.util.Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
            android.os.Bundle bundle = zzmVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), new com.google.android.gms.internal.ads.zzbwf(zzbviVar), zzV(str, zzmVar, str2), zzbvuVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (java.lang.Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th2, "adapter.requestInterstitialAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzl() throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.MediationAdapter) {
            try {
                ((com.google.android.gms.ads.mediation.MediationAdapter) obj).onPause();
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new android.os.RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzm() throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.MediationAdapter) {
            try {
                ((com.google.android.gms.ads.mediation.MediationAdapter) obj).onResume();
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                throw new android.os.RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzcca zzccaVar, java.lang.String str2) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if ((obj instanceof com.google.android.gms.ads.mediation.Adapter) || java.util.Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = iObjectWrapper;
            this.zzc = zzccaVar;
            zzccaVar.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(obj));
            return;
        }
        java.lang.String canonicalName = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
        java.lang.String canonicalName2 = obj.getClass().getCanonicalName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 22 + java.lang.String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str) throws android.os.RemoteException {
        zzv(zzmVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzp() throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.Adapter) {
            com.google.android.gms.ads.mediation.MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediated rewarded ad.");
                throw new android.os.RemoteException();
            }
            try {
                mediationRewardedAd.showAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(this.zzd));
                return;
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.internal.ads.zzbuz.zza(this.zzd, e, "adapter.showVideo");
                throw e;
            }
        }
        java.lang.String canonicalName = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
        java.lang.String canonicalName2 = obj.getClass().getCanonicalName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 22 + java.lang.String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final boolean zzq() throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if ((obj instanceof com.google.android.gms.ads.mediation.Adapter) || java.util.Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        java.lang.String canonicalName = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
        java.lang.String canonicalName2 = obj.getClass().getCanonicalName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 22 + java.lang.String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzr(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbvi zzbviVar, com.google.android.gms.internal.ads.zzblt zzbltVar, java.util.List list) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        boolean z = obj instanceof com.google.android.gms.ads.mediation.MediationNativeAdapter;
        if (!z && !(obj instanceof com.google.android.gms.ads.mediation.Adapter)) {
            java.lang.String canonicalName = com.google.android.gms.ads.mediation.MediationNativeAdapter.class.getCanonicalName();
            java.lang.String canonicalName2 = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
            java.lang.String canonicalName3 = obj.getClass().getCanonicalName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 4 + java.lang.String.valueOf(canonicalName2).length() + 22 + java.lang.String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new android.os.RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting native ad from adapter.");
        if (z) {
            try {
                com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter = (com.google.android.gms.ads.mediation.MediationNativeAdapter) obj;
                java.util.List list2 = zzmVar.zze;
                java.util.HashSet hashSet = list2 != null ? new java.util.HashSet(list2) : null;
                long j = zzmVar.zzb;
                com.google.android.gms.internal.ads.zzbwi zzbwiVar = new com.google.android.gms.internal.ads.zzbwi(j == -1 ? null : new java.util.Date(j), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzbltVar, list, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
                android.os.Bundle bundle = zzmVar.zzm;
                android.os.Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new com.google.android.gms.internal.ads.zzbwf(zzbviVar);
                mediationNativeAdapter.requestNativeAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzV(str, zzmVar, str2), zzbwiVar, bundle2);
                return;
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
                com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.requestNativeAd");
                throw new android.os.RemoteException();
            }
        }
        java.lang.Object obj2 = this.zza;
        if (obj2 instanceof com.google.android.gms.ads.mediation.Adapter) {
            try {
                ((com.google.android.gms.ads.mediation.Adapter) obj2).loadNativeAdMapper(new com.google.android.gms.ads.mediation.MediationNativeAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbltVar), new com.google.android.gms.internal.ads.zzbwa(this, zzbviVar));
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th2);
                com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th2, "adapter.loadNativeAdMapper");
                java.lang.String message = th2.getMessage();
                if (android.text.TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new android.os.RemoteException();
                }
                try {
                    ((com.google.android.gms.ads.mediation.Adapter) this.zza).loadNativeAd(new com.google.android.gms.ads.mediation.MediationNativeAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbltVar), new com.google.android.gms.internal.ads.zzbvz(this, zzbviVar));
                } catch (java.lang.Throwable th3) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", th3);
                    com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th3, "adapter.loadNativeAd");
                    throw new android.os.RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final android.os.Bundle zzs() {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final android.os.Bundle zzt() {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final android.os.Bundle zzu() {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.Adapter) {
            zzD(this.zzd, zzmVar, str, new com.google.android.gms.internal.ads.zzbwg((com.google.android.gms.ads.mediation.Adapter) obj, this.zzc));
            return;
        }
        java.lang.String canonicalName = com.google.android.gms.ads.mediation.Adapter.class.getCanonicalName();
        java.lang.String canonicalName2 = obj.getClass().getCanonicalName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 22 + java.lang.String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzw(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        java.lang.Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.OnContextChangedListener) {
            ((com.google.android.gms.ads.mediation.OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final boolean zzx() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzy(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzcca zzccaVar, java.util.List list) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not initialize rewarded video adapter.");
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.internal.ads.zzbmv zzz() {
        com.google.android.gms.internal.ads.zzbwf zzbwfVar = this.zzb;
        if (zzbwfVar == null) {
            return null;
        }
        com.google.android.gms.internal.ads.zzbmw zze = zzbwfVar.zze();
        if (zze instanceof com.google.android.gms.internal.ads.zzbmw) {
            return zze.zza();
        }
        return null;
    }

    public zzbwd(com.google.android.gms.ads.mediation.MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
