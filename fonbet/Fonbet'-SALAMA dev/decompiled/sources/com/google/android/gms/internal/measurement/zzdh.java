package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
final class zzdh extends zzdt {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzbz zzb;
    final /* synthetic */ zzee zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzee zzeeVar, Bundle bundle, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.zzc = zzeeVar;
        this.zza = bundle;
        this.zzb = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar;
        zzccVar = this.zzc.zzj;
        D.i(zzccVar);
        zzccVar.performAction(this.zza, this.zzb, this.zzh);
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zzb() {
        this.zzb.zzd(null);
    }
}
