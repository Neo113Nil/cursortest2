package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import android.os.SystemClock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzcxi extends zzdag {
    private final ScheduledExecutorService zzb;
    private final p090m3.a zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private ScheduledFuture zzi;
    private ScheduledFuture zzj;

    public zzcxi(ScheduledExecutorService scheduledExecutorService, p090m3.a aVar) {
        super(Collections.emptySet());
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = false;
        this.zzb = scheduledExecutorService;
        this.zzc = aVar;
    }

    private final synchronized void zzf(long j) {
        try {
            ScheduledFuture scheduledFuture = this.zzi;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzi.cancel(false);
            }
            ((p090m3.b) this.zzc).getClass();
            this.zzd = SystemClock.elapsedRealtime() + j;
            this.zzi = this.zzb.schedule(new zzcxf(this, null), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzg(long j) {
        try {
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzj.cancel(false);
            }
            ((p090m3.b) this.zzc).getClass();
            this.zze = SystemClock.elapsedRealtime() + j;
            this.zzj = this.zzb.schedule(new zzcxg(this, null), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        this.zzh = false;
        zzf(0L);
    }

    public final synchronized void zzb() {
        try {
            if (this.zzh) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzi;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.zzf = -1L;
            } else {
                this.zzi.cancel(false);
                long j = this.zzd;
                ((p090m3.b) this.zzc).getClass();
                this.zzf = j - SystemClock.elapsedRealtime();
            }
            ScheduledFuture scheduledFuture2 = this.zzj;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.zzg = -1L;
            } else {
                this.zzj.cancel(false);
                long j3 = this.zze;
                ((p090m3.b) this.zzc).getClass();
                this.zzg = j3 - SystemClock.elapsedRealtime();
            }
            this.zzh = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.zzh) {
                if (this.zzf > 0 && (scheduledFuture2 = this.zzi) != null && scheduledFuture2.isCancelled()) {
                    zzf(this.zzf);
                }
                if (this.zzg > 0 && (scheduledFuture = this.zzj) != null && scheduledFuture.isCancelled()) {
                    zzg(this.zzg);
                }
                this.zzh = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(int i7) {
        J.k("In scheduleRefresh: " + i7);
        if (i7 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i7);
            if (this.zzh) {
                long j = this.zzf;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.zzf = millis;
                return;
            }
            ((p090m3.b) this.zzc).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzng)).booleanValue()) {
                long j3 = this.zzd;
                if (jElapsedRealtime >= j3 || j3 - jElapsedRealtime > millis) {
                    zzf(millis);
                }
            } else {
                long j7 = this.zzd;
                if (jElapsedRealtime > j7 || j7 - jElapsedRealtime > millis) {
                    zzf(millis);
                }
            }
        }
    }

    public final synchronized void zze(int i7) {
        J.k("In scheduleShowRefreshedAd: " + i7);
        if (i7 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i7);
            if (this.zzh) {
                long j = this.zzg;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.zzg = millis;
                return;
            }
            ((p090m3.b) this.zzc).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzng)).booleanValue()) {
                if (jElapsedRealtime == this.zze) {
                    J.k("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j3 = this.zze;
                if (jElapsedRealtime >= j3 || j3 - jElapsedRealtime > millis) {
                    zzg(millis);
                }
            } else {
                long j7 = this.zze;
                if (jElapsedRealtime > j7 || j7 - jElapsedRealtime > millis) {
                    zzg(millis);
                }
            }
        }
    }
}
