package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class DefaultMaintainer {
    public ServiceFetcher detachStream;
    public ContextStage evictLayout;
    public PulseCounter growPayload;
    public SlideDrain injectMetric;

    public DefaultMaintainer(ContextStage contextStage, PulseCounter pulseCounter, SlideDrain slideDrain, ServiceFetcher serviceFetcher) {
        this.evictLayout = contextStage;
        this.growPayload = pulseCounter;
        this.injectMetric = slideDrain;
        this.detachStream = serviceFetcher;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultMaintainer)) {
            return false;
        }
        DefaultMaintainer defaultMaintainer = (DefaultMaintainer) obj;
        return Intrinsics.areEqual(this.evictLayout, defaultMaintainer.evictLayout) && Intrinsics.areEqual(this.growPayload, defaultMaintainer.growPayload) && Intrinsics.areEqual(this.injectMetric, defaultMaintainer.injectMetric) && Intrinsics.areEqual(this.detachStream, defaultMaintainer.detachStream);
    }

    public final ServiceFetcher flushSample() {
        ServiceFetcher serviceFetcher = this.detachStream;
        if (serviceFetcher != null) {
            return serviceFetcher;
        }
        ServiceFetcher evictLayout = DelegateAnalyzer.evictLayout();
        this.detachStream = evictLayout;
        return evictLayout;
    }

    public int hashCode() {
        ContextStage contextStage = this.evictLayout;
        int hashCode = (contextStage == null ? 0 : contextStage.hashCode()) * 31;
        PulseCounter pulseCounter = this.growPayload;
        int hashCode2 = (hashCode + (pulseCounter == null ? 0 : pulseCounter.hashCode())) * 31;
        SlideDrain slideDrain = this.injectMetric;
        int hashCode3 = (hashCode2 + (slideDrain == null ? 0 : slideDrain.hashCode())) * 31;
        ServiceFetcher serviceFetcher = this.detachStream;
        return hashCode3 + (serviceFetcher != null ? serviceFetcher.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.evictLayout + ", canvas=" + this.growPayload + ", canvasDrawScope=" + this.injectMetric + ", borderPath=" + this.detachStream + ')';
    }

    public /* synthetic */ DefaultMaintainer(ContextStage contextStage, PulseCounter pulseCounter, SlideDrain slideDrain, ServiceFetcher serviceFetcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contextStage, (i & 2) != 0 ? null : pulseCounter, (i & 4) != 0 ? null : slideDrain, (i & 8) != 0 ? null : serviceFetcher);
    }
}
