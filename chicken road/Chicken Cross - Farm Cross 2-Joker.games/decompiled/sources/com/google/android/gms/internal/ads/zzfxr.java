package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfxr implements Runnable {
    zzfxr() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfxu.zzc;
        if (handler != null) {
            handler2 = zzfxu.zzc;
            runnable = zzfxu.zzk;
            handler2.post(runnable);
            handler3 = zzfxu.zzc;
            runnable2 = zzfxu.zzl;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
