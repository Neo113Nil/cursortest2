package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.D;
import o3.BinderC1507b;

/* loaded from: classes.dex */
final class zzds extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzee zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzee zzeeVar, String str, String str2, Object obj, boolean z4) {
        super(zzeeVar, true);
        this.zze = zzeeVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = z4;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar;
        zzccVar = this.zze.zzj;
        D.i(zzccVar);
        zzccVar.setUserProperty(this.zza, this.zzb, new BinderC1507b(this.zzc), this.zzd, this.zzh);
    }
}
