package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbuj implements com.google.android.gms.internal.ads.zzcga {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbto zza;
    final /* synthetic */ java.lang.Object zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbum zzd;

    zzbuj(com.google.android.gms.internal.ads.zzbum zzbumVar, com.google.android.gms.internal.ads.zzbto zzbtoVar, java.lang.Object obj, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        this.zza = zzbtoVar;
        this.zzb = obj;
        this.zzc = zzcfwVar;
        java.util.Objects.requireNonNull(zzbumVar);
        this.zzd = zzbumVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        java.lang.Object obj2 = this.zzb;
        com.google.android.gms.internal.ads.zzcfw zzcfwVar = this.zzc;
        this.zzd.zzc(this.zza, (com.google.android.gms.internal.ads.zzbtv) obj, obj2, zzcfwVar);
    }
}
