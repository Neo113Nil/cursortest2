package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzgb implements com.google.android.gms.internal.auth.zzgi {
    private final com.google.android.gms.internal.auth.zzfx zza;
    private final com.google.android.gms.internal.auth.zzgz zzb;
    private final com.google.android.gms.internal.auth.zzem zzc;

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(java.lang.Object obj) {
        return this.zzb.zzb(obj).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final java.lang.Object zzd() {
        com.google.android.gms.internal.auth.zzfx zzfxVar = this.zza;
        return zzfxVar instanceof com.google.android.gms.internal.auth.zzev ? ((com.google.android.gms.internal.auth.zzev) zzfxVar).zzc() : ((com.google.android.gms.internal.auth.zzet) ((com.google.android.gms.internal.auth.zzev) zzfxVar).zzn(5, null, null)).zzd();
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(java.lang.Object obj) {
        this.zzb.zze(obj);
        this.zzc.zzb(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.auth.zzgk.zzd(this.zzb, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(java.lang.Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.auth.zzdt zzdtVar) throws java.io.IOException {
        com.google.android.gms.internal.auth.zzev zzevVar = (com.google.android.gms.internal.auth.zzev) obj;
        if (zzevVar.zzc == com.google.android.gms.internal.auth.zzha.zza()) {
            zzevVar.zzc = com.google.android.gms.internal.auth.zzha.zzd();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(java.lang.Object obj, java.lang.Object obj2) {
        return this.zzb.zzb(obj).equals(this.zzb.zzb(obj2));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(java.lang.Object obj) {
        this.zzc.zza(obj);
        throw null;
    }

    static com.google.android.gms.internal.auth.zzgb zzb(com.google.android.gms.internal.auth.zzgz zzgzVar, com.google.android.gms.internal.auth.zzem zzemVar, com.google.android.gms.internal.auth.zzfx zzfxVar) {
        return new com.google.android.gms.internal.auth.zzgb(zzgzVar, zzemVar, zzfxVar);
    }

    private zzgb(com.google.android.gms.internal.auth.zzgz zzgzVar, com.google.android.gms.internal.auth.zzem zzemVar, com.google.android.gms.internal.auth.zzfx zzfxVar) {
        this.zzb = zzgzVar;
        this.zzc = zzemVar;
        this.zza = zzfxVar;
    }
}
