package io.sentry.android.replay;

import io.sentry.android.replay.WindowRecorder;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import t6.i;

/* loaded from: classes2.dex */
public final class WindowRecorder$capturer$2 extends i implements s6.a {
    public static final WindowRecorder$capturer$2 INSTANCE = new WindowRecorder$capturer$2();

    public WindowRecorder$capturer$2() {
        super(0);
    }

    @Override // s6.a
    public final ScheduledExecutorService invoke() {
        return Executors.newSingleThreadScheduledExecutor(new WindowRecorder.RecorderExecutorServiceThreadFactory());
    }
}
