package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgrg implements zzhcv {
    final /* synthetic */ zzgrf zza;

    zzgrg(zzgrh zzgrhVar, zzgrf zzgrfVar) {
        this.zza = zzgrfVar;
        Objects.requireNonNull(zzgrhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        zzgrf zzgrfVar = this.zza;
        zzgrfVar.zzb(th);
        zzgrfVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zzb(Object obj) {
        this.zza.zzc();
    }
}
