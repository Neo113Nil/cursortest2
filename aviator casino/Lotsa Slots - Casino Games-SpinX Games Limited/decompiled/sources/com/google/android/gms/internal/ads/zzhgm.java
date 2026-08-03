package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhgm extends com.google.android.gms.internal.ads.zzheu {
    private final com.google.android.gms.internal.ads.zzhgl zza;

    private zzhgm(com.google.android.gms.internal.ads.zzhgl zzhglVar) {
        this.zza = zzhglVar;
    }

    public static com.google.android.gms.internal.ads.zzhgm zzb(com.google.android.gms.internal.ads.zzhgl zzhglVar) {
        return new com.google.android.gms.internal.ads.zzhgm(zzhglVar);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.internal.ads.zzhgm) && ((com.google.android.gms.internal.ads.zzhgm) obj).zza == this.zza;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhgm.class, this.zza);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 39);
        sb.append("ChaCha20Poly1305 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zza != com.google.android.gms.internal.ads.zzhgl.zzc;
    }

    public final com.google.android.gms.internal.ads.zzhgl zzc() {
        return this.zza;
    }
}
