package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzhdo extends zzhdk implements zzhdj {
    final ScheduledExecutorService zza;

    zzhdo(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzhdj, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzd */
    public final zzhdh schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzhdx zze = zzhdx.zze(runnable, null);
        return new zzhdm(zze, scheduledExecutorService.schedule(zze, j, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhdj, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zze */
    public final zzhdh schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzhdx zzhdxVar = new zzhdx(callable);
        return new zzhdm(zzhdxVar, this.zza.schedule(zzhdxVar, j, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhdj, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzf */
    public final zzhdh scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzhdn zzhdnVar = new zzhdn(runnable);
        return new zzhdm(zzhdnVar, this.zza.scheduleAtFixedRate(zzhdnVar, j, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhdj, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzg */
    public final zzhdh scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzhdn zzhdnVar = new zzhdn(runnable);
        return new zzhdm(zzhdnVar, this.zza.scheduleWithFixedDelay(zzhdnVar, j, j2, timeUnit));
    }
}
