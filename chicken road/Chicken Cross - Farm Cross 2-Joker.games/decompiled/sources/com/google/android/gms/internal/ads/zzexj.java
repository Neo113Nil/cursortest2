package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzexj implements zzfdi {
    private final zzflw zza;

    zzexj(zzflw zzflwVar) {
        this.zza = zzflwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return zzhcy.zza(new zzexk(this.zza.zzq));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 58;
    }
}
