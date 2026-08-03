package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhwy extends com.google.android.gms.internal.ads.zzhxi {
    public static final java.math.BigInteger zza = java.math.BigInteger.valueOf(65537);
    private final int zzb;
    private final java.math.BigInteger zzc;
    private final com.google.android.gms.internal.ads.zzhwx zzd;
    private final com.google.android.gms.internal.ads.zzhww zze;
    private final com.google.android.gms.internal.ads.zzhww zzf;
    private final int zzg;

    /* synthetic */ zzhwy(int i, java.math.BigInteger bigInteger, com.google.android.gms.internal.ads.zzhwx zzhwxVar, com.google.android.gms.internal.ads.zzhww zzhwwVar, com.google.android.gms.internal.ads.zzhww zzhwwVar2, int i2, byte[] bArr) {
        this.zzb = i;
        this.zzc = bigInteger;
        this.zzd = zzhwxVar;
        this.zze = zzhwwVar;
        this.zzf = zzhwwVar2;
        this.zzg = i2;
    }

    public static com.google.android.gms.internal.ads.zzhwv zzb() {
        return new com.google.android.gms.internal.ads.zzhwv(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhwy)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhwy zzhwyVar = (com.google.android.gms.internal.ads.zzhwy) obj;
        return zzhwyVar.zzb == this.zzb && java.util.Objects.equals(zzhwyVar.zzc, this.zzc) && java.util.Objects.equals(zzhwyVar.zzd, this.zzd) && java.util.Objects.equals(zzhwyVar.zze, this.zze) && java.util.Objects.equals(zzhwyVar.zzf, this.zzf) && zzhwyVar.zzg == this.zzg;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhwy.class, java.lang.Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, java.lang.Integer.valueOf(this.zzg));
    }

    public final java.lang.String toString() {
        java.math.BigInteger bigInteger = this.zzc;
        com.google.android.gms.internal.ads.zzhww zzhwwVar = this.zzf;
        com.google.android.gms.internal.ads.zzhww zzhwwVar2 = this.zze;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzd);
        java.lang.String valueOf2 = java.lang.String.valueOf(zzhwwVar2);
        java.lang.String valueOf3 = java.lang.String.valueOf(zzhwwVar);
        java.lang.String valueOf4 = java.lang.String.valueOf(bigInteger);
        int length = java.lang.String.valueOf(valueOf).length();
        int length2 = java.lang.String.valueOf(valueOf2).length();
        int length3 = java.lang.String.valueOf(valueOf3).length();
        int i = this.zzg;
        int length4 = java.lang.String.valueOf(i).length();
        int length5 = java.lang.String.valueOf(valueOf4).length();
        int i2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + java.lang.String.valueOf(i2).length() + 13);
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

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzd != com.google.android.gms.internal.ads.zzhwx.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final java.math.BigInteger zzd() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzhwx zze() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzhww zzf() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.zzhww zzg() {
        return this.zzf;
    }

    public final int zzh() {
        return this.zzg;
    }
}
