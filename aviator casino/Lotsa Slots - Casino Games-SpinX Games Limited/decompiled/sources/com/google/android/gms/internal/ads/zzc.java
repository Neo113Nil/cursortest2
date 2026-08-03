package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzc {
    public static final com.google.android.gms.internal.ads.zzc zza = new com.google.android.gms.internal.ads.zzc(null, new com.google.android.gms.internal.ads.zza[0], 0, -9223372036854775807L, 0);
    private static final com.google.android.gms.internal.ads.zza zze = new com.google.android.gms.internal.ads.zza(0).zzb(0);
    private final com.google.android.gms.internal.ads.zza[] zzf;
    public final long zzc = 0;
    public final int zzb = 0;
    public final int zzd = 0;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
    }

    private zzc(java.lang.Object obj, com.google.android.gms.internal.ads.zza[] zzaVarArr, long j, long j2, int i) {
        this.zzf = zzaVarArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && java.util.Arrays.equals(this.zzf, ((com.google.android.gms.internal.ads.zzc) obj).zzf);
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + java.util.Arrays.hashCode(this.zzf);
    }

    public final java.lang.String toString() {
        return "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[])";
    }

    public final com.google.android.gms.internal.ads.zza zza(int i) {
        return i < 0 ? zze : this.zzf[i];
    }

    public final boolean zzb(int i) {
        zza(-1);
        return false;
    }
}
