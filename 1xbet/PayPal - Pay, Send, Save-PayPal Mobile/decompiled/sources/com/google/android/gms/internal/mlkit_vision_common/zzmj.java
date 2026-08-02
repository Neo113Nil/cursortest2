package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
public final class zzmj {
    private static com.google.android.gms.internal.mlkit_vision_common.zzp zza;
    private static final com.google.android.gms.internal.mlkit_vision_common.zzr zzb = com.google.android.gms.internal.mlkit_vision_common.zzr.zzc("optional-module-barcode", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE_MODULE_ID);
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.mlkit_vision_common.zzmc zze;
    private final com.google.mlkit.common.sdkinternal.SharedPrefManager zzf;
    private final com.google.android.gms.tasks.Task zzg;
    private final com.google.android.gms.tasks.Task zzh;
    private final java.lang.String zzi;
    private final int zzj;
    private final java.util.Map zzk = new java.util.HashMap();
    private final java.util.Map zzl = new java.util.HashMap();

    public zzmj(android.content.Context context, final com.google.mlkit.common.sdkinternal.SharedPrefManager sharedPrefManager, com.google.android.gms.internal.mlkit_vision_common.zzmc zzmcVar, java.lang.String str) {
        this.zzc = context.getPackageName();
        this.zzd = com.google.mlkit.common.sdkinternal.CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zzmcVar;
        com.google.android.gms.internal.mlkit_vision_common.zzmw.zza();
        this.zzi = str;
        this.zzg = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance().scheduleCallable(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmg
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.android.gms.internal.mlkit_vision_common.zzmj.this.zza();
            }
        });
        com.google.mlkit.common.sdkinternal.MLTaskExecutor mLTaskExecutor = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance();
        sharedPrefManager.getClass();
        this.zzh = mLTaskExecutor.scheduleCallable(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmh
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.mlkit.common.sdkinternal.SharedPrefManager.this.getMlSdkInstanceId();
            }
        });
        com.google.android.gms.internal.mlkit_vision_common.zzr zzrVar = zzb;
        this.zzj = zzrVar.containsKey(str) ? com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(context, (java.lang.String) zzrVar.get(str)) : -1;
    }

    private static com.google.android.gms.internal.mlkit_vision_common.zzp zzd() {
        synchronized (com.google.android.gms.internal.mlkit_vision_common.zzmj.class) {
            com.google.android.gms.internal.mlkit_vision_common.zzp zzpVar = zza;
            if (zzpVar != null) {
                return zzpVar;
            }
            androidx.core.os.LocaleListCompat locales = androidx.core.os.ConfigurationCompat.getLocales(android.content.res.Resources.getSystem().getConfiguration());
            com.google.android.gms.internal.mlkit_vision_common.zzm zzmVar = new com.google.android.gms.internal.mlkit_vision_common.zzm();
            for (int i = 0; i < locales.size(); i++) {
                zzmVar.zzb(com.google.mlkit.common.sdkinternal.CommonUtils.languageTagFromLocale(locales.get(i)));
            }
            com.google.android.gms.internal.mlkit_vision_common.zzp zzc = zzmVar.zzc();
            zza = zzc;
            return zzc;
        }
    }

    final /* synthetic */ java.lang.String zza() throws java.lang.Exception {
        return com.google.android.gms.common.internal.LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.mlkit_vision_common.zzmb zzmbVar, com.google.android.gms.internal.mlkit_vision_common.zziv zzivVar, java.lang.String str) {
        zzmbVar.zza(zzivVar);
        java.lang.String zzc = zzmbVar.zzc();
        com.google.android.gms.internal.mlkit_vision_common.zzky zzkyVar = new com.google.android.gms.internal.mlkit_vision_common.zzky();
        zzkyVar.zzb(this.zzc);
        zzkyVar.zzc(this.zzd);
        zzkyVar.zzh(zzd());
        zzkyVar.zzg(true);
        zzkyVar.zzl(zzc);
        zzkyVar.zzj(str);
        zzkyVar.zzi(this.zzh.isSuccessful() ? (java.lang.String) this.zzh.getResult() : this.zzf.getMlSdkInstanceId());
        zzkyVar.zzd(10);
        zzkyVar.zzk(java.lang.Integer.valueOf(this.zzj));
        zzmbVar.zzb(zzkyVar);
        this.zze.zza(zzmbVar);
    }

    public final void zzc(com.google.android.gms.internal.mlkit_vision_common.zzmt zzmtVar, final com.google.android.gms.internal.mlkit_vision_common.zziv zzivVar) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.zzk.get(zzivVar) != null && elapsedRealtime - ((java.lang.Long) this.zzk.get(zzivVar)).longValue() <= java.util.concurrent.TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.zzk.put(zzivVar, java.lang.Long.valueOf(elapsedRealtime));
        int i = zzmtVar.zza;
        int i2 = zzmtVar.zzb;
        int i3 = zzmtVar.zzc;
        int i4 = zzmtVar.zzd;
        int i5 = zzmtVar.zze;
        long j = zzmtVar.zzf;
        int i6 = zzmtVar.zzg;
        com.google.android.gms.internal.mlkit_vision_common.zzin zzinVar = new com.google.android.gms.internal.mlkit_vision_common.zzin();
        zzinVar.zzd(i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? com.google.android.gms.internal.mlkit_vision_common.zzii.UNKNOWN_FORMAT : com.google.android.gms.internal.mlkit_vision_common.zzii.NV21 : com.google.android.gms.internal.mlkit_vision_common.zzii.NV16 : com.google.android.gms.internal.mlkit_vision_common.zzii.YV12 : com.google.android.gms.internal.mlkit_vision_common.zzii.YUV_420_888 : com.google.android.gms.internal.mlkit_vision_common.zzii.BITMAP);
        zzinVar.zzf(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? com.google.android.gms.internal.mlkit_vision_common.zzio.ANDROID_MEDIA_IMAGE : com.google.android.gms.internal.mlkit_vision_common.zzio.FILEPATH : com.google.android.gms.internal.mlkit_vision_common.zzio.BYTEBUFFER : com.google.android.gms.internal.mlkit_vision_common.zzio.BYTEARRAY : com.google.android.gms.internal.mlkit_vision_common.zzio.BITMAP);
        zzinVar.zzc(java.lang.Integer.valueOf(i3));
        zzinVar.zze(java.lang.Integer.valueOf(i4));
        zzinVar.zzg(java.lang.Integer.valueOf(i5));
        zzinVar.zzb(java.lang.Long.valueOf(j));
        zzinVar.zzh(java.lang.Integer.valueOf(i6));
        com.google.android.gms.internal.mlkit_vision_common.zziq zzj = zzinVar.zzj();
        com.google.android.gms.internal.mlkit_vision_common.zziw zziwVar = new com.google.android.gms.internal.mlkit_vision_common.zziw();
        zziwVar.zzd(zzj);
        final com.google.android.gms.internal.mlkit_vision_common.zzmb zze = com.google.android.gms.internal.mlkit_vision_common.zzmk.zze(zziwVar);
        final java.lang.String version = this.zzg.isSuccessful() ? (java.lang.String) this.zzg.getResult() : com.google.android.gms.common.internal.LibraryVersion.getInstance().getVersion(this.zzi);
        com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmi
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.mlkit_vision_common.zzmj.this.zzb(zze, zzivVar, version);
            }
        });
    }
}
