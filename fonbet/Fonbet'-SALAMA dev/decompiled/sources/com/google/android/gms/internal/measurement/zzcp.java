package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
final class zzcp extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbz zzc;
    final /* synthetic */ zzee zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcp(zzee zzeeVar, String str, String str2, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.zzd = zzeeVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar;
        zzccVar = this.zzd.zzj;
        D.i(zzccVar);
        zzccVar.getConditionalUserProperties(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zzb() {
        this.zzc.zzd(null);
    }
}
