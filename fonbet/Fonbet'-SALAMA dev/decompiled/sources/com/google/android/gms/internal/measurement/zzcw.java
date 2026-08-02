package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
final class zzcw extends zzdt {
    final /* synthetic */ long zza;
    final /* synthetic */ zzee zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzee zzeeVar, long j) {
        super(zzeeVar, true);
        this.zzb = zzeeVar;
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar;
        zzccVar = this.zzb.zzj;
        D.i(zzccVar);
        zzccVar.setSessionTimeoutDuration(this.zza);
    }
}
