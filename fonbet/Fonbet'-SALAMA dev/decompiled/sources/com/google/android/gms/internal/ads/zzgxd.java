package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgxd implements zzgwu {
    final int zza;
    final zzhaj zzb;
    final boolean zzc;
    final boolean zzd;

    public zzgxd(zzgxl zzgxlVar, int i7, zzhaj zzhajVar, boolean z4, boolean z7) {
        this.zza = i7;
        this.zzb = zzhajVar;
        this.zzc = z4;
        this.zzd = z7;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzgxd) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwu
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwu
    public final zzhaj zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwu
    public final zzhak zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgwu
    public final boolean zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgwu
    public final boolean zze() {
        return this.zzc;
    }
}
