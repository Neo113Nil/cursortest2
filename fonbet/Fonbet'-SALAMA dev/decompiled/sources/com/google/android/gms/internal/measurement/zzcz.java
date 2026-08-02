package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
final class zzcz extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ zzee zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzee zzeeVar, String str) {
        super(zzeeVar, true);
        this.zzb = zzeeVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar;
        zzccVar = this.zzb.zzj;
        D.i(zzccVar);
        zzccVar.endAdUnitExposure(this.zza, this.zzi);
    }
}
