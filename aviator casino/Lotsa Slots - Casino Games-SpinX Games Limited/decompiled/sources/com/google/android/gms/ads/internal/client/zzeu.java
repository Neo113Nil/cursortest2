package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzeu {
    public static final java.util.Set zza = new java.util.HashSet(java.util.Arrays.asList(com.google.android.gms.ads.AdFormat.APP_OPEN_AD, com.google.android.gms.ads.AdFormat.INTERSTITIAL, com.google.android.gms.ads.AdFormat.REWARDED));
    private static com.google.android.gms.ads.internal.client.zzeu zze;
    private com.google.android.gms.ads.internal.client.zzem zzb;
    private com.google.android.gms.ads.internal.client.zzey zzc;
    private com.google.android.gms.ads.internal.client.zzel zzd;
    private com.google.android.gms.ads.internal.client.zzcy zzl;
    private final java.lang.Object zzf = new java.lang.Object();
    private final java.lang.Object zzg = new java.lang.Object();
    private boolean zzi = false;
    private boolean zzj = false;
    private final java.lang.Object zzk = new java.lang.Object();
    private com.google.android.gms.ads.OnAdInspectorClosedListener zzm = null;
    private com.google.android.gms.ads.RequestConfiguration zzn = new com.google.android.gms.ads.RequestConfiguration.Builder().build();
    private final java.util.ArrayList zzh = new java.util.ArrayList();

    private zzeu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.ads.initialization.InitializationStatus zzB(java.util.List list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzbrp zzbrpVar = (com.google.android.gms.internal.ads.zzbrp) it.next();
            hashMap.put(zzbrpVar.zza, new com.google.android.gms.internal.ads.zzbrx(zzbrpVar.zzb ? com.google.android.gms.ads.initialization.AdapterStatus.State.READY : com.google.android.gms.ads.initialization.AdapterStatus.State.NOT_READY, zzbrpVar.zzd, zzbrpVar.zzc));
        }
        return new com.google.android.gms.internal.ads.zzbry(hashMap);
    }

    private final void zzC(com.google.android.gms.ads.RequestConfiguration requestConfiguration) {
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
        if (zzcyVar == null) {
            return;
        }
        try {
            zzcyVar.zzr(new com.google.android.gms.ads.internal.client.zzfr(requestConfiguration));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set request configuration parcel.", e);
        }
    }

    private final void zzD(android.content.Context context) {
        if (this.zzl == null) {
            this.zzl = (com.google.android.gms.ads.internal.client.zzcy) new com.google.android.gms.ads.internal.client.zzat(com.google.android.gms.ads.internal.client.zzay.zzb(), context).zzd(context, false);
        }
    }

    private final void zzE(java.lang.String str) {
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
        if (zzcyVar == null) {
            return;
        }
        try {
            zzcyVar.zze();
            this.zzl.zzj(null, com.google.android.gms.dynamic.ObjectWrapper.wrap(null));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e);
        }
    }

    public static com.google.android.gms.ads.internal.client.zzeu zzb() {
        com.google.android.gms.ads.internal.client.zzeu zzeuVar;
        synchronized (com.google.android.gms.ads.internal.client.zzeu.class) {
            if (zze == null) {
                zze = new com.google.android.gms.ads.internal.client.zzeu();
            }
            zzeuVar = zze;
        }
        return zzeuVar;
    }

    final /* synthetic */ com.google.android.gms.ads.OnAdInspectorClosedListener zzA() {
        return this.zzm;
    }

    public final com.google.android.gms.ads.preload.zzb zza(com.google.android.gms.ads.AdFormat adFormat) {
        com.google.android.gms.ads.AdFormat adFormat2 = com.google.android.gms.ads.AdFormat.BANNER;
        int ordinal = adFormat.ordinal();
        if (ordinal == 1) {
            return this.zzb;
        }
        if (ordinal == 2) {
            return this.zzc;
        }
        if (ordinal != 5) {
            return null;
        }
        return this.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(android.content.Context context, java.lang.String str, com.google.android.gms.ads.initialization.OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzf) {
            if (this.zzi) {
                if (onInitializationCompleteListener != null) {
                    this.zzh.add(onInitializationCompleteListener);
                }
                return;
            }
            if (this.zzj) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zzl());
                }
                return;
            }
            this.zzi = true;
            if (onInitializationCompleteListener != null) {
                this.zzh.add(onInitializationCompleteListener);
            }
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context cannot be null.");
            }
            synchronized (this.zzk) {
                byte[] bArr = null;
                java.lang.Object[] objArr = 0;
                java.lang.Object[] objArr2 = 0;
                try {
                    zzD(context);
                    com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
                    if (zzcyVar != null) {
                        zzcyVar.zzp(new com.google.android.gms.ads.internal.client.zzet(this, bArr));
                        this.zzl.zzo(new com.google.android.gms.internal.ads.zzbuy());
                    }
                    if (this.zzn.getTagForChildDirectedTreatment() != -1 || this.zzn.getTagForUnderAgeOfConsent() != -1) {
                        zzC(this.zzn);
                    }
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e);
                }
                com.google.android.gms.internal.ads.zzbiq.zza(context);
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zza.zze()).booleanValue()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmC)).booleanValue()) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on bg thread");
                        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = com.google.android.gms.ads.internal.util.client.zzb.zza;
                        final java.lang.Object[] objArr3 = objArr2 == true ? 1 : 0;
                        threadPoolExecutor.execute(new java.lang.Runnable(objArr3) { // from class: com.google.android.gms.ads.internal.client.zzer
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                com.google.android.gms.ads.internal.client.zzeu.this.zzt(null);
                            }
                        });
                        this.zzb = new com.google.android.gms.ads.internal.client.zzem(context);
                        this.zzc = new com.google.android.gms.ads.internal.client.zzey(context);
                        this.zzd = new com.google.android.gms.ads.internal.client.zzel(context);
                    }
                }
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzb.zze()).booleanValue()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmC)).booleanValue()) {
                        java.util.concurrent.ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                        final java.lang.Object[] objArr4 = objArr == true ? 1 : 0;
                        executorService.execute(new java.lang.Runnable(objArr4) { // from class: com.google.android.gms.ads.internal.client.zzep
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                com.google.android.gms.ads.internal.client.zzeu.this.zzu(null);
                            }
                        });
                        this.zzb = new com.google.android.gms.ads.internal.client.zzem(context);
                        this.zzc = new com.google.android.gms.ads.internal.client.zzey(context);
                        this.zzd = new com.google.android.gms.ads.internal.client.zzel(context);
                    }
                }
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                zzE(null);
                this.zzb = new com.google.android.gms.ads.internal.client.zzem(context);
                this.zzc = new com.google.android.gms.ads.internal.client.zzey(context);
                this.zzd = new com.google.android.gms.ads.internal.client.zzel(context);
            }
        }
    }

    public final void zzd() {
        synchronized (this.zzf) {
            this.zzj = false;
            this.zzi = false;
            this.zzh.clear();
        }
        synchronized (this.zzk) {
            try {
                com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
                if (zzcyVar != null) {
                    zzcyVar.zzw();
                }
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to stop the SDK.", e);
            }
            this.zzl = null;
            com.google.android.gms.ads.internal.client.zzem zzemVar = this.zzb;
            if (zzemVar != null) {
                zzemVar.zzg();
                this.zzb = null;
            }
            com.google.android.gms.ads.internal.client.zzey zzeyVar = this.zzc;
            if (zzeyVar != null) {
                zzeyVar.zzg();
                this.zzc = null;
            }
            com.google.android.gms.ads.internal.client.zzel zzelVar = this.zzd;
            if (zzelVar != null) {
                zzelVar.zzg();
                this.zzd = null;
            }
        }
    }

    public final com.google.android.gms.common.api.Status zze(android.content.Context context, java.util.List list, com.google.android.gms.ads.preload.PreloadCallback preloadCallback) {
        boolean z;
        com.google.android.gms.common.api.Status status;
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.preload.PreloadConfiguration preloadConfiguration = (com.google.android.gms.ads.preload.PreloadConfiguration) it.next();
            java.lang.String valueOf = java.lang.String.valueOf(preloadConfiguration.getAdFormat());
            java.lang.String adUnitId = preloadConfiguration.getAdUnitId();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 1 + java.lang.String.valueOf(adUnitId).length());
            sb.append(valueOf);
            sb.append("#");
            sb.append(adUnitId);
            java.lang.String sb2 = sb.toString();
            hashMap.put(sb2, java.lang.Integer.valueOf(((java.lang.Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(hashMap, sb2, 0)).intValue() + 1));
        }
        java.util.Iterator it2 = hashMap.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            if (((java.lang.Integer) ((java.util.Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z = true;
                break;
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            com.google.android.gms.ads.preload.PreloadConfiguration preloadConfiguration2 = (com.google.android.gms.ads.preload.PreloadConfiguration) it3.next();
            com.google.android.gms.ads.AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (zza.contains(preloadConfiguration2.getAdFormat())) {
                hashMap2.put(adFormat, java.lang.Integer.valueOf(((java.lang.Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(hashMap2, adFormat, 0)).intValue() + 1));
                if (preloadConfiguration2.getBufferSize() > 15) {
                    hashSet.add(java.lang.String.format(java.util.Locale.US, "Preload configurations' buffer size exceeds the maximum limit %d for %s", 15, adFormat.name()));
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    hashSet.add(java.lang.String.format(java.util.Locale.US, "Preload configurations' buffer size less than 0 for %s", adFormat.name()));
                }
            } else {
                java.lang.String valueOf2 = java.lang.String.valueOf(preloadConfiguration2.getAdFormat());
                java.lang.String.valueOf(valueOf2);
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(java.lang.String.valueOf(valueOf2)));
            }
            z = true;
        }
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.ads.AdFormat.class);
        enumMap.put((java.util.EnumMap) com.google.android.gms.ads.AdFormat.APP_OPEN_AD, (com.google.android.gms.ads.AdFormat) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfv));
        enumMap.put((java.util.EnumMap) com.google.android.gms.ads.AdFormat.INTERSTITIAL, (com.google.android.gms.ads.AdFormat) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzft));
        enumMap.put((java.util.EnumMap) com.google.android.gms.ads.AdFormat.REWARDED, (com.google.android.gms.ads.AdFormat) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfu));
        for (java.util.Map.Entry entry : hashMap2.entrySet()) {
            com.google.android.gms.ads.AdFormat adFormat2 = (com.google.android.gms.ads.AdFormat) entry.getKey();
            int intValue = ((java.lang.Integer) entry.getValue()).intValue();
            java.lang.Integer num = (java.lang.Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat2, 0);
            if (intValue > num.intValue()) {
                hashSet.add(java.lang.String.format(java.util.Locale.US, "Preload configurations' size exceeds the maximum limit %d for %s", num, adFormat2.name()));
                z = true;
            }
        }
        if (z) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            java.util.Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb3.append((java.lang.String) it4.next());
                if (it4.hasNext()) {
                    sb3.append(", ");
                }
            }
            java.lang.String sb4 = sb3.toString();
            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb4);
            status = new com.google.android.gms.common.api.Status(13, sb4);
        } else {
            status = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
        java.lang.String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(status.isSuccess(), statusMessage);
        synchronized (this.zzg) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(com.google.android.gms.ads.internal.util.client.zzf.zzv(context, (com.google.android.gms.ads.preload.PreloadConfiguration) it5.next(), 1));
            }
            try {
                com.google.android.gms.ads.zzb.zza(context).zze(arrayList, new com.google.android.gms.ads.internal.client.zzen(this, preloadCallback));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to start preload.", e);
                return com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR;
            }
        }
        return com.google.android.gms.common.api.Status.RESULT_SUCCESS;
    }

    public final void zzf(float f) {
        boolean z = true;
        com.google.android.gms.common.internal.Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzk) {
            if (this.zzl == null) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzf(f);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app volume.", e);
            }
        }
    }

    public final void zzh(boolean z) {
        synchronized (this.zzk) {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzh(z);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzj(android.content.Context context, java.lang.String str) {
        synchronized (this.zzk) {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzi(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to open debug menu.", e);
            }
        }
    }

    public final com.google.android.gms.ads.initialization.InitializationStatus zzl() {
        synchronized (this.zzk) {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return new com.google.android.gms.ads.initialization.InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeq
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final /* synthetic */ java.util.Map getAdapterStatusMap() {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new com.google.android.gms.ads.internal.client.zzeo(com.google.android.gms.ads.internal.client.zzeu.this));
                        return hashMap;
                    }
                };
            }
            try {
                return zzB(zzcyVar.zzq());
            } catch (android.os.RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to get Initialization status.");
                return new com.google.android.gms.ads.initialization.InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeq
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final /* synthetic */ java.util.Map getAdapterStatusMap() {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new com.google.android.gms.ads.internal.client.zzeo(com.google.android.gms.ads.internal.client.zzeu.this));
                        return hashMap;
                    }
                };
            }
        }
    }

    public final void zzm(android.content.Context context) {
        synchronized (this.zzk) {
            zzD(context);
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzs();
            } catch (android.os.RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzn(android.content.Context context, com.google.android.gms.ads.OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzk) {
            zzD(context);
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            this.zzm = onAdInspectorClosedListener;
            try {
                zzcyVar.zzt(new com.google.android.gms.ads.internal.client.zzes(null));
            } catch (android.os.RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new com.google.android.gms.ads.AdInspectorError(0, "Ad inspector had an internal error.", com.google.android.gms.ads.MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final java.lang.String zzo() {
        synchronized (this.zzk) {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting version string.");
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return "";
            }
            try {
                return com.google.android.gms.internal.ads.zzgua.zza(zzcyVar.zzm());
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get internal version.", e);
                return "";
            }
        }
    }

    public final com.google.android.gms.ads.RequestConfiguration zzp() {
        return this.zzn;
    }

    public final void zzq(com.google.android.gms.ads.RequestConfiguration requestConfiguration) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzk) {
            com.google.android.gms.ads.RequestConfiguration requestConfiguration2 = this.zzn;
            this.zzn = requestConfiguration;
            if (this.zzl == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzC(requestConfiguration);
            }
        }
    }

    public final boolean zzr(boolean z) {
        synchronized (this.zzk) {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return false;
            }
            try {
                zzcyVar.zzu(z);
                return true;
            } catch (android.os.RemoteException e) {
                java.lang.String str = z ? com.ironsource.mediationsdk.metadata.a.j : "disable";
                java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 40);
                sb.append("Unable to ");
                sb.append(str);
                sb.append(" the publisher first-party ID.");
                com.google.android.gms.ads.internal.util.client.zzo.zzg(sb.toString(), e);
                return false;
            }
        }
    }

    public final void zzs(java.lang.String str) {
        synchronized (this.zzk) {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzv(str);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set plugin.", e);
            }
        }
    }

    final /* synthetic */ void zzt(java.lang.String str) {
        synchronized (this.zzk) {
            zzE(null);
        }
    }

    final /* synthetic */ void zzu(java.lang.String str) {
        synchronized (this.zzk) {
            zzE(null);
        }
    }

    final /* synthetic */ java.lang.Object zzw() {
        return this.zzf;
    }

    final /* synthetic */ java.util.ArrayList zzx() {
        return this.zzh;
    }

    final /* synthetic */ void zzy(boolean z) {
        this.zzi = false;
    }

    final /* synthetic */ void zzz(boolean z) {
        this.zzj = true;
    }

    public final float zzg() {
        synchronized (this.zzk) {
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
            float f = 1.0f;
            if (zzcyVar == null) {
                return 1.0f;
            }
            try {
                f = zzcyVar.zzk();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app volume.", e);
            }
            return f;
        }
    }

    public final boolean zzi() {
        synchronized (this.zzk) {
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
            boolean z = false;
            if (zzcyVar == null) {
                return false;
            }
            try {
                z = zzcyVar.zzl();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app mute state.", e);
            }
            return z;
        }
    }

    public final void zzk(java.lang.Class cls) {
        synchronized (this.zzk) {
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzn(cls.getCanonicalName());
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to register RtbAdapter", e);
            }
        }
    }
}
