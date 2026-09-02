package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class PatternComposer extends ScopedFormer {
    public int detachStream;
    public DragHub injectMetric;
    public int releaseHeader;

    public PatternComposer(long j, DragHub dragHub) {
        super(j);
        this.injectMetric = dragHub;
    }

    public final DragHub applyTask() {
        return this.injectMetric;
    }

    public final void connectJob(DragHub dragHub) {
        this.injectMetric = dragHub;
    }

    @Override // com.goldenboot.saga.zone.ScopedFormer
    public ScopedFormer detachStream(long j) {
        return new PatternComposer(j, this.injectMetric);
    }

    public final int drawField() {
        return this.releaseHeader;
    }

    @Override // com.goldenboot.saga.zone.ScopedFormer
    public void injectMetric(ScopedFormer scopedFormer) {
        synchronized (TouchTransformer.evictLayout) {
            Intrinsics.checkNotNull(scopedFormer, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.injectMetric = ((PatternComposer) scopedFormer).injectMetric;
            this.detachStream = ((PatternComposer) scopedFormer).detachStream;
            this.releaseHeader = ((PatternComposer) scopedFormer).releaseHeader;
            DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
        }
    }

    public final void peekRevision(int i) {
        this.detachStream = i;
    }

    public final int popBlueprint() {
        return this.detachStream;
    }

    public final void serializeOffset(int i) {
        this.releaseHeader = i;
    }
}
