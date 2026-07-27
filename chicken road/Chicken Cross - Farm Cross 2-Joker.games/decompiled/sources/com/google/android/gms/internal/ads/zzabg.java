package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class zzabg implements zzabe {
    private final zzabe zza;

    public zzabg(zzabe zzabeVar) {
        this.zza = zzabeVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzabg) {
            return this.zza.equals(((zzabg) obj).zza);
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public zzbg zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public zzv zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public zzv zzc() {
        return this.zza.zzc();
    }

    public final zzabe zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final int zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final int zzf(int i) {
        return this.zza.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final int zzg(int i) {
        return this.zza.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final int zzh() {
        return this.zza.zzh();
    }
}
