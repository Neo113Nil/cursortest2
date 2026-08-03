package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcfm {
    private com.google.android.gms.internal.ads.zzhcg zza;
    private com.google.android.gms.internal.ads.zzdzl zzb;
    private android.content.Context zzc;
    private final java.util.concurrent.atomic.AtomicBoolean zzd = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean zze = new java.util.concurrent.atomic.AtomicBoolean(false);
    private long zzf = -1;
    private long zzg = -1;

    public final void zza(com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar, android.content.Context context) {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        this.zza = zzhcgVar;
        this.zzb = zzdzlVar;
        this.zzf = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpm)).longValue();
        this.zzg = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpn)).longValue();
        this.zzc = context;
    }

    public final void zzb() {
        com.google.android.gms.internal.ads.zzhcg zzhcgVar;
        if (!this.zzd.get() || this.zzf < 0 || this.zzg < 0 || !this.zze.compareAndSet(false, true) || (zzhcgVar = this.zza) == null) {
            return;
        }
        zzhcgVar.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcfm.this.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        com.google.android.gms.internal.ads.zzdzl zzdzlVar;
        android.app.ActivityManager.MemoryInfo zze;
        while (this.zze.get()) {
            final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    atomicBoolean.getAndSet(true);
                }
            });
            try {
                java.lang.Thread.sleep(this.zzf);
                if (!atomicBoolean.get()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpo)).booleanValue() && (zzdzlVar = this.zzb) != null) {
                        com.google.android.gms.internal.ads.zzdzk zza = zzdzlVar.zza();
                        zza.zzc("action", "panr");
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpQ)).booleanValue() && (zze = com.google.android.gms.ads.internal.util.client.zzf.zze(this.zzc)) != null) {
                            zza.zzc("mem_avl", java.lang.String.valueOf(zze.availMem));
                            zza.zzc("mem_tt", java.lang.String.valueOf(zze.totalMem));
                            zza.zzc("low_m", true != zze.lowMemory ? "0" : "1");
                        }
                        zza.zzf();
                    }
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpp)).booleanValue()) {
                        java.lang.StackTraceElement[] stackTrace = android.os.Looper.getMainLooper().getThread().getStackTrace();
                        com.google.android.gms.internal.ads.zzcfl zzcflVar = new com.google.android.gms.internal.ads.zzcfl("Potential ANR detected");
                        zzcflVar.setStackTrace(stackTrace);
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpq)).booleanValue()) {
                            com.google.android.gms.internal.ads.zzbzy.zzc(this.zzc).zzi(zzcflVar, "AnrWatchdog", ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpr)).intValue() / 100.0f);
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(zzcflVar, "AnrWatchdog");
                        }
                    }
                }
                do {
                    try {
                        java.lang.Thread.sleep(this.zzg);
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (java.lang.InterruptedException unused2) {
                java.lang.Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
