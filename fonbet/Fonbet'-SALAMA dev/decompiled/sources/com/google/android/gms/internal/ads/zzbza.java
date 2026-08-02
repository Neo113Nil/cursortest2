package com.google.android.gms.internal.ads;

import F2.C0254t;
import com.google.android.gms.common.api.f;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzbza {
    public static final zzgbn zza;
    public static final zzgbn zzb;
    public static final zzgbn zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgbo zze;
    public static final zzgbn zzf;
    public static final zzgbn zzg;

    static {
        ThreadPoolExecutor threadPoolExecutor;
        zzbbp zzbbpVar = zzbby.zzlm;
        C0254t c0254t = C0254t.f2723d;
        if (c0254t.f2726c.zzc(zzbbpVar) != null && ((Boolean) c0254t.f2726c.zzc(zzbbpVar)).booleanValue()) {
            zzbbp zzbbpVar2 = zzbby.zzln;
            if (c0254t.f2726c.zzc(zzbbpVar2) != null) {
                zzbbp zzbbpVar3 = zzbby.zzlo;
                if (c0254t.f2726c.zzc(zzbbpVar3) != null) {
                    threadPoolExecutor = new ThreadPoolExecutor(((Integer) c0254t.f2726c.zzc(zzbbpVar2)).intValue(), ((Integer) c0254t.f2726c.zzc(zzbbpVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbyw("Default"));
                    threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) c0254t.f2726c.zzc(zzbbpVar3)).booleanValue());
                    zza = new zzbyy(threadPoolExecutor, null);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new zzbyw("Loader"));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    zzb = new zzbyy(threadPoolExecutor2, null);
                    ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new zzbyw("Activeview"));
                    threadPoolExecutor3.allowCoreThreadTimeOut(true);
                    zzc = new zzbyy(threadPoolExecutor3, null);
                    zzbyv zzbyvVar = new zzbyv(3, new zzbyw("Schedule"));
                    zzd = zzbyvVar;
                    zze = zzgbu.zzb(zzbyvVar);
                    zzf = new zzbyy(new zzbyx(), null);
                    zzg = new zzbyy(zzgbu.zzc(), null);
                }
            }
        }
        threadPoolExecutor = new ThreadPoolExecutor(2, f.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbyw("Default"));
        zza = new zzbyy(threadPoolExecutor, null);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor22 = new ThreadPoolExecutor(5, 5, 10L, timeUnit2, new LinkedBlockingQueue(), new zzbyw("Loader"));
        threadPoolExecutor22.allowCoreThreadTimeOut(true);
        zzb = new zzbyy(threadPoolExecutor22, null);
        ThreadPoolExecutor threadPoolExecutor32 = new ThreadPoolExecutor(1, 1, 10L, timeUnit2, new LinkedBlockingQueue(), new zzbyw("Activeview"));
        threadPoolExecutor32.allowCoreThreadTimeOut(true);
        zzc = new zzbyy(threadPoolExecutor32, null);
        zzbyv zzbyvVar2 = new zzbyv(3, new zzbyw("Schedule"));
        zzd = zzbyvVar2;
        zze = zzgbu.zzb(zzbyvVar2);
        zzf = new zzbyy(new zzbyx(), null);
        zzg = new zzbyy(zzgbu.zzc(), null);
    }
}
