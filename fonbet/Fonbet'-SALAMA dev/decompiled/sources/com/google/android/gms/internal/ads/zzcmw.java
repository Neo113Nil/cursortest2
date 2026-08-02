package com.google.android.gms.internal.ads;

import E2.o;
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
public final class zzcmw implements zzayq {
    private final ScheduledExecutorService zza;
    private final InterfaceC1436a zzb;
    private ScheduledFuture zzc;
    private long zzd = -1;
    private long zze = -1;
    private Runnable zzf = null;
    private boolean zzg = false;

    public zzcmw(ScheduledExecutorService scheduledExecutorService, InterfaceC1436a interfaceC1436a) {
        this.zza = scheduledExecutorService;
        this.zzb = interfaceC1436a;
        o.f1952C.f1960f.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final void zza(boolean z4) {
        if (z4) {
            zzc();
        } else {
            zzb();
        }
    }

    public final synchronized void zzb() {
        try {
            if (this.zzg) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.zze = -1L;
            } else {
                this.zzc.cancel(true);
                long j = this.zzd;
                ((m3.b) this.zzb).getClass();
                this.zze = j - SystemClock.elapsedRealtime();
            }
            this.zzg = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.zzg) {
                if (this.zze > 0 && (scheduledFuture = this.zzc) != null && scheduledFuture.isCancelled()) {
                    this.zzc = this.zza.schedule(this.zzf, this.zze, TimeUnit.MILLISECONDS);
                }
                this.zzg = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(int i7, Runnable runnable) {
        this.zzf = runnable;
        ((m3.b) this.zzb).getClass();
        long j = i7;
        this.zzd = SystemClock.elapsedRealtime() + j;
        this.zzc = this.zza.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
