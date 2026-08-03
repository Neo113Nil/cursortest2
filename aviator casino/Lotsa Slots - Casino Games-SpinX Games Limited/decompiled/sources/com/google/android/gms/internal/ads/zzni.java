package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzni {
    public static final com.google.android.gms.internal.ads.zzni zza;
    public static final com.google.android.gms.internal.ads.zzni zzb;
    public static final com.google.android.gms.internal.ads.zzni zzc;
    public final long zzd;
    public final long zze;

    static {
        com.google.android.gms.internal.ads.zzni zzniVar = new com.google.android.gms.internal.ads.zzni(0L, 0L);
        zza = zzniVar;
        new com.google.android.gms.internal.ads.zzni(Long.MAX_VALUE, Long.MAX_VALUE);
        zzb = new com.google.android.gms.internal.ads.zzni(Long.MAX_VALUE, 0L);
        new com.google.android.gms.internal.ads.zzni(0L, Long.MAX_VALUE);
        zzc = zzniVar;
    }

    public zzni(long j, long j2) {
        com.google.android.gms.internal.ads.zzgtj.zza(j >= 0);
        com.google.android.gms.internal.ads.zzgtj.zza(j2 >= 0);
        this.zzd = j;
        this.zze = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzni zzniVar = (com.google.android.gms.internal.ads.zzni) obj;
            if (this.zzd == zzniVar.zzd && this.zze == zzniVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzd) * 31) + ((int) this.zze);
    }
}
