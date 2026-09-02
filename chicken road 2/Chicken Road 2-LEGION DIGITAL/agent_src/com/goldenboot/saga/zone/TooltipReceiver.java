package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.NotificationFence;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class TooltipReceiver {
    public static final StartupBuffer evictLayout = RippleQueue.flushSample(0.0f, 0.0f, null, 7, null);
    public static final StartupBuffer growPayload = RippleQueue.flushSample(0.0f, 0.0f, InsetsEdge.flushSample(MotionActivator.evictLayout(InsetsEdge.INSTANCE)), 3, null);
    public static final StartupBuffer injectMetric = RippleQueue.flushSample(0.0f, 0.0f, ShapeSender.injectMetric(MotionActivator.clipOrigin(ShapeSender.INSTANCE)), 3, null);
    public static final StartupBuffer detachStream = RippleQueue.flushSample(0.0f, 0.0f, RuntimeHeap.detachStream(MotionActivator.releaseHeader(RuntimeHeap.INSTANCE)), 3, null);
    public static final StartupBuffer releaseHeader = RippleQueue.flushSample(0.0f, 0.0f, MotionActivator.flushSample(ChipSnapshot.INSTANCE), 3, null);
    public static final StartupBuffer clipOrigin = RippleQueue.flushSample(0.0f, 0.0f, Integer.valueOf(MotionActivator.growPayload(IntCompanionObject.INSTANCE)), 3, null);
    public static final StartupBuffer flushSample = RippleQueue.flushSample(0.0f, 0.0f, FontReporter.injectMetric(MotionActivator.injectMetric(FontReporter.INSTANCE)), 3, null);
    public static final StartupBuffer updateTimer = RippleQueue.flushSample(0.0f, 0.0f, ScaleSaver.growPayload(MotionActivator.detachStream(ScaleSaver.INSTANCE)), 3, null);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements ElevationNode {
        public final /* synthetic */ Object notifyMessage;
        public final /* synthetic */ LifecycleCoordinator reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(LifecycleCoordinator lifecycleCoordinator, Object obj) {
            super(0);
            this.reduceScope = lifecycleCoordinator;
            this.notifyMessage = obj;
        }

        public final void evictLayout() {
            this.reduceScope.reduceScope(this.notifyMessage);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        public /* bridge */ /* synthetic */ Object invoke() {
            evictLayout();
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends PanelRevision implements IconExporter {
        public final /* synthetic */ LifecycleCoordinator attachConfig;
        public /* synthetic */ Object connectPatch;
        public final /* synthetic */ MorphCreator inflateAdapter;
        public int notifyMessage;
        public final /* synthetic */ MorphCreator purgeNode;
        public Object reduceScope;
        public final /* synthetic */ WidgetGenerator resetDelta;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class ActivityMutator extends PanelRevision implements IconExporter {
            public final /* synthetic */ MorphCreator attachConfig;
            public final /* synthetic */ WidgetGenerator connectPatch;
            public final /* synthetic */ Object notifyMessage;
            public int reduceScope;
            public final /* synthetic */ MorphCreator resetDelta;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActivityMutator(Object obj, WidgetGenerator widgetGenerator, MorphCreator morphCreator, MorphCreator morphCreator2, ServiceRegulator serviceRegulator) {
                super(2, serviceRegulator);
                this.notifyMessage = obj;
                this.connectPatch = widgetGenerator;
                this.attachConfig = morphCreator;
                this.resetDelta = morphCreator2;
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
                return new ActivityMutator(this.notifyMessage, this.connectPatch, this.attachConfig, this.resetDelta, serviceRegulator);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
                return ((ActivityMutator) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final Object invokeSuspend(Object obj) {
                ActivityMutator activityMutator;
                Object releaseHeader = RotateReceiver.releaseHeader();
                int i = this.reduceScope;
                if (i == 0) {
                    ColumnForger.growPayload(obj);
                    if (!Intrinsics.areEqual(this.notifyMessage, this.connectPatch.drawField())) {
                        WidgetGenerator widgetGenerator = this.connectPatch;
                        Object obj2 = this.notifyMessage;
                        ScrollArbitrator clipOrigin = TooltipReceiver.clipOrigin(this.attachConfig);
                        this.reduceScope = 1;
                        activityMutator = this;
                        if (WidgetGenerator.clipOrigin(widgetGenerator, obj2, clipOrigin, null, null, activityMutator, 12, null) == releaseHeader) {
                            return releaseHeader;
                        }
                    }
                    return DpadBuilder.evictLayout;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ColumnForger.growPayload(obj);
                activityMutator = this;
                TouchRecord releaseHeader2 = TooltipReceiver.releaseHeader(activityMutator.resetDelta);
                if (releaseHeader2 != null) {
                    releaseHeader2.invoke(activityMutator.connectPatch.peekRevision());
                }
                return DpadBuilder.evictLayout;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BounceHandler(LifecycleCoordinator lifecycleCoordinator, WidgetGenerator widgetGenerator, MorphCreator morphCreator, MorphCreator morphCreator2, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.attachConfig = lifecycleCoordinator;
            this.resetDelta = widgetGenerator;
            this.inflateAdapter = morphCreator;
            this.purgeNode = morphCreator2;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            BounceHandler bounceHandler = new BounceHandler(this.attachConfig, this.resetDelta, this.inflateAdapter, this.purgeNode, serviceRegulator);
            bounceHandler.connectPatch = obj;
            return bounceHandler;
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
            return ((BounceHandler) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:5:0x003a). Please report as a decompilation issue!!! */
        @Override // com.goldenboot.saga.zone.ConfigValidator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            DividerCheckpoint it;
            ProgressValve progressValve;
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.notifyMessage;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                ProgressValve progressValve2 = (ProgressValve) this.connectPatch;
                it = this.attachConfig.iterator();
                progressValve = progressValve2;
                this.connectPatch = progressValve;
                this.reduceScope = it;
                this.notifyMessage = 1;
                obj = it.growPayload(this);
                if (obj == releaseHeader) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (DividerCheckpoint) this.reduceScope;
                progressValve = (ProgressValve) this.connectPatch;
                ColumnForger.growPayload(obj);
                if (((Boolean) obj).booleanValue()) {
                    Object next = it.next();
                    Object clipOrigin = ParallelChannel.clipOrigin(this.attachConfig.flushSample());
                    BottomBarDrain.detachStream(progressValve, null, null, new ActivityMutator(clipOrigin == null ? next : clipOrigin, this.resetDelta, this.inflateAdapter, this.purgeNode, null), 3, null);
                    this.connectPatch = progressValve;
                    this.reduceScope = it;
                    this.notifyMessage = 1;
                    obj = it.growPayload(this);
                    if (obj == releaseHeader) {
                        return releaseHeader;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return DpadBuilder.evictLayout;
                    }
                }
            }
        }
    }

    public static final ScrollArbitrator clipOrigin(MorphCreator morphCreator) {
        return (ScrollArbitrator) morphCreator.getValue();
    }

    public static final MorphCreator detachStream(Object obj, GestureInitializer gestureInitializer, ScrollArbitrator scrollArbitrator, Object obj2, String str, TouchRecord touchRecord, NotificationFence notificationFence, int i, int i2) {
        ScrollArbitrator scrollArbitrator2;
        LifecycleCoordinator lifecycleCoordinator;
        if ((i2 & 4) != 0) {
            Object clipOrigin2 = notificationFence.clipOrigin();
            if (clipOrigin2 == NotificationFence.evictLayout.evictLayout()) {
                clipOrigin2 = RippleQueue.flushSample(0.0f, 0.0f, null, 7, null);
                notificationFence.bindBody(clipOrigin2);
            }
            scrollArbitrator2 = (StartupBuffer) clipOrigin2;
        } else {
            scrollArbitrator2 = scrollArbitrator;
        }
        Object obj3 = (i2 & 8) != 0 ? null : obj2;
        String str2 = (i2 & 16) != 0 ? "ValueAnimation" : str;
        TouchRecord touchRecord2 = (i2 & 32) != 0 ? null : touchRecord;
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(-1994373980, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        Object clipOrigin3 = notificationFence.clipOrigin();
        NotificationFence.ActivityMutator activityMutator = NotificationFence.evictLayout;
        if (clipOrigin3 == activityMutator.evictLayout()) {
            clipOrigin3 = StylusDetector.releaseHeader(null, null, 2, null);
            notificationFence.bindBody(clipOrigin3);
        }
        SlotDispatcher slotDispatcher = (SlotDispatcher) clipOrigin3;
        Object clipOrigin4 = notificationFence.clipOrigin();
        if (clipOrigin4 == activityMutator.evictLayout()) {
            clipOrigin4 = new WidgetGenerator(obj, gestureInitializer, obj3, str2);
            notificationFence.bindBody(clipOrigin4);
        }
        WidgetGenerator widgetGenerator = (WidgetGenerator) clipOrigin4;
        MorphCreator notifyMessage = BounceReader.notifyMessage(touchRecord2, notificationFence, (i >> 15) & 14);
        if (obj3 != null && (scrollArbitrator2 instanceof StartupBuffer)) {
            StartupBuffer startupBuffer = (StartupBuffer) scrollArbitrator2;
            if (!Intrinsics.areEqual(startupBuffer.updateTimer(), obj3)) {
                scrollArbitrator2 = RippleQueue.clipOrigin(startupBuffer.clipOrigin(), startupBuffer.flushSample(), obj3);
            }
        }
        MorphCreator notifyMessage2 = BounceReader.notifyMessage(scrollArbitrator2, notificationFence, 0);
        Object clipOrigin5 = notificationFence.clipOrigin();
        if (clipOrigin5 == activityMutator.evictLayout()) {
            clipOrigin5 = TapUtil.growPayload(-1, null, null, 6, null);
            notificationFence.bindBody(clipOrigin5);
        }
        LifecycleCoordinator lifecycleCoordinator2 = (LifecycleCoordinator) clipOrigin5;
        boolean drawField = ((((i & 14) ^ 6) > 4 && notificationFence.drawField(obj)) || (i & 6) == 4) | notificationFence.drawField(lifecycleCoordinator2);
        Object clipOrigin6 = notificationFence.clipOrigin();
        if (drawField || clipOrigin6 == activityMutator.evictLayout()) {
            clipOrigin6 = new ActivityMutator(lifecycleCoordinator2, obj);
            notificationFence.bindBody(clipOrigin6);
        }
        InitSet.flushSample((ElevationNode) clipOrigin6, notificationFence, 0);
        boolean drawField2 = notificationFence.drawField(lifecycleCoordinator2) | notificationFence.drawField(widgetGenerator) | notificationFence.formatPosition(notifyMessage2) | notificationFence.formatPosition(notifyMessage);
        Object clipOrigin7 = notificationFence.clipOrigin();
        if (drawField2 || clipOrigin7 == activityMutator.evictLayout()) {
            lifecycleCoordinator = lifecycleCoordinator2;
            Object bounceHandler = new BounceHandler(lifecycleCoordinator, widgetGenerator, notifyMessage2, notifyMessage, null);
            notificationFence.bindBody(bounceHandler);
            clipOrigin7 = bounceHandler;
        } else {
            lifecycleCoordinator = lifecycleCoordinator2;
        }
        InitSet.detachStream(lifecycleCoordinator, (IconExporter) clipOrigin7, notificationFence, 0);
        MorphCreator morphCreator = (MorphCreator) slotDispatcher.getValue();
        if (morphCreator == null) {
            morphCreator = widgetGenerator.flushSample();
        }
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return morphCreator;
    }

    public static final MorphCreator injectMetric(float f, ScrollArbitrator scrollArbitrator, float f2, String str, TouchRecord touchRecord, NotificationFence notificationFence, int i, int i2) {
        if ((i2 & 2) != 0) {
            scrollArbitrator = evictLayout;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.01f;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        TouchRecord touchRecord2 = (i2 & 16) != 0 ? null : touchRecord;
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(668842840, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        if (scrollArbitrator == evictLayout) {
            notificationFence.resumeSignature(1125598679);
            boolean z = (((i & 896) ^ 384) > 256 && notificationFence.flushSample(f2)) || (i & 384) == 256;
            Object clipOrigin2 = notificationFence.clipOrigin();
            if (z || clipOrigin2 == NotificationFence.evictLayout.evictLayout()) {
                clipOrigin2 = RippleQueue.flushSample(0.0f, 0.0f, Float.valueOf(f2), 3, null);
                notificationFence.bindBody(clipOrigin2);
            }
            scrollArbitrator = (StartupBuffer) clipOrigin2;
            notificationFence.unlockMessage();
        } else {
            notificationFence.resumeSignature(1125708605);
            notificationFence.unlockMessage();
        }
        ScrollArbitrator scrollArbitrator2 = scrollArbitrator;
        Float valueOf = Float.valueOf(f);
        GestureInitializer applyTask = LocalProcessor.applyTask(FloatCompanionObject.INSTANCE);
        Float valueOf2 = Float.valueOf(f2);
        int i3 = i << 3;
        MorphCreator detachStream2 = detachStream(valueOf, applyTask, scrollArbitrator2, valueOf2, str2, touchRecord2, notificationFence, (i & 14) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return detachStream2;
    }

    public static final TouchRecord releaseHeader(MorphCreator morphCreator) {
        return (TouchRecord) morphCreator.getValue();
    }
}
