package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/goldenboot/saga/zone/DpadBucket;", "", "Lcom/goldenboot/saga/zone/PinchReceiver;", "node", "", "depth", "Lcom/goldenboot/saga/zone/ConnectionMemento;", "viewportBoundsInWindow", "Lcom/goldenboot/saga/zone/PagerReducer;", "coordinates", "<init>", "(Lcom/goldenboot/saga/zone/PinchReceiver;ILcom/goldenboot/saga/zone/ConnectionMemento;Lcom/goldenboot/saga/zone/PagerReducer;)V", "", "toString", "()Ljava/lang/String;", "evictLayout", "Lcom/goldenboot/saga/zone/PinchReceiver;", "injectMetric", "()Lcom/goldenboot/saga/zone/PinchReceiver;", "growPayload", "I", "()I", "Lcom/goldenboot/saga/zone/ConnectionMemento;", "detachStream", "()Lcom/goldenboot/saga/zone/ConnectionMemento;", "Lcom/goldenboot/saga/zone/PagerReducer;", "()Lcom/goldenboot/saga/zone/PagerReducer;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.DpadBucket, reason: from toString */
/* loaded from: classes.dex */
final class ScrollCaptureCandidate {

    /* renamed from: detachStream, reason: from kotlin metadata and from toString */
    private final PagerReducer coordinates;

    /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
    private final PinchReceiver node;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private final int depth;

    /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
    private final ConnectionMemento viewportBoundsInWindow;

    public ScrollCaptureCandidate(PinchReceiver pinchReceiver, int i, ConnectionMemento connectionMemento, PagerReducer pagerReducer) {
        this.node = pinchReceiver;
        this.depth = i;
        this.viewportBoundsInWindow = connectionMemento;
        this.coordinates = pagerReducer;
    }

    /* renamed from: detachStream, reason: from getter */
    public final ConnectionMemento getViewportBoundsInWindow() {
        return this.viewportBoundsInWindow;
    }

    /* renamed from: evictLayout, reason: from getter */
    public final PagerReducer getCoordinates() {
        return this.coordinates;
    }

    /* renamed from: growPayload, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    /* renamed from: injectMetric, reason: from getter */
    public final PinchReceiver getNode() {
        return this.node;
    }

    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.node + ", depth=" + this.depth + ", viewportBoundsInWindow=" + this.viewportBoundsInWindow + ", coordinates=" + this.coordinates + ')';
    }
}
