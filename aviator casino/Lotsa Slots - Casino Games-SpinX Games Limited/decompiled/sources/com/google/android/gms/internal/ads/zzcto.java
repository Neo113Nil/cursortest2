package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcto implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzctv zza;

    zzcto(com.google.android.gms.internal.ads.zzctv zzctvVar) {
        java.util.Objects.requireNonNull(zzctvVar);
        this.zza = zzctvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzctv zzctvVar = this.zza;
        zzctvVar.zzu().zzb(zzctvVar.zzt().zzb(zzctvVar.zzr(), zzctvVar.zzs(), false, "", (java.lang.String) obj, zzctvVar.zzs().zzc, null, null), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(zzctvVar.zzq()) ? 2 : 1);
    }
}
