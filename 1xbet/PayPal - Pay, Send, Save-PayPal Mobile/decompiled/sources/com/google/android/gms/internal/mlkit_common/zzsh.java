package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zzsh {
    private static com.google.android.gms.internal.mlkit_common.zzaf zza;
    private static final com.google.android.gms.internal.mlkit_common.zzai zzb = com.google.android.gms.internal.mlkit_common.zzai.zzc("optional-module-barcode", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE_MODULE_ID);
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.mlkit_common.zzrz zze;
    private final com.google.mlkit.common.sdkinternal.SharedPrefManager zzf;
    private final com.google.android.gms.tasks.Task zzg;
    private final com.google.android.gms.tasks.Task zzh;
    private final java.lang.String zzi;
    private final int zzj;

    public zzsh(android.content.Context context, final com.google.mlkit.common.sdkinternal.SharedPrefManager sharedPrefManager, com.google.android.gms.internal.mlkit_common.zzrz zzrzVar, java.lang.String str) {
        new java.util.HashMap();
        new java.util.HashMap();
        this.zzc = context.getPackageName();
        this.zzd = com.google.mlkit.common.sdkinternal.CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zzrzVar;
        com.google.android.gms.internal.mlkit_common.zzsv.zza();
        this.zzi = str;
        this.zzg = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance().scheduleCallable(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzse
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.android.gms.internal.mlkit_common.zzsh.this.zza();
            }
        });
        com.google.mlkit.common.sdkinternal.MLTaskExecutor mLTaskExecutor = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance();
        java.util.Objects.requireNonNull(sharedPrefManager);
        this.zzh = mLTaskExecutor.scheduleCallable(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsf
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.mlkit.common.sdkinternal.SharedPrefManager.this.getMlSdkInstanceId();
            }
        });
        com.google.android.gms.internal.mlkit_common.zzai zzaiVar = zzb;
        this.zzj = zzaiVar.containsKey(str) ? com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(context, (java.lang.String) zzaiVar.get(str)) : -1;
    }

    private static com.google.android.gms.internal.mlkit_common.zzaf zzh() {
        synchronized (com.google.android.gms.internal.mlkit_common.zzsh.class) {
            com.google.android.gms.internal.mlkit_common.zzaf zzafVar = zza;
            if (zzafVar != null) {
                return zzafVar;
            }
            androidx.core.os.LocaleListCompat locales = androidx.core.os.ConfigurationCompat.getLocales(android.content.res.Resources.getSystem().getConfiguration());
            com.google.android.gms.internal.mlkit_common.zzac zzacVar = new com.google.android.gms.internal.mlkit_common.zzac();
            for (int i = 0; i < locales.size(); i++) {
                zzacVar.zzb(com.google.mlkit.common.sdkinternal.CommonUtils.languageTagFromLocale(locales.get(i)));
            }
            com.google.android.gms.internal.mlkit_common.zzaf zzc = zzacVar.zzc();
            zza = zzc;
            return zzc;
        }
    }

    private final com.google.android.gms.internal.mlkit_common.zzqt zzi(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.mlkit_common.zzqt zzqtVar = new com.google.android.gms.internal.mlkit_common.zzqt();
        zzqtVar.zzb(this.zzc);
        zzqtVar.zzc(this.zzd);
        zzqtVar.zzh(zzh());
        zzqtVar.zzg(true);
        zzqtVar.zzl(str);
        zzqtVar.zzj(str2);
        zzqtVar.zzi(this.zzh.isSuccessful() ? (java.lang.String) this.zzh.getResult() : this.zzf.getMlSdkInstanceId());
        zzqtVar.zzd(10);
        zzqtVar.zzk(java.lang.Integer.valueOf(this.zzj));
        return zzqtVar;
    }

    private final java.lang.String zzj() {
        if (this.zzg.isSuccessful()) {
            return (java.lang.String) this.zzg.getResult();
        }
        return com.google.android.gms.common.internal.LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ java.lang.String zza() throws java.lang.Exception {
        return com.google.android.gms.common.internal.LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.mlkit_common.zzry zzryVar, com.google.android.gms.internal.mlkit_common.zzmv zzmvVar, java.lang.String str) {
        zzryVar.zza(zzmvVar);
        zzryVar.zzc(zzi(zzryVar.zzd(), str));
        this.zze.zza(zzryVar);
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.mlkit_common.zzry zzryVar, com.google.android.gms.internal.mlkit_common.zzsj zzsjVar, com.google.mlkit.common.model.RemoteModel remoteModel) {
        zzryVar.zza(com.google.android.gms.internal.mlkit_common.zzmv.MODEL_DOWNLOAD);
        zzryVar.zzc(zzi(zzsjVar.zze(), zzj()));
        zzryVar.zzb(com.google.android.gms.internal.mlkit_common.zzst.zza(remoteModel, this.zzf, zzsjVar));
        this.zze.zza(zzryVar);
    }

    public final void zzd(final com.google.android.gms.internal.mlkit_common.zzry zzryVar, final com.google.android.gms.internal.mlkit_common.zzmv zzmvVar) {
        final java.lang.String zzj = zzj();
        com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsd
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.mlkit_common.zzsh.this.zzb(zzryVar, zzmvVar, zzj);
            }
        });
    }

    public final void zze(com.google.android.gms.internal.mlkit_common.zzry zzryVar, com.google.mlkit.common.model.RemoteModel remoteModel, boolean z, int i) {
        com.google.android.gms.internal.mlkit_common.zzsi zzh = com.google.android.gms.internal.mlkit_common.zzsj.zzh();
        zzh.zzf(false);
        zzh.zzd(remoteModel.getModelType());
        zzh.zza(com.google.android.gms.internal.mlkit_common.zzna.FAILED);
        zzh.zzb(com.google.android.gms.internal.mlkit_common.zzmu.DOWNLOAD_FAILED);
        zzh.zzc(i);
        zzg(zzryVar, remoteModel, zzh.zzh());
    }

    public final void zzf(com.google.android.gms.internal.mlkit_common.zzry zzryVar, com.google.mlkit.common.model.RemoteModel remoteModel, com.google.android.gms.internal.mlkit_common.zzmu zzmuVar, boolean z, com.google.mlkit.common.sdkinternal.ModelType modelType, com.google.android.gms.internal.mlkit_common.zzna zznaVar) {
        com.google.android.gms.internal.mlkit_common.zzsi zzh = com.google.android.gms.internal.mlkit_common.zzsj.zzh();
        zzh.zzf(z);
        zzh.zzd(modelType);
        zzh.zzb(zzmuVar);
        zzh.zza(zznaVar);
        zzg(zzryVar, remoteModel, zzh.zzh());
    }

    public final void zzg(final com.google.android.gms.internal.mlkit_common.zzry zzryVar, final com.google.mlkit.common.model.RemoteModel remoteModel, final com.google.android.gms.internal.mlkit_common.zzsj zzsjVar) {
        com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsg
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.mlkit_common.zzsh.this.zzc(zzryVar, zzsjVar, remoteModel);
            }
        });
    }
}
