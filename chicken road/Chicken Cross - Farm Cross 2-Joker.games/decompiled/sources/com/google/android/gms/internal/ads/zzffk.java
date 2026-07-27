package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzffk implements zzfdi {
    final ScheduledExecutorService zza;

    public zzffk(zzbzx zzbzxVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return zzhcy.zzk(zzhcy.zzi(zzhcy.zza(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfm)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzffj.zza, zzcgj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 49;
    }
}
