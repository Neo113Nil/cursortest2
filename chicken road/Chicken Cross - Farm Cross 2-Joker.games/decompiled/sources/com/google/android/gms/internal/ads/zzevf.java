package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzevf implements zzfdi {
    private final Clock zza;
    private final zzflw zzb;
    private final long zzc;

    zzevf(Clock clock, zzflw zzflwVar, long j) {
        this.zza = clock;
        this.zzb = zzflwVar;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return zzhcy.zza(new zzevg(this.zzb, this.zza.currentTimeMillis(), this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 4;
    }
}
