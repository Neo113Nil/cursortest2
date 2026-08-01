package com.ironsource;

import com.ironsource.Ff;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class J5 implements Ff {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f7712a;

    public J5(ScheduledExecutorService executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f7712a = executor;
    }

    @Override // com.ironsource.Ff
    public Ff.a a(long j, Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        final ScheduledFuture<?> schedule = this.f7712a.schedule(runnable, j, TimeUnit.MILLISECONDS);
        return new Ff.a() { // from class: com.ironsource.J5$$ExternalSyntheticLambda0
            @Override // com.ironsource.Ff.a
            public final void cancel() {
                J5.a(schedule);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ScheduledFuture scheduledFuture) {
        scheduledFuture.cancel(false);
    }
}
