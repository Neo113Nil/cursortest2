package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class zzrs {
    public static final boolean zza;

    static {
        boolean z4 = false;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z4 = true;
            }
        }
        zza = z4;
    }
}
