package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzend implements com.google.android.gms.internal.ads.zzdno {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfkf zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzenf zzc;

    zzend(com.google.android.gms.internal.ads.zzenf zzenfVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        this.zza = zzcfwVar;
        this.zzb = zzfkfVar;
        java.util.Objects.requireNonNull(zzenfVar);
        this.zzc = zzenfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzdde zzddeVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzb();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, (com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zzd());
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final com.google.android.gms.internal.ads.zzfkf zzb() {
        return this.zzb;
    }
}
