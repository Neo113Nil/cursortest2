package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.IndicatorPatch;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class LegacyBootstrapper extends StreamEvaluator implements IndicatorPatch {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater inflateAdapter = AtomicReferenceFieldUpdater.newUpdater(LegacyBootstrapper.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater purgeNode = AtomicReferenceFieldUpdater.newUpdater(LegacyBootstrapper.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater drawRequest = AtomicIntegerFieldUpdater.newUpdater(LegacyBootstrapper.class, "_isCompleted$volatile");

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public final class ActivityMutator extends FeedbackFlow {
        public final GroupSegment connectPatch;

        public ActivityMutator(long j, GroupSegment groupSegment) {
            super(j);
            this.connectPatch = groupSegment;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.connectPatch.injectConstraint(LegacyBootstrapper.this, DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.LegacyBootstrapper.FeedbackFlow
        public String toString() {
            return super.toString() + this.connectPatch;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends FeedbackFlow {
        public final Runnable connectPatch;

        public BounceHandler(long j, Runnable runnable) {
            super(j);
            this.connectPatch = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.connectPatch.run();
        }

        @Override // com.goldenboot.saga.zone.LegacyBootstrapper.FeedbackFlow
        public String toString() {
            return super.toString() + this.connectPatch;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static abstract class FeedbackFlow implements Runnable, Comparable, InternalBridge, TranslateDirector {
        private volatile Object _heap;
        public int notifyMessage = -1;
        public long reduceScope;

        public FeedbackFlow(long j) {
            this.reduceScope = j;
        }

        @Override // java.lang.Comparable
        /* renamed from: applyTask, reason: merged with bridge method [inline-methods] */
        public int compareTo(FeedbackFlow feedbackFlow) {
            long j = this.reduceScope - feedbackFlow.reduceScope;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        @Override // com.goldenboot.saga.zone.TranslateDirector
        public TranslateTrigger clipOrigin() {
            Object obj = this._heap;
            if (obj instanceof TranslateTrigger) {
                return (TranslateTrigger) obj;
            }
            return null;
        }

        public final boolean drawField(long j) {
            return j - this.reduceScope >= 0;
        }

        @Override // com.goldenboot.saga.zone.InternalBridge
        public final void evictLayout() {
            RowMutex rowMutex;
            RowMutex rowMutex2;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    rowMutex = StylusProvider.evictLayout;
                    if (obj == rowMutex) {
                        return;
                    }
                    LayerUseCase layerUseCase = obj instanceof LayerUseCase ? (LayerUseCase) obj : null;
                    if (layerUseCase != null) {
                        layerUseCase.updateTimer(this);
                    }
                    rowMutex2 = StylusProvider.evictLayout;
                    this._heap = rowMutex2;
                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.goldenboot.saga.zone.TranslateDirector
        public void flushSample(TranslateTrigger translateTrigger) {
            RowMutex rowMutex;
            Object obj = this._heap;
            rowMutex = StylusProvider.evictLayout;
            if (obj == rowMutex) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = translateTrigger;
        }

        @Override // com.goldenboot.saga.zone.TranslateDirector
        public int getIndex() {
            return this.notifyMessage;
        }

        public final int popBlueprint(long j, LayerUseCase layerUseCase, LegacyBootstrapper legacyBootstrapper) {
            RowMutex rowMutex;
            synchronized (this) {
                Object obj = this._heap;
                rowMutex = StylusProvider.evictLayout;
                if (obj == rowMutex) {
                    return 2;
                }
                synchronized (layerUseCase) {
                    try {
                        FeedbackFlow feedbackFlow = (FeedbackFlow) layerUseCase.growPayload();
                        if (legacyBootstrapper.parseAsset()) {
                            return 1;
                        }
                        if (feedbackFlow == null) {
                            layerUseCase.injectMetric = j;
                        } else {
                            long j2 = feedbackFlow.reduceScope;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - layerUseCase.injectMetric > 0) {
                                layerUseCase.injectMetric = j;
                            }
                        }
                        long j3 = this.reduceScope;
                        long j4 = layerUseCase.injectMetric;
                        if (j3 - j4 < 0) {
                            this.reduceScope = j4;
                        }
                        layerUseCase.evictLayout(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // com.goldenboot.saga.zone.TranslateDirector
        public void setIndex(int i) {
            this.notifyMessage = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.reduceScope + ']';
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class LayerUseCase extends TranslateTrigger {
        public long injectMetric;

        public LayerUseCase(long j) {
            this.injectMetric = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean parseAsset() {
        return drawRequest.get(this) != 0;
    }

    public final int appendEvent(long j, FeedbackFlow feedbackFlow) {
        if (parseAsset()) {
            return 1;
        }
        LayerUseCase layerUseCase = (LayerUseCase) purgeNode.get(this);
        if (layerUseCase == null) {
            OverlayDelta.evictLayout(purgeNode, this, null, new LayerUseCase(j));
            Object obj = purgeNode.get(this);
            Intrinsics.checkNotNull(obj);
            layerUseCase = (LayerUseCase) obj;
        }
        return feedbackFlow.popBlueprint(j, layerUseCase, this);
    }

    public final void commitKey() {
        inflateAdapter.set(this, null);
        purgeNode.set(this, null);
    }

    @Override // com.goldenboot.saga.zone.IndicatorPatch
    public void decodePath(long j, GroupSegment groupSegment) {
        long injectMetric = StylusProvider.injectMetric(j);
        if (injectMetric < 4611686018427387903L) {
            DpadDelta.evictLayout();
            long nanoTime = System.nanoTime();
            ActivityMutator activityMutator = new ActivityMutator(injectMetric + nanoTime, groupSegment);
            subscribeEvent(nanoTime, activityMutator);
            ApplicationChain.evictLayout(groupSegment, activityMutator);
        }
    }

    public final void drawConfig() {
        TranslateDirector translateDirector;
        LayerUseCase layerUseCase = (LayerUseCase) purgeNode.get(this);
        if (layerUseCase == null || layerUseCase.releaseHeader()) {
            return;
        }
        DpadDelta.evictLayout();
        long nanoTime = System.nanoTime();
        do {
            synchronized (layerUseCase) {
                try {
                    TranslateDirector growPayload = layerUseCase.growPayload();
                    if (growPayload != null) {
                        FeedbackFlow feedbackFlow = (FeedbackFlow) growPayload;
                        translateDirector = feedbackFlow.drawField(nanoTime) ? normalizeBundle(feedbackFlow) : false ? layerUseCase.applyTask(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((FeedbackFlow) translateDirector) != null);
    }

    public final InternalBridge executeConfig(long j, Runnable runnable) {
        long injectMetric = StylusProvider.injectMetric(j);
        if (injectMetric >= 4611686018427387903L) {
            return TapTracker.reduceScope;
        }
        DpadDelta.evictLayout();
        long nanoTime = System.nanoTime();
        BounceHandler bounceHandler = new BounceHandler(injectMetric + nanoTime, runnable);
        subscribeEvent(nanoTime, bounceHandler);
        return bounceHandler;
    }

    public final void executeRecord() {
        FeedbackFlow feedbackFlow;
        DpadDelta.evictLayout();
        long nanoTime = System.nanoTime();
        while (true) {
            LayerUseCase layerUseCase = (LayerUseCase) purgeNode.get(this);
            if (layerUseCase == null || (feedbackFlow = (FeedbackFlow) layerUseCase.popBlueprint()) == null) {
                return;
            } else {
                refreshCounter(nanoTime, feedbackFlow);
            }
        }
    }

    public InternalBridge expandArgs(long j, Runnable runnable, LongPressGateway longPressGateway) {
        return IndicatorPatch.ActivityMutator.evictLayout(this, j, runnable, longPressGateway);
    }

    public boolean formatMessage() {
        RowMutex rowMutex;
        if (!emitStrategy()) {
            return false;
        }
        LayerUseCase layerUseCase = (LayerUseCase) purgeNode.get(this);
        if (layerUseCase != null && !layerUseCase.releaseHeader()) {
            return false;
        }
        Object obj = inflateAdapter.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof BreadcrumbTree) {
            return ((BreadcrumbTree) obj).popBlueprint();
        }
        rowMutex = StylusProvider.growPayload;
        return obj == rowMutex;
    }

    public void growCallback(Runnable runnable) {
        drawConfig();
        if (normalizeBundle(runnable)) {
            compressVersion();
        } else {
            HoverConstructor.gatherAdapter.growCallback(runnable);
        }
    }

    @Override // com.goldenboot.saga.zone.ConnectionDeserializer
    public long handleFooter() {
        if (purgeMetric()) {
            return 0L;
        }
        drawConfig();
        Runnable peekDescriptor = peekDescriptor();
        if (peekDescriptor == null) {
            return injectField();
        }
        peekDescriptor.run();
        return 0L;
    }

    @Override // com.goldenboot.saga.zone.ConnectionDeserializer
    public long injectField() {
        FeedbackFlow feedbackFlow;
        RowMutex rowMutex;
        if (super.injectField() == 0) {
            return 0L;
        }
        Object obj = inflateAdapter.get(this);
        if (obj != null) {
            if (!(obj instanceof BreadcrumbTree)) {
                rowMutex = StylusProvider.growPayload;
                if (obj == rowMutex) {
                    return LongCompanionObject.MAX_VALUE;
                }
                return 0L;
            }
            if (!((BreadcrumbTree) obj).popBlueprint()) {
                return 0L;
            }
        }
        LayerUseCase layerUseCase = (LayerUseCase) purgeNode.get(this);
        if (layerUseCase == null || (feedbackFlow = (FeedbackFlow) layerUseCase.clipOrigin()) == null) {
            return LongCompanionObject.MAX_VALUE;
        }
        long j = feedbackFlow.reduceScope;
        DpadDelta.evictLayout();
        return CellEntry.clipOrigin(j - System.nanoTime(), 0L);
    }

    public final void loadItem(boolean z) {
        drawRequest.set(this, z ? 1 : 0);
    }

    public final boolean normalizeBundle(Runnable runnable) {
        RowMutex rowMutex;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = inflateAdapter;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (parseAsset()) {
                return false;
            }
            if (obj == null) {
                if (OverlayDelta.evictLayout(inflateAdapter, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof BreadcrumbTree) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                BreadcrumbTree breadcrumbTree = (BreadcrumbTree) obj;
                int evictLayout = breadcrumbTree.evictLayout(runnable);
                if (evictLayout == 0) {
                    return true;
                }
                if (evictLayout == 1) {
                    OverlayDelta.evictLayout(inflateAdapter, this, obj, breadcrumbTree.connectJob());
                } else if (evictLayout == 2) {
                    return false;
                }
            } else {
                rowMutex = StylusProvider.growPayload;
                if (obj == rowMutex) {
                    return false;
                }
                BreadcrumbTree breadcrumbTree2 = new BreadcrumbTree(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                breadcrumbTree2.evictLayout((Runnable) obj);
                breadcrumbTree2.evictLayout(runnable);
                if (OverlayDelta.evictLayout(inflateAdapter, this, obj, breadcrumbTree2)) {
                    return true;
                }
            }
        }
    }

    public final Runnable peekDescriptor() {
        RowMutex rowMutex;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = inflateAdapter;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof BreadcrumbTree) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                BreadcrumbTree breadcrumbTree = (BreadcrumbTree) obj;
                Object peekRevision = breadcrumbTree.peekRevision();
                if (peekRevision != BreadcrumbTree.updateTimer) {
                    return (Runnable) peekRevision;
                }
                OverlayDelta.evictLayout(inflateAdapter, this, obj, breadcrumbTree.connectJob());
            } else {
                rowMutex = StylusProvider.growPayload;
                if (obj == rowMutex) {
                    return null;
                }
                if (OverlayDelta.evictLayout(inflateAdapter, this, obj, null)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    @Override // com.goldenboot.saga.zone.ConnectionDeserializer
    public void shutdown() {
        PaletteLink.evictLayout.injectMetric();
        loadItem(true);
        validateOffset();
        while (handleFooter() <= 0) {
        }
        executeRecord();
    }

    public final void subscribeEvent(long j, FeedbackFlow feedbackFlow) {
        int appendEvent = appendEvent(j, feedbackFlow);
        if (appendEvent == 0) {
            if (updateConstraint(feedbackFlow)) {
                compressVersion();
            }
        } else if (appendEvent == 1) {
            refreshCounter(j, feedbackFlow);
        } else if (appendEvent != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    @Override // com.goldenboot.saga.zone.TooltipRunner
    public final void unlockMessage(LongPressGateway longPressGateway, Runnable runnable) {
        growCallback(runnable);
    }

    public final boolean updateConstraint(FeedbackFlow feedbackFlow) {
        LayerUseCase layerUseCase = (LayerUseCase) purgeNode.get(this);
        return (layerUseCase != null ? (FeedbackFlow) layerUseCase.clipOrigin() : null) == feedbackFlow;
    }

    public final void validateOffset() {
        RowMutex rowMutex;
        RowMutex rowMutex2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = inflateAdapter;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = inflateAdapter;
                rowMutex = StylusProvider.growPayload;
                if (OverlayDelta.evictLayout(atomicReferenceFieldUpdater2, this, null, rowMutex)) {
                    return;
                }
            } else {
                if (obj instanceof BreadcrumbTree) {
                    ((BreadcrumbTree) obj).detachStream();
                    return;
                }
                rowMutex2 = StylusProvider.growPayload;
                if (obj == rowMutex2) {
                    return;
                }
                BreadcrumbTree breadcrumbTree = new BreadcrumbTree(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                breadcrumbTree.evictLayout((Runnable) obj);
                if (OverlayDelta.evictLayout(inflateAdapter, this, obj, breadcrumbTree)) {
                    return;
                }
            }
        }
    }
}
