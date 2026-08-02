package io.sentry;

import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14466a;

    public /* synthetic */ g(int i7) {
        this.f14466a = i7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$schedule$2;
        Object lambda$submit$1;
        Object lambda$submit$0;
        InetAddress localHost;
        List lambda$new$0;
        switch (this.f14466a) {
            case 0:
                lambda$schedule$2 = NoOpSentryExecutorService.lambda$schedule$2();
                return lambda$schedule$2;
            case 1:
                lambda$submit$1 = NoOpSentryExecutorService.lambda$submit$1();
                return lambda$submit$1;
            case 2:
                lambda$submit$0 = NoOpSentryExecutorService.lambda$submit$0();
                return lambda$submit$0;
            case 3:
                localHost = InetAddress.getLocalHost();
                return localHost;
            default:
                lambda$new$0 = ProfilingTraceData.lambda$new$0();
                return lambda$new$0;
        }
    }
}
