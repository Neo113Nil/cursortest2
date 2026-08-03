package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzxx extends com.google.android.gms.internal.ads.zzabc {
    private final com.google.android.gms.internal.ads.zzbg zza;

    public zzxx(com.google.android.gms.internal.ads.zzaba zzabaVar, com.google.android.gms.internal.ads.zzbg zzbgVar) {
        super(zzabaVar);
        this.zza = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final boolean equals(java.lang.Object obj) {
        if (super.equals(obj) && (obj instanceof com.google.android.gms.internal.ads.zzxx)) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzxx) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final int hashCode() {
        return (super.hashCode() * 31) + this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzabc, com.google.android.gms.internal.ads.zzabf
    public final com.google.android.gms.internal.ads.zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabc, com.google.android.gms.internal.ads.zzabf
    public final com.google.android.gms.internal.ads.zzv zzb(int i) {
        return this.zza.zza(zzd().zzf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzabc, com.google.android.gms.internal.ads.zzaba
    public final com.google.android.gms.internal.ads.zzv zzc() {
        return this.zza.zza(zzd().zzh());
    }
}
