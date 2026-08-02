package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzgbc extends zzgbe {
    public static zzgba zza(Iterable iterable) {
        return new zzgba(false, zzfwh.zzk(iterable), null);
    }

    public static zzgba zzb(Iterable iterable) {
        return new zzgba(true, zzfwh.zzk(iterable), null);
    }

    @SafeVarargs
    public static zzgba zzc(I3.b... bVarArr) {
        return new zzgba(true, zzfwh.zzm(bVarArr), null);
    }

    public static I3.b zzd(Iterable iterable) {
        return new zzgak(zzfwh.zzk(iterable), true);
    }

    public static I3.b zze(I3.b bVar, Class cls, zzfsw zzfswVar, Executor executor) {
        int i7 = zzfzq.zzd;
        zzfzp zzfzpVar = new zzfzp(bVar, cls, zzfswVar);
        bVar.addListener(zzfzpVar, zzgbu.zzd(executor, zzfzpVar));
        return zzfzpVar;
    }

    public static I3.b zzf(I3.b bVar, Class cls, zzgaj zzgajVar, Executor executor) {
        int i7 = zzfzq.zzd;
        zzfzo zzfzoVar = new zzfzo(bVar, cls, zzgajVar);
        bVar.addListener(zzfzoVar, zzgbu.zzd(executor, zzfzoVar));
        return zzfzoVar;
    }

    public static I3.b zzg(Throwable th) {
        th.getClass();
        return new zzgbf(th);
    }

    public static I3.b zzh(Object obj) {
        return obj == null ? zzgbg.zza : new zzgbg(obj);
    }

    public static I3.b zzi() {
        return zzgbg.zza;
    }

    public static I3.b zzj(Callable callable, Executor executor) {
        zzgcd zzgcdVar = new zzgcd(callable);
        executor.execute(zzgcdVar);
        return zzgcdVar;
    }

    public static I3.b zzk(zzgai zzgaiVar, Executor executor) {
        zzgcd zzgcdVar = new zzgcd(zzgaiVar);
        executor.execute(zzgcdVar);
        return zzgcdVar;
    }

    @SafeVarargs
    public static I3.b zzl(I3.b... bVarArr) {
        return new zzgak(zzfwh.zzm(bVarArr), false);
    }

    public static I3.b zzm(I3.b bVar, zzfsw zzfswVar, Executor executor) {
        int i7 = zzfzz.zzc;
        zzfzy zzfzyVar = new zzfzy(bVar, zzfswVar);
        bVar.addListener(zzfzyVar, zzgbu.zzd(executor, zzfzyVar));
        return zzfzyVar;
    }

    public static I3.b zzn(I3.b bVar, zzgaj zzgajVar, Executor executor) {
        int i7 = zzfzz.zzc;
        zzfzx zzfzxVar = new zzfzx(bVar, zzgajVar);
        bVar.addListener(zzfzxVar, zzgbu.zzd(executor, zzfzxVar));
        return zzfzxVar;
    }

    public static I3.b zzo(I3.b bVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return bVar.isDone() ? bVar : zzgca.zzf(bVar, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) {
        if (future.isDone()) {
            return zzgcf.zza(future);
        }
        throw new IllegalStateException(zzfty.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgcf.zza(future);
        } catch (ExecutionException e7) {
            if (e7.getCause() instanceof Error) {
                throw new zzgar((Error) e7.getCause());
            }
            throw new zzgce(e7.getCause());
        }
    }

    public static void zzr(I3.b bVar, zzgay zzgayVar, Executor executor) {
        zzgayVar.getClass();
        bVar.addListener(new zzgaz(bVar, zzgayVar), executor);
    }
}
