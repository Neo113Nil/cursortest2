package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzftk {
    private final java.lang.String zza;
    private final com.google.android.gms.ads.AdFormat zzb;
    private final java.lang.String zzc;

    /* synthetic */ zzftk(com.google.android.gms.internal.ads.zzftj zzftjVar, byte[] bArr) {
        this.zza = zzftjVar.zzb();
        this.zzb = zzftjVar.zzc();
        this.zzc = zzftjVar.zzd();
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.gms.ads.AdFormat adFormat;
        com.google.android.gms.ads.AdFormat adFormat2;
        if (obj instanceof com.google.android.gms.internal.ads.zzftk) {
            com.google.android.gms.internal.ads.zzftk zzftkVar = (com.google.android.gms.internal.ads.zzftk) obj;
            if (this.zza.equals(zzftkVar.zza) && (adFormat = this.zzb) != null && (adFormat2 = zzftkVar.zzb) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, this.zzb);
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        com.google.android.gms.ads.AdFormat adFormat = this.zzb;
        return adFormat == null ? "unknown" : adFormat.name().toLowerCase(java.util.Locale.ENGLISH);
    }

    public final java.lang.String zzc() {
        return this.zzc;
    }
}
