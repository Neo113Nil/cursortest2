package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhuu extends com.google.android.gms.internal.ads.zzhxi {
    private final com.google.android.gms.internal.ads.zzhus zza;
    private final com.google.android.gms.internal.ads.zzhuq zzb;
    private final com.google.android.gms.internal.ads.zzhur zzc;
    private final com.google.android.gms.internal.ads.zzhut zzd;

    /* synthetic */ zzhuu(com.google.android.gms.internal.ads.zzhus zzhusVar, com.google.android.gms.internal.ads.zzhuq zzhuqVar, com.google.android.gms.internal.ads.zzhur zzhurVar, com.google.android.gms.internal.ads.zzhut zzhutVar, byte[] bArr) {
        this.zza = zzhusVar;
        this.zzb = zzhuqVar;
        this.zzc = zzhurVar;
        this.zzd = zzhutVar;
    }

    public static com.google.android.gms.internal.ads.zzhup zzb() {
        return new com.google.android.gms.internal.ads.zzhup(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhuu)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhuu zzhuuVar = (com.google.android.gms.internal.ads.zzhuu) obj;
        return zzhuuVar.zza == this.zza && zzhuuVar.zzb == this.zzb && zzhuuVar.zzc == this.zzc && zzhuuVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhuu.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zzd.toString();
        int length = obj.length();
        java.lang.String obj2 = this.zzc.toString();
        int length2 = obj2.length();
        java.lang.String obj3 = this.zza.toString();
        int length3 = obj3.length();
        java.lang.String obj4 = this.zzb.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 39 + length2 + 12 + length3 + 9 + obj4.length() + 1);
        sb.append("ECDSA Parameters (variant: ");
        sb.append(obj);
        sb.append(", hashType: ");
        sb.append(obj2);
        sb.append(", encoding: ");
        sb.append(obj3);
        sb.append(", curve: ");
        sb.append(obj4);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzd != com.google.android.gms.internal.ads.zzhut.zzd;
    }

    public final com.google.android.gms.internal.ads.zzhus zzc() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzhuq zzd() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzhur zze() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzhut zzf() {
        return this.zzd;
    }
}
