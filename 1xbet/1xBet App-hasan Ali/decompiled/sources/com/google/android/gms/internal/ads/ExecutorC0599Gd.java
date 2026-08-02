package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import q3.AbstractC2309b;

/* renamed from: com.google.android.gms.internal.ads.Gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0599Gd implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9190k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f9191l;

    public ExecutorC0599Gd(ExecutorService executorService, RE re) {
        this.f9190k = 1;
        this.f9191l = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f9190k) {
            case 0:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((T2.H) this.f9191l).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    T2.L l5 = P2.o.f4767B.f4771c;
                    Context context = P2.o.f4767B.f4774g.f8013e;
                    if (context != null) {
                        try {
                            if (((Boolean) AbstractC1461q8.f15106b.s()).booleanValue()) {
                                AbstractC2309b.a(context, th);
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    throw th;
                }
            default:
                ((ExecutorService) this.f9191l).execute(runnable);
                return;
        }
    }

    public ExecutorC0599Gd() {
        this.f9190k = 0;
        this.f9191l = new T2.H(Looper.getMainLooper(), 0);
    }
}
