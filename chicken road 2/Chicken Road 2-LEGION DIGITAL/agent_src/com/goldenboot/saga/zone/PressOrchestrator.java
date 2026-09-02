package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.HeaderGuard;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class PressOrchestrator {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public interface ActivityMutator {
        TouchRecord evictLayout();

        TouchRecord getKey();
    }

    public abstract HeaderGuard clipOrigin();

    public final int flushSample() {
        return clipOrigin().evictLayout();
    }

    public final Object releaseHeader(int i) {
        HeaderGuard.ActivityMutator activityMutator = clipOrigin().get(i);
        return ((ActivityMutator) activityMutator.injectMetric()).evictLayout().invoke(Integer.valueOf(i - activityMutator.growPayload()));
    }

    public final Object updateTimer(int i) {
        Object invoke;
        HeaderGuard.ActivityMutator activityMutator = clipOrigin().get(i);
        int growPayload = i - activityMutator.growPayload();
        TouchRecord key = ((ActivityMutator) activityMutator.injectMetric()).getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(growPayload))) == null) ? SystemGateway.evictLayout(i) : invoke;
    }
}
