package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdbs implements com.google.android.gms.ads.internal.overlay.zzr {
    private final com.google.android.gms.internal.ads.zzfkq zzc;
    private final com.google.android.gms.internal.ads.zzfkf zzd;
    private final com.google.android.gms.common.util.Clock zze;
    private final com.google.android.gms.internal.ads.zzdzl zzf;
    private final java.util.concurrent.ScheduledExecutorService zzg;
    private final java.lang.Object zzb = new java.lang.Object();
    final com.google.android.gms.internal.ads.zzfrc zza = com.google.android.gms.internal.ads.zzfrd.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    zzdbs(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzdzl zzdzlVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzfkqVar;
        this.zzd = zzfkfVar;
        this.zze = clock;
        this.zzf = zzdzlVar;
        this.zzg = scheduledExecutorService;
    }

    private final void zzn() {
        synchronized (this.zzb) {
            com.google.android.gms.internal.ads.zzdzl zzdzlVar = this.zzf;
            java.lang.String str = this.zzc.zzb.zzb.zzb;
            java.lang.String encodeToString = android.util.Base64.encodeToString(((com.google.android.gms.internal.ads.zzfrd) this.zza.zzbu()).zzaN(), 1);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoq)).booleanValue()) {
                com.google.android.gms.internal.ads.zzdzk zza = zzdzlVar.zza();
                zza.zzc("action", "pclma");
                zza.zzc("pclmd", encodeToString);
                zza.zzc("gqi", str);
                zza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzo(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzo(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzo(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzo(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzo(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzo(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        zzo(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        zzo(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final void zzl() {
        synchronized (this.zzb) {
            int i = this.zzd.zzaE;
            if (i > 0 && !this.zzh) {
                this.zza.zzb(this.zze.currentTimeMillis());
                this.zzh = true;
                this.zzg.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdbr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzdbs.this.zzm();
                    }
                }, i, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            if (this.zzi) {
                return;
            }
            this.zzi = true;
            zzn();
        }
    }

    private final void zzo(int i) {
        synchronized (this.zzb) {
            if (!this.zzi && this.zzh) {
                com.google.android.gms.internal.ads.zzfrc zzfrcVar = this.zza;
                com.google.android.gms.internal.ads.zzfpu zza = com.google.android.gms.internal.ads.zzfpv.zza();
                zza.zzb(i);
                zza.zza(this.zze.currentTimeMillis());
                zzfrcVar.zza((com.google.android.gms.internal.ads.zzfpv) zza.zzbu());
                if (i == 10) {
                    zzn();
                    this.zzi = true;
                }
            }
        }
    }
}
