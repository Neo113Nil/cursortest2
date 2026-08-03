package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcyd implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzhbt zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcyi zzb;

    zzcyd(com.google.android.gms.internal.ads.zzcyi zzcyiVar, com.google.android.gms.internal.ads.zzhbt zzhbtVar) {
        this.zza = zzhbtVar;
        java.util.Objects.requireNonNull(zzcyiVar);
        this.zzb = zzcyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        this.zzb.zzf();
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        this.zzb.zzf();
        this.zza.zzb((com.google.android.gms.internal.ads.zzcxt) obj);
    }
}
