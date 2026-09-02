package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.LongPressGateway;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ActivitySplitter implements LongPressGateway.BounceHandler {
    public static final ActivityMutator reduceScope = new ActivityMutator(null);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements LongPressGateway.FeedbackFlow {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public ActivityMutator() {
        }
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway
    public LongPressGateway detachStream(LongPressGateway.FeedbackFlow feedbackFlow) {
        return LongPressGateway.BounceHandler.ActivityMutator.injectMetric(this, feedbackFlow);
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway.BounceHandler, com.goldenboot.saga.zone.LongPressGateway
    public LongPressGateway.BounceHandler evictLayout(LongPressGateway.FeedbackFlow feedbackFlow) {
        return LongPressGateway.BounceHandler.ActivityMutator.growPayload(this, feedbackFlow);
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway.BounceHandler
    public LongPressGateway.FeedbackFlow getKey() {
        return reduceScope;
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway
    public LongPressGateway growPayload(LongPressGateway longPressGateway) {
        return LongPressGateway.BounceHandler.ActivityMutator.detachStream(this, longPressGateway);
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway
    public Object injectMetric(Object obj, IconExporter iconExporter) {
        return LongPressGateway.BounceHandler.ActivityMutator.evictLayout(this, obj, iconExporter);
    }
}
