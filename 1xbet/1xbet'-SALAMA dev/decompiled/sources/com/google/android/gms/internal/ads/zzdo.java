package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzdo {
    public final Object zza;
    private zzt zzb = new zzt();
    private boolean zzc;
    private boolean zzd;

    public zzdo(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdo.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzdo) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i7, zzdm zzdmVar) {
        if (this.zzd) {
            return;
        }
        if (i7 != -1) {
            this.zzb.zza(i7);
        }
        this.zzc = true;
        zzdmVar.zza(this.zza);
    }

    public final void zzb(zzdn zzdnVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzv zzvVarZzb = this.zzb.zzb();
        this.zzb = new zzt();
        this.zzc = false;
        zzdnVar.zza(this.zza, zzvVarZzb);
    }

    public final void zzc(zzdn zzdnVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzdnVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
