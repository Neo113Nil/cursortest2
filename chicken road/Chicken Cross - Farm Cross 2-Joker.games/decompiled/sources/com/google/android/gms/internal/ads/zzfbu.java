package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfbu implements zzfdi {
    private final zzfdi zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzfbu(zzfdi zzfdiVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfdiVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        ListenableFuture zza = this.zza.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdj)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            zza = zzhcy.zzi(zza, j, timeUnit, this.zzc);
        }
        return zzhcy.zzh(zza, Throwable.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzfbt
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfbu.this.zzc((Throwable) obj);
            }
        }, zzcgj.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return this.zza.zzb();
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdh)).booleanValue()) {
            zzfdi zzfdiVar = this.zza;
            zzcfv zzh = com.google.android.gms.ads.internal.zzt.zzh();
            int zzb = zzfdiVar.zzb();
            StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 22);
            sb.append("OptionalSignalTimeout:");
            sb.append(zzb);
            zzh.zzh(th, sb.toString());
        }
        return zzhcy.zza(null);
    }
}
