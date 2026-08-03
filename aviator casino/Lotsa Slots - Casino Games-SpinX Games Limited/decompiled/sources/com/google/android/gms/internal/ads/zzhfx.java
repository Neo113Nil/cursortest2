package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhfx extends com.google.android.gms.internal.ads.zzheu {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final com.google.android.gms.internal.ads.zzhfw zzd;

    /* synthetic */ zzhfx(int i, int i2, int i3, com.google.android.gms.internal.ads.zzhfw zzhfwVar, byte[] bArr) {
        this.zza = i;
        this.zzd = zzhfwVar;
    }

    public static com.google.android.gms.internal.ads.zzhfv zzb() {
        return new com.google.android.gms.internal.ads.zzhfv(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhfx)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhfx zzhfxVar = (com.google.android.gms.internal.ads.zzhfx) obj;
        if (zzhfxVar.zza == this.zza) {
            int i = zzhfxVar.zzb;
            int i2 = zzhfxVar.zzc;
            if (zzhfxVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhfx.class, java.lang.Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzd);
        int length = java.lang.String.valueOf(valueOf).length();
        int length2 = java.lang.String.valueOf(12).length();
        int length3 = java.lang.String.valueOf(16).length();
        int i = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 30 + length2 + 10 + length3 + 15 + java.lang.String.valueOf(i).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzd != com.google.android.gms.internal.ads.zzhfw.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzhfw zzd() {
        return this.zzd;
    }
}
