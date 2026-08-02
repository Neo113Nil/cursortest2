package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class zzar {
    public static int zza(int i) {
        boolean z = true;
        if (i != 0 && i != 1) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", java.lang.Integer.valueOf(i));
        return i;
    }

    public static java.lang.String zzb(int i) {
        if (i == 0) {
            return "THROTTLE_BACKGROUND";
        }
        if (i == 1) {
            return "THROTTLE_ALWAYS";
        }
        if (i == 2) {
            return "THROTTLE_NEVER";
        }
        throw new java.lang.IllegalArgumentException();
    }
}
