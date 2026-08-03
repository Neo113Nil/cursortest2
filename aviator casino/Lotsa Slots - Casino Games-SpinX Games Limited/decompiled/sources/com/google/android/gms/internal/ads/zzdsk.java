package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdsk implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdyu zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdsn zzb;

    zzdsk(com.google.android.gms.internal.ads.zzdsn zzdsnVar, com.google.android.gms.internal.ads.zzdyu zzdyuVar) {
        this.zza = zzdyuVar;
        java.util.Objects.requireNonNull(zzdsnVar);
        this.zzb = zzdsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(java.lang.Object obj) {
        this.zzb.zzd().zzf(this.zza.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
    }
}
