package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.D;
import o3.BinderC1507b;

/* loaded from: classes.dex */
final class zzdg extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzee zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzee zzeeVar, boolean z4, int i7, String str, Object obj, Object obj2, Object obj3) {
        super(zzeeVar, false);
        this.zzc = zzeeVar;
        this.zza = str;
        this.zzb = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar;
        zzccVar = this.zzc.zzj;
        D.i(zzccVar);
        zzccVar.logHealthData(5, this.zza, new BinderC1507b(this.zzb), new BinderC1507b(null), new BinderC1507b(null));
    }
}
