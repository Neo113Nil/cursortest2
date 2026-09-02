package com.goldenboot.saga.zone;

import java.util.Map;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class DoubleTapGate extends ItemGovernor {
    public final TouchRecord flushSample;
    public final ItemGovernor updateTimer;

    public DoubleTapGate(long j, BridgeAdministrator bridgeAdministrator, TouchRecord touchRecord, ItemGovernor itemGovernor) {
        super(j, bridgeAdministrator, null);
        this.flushSample = touchRecord;
        this.updateTimer = itemGovernor;
        itemGovernor.peekRevision(this);
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    public void detachStream() {
        if (releaseHeader()) {
            return;
        }
        if (applyTask() != this.updateTimer.applyTask()) {
            growPayload();
        }
        this.updateTimer.serializeOffset(this);
        super.detachStream();
        DimenChannel.detachStream(this);
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    public TouchRecord drawField() {
        return null;
    }

    public final ItemGovernor findTask() {
        return this.updateTimer;
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    /* renamed from: flattenPackage, reason: merged with bridge method [inline-methods] */
    public Void serializeOffset(ItemGovernor itemGovernor) {
        AlarmGuard.growPayload();
        throw new ShadowBroadcaster();
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    /* renamed from: injectConstraint, reason: merged with bridge method [inline-methods] */
    public Void notifyMessage(BorderHook borderHook) {
        WaveBenchmark.handleFooter();
        throw new ShadowBroadcaster();
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    /* renamed from: mergeLocale, reason: merged with bridge method [inline-methods] */
    public TouchRecord flushSample() {
        return this.flushSample;
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    /* renamed from: storeCharset, reason: merged with bridge method [inline-methods] */
    public DoubleTapGate decodePath(TouchRecord touchRecord) {
        DragHub dragHub;
        Map map;
        dragHub = DimenChannel.evictLayout;
        if (dragHub != null) {
            AlarmFacilitator releaseHeader = DimenChannel.releaseHeader(dragHub, this, true, touchRecord, null);
            SingletonFacilitator singletonFacilitator = (SingletonFacilitator) releaseHeader.injectMetric();
            TouchRecord evictLayout = singletonFacilitator.evictLayout();
            singletonFacilitator.growPayload();
            map = (Map) releaseHeader.detachStream();
            touchRecord = evictLayout;
        } else {
            map = null;
        }
        DoubleTapGate doubleTapGate = new DoubleTapGate(applyTask(), clipOrigin(), WaveBenchmark.prepareTask(touchRecord, flushSample(), false, 4, null), findTask());
        if (dragHub != null) {
            DimenChannel.growPayload(dragHub, this, doubleTapGate, map);
        }
        return doubleTapGate;
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    /* renamed from: syncScope, reason: merged with bridge method [inline-methods] */
    public Void peekRevision(ItemGovernor itemGovernor) {
        AlarmGuard.growPayload();
        throw new ShadowBroadcaster();
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    public boolean updateTimer() {
        return true;
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    public void reduceScope() {
    }
}
