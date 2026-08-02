package com.google.android.gms.internal.ads;

import java.util.Arrays;
import w1.L;

/* loaded from: classes.dex */
public final class zzb {
    public static final zzb zza = new zzb(null, new zza[0], 0, -9223372036854775807L, 0);
    private static final zza zze = new zza(0).zzb(0);
    private final zza[] zzf;
    public final long zzc = 0;
    public final int zzb = 0;
    public final int zzd = 0;

    static {
        int i7 = zzen.zza;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    private zzb(Object obj, zza[] zzaVarArr, long j, long j3, int i7) {
        this.zzf = zzaVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzb.class == obj.getClass()) {
            int i7 = zzen.zza;
            if (Arrays.equals(this.zzf, ((zzb) obj).zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return L.i("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }

    public final zza zza(int i7) {
        return i7 < 0 ? zze : this.zzf[i7];
    }

    public final boolean zzb(int i7) {
        zza(-1);
        return false;
    }
}
