package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzctp implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzctv zzb;

    zzctp(com.google.android.gms.internal.ads.zzctv zzctvVar, java.lang.String str) {
        this.zza = str;
        java.util.Objects.requireNonNull(zzctvVar);
        this.zzb = zzctvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzctv zzctvVar = this.zzb;
        zzctvVar.zzu().zza(zzctvVar.zzt().zzb(zzctvVar.zzr(), zzctvVar.zzs(), false, this.zza, null, zzctvVar.zzp(), zzctvVar.zzw(), zzctvVar.zzx()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.lang.String str = this.zza;
        java.lang.String str2 = (java.lang.String) obj;
        com.google.android.gms.internal.ads.zzctv zzctvVar = this.zzb;
        zzctvVar.zzu().zza(zzctvVar.zzt().zzb(zzctvVar.zzr(), zzctvVar.zzs(), false, str, str2, zzctvVar.zzp(), zzctvVar.zzw(), zzctvVar.zzx()), zzctvVar.zzv());
    }
}
