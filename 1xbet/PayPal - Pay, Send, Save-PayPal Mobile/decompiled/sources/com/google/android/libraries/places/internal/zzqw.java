package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzqw {
    private static java.lang.Thread zza;

    public static boolean zza(java.lang.Thread thread) {
        if (zza == null) {
            zza = android.os.Looper.getMainLooper().getThread();
        }
        return thread == zza;
    }
}
