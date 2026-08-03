package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhoi extends com.google.android.gms.internal.ads.zzhoy {
    private final int zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzhoh zzc;

    /* synthetic */ zzhoi(int i, int i2, com.google.android.gms.internal.ads.zzhoh zzhohVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzhohVar;
    }

    public static com.google.android.gms.internal.ads.zzhog zzb() {
        return new com.google.android.gms.internal.ads.zzhog(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhoi)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhoi zzhoiVar = (com.google.android.gms.internal.ads.zzhoi) obj;
        return zzhoiVar.zza == this.zza && zzhoiVar.zze() == zze() && zzhoiVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhoi.class, java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), this.zzc);
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        int length = java.lang.String.valueOf(valueOf).length();
        int i = this.zzb;
        int length2 = java.lang.String.valueOf(i).length();
        int i2 = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 32 + length2 + 16 + java.lang.String.valueOf(i2).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte tags, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzc != com.google.android.gms.internal.ads.zzhoh.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        com.google.android.gms.internal.ads.zzhoh zzhohVar = this.zzc;
        if (zzhohVar == com.google.android.gms.internal.ads.zzhoh.zzd) {
            return this.zzb;
        }
        if (zzhohVar == com.google.android.gms.internal.ads.zzhoh.zza || zzhohVar == com.google.android.gms.internal.ads.zzhoh.zzb || zzhohVar == com.google.android.gms.internal.ads.zzhoh.zzc) {
            return this.zzb + 5;
        }
        throw new java.lang.IllegalStateException("Unknown variant");
    }

    public final com.google.android.gms.internal.ads.zzhoh zzf() {
        return this.zzc;
    }
}
