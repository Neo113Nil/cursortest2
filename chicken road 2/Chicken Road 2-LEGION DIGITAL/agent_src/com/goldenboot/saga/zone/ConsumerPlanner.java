package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R*\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010)\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0016\u0010/\u001a\u0004\u0018\u00010,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/goldenboot/saga/zone/ConsumerPlanner;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "available", "Lcom/goldenboot/saga/zone/MenuDiff;", "source", "detachStream", "(JI)J", "consumed", "growPayload", "(JJI)J", "Lcom/goldenboot/saga/zone/WaveExecutor;", "injectMetric", "(JLcom/goldenboot/saga/zone/ServiceRegulator;)Ljava/lang/Object;", "evictLayout", "(JJLcom/goldenboot/saga/zone/ServiceRegulator;)Ljava/lang/Object;", "Lcom/goldenboot/saga/zone/DrawableCreator;", "Lcom/goldenboot/saga/zone/DrawableCreator;", "updateTimer", "()Lcom/goldenboot/saga/zone/DrawableCreator;", "peekRevision", "(Lcom/goldenboot/saga/zone/DrawableCreator;)V", "nestedScrollNode", "flushSample", "connectJob", "lastKnownParentNode", "Lkotlin/Function0;", "Lcom/goldenboot/saga/zone/ProgressValve;", "Lcom/goldenboot/saga/zone/ElevationNode;", "releaseHeader", "()Lcom/goldenboot/saga/zone/ElevationNode;", "drawField", "(Lcom/goldenboot/saga/zone/ElevationNode;)V", "calculateNestedScrollScope", "Lcom/goldenboot/saga/zone/ProgressValve;", "popBlueprint", "()Lcom/goldenboot/saga/zone/ProgressValve;", "serializeOffset", "(Lcom/goldenboot/saga/zone/ProgressValve;)V", "scope", "clipOrigin", "coroutineScope", "Lcom/goldenboot/saga/zone/PointerMaker;", "applyTask", "()Lcom/goldenboot/saga/zone/PointerMaker;", "parent", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConsumerPlanner {
    public static final int releaseHeader = 8;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private ProgressValve scope;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private DrawableCreator nestedScrollNode;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private DrawableCreator lastKnownParentNode;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private ElevationNode calculateNestedScrollScope = new ActivityMutator();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/goldenboot/saga/zone/ProgressValve;", "evictLayout", "()Lcom/goldenboot/saga/zone/ProgressValve;"}, k = 3, mv = {2, 0, 0})
    public static final class ActivityMutator extends Lambda implements ElevationNode {
        public ActivityMutator() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final ProgressValve invoke() {
            return ConsumerPlanner.this.getScope();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @SubscriberBroadcaster(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {222, 224}, m = "dispatchPostFling-RZ2iAVY")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class BounceHandler extends AnimBroadcaster {
        int connectPatch;
        /* synthetic */ Object reduceScope;

        public BounceHandler(ServiceRegulator serviceRegulator) {
            super(serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            this.reduceScope = obj;
            this.connectPatch |= Integer.MIN_VALUE;
            return ConsumerPlanner.this.evictLayout(0L, 0L, this);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @SubscriberBroadcaster(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {199}, m = "dispatchPreFling-QWom1Mo")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class FeedbackFlow extends AnimBroadcaster {
        int connectPatch;
        /* synthetic */ Object reduceScope;

        public FeedbackFlow(ServiceRegulator serviceRegulator) {
            super(serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            this.reduceScope = obj;
            this.connectPatch |= Integer.MIN_VALUE;
            return ConsumerPlanner.this.injectMetric(0L, this);
        }
    }

    public final PointerMaker applyTask() {
        DrawableCreator drawableCreator = this.nestedScrollNode;
        if (drawableCreator != null) {
            return drawableCreator.loadModule();
        }
        return null;
    }

    public final ProgressValve clipOrigin() {
        ProgressValve progressValve = (ProgressValve) this.calculateNestedScrollScope.invoke();
        if (progressValve != null) {
            return progressValve;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final void connectJob(DrawableCreator drawableCreator) {
        this.lastKnownParentNode = drawableCreator;
    }

    public final long detachStream(long available, int source) {
        PointerMaker applyTask = applyTask();
        return applyTask != null ? applyTask.drainCache(available, source) : RuntimeHeap.INSTANCE.releaseHeader();
    }

    public final void drawField(ElevationNode elevationNode) {
        this.calculateNestedScrollScope = elevationNode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r0 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r0 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object evictLayout(long j, long j2, ServiceRegulator serviceRegulator) {
        BounceHandler bounceHandler;
        int i;
        long evictLayout;
        if (serviceRegulator instanceof BounceHandler) {
            bounceHandler = (BounceHandler) serviceRegulator;
            int i2 = bounceHandler.connectPatch;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bounceHandler.connectPatch = i2 - Integer.MIN_VALUE;
                BounceHandler bounceHandler2 = bounceHandler;
                Object obj = bounceHandler2.reduceScope;
                Object releaseHeader2 = RotateReceiver.releaseHeader();
                i = bounceHandler2.connectPatch;
                if (i != 0) {
                    ColumnForger.growPayload(obj);
                    if (applyTask() == null) {
                        DrawableCreator drawableCreator = this.lastKnownParentNode;
                        if (drawableCreator != null) {
                            bounceHandler2.connectPatch = 1;
                            obj = drawableCreator.prependArchive(j, j2, bounceHandler2);
                        } else {
                            evictLayout = WaveExecutor.INSTANCE.evictLayout();
                        }
                    } else {
                        PointerMaker applyTask = applyTask();
                        if (applyTask != null) {
                            bounceHandler2.connectPatch = 2;
                            obj = applyTask.prependArchive(j, j2, bounceHandler2);
                        } else {
                            evictLayout = WaveExecutor.INSTANCE.evictLayout();
                        }
                    }
                } else if (i == 1) {
                    ColumnForger.growPayload(obj);
                    evictLayout = ((WaveExecutor) obj).getPackedValue();
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ColumnForger.growPayload(obj);
                    evictLayout = ((WaveExecutor) obj).getPackedValue();
                }
                return WaveExecutor.growPayload(evictLayout);
            }
        }
        bounceHandler = new BounceHandler(serviceRegulator);
        BounceHandler bounceHandler22 = bounceHandler;
        Object obj2 = bounceHandler22.reduceScope;
        Object releaseHeader22 = RotateReceiver.releaseHeader();
        i = bounceHandler22.connectPatch;
        if (i != 0) {
        }
        return WaveExecutor.growPayload(evictLayout);
    }

    /* renamed from: flushSample, reason: from getter */
    public final DrawableCreator getLastKnownParentNode() {
        return this.lastKnownParentNode;
    }

    public final long growPayload(long consumed, long available, int source) {
        PointerMaker applyTask = applyTask();
        return applyTask != null ? applyTask.broadcastModule(consumed, available, source) : RuntimeHeap.INSTANCE.releaseHeader();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object injectMetric(long j, ServiceRegulator serviceRegulator) {
        FeedbackFlow feedbackFlow;
        int i;
        long evictLayout;
        if (serviceRegulator instanceof FeedbackFlow) {
            feedbackFlow = (FeedbackFlow) serviceRegulator;
            int i2 = feedbackFlow.connectPatch;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackFlow.connectPatch = i2 - Integer.MIN_VALUE;
                Object obj = feedbackFlow.reduceScope;
                Object releaseHeader2 = RotateReceiver.releaseHeader();
                i = feedbackFlow.connectPatch;
                if (i != 0) {
                    ColumnForger.growPayload(obj);
                    PointerMaker applyTask = applyTask();
                    if (applyTask == null) {
                        evictLayout = WaveExecutor.INSTANCE.evictLayout();
                        return WaveExecutor.growPayload(evictLayout);
                    }
                    feedbackFlow.connectPatch = 1;
                    obj = applyTask.pauseComponent(j, feedbackFlow);
                    if (obj == releaseHeader2) {
                        return releaseHeader2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ColumnForger.growPayload(obj);
                }
                evictLayout = ((WaveExecutor) obj).getPackedValue();
                return WaveExecutor.growPayload(evictLayout);
            }
        }
        feedbackFlow = new FeedbackFlow(serviceRegulator);
        Object obj2 = feedbackFlow.reduceScope;
        Object releaseHeader22 = RotateReceiver.releaseHeader();
        i = feedbackFlow.connectPatch;
        if (i != 0) {
        }
        evictLayout = ((WaveExecutor) obj2).getPackedValue();
        return WaveExecutor.growPayload(evictLayout);
    }

    public final void peekRevision(DrawableCreator drawableCreator) {
        this.nestedScrollNode = drawableCreator;
    }

    /* renamed from: popBlueprint, reason: from getter */
    public final ProgressValve getScope() {
        return this.scope;
    }

    /* renamed from: releaseHeader, reason: from getter */
    public final ElevationNode getCalculateNestedScrollScope() {
        return this.calculateNestedScrollScope;
    }

    public final void serializeOffset(ProgressValve progressValve) {
        this.scope = progressValve;
    }

    /* renamed from: updateTimer, reason: from getter */
    public final DrawableCreator getNestedScrollNode() {
        return this.nestedScrollNode;
    }
}
