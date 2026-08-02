package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zzbe {
    public static long zza(long j, long j3) {
        long j7 = j + j3;
        zzbd.zza(((j ^ j3) < 0) | ((j ^ j7) >= 0), "checkedAdd", j, j3);
        return j7;
    }

    public static long zzb(long j, long j3) {
        long j7 = j - 1;
        zzbd.zza(((1 ^ j) >= 0) | ((j ^ j7) >= 0), "checkedSubtract", j, 1L);
        return j7;
    }
}
