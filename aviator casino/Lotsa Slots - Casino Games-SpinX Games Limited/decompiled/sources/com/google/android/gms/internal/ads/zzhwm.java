package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhwm extends com.google.android.gms.internal.ads.zzhxi {
    public static final java.math.BigInteger zza = java.math.BigInteger.valueOf(65537);
    private final int zzb;
    private final java.math.BigInteger zzc;
    private final com.google.android.gms.internal.ads.zzhwl zzd;
    private final com.google.android.gms.internal.ads.zzhwk zze;

    /* synthetic */ zzhwm(int i, java.math.BigInteger bigInteger, com.google.android.gms.internal.ads.zzhwl zzhwlVar, com.google.android.gms.internal.ads.zzhwk zzhwkVar, byte[] bArr) {
        this.zzb = i;
        this.zzc = bigInteger;
        this.zzd = zzhwlVar;
        this.zze = zzhwkVar;
    }

    public static com.google.android.gms.internal.ads.zzhwj zzb() {
        return new com.google.android.gms.internal.ads.zzhwj(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhwm)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhwm zzhwmVar = (com.google.android.gms.internal.ads.zzhwm) obj;
        return zzhwmVar.zzb == this.zzb && java.util.Objects.equals(zzhwmVar.zzc, this.zzc) && zzhwmVar.zzd == this.zzd && zzhwmVar.zze == this.zze;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhwm.class, java.lang.Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    public final java.lang.String toString() {
        java.math.BigInteger bigInteger = this.zzc;
        com.google.android.gms.internal.ads.zzhwk zzhwkVar = this.zze;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzd);
        java.lang.String valueOf2 = java.lang.String.valueOf(zzhwkVar);
        java.lang.String valueOf3 = java.lang.String.valueOf(bigInteger);
        int length = java.lang.String.valueOf(valueOf).length();
        int length2 = java.lang.String.valueOf(valueOf2).length();
        int length3 = java.lang.String.valueOf(valueOf3).length();
        int i = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 47 + length2 + 18 + length3 + 6 + java.lang.String.valueOf(i).length() + 13);
        sb.append("RSA SSA PKCS1 Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", hashType: ");
        sb.append(valueOf2);
        sb.append(", publicExponent: ");
        sb.append(valueOf3);
        sb.append(", and ");
        sb.append(i);
        sb.append("-bit modulus)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzd != com.google.android.gms.internal.ads.zzhwl.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final java.math.BigInteger zzd() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzhwl zze() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzhwk zzf() {
        return this.zze;
    }
}
