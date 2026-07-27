package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzft {
    public static boolean zza(int i, int i2) {
        if ((i >> 18) == 0) {
            return i == 0 || Integer.bitCount(i) == i2;
        }
        return false;
    }

    public static int zzb(int i) {
        if (i == 0) {
            return -1;
        }
        return i << 2;
    }
}
