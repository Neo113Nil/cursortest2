package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.D;

/* JADX INFO: loaded from: classes.dex */
final class zzdp extends zzdt {
    final /* synthetic */ zzdv zza;
    final /* synthetic */ zzee zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzee zzeeVar, zzdv zzdvVar) {
        super(zzeeVar, true);
        this.zzb = zzeeVar;
        this.zza = zzdvVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar = this.zzb.zzj;
        D.i(zzccVar);
        zzccVar.registerOnMeasurementEventListener(this.zza);
    }
}
