package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class PatternMap extends ProducerActivator implements SheetMux, FlingMulticaster {
    public ActivityMutator notifyMessage;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends ScopedFormer {
        public float injectMetric;

        public ActivityMutator(long j, float f) {
            super(j);
            this.injectMetric = f;
        }

        public final float applyTask() {
            return this.injectMetric;
        }

        @Override // com.goldenboot.saga.zone.ScopedFormer
        public ScopedFormer detachStream(long j) {
            return new ActivityMutator(j, this.injectMetric);
        }

        @Override // com.goldenboot.saga.zone.ScopedFormer
        public void injectMetric(ScopedFormer scopedFormer) {
            Intrinsics.checkNotNull(scopedFormer, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.injectMetric = ((ActivityMutator) scopedFormer).injectMetric;
        }

        public final void popBlueprint(float f) {
            this.injectMetric = f;
        }
    }

    public PatternMap(float f) {
        ItemGovernor dispatchTimezone = WaveBenchmark.dispatchTimezone();
        ActivityMutator activityMutator = new ActivityMutator(dispatchTimezone.applyTask(), f);
        if (!(dispatchTimezone instanceof SaveFilter)) {
            activityMutator.flushSample(new ActivityMutator(KeyboardGate.injectMetric(1), f));
        }
        this.notifyMessage = activityMutator;
    }

    @Override // com.goldenboot.saga.zone.BorderHook
    public void applyTask(ScopedFormer scopedFormer) {
        Intrinsics.checkNotNull(scopedFormer, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.notifyMessage = (ActivityMutator) scopedFormer;
    }

    @Override // com.goldenboot.saga.zone.SheetMux
    public void flushSample(float f) {
        ItemGovernor injectMetric;
        ActivityMutator activityMutator = (ActivityMutator) WaveBenchmark.unlockMessage(this.notifyMessage);
        if (activityMutator.applyTask() == f) {
            return;
        }
        ActivityMutator activityMutator2 = this.notifyMessage;
        synchronized (WaveBenchmark.mapJob()) {
            injectMetric = ItemGovernor.releaseHeader.injectMetric();
            ((ActivityMutator) WaveBenchmark.resetValue(activityMutator2, this, injectMetric, activityMutator)).popBlueprint(f);
            DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
        }
        WaveBenchmark.cancelArchive(injectMetric, this);
    }

    @Override // com.goldenboot.saga.zone.SheetMux, com.goldenboot.saga.zone.PagerThrottle
    public float growPayload() {
        return ((ActivityMutator) WaveBenchmark.locateSignal(this.notifyMessage, this)).applyTask();
    }

    @Override // com.goldenboot.saga.zone.BorderHook
    public ScopedFormer inflateAdapter(ScopedFormer scopedFormer, ScopedFormer scopedFormer2, ScopedFormer scopedFormer3) {
        Intrinsics.checkNotNull(scopedFormer2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        Intrinsics.checkNotNull(scopedFormer3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((ActivityMutator) scopedFormer2).applyTask() == ((ActivityMutator) scopedFormer3).applyTask()) {
            return scopedFormer2;
        }
        return null;
    }

    @Override // com.goldenboot.saga.zone.FlingMulticaster
    public BounceFacilitator injectMetric() {
        return BounceReader.attachConfig();
    }

    @Override // com.goldenboot.saga.zone.BorderHook
    public ScopedFormer releaseHeader() {
        return this.notifyMessage;
    }

    public String toString() {
        return "MutableFloatState(value=" + ((ActivityMutator) WaveBenchmark.unlockMessage(this.notifyMessage)).applyTask() + ")@" + hashCode();
    }
}
