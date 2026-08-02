package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhdz {
    public static final zzhdz zza = new zzhdz(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzhdz zzb = new zzhdz(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzhdz zzc = new zzhdz(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzhdz zzd = new zzhdz(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;
    public final double zzj;
    public final double zzk;
    public final double zzl;
    public final double zzm;

    public zzhdz(double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
        this.zze = d11;
        this.zzf = d12;
        this.zzg = d13;
        this.zzh = d7;
        this.zzi = d8;
        this.zzj = d9;
        this.zzk = d10;
        this.zzl = d14;
        this.zzm = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzhdz.class != obj.getClass()) {
            return false;
        }
        zzhdz zzhdzVar = (zzhdz) obj;
        return Double.compare(zzhdzVar.zzh, this.zzh) == 0 && Double.compare(zzhdzVar.zzi, this.zzi) == 0 && Double.compare(zzhdzVar.zzj, this.zzj) == 0 && Double.compare(zzhdzVar.zzk, this.zzk) == 0 && Double.compare(zzhdzVar.zzl, this.zzl) == 0 && Double.compare(zzhdzVar.zzm, this.zzm) == 0 && Double.compare(zzhdzVar.zze, this.zze) == 0 && Double.compare(zzhdzVar.zzf, this.zzf) == 0 && Double.compare(zzhdzVar.zzg, this.zzg) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zze);
        long j = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zzf);
        long j3 = doubleToLongBits2 ^ (doubleToLongBits2 >>> 32);
        long doubleToLongBits3 = Double.doubleToLongBits(this.zzg);
        long j7 = doubleToLongBits3 ^ (doubleToLongBits3 >>> 32);
        long doubleToLongBits4 = Double.doubleToLongBits(this.zzh);
        long j8 = doubleToLongBits4 ^ (doubleToLongBits4 >>> 32);
        long doubleToLongBits5 = Double.doubleToLongBits(this.zzi);
        long j9 = doubleToLongBits5 ^ (doubleToLongBits5 >>> 32);
        long doubleToLongBits6 = Double.doubleToLongBits(this.zzj);
        long j10 = doubleToLongBits6 ^ (doubleToLongBits6 >>> 32);
        long doubleToLongBits7 = Double.doubleToLongBits(this.zzk);
        long j11 = doubleToLongBits7 ^ (doubleToLongBits7 >>> 32);
        long doubleToLongBits8 = Double.doubleToLongBits(this.zzl);
        long j12 = doubleToLongBits8 ^ (doubleToLongBits8 >>> 32);
        long doubleToLongBits9 = Double.doubleToLongBits(this.zzm);
        return (((((((((((((((((int) j) * 31) + ((int) j3)) * 31) + ((int) j7)) * 31) + ((int) j8)) * 31) + ((int) j9)) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zza)) {
            return "Rotate 0°";
        }
        if (equals(zzb)) {
            return "Rotate 90°";
        }
        if (equals(zzc)) {
            return "Rotate 180°";
        }
        if (equals(zzd)) {
            return "Rotate 270°";
        }
        double d7 = this.zze;
        double d8 = this.zzf;
        double d9 = this.zzg;
        double d10 = this.zzh;
        double d11 = this.zzi;
        double d12 = this.zzj;
        double d13 = this.zzk;
        double d14 = this.zzl;
        double d15 = this.zzm;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d7);
        sb.append(", v=");
        sb.append(d8);
        sb.append(", w=");
        sb.append(d9);
        sb.append(", a=");
        sb.append(d10);
        sb.append(", b=");
        sb.append(d11);
        sb.append(", c=");
        sb.append(d12);
        sb.append(", d=");
        sb.append(d13);
        sb.append(", tx=");
        sb.append(d14);
        sb.append(", ty=");
        sb.append(d15);
        sb.append("}");
        return sb.toString();
    }
}
