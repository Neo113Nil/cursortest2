package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.LongPressGateway;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/RowVersion;", "Lcom/goldenboot/saga/zone/LongPressGateway$BounceHandler;", "", "purgeNode", "()F", "scaleFactor", "Lcom/goldenboot/saga/zone/LongPressGateway$FeedbackFlow;", "getKey", "()Lcom/goldenboot/saga/zone/LongPressGateway$FeedbackFlow;", "key", "connectJob", "BounceHandler", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RowVersion extends LongPressGateway.BounceHandler {

    /* renamed from: connectJob, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.reduceScope;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator {
        public static LongPressGateway detachStream(RowVersion rowVersion, LongPressGateway longPressGateway) {
            return LongPressGateway.BounceHandler.ActivityMutator.detachStream(rowVersion, longPressGateway);
        }

        public static <R> R evictLayout(RowVersion rowVersion, R r, IconExporter iconExporter) {
            return (R) LongPressGateway.BounceHandler.ActivityMutator.evictLayout(rowVersion, r, iconExporter);
        }

        public static <E extends LongPressGateway.BounceHandler> E growPayload(RowVersion rowVersion, LongPressGateway.FeedbackFlow feedbackFlow) {
            return (E) LongPressGateway.BounceHandler.ActivityMutator.growPayload(rowVersion, feedbackFlow);
        }

        public static LongPressGateway injectMetric(RowVersion rowVersion, LongPressGateway.FeedbackFlow feedbackFlow) {
            return LongPressGateway.BounceHandler.ActivityMutator.injectMetric(rowVersion, feedbackFlow);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/goldenboot/saga/zone/RowVersion$BounceHandler;", "Lcom/goldenboot/saga/zone/LongPressGateway$FeedbackFlow;", "Lcom/goldenboot/saga/zone/RowVersion;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.RowVersion$BounceHandler, reason: from kotlin metadata */
    public static final class Companion implements LongPressGateway.FeedbackFlow {
        static final /* synthetic */ Companion reduceScope = new Companion();

        private Companion() {
        }
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway
    /* synthetic */ LongPressGateway detachStream(LongPressGateway.FeedbackFlow feedbackFlow);

    @Override // com.goldenboot.saga.zone.LongPressGateway.BounceHandler, com.goldenboot.saga.zone.LongPressGateway
    /* synthetic */ LongPressGateway.BounceHandler evictLayout(LongPressGateway.FeedbackFlow feedbackFlow);

    @Override // com.goldenboot.saga.zone.LongPressGateway.BounceHandler
    default LongPressGateway.FeedbackFlow getKey() {
        return INSTANCE;
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway
    /* synthetic */ LongPressGateway growPayload(LongPressGateway longPressGateway);

    @Override // com.goldenboot.saga.zone.LongPressGateway
    /* synthetic */ Object injectMetric(Object obj, IconExporter iconExporter);

    float purgeNode();
}
