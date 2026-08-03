package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbxo extends com.google.android.gms.internal.ads.zzbxa {
    private final com.google.android.gms.ads.mediation.rtb.RtbAdapter zza;
    private com.google.android.gms.ads.mediation.MediationInterstitialAd zzb;
    private com.google.android.gms.ads.mediation.MediationRewardedAd zzc;
    private com.google.android.gms.ads.mediation.MediationAppOpenAd zzd;
    private java.lang.String zze = "";

    public zzbxo(com.google.android.gms.ads.mediation.rtb.RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final android.os.Bundle zzv(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new android.os.Bundle() : bundle;
    }

    private static final android.os.Bundle zzw(java.lang.String str) throws android.os.RemoteException {
        java.lang.String.valueOf(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Server parameters: ".concat(java.lang.String.valueOf(str)));
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            if (str == null) {
                return bundle;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            android.os.Bundle bundle2 = new android.os.Bundle();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            throw new android.os.RemoteException();
        }
    }

    private static final boolean zzx(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy();
    }

    private static final java.lang.String zzy(java.lang.String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        java.lang.String str2 = zzmVar.zzu;
        try {
            return new org.json.JSONObject(str).getString("max_ad_content_rating");
        } catch (org.json.JSONException unused) {
            return str2;
        }
    }

    final /* synthetic */ void zzc(com.google.android.gms.ads.mediation.MediationInterstitialAd mediationInterstitialAd) {
        this.zzb = mediationInterstitialAd;
    }

    final /* synthetic */ void zzd(com.google.android.gms.ads.mediation.MediationRewardedAd mediationRewardedAd) {
        this.zzc = mediationRewardedAd;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.internal.ads.zzbxe zzbxeVar) throws android.os.RemoteException {
        char c;
        com.google.android.gms.ads.AdFormat adFormat;
        try {
            com.google.android.gms.internal.ads.zzbxm zzbxmVar = new com.google.android.gms.internal.ads.zzbxm(this, zzbxeVar);
            com.google.android.gms.ads.mediation.rtb.RtbAdapter rtbAdapter = this.zza;
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
            switch (c) {
                case 0:
                    adFormat = com.google.android.gms.ads.AdFormat.BANNER;
                    com.google.android.gms.ads.mediation.MediationConfiguration mediationConfiguration = new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, bundle2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(mediationConfiguration);
                    rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), zzbxmVar);
                    return;
                case 1:
                    adFormat = com.google.android.gms.ads.AdFormat.INTERSTITIAL;
                    com.google.android.gms.ads.mediation.MediationConfiguration mediationConfiguration2 = new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, bundle2);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(mediationConfiguration2);
                    rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), arrayList2, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), zzbxmVar);
                    return;
                case 2:
                    adFormat = com.google.android.gms.ads.AdFormat.REWARDED;
                    com.google.android.gms.ads.mediation.MediationConfiguration mediationConfiguration22 = new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, bundle2);
                    java.util.ArrayList arrayList22 = new java.util.ArrayList();
                    arrayList22.add(mediationConfiguration22);
                    rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), arrayList22, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), zzbxmVar);
                    return;
                case 3:
                    adFormat = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL;
                    com.google.android.gms.ads.mediation.MediationConfiguration mediationConfiguration222 = new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, bundle2);
                    java.util.ArrayList arrayList222 = new java.util.ArrayList();
                    arrayList222.add(mediationConfiguration222);
                    rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), arrayList222, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), zzbxmVar);
                    return;
                case 4:
                    adFormat = com.google.android.gms.ads.AdFormat.NATIVE;
                    com.google.android.gms.ads.mediation.MediationConfiguration mediationConfiguration2222 = new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, bundle2);
                    java.util.ArrayList arrayList2222 = new java.util.ArrayList();
                    arrayList2222.add(mediationConfiguration2222);
                    rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), arrayList2222, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), zzbxmVar);
                    return;
                case 5:
                    adFormat = com.google.android.gms.ads.AdFormat.APP_OPEN_AD;
                    com.google.android.gms.ads.mediation.MediationConfiguration mediationConfiguration22222 = new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, bundle2);
                    java.util.ArrayList arrayList22222 = new java.util.ArrayList();
                    arrayList22222.add(mediationConfiguration22222);
                    rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), arrayList22222, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), zzbxmVar);
                    return;
                case 6:
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzno)).booleanValue()) {
                        adFormat = com.google.android.gms.ads.AdFormat.APP_OPEN_AD;
                        com.google.android.gms.ads.mediation.MediationConfiguration mediationConfiguration222222 = new com.google.android.gms.ads.mediation.MediationConfiguration(adFormat, bundle2);
                        java.util.ArrayList arrayList222222 = new java.util.ArrayList();
                        arrayList222222.add(mediationConfiguration222222);
                        rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), arrayList222222, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), zzbxmVar);
                        return;
                    }
                default:
                    throw new java.lang.IllegalArgumentException("Internal Error");
            }
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error generating signals for RTB", th);
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.collectSignals");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final com.google.android.gms.internal.ads.zzbxq zzf() throws android.os.RemoteException {
        return com.google.android.gms.internal.ads.zzbxq.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final com.google.android.gms.internal.ads.zzbxq zzg() throws android.os.RemoteException {
        return com.google.android.gms.internal.ads.zzbxq.zza(this.zza.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final com.google.android.gms.ads.internal.client.zzea zzh() {
        com.google.android.gms.ads.mediation.MediationExtrasReceiver mediationExtrasReceiver = this.zza;
        if (mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) mediationExtrasReceiver).getVideoController();
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzi(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwp zzbwpVar, com.google.android.gms.internal.ads.zzbvi zzbviVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws android.os.RemoteException {
        try {
            this.zza.loadRtbBannerAd(new com.google.android.gms.ads.mediation.MediationBannerAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza), this.zze), new com.google.android.gms.internal.ads.zzbxg(this, zzbwpVar, zzbviVar));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render banner ad.", th);
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.loadRtbBannerAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzj(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbws zzbwsVar, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        try {
            this.zza.loadRtbInterstitialAd(new com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new com.google.android.gms.internal.ads.zzbxi(this, zzbwsVar, zzbviVar));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render interstitial ad.", th);
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.loadRtbInterstitialAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final boolean zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.ads.mediation.MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.showRtbInterstitialAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzl(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwy zzbwyVar, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        try {
            this.zza.loadRtbRewardedAd(new com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new com.google.android.gms.internal.ads.zzbxn(this, zzbwyVar, zzbviVar));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render rewarded ad.", th);
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.loadRtbRewardedAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final boolean zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.ads.mediation.MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.showRtbRewardedAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzn(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwv zzbwvVar, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        zzr(str, str2, zzmVar, iObjectWrapper, zzbwvVar, zzbviVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzo(java.lang.String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzp(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwy zzbwyVar, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new com.google.android.gms.internal.ads.zzbxn(this, zzbwyVar, zzbviVar));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render rewarded interstitial ad.", th);
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzq(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwp zzbwpVar, com.google.android.gms.internal.ads.zzbvi zzbviVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws android.os.RemoteException {
        try {
            com.google.android.gms.internal.ads.zzbxh zzbxhVar = new com.google.android.gms.internal.ads.zzbxh(this, zzbwpVar, zzbviVar);
            com.google.android.gms.ads.mediation.rtb.RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(zzmVar);
            zzx(zzmVar);
            android.location.Location location = zzmVar.zzk;
            int i = zzmVar.zzg;
            int i2 = zzmVar.zzt;
            zzy(str2, zzmVar);
            com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza);
            java.lang.String simpleName = rtbAdapter.getClass().getSimpleName();
            java.lang.String.valueOf(simpleName);
            zzbxhVar.onFailure(new com.google.android.gms.ads.AdError(7, java.lang.String.valueOf(simpleName).concat(" does not support interscroller ads."), com.google.android.gms.ads.MobileAds.ERROR_DOMAIN));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render interscroller ad.", th);
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.loadRtbInterscrollerAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzr(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwv zzbwvVar, com.google.android.gms.internal.ads.zzbvi zzbviVar, com.google.android.gms.internal.ads.zzblt zzbltVar) throws android.os.RemoteException {
        try {
            this.zza.loadRtbNativeAdMapper(new com.google.android.gms.ads.mediation.MediationNativeAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze, zzbltVar), new com.google.android.gms.internal.ads.zzbxj(this, zzbwvVar, zzbviVar));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render native ad.", th);
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.loadRtbNativeAdMapper");
            java.lang.String message = th.getMessage();
            if (android.text.TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new android.os.RemoteException();
            }
            try {
                this.zza.loadRtbNativeAd(new com.google.android.gms.ads.mediation.MediationNativeAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze, zzbltVar), new com.google.android.gms.internal.ads.zzbxk(this, zzbwvVar, zzbviVar));
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render native ad.", th2);
                com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th2, "adapter.loadRtbNativeAd");
                throw new android.os.RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzs(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwm zzbwmVar, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        try {
            this.zza.loadRtbAppOpenAd(new com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new com.google.android.gms.internal.ads.zzbxl(this, zzbwmVar, zzbviVar));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render app open ad.", th);
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.loadRtbAppOpenAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final boolean zzt(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.ads.mediation.MediationAppOpenAd mediationAppOpenAd = this.zzd;
        if (mediationAppOpenAd == null) {
            return false;
        }
        try {
            mediationAppOpenAd.showAd((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", th);
            com.google.android.gms.internal.ads.zzbuz.zza(iObjectWrapper, th, "adapter.showRtbAppOpenAd");
            return true;
        }
    }

    final /* synthetic */ void zzu(com.google.android.gms.ads.mediation.MediationAppOpenAd mediationAppOpenAd) {
        this.zzd = mediationAppOpenAd;
    }
}
