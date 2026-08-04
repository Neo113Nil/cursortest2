package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14472a;

    public /* synthetic */ g(int i7) {
        this.f14472a = i7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14472a) {
            case 0:
                return NoOpSentryExecutorService.lambda$schedule$2();
            case 1:
                return NoOpSentryExecutorService.lambda$submit$1();
            case 2:
                return NoOpSentryExecutorService.lambda$submit$0();
            case 3:
                return InetAddress.getLocalHost();
            default:
                return ProfilingTraceData.lambda$new$0();
        }
    }
}
