package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class zzq {
    public static int zza(int i) {
        boolean z = true;
        if (i != 0 && i != 1) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "granularity %d must be a Granularity.GRANULARITY_* constant", java.lang.Integer.valueOf(i));
        return i;
    }

    public static java.lang.String zzb(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        throw new java.lang.IllegalArgumentException();
    }
}
