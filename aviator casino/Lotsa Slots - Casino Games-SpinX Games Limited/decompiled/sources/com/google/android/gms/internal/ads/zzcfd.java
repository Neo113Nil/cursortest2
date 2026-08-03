package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzcfd {
    private final java.lang.Object zza = new java.lang.Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final com.google.android.gms.internal.ads.zzcfi zzc;
    private boolean zzd;
    private android.content.Context zze;
    private com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private java.lang.String zzg;
    private com.google.android.gms.internal.ads.zzbiv zzh;
    private com.google.android.gms.internal.ads.zzdzl zzi;
    private java.lang.Boolean zzj;
    private final java.util.concurrent.atomic.AtomicInteger zzk;
    private final java.util.concurrent.atomic.AtomicInteger zzl;
    private final com.google.android.gms.internal.ads.zzcfc zzm;
    private final java.lang.Object zzn;
    private com.google.common.util.concurrent.ListenableFuture zzo;
    private final java.util.concurrent.atomic.AtomicBoolean zzp;

    public zzcfd() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new com.google.android.gms.internal.ads.zzcfi(com.google.android.gms.ads.internal.client.zzay.zzf(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = null;
        this.zzk = new java.util.concurrent.atomic.AtomicInteger(0);
        this.zzl = new java.util.concurrent.atomic.AtomicInteger(0);
        this.zzm = new com.google.android.gms.internal.ads.zzcfc(null);
        this.zzn = new java.lang.Object();
        this.zzp = new java.util.concurrent.atomic.AtomicBoolean();
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzA() {
        return this.zzf;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbiv zzB() {
        return this.zzh;
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zzC() {
        return this.zzp;
    }

    public final com.google.android.gms.internal.ads.zzbiv zza() {
        com.google.android.gms.internal.ads.zzbiv zzbivVar;
        synchronized (this.zza) {
            zzbivVar = this.zzh;
        }
        return zzbivVar;
    }

    public final void zzb(java.lang.Boolean bool) {
        synchronized (this.zza) {
            this.zzj = bool;
        }
    }

    public final java.lang.Boolean zzc() {
        java.lang.Boolean bool;
        synchronized (this.zza) {
            bool = this.zzj;
        }
        return bool;
    }

    public final void zzd() {
        this.zzm.zza();
    }

    public final void zze(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        com.google.android.gms.internal.ads.zzbiv zzbivVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = versionInfoParcel;
                com.google.android.gms.ads.internal.zzt.zzg().zzb(this.zzc);
                this.zzb.zza(this.zze);
                com.google.android.gms.internal.ads.zzbzy.zzb(this.zze, this.zzf);
                this.zzi = zzdzlVar;
                com.google.android.gms.ads.internal.zzt.zzm();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcI)).booleanValue()) {
                    zzbivVar = new com.google.android.gms.internal.ads.zzbiv();
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbivVar = null;
                }
                this.zzh = zzbivVar;
                if (zzbivVar != null) {
                    com.google.android.gms.internal.ads.zzcfu.zza(new com.google.android.gms.internal.ads.zzcez(this).zzb(), "AppState.registerCsiReporter", com.google.android.gms.internal.ads.zzcfr.zzh);
                }
                android.content.Context context2 = this.zze;
                if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjH)).booleanValue()) {
                        try {
                            ((android.net.ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new com.google.android.gms.internal.ads.zzcfa(this));
                        } catch (java.lang.RuntimeException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e);
                            this.zzp.set(true);
                        }
                    }
                }
                this.zzd = true;
                zzq();
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzps)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
    }

    public final android.content.res.Resources zzf() {
        if (this.zzf.isClientJar) {
            return this.zze.getResources();
        }
        try {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmo)).booleanValue()) {
                return com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zze).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zze).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void zzg(java.lang.Throwable th, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbzy.zzb(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzh(java.lang.Throwable th, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbzy.zzb(this.zze, this.zzf).zzi(th, str, ((java.lang.Double) com.google.android.gms.internal.ads.zzbkz.zzf.zze()).floatValue());
    }

    public final void zzi(java.lang.Throwable th, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbzy.zzd(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzj() {
        this.zzk.incrementAndGet();
    }

    public final void zzk() {
        this.zzk.decrementAndGet();
    }

    public final int zzl() {
        return this.zzk.get();
    }

    public final void zzm() {
        this.zzl.incrementAndGet();
    }

    public final int zzn() {
        return this.zzl.get();
    }

    public final com.google.android.gms.ads.internal.util.zzg zzo() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final android.content.Context zzp() {
        return this.zze;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzq() {
        if (this.zze != null) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdO)).booleanValue()) {
                synchronized (this.zzn) {
                    com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzo;
                    if (listenableFuture != null) {
                        return listenableFuture;
                    }
                    com.google.common.util.concurrent.ListenableFuture zzc = com.google.android.gms.internal.ads.zzcfr.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzcfb
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ java.lang.Object call() {
                            return com.google.android.gms.internal.ads.zzcfd.this.zzx();
                        }
                    });
                    this.zzo = zzc;
                    return zzc;
                }
            }
        }
        return com.google.android.gms.internal.ads.zzhbw.zza(new java.util.ArrayList());
    }

    public final com.google.android.gms.internal.ads.zzcfi zzr() {
        return this.zzc;
    }

    public final boolean zzs(android.content.Context context) {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjH)).booleanValue()) {
                return this.zzp.get();
            }
        }
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void zzt(java.lang.String str) {
        this.zzg = str;
    }

    public final java.lang.String zzu() {
        return this.zzg;
    }

    public final com.google.android.gms.internal.ads.zzdzl zzv() {
        return this.zzi;
    }

    public final android.app.ActivityManager.MemoryInfo zzw() {
        return com.google.android.gms.ads.internal.util.client.zzf.zze(this.zze);
    }

    final /* synthetic */ java.util.ArrayList zzx() {
        android.content.Context zza = com.google.android.gms.internal.ads.zzcbn.zza(this.zze);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(zza).getPackageInfo(zza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(packageInfo.requestedPermissions[i]);
                    }
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    final /* synthetic */ java.lang.Object zzy() {
        return this.zza;
    }

    final /* synthetic */ android.content.Context zzz() {
        return this.zze;
    }
}
