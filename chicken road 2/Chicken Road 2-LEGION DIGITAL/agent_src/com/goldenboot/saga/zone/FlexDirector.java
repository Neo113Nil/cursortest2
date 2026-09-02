package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.AttrSemaphore;
import com.goldenboot.saga.zone.LongPressGateway;
import com.goldenboot.saga.zone.VibrationSignal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class FlexDirector implements VibrationSignal {
    public Throwable connectPatch;
    public final ElevationNode reduceScope;
    public final Object notifyMessage = new Object();
    public final SwipeFormer attachConfig = ActivityMutator.growPayload();
    public SlotWorkflow resetDelta = new SlotWorkflow(0, 1, null);
    public SlotWorkflow inflateAdapter = new SlotWorkflow(0, 1, null);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler {
        public TouchRecord evictLayout;
        public GroupSegment growPayload;

        public BounceHandler(TouchRecord touchRecord, GroupSegment groupSegment) {
            this.evictLayout = touchRecord;
            this.growPayload = groupSegment;
        }

        public final void evictLayout() {
            this.evictLayout = null;
            this.growPayload = null;
        }

        public final void growPayload(long j) {
            GroupSegment groupSegment;
            Object growPayload;
            TouchRecord touchRecord = this.evictLayout;
            if (touchRecord == null || (groupSegment = this.growPayload) == null) {
                return;
            }
            try {
                AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
                growPayload = AttrSemaphore.growPayload(touchRecord.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                AttrSemaphore.ActivityMutator activityMutator2 = AttrSemaphore.notifyMessage;
                growPayload = AttrSemaphore.growPayload(ColumnForger.evictLayout(th));
            }
            groupSegment.resumeWith(growPayload);
        }

        public final void injectMetric(Throwable th) {
            GroupSegment groupSegment = this.growPayload;
            if (groupSegment != null) {
                AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
                groupSegment.resumeWith(AttrSemaphore.growPayload(ColumnForger.evictLayout(th)));
            }
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow implements TouchRecord {
        public final /* synthetic */ Ref.IntRef connectPatch;
        public final /* synthetic */ FlexDirector notifyMessage;
        public final /* synthetic */ BounceHandler reduceScope;

        public FeedbackFlow(BounceHandler bounceHandler, FlexDirector flexDirector, Ref.IntRef intRef) {
            this.reduceScope = bounceHandler;
            this.notifyMessage = flexDirector;
            this.connectPatch = intRef;
        }

        public final void evictLayout(Throwable th) {
            int i;
            this.reduceScope.evictLayout();
            SwipeFormer swipeFormer = this.notifyMessage.attachConfig;
            int i2 = this.connectPatch.element;
            do {
                i = swipeFormer.get();
            } while (!swipeFormer.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((Throwable) obj);
            return DpadBuilder.evictLayout;
        }
    }

    public FlexDirector(ElevationNode elevationNode) {
        this.reduceScope = elevationNode;
    }

    public final void decodePath(Throwable th) {
        int i;
        synchronized (this.notifyMessage) {
            try {
                if (this.connectPatch != null) {
                    return;
                }
                this.connectPatch = th;
                SlotWorkflow slotWorkflow = this.resetDelta;
                Object[] objArr = slotWorkflow.evictLayout;
                int i2 = slotWorkflow.growPayload;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((BounceHandler) objArr[i3]).injectMetric(th);
                }
                this.resetDelta.serializeOffset();
                SwipeFormer swipeFormer = this.attachConfig;
                do {
                    i = swipeFormer.get();
                } while (!swipeFormer.compareAndSet(i, ActivityMutator.detachStream(swipeFormer, ((i >>> 27) & 15) + 1, 0)));
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway
    public LongPressGateway detachStream(LongPressGateway.FeedbackFlow feedbackFlow) {
        return VibrationSignal.ActivityMutator.injectMetric(this, feedbackFlow);
    }

    @Override // com.goldenboot.saga.zone.VibrationSignal
    public Object drawScope(TouchRecord touchRecord, ServiceRegulator serviceRegulator) {
        int i;
        int i2;
        boolean z = true;
        DragMutex dragMutex = new DragMutex(ChipExporter.injectMetric(serviceRegulator), 1);
        dragMutex.expandArgs();
        BounceHandler bounceHandler = new BounceHandler(touchRecord, dragMutex);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        synchronized (this.notifyMessage) {
            Throwable th = this.connectPatch;
            if (th != null) {
                AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
                dragMutex.resumeWith(AttrSemaphore.growPayload(ColumnForger.evictLayout(th)));
            } else {
                SwipeFormer swipeFormer = this.attachConfig;
                do {
                    i = swipeFormer.get();
                    i2 = i + 1;
                } while (!swipeFormer.compareAndSet(i, i2));
                if ((134217727 & i2) != 1) {
                    z = false;
                }
                intRef.element = (i2 >>> 27) & 15;
                this.resetDelta.drawField(bounceHandler);
                dragMutex.storeCharset(new FeedbackFlow(bounceHandler, this, intRef));
                if (z && this.reduceScope != null) {
                    try {
                        this.reduceScope.invoke();
                    } catch (Throwable th2) {
                        decodePath(th2);
                    }
                }
            }
        }
        Object inflateAdapter = dragMutex.inflateAdapter();
        if (inflateAdapter == RotateReceiver.releaseHeader()) {
            FeatureMeter.injectMetric(serviceRegulator);
        }
        return inflateAdapter;
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway.BounceHandler, com.goldenboot.saga.zone.LongPressGateway
    public LongPressGateway.BounceHandler evictLayout(LongPressGateway.FeedbackFlow feedbackFlow) {
        return VibrationSignal.ActivityMutator.growPayload(this, feedbackFlow);
    }

    public final boolean expandArgs() {
        return (this.attachConfig.get() & 134217727) > 0;
    }

    public final void findTask(long j) {
        int i;
        int i2;
        synchronized (this.notifyMessage) {
            try {
                SlotWorkflow slotWorkflow = this.resetDelta;
                this.resetDelta = this.inflateAdapter;
                this.inflateAdapter = slotWorkflow;
                SwipeFormer swipeFormer = this.attachConfig;
                do {
                    i = swipeFormer.get();
                } while (!swipeFormer.compareAndSet(i, ActivityMutator.detachStream(swipeFormer, ((i >>> 27) & 15) + 1, 0)));
                int detachStream = slotWorkflow.detachStream();
                for (i2 = 0; i2 < detachStream; i2++) {
                    ((BounceHandler) slotWorkflow.injectMetric(i2)).growPayload(j);
                }
                slotWorkflow.serializeOffset();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway
    public LongPressGateway growPayload(LongPressGateway longPressGateway) {
        return VibrationSignal.ActivityMutator.detachStream(this, longPressGateway);
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway
    public Object injectMetric(Object obj, IconExporter iconExporter) {
        return VibrationSignal.ActivityMutator.evictLayout(this, obj, iconExporter);
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public static final C0109ActivityMutator evictLayout = new C0109ActivityMutator(null);

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.FlexDirector$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0109ActivityMutator {
            public /* synthetic */ C0109ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0109ActivityMutator() {
            }
        }

        public static final int detachStream(SwipeFormer swipeFormer, int i, int i2) {
            return ((i & 15) << 27) | (134217727 & i2);
        }

        public static SwipeFormer growPayload() {
            return injectMetric(new SwipeFormer(0));
        }

        public static SwipeFormer injectMetric(SwipeFormer swipeFormer) {
            return swipeFormer;
        }
    }
}
