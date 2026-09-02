package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.NotificationFence;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class WaveCycle {
    public static final int clipOrigin = 8;
    public final String evictLayout;
    public final PluginScheduler growPayload = new PluginScheduler(new ActivityMutator[16], 0);
    public final SlotDispatcher injectMetric = StylusDetector.releaseHeader(Boolean.FALSE, null, 2, null);
    public long detachStream = Long.MIN_VALUE;
    public final SlotDispatcher releaseHeader = StylusDetector.releaseHeader(Boolean.TRUE, null, 2, null);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public final class ActivityMutator implements MorphCreator {
        public final String attachConfig;
        public final GestureInitializer connectPatch;
        public long decodePath;
        public boolean drawRequest;
        public boolean gatherAdapter;
        public ScrollArbitrator inflateAdapter;
        public Object notifyMessage;
        public InterpolatorConductor purgeNode;
        public Object reduceScope;
        public final SlotDispatcher resetDelta;

        public ActivityMutator(Object obj, Object obj2, GestureInitializer gestureInitializer, ScrollArbitrator scrollArbitrator, String str) {
            this.reduceScope = obj;
            this.notifyMessage = obj2;
            this.connectPatch = gestureInitializer;
            this.attachConfig = str;
            this.resetDelta = StylusDetector.releaseHeader(obj, null, 2, null);
            this.inflateAdapter = scrollArbitrator;
            this.purgeNode = new InterpolatorConductor(this.inflateAdapter, gestureInitializer, this.reduceScope, this.notifyMessage, null, 16, null);
        }

        public final Object applyTask() {
            return this.notifyMessage;
        }

        public void attachConfig(Object obj) {
            this.resetDelta.setValue(obj);
        }

        public final void connectPatch() {
            this.gatherAdapter = true;
        }

        @Override // com.goldenboot.saga.zone.MorphCreator
        public Object getValue() {
            return this.resetDelta.getValue();
        }

        public final void inflateAdapter(Object obj, Object obj2, ScrollArbitrator scrollArbitrator) {
            this.reduceScope = obj;
            this.notifyMessage = obj2;
            this.inflateAdapter = scrollArbitrator;
            this.purgeNode = new InterpolatorConductor(scrollArbitrator, this.connectPatch, obj, obj2, null, 16, null);
            WaveCycle.this.connectJob(true);
            this.drawRequest = false;
            this.gatherAdapter = true;
        }

        public final void notifyMessage(long j) {
            WaveCycle.this.connectJob(false);
            if (this.gatherAdapter) {
                this.gatherAdapter = false;
                this.decodePath = j;
            }
            long j2 = j - this.decodePath;
            attachConfig(this.purgeNode.clipOrigin(j2));
            this.drawRequest = this.purgeNode.releaseHeader(j2);
        }

        public final Object releaseHeader() {
            return this.reduceScope;
        }

        public final void resetDelta() {
            attachConfig(this.purgeNode.flushSample());
            this.gatherAdapter = true;
        }

        public final boolean serializeOffset() {
            return this.drawRequest;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends PanelRevision implements IconExporter {
        public final /* synthetic */ SlotDispatcher attachConfig;
        public /* synthetic */ Object connectPatch;
        public int notifyMessage;
        public Object reduceScope;
        public final /* synthetic */ WaveCycle resetDelta;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class ActivityMutator extends Lambda implements TouchRecord {
            public final /* synthetic */ ProgressValve attachConfig;
            public final /* synthetic */ Ref.FloatRef connectPatch;
            public final /* synthetic */ WaveCycle notifyMessage;
            public final /* synthetic */ SlotDispatcher reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActivityMutator(SlotDispatcher slotDispatcher, WaveCycle waveCycle, Ref.FloatRef floatRef, ProgressValve progressValve) {
                super(1);
                this.reduceScope = slotDispatcher;
                this.notifyMessage = waveCycle;
                this.connectPatch = floatRef;
                this.attachConfig = progressValve;
            }

            public final void evictLayout(long j) {
                MorphCreator morphCreator = (MorphCreator) this.reduceScope.getValue();
                long longValue = morphCreator != null ? ((Number) morphCreator.getValue()).longValue() : j;
                int i = 0;
                if (this.notifyMessage.detachStream == Long.MIN_VALUE || this.connectPatch.element != ReceiverSupervisor.serializeOffset(this.attachConfig.getCoroutineContext())) {
                    this.notifyMessage.detachStream = j;
                    PluginScheduler pluginScheduler = this.notifyMessage.growPayload;
                    int reduceScope = pluginScheduler.reduceScope();
                    if (reduceScope > 0) {
                        Object[] serializeOffset = pluginScheduler.serializeOffset();
                        int i2 = 0;
                        do {
                            ((ActivityMutator) serializeOffset[i2]).connectPatch();
                            i2++;
                        } while (i2 < reduceScope);
                    }
                    this.connectPatch.element = ReceiverSupervisor.serializeOffset(this.attachConfig.getCoroutineContext());
                }
                if (this.connectPatch.element != 0.0f) {
                    this.notifyMessage.applyTask((long) ((longValue - this.notifyMessage.detachStream) / this.connectPatch.element));
                    return;
                }
                PluginScheduler pluginScheduler2 = this.notifyMessage.growPayload;
                int reduceScope2 = pluginScheduler2.reduceScope();
                if (reduceScope2 > 0) {
                    Object[] serializeOffset2 = pluginScheduler2.serializeOffset();
                    do {
                        ((ActivityMutator) serializeOffset2[i]).resetDelta();
                        i++;
                    } while (i < reduceScope2);
                }
            }

            @Override // com.goldenboot.saga.zone.TouchRecord
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                evictLayout(((Number) obj).longValue());
                return DpadBuilder.evictLayout;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.WaveCycle$BounceHandler$BounceHandler, reason: collision with other inner class name */
        public static final class C0188BounceHandler extends Lambda implements ElevationNode {
            public final /* synthetic */ ProgressValve reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0188BounceHandler(ProgressValve progressValve) {
                super(0);
                this.reduceScope = progressValve;
            }

            @Override // com.goldenboot.saga.zone.ElevationNode
            /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(ReceiverSupervisor.serializeOffset(this.reduceScope.getCoroutineContext()));
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class FeedbackFlow extends PanelRevision implements IconExporter {
            public /* synthetic */ float notifyMessage;
            public int reduceScope;

            public FeedbackFlow(ServiceRegulator serviceRegulator) {
                super(2, serviceRegulator);
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
                FeedbackFlow feedbackFlow = new FeedbackFlow(serviceRegulator);
                feedbackFlow.notifyMessage = ((Number) obj).floatValue();
                return feedbackFlow;
            }

            public final Object detachStream(float f, ServiceRegulator serviceRegulator) {
                return ((FeedbackFlow) create(Float.valueOf(f), serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return detachStream(((Number) obj).floatValue(), (ServiceRegulator) obj2);
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final Object invokeSuspend(Object obj) {
                RotateReceiver.releaseHeader();
                if (this.reduceScope != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ColumnForger.growPayload(obj);
                return WindowRevision.evictLayout(this.notifyMessage > 0.0f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BounceHandler(SlotDispatcher slotDispatcher, WaveCycle waveCycle, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.attachConfig = slotDispatcher;
            this.resetDelta = waveCycle;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            BounceHandler bounceHandler = new BounceHandler(this.attachConfig, this.resetDelta, serviceRegulator);
            bounceHandler.connectPatch = obj;
            return bounceHandler;
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
            return ((BounceHandler) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
        
            if (com.goldenboot.saga.zone.RailParser.notifyMessage(r4, r5, r7) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
        
            if (com.goldenboot.saga.zone.GlowAnnouncer.evictLayout(r4, r7) == r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0076 -> B:6:0x0040). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005b -> B:6:0x0040). Please report as a decompilation issue!!! */
        @Override // com.goldenboot.saga.zone.ConfigValidator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ProgressValve progressValve;
            Ref.FloatRef floatRef;
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.notifyMessage;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                progressValve = (ProgressValve) this.connectPatch;
                floatRef = new Ref.FloatRef();
                floatRef.element = 1.0f;
            } else if (i == 1) {
                floatRef = (Ref.FloatRef) this.reduceScope;
                ProgressValve progressValve2 = (ProgressValve) this.connectPatch;
                ColumnForger.growPayload(obj);
                progressValve = progressValve2;
                if (floatRef.element == 0.0f) {
                    CursorKeeper connectPatch = BounceReader.connectPatch(new C0188BounceHandler(progressValve));
                    FeedbackFlow feedbackFlow = new FeedbackFlow(null);
                    this.connectPatch = progressValve;
                    this.reduceScope = floatRef;
                    this.notifyMessage = 2;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                floatRef = (Ref.FloatRef) this.reduceScope;
                ProgressValve progressValve3 = (ProgressValve) this.connectPatch;
                ColumnForger.growPayload(obj);
                progressValve = progressValve3;
            }
            ActivityMutator activityMutator = new ActivityMutator(this.attachConfig, this.resetDelta, floatRef, progressValve);
            this.connectPatch = progressValve;
            this.reduceScope = floatRef;
            this.notifyMessage = 1;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow extends Lambda implements IconExporter {
        public final /* synthetic */ int notifyMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeedbackFlow(int i) {
            super(2);
            this.notifyMessage = i;
        }

        public final void evictLayout(NotificationFence notificationFence, int i) {
            WaveCycle.this.drawField(notificationFence, NavBarImpl.evictLayout(this.notifyMessage | 1));
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            evictLayout((NotificationFence) obj, ((Number) obj2).intValue());
            return DpadBuilder.evictLayout;
        }
    }

    public WaveCycle(String str) {
        this.evictLayout = str;
    }

    public final void applyTask(long j) {
        boolean z;
        PluginScheduler pluginScheduler = this.growPayload;
        int reduceScope = pluginScheduler.reduceScope();
        if (reduceScope > 0) {
            Object[] serializeOffset = pluginScheduler.serializeOffset();
            z = true;
            int i = 0;
            do {
                ActivityMutator activityMutator = (ActivityMutator) serializeOffset[i];
                if (!activityMutator.serializeOffset()) {
                    activityMutator.notifyMessage(j);
                }
                if (!activityMutator.serializeOffset()) {
                    z = false;
                }
                i++;
            } while (i < reduceScope);
        } else {
            z = true;
        }
        peekRevision(!z);
    }

    public final void clipOrigin(ActivityMutator activityMutator) {
        this.growPayload.growPayload(activityMutator);
        connectJob(true);
    }

    public final void connectJob(boolean z) {
        this.injectMetric.setValue(Boolean.valueOf(z));
    }

    public final void drawField(NotificationFence notificationFence, int i) {
        int i2;
        NotificationFence connectPatch = notificationFence.connectPatch(-318043801);
        if ((i & 6) == 0) {
            i2 = (connectPatch.drawField(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && connectPatch.purgeNode()) {
            connectPatch.syncScope();
        } else {
            if (MorphPatch.bindBody()) {
                MorphPatch.formatPosition(-318043801, i2, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
            }
            Object clipOrigin2 = connectPatch.clipOrigin();
            NotificationFence.ActivityMutator activityMutator = NotificationFence.evictLayout;
            if (clipOrigin2 == activityMutator.evictLayout()) {
                clipOrigin2 = StylusDetector.releaseHeader(null, null, 2, null);
                connectPatch.bindBody(clipOrigin2);
            }
            SlotDispatcher slotDispatcher = (SlotDispatcher) clipOrigin2;
            if (updateTimer() || flushSample()) {
                connectPatch.resumeSignature(1719915818);
                boolean drawField = connectPatch.drawField(this);
                Object clipOrigin3 = connectPatch.clipOrigin();
                if (drawField || clipOrigin3 == activityMutator.evictLayout()) {
                    clipOrigin3 = new BounceHandler(slotDispatcher, this, null);
                    connectPatch.bindBody(clipOrigin3);
                }
                InitSet.detachStream(this, (IconExporter) clipOrigin3, connectPatch, i2 & 14);
                connectPatch.unlockMessage();
            } else {
                connectPatch.resumeSignature(1721436120);
                connectPatch.unlockMessage();
            }
            if (MorphPatch.bindBody()) {
                MorphPatch.startResource();
            }
        }
        ShapeCounter drawScope = connectPatch.drawScope();
        if (drawScope != null) {
            drawScope.evictLayout(new FeedbackFlow(i));
        }
    }

    public final boolean flushSample() {
        return ((Boolean) this.injectMetric.getValue()).booleanValue();
    }

    public final void peekRevision(boolean z) {
        this.releaseHeader.setValue(Boolean.valueOf(z));
    }

    public final void popBlueprint(ActivityMutator activityMutator) {
        this.growPayload.purgeNode(activityMutator);
    }

    public final boolean updateTimer() {
        return ((Boolean) this.releaseHeader.getValue()).booleanValue();
    }
}
