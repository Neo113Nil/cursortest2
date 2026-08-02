package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzic {
    public static long zza(long j, long j3) {
        long j7 = j + j3;
        zzid.zza(((j ^ j3) < 0) | ((j ^ j7) >= 0), "checkedAdd", j, j3);
        return j7;
    }

    public static long zzb(long j, long j3) {
        long j7 = (-1) + j;
        zzid.zza(((1 ^ j) >= 0) | ((j ^ j7) >= 0), "checkedSubtract", j, 1L);
        return j7;
    }
}
