package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzajc implements com.google.android.gms.internal.ads.zzao {
    public final int zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzajc(int i, java.lang.String str, java.lang.String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    public static com.google.android.gms.internal.ads.zzajc zzb(com.google.android.gms.internal.ads.zzet zzetVar) {
        int zzB = zzetVar.zzB();
        java.lang.String zzh = com.google.android.gms.internal.ads.zzas.zzh(zzetVar.zzK(zzetVar.zzB(), java.nio.charset.StandardCharsets.US_ASCII));
        java.lang.String zzK = zzetVar.zzK(zzetVar.zzB(), java.nio.charset.StandardCharsets.UTF_8);
        int zzB2 = zzetVar.zzB();
        int zzB3 = zzetVar.zzB();
        int zzB4 = zzetVar.zzB();
        int zzB5 = zzetVar.zzB();
        int zzB6 = zzetVar.zzB();
        byte[] bArr = new byte[zzB6];
        zzetVar.zzm(bArr, 0, zzB6);
        return new com.google.android.gms.internal.ads.zzajc(zzB, zzh, zzK, zzB2, zzB3, zzB4, zzB5, bArr);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzajc zzajcVar = (com.google.android.gms.internal.ads.zzajc) obj;
            if (this.zza == zzajcVar.zza && this.zzb.equals(zzajcVar.zzb) && this.zzc.equals(zzajcVar.zzc) && this.zzd == zzajcVar.zzd && this.zze == zzajcVar.zze && this.zzf == zzajcVar.zzf && this.zzg == zzajcVar.zzg && java.util.Arrays.equals(this.zzh, zzajcVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + java.util.Arrays.hashCode(this.zzh);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zzb;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 32 + str2.length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(com.google.android.gms.internal.ads.zzam zzamVar) {
        zzamVar.zzf(this.zzh, this.zza);
    }
}
