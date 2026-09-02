package com.goldenboot.saga.zone;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class PublisherSender implements SelectionTimer, ContentConfigurator {
    public final TouchRecord applyTask;
    public final /* synthetic */ ContentConfigurator attachConfig;
    public final ProgressValve clipOrigin;
    public final int connectJob;
    public final int connectPatch;
    public float detachStream;
    public final int drawField;
    public final HoverPort evictLayout;
    public final BackgroundCollection flushSample;
    public int growPayload;
    public boolean injectMetric;
    public final int notifyMessage;
    public final int peekRevision;
    public final List popBlueprint;
    public final BounceSplitter reduceScope;
    public final boolean releaseHeader;
    public final boolean serializeOffset;
    public final int updateTimer;

    public PublisherSender(HoverPort hoverPort, int i, boolean z, float f, ContentConfigurator contentConfigurator, boolean z2, ProgressValve progressValve, BackgroundCollection backgroundCollection, int i2, TouchRecord touchRecord, List list, int i3, int i4, int i5, boolean z3, BounceSplitter bounceSplitter, int i6, int i7) {
        this.evictLayout = hoverPort;
        this.growPayload = i;
        this.injectMetric = z;
        this.detachStream = f;
        this.releaseHeader = z2;
        this.clipOrigin = progressValve;
        this.flushSample = backgroundCollection;
        this.updateTimer = i2;
        this.applyTask = touchRecord;
        this.popBlueprint = list;
        this.drawField = i3;
        this.connectJob = i4;
        this.peekRevision = i5;
        this.serializeOffset = z3;
        this.reduceScope = bounceSplitter;
        this.notifyMessage = i6;
        this.connectPatch = i7;
        this.attachConfig = contentConfigurator;
    }

    @Override // com.goldenboot.saga.zone.SelectionTimer
    public List applyTask() {
        return this.popBlueprint;
    }

    public final boolean attachConfig(int i) {
        HoverPort hoverPort;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (!this.releaseHeader && !applyTask().isEmpty() && (hoverPort = this.evictLayout) != null) {
            int detachStream = hoverPort.detachStream();
            int i2 = this.growPayload - i;
            if (i2 >= 0 && i2 < detachStream) {
                DrawerPhase drawerPhase = (DrawerPhase) CursorCollector.formatPosition(applyTask());
                DrawerPhase drawerPhase2 = (DrawerPhase) CursorCollector.emitStrategy(applyTask());
                if (!drawerPhase.resetDelta() && !drawerPhase2.resetDelta() && (i >= 0 ? Math.min(updateTimer() - DividerAggregator.evictLayout(drawerPhase, releaseHeader()), injectMetric() - DividerAggregator.evictLayout(drawerPhase2, releaseHeader())) > i : Math.min((DividerAggregator.evictLayout(drawerPhase, releaseHeader()) + drawerPhase.detachStream()) - updateTimer(), (DividerAggregator.evictLayout(drawerPhase2, releaseHeader()) + drawerPhase2.detachStream()) - injectMetric()) > (-i))) {
                    this.growPayload -= i;
                    List applyTask = applyTask();
                    int size = applyTask.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((DrawerPhase) applyTask.get(i3)).reduceScope(i);
                    }
                    this.detachStream = i;
                    z = true;
                    z = true;
                    z = true;
                    if (!this.injectMetric && i > 0) {
                        this.injectMetric = true;
                    }
                }
            }
        }
        return z;
    }

    @Override // com.goldenboot.saga.zone.SelectionTimer
    public int clipOrigin() {
        return -updateTimer();
    }

    public final boolean connectJob() {
        HoverPort hoverPort = this.evictLayout;
        return ((hoverPort != null ? hoverPort.evictLayout() : 0) == 0 && this.growPayload == 0) ? false : true;
    }

    public final TouchRecord connectPatch() {
        return this.applyTask;
    }

    @Override // com.goldenboot.saga.zone.SelectionTimer
    public int detachStream() {
        return this.peekRevision;
    }

    @Override // com.goldenboot.saga.zone.ContentConfigurator
    /* renamed from: drawField */
    public TouchRecord getDetachStream() {
        return this.attachConfig.getDetachStream();
    }

    @Override // com.goldenboot.saga.zone.SelectionTimer
    public long evictLayout() {
        return ProgressPatch.evictLayout(getEvictLayout(), getGrowPayload());
    }

    @Override // com.goldenboot.saga.zone.SelectionTimer
    public int flushSample() {
        return this.connectPatch;
    }

    @Override // com.goldenboot.saga.zone.ContentConfigurator
    /* renamed from: getHeight */
    public int getGrowPayload() {
        return this.attachConfig.getGrowPayload();
    }

    @Override // com.goldenboot.saga.zone.ContentConfigurator
    /* renamed from: getWidth */
    public int getEvictLayout() {
        return this.attachConfig.getEvictLayout();
    }

    @Override // com.goldenboot.saga.zone.SelectionTimer
    public int growPayload() {
        return this.notifyMessage;
    }

    @Override // com.goldenboot.saga.zone.ContentConfigurator
    public Map injectConstraint() {
        return this.attachConfig.injectConstraint();
    }

    @Override // com.goldenboot.saga.zone.SelectionTimer
    public int injectMetric() {
        return this.connectJob;
    }

    public final int notifyMessage() {
        return this.growPayload;
    }

    public final boolean peekRevision() {
        return this.injectMetric;
    }

    @Override // com.goldenboot.saga.zone.ContentConfigurator
    public void popBlueprint() {
        this.attachConfig.popBlueprint();
    }

    public final HoverPort reduceScope() {
        return this.evictLayout;
    }

    @Override // com.goldenboot.saga.zone.SelectionTimer
    public BounceSplitter releaseHeader() {
        return this.reduceScope;
    }

    public final float serializeOffset() {
        return this.detachStream;
    }

    @Override // com.goldenboot.saga.zone.SelectionTimer
    public int updateTimer() {
        return this.drawField;
    }
}
