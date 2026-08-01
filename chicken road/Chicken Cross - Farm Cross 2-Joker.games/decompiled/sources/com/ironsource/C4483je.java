package com.ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.je, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4483je extends ScheduledThreadPoolExecutor {
    /* JADX WARN: Multi-variable type inference failed */
    public C4483je() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e) {
                C4491k4.d().a(e);
                Thread.currentThread().interrupt();
            } catch (CancellationException e2) {
                C4491k4.d().a(e2);
            } catch (ExecutionException e3) {
                C4491k4.d().a(e3);
            }
        }
    }

    public /* synthetic */ C4483je(int i, ThreadFactory threadFactory, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C4501ke.f8290a : i, (i2 & 2) != 0 ? new ThreadFactoryC4390ea() : threadFactory);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4483je(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
    }
}
