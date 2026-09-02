package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.EmitterCustodian;
import com.goldenboot.saga.zone.ItemGovernor;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class EmitterCustodian {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends PanelRevision implements IconExporter {
        public final /* synthetic */ CursorKeeper attachConfig;
        public final /* synthetic */ LongPressGateway connectPatch;
        public /* synthetic */ Object notifyMessage;
        public int reduceScope;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.EmitterCustodian$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0104ActivityMutator implements TriggerModerator {
            public final /* synthetic */ DialogBarrier reduceScope;

            public C0104ActivityMutator(DialogBarrier dialogBarrier) {
                this.reduceScope = dialogBarrier;
            }

            @Override // com.goldenboot.saga.zone.TriggerModerator
            public final Object emit(Object obj, ServiceRegulator serviceRegulator) {
                this.reduceScope.setValue(obj);
                return DpadBuilder.evictLayout;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class BounceHandler extends PanelRevision implements IconExporter {
            public final /* synthetic */ DialogBarrier connectPatch;
            public final /* synthetic */ CursorKeeper notifyMessage;
            public int reduceScope;

            /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
            /* renamed from: com.goldenboot.saga.zone.EmitterCustodian$ActivityMutator$BounceHandler$ActivityMutator, reason: collision with other inner class name */
            public static final class C0105ActivityMutator implements TriggerModerator {
                public final /* synthetic */ DialogBarrier reduceScope;

                public C0105ActivityMutator(DialogBarrier dialogBarrier) {
                    this.reduceScope = dialogBarrier;
                }

                @Override // com.goldenboot.saga.zone.TriggerModerator
                public final Object emit(Object obj, ServiceRegulator serviceRegulator) {
                    this.reduceScope.setValue(obj);
                    return DpadBuilder.evictLayout;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BounceHandler(CursorKeeper cursorKeeper, DialogBarrier dialogBarrier, ServiceRegulator serviceRegulator) {
                super(2, serviceRegulator);
                this.notifyMessage = cursorKeeper;
                this.connectPatch = dialogBarrier;
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
                return new BounceHandler(this.notifyMessage, this.connectPatch, serviceRegulator);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
                return ((BounceHandler) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final Object invokeSuspend(Object obj) {
                Object releaseHeader = RotateReceiver.releaseHeader();
                int i = this.reduceScope;
                if (i == 0) {
                    ColumnForger.growPayload(obj);
                    CursorKeeper cursorKeeper = this.notifyMessage;
                    C0105ActivityMutator c0105ActivityMutator = new C0105ActivityMutator(this.connectPatch);
                    this.reduceScope = 1;
                    if (cursorKeeper.collect(c0105ActivityMutator, this) == releaseHeader) {
                        return releaseHeader;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ColumnForger.growPayload(obj);
                }
                return DpadBuilder.evictLayout;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(LongPressGateway longPressGateway, CursorKeeper cursorKeeper, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.connectPatch = longPressGateway;
            this.attachConfig = cursorKeeper;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            ActivityMutator activityMutator = new ActivityMutator(this.connectPatch, this.attachConfig, serviceRegulator);
            activityMutator.notifyMessage = obj;
            return activityMutator;
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        /* renamed from: detachStream, reason: merged with bridge method [inline-methods] */
        public final Object invoke(DialogBarrier dialogBarrier, ServiceRegulator serviceRegulator) {
            return ((ActivityMutator) create(dialogBarrier, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            if (r1.collect(r2, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        
            if (com.goldenboot.saga.zone.LazyStep.clipOrigin(r1, r3, r6) == r0) goto L17;
         */
        @Override // com.goldenboot.saga.zone.ConfigValidator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.reduceScope;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                DialogBarrier dialogBarrier = (DialogBarrier) this.notifyMessage;
                if (Intrinsics.areEqual(this.connectPatch, BackgroundIndex.reduceScope)) {
                    CursorKeeper cursorKeeper = this.attachConfig;
                    C0104ActivityMutator c0104ActivityMutator = new C0104ActivityMutator(dialogBarrier);
                    this.reduceScope = 1;
                } else {
                    LongPressGateway longPressGateway = this.connectPatch;
                    BounceHandler bounceHandler = new BounceHandler(this.attachConfig, dialogBarrier, null);
                    this.reduceScope = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ColumnForger.growPayload(obj);
            }
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends PanelRevision implements IconExporter {
        public Object attachConfig;
        public Object connectPatch;
        public /* synthetic */ Object drawRequest;
        public final /* synthetic */ ElevationNode gatherAdapter;
        public int inflateAdapter;
        public Object notifyMessage;
        public int purgeNode;
        public Object reduceScope;
        public Object resetDelta;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BounceHandler(ElevationNode elevationNode, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.gatherAdapter = elevationNode;
        }

        public static final DpadBuilder applyTask(LifecycleCoordinator lifecycleCoordinator, Set set, ItemGovernor itemGovernor) {
            if (set instanceof AccentRealizer) {
                ElevationInspector releaseHeader = ((AccentRealizer) set).releaseHeader();
                Object[] objArr = releaseHeader.growPayload;
                long[] jArr = releaseHeader.evictLayout;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    loop0: while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    Object obj = objArr[(i << 3) + i3];
                                    if (!(obj instanceof ProducerActivator) || ((ProducerActivator) obj).connectPatch(GlobalSignal.evictLayout(4))) {
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            } else {
                Set set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (Object obj2 : set2) {
                        if ((obj2 instanceof ProducerActivator) && !((ProducerActivator) obj2).connectPatch(GlobalSignal.evictLayout(4))) {
                        }
                        lifecycleCoordinator.reduceScope(set);
                    }
                }
            }
            return DpadBuilder.evictLayout;
        }

        public static final DpadBuilder updateTimer(CustomStore customStore, Object obj) {
            if (obj instanceof ProducerActivator) {
                ((ProducerActivator) obj).attachConfig(GlobalSignal.evictLayout(4));
            }
            customStore.updateTimer(obj);
            return DpadBuilder.evictLayout;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            BounceHandler bounceHandler = new BounceHandler(this.gatherAdapter, serviceRegulator);
            bounceHandler.drawRequest = obj;
            return bounceHandler;
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        /* renamed from: flushSample, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TriggerModerator triggerModerator, ServiceRegulator serviceRegulator) {
            return ((BounceHandler) create(triggerModerator, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00e3 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:12:0x0050, B:13:0x00c7, B:15:0x00cb, B:19:0x00d5, B:23:0x00e3, B:29:0x00f9, B:31:0x0102, B:44:0x011e, B:45:0x0121, B:25:0x00ee, B:28:0x00f6, B:40:0x011a, B:41:0x011d), top: B:11:0x0050, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
        @Override // com.goldenboot.saga.zone.ConfigValidator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            StackBlock stackBlock;
            TriggerModerator triggerModerator;
            final CustomStore customStore;
            TouchRecord touchRecord;
            final LifecycleCoordinator growPayload;
            ItemGovernor reduceScope;
            ItemGovernor connectJob;
            Object invoke;
            StackBlock stackBlock2;
            TriggerModerator triggerModerator2;
            CustomStore customStore2;
            TouchRecord touchRecord2;
            LifecycleCoordinator lifecycleCoordinator;
            Object obj2;
            int i;
            Set set;
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i2 = this.purgeNode;
            int i3 = 0;
            int i4 = 1;
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            i = this.inflateAdapter;
                            obj2 = this.resetDelta;
                            stackBlock2 = (StackBlock) this.attachConfig;
                            lifecycleCoordinator = (LifecycleCoordinator) this.connectPatch;
                            touchRecord2 = (TouchRecord) this.notifyMessage;
                            customStore2 = (CustomStore) this.reduceScope;
                            triggerModerator2 = (TriggerModerator) this.drawRequest;
                            try {
                                ColumnForger.growPayload(obj);
                                set = (Set) obj;
                                do {
                                    if (i == 0 && !EmitterCustodian.detachStream(customStore2, set)) {
                                        i = 0;
                                        set = (Set) ParallelChannel.clipOrigin(lifecycleCoordinator.flushSample());
                                    }
                                    i = 1;
                                    set = (Set) ParallelChannel.clipOrigin(lifecycleCoordinator.flushSample());
                                } while (set != null);
                                if (i != 0) {
                                    try {
                                        customStore2.peekRevision();
                                        reduceScope = ItemGovernor.releaseHeader.reduceScope(touchRecord2);
                                        ElevationNode elevationNode = this.gatherAdapter;
                                        try {
                                            invoke = elevationNode.invoke();
                                            reduceScope.detachStream();
                                            if (!Intrinsics.areEqual(invoke, obj2)) {
                                                this.drawRequest = triggerModerator2;
                                                this.reduceScope = customStore2;
                                                this.notifyMessage = touchRecord2;
                                                this.connectPatch = lifecycleCoordinator;
                                                this.attachConfig = stackBlock2;
                                                this.resetDelta = invoke;
                                                this.purgeNode = 3;
                                                if (triggerModerator2.emit(invoke, this) != releaseHeader) {
                                                    stackBlock = stackBlock2;
                                                    growPayload = lifecycleCoordinator;
                                                    touchRecord = touchRecord2;
                                                    customStore = customStore2;
                                                    triggerModerator = triggerModerator2;
                                                }
                                                return releaseHeader;
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                    connectJob = reduceScope.connectJob();
                                }
                                invoke = obj2;
                                stackBlock = stackBlock2;
                                growPayload = lifecycleCoordinator;
                                touchRecord = touchRecord2;
                                customStore = customStore2;
                                triggerModerator = triggerModerator2;
                            } catch (Throwable th) {
                                th = th;
                                stackBlock = stackBlock2;
                                stackBlock.evictLayout();
                                throw th;
                            }
                        } else if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    invoke = this.resetDelta;
                    stackBlock = (StackBlock) this.attachConfig;
                    growPayload = (LifecycleCoordinator) this.connectPatch;
                    touchRecord = (TouchRecord) this.notifyMessage;
                    customStore = (CustomStore) this.reduceScope;
                    triggerModerator = (TriggerModerator) this.drawRequest;
                    ColumnForger.growPayload(obj);
                } else {
                    ColumnForger.growPayload(obj);
                    triggerModerator = (TriggerModerator) this.drawRequest;
                    customStore = new CustomStore(i3, i4, null);
                    touchRecord = new TouchRecord() { // from class: com.goldenboot.saga.zone.SpanChunk
                        @Override // com.goldenboot.saga.zone.TouchRecord
                        public final Object invoke(Object obj3) {
                            DpadBuilder updateTimer;
                            updateTimer = EmitterCustodian.BounceHandler.updateTimer(CustomStore.this, obj3);
                            return updateTimer;
                        }
                    };
                    growPayload = TapUtil.growPayload(Integer.MAX_VALUE, null, null, 6, null);
                    ItemGovernor.ActivityMutator activityMutator = ItemGovernor.releaseHeader;
                    stackBlock = activityMutator.updateTimer(new IconExporter() { // from class: com.goldenboot.saga.zone.LegacyOrganizer
                        @Override // com.goldenboot.saga.zone.IconExporter
                        public final Object invoke(Object obj3, Object obj4) {
                            DpadBuilder applyTask;
                            applyTask = EmitterCustodian.BounceHandler.applyTask(LifecycleCoordinator.this, (Set) obj3, (ItemGovernor) obj4);
                            return applyTask;
                        }
                    });
                    reduceScope = activityMutator.reduceScope(touchRecord);
                    ElevationNode elevationNode2 = this.gatherAdapter;
                    try {
                        connectJob = reduceScope.connectJob();
                        try {
                            invoke = elevationNode2.invoke();
                            reduceScope.detachStream();
                            this.drawRequest = triggerModerator;
                            this.reduceScope = customStore;
                            this.notifyMessage = touchRecord;
                            this.connectPatch = growPayload;
                            this.attachConfig = stackBlock;
                            this.resetDelta = invoke;
                            this.purgeNode = 1;
                            if (triggerModerator.emit(invoke, this) == releaseHeader) {
                                return releaseHeader;
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
                this.drawRequest = triggerModerator;
                this.reduceScope = customStore;
                this.notifyMessage = touchRecord;
                this.connectPatch = growPayload;
                this.attachConfig = stackBlock;
                this.resetDelta = invoke;
                this.inflateAdapter = 0;
                this.purgeNode = 2;
                obj = growPayload.connectJob(this);
                if (obj != releaseHeader) {
                    triggerModerator2 = triggerModerator;
                    customStore2 = customStore;
                    touchRecord2 = touchRecord;
                    lifecycleCoordinator = growPayload;
                    stackBlock2 = stackBlock;
                    obj2 = invoke;
                    i = 0;
                    set = (Set) obj;
                    do {
                        if (i == 0) {
                            i = 0;
                            set = (Set) ParallelChannel.clipOrigin(lifecycleCoordinator.flushSample());
                        }
                        i = 1;
                        set = (Set) ParallelChannel.clipOrigin(lifecycleCoordinator.flushSample());
                    } while (set != null);
                    if (i != 0) {
                    }
                    invoke = obj2;
                    stackBlock = stackBlock2;
                    growPayload = lifecycleCoordinator;
                    touchRecord = touchRecord2;
                    customStore = customStore2;
                    triggerModerator = triggerModerator2;
                    this.drawRequest = triggerModerator;
                    this.reduceScope = customStore;
                    this.notifyMessage = touchRecord;
                    this.connectPatch = growPayload;
                    this.attachConfig = stackBlock;
                    this.resetDelta = invoke;
                    this.inflateAdapter = 0;
                    this.purgeNode = 2;
                    obj = growPayload.connectJob(this);
                    if (obj != releaseHeader) {
                    }
                }
                return releaseHeader;
            } catch (Throwable th2) {
                th = th2;
                stackBlock.evictLayout();
                throw th;
            }
        }
    }

    public static final boolean detachStream(CustomStore customStore, Set set) {
        Object[] objArr = customStore.growPayload;
        long[] jArr = customStore.evictLayout;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && set.contains(objArr[(i << 3) + i3])) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public static final MorphCreator growPayload(CursorKeeper cursorKeeper, Object obj, LongPressGateway longPressGateway, NotificationFence notificationFence, int i, int i2) {
        if ((i2 & 2) != 0) {
            longPressGateway = BackgroundIndex.reduceScope;
        }
        LongPressGateway longPressGateway2 = longPressGateway;
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        boolean drawField = notificationFence.drawField(longPressGateway2) | notificationFence.drawField(cursorKeeper);
        Object clipOrigin = notificationFence.clipOrigin();
        if (drawField || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin = new ActivityMutator(longPressGateway2, cursorKeeper, null);
            notificationFence.bindBody(clipOrigin);
        }
        MorphCreator peekRevision = BounceReader.peekRevision(obj, cursorKeeper, longPressGateway2, (IconExporter) clipOrigin, notificationFence, ((i >> 3) & 14) | ((i << 3) & 112) | (i & 896));
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return peekRevision;
    }

    public static final MorphCreator injectMetric(AccentFactory accentFactory, LongPressGateway longPressGateway, NotificationFence notificationFence, int i, int i2) {
        if ((i2 & 1) != 0) {
            longPressGateway = BackgroundIndex.reduceScope;
        }
        LongPressGateway longPressGateway2 = longPressGateway;
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(-1439883919, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        MorphCreator evictLayout = BounceReader.evictLayout(accentFactory, accentFactory.getValue(), longPressGateway2, notificationFence, (i & 14) | ((i << 3) & 896), 0);
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return evictLayout;
    }

    public static final CursorKeeper releaseHeader(ElevationNode elevationNode) {
        return RailParser.connectPatch(new BounceHandler(elevationNode, null));
    }
}
