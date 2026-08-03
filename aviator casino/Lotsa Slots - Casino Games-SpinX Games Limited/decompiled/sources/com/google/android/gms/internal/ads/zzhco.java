package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhco {
    static void zza(java.lang.Throwable th) {
        if (th instanceof java.lang.InterruptedException) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    static void zzb(java.lang.Throwable th) {
        if ((th instanceof java.lang.Error) && !(th instanceof java.lang.StackOverflowError)) {
            throw ((java.lang.Error) th);
        }
    }
}
