package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzafv implements zzau {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzafv(int i7, String str, String str2, String str3, boolean z4, int i8) {
        boolean z7 = true;
        if (i8 != -1 && i8 <= 0) {
            z7 = false;
        }
        zzcv.zzd(z7);
        this.zza = i7;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z4;
        this.zzf = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafv.class == obj.getClass()) {
            zzafv zzafvVar = (zzafv) obj;
            if (this.zza == zzafvVar.zza) {
                String str = this.zzb;
                String str2 = zzafvVar.zzb;
                int i7 = zzen.zza;
                if (Objects.equals(str, str2) && Objects.equals(this.zzc, zzafvVar.zzc) && Objects.equals(this.zzd, zzafvVar.zzd) && this.zze == zzafvVar.zze && this.zzf == zzafvVar.zzf) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int hashCode = str != null ? str.hashCode() : 0;
        int i7 = this.zza;
        String str2 = this.zzc;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i8 = ((i7 + 527) * 31) + hashCode;
        String str3 = this.zzd;
        return (((((((i8 * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        String str = this.zzc;
        if (str != null) {
            zzarVar.zzq(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzarVar.zzj(str2);
        }
    }
}
