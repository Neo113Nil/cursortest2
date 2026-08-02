package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
final class zzdm extends zzdt {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzee zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdm(zzee zzeeVar, boolean z4) {
        super(zzeeVar, true);
        this.zzb = zzeeVar;
        this.zza = z4;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar;
        zzccVar = this.zzb.zzj;
        D.i(zzccVar);
        zzccVar.setDataCollectionEnabled(this.zza);
    }
}
