package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzabc implements com.google.android.gms.internal.ads.zzaba {
    private final com.google.android.gms.internal.ads.zzaba zza;

    public zzabc(com.google.android.gms.internal.ads.zzaba zzabaVar) {
        this.zza = zzabaVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzabc) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzabc) obj).zza);
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public com.google.android.gms.internal.ads.zzbg zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public com.google.android.gms.internal.ads.zzv zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaba
    public com.google.android.gms.internal.ads.zzv zzc() {
        return this.zza.zzc();
    }

    public final com.google.android.gms.internal.ads.zzaba zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final int zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final int zzf(int i) {
        return this.zza.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final int zzg(int i) {
        return this.zza.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaba
    public final int zzh() {
        return this.zza.zzh();
    }
}
