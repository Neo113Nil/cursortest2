package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzwp {
    private static com.google.android.gms.internal.mlkit_vision_barcode.zzcs zza;
    private static final com.google.android.gms.internal.mlkit_vision_barcode.zzcu zzb = com.google.android.gms.internal.mlkit_vision_barcode.zzcu.zzc("optional-module-barcode", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE_MODULE_ID);
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzwf zze;
    private final com.google.mlkit.common.sdkinternal.SharedPrefManager zzf;
    private final com.google.android.gms.tasks.Task zzg;
    private final com.google.android.gms.tasks.Task zzh;
    private final java.lang.String zzi;
    private final int zzj;
    private final java.util.Map zzk = new java.util.HashMap();
    private final java.util.Map zzl = new java.util.HashMap();

    public zzwp(android.content.Context context, final com.google.mlkit.common.sdkinternal.SharedPrefManager sharedPrefManager, com.google.android.gms.internal.mlkit_vision_barcode.zzwf zzwfVar, java.lang.String str) {
        this.zzc = context.getPackageName();
        this.zzd = com.google.mlkit.common.sdkinternal.CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zzwfVar;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxb.zza();
        this.zzi = str;
        this.zzg = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance().scheduleCallable(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwl
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.android.gms.internal.mlkit_vision_barcode.zzwp.this.zzb();
            }
        });
        com.google.mlkit.common.sdkinternal.MLTaskExecutor mLTaskExecutor = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance();
        java.util.Objects.requireNonNull(sharedPrefManager);
        this.zzh = mLTaskExecutor.scheduleCallable(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwm
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.mlkit.common.sdkinternal.SharedPrefManager.this.getMlSdkInstanceId();
            }
        });
        com.google.android.gms.internal.mlkit_vision_barcode.zzcu zzcuVar = zzb;
        this.zzj = zzcuVar.containsKey(str) ? com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(context, (java.lang.String) zzcuVar.get(str)) : -1;
    }

    static long zza(java.util.List list, double d) {
        return ((java.lang.Long) list.get(java.lang.Math.max(((int) java.lang.Math.ceil((d / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    private static com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzi() {
        synchronized (com.google.android.gms.internal.mlkit_vision_barcode.zzwp.class) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzcsVar = zza;
            if (zzcsVar != null) {
                return zzcsVar;
            }
            androidx.core.os.LocaleListCompat locales = androidx.core.os.ConfigurationCompat.getLocales(android.content.res.Resources.getSystem().getConfiguration());
            com.google.android.gms.internal.mlkit_vision_barcode.zzcp zzcpVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzcp();
            for (int i = 0; i < locales.size(); i++) {
                zzcpVar.zzd(com.google.mlkit.common.sdkinternal.CommonUtils.languageTagFromLocale(locales.get(i)));
            }
            com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzf = zzcpVar.zzf();
            zza = zzf;
            return zzf;
        }
    }

    private final java.lang.String zzj() {
        if (this.zzg.isSuccessful()) {
            return (java.lang.String) this.zzg.getResult();
        }
        return com.google.android.gms.common.internal.LibraryVersion.getInstance().getVersion(this.zzi);
    }

    private final boolean zzk(com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar, long j, long j2) {
        return this.zzk.get(zzrcVar) == null || j - ((java.lang.Long) this.zzk.get(zzrcVar)).longValue() > java.util.concurrent.TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ java.lang.String zzb() throws java.lang.Exception {
        return com.google.android.gms.common.internal.LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.mlkit_vision_barcode.zzwe zzweVar, com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar, java.lang.String str) {
        zzweVar.zzb(zzrcVar);
        java.lang.String zzd = zzweVar.zzd();
        com.google.android.gms.internal.mlkit_vision_barcode.zzvb zzvbVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzvb();
        zzvbVar.zzb(this.zzc);
        zzvbVar.zzc(this.zzd);
        zzvbVar.zzh(zzi());
        zzvbVar.zzg(true);
        zzvbVar.zzl(zzd);
        zzvbVar.zzj(str);
        zzvbVar.zzi(this.zzh.isSuccessful() ? (java.lang.String) this.zzh.getResult() : this.zzf.getMlSdkInstanceId());
        zzvbVar.zzd(10);
        zzvbVar.zzk(java.lang.Integer.valueOf(this.zzj));
        zzweVar.zzc(zzvbVar);
        this.zze.zza(zzweVar);
    }

    public final void zzd(com.google.android.gms.internal.mlkit_vision_barcode.zzwe zzweVar, com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar) {
        zze(zzweVar, zzrcVar, zzj());
    }

    public final void zze(final com.google.android.gms.internal.mlkit_vision_barcode.zzwe zzweVar, final com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar, final java.lang.String str) {
        com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwj
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.mlkit_vision_barcode.zzwp.this.zzc(zzweVar, zzrcVar, str);
            }
        });
    }

    public final void zzf(com.google.android.gms.internal.mlkit_vision_barcode.zzwo zzwoVar, com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (zzk(zzrcVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzrcVar, java.lang.Long.valueOf(elapsedRealtime));
            zze(zzwoVar.zza(), zzrcVar, zzj());
        }
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar, com.google.mlkit.vision.barcode.internal.zzk zzkVar) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzcy zzcyVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzcy) this.zzl.get(zzrcVar);
        if (zzcyVar != null) {
            for (java.lang.Object obj : zzcyVar.zzw()) {
                java.util.ArrayList arrayList = new java.util.ArrayList(zzcyVar.zze(obj));
                java.util.Collections.sort(arrayList);
                com.google.android.gms.internal.mlkit_vision_barcode.zzqb zzqbVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzqb();
                java.util.Iterator it = arrayList.iterator();
                long j = 0;
                while (it.hasNext()) {
                    j += ((java.lang.Long) it.next()).longValue();
                }
                zzqbVar.zza(java.lang.Long.valueOf(j / arrayList.size()));
                zzqbVar.zzc(java.lang.Long.valueOf(zza(arrayList, 100.0d)));
                zzqbVar.zzf(java.lang.Long.valueOf(zza(arrayList, 75.0d)));
                zzqbVar.zzd(java.lang.Long.valueOf(zza(arrayList, 50.0d)));
                zzqbVar.zzb(java.lang.Long.valueOf(zza(arrayList, 25.0d)));
                zzqbVar.zze(java.lang.Long.valueOf(zza(arrayList, 0.0d)));
                zze(zzkVar.zza(obj, arrayList.size(), zzqbVar.zzg()), zzrcVar, zzj());
            }
            this.zzl.remove(zzrcVar);
        }
    }

    final /* synthetic */ void zzh(final com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar, java.lang.Object obj, long j, final com.google.mlkit.vision.barcode.internal.zzk zzkVar) {
        if (!this.zzl.containsKey(zzrcVar)) {
            this.zzl.put(zzrcVar, com.google.android.gms.internal.mlkit_vision_barcode.zzbw.zzz());
        }
        ((com.google.android.gms.internal.mlkit_vision_barcode.zzcy) this.zzl.get(zzrcVar)).zzt(obj, java.lang.Long.valueOf(j));
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (zzk(zzrcVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzrcVar, java.lang.Long.valueOf(elapsedRealtime));
            com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwk
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.mlkit_vision_barcode.zzwp.this.zzg(zzrcVar, zzkVar);
                }
            });
        }
    }
}
