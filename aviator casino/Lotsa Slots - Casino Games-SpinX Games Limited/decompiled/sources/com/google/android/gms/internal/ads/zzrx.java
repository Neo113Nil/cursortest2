package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzrx {
    public final com.google.android.gms.internal.ads.zzv zza;

    @java.lang.Deprecated
    public final int zzb = 0;
    public final com.google.android.gms.internal.ads.zzhaf zzc;

    /* synthetic */ zzrx(com.google.android.gms.internal.ads.zzv zzvVar, int i, com.google.android.gms.internal.ads.zzhaf zzhafVar, byte[] bArr) {
        this.zza = zzvVar;
        this.zzc = zzhafVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzrx)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzrx zzrxVar = (com.google.android.gms.internal.ads.zzrx) obj;
        int i = zzrxVar.zzb;
        return this.zza.equals(zzrxVar.zza) && java.util.Objects.equals(this.zzc, zzrxVar.zzc);
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() * 961;
        com.google.android.gms.internal.ads.zzhaf zzhafVar = this.zzc;
        return hashCode + (zzhafVar == null ? 0 : zzhafVar.hashCode());
    }
}
