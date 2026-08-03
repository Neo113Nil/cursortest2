package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzimn {
    public static final com.google.android.gms.internal.ads.zzimn zzj = new com.google.android.gms.internal.ads.zzimn(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final com.google.android.gms.internal.ads.zzimn zzk = new com.google.android.gms.internal.ads.zzimn(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final com.google.android.gms.internal.ads.zzimn zzl = new com.google.android.gms.internal.ads.zzimn(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final com.google.android.gms.internal.ads.zzimn zzm = new com.google.android.gms.internal.ads.zzimn(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;

    public zzimn(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.zza = d5;
        this.zzb = d6;
        this.zzc = d7;
        this.zzd = d;
        this.zze = d2;
        this.zzf = d3;
        this.zzg = d4;
        this.zzh = d8;
        this.zzi = d9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.gms.internal.ads.zzimn zzimnVar = (com.google.android.gms.internal.ads.zzimn) obj;
        return java.lang.Double.compare(zzimnVar.zzd, this.zzd) == 0 && java.lang.Double.compare(zzimnVar.zze, this.zze) == 0 && java.lang.Double.compare(zzimnVar.zzf, this.zzf) == 0 && java.lang.Double.compare(zzimnVar.zzg, this.zzg) == 0 && java.lang.Double.compare(zzimnVar.zzh, this.zzh) == 0 && java.lang.Double.compare(zzimnVar.zzi, this.zzi) == 0 && java.lang.Double.compare(zzimnVar.zza, this.zza) == 0 && java.lang.Double.compare(zzimnVar.zzb, this.zzb) == 0 && java.lang.Double.compare(zzimnVar.zzc, this.zzc) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.zza);
        long j = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.zzb);
        long j2 = doubleToLongBits2 ^ (doubleToLongBits2 >>> 32);
        long doubleToLongBits3 = java.lang.Double.doubleToLongBits(this.zzc);
        long j3 = doubleToLongBits3 ^ (doubleToLongBits3 >>> 32);
        long doubleToLongBits4 = java.lang.Double.doubleToLongBits(this.zzd);
        long j4 = doubleToLongBits4 ^ (doubleToLongBits4 >>> 32);
        long doubleToLongBits5 = java.lang.Double.doubleToLongBits(this.zze);
        long j5 = doubleToLongBits5 ^ (doubleToLongBits5 >>> 32);
        long doubleToLongBits6 = java.lang.Double.doubleToLongBits(this.zzf);
        long j6 = doubleToLongBits6 ^ (doubleToLongBits6 >>> 32);
        long doubleToLongBits7 = java.lang.Double.doubleToLongBits(this.zzg);
        long j7 = doubleToLongBits7 ^ (doubleToLongBits7 >>> 32);
        long doubleToLongBits8 = java.lang.Double.doubleToLongBits(this.zzh);
        long j8 = doubleToLongBits8 ^ (doubleToLongBits8 >>> 32);
        long doubleToLongBits9 = java.lang.Double.doubleToLongBits(this.zzi);
        return (((((((((((((((((int) j) * 31) + ((int) j2)) * 31) + ((int) j3)) * 31) + ((int) j4)) * 31) + ((int) j5)) * 31) + ((int) j6)) * 31) + ((int) j7)) * 31) + ((int) j8)) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final java.lang.String toString() {
        if (equals(zzj)) {
            return "Rotate 0°";
        }
        if (equals(zzk)) {
            return "Rotate 90°";
        }
        if (equals(zzl)) {
            return "Rotate 180°";
        }
        if (equals(zzm)) {
            return "Rotate 270°";
        }
        double d = this.zza;
        double d2 = this.zzb;
        double d3 = this.zzc;
        double d4 = this.zzd;
        double d5 = this.zze;
        double d6 = this.zzf;
        double d7 = this.zzg;
        double d8 = this.zzh;
        double d9 = this.zzi;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
