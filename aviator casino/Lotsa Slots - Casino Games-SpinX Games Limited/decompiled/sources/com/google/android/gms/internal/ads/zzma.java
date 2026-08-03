package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzma {
    public final long zza;
    public final float zzb;
    public final long zzc;

    /* synthetic */ zzma(com.google.android.gms.internal.ads.zzlz zzlzVar, byte[] bArr) {
        this.zza = zzlzVar.zze();
        this.zzb = zzlzVar.zzf();
        this.zzc = zzlzVar.zzg();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzma)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzma zzmaVar = (com.google.android.gms.internal.ads.zzma) obj;
        return this.zza == zzmaVar.zza && this.zzb == zzmaVar.zzb && this.zzc == zzmaVar.zzc;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Long.valueOf(this.zza), java.lang.Float.valueOf(this.zzb), java.lang.Long.valueOf(this.zzc));
    }

    public final com.google.android.gms.internal.ads.zzlz zza() {
        return new com.google.android.gms.internal.ads.zzlz(this, null);
    }
}
