package com.google.android.gms.internal.ads;

import E2.o;
import I2.K;
import I2.P;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p090m3.c;

/* JADX INFO: loaded from: classes.dex */
final class zzbyx implements Executor {
    private final Handler zza = new K(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.zza.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            P p5 = o.f1952C.f1957c;
            Context contextZzd = o.f1952C.f1961g.zzd();
            if (contextZzd != null) {
                try {
                    if (((Boolean) zzbeh.zzb.zze()).booleanValue()) {
                        c.a(contextZzd, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }
}
