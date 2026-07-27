package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdce implements zzddp, zzdlb, zzdir, zzdef, zzbfg {
    private final zzdeh zza;
    private final zzdgi zzb;
    private final zzfld zzc;
    private final ScheduledExecutorService zzd;
    private final Executor zze;
    private ScheduledFuture zzg;
    private final String zzi;
    private final zzhdr zzf = zzhdr.zze();
    private final AtomicBoolean zzh = new AtomicBoolean();

    zzdce(zzdeh zzdehVar, zzfld zzfldVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, zzdgi zzdgiVar) {
        this.zza = zzdehVar;
        this.zzc = zzfldVar;
        this.zzd = scheduledExecutorService;
        this.zze = executor;
        this.zzi = str;
        this.zzb = zzdgiVar;
    }

    private final boolean zzl() {
        return this.zzi.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzd(zzcch zzcchVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final synchronized void zzdH() {
        if (this.zzc.zze == 4) {
            this.zza.zza();
            return;
        }
        zzhdr zzhdrVar = this.zzf;
        if (zzhdrVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzhdrVar.zza((Object) true);
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzdj(zzbff zzbffVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzng)).booleanValue() && zzl() && zzbffVar.zzj && this.zzh.compareAndSet(false, true) && this.zzc.zze != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdt() {
        zzfld zzfldVar = this.zzc;
        if (zzfldVar.zze == 3) {
            return;
        }
        int i = zzfldVar.zzY;
        if (i == 0 || i == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzng)).booleanValue() && zzl()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlb
    public final void zzg() {
        zzfld zzfldVar = this.zzc;
        int i = zzfldVar.zze;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.zzb.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcm)).booleanValue() && zzfldVar.zzY == 2) {
            int i2 = zzfldVar.zzq;
            if (i2 == 0) {
                this.zza.zza();
            } else {
                zzhcy.zzr(this.zzf, new zzdcc(this), this.zze);
                this.zzg = this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdcd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzdce.this.zzi();
                    }
                }, i2, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlb
    public final void zzh() {
    }

    final /* synthetic */ void zzi() {
        synchronized (this) {
            zzhdr zzhdrVar = this.zzf;
            if (zzhdrVar.isDone()) {
                return;
            }
            zzhdrVar.zza((Object) true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzhdr zzhdrVar = this.zzf;
        if (zzhdrVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzhdrVar.zzb(new Exception());
    }

    final /* synthetic */ zzdeh zzk() {
        return this.zza;
    }
}
