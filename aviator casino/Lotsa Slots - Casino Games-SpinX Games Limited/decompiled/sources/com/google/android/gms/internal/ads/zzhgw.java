package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhgw extends com.google.android.gms.internal.ads.zzheu {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzhgv zzb;

    private zzhgw(java.lang.String str, com.google.android.gms.internal.ads.zzhgv zzhgvVar) {
        this.zza = str;
        this.zzb = zzhgvVar;
    }

    public static com.google.android.gms.internal.ads.zzhgw zzb(java.lang.String str, com.google.android.gms.internal.ads.zzhgv zzhgvVar) {
        return new com.google.android.gms.internal.ads.zzhgw(str, zzhgvVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhgw)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhgw zzhgwVar = (com.google.android.gms.internal.ads.zzhgw) obj;
        return zzhgwVar.zza.equals(this.zza) && zzhgwVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhgw.class, this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zzb.toString();
        java.lang.String str = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 45 + obj.length() + 1);
        sb.append("LegacyKmsAead Parameters (keyUri: ");
        sb.append(str);
        sb.append(", variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzb != com.google.android.gms.internal.ads.zzhgv.zzb;
    }

    public final java.lang.String zzc() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzhgv zzd() {
        return this.zzb;
    }
}
