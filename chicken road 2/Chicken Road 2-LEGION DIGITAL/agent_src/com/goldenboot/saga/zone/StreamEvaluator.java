package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.LegacyBootstrapper;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class StreamEvaluator extends ConnectionDeserializer {
    public final void compressVersion() {
        Thread protectGauge = protectGauge();
        if (Thread.currentThread() != protectGauge) {
            DpadDelta.evictLayout();
            LockSupport.unpark(protectGauge);
        }
    }

    public abstract Thread protectGauge();

    public void refreshCounter(long j, LegacyBootstrapper.FeedbackFlow feedbackFlow) {
        HoverConstructor.gatherAdapter.subscribeEvent(j, feedbackFlow);
    }
}
