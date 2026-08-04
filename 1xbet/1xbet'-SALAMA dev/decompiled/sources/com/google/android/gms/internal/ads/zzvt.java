package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzvt implements zzwk {
    final /* synthetic */ zzvw zza;
    private final int zzb;

    public zzvt(zzvw zzvwVar, int i7) {
        this.zza = zzvwVar;
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final int zza(zzkh zzkhVar, zzhg zzhgVar, int i7) {
        return this.zza.zzh(this.zzb, zzkhVar, zzhgVar, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final int zzb(long j) {
        return this.zza.zzj(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzd() {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final boolean zze() {
        return this.zza.zzQ(this.zzb);
    }
}
