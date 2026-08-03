package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzere implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfkq zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfkf zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzerl zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzerg zze;

    zzere(com.google.android.gms.internal.ads.zzerg zzergVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar, com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzerl zzerlVar) {
        this.zza = zzcfwVar;
        this.zzb = zzfkqVar;
        this.zzc = zzfkfVar;
        this.zzd = zzerlVar;
        java.util.Objects.requireNonNull(zzergVar);
        this.zze = zzergVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(android.view.View view) {
        com.google.android.gms.internal.ads.zzerl zzerlVar = this.zzd;
        this.zza.zzc(this.zze.zzd().zza(this.zzb, this.zzc, view, zzerlVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
