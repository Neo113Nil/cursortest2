package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.D;
import o3.BinderC1507b;

/* loaded from: classes.dex */
final class zzdy extends zzdt {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzed zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(zzed zzedVar, Activity activity) {
        super(zzedVar.zza, true);
        this.zzb = zzedVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar;
        zzccVar = this.zzb.zza.zzj;
        D.i(zzccVar);
        zzccVar.onActivityResumed(new BinderC1507b(this.zza), this.zzi);
    }
}
