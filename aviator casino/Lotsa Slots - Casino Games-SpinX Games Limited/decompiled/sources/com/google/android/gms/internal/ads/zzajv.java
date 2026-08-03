package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzajv {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzajv(long j, long j2, int i) {
        com.google.android.gms.internal.ads.zzgtj.zza(j < j2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzajv zzajvVar = (com.google.android.gms.internal.ads.zzajv) obj;
            if (this.zza == zzajvVar.zza && this.zzb == zzajvVar.zzb && this.zzc == zzajvVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc));
    }

    public final java.lang.String toString() {
        java.lang.Object[] objArr = {java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc)};
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return java.lang.String.format(java.util.Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
    }
}
