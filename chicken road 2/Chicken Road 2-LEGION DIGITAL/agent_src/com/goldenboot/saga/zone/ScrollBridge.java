package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.LongPressGateway;
import com.goldenboot.saga.zone.RowVersion;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/goldenboot/saga/zone/ScrollBridge;", "Lcom/goldenboot/saga/zone/RowVersion;", "<init>", "()V", "", "<set-?>", "reduceScope", "Lcom/goldenboot/saga/zone/SheetMux;", "purgeNode", "()F", "flushSample", "(F)V", "scaleFactor", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollBridge implements RowVersion {

    /* renamed from: reduceScope, reason: from kotlin metadata */
    private final SheetMux scaleFactor = RailMaintainer.evictLayout(1.0f);

    @Override // com.goldenboot.saga.zone.RowVersion, com.goldenboot.saga.zone.LongPressGateway
    public LongPressGateway detachStream(LongPressGateway.FeedbackFlow feedbackFlow) {
        return RowVersion.ActivityMutator.injectMetric(this, feedbackFlow);
    }

    @Override // com.goldenboot.saga.zone.RowVersion, com.goldenboot.saga.zone.LongPressGateway.BounceHandler, com.goldenboot.saga.zone.LongPressGateway
    public <E extends LongPressGateway.BounceHandler> E evictLayout(LongPressGateway.FeedbackFlow feedbackFlow) {
        return (E) RowVersion.ActivityMutator.growPayload(this, feedbackFlow);
    }

    public void flushSample(float f) {
        this.scaleFactor.flushSample(f);
    }

    @Override // com.goldenboot.saga.zone.RowVersion, com.goldenboot.saga.zone.LongPressGateway
    public LongPressGateway growPayload(LongPressGateway longPressGateway) {
        return RowVersion.ActivityMutator.detachStream(this, longPressGateway);
    }

    @Override // com.goldenboot.saga.zone.RowVersion, com.goldenboot.saga.zone.LongPressGateway
    public <R> R injectMetric(R r, IconExporter iconExporter) {
        return (R) RowVersion.ActivityMutator.evictLayout(this, r, iconExporter);
    }

    @Override // com.goldenboot.saga.zone.RowVersion
    public float purgeNode() {
        return this.scaleFactor.growPayload();
    }
}
