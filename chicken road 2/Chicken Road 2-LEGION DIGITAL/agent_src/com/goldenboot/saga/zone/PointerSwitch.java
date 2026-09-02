package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class PointerSwitch implements ContainerVersion {
    public final ProgressValve reduceScope;

    public PointerSwitch(ProgressValve progressValve) {
        this.reduceScope = progressValve;
    }

    @Override // com.goldenboot.saga.zone.ContainerVersion
    public void applyTask() {
        ProgressValve progressValve = this.reduceScope;
        if (progressValve instanceof NativeReducer) {
            ((NativeReducer) progressValve).injectMetric();
        } else {
            LayerArray.injectMetric(progressValve, new TextLatch());
        }
    }

    public final ProgressValve evictLayout() {
        return this.reduceScope;
    }

    @Override // com.goldenboot.saga.zone.ContainerVersion
    public void flushSample() {
        ProgressValve progressValve = this.reduceScope;
        if (progressValve instanceof NativeReducer) {
            ((NativeReducer) progressValve).injectMetric();
        } else {
            LayerArray.injectMetric(progressValve, new TextLatch());
        }
    }

    @Override // com.goldenboot.saga.zone.ContainerVersion
    public void connectJob() {
    }
}
