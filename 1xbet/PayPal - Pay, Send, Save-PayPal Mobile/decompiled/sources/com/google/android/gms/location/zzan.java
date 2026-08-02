package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class zzan {
    public static int zza(int i) {
        boolean z = true;
        if (i != 100 && i != 102 && i != 104) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "priority %d must be a Priority.PRIORITY_* constant", java.lang.Integer.valueOf(i));
        return i;
    }

    public static java.lang.String zzb(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        throw new java.lang.IllegalArgumentException();
    }
}
