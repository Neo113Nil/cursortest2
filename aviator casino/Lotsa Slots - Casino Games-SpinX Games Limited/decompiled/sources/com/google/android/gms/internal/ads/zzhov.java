package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhov extends com.google.android.gms.internal.ads.zzhoy {
    private final int zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzhou zzc;
    private final com.google.android.gms.internal.ads.zzhot zzd;

    /* synthetic */ zzhov(int i, int i2, com.google.android.gms.internal.ads.zzhou zzhouVar, com.google.android.gms.internal.ads.zzhot zzhotVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzhouVar;
        this.zzd = zzhotVar;
    }

    public static com.google.android.gms.internal.ads.zzhos zzb() {
        return new com.google.android.gms.internal.ads.zzhos(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhov)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhov zzhovVar = (com.google.android.gms.internal.ads.zzhov) obj;
        return zzhovVar.zza == this.zza && zzhovVar.zze() == zze() && zzhovVar.zzc == this.zzc && zzhovVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhov.class, java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zzhot zzhotVar = this.zzd;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        java.lang.String valueOf2 = java.lang.String.valueOf(zzhotVar);
        int length = java.lang.String.valueOf(valueOf).length();
        int length2 = java.lang.String.valueOf(valueOf2).length();
        int i = this.zzb;
        int length3 = java.lang.String.valueOf(i).length();
        int i2 = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 38 + length2 + 2 + length3 + 16 + java.lang.String.valueOf(i2).length() + 10);
        sb.append("HMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", hashType: ");
        sb.append(valueOf2);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte tags, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzc != com.google.android.gms.internal.ads.zzhou.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        com.google.android.gms.internal.ads.zzhou zzhouVar = this.zzc;
        if (zzhouVar == com.google.android.gms.internal.ads.zzhou.zzd) {
            return this.zzb;
        }
        if (zzhouVar == com.google.android.gms.internal.ads.zzhou.zza || zzhouVar == com.google.android.gms.internal.ads.zzhou.zzb || zzhouVar == com.google.android.gms.internal.ads.zzhou.zzc) {
            return this.zzb + 5;
        }
        throw new java.lang.IllegalStateException("Unknown variant");
    }

    public final com.google.android.gms.internal.ads.zzhou zzf() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzhot zzg() {
        return this.zzd;
    }
}
