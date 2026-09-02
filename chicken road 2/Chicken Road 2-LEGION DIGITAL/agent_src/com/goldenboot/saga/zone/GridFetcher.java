package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class GridFetcher extends ProducerActivator implements FlingMulticaster {
    public ActivityMutator connectPatch;
    public final BounceFacilitator notifyMessage;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends ScopedFormer {
        public Object injectMetric;

        public ActivityMutator(long j, Object obj) {
            super(j);
            this.injectMetric = obj;
        }

        @Override // com.goldenboot.saga.zone.ScopedFormer
        /* renamed from: applyTask, reason: merged with bridge method [inline-methods] */
        public ActivityMutator detachStream(long j) {
            return new ActivityMutator(WaveBenchmark.dispatchTimezone().applyTask(), this.injectMetric);
        }

        public final void drawField(Object obj) {
            this.injectMetric = obj;
        }

        @Override // com.goldenboot.saga.zone.ScopedFormer
        public void injectMetric(ScopedFormer scopedFormer) {
            Intrinsics.checkNotNull(scopedFormer, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.injectMetric = ((ActivityMutator) scopedFormer).injectMetric;
        }

        public final Object popBlueprint() {
            return this.injectMetric;
        }
    }

    public GridFetcher(Object obj, BounceFacilitator bounceFacilitator) {
        this.notifyMessage = bounceFacilitator;
        ItemGovernor dispatchTimezone = WaveBenchmark.dispatchTimezone();
        ActivityMutator activityMutator = new ActivityMutator(dispatchTimezone.applyTask(), obj);
        if (!(dispatchTimezone instanceof SaveFilter)) {
            activityMutator.flushSample(new ActivityMutator(KeyboardGate.injectMetric(1), obj));
        }
        this.connectPatch = activityMutator;
    }

    @Override // com.goldenboot.saga.zone.BorderHook
    public void applyTask(ScopedFormer scopedFormer) {
        Intrinsics.checkNotNull(scopedFormer, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.connectPatch = (ActivityMutator) scopedFormer;
    }

    @Override // com.goldenboot.saga.zone.SlotDispatcher, com.goldenboot.saga.zone.MorphCreator
    public Object getValue() {
        return ((ActivityMutator) WaveBenchmark.locateSignal(this.connectPatch, this)).popBlueprint();
    }

    @Override // com.goldenboot.saga.zone.BorderHook
    public ScopedFormer inflateAdapter(ScopedFormer scopedFormer, ScopedFormer scopedFormer2, ScopedFormer scopedFormer3) {
        Intrinsics.checkNotNull(scopedFormer, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        ActivityMutator activityMutator = (ActivityMutator) scopedFormer;
        Intrinsics.checkNotNull(scopedFormer2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        ActivityMutator activityMutator2 = (ActivityMutator) scopedFormer2;
        Intrinsics.checkNotNull(scopedFormer3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        ActivityMutator activityMutator3 = (ActivityMutator) scopedFormer3;
        if (injectMetric().evictLayout(activityMutator2.popBlueprint(), activityMutator3.popBlueprint())) {
            return scopedFormer2;
        }
        Object growPayload = injectMetric().growPayload(activityMutator.popBlueprint(), activityMutator2.popBlueprint(), activityMutator3.popBlueprint());
        if (growPayload == null) {
            return null;
        }
        ActivityMutator detachStream = activityMutator3.detachStream(activityMutator3.clipOrigin());
        detachStream.drawField(growPayload);
        return detachStream;
    }

    @Override // com.goldenboot.saga.zone.FlingMulticaster
    public BounceFacilitator injectMetric() {
        return this.notifyMessage;
    }

    @Override // com.goldenboot.saga.zone.BorderHook
    public ScopedFormer releaseHeader() {
        return this.connectPatch;
    }

    @Override // com.goldenboot.saga.zone.SlotDispatcher
    public void setValue(Object obj) {
        ItemGovernor injectMetric;
        ActivityMutator activityMutator = (ActivityMutator) WaveBenchmark.unlockMessage(this.connectPatch);
        if (injectMetric().evictLayout(activityMutator.popBlueprint(), obj)) {
            return;
        }
        ActivityMutator activityMutator2 = this.connectPatch;
        synchronized (WaveBenchmark.mapJob()) {
            injectMetric = ItemGovernor.releaseHeader.injectMetric();
            ((ActivityMutator) WaveBenchmark.resetValue(activityMutator2, this, injectMetric, activityMutator)).drawField(obj);
            DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
        }
        WaveBenchmark.cancelArchive(injectMetric, this);
    }

    public String toString() {
        return "MutableState(value=" + ((ActivityMutator) WaveBenchmark.unlockMessage(this.connectPatch)).popBlueprint() + ")@" + hashCode();
    }
}
