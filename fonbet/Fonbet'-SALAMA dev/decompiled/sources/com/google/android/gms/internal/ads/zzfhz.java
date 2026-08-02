package com.google.android.gms.internal.ads;

import J2.m;

/* loaded from: classes.dex */
final class zzfhz implements zzgay {
    final /* synthetic */ zzffn zza;
    final /* synthetic */ zzffy zzb;
    final /* synthetic */ zzfia zzc;

    public zzfhz(zzfia zzfiaVar, zzffn zzffnVar, zzffy zzffyVar) {
        this.zza = zzffnVar;
        this.zzb = zzffyVar;
        this.zzc = zzfiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        zzfgb zzfgbVar;
        this.zza.zzg(false);
        zzffy zzffyVar = this.zzb;
        if (zzffyVar != null) {
            zzffyVar.zza(this.zza);
            zzffyVar.zzh();
        } else {
            zzfia zzfiaVar = this.zzc;
            zzffn zzffnVar = this.zza;
            zzfgbVar = zzfiaVar.zzf;
            zzfgbVar.zzc(zzffnVar.zzm());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfgb zzfgbVar;
        this.zza.zzg(((m) obj) == m.f3827a);
        zzffy zzffyVar = this.zzb;
        if (zzffyVar != null) {
            zzffyVar.zza(this.zza);
            zzffyVar.zzh();
        } else {
            zzfia zzfiaVar = this.zzc;
            zzffn zzffnVar = this.zza;
            zzfgbVar = zzfiaVar.zzf;
            zzfgbVar.zzc(zzffnVar.zzm());
        }
    }
}
