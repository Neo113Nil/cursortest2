package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
final class zzcn extends zzdt {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzee zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcn(zzee zzeeVar, Bundle bundle) {
        super(zzeeVar, true);
        this.zzb = zzeeVar;
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar;
        zzccVar = this.zzb.zzj;
        D.i(zzccVar);
        zzccVar.setConditionalUserProperty(this.zza, this.zzh);
    }
}
