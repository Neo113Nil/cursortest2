package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/goldenboot/saga/zone/SharedProfiler;", "", "Lcom/goldenboot/saga/zone/PinchReceiver;", "semanticsNode", "Lcom/goldenboot/saga/zone/ConnectionMemento;", "adjustedBounds", "<init>", "(Lcom/goldenboot/saga/zone/PinchReceiver;Lcom/goldenboot/saga/zone/ConnectionMemento;)V", "evictLayout", "Lcom/goldenboot/saga/zone/PinchReceiver;", "growPayload", "()Lcom/goldenboot/saga/zone/PinchReceiver;", "Lcom/goldenboot/saga/zone/ConnectionMemento;", "()Lcom/goldenboot/saga/zone/ConnectionMemento;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SharedProfiler {
    public static final int injectMetric = 8;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final PinchReceiver semanticsNode;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final ConnectionMemento adjustedBounds;

    public SharedProfiler(PinchReceiver pinchReceiver, ConnectionMemento connectionMemento) {
        this.semanticsNode = pinchReceiver;
        this.adjustedBounds = connectionMemento;
    }

    /* renamed from: evictLayout, reason: from getter */
    public final ConnectionMemento getAdjustedBounds() {
        return this.adjustedBounds;
    }

    /* renamed from: growPayload, reason: from getter */
    public final PinchReceiver getSemanticsNode() {
        return this.semanticsNode;
    }
}
