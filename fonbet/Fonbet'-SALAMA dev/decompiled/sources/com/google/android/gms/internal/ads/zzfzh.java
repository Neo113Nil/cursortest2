package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfzh {
    public static char zza(long j) {
        char c3 = (char) j;
        zzfth.zzh(((long) c3) == j, "Out of range: %s", j);
        return c3;
    }

    public static char zzb(byte b7, byte b8) {
        return (char) ((b7 << 8) | (b8 & 255));
    }
}
