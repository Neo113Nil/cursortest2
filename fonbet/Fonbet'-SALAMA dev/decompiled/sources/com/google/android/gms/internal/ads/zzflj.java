package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes.dex */
final class zzflj implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzflm.zzc;
        if (handler != null) {
            handler2 = zzflm.zzc;
            runnable = zzflm.zzd;
            handler2.post(runnable);
            handler3 = zzflm.zzc;
            runnable2 = zzflm.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
