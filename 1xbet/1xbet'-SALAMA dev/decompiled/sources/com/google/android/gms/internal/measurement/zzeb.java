package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.D;
import p105o3.b;

/* JADX INFO: loaded from: classes.dex */
final class zzeb extends zzdt {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzbz zzb;
    final /* synthetic */ zzed zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzed zzedVar, Activity activity, zzbz zzbzVar) {
        super(zzedVar.zza, true);
        this.zzc = zzedVar;
        this.zza = activity;
        this.zzb = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar = this.zzc.zza.zzj;
        D.i(zzccVar);
        zzccVar.onActivitySaveInstanceState(new b(this.zza), this.zzb, this.zzi);
    }
}
