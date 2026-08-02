package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzgca extends zzgas {
    private I3.b zza;
    private ScheduledFuture zzb;

    private zzgca(I3.b bVar) {
        bVar.getClass();
        this.zza = bVar;
    }

    public static I3.b zzf(I3.b bVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgca zzgcaVar = new zzgca(bVar);
        zzgbx zzgbxVar = new zzgbx(zzgcaVar);
        zzgcaVar.zzb = scheduledExecutorService.schedule(zzgbxVar, j, timeUnit);
        bVar.addListener(zzgbxVar, zzgaq.INSTANCE);
        return zzgcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final String zza() {
        I3.b bVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (bVar == null) {
            return null;
        }
        String h6 = AbstractC0486a1.h("inputFuture=[", bVar.toString(), "]");
        if (scheduledFuture == null) {
            return h6;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return h6;
        }
        return h6 + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
