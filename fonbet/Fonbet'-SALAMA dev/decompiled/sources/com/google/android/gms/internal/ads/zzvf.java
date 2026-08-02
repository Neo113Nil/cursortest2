package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzvf implements zzyh {
    private final zzyh zza;
    private final zzbo zzb;

    public zzvf(zzyh zzyhVar, zzbo zzboVar) {
        this.zza = zzyhVar;
        this.zzb = zzboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvf)) {
            return false;
        }
        zzvf zzvfVar = (zzvf) obj;
        return this.zza.equals(zzvfVar.zza) && this.zzb.equals(zzvfVar.zzb);
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() + 527;
        return this.zza.hashCode() + (hashCode * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzyl
    public final int zza(int i7) {
        return this.zza.zza(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzyl
    public final int zzc(int i7) {
        return this.zza.zzc(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzyl
    public final int zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzyl
    public final zzz zze(int i7) {
        return this.zzb.zzb(this.zza.zza(i7));
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzz zzf() {
        return this.zzb.zzb(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzyl
    public final zzbo zzg() {
        return this.zzb;
    }
}
