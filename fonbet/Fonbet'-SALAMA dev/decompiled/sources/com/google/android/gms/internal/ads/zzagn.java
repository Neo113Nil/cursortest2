package com.google.android.gms.internal.ads;

import e1.k;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzagn {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzagn(long j, long j3, int i7) {
        zzcv.zzd(j < j3);
        this.zza = j;
        this.zzb = j3;
        this.zzc = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagn.class == obj.getClass()) {
            zzagn zzagnVar = (zzagn) obj;
            if (this.zza == zzagnVar.zza && this.zzb == zzagnVar.zzb && this.zzc == zzagnVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public final String toString() {
        long j = this.zza;
        long j3 = this.zzb;
        int i7 = this.zzc;
        int i8 = zzen.zza;
        Locale locale = Locale.US;
        StringBuilder j7 = k.j("Segment: startTimeMs=", ", endTimeMs=", j);
        j7.append(j3);
        j7.append(", speedDivisor=");
        j7.append(i7);
        return j7.toString();
    }
}
