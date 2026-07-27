package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzyb extends zzabg {
    private final zzbg zza;

    public zzyb(zzabe zzabeVar, zzbg zzbgVar) {
        super(zzabeVar);
        this.zza = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof zzyb)) {
            return this.zza.equals(((zzyb) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final int hashCode() {
        return (super.hashCode() * 31) + this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzabg, com.google.android.gms.internal.ads.zzabj
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabg, com.google.android.gms.internal.ads.zzabj
    public final zzv zzb(int i) {
        return this.zza.zza(zzd().zzf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzabg, com.google.android.gms.internal.ads.zzabe
    public final zzv zzc() {
        return this.zza.zza(zzd().zzh());
    }
}
