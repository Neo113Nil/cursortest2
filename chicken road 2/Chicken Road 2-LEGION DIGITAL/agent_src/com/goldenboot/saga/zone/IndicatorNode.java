package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class IndicatorNode {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements ElevationNode {
        public final /* synthetic */ PagerReducer notifyMessage;
        public final /* synthetic */ ChipSnapshot reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(ChipSnapshot chipSnapshot, PagerReducer pagerReducer) {
            super(0);
            this.reduceScope = chipSnapshot;
            this.notifyMessage = pagerReducer;
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final ChipSnapshot invoke() {
            ChipSnapshot chipSnapshot = this.reduceScope;
            if (chipSnapshot != null) {
                return chipSnapshot;
            }
            PagerReducer pagerReducer = this.notifyMessage;
            if (!pagerReducer.popBlueprint()) {
                pagerReducer = null;
            }
            if (pagerReducer != null) {
                return FocusCounter.peekRevision(ProgressPatch.updateTimer(pagerReducer.applyTask()));
            }
            return null;
        }
    }

    public static final Object evictLayout(CachedDeserializer cachedDeserializer, ChipSnapshot chipSnapshot, ServiceRegulator serviceRegulator) {
        if (!cachedDeserializer.getNode().getIsAttached()) {
            return DpadBuilder.evictLayout;
        }
        PagerReducer resetDelta = LayoutConstructor.resetDelta(cachedDeserializer);
        DragBridge evictLayout = PagerStatus.evictLayout(cachedDeserializer);
        if (evictLayout == null) {
            return DpadBuilder.evictLayout;
        }
        Object attachNode = evictLayout.attachNode(resetDelta, new ActivityMutator(chipSnapshot, resetDelta), serviceRegulator);
        return attachNode == RotateReceiver.releaseHeader() ? attachNode : DpadBuilder.evictLayout;
    }

    public static /* synthetic */ Object growPayload(CachedDeserializer cachedDeserializer, ChipSnapshot chipSnapshot, ServiceRegulator serviceRegulator, int i, Object obj) {
        if ((i & 1) != 0) {
            chipSnapshot = null;
        }
        return ConnectionRepository.evictLayout(cachedDeserializer, chipSnapshot, serviceRegulator);
    }
}
