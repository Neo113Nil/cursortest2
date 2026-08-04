package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.D;

/* JADX INFO: loaded from: classes.dex */
final class zzcy extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ zzee zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzee zzeeVar, String str) {
        super(zzeeVar, true);
        this.zzb = zzeeVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar = this.zzb.zzj;
        D.i(zzccVar);
        zzccVar.beginAdUnitExposure(this.zza, this.zzi);
    }
}
