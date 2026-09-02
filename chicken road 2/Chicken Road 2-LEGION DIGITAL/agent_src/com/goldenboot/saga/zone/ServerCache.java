package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ServerCache implements StepperDiff {
    public final AnimOrchestrator evictLayout;

    public ServerCache(AnimOrchestrator animOrchestrator) {
        this.evictLayout = animOrchestrator;
    }

    public final AnimOrchestrator evictLayout() {
        return this.evictLayout;
    }
}
