package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzgbr extends zzgaw implements zzgbm {
    private final ScheduledFuture zza;

    public zzgbr(I3.b bVar, ScheduledFuture scheduledFuture) {
        super(bVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgav, java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        boolean cancel = zzb().cancel(z4);
        if (cancel) {
            this.zza.cancel(z4);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
