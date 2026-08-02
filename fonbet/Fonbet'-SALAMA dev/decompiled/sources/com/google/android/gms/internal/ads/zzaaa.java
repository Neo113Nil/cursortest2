package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaaa implements zzabm {
    final /* synthetic */ zzso zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzaae zzd;

    public zzaaa(zzaae zzaaeVar, zzso zzsoVar, int i7, long j) {
        this.zza = zzsoVar;
        this.zzb = i7;
        this.zzc = j;
        this.zzd = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zza(long j) {
        this.zzd.zzah(this.zza, this.zzb, this.zzc, j);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzb() {
        this.zzd.zzai(this.zza, this.zzb, this.zzc);
    }
}
