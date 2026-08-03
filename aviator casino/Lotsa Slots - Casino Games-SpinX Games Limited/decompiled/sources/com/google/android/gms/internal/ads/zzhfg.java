package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhfg extends com.google.android.gms.internal.ads.zzheu {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final com.google.android.gms.internal.ads.zzhff zze;
    private final com.google.android.gms.internal.ads.zzhfe zzf;

    /* synthetic */ zzhfg(int i, int i2, int i3, int i4, com.google.android.gms.internal.ads.zzhff zzhffVar, com.google.android.gms.internal.ads.zzhfe zzhfeVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzhffVar;
        this.zzf = zzhfeVar;
    }

    public static com.google.android.gms.internal.ads.zzhfd zzb() {
        return new com.google.android.gms.internal.ads.zzhfd(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhfg)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhfg zzhfgVar = (com.google.android.gms.internal.ads.zzhfg) obj;
        return zzhfgVar.zza == this.zza && zzhfgVar.zzb == this.zzb && zzhfgVar.zzc == this.zzc && zzhfgVar.zzd == this.zzd && zzhfgVar.zze == this.zze && zzhfgVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhfg.class, java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zzhfe zzhfeVar = this.zzf;
        java.lang.String valueOf = java.lang.String.valueOf(this.zze);
        java.lang.String valueOf2 = java.lang.String.valueOf(zzhfeVar);
        int length = java.lang.String.valueOf(valueOf).length();
        int length2 = java.lang.String.valueOf(valueOf2).length();
        int i = this.zzc;
        int length3 = java.lang.String.valueOf(i).length();
        int i2 = this.zzd;
        int length4 = java.lang.String.valueOf(i2).length();
        int i3 = this.zza;
        int length5 = java.lang.String.valueOf(i3).length();
        int i4 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + java.lang.String.valueOf(i4).length() + 15);
        sb.append("AesCtrHmacAead Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", hashType: ");
        sb.append(valueOf2);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte IV, and ");
        sb.append(i2);
        sb.append("-byte tags, and ");
        sb.append(i3);
        sb.append("-byte AES key, and ");
        sb.append(i4);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zze != com.google.android.gms.internal.ads.zzhff.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzhff zzg() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.zzhfe zzh() {
        return this.zzf;
    }
}
