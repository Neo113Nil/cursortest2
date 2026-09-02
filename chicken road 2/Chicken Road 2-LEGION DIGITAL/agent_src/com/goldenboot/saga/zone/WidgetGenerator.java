package com.goldenboot.saga.zone;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class WidgetGenerator {
    public final ModuleAllocator applyTask;
    public final SlotDispatcher clipOrigin;
    public ModuleAllocator connectJob;
    public final EndpointSource detachStream;
    public ModuleAllocator drawField;
    public final GestureInitializer evictLayout;
    public final SpacerBatch flushSample;
    public final Object growPayload;
    public final String injectMetric;
    public final ModuleAllocator popBlueprint;
    public final SlotDispatcher releaseHeader;
    public final StartupBuffer updateTimer;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends PanelRevision implements TouchRecord {
        public int connectPatch;
        public final /* synthetic */ TouchRecord drawRequest;
        public final /* synthetic */ ContentBlock inflateAdapter;
        public Object notifyMessage;
        public final /* synthetic */ long purgeNode;
        public Object reduceScope;
        public final /* synthetic */ Object resetDelta;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.WidgetGenerator$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0189ActivityMutator extends Lambda implements TouchRecord {
            public final /* synthetic */ Ref.BooleanRef attachConfig;
            public final /* synthetic */ TouchRecord connectPatch;
            public final /* synthetic */ EndpointSource notifyMessage;
            public final /* synthetic */ WidgetGenerator reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0189ActivityMutator(WidgetGenerator widgetGenerator, EndpointSource endpointSource, TouchRecord touchRecord, Ref.BooleanRef booleanRef) {
                super(1);
                this.reduceScope = widgetGenerator;
                this.notifyMessage = endpointSource;
                this.connectPatch = touchRecord;
                this.attachConfig = booleanRef;
            }

            public final void evictLayout(InsetsBeacon insetsBeacon) {
                ReceiverSupervisor.reduceScope(insetsBeacon, this.reduceScope.popBlueprint());
                Object updateTimer = this.reduceScope.updateTimer(insetsBeacon.releaseHeader());
                if (Intrinsics.areEqual(updateTimer, insetsBeacon.releaseHeader())) {
                    TouchRecord touchRecord = this.connectPatch;
                    if (touchRecord != null) {
                        touchRecord.invoke(this.reduceScope);
                        return;
                    }
                    return;
                }
                this.reduceScope.popBlueprint().drawRequest(updateTimer);
                this.notifyMessage.drawRequest(updateTimer);
                TouchRecord touchRecord2 = this.connectPatch;
                if (touchRecord2 != null) {
                    touchRecord2.invoke(this.reduceScope);
                }
                insetsBeacon.evictLayout();
                this.attachConfig.element = true;
            }

            @Override // com.goldenboot.saga.zone.TouchRecord
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                evictLayout((InsetsBeacon) obj);
                return DpadBuilder.evictLayout;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(Object obj, ContentBlock contentBlock, long j, TouchRecord touchRecord, ServiceRegulator serviceRegulator) {
            super(1, serviceRegulator);
            this.resetDelta = obj;
            this.inflateAdapter = contentBlock;
            this.purgeNode = j;
            this.drawRequest = touchRecord;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(ServiceRegulator serviceRegulator) {
            return WidgetGenerator.this.new ActivityMutator(this.resetDelta, this.inflateAdapter, this.purgeNode, this.drawRequest, serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: detachStream, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ServiceRegulator serviceRegulator) {
            return ((ActivityMutator) create(serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            EndpointSource endpointSource;
            Ref.BooleanRef booleanRef;
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.connectPatch;
            try {
                if (i == 0) {
                    ColumnForger.growPayload(obj);
                    WidgetGenerator.this.popBlueprint().gatherAdapter((ModuleAllocator) WidgetGenerator.this.connectJob().evictLayout().invoke(this.resetDelta));
                    WidgetGenerator.this.attachConfig(this.inflateAdapter.flushSample());
                    WidgetGenerator.this.connectPatch(true);
                    EndpointSource updateTimer = ShapeDetector.updateTimer(WidgetGenerator.this.popBlueprint(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    ContentBlock contentBlock = this.inflateAdapter;
                    long j = this.purgeNode;
                    C0189ActivityMutator c0189ActivityMutator = new C0189ActivityMutator(WidgetGenerator.this, updateTimer, this.drawRequest, booleanRef2);
                    this.reduceScope = updateTimer;
                    this.notifyMessage = booleanRef2;
                    this.connectPatch = 1;
                    if (ReceiverSupervisor.injectMetric(updateTimer, contentBlock, j, c0189ActivityMutator, this) == releaseHeader) {
                        return releaseHeader;
                    }
                    endpointSource = updateTimer;
                    booleanRef = booleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) this.notifyMessage;
                    endpointSource = (EndpointSource) this.reduceScope;
                    ColumnForger.growPayload(obj);
                }
                TimelineInitializer timelineInitializer = booleanRef.element ? TimelineInitializer.BoundReached : TimelineInitializer.Finished;
                WidgetGenerator.this.applyTask();
                return new RotateAdministrator(endpointSource, timelineInitializer);
            } catch (CancellationException e) {
                WidgetGenerator.this.applyTask();
                throw e;
            }
        }
    }

    public WidgetGenerator(Object obj, GestureInitializer gestureInitializer, Object obj2, String str) {
        this.evictLayout = gestureInitializer;
        this.growPayload = obj2;
        this.injectMetric = str;
        this.detachStream = new EndpointSource(gestureInitializer, obj, null, 0L, 0L, false, 60, null);
        this.releaseHeader = StylusDetector.releaseHeader(Boolean.FALSE, null, 2, null);
        this.clipOrigin = StylusDetector.releaseHeader(obj, null, 2, null);
        this.flushSample = new SpacerBatch();
        this.updateTimer = new StartupBuffer(0.0f, 0.0f, obj2, 3, null);
        ModuleAllocator reduceScope = reduceScope();
        ModuleAllocator moduleAllocator = reduceScope instanceof ColumnEmitter ? FlingCurator.releaseHeader : reduceScope instanceof ItemCompiler ? FlingCurator.clipOrigin : reduceScope instanceof PatternRecovery ? FlingCurator.flushSample : FlingCurator.updateTimer;
        Intrinsics.checkNotNull(moduleAllocator, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.applyTask = moduleAllocator;
        ModuleAllocator reduceScope2 = reduceScope();
        ModuleAllocator moduleAllocator2 = reduceScope2 instanceof ColumnEmitter ? FlingCurator.evictLayout : reduceScope2 instanceof ItemCompiler ? FlingCurator.growPayload : reduceScope2 instanceof PatternRecovery ? FlingCurator.injectMetric : FlingCurator.detachStream;
        Intrinsics.checkNotNull(moduleAllocator2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.popBlueprint = moduleAllocator2;
        this.drawField = moduleAllocator;
        this.connectJob = moduleAllocator2;
    }

    public static /* synthetic */ Object clipOrigin(WidgetGenerator widgetGenerator, Object obj, ScrollArbitrator scrollArbitrator, Object obj2, TouchRecord touchRecord, ServiceRegulator serviceRegulator, int i, Object obj3) {
        if ((i & 2) != 0) {
            scrollArbitrator = widgetGenerator.updateTimer;
        }
        ScrollArbitrator scrollArbitrator2 = scrollArbitrator;
        if ((i & 4) != 0) {
            obj2 = widgetGenerator.serializeOffset();
        }
        Object obj4 = obj2;
        if ((i & 8) != 0) {
            touchRecord = null;
        }
        return widgetGenerator.releaseHeader(obj, scrollArbitrator2, obj4, touchRecord, serviceRegulator);
    }

    public final void applyTask() {
        EndpointSource endpointSource = this.detachStream;
        endpointSource.connectPatch().detachStream();
        endpointSource.inflateAdapter(Long.MIN_VALUE);
        connectPatch(false);
    }

    public final void attachConfig(Object obj) {
        this.clipOrigin.setValue(obj);
    }

    public final GestureInitializer connectJob() {
        return this.evictLayout;
    }

    public final void connectPatch(boolean z) {
        this.releaseHeader.setValue(Boolean.valueOf(z));
    }

    public final Object drawField() {
        return this.clipOrigin.getValue();
    }

    public final MorphCreator flushSample() {
        return this.detachStream;
    }

    public final Object notifyMessage(ContentBlock contentBlock, Object obj, TouchRecord touchRecord, ServiceRegulator serviceRegulator) {
        return SpacerBatch.releaseHeader(this.flushSample, null, new ActivityMutator(obj, contentBlock, this.detachStream.applyTask(), touchRecord, null), serviceRegulator, 1, null);
    }

    public final Object peekRevision() {
        return this.detachStream.getValue();
    }

    public final EndpointSource popBlueprint() {
        return this.detachStream;
    }

    public final ModuleAllocator reduceScope() {
        return this.detachStream.connectPatch();
    }

    public final Object releaseHeader(Object obj, ScrollArbitrator scrollArbitrator, Object obj2, TouchRecord touchRecord, ServiceRegulator serviceRegulator) {
        return notifyMessage(ConnectionTransformer.evictLayout(scrollArbitrator, this.evictLayout, peekRevision(), obj, obj2), obj2, touchRecord, serviceRegulator);
    }

    public final Object serializeOffset() {
        return this.evictLayout.growPayload().invoke(reduceScope());
    }

    public final Object updateTimer(Object obj) {
        if (!Intrinsics.areEqual(this.drawField, this.applyTask) || !Intrinsics.areEqual(this.connectJob, this.popBlueprint)) {
            ModuleAllocator moduleAllocator = (ModuleAllocator) this.evictLayout.evictLayout().invoke(obj);
            int growPayload = moduleAllocator.growPayload();
            boolean z = false;
            for (int i = 0; i < growPayload; i++) {
                if (moduleAllocator.evictLayout(i) < this.drawField.evictLayout(i) || moduleAllocator.evictLayout(i) > this.connectJob.evictLayout(i)) {
                    moduleAllocator.releaseHeader(i, CellEntry.connectJob(moduleAllocator.evictLayout(i), this.drawField.evictLayout(i), this.connectJob.evictLayout(i)));
                    z = true;
                }
            }
            if (z) {
                return this.evictLayout.growPayload().invoke(moduleAllocator);
            }
        }
        return obj;
    }

    public /* synthetic */ WidgetGenerator(Object obj, GestureInitializer gestureInitializer, Object obj2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, gestureInitializer, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : str);
    }
}
