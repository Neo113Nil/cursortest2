package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzdqc implements zzhcv {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdqm zzb;

    zzdqc(zzdqm zzdqmVar, String str, boolean z) {
        Objects.requireNonNull(zzdqmVar);
        this.zzb = zzdqmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgy)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdqm zzdqmVar = this.zzb;
        zzdqmVar.zzZ().zzo((zzclm) obj);
        String str = this.zza;
        zzcgo zzY = zzdqmVar.zzZ().zzY();
        zzeml zzL = zzdqmVar.zzL(str, true);
        if (zzL != null && zzY != null) {
            zzY.zzc(zzL);
        } else if (zzY != null) {
            zzY.cancel(false);
        }
    }
}
