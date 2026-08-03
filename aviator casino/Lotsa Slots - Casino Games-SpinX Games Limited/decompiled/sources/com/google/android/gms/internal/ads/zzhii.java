package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhii extends com.google.android.gms.internal.ads.zzheu {
    private final com.google.android.gms.internal.ads.zzhih zza;

    private zzhii(com.google.android.gms.internal.ads.zzhih zzhihVar) {
        this.zza = zzhihVar;
    }

    public static com.google.android.gms.internal.ads.zzhii zzb(com.google.android.gms.internal.ads.zzhih zzhihVar) {
        return new com.google.android.gms.internal.ads.zzhii(zzhihVar);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.internal.ads.zzhii) && ((com.google.android.gms.internal.ads.zzhii) obj).zza == this.zza;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhii.class, this.zza);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 40);
        sb.append("XChaCha20Poly1305 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zza != com.google.android.gms.internal.ads.zzhih.zzc;
    }

    public final com.google.android.gms.internal.ads.zzhih zzc() {
        return this.zza;
    }
}
