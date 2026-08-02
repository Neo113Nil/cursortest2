package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
final class zzdl extends zzdt {
    final /* synthetic */ zzbz zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzee zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzee zzeeVar, zzbz zzbzVar, int i7) {
        super(zzeeVar, true);
        this.zzc = zzeeVar;
        this.zza = zzbzVar;
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar;
        zzccVar = this.zzc.zzj;
        D.i(zzccVar);
        zzccVar.getTestFlag(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zzb() {
        this.zza.zzd(null);
    }
}
