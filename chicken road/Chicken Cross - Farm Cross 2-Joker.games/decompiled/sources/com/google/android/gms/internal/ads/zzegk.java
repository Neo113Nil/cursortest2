package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzegk implements zzhcv {
    final /* synthetic */ zzegq zza;

    zzegk(zzegq zzegqVar) {
        Objects.requireNonNull(zzegqVar);
        this.zza = zzegqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzflo zzfloVar = (zzflo) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcX)).booleanValue()) {
            this.zza.zzf().zzdQ(zzfloVar);
        }
    }
}
