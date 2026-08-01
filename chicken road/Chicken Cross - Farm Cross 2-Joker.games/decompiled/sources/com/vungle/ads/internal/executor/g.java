package com.vungle.ads.internal.executor;

import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class g {
    public static final h a(Runnable runnable, Runnable runnable2) {
        int i = j.b;
        return runnable instanceof com.vungle.ads.internal.task.i ? new e(runnable, runnable2) : new f(runnable, runnable2);
    }

    public static Callable b(final Callable callable, final i iVar) {
        return new Callable() { // from class: com.vungle.ads.internal.executor.g$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.a(callable, iVar);
            }
        };
    }

    public static final Object a(Callable command, Function0 failFallback) {
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(failFallback, "$failFallback");
        try {
            return command.call();
        } catch (OutOfMemoryError unused) {
            failFallback.invoke();
            return null;
        }
    }
}
