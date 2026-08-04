package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.D;

/* JADX INFO: loaded from: classes.dex */
final class zzdf extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzbz zzd;
    final /* synthetic */ zzee zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdf(zzee zzeeVar, String str, String str2, boolean z4, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.zze = zzeeVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z4;
        this.zzd = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar = this.zze.zzj;
        D.i(zzccVar);
        zzccVar.getUserProperties(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zzb() {
        this.zzd.zzd(null);
    }
}
