package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdun implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpq zzb;

    zzdun(com.google.android.gms.internal.ads.zzdux zzduxVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        this.zza = str;
        this.zzb = zzbpqVar;
        java.util.Objects.requireNonNull(zzduxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.zzcku) obj).zzab(this.zza, this.zzb);
    }
}
