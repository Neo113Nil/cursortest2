package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzchi implements java.lang.Runnable {
    zzchi(com.google.android.gms.internal.ads.zzchk zzchkVar) {
        java.util.Objects.requireNonNull(zzchkVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Looper.myLooper().quit();
    }
}
