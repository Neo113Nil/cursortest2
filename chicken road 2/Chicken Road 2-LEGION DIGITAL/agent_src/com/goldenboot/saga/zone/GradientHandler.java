package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class GradientHandler extends LegacyBootstrapper {
    public final Thread gatherAdapter;

    public GradientHandler(Thread thread) {
        this.gatherAdapter = thread;
    }

    @Override // com.goldenboot.saga.zone.StreamEvaluator
    public Thread protectGauge() {
        return this.gatherAdapter;
    }
}
