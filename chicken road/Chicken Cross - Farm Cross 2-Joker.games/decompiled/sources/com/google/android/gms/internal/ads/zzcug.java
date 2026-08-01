package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcug implements zzhcv {
    final /* synthetic */ zzcun zza;

    zzcug(zzcun zzcunVar) {
        Objects.requireNonNull(zzcunVar);
        this.zza = zzcunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcun zzcunVar = this.zza;
        zzcunVar.zzu().zzb(zzcunVar.zzt().zzb(zzcunVar.zzr(), zzcunVar.zzs(), false, "", (String) obj, zzcunVar.zzs().zzc, null, null), true == com.google.android.gms.ads.internal.zzt.zzh().zzt(zzcunVar.zzq()) ? 2 : 1);
    }
}
