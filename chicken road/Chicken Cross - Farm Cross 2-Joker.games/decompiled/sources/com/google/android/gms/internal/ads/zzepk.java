package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzepk implements zzhcv {
    final /* synthetic */ zzfld zza;
    final /* synthetic */ zzepl zzb;

    zzepk(zzepl zzeplVar, zzfld zzfldVar) {
        this.zza = zzfldVar;
        Objects.requireNonNull(zzeplVar);
        this.zzb = zzeplVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        zzepl zzeplVar = this.zzb;
        synchronized (zzeplVar) {
            zzepm zzc = zzeplVar.zzc();
            zzfld zzfldVar = this.zza;
            zzc.zzc(th, zzfldVar);
            zzfld zza = zzeplVar.zzc().zza();
            if (zzfldVar.zzav) {
                while (zza != null) {
                    zzeplVar.zzb(zza);
                    zza = zzeplVar.zzc().zza();
                }
            } else if (zza != null) {
                zzeplVar.zzb(zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzepl zzeplVar = this.zzb;
        zzeqc zzeqcVar = (zzeqc) obj;
        synchronized (zzeplVar) {
            zzeplVar.zzc().zzb(zzeqcVar, this.zza);
            zzfld zza = zzeplVar.zzc().zza();
            if (zza != null) {
                zzeplVar.zzb(zza);
            }
        }
    }
}
