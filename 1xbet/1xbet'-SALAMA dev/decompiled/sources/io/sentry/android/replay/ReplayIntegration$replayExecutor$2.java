package io.sentry.android.replay;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class ReplayIntegration$replayExecutor$2 extends i implements s6.a {
    public static final ReplayIntegration$replayExecutor$2 INSTANCE = new ReplayIntegration$replayExecutor$2();

    public ReplayIntegration$replayExecutor$2() {
        super(0);
    }

    @Override // s6.a
    public final ScheduledExecutorService invoke() {
        return Executors.newSingleThreadScheduledExecutor(new ReplayIntegration.ReplayExecutorServiceThreadFactory());
    }
}
