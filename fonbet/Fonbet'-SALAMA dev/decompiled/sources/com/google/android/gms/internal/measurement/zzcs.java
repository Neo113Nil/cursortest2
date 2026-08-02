package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
final class zzcs extends zzdt {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzee zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(zzee zzeeVar, Boolean bool) {
        super(zzeeVar, true);
        this.zzb = zzeeVar;
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar;
        zzcc zzccVar2;
        if (this.zza != null) {
            zzccVar2 = this.zzb.zzj;
            D.i(zzccVar2);
            zzccVar2.setMeasurementEnabled(this.zza.booleanValue(), this.zzh);
        } else {
            zzccVar = this.zzb.zzj;
            D.i(zzccVar);
            zzccVar.clearMeasurementEnabled(this.zzh);
        }
    }
}
