package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzba {
    public final java.lang.Object zza;
    public final int zzb;
    public final com.google.android.gms.internal.ads.zzak zzc;
    public final java.lang.Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
        java.lang.Integer.toString(6, 36);
    }

    public zzba(java.lang.Object obj, int i, com.google.android.gms.internal.ads.zzak zzakVar, java.lang.Object obj2, int i2, long j, long j2, int i3, int i4) {
        com.google.android.gms.internal.ads.zzgtj.zza(i >= 0);
        com.google.android.gms.internal.ads.zzgtj.zza(i2 >= 0);
        this.zza = obj;
        this.zzb = i;
        this.zzc = zzakVar;
        this.zzd = obj2;
        this.zze = i2;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = i3;
        this.zzi = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzba zzbaVar = (com.google.android.gms.internal.ads.zzba) obj;
            if (this.zzb == zzbaVar.zzb && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && this.zzh == zzbaVar.zzh && this.zzi == zzbaVar.zzi && java.util.Objects.equals(this.zzc, zzbaVar.zzc) && java.util.Objects.equals(this.zza, zzbaVar.zza) && java.util.Objects.equals(this.zzd, zzbaVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, java.lang.Integer.valueOf(this.zzb), this.zzc, this.zzd, java.lang.Integer.valueOf(this.zze), java.lang.Long.valueOf(this.zzf), java.lang.Long.valueOf(this.zzg), java.lang.Integer.valueOf(this.zzh), java.lang.Integer.valueOf(this.zzi));
    }

    public final java.lang.String toString() {
        int i = this.zzb;
        int length = java.lang.String.valueOf(i).length();
        int i2 = this.zze;
        int length2 = java.lang.String.valueOf(i2).length();
        long j = this.zzf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 19 + length2 + 6 + java.lang.String.valueOf(j).length());
        sb.append("mediaItem=");
        sb.append(i);
        sb.append(", period=");
        sb.append(i2);
        sb.append(", pos=");
        sb.append(j);
        java.lang.String sb2 = sb.toString();
        int i3 = this.zzh;
        if (i3 == -1) {
            return sb2;
        }
        long j2 = this.zzg;
        int i4 = this.zzi;
        int length3 = sb2.length();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(length3 + 13 + java.lang.String.valueOf(j2).length() + 10 + java.lang.String.valueOf(i3).length() + 5 + java.lang.String.valueOf(i4).length());
        sb3.append(sb2);
        sb3.append(", contentPos=");
        sb3.append(j2);
        sb3.append(", adGroup=");
        sb3.append(i3);
        sb3.append(", ad=");
        sb3.append(i4);
        return sb3.toString();
    }
}
