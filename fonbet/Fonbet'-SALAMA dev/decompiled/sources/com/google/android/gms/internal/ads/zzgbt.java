package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzgbt extends zzgbq implements zzgbo {
    final ScheduledExecutorService zza;

    public zzgbt(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzgcd zze = zzgcd.zze(runnable, null);
        return new zzgbr(zze, scheduledExecutorService.schedule(zze, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j3, TimeUnit timeUnit) {
        zzgbs zzgbsVar = new zzgbs(runnable);
        return new zzgbr(zzgbsVar, this.zza.scheduleAtFixedRate(zzgbsVar, j, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j3, TimeUnit timeUnit) {
        zzgbs zzgbsVar = new zzgbs(runnable);
        return new zzgbr(zzgbsVar, this.zza.scheduleWithFixedDelay(zzgbsVar, j, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzgbm schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzgcd zzgcdVar = new zzgcd(callable);
        return new zzgbr(zzgcdVar, this.zza.schedule(zzgcdVar, j, timeUnit));
    }
}
