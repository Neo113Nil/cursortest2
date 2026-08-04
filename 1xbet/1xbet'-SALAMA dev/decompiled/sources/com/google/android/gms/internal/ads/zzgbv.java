package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzgbv {
    public static void zza(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
