package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class zzctl implements zzcuq, zzdbu, zzczk, zzcvg, zzaxx {
    private final zzcvi zza;
    private final zzfaf zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;
    private final String zzh;
    private final zzgbw zze = zzgbw.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzctl(zzcvi zzcviVar, zzfaf zzfafVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zza = zzcviVar;
        this.zzb = zzfafVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    public static /* synthetic */ void zzh(zzctl zzctlVar) {
        synchronized (zzctlVar) {
            try {
                if (zzctlVar.zze.isDone()) {
                    return;
                }
                zzctlVar.zze.zzc(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean zzm() {
        return this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzc() {
        zzfaf zzfafVar = this.zzb;
        if (zzfafVar.zze == 3) {
            return;
        }
        int i7 = zzfafVar.zzY;
        if (i7 == 0 || i7 == 1) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlw)).booleanValue() && zzm()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final void zzdn(zzaxw zzaxwVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlw)).booleanValue() && zzm() && zzaxwVar.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zze != 3) {
            J.k("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzdq(zzbva zzbvaVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final synchronized void zzj() {
        try {
            if (this.zze.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zzc(Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzk() {
        if (this.zzb.zze == 3) {
            return;
        }
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbH)).booleanValue()) {
            zzfaf zzfafVar = this.zzb;
            if (zzfafVar.zzY == 2) {
                if (zzfafVar.zzq == 0) {
                    this.zza.zza();
                } else {
                    zzgbc.zzr(this.zze, new zzctk(this), this.zzd);
                    this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctj
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzctl.zzh(this.zza);
                        }
                    }, this.zzb.zzq, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final synchronized void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            if (this.zze.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zzd(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }
}
