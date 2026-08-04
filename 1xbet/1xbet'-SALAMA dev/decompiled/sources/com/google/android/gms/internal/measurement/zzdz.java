package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.D;
import p105o3.b;

/* JADX INFO: loaded from: classes.dex */
final class zzdz extends zzdt {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzed zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdz(zzed zzedVar, Activity activity) {
        super(zzedVar.zza, true);
        this.zzb = zzedVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar = this.zzb.zza.zzj;
        D.i(zzccVar);
        zzccVar.onActivityPaused(new b(this.zza), this.zzi);
    }
}
