package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhgg extends com.google.android.gms.internal.ads.zzheu {
    private final int zza;
    private final com.google.android.gms.internal.ads.zzhgf zzb;

    /* synthetic */ zzhgg(int i, com.google.android.gms.internal.ads.zzhgf zzhgfVar, byte[] bArr) {
        this.zza = i;
        this.zzb = zzhgfVar;
    }

    public static com.google.android.gms.internal.ads.zzhge zzb() {
        return new com.google.android.gms.internal.ads.zzhge(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhgg)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhgg zzhggVar = (com.google.android.gms.internal.ads.zzhgg) obj;
        return zzhggVar.zza == this.zza && zzhggVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhgg.class, java.lang.Integer.valueOf(this.zza), this.zzb);
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        int length = java.lang.String.valueOf(valueOf).length();
        int i = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 33 + java.lang.String.valueOf(i).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzb != com.google.android.gms.internal.ads.zzhgf.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzhgf zzd() {
        return this.zzb;
    }
}
