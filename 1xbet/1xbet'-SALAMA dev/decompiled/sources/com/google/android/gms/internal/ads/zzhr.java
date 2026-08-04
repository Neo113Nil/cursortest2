package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzhr {
    public final String zza;
    public final zzz zzb;
    public final zzz zzc;
    public final int zzd;
    public final int zze;

    public zzhr(String str, zzz zzzVar, zzz zzzVar2, int i7, int i8) {
        boolean z4 = true;
        if (i7 != 0) {
            if (i8 == 0) {
                i8 = 0;
            } else {
                z4 = false;
            }
        }
        zzcv.zzd(z4);
        zzcv.zzc(str);
        this.zza = str;
        this.zzb = zzzVar;
        zzzVar2.getClass();
        this.zzc = zzzVar2;
        this.zzd = i7;
        this.zze = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhr.class == obj.getClass()) {
            zzhr zzhrVar = (zzhr) obj;
            if (this.zzd == zzhrVar.zzd && this.zze == zzhrVar.zze && this.zza.equals(zzhrVar.zza) && this.zzb.equals(zzhrVar.zzb) && this.zzc.equals(zzhrVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzd + 527;
        String str = this.zza;
        int iHashCode = str.hashCode() + (((i7 * 31) + this.zze) * 31);
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        return this.zzc.hashCode() + (iHashCode2 * 31);
    }
}
