package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhyc extends zzhym {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhyb zzd;
    private final zzhya zze;
    private final zzhya zzf;
    private final int zzg;

    /* synthetic */ zzhyc(int i, BigInteger bigInteger, zzhyb zzhybVar, zzhya zzhyaVar, zzhya zzhyaVar2, int i2, byte[] bArr) {
        this.zzb = i;
        this.zzc = bigInteger;
        this.zzd = zzhybVar;
        this.zze = zzhyaVar;
        this.zzf = zzhyaVar2;
        this.zzg = i2;
    }

    public static zzhxz zzb() {
        return new zzhxz(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhyc)) {
            return false;
        }
        zzhyc zzhycVar = (zzhyc) obj;
        return zzhycVar.zzb == this.zzb && Objects.equals(zzhycVar.zzc, this.zzc) && Objects.equals(zzhycVar.zzd, this.zzd) && Objects.equals(zzhycVar.zze, this.zze) && Objects.equals(zzhycVar.zzf, this.zzf) && zzhycVar.zzg == this.zzg;
    }

    public final int hashCode() {
        return Objects.hash(zzhyc.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, Integer.valueOf(this.zzg));
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhya zzhyaVar = this.zzf;
        zzhya zzhyaVar2 = this.zze;
        String valueOf = String.valueOf(this.zzd);
        String valueOf2 = String.valueOf(zzhyaVar2);
        String valueOf3 = String.valueOf(zzhyaVar);
        String valueOf4 = String.valueOf(bigInteger);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int i = this.zzg;
        int length4 = String.valueOf(i).length();
        int length5 = String.valueOf(valueOf4).length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i2).length() + 13);
        sb.append("RSA SSA PSS Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", signature hashType: ");
        sb.append(valueOf2);
        sb.append(", mgf1 hashType: ");
        sb.append(valueOf3);
        sb.append(", saltLengthBytes: ");
        sb.append(i);
        sb.append(", publicExponent: ");
        sb.append(valueOf4);
        sb.append(", and ");
        sb.append(i2);
        sb.append("-bit modulus)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzd != zzhyb.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhyb zze() {
        return this.zzd;
    }

    public final zzhya zzf() {
        return this.zze;
    }

    public final zzhya zzg() {
        return this.zzf;
    }

    public final int zzh() {
        return this.zzg;
    }
}
