package io.sentry.android.replay.capture;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import s6.a;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseCaptureStrategy$persistingExecutor$2 extends i implements a {
    public static final BaseCaptureStrategy$persistingExecutor$2 INSTANCE = new BaseCaptureStrategy$persistingExecutor$2();

    public BaseCaptureStrategy$persistingExecutor$2() {
        super(0);
    }

    @Override // s6.a
    public final ScheduledExecutorService invoke() {
        return Executors.newSingleThreadScheduledExecutor(new BaseCaptureStrategy.ReplayPersistingExecutorServiceThreadFactory());
    }
}
