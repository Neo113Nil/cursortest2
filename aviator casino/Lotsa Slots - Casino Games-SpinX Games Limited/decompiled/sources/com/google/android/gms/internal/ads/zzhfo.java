package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhfo extends com.google.android.gms.internal.ads.zzheu {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final com.google.android.gms.internal.ads.zzhfn zzd;

    /* synthetic */ zzhfo(int i, int i2, int i3, com.google.android.gms.internal.ads.zzhfn zzhfnVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzhfnVar;
    }

    public static com.google.android.gms.internal.ads.zzhfm zzb() {
        return new com.google.android.gms.internal.ads.zzhfm(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhfo)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhfo zzhfoVar = (com.google.android.gms.internal.ads.zzhfo) obj;
        if (zzhfoVar.zza == this.zza && zzhfoVar.zzb == this.zzb) {
            int i = zzhfoVar.zzc;
            if (zzhfoVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhfo.class, java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzd);
        int length = java.lang.String.valueOf(valueOf).length();
        int i = this.zzb;
        int length2 = java.lang.String.valueOf(i).length();
        int length3 = java.lang.String.valueOf(16).length();
        int i2 = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 30 + length2 + 10 + length3 + 15 + java.lang.String.valueOf(i2).length() + 10);
        sb.append("AesEax Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte IV, 16-byte tag, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzd != com.google.android.gms.internal.ads.zzhfn.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzhfn zze() {
        return this.zzd;
    }
}
