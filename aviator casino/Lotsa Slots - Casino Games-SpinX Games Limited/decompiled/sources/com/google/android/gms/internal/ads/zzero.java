package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzero implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdma zza;

    zzero(com.google.android.gms.internal.ads.zzerp zzerpVar, com.google.android.gms.internal.ads.zzdma zzdmaVar) {
        this.zza = zzdmaVar;
        java.util.Objects.requireNonNull(zzerpVar);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(android.view.View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        com.google.android.gms.internal.ads.zzdma zzdmaVar = this.zza;
        zzdmaVar.zzd().zza();
        zzdmaVar.zze().zza();
    }
}
