package com.google.android.gms.internal.ads;

import androidx.webkit.Profile;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcgj {
    public static final zzhdi zza;
    public static final zzhdi zzb;
    public static final zzhdi zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzhdj zze;
    public static final zzhdi zzf;
    public static final ExecutorService zzg;
    public static final zzhdi zzh;

    static {
        Executor executor;
        Executor executor2;
        Executor executor3;
        if (ClientLibraryUtils.isPackageSide()) {
            zzgbo.zza();
            executor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcgg(Profile.DEFAULT_PROFILE_NAME)));
        } else {
            if (com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbjg.zzmT) != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbjg.zzmT)).booleanValue()) {
                    if (com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbjg.zzmU) != null) {
                        if (com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbjg.zzmV) != null) {
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbjg.zzmU)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbjg.zzmU)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcgg(Profile.DEFAULT_PROFILE_NAME));
                            threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zze(zzbjg.zzmV)).booleanValue());
                            executor = threadPoolExecutor;
                        }
                    }
                }
            }
            executor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcgg(Profile.DEFAULT_PROFILE_NAME));
        }
        zza = new zzcgi(executor, null);
        if (ClientLibraryUtils.isPackageSide()) {
            executor2 = zzgbo.zza().zzb(5, new zzcgg("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcgg("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executor2 = threadPoolExecutor2;
        }
        zzb = new zzcgi(executor2, null);
        if (ClientLibraryUtils.isPackageSide()) {
            executor3 = zzgbo.zza().zzd(new zzcgg("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcgg("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executor3 = threadPoolExecutor3;
        }
        zzc = new zzcgi(executor3, null);
        zzcgf zzcgfVar = new zzcgf(3, new zzcgg(AppEventsConstants.EVENT_NAME_SCHEDULE));
        zzd = zzcgfVar;
        zze = zzhdp.zzc(zzcgfVar);
        zzf = new zzcgi(new zzcgh(), null);
        zzg = Executors.newSingleThreadExecutor(new zzcgg("AdQualityMetrics"));
        zzh = new zzcgi(zzhdp.zza(), null);
    }
}
