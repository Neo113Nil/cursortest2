package io.sentry.android.core;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        List lambda$onTransactionFinish$0;
        lambda$onTransactionFinish$0 = AndroidTransactionProfiler.lambda$onTransactionFinish$0();
        return lambda$onTransactionFinish$0;
    }
}
