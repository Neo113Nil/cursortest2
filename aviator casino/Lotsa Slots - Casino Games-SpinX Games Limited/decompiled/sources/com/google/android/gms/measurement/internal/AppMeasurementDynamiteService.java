package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.5.0 */
/* loaded from: classes4.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcq {
    com.google.android.gms.measurement.internal.zzib zza = null;
    private final java.util.Map zzb = new androidx.collection.ArrayMap();

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"scion"})
    private final void zzb() {
        if (this.zza == null) {
            throw new java.lang.IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(com.google.android.gms.internal.measurement.zzcu zzcuVar, java.lang.String str) {
        zzb();
        this.zza.zzk().zzal(zzcuVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void beginAdUnitExposure(java.lang.String str, long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzw().zza(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        zzb();
        this.zza.zzj().zzab(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void clearMeasurementEnabled(long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzj().zzn(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void endAdUnitExposure(java.lang.String str, long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzw().zzb(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void generateEventId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        zzb();
        long zzd = this.zza.zzk().zzd();
        zzb();
        this.zza.zzk().zzam(zzcuVar, zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        zzb();
        this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zzi(this, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        zzb();
        zzc(zzcuVar, this.zza.zzj().zzQ());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getConditionalUserProperties(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        zzb();
        this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zzm(this, zzcuVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        zzb();
        zzc(zzcuVar, this.zza.zzj().zzae());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        zzb();
        zzc(zzcuVar, this.zza.zzj().zzad());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        java.lang.String str;
        zzb();
        com.google.android.gms.measurement.internal.zzli zzj = this.zza.zzj();
        try {
            str = com.google.android.gms.measurement.internal.zzls.zza(zzj.zzu.zzaY(), "google_app_id", zzj.zzu.zzq());
        } catch (java.lang.IllegalStateException e) {
            zzj.zzu.zzaV().zzb().zzb("getGoogleAppId failed with exception", e);
            str = null;
        }
        zzc(zzcuVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getMaxUserProperties(java.lang.String str, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        zzb();
        this.zza.zzj().zzY(str);
        zzb();
        this.zza.zzk().zzan(zzcuVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getSessionId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzli zzj = this.zza.zzj();
        zzj.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkl(zzj, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcu zzcuVar, int i) throws android.os.RemoteException {
        zzb();
        if (i == 0) {
            this.zza.zzk().zzal(zzcuVar, this.zza.zzj().zzj());
            return;
        }
        if (i == 1) {
            this.zza.zzk().zzam(zzcuVar, this.zza.zzj().zzk().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.zza.zzk().zzan(zzcuVar, this.zza.zzj().zzl().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.zza.zzk().zzap(zzcuVar, this.zza.zzj().zzi().booleanValue());
                return;
            }
        }
        com.google.android.gms.measurement.internal.zzpo zzk = this.zza.zzk();
        double doubleValue = this.zza.zzj().zzm().doubleValue();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putDouble(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, doubleValue);
        try {
            zzcuVar.zzb(bundle);
        } catch (android.os.RemoteException e) {
            zzk.zzu.zzaV().zze().zzb("Error returning double value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getUserProperties(java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        zzb();
        this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zzk(this, zzcuVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void initForTests(java.util.Map map) throws android.os.RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void initialize(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdd zzddVar, long j) throws android.os.RemoteException {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zza;
        if (zzibVar == null) {
            this.zza = com.google.android.gms.measurement.internal.zzib.zzy((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper)), zzddVar, java.lang.Long.valueOf(j));
        } else {
            zzibVar.zzaV().zze().zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        zzb();
        this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zzn(this, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2, long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzj().zzC(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logEventAndBundle(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        (bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle()).putString("_o", "app");
        this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zzj(this, zzcuVar, new com.google.android.gms.measurement.internal.zzbg(str2, new com.google.android.gms.measurement.internal.zzbe(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logHealthData(int i, java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        zzb();
        this.zza.zzaV().zzm(i, true, false, str, iObjectWrapper == null ? null : com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityCreated(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, android.os.Bundle bundle, long j) throws android.os.RemoteException {
        zzb();
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, android.os.Bundle bundle, long j) {
        zzb();
        com.google.android.gms.measurement.internal.zzkx zzkxVar = this.zza.zzj().zza;
        if (zzkxVar != null) {
            this.zza.zzj().zzh();
            zzkxVar.zza(zzdfVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityDestroyed(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zzb();
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzkx zzkxVar = this.zza.zzj().zza;
        if (zzkxVar != null) {
            this.zza.zzj().zzh();
            zzkxVar.zzb(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityPaused(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zzb();
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzkx zzkxVar = this.zza.zzj().zza;
        if (zzkxVar != null) {
            this.zza.zzj().zzh();
            zzkxVar.zzc(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityResumed(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zzb();
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzkx zzkxVar = this.zza.zzj().zza;
        if (zzkxVar != null) {
            this.zza.zzj().zzh();
            zzkxVar.zzd(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws android.os.RemoteException {
        zzb();
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), zzcuVar, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzkx zzkxVar = this.zza.zzj().zza;
        android.os.Bundle bundle = new android.os.Bundle();
        if (zzkxVar != null) {
            this.zza.zzj().zzh();
            zzkxVar.zze(zzdfVar, bundle);
        }
        try {
            zzcuVar.zzb(bundle);
        } catch (android.os.RemoteException e) {
            this.zza.zzaV().zze().zzb("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStarted(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zzb();
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException {
        zzb();
        if (this.zza.zzj().zza != null) {
            this.zza.zzj().zzh();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStopped(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zzb();
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException {
        zzb();
        if (this.zza.zzj().zza != null) {
            this.zza.zzj().zzh();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void performAction(android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws android.os.RemoteException {
        zzb();
        zzcuVar.zzb(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda zzdaVar) throws android.os.RemoteException {
        com.google.android.gms.measurement.internal.zzjp zzjpVar;
        zzb();
        java.util.Map map = this.zzb;
        synchronized (map) {
            zzjpVar = (com.google.android.gms.measurement.internal.zzjp) map.get(java.lang.Integer.valueOf(zzdaVar.zzf()));
            if (zzjpVar == null) {
                zzjpVar = new com.google.android.gms.measurement.internal.zzq(this, zzdaVar);
                map.put(java.lang.Integer.valueOf(zzdaVar.zzf()), zzjpVar);
            }
        }
        this.zza.zzj().zzW(zzjpVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void resetAnalyticsData(long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzj().zzT(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.zzcx zzcxVar) {
        zzb();
        this.zza.zzj().zzt(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzcxVar.zze();
                } catch (android.os.RemoteException e) {
                    ((com.google.android.gms.measurement.internal.zzib) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.this.zza)).zzaV().zze().zzb("Failed to call IDynamiteUploadBatchesCallback", e);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConditionalUserProperty(android.os.Bundle bundle, long j) throws android.os.RemoteException {
        zzb();
        if (bundle == null) {
            this.zza.zzaV().zzb().zza("Conditional user property must not be null");
        } else {
            this.zza.zzj().zzaa(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConsent(android.os.Bundle bundle, long j) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConsentThirdParty(android.os.Bundle bundle, long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzj().zzp(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, java.lang.String str2, long j) throws android.os.RemoteException {
        zzb();
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper))), str, str2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, java.lang.String str, java.lang.String str2, long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzs().zzk(zzdfVar, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setDataCollectionEnabled(boolean z) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzli zzj = this.zza.zzj();
        zzj.zzb();
        com.google.android.gms.measurement.internal.zzib zzibVar = zzj.zzu;
        zzj.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzjx(zzj, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setDefaultEventParameters(android.os.Bundle bundle) {
        zzb();
        final com.google.android.gms.measurement.internal.zzli zzj = this.zza.zzj();
        final android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
        zzj.zzu.zzaW().zzj(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzle
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zzli.this.zzag(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzda zzdaVar) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzp zzpVar = new com.google.android.gms.measurement.internal.zzp(this, zzdaVar);
        if (this.zza.zzaW().zze()) {
            this.zza.zzj().zzV(zzpVar);
        } else {
            this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zzl(this, zzpVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdc zzdcVar) throws android.os.RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setMeasurementEnabled(boolean z, long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzj().zzn(java.lang.Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setMinimumSessionDuration(long j) throws android.os.RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setSessionTimeoutDuration(long j) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzli zzj = this.zza.zzj();
        com.google.android.gms.measurement.internal.zzib zzibVar = zzj.zzu;
        zzj.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzjz(zzj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setSgtmDebugInfo(android.content.Intent intent) throws android.os.RemoteException {
        zzb();
        com.google.android.gms.measurement.internal.zzli zzj = this.zza.zzj();
        android.net.Uri data = intent.getData();
        if (data == null) {
            zzj.zzu.zzaV().zzi().zza("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        java.lang.String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            com.google.android.gms.measurement.internal.zzib zzibVar = zzj.zzu;
            zzibVar.zzaV().zzi().zza("[sgtm] Preview Mode was not enabled.");
            zzibVar.zzc().zzy(null);
        } else {
            java.lang.String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (android.text.TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            com.google.android.gms.measurement.internal.zzib zzibVar2 = zzj.zzu;
            zzibVar2.zzaV().zzi().zzb("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            zzibVar2.zzc().zzy(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setUserId(final java.lang.String str, long j) throws android.os.RemoteException {
        zzb();
        final com.google.android.gms.measurement.internal.zzli zzj = this.zza.zzj();
        if (str != null && android.text.TextUtils.isEmpty(str)) {
            zzj.zzu.zzaV().zze().zza("User ID must be non-empty or null");
        } else {
            zzj.zzu.zzaW().zzj(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzlf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.measurement.internal.zzib zzibVar = com.google.android.gms.measurement.internal.zzli.this.zzu;
                    if (zzibVar.zzv().zzq(str)) {
                        zzibVar.zzv().zzi();
                    }
                }
            });
            zzj.zzL(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setUserProperty(java.lang.String str, java.lang.String str2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, boolean z, long j) throws android.os.RemoteException {
        zzb();
        this.zza.zzj().zzL(str, str2, com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda zzdaVar) throws android.os.RemoteException {
        com.google.android.gms.measurement.internal.zzjp zzjpVar;
        zzb();
        java.util.Map map = this.zzb;
        synchronized (map) {
            zzjpVar = (com.google.android.gms.measurement.internal.zzjp) map.remove(java.lang.Integer.valueOf(zzdaVar.zzf()));
        }
        if (zzjpVar == null) {
            zzjpVar = new com.google.android.gms.measurement.internal.zzq(this, zzdaVar);
        }
        this.zza.zzj().zzX(zzjpVar);
    }
}
