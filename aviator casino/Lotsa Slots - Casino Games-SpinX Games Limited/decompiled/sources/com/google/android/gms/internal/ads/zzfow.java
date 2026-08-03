package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfow implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfor zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpb zzb;

    zzfow(com.google.android.gms.internal.ads.zzfpb zzfpbVar, com.google.android.gms.internal.ads.zzfor zzforVar) {
        this.zza = zzforVar;
        java.util.Objects.requireNonNull(zzfpbVar);
        this.zzb = zzfpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        this.zzb.zza.zzg().zzc(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(java.lang.Object obj) {
        this.zzb.zza.zzg().zzd(this.zza);
    }
}
