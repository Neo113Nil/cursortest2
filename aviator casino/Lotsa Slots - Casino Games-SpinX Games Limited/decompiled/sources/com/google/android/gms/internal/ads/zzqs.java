package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzqs {
    public static final com.google.android.gms.internal.ads.zzqs zza = new com.google.android.gms.internal.ads.zzqr().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* synthetic */ zzqs(com.google.android.gms.internal.ads.zzqr zzqrVar, byte[] bArr) {
        this.zzb = zzqrVar.zze();
        this.zzc = zzqrVar.zzf();
        this.zzd = zzqrVar.zzg();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzqs zzqsVar = (com.google.android.gms.internal.ads.zzqs) obj;
            if (this.zzb == zzqsVar.zzb && this.zzc == zzqsVar.zzc && this.zzd == zzqsVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
