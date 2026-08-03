package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzre {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd = false;
    public final int zze;
    public final com.google.android.gms.internal.ads.zzd zzf;
    public final int zzg;
    public final int zzh;

    /* synthetic */ zzre(com.google.android.gms.internal.ads.zzrd zzrdVar, byte[] bArr) {
        this.zza = zzrdVar.zzi();
        this.zzb = zzrdVar.zzj();
        this.zzc = zzrdVar.zzk();
        this.zze = zzrdVar.zzl();
        this.zzf = zzrdVar.zzm();
        this.zzg = zzrdVar.zzn();
        this.zzh = zzrdVar.zzo();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzre zzreVar = (com.google.android.gms.internal.ads.zzre) obj;
            if (this.zza == zzreVar.zza && this.zzb == zzreVar.zzb && this.zzc == zzreVar.zzc && this.zze == zzreVar.zze && this.zzg == zzreVar.zzg && this.zzh == zzreVar.zzh && this.zzf.equals(zzreVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), false, false, java.lang.Integer.valueOf(this.zze), this.zzf, java.lang.Integer.valueOf(this.zzg), java.lang.Integer.valueOf(this.zzh), false, false);
    }
}
