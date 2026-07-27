package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class G9 implements IHandlerExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final Looper f5982a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5983b;

    /* renamed from: c, reason: collision with root package name */
    public final HandlerThreadC0594jb f5984c;

    public G9(String str) {
        this(a(str));
    }

    public static HandlerThreadC0594jb a(String str) {
        HandlerThreadC0594jb handlerThreadC0594jb = new HandlerThreadC0594jb(str + TokenBuilder.TOKEN_DELIMITER + Gd.f5987a.incrementAndGet());
        handlerThreadC0594jb.start();
        return handlerThreadC0594jb;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5983b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j3) {
        this.f5983b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Handler getHandler() {
        return this.f5983b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Looper getLooper() {
        return this.f5982a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z3;
        HandlerThreadC0594jb handlerThreadC0594jb = this.f5984c;
        synchronized (handlerThreadC0594jb) {
            z3 = handlerThreadC0594jb.f7613a;
        }
        return z3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(Runnable runnable) {
        this.f5983b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f5983b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC0594jb handlerThreadC0594jb = this.f5984c;
        synchronized (handlerThreadC0594jb) {
            handlerThreadC0594jb.f7613a = false;
            handlerThreadC0594jb.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f5983b.post(futureTask);
        return futureTask;
    }

    public G9(HandlerThreadC0594jb handlerThreadC0594jb) {
        this(handlerThreadC0594jb, handlerThreadC0594jb.getLooper(), new Handler(handlerThreadC0594jb.getLooper()));
    }

    public G9(HandlerThreadC0594jb handlerThreadC0594jb, Looper looper, Handler handler) {
        this.f5984c = handlerThreadC0594jb;
        this.f5982a = looper;
        this.f5983b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j3, TimeUnit timeUnit) {
        this.f5983b.postDelayed(runnable, timeUnit.toMillis(j3));
    }
}
