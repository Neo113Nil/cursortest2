package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfwp implements java.lang.Runnable {
    zzfwp() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Handler handler;
        android.os.Handler handler2;
        java.lang.Runnable runnable;
        android.os.Handler handler3;
        java.lang.Runnable runnable2;
        handler = com.google.android.gms.internal.ads.zzfws.zzc;
        if (handler != null) {
            handler2 = com.google.android.gms.internal.ads.zzfws.zzc;
            runnable = com.google.android.gms.internal.ads.zzfws.zzk;
            handler2.post(runnable);
            handler3 = com.google.android.gms.internal.ads.zzfws.zzc;
            runnable2 = com.google.android.gms.internal.ads.zzfws.zzl;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
