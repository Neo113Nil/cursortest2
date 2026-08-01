package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhxq extends zzhym {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhxp zzd;
    private final zzhxo zze;

    /* synthetic */ zzhxq(int i, BigInteger bigInteger, zzhxp zzhxpVar, zzhxo zzhxoVar, byte[] bArr) {
        this.zzb = i;
        this.zzc = bigInteger;
        this.zzd = zzhxpVar;
        this.zze = zzhxoVar;
    }

    public static zzhxn zzb() {
        return new zzhxn(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhxq)) {
            return false;
        }
        zzhxq zzhxqVar = (zzhxq) obj;
        return zzhxqVar.zzb == this.zzb && Objects.equals(zzhxqVar.zzc, this.zzc) && zzhxqVar.zzd == this.zzd && zzhxqVar.zze == this.zze;
    }

    public final int hashCode() {
        return Objects.hash(zzhxq.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhxo zzhxoVar = this.zze;
        String valueOf = String.valueOf(this.zzd);
        String valueOf2 = String.valueOf(zzhxoVar);
        String valueOf3 = String.valueOf(bigInteger);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
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

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzd != zzhxp.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhxp zze() {
        return this.zzd;
    }

    public final zzhxo zzf() {
        return this.zze;
    }
}
