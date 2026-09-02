package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class InterpolatorReporter implements SessionPhase {
    public final float detachStream;
    public final float evictLayout;
    public final float growPayload;
    public final float injectMetric;

    public /* synthetic */ InterpolatorReporter(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    @Override // com.goldenboot.saga.zone.SessionPhase
    public float detachStream(LabelCache labelCache) {
        return labelCache == LabelCache.reduceScope ? this.evictLayout : this.injectMetric;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InterpolatorReporter)) {
            return false;
        }
        InterpolatorReporter interpolatorReporter = (InterpolatorReporter) obj;
        return InsetsEdge.notifyMessage(this.evictLayout, interpolatorReporter.evictLayout) && InsetsEdge.notifyMessage(this.growPayload, interpolatorReporter.growPayload) && InsetsEdge.notifyMessage(this.injectMetric, interpolatorReporter.injectMetric) && InsetsEdge.notifyMessage(this.detachStream, interpolatorReporter.detachStream);
    }

    @Override // com.goldenboot.saga.zone.SessionPhase
    public float evictLayout() {
        return this.detachStream;
    }

    @Override // com.goldenboot.saga.zone.SessionPhase
    public float growPayload(LabelCache labelCache) {
        return labelCache == LabelCache.reduceScope ? this.injectMetric : this.evictLayout;
    }

    public int hashCode() {
        return (((((InsetsEdge.attachConfig(this.evictLayout) * 31) + InsetsEdge.attachConfig(this.growPayload)) * 31) + InsetsEdge.attachConfig(this.injectMetric)) * 31) + InsetsEdge.attachConfig(this.detachStream);
    }

    @Override // com.goldenboot.saga.zone.SessionPhase
    public float injectMetric() {
        return this.growPayload;
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) InsetsEdge.gatherAdapter(this.evictLayout)) + ", top=" + ((Object) InsetsEdge.gatherAdapter(this.growPayload)) + ", end=" + ((Object) InsetsEdge.gatherAdapter(this.injectMetric)) + ", bottom=" + ((Object) InsetsEdge.gatherAdapter(this.detachStream)) + ')';
    }

    public InterpolatorReporter(float f, float f2, float f3, float f4) {
        this.evictLayout = f;
        this.growPayload = f2;
        this.injectMetric = f3;
        this.detachStream = f4;
        if (f < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }
}
