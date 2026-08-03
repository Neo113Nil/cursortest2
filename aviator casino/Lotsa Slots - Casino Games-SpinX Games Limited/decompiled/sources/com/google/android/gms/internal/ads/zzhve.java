package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhve extends com.google.android.gms.internal.ads.zzhxi {
    private final com.google.android.gms.internal.ads.zzhvd zza;

    private zzhve(com.google.android.gms.internal.ads.zzhvd zzhvdVar) {
        this.zza = zzhvdVar;
    }

    public static com.google.android.gms.internal.ads.zzhve zzb(com.google.android.gms.internal.ads.zzhvd zzhvdVar) {
        return new com.google.android.gms.internal.ads.zzhve(zzhvdVar);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.internal.ads.zzhve) && ((com.google.android.gms.internal.ads.zzhve) obj).zza == this.zza;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhve.class, this.zza);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 30);
        sb.append("Ed25519 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zza != com.google.android.gms.internal.ads.zzhvd.zzd;
    }

    public final com.google.android.gms.internal.ads.zzhvd zzc() {
        return this.zza;
    }
}
