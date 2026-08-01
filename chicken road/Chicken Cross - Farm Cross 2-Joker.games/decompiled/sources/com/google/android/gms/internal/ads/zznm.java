package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zznm {
    public static final zznm zza;
    public static final zznm zzb;
    public static final zznm zzc;
    public final long zzd;
    public final long zze = 0;

    static {
        zznm zznmVar = new zznm(0L, 0L);
        zza = zznmVar;
        zzb = new zznm(Long.MAX_VALUE, 0L);
        zzc = zznmVar;
    }

    public zznm(long j, long j2) {
        this.zzd = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.zzd == ((zznm) obj).zzd;
    }

    public final int hashCode() {
        return ((int) this.zzd) * 31;
    }
}
