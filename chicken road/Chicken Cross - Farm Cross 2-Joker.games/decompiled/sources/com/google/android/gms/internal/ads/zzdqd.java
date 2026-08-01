package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzdqd implements zzhcv {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdqm zzb;

    zzdqd(zzdqm zzdqmVar, View view) {
        this.zza = view;
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
        this.zzb.zzY(this.zza, (zzeml) obj);
    }
}
