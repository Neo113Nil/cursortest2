package com.goldenboot.saga.zone;

import android.view.KeyEvent;
import com.goldenboot.saga.zone.BoxFabricator;
import com.goldenboot.saga.zone.ClipboardNegotiator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class HeaderUtil extends ItemMapper implements ScrollWork, NotificationPatch, SwipeHelper, KeyboardReducer, LayoutBlock {
    public EmbeddedGenerator attachCallback;
    public ElevationNode bindBody;
    public final Object cancelArchive;
    public PatternLoader connectComponent;
    public final boolean dispatchTimezone;
    public ConfigMerger filterPayload;
    public long formatPosition;
    public boolean groupArchive;
    public ReceiverState inflateEdge;
    public final WaveMutex mapJob;
    public PointerInspector packPackage;
    public final ShadowDownloader parseAsset;
    public CachedDeserializer prepareTask;
    public String queryModel;
    public ConfigMerger resumeSignature;
    public final Map startResource;
    public boolean unlockMessage;
    public ClipboardNegotiator.BounceHandler updateAction;
    public static final ActivityMutator resolveDelta = new ActivityMutator(null);
    public static final int resetValue = 8;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public ActivityMutator() {
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends Lambda implements ElevationNode {
        public BounceHandler() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            HeaderUtil.this.formatState().invoke();
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class EndpointList extends PanelRevision implements IconExporter {
        public final /* synthetic */ JoystickLock attachConfig;
        public /* synthetic */ Object connectPatch;
        public final /* synthetic */ ConfigMerger inflateAdapter;
        public int notifyMessage;
        public final /* synthetic */ HeaderUtil purgeNode;
        public boolean reduceScope;
        public final /* synthetic */ long resetDelta;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class ActivityMutator extends PanelRevision implements IconExporter {
            public final /* synthetic */ long attachConfig;
            public final /* synthetic */ HeaderUtil connectPatch;
            public int notifyMessage;
            public Object reduceScope;
            public final /* synthetic */ ConfigMerger resetDelta;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActivityMutator(HeaderUtil headerUtil, long j, ConfigMerger configMerger, ServiceRegulator serviceRegulator) {
                super(2, serviceRegulator);
                this.connectPatch = headerUtil;
                this.attachConfig = j;
                this.resetDelta = configMerger;
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
                return new ActivityMutator(this.connectPatch, this.attachConfig, this.resetDelta, serviceRegulator);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
                return ((ActivityMutator) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
            
                if (com.goldenboot.saga.zone.CorePool.evictLayout(r4, r6) == r0) goto L17;
             */
            @Override // com.goldenboot.saga.zone.ConfigValidator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                ClipboardNegotiator.BounceHandler bounceHandler;
                Object releaseHeader = RotateReceiver.releaseHeader();
                int i = this.notifyMessage;
                if (i == 0) {
                    ColumnForger.growPayload(obj);
                    if (this.connectPatch.detachSample()) {
                        long evictLayout = FeatureSampler.evictLayout();
                        this.notifyMessage = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bounceHandler = (ClipboardNegotiator.BounceHandler) this.reduceScope;
                        ColumnForger.growPayload(obj);
                        this.connectPatch.updateAction = bounceHandler;
                        return DpadBuilder.evictLayout;
                    }
                    ColumnForger.growPayload(obj);
                }
                ClipboardNegotiator.BounceHandler bounceHandler2 = new ClipboardNegotiator.BounceHandler(this.attachConfig, null);
                ConfigMerger configMerger = this.resetDelta;
                this.reduceScope = bounceHandler2;
                this.notifyMessage = 2;
                if (configMerger.evictLayout(bounceHandler2, this) != releaseHeader) {
                    bounceHandler = bounceHandler2;
                    this.connectPatch.updateAction = bounceHandler;
                    return DpadBuilder.evictLayout;
                }
                return releaseHeader;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EndpointList(JoystickLock joystickLock, long j, ConfigMerger configMerger, HeaderUtil headerUtil, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.attachConfig = joystickLock;
            this.resetDelta = j;
            this.inflateAdapter = configMerger;
            this.purgeNode = headerUtil;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            EndpointList endpointList = new EndpointList(this.attachConfig, this.resetDelta, this.inflateAdapter, this.purgeNode, serviceRegulator);
            endpointList.connectPatch = obj;
            return endpointList;
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
            return ((EndpointList) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
        
            if (r3.evictLayout(r2, r16) != r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
        
            if (r4.evictLayout(r5, r16) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0068, code lost:
        
            if (r7 == r1) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
        @Override // com.goldenboot.saga.zone.ConfigValidator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            DrawableSynthesizer detachStream;
            Object trackJob;
            boolean z;
            ClipboardNegotiator.FeedbackFlow feedbackFlow;
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.notifyMessage;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                detachStream = BottomBarDrain.detachStream((ProgressValve) this.connectPatch, null, null, new ActivityMutator(this.purgeNode, this.resetDelta, this.inflateAdapter, null), 3, null);
                JoystickLock joystickLock = this.attachConfig;
                this.connectPatch = detachStream;
                this.notifyMessage = 1;
                trackJob = joystickLock.trackJob(this);
            } else if (i == 1) {
                detachStream = (DrawableSynthesizer) this.connectPatch;
                ColumnForger.growPayload(obj);
                trackJob = obj;
            } else {
                if (i == 2) {
                    z = this.reduceScope;
                    ColumnForger.growPayload(obj);
                    if (z) {
                        ClipboardNegotiator.BounceHandler bounceHandler = new ClipboardNegotiator.BounceHandler(this.resetDelta, null);
                        ClipboardNegotiator.FeedbackFlow feedbackFlow2 = new ClipboardNegotiator.FeedbackFlow(bounceHandler);
                        ConfigMerger configMerger = this.inflateAdapter;
                        this.connectPatch = feedbackFlow2;
                        this.notifyMessage = 3;
                        if (configMerger.evictLayout(bounceHandler, this) != releaseHeader) {
                            feedbackFlow = feedbackFlow2;
                            ConfigMerger configMerger2 = this.inflateAdapter;
                            this.connectPatch = null;
                            this.notifyMessage = 4;
                        }
                        return releaseHeader;
                    }
                    this.purgeNode.updateAction = null;
                    return DpadBuilder.evictLayout;
                }
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ColumnForger.growPayload(obj);
                    this.purgeNode.updateAction = null;
                    return DpadBuilder.evictLayout;
                }
                feedbackFlow = (ClipboardNegotiator.FeedbackFlow) this.connectPatch;
                ColumnForger.growPayload(obj);
                ConfigMerger configMerger22 = this.inflateAdapter;
                this.connectPatch = null;
                this.notifyMessage = 4;
            }
            boolean booleanValue = ((Boolean) trackJob).booleanValue();
            if (!detachStream.popBlueprint()) {
                ClipboardNegotiator.BounceHandler bounceHandler2 = this.purgeNode.updateAction;
                if (bounceHandler2 != null) {
                    ConfigMerger configMerger3 = this.inflateAdapter;
                    StepperDiff feedbackFlow3 = booleanValue ? new ClipboardNegotiator.FeedbackFlow(bounceHandler2) : new ClipboardNegotiator.ActivityMutator(bounceHandler2);
                    this.connectPatch = null;
                    this.notifyMessage = 5;
                }
                this.purgeNode.updateAction = null;
                return DpadBuilder.evictLayout;
            }
            this.connectPatch = null;
            this.reduceScope = booleanValue;
            this.notifyMessage = 2;
            if (ProxyArbitrator.flushSample(detachStream, this) != releaseHeader) {
                z = booleanValue;
                if (z) {
                }
                this.purgeNode.updateAction = null;
                return DpadBuilder.evictLayout;
            }
            return releaseHeader;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow extends PanelRevision implements IconExporter {
        public final /* synthetic */ PatternLoader connectPatch;
        public final /* synthetic */ ConfigMerger notifyMessage;
        public int reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeedbackFlow(ConfigMerger configMerger, PatternLoader patternLoader, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.notifyMessage = configMerger;
            this.connectPatch = patternLoader;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            return new FeedbackFlow(this.notifyMessage, this.connectPatch, serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
            return ((FeedbackFlow) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.reduceScope;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                ConfigMerger configMerger = this.notifyMessage;
                PatternLoader patternLoader = this.connectPatch;
                this.reduceScope = 1;
                if (configMerger.evictLayout(patternLoader, this) == releaseHeader) {
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

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class LayerUseCase extends PanelRevision implements IconExporter {
        public final /* synthetic */ ToastShard connectPatch;
        public final /* synthetic */ ConfigMerger notifyMessage;
        public int reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayerUseCase(ConfigMerger configMerger, ToastShard toastShard, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.notifyMessage = configMerger;
            this.connectPatch = toastShard;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            return new LayerUseCase(this.notifyMessage, this.connectPatch, serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
            return ((LayerUseCase) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.reduceScope;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                ConfigMerger configMerger = this.notifyMessage;
                ToastShard toastShard = this.connectPatch;
                this.reduceScope = 1;
                if (configMerger.evictLayout(toastShard, this) == releaseHeader) {
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

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class MorphDirector extends PanelRevision implements IconExporter {
        public /* synthetic */ Object notifyMessage;
        public int reduceScope;

        public MorphDirector(ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            MorphDirector morphDirector = HeaderUtil.this.new MorphDirector(serviceRegulator);
            morphDirector.notifyMessage = obj;
            return morphDirector;
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        /* renamed from: detachStream, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PulseBucket pulseBucket, ServiceRegulator serviceRegulator) {
            return ((MorphDirector) create(pulseBucket, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.reduceScope;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                PulseBucket pulseBucket = (PulseBucket) this.notifyMessage;
                HeaderUtil headerUtil = HeaderUtil.this;
                this.reduceScope = 1;
                if (headerUtil.lookupCurrency(pulseBucket, this) == releaseHeader) {
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

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class PluginInterpreter extends PanelRevision implements IconExporter {
        public int reduceScope;

        public PluginInterpreter(ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            return HeaderUtil.this.new PluginInterpreter(serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
            return ((PluginInterpreter) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            RotateReceiver.releaseHeader();
            if (this.reduceScope != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ColumnForger.growPayload(obj);
            HeaderUtil.this.saveEvent();
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class RestoreToggle extends PanelRevision implements IconExporter {
        public int reduceScope;

        public RestoreToggle(ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            return HeaderUtil.this.new RestoreToggle(serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
            return ((RestoreToggle) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            RotateReceiver.releaseHeader();
            if (this.reduceScope != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ColumnForger.growPayload(obj);
            HeaderUtil.this.insertToken();
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ScopedMigration extends PanelRevision implements IconExporter {
        public final /* synthetic */ ClipboardNegotiator.BounceHandler connectPatch;
        public int reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScopedMigration(ClipboardNegotiator.BounceHandler bounceHandler, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.connectPatch = bounceHandler;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            return HeaderUtil.this.new ScopedMigration(this.connectPatch, serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
            return ((ScopedMigration) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.reduceScope;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                ConfigMerger configMerger = HeaderUtil.this.filterPayload;
                if (configMerger != null) {
                    ClipboardNegotiator.FeedbackFlow feedbackFlow = new ClipboardNegotiator.FeedbackFlow(this.connectPatch);
                    this.reduceScope = 1;
                    if (configMerger.evictLayout(feedbackFlow, this) == releaseHeader) {
                        return releaseHeader;
                    }
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

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class StylusConverter extends PanelRevision implements IconExporter {
        public final /* synthetic */ ClipboardNegotiator.BounceHandler connectPatch;
        public int reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StylusConverter(ClipboardNegotiator.BounceHandler bounceHandler, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.connectPatch = bounceHandler;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            return HeaderUtil.this.new StylusConverter(this.connectPatch, serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
            return ((StylusConverter) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.reduceScope;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                ConfigMerger configMerger = HeaderUtil.this.filterPayload;
                if (configMerger != null) {
                    ClipboardNegotiator.BounceHandler bounceHandler = this.connectPatch;
                    this.reduceScope = 1;
                    if (configMerger.evictLayout(bounceHandler, this) == releaseHeader) {
                        return releaseHeader;
                    }
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

    public /* synthetic */ HeaderUtil(ConfigMerger configMerger, ReceiverState receiverState, boolean z, String str, PointerInspector pointerInspector, ElevationNode elevationNode, DefaultConstructorMarker defaultConstructorMarker) {
        this(configMerger, receiverState, z, str, pointerInspector, elevationNode);
    }

    public final void acquireModule() {
        ConfigMerger configMerger = this.filterPayload;
        if (configMerger != null) {
            ClipboardNegotiator.BounceHandler bounceHandler = this.updateAction;
            if (bounceHandler != null) {
                configMerger.injectMetric(new ClipboardNegotiator.ActivityMutator(bounceHandler));
            }
            PatternLoader patternLoader = this.connectComponent;
            if (patternLoader != null) {
                configMerger.injectMetric(new ToastShard(patternLoader));
            }
            Iterator it = this.startResource.values().iterator();
            while (it.hasNext()) {
                configMerger.injectMetric(new ClipboardNegotiator.ActivityMutator((ClipboardNegotiator.BounceHandler) it.next()));
            }
        }
        this.updateAction = null;
        this.connectComponent = null;
        this.startResource.clear();
    }

    @Override // com.goldenboot.saga.zone.KeyboardReducer
    public final void applyData(ServerMerger serverMerger) {
        PointerInspector pointerInspector = this.packPackage;
        if (pointerInspector != null) {
            Intrinsics.checkNotNull(pointerInspector);
            SetupCoordinator.injectAsset(serverMerger, pointerInspector.getValue());
        }
        SetupCoordinator.compressBody(serverMerger, this.queryModel, new BounceHandler());
        if (this.unlockMessage) {
            this.mapJob.applyData(serverMerger);
        } else {
            SetupCoordinator.serializeOffset(serverMerger);
        }
        disposeSnapshot(serverMerger);
    }

    @Override // com.goldenboot.saga.zone.SwipeHelper
    public final void attachCallback(StreamRegulator streamRegulator) {
        if (streamRegulator.clipOrigin()) {
            packField();
        }
        if (this.unlockMessage) {
            this.mapJob.attachCallback(streamRegulator);
        }
    }

    public final boolean cacheScope() {
        return this.unlockMessage;
    }

    @Override // androidx.compose.ui.RemoteCallback.LayerUseCase
    public final void checkEntry() {
        acquireModule();
        if (this.resumeSignature == null) {
            this.filterPayload = null;
        }
        CachedDeserializer cachedDeserializer = this.prepareTask;
        if (cachedDeserializer != null) {
            formatAsset(cachedDeserializer);
        }
        this.prepareTask = null;
    }

    @Override // androidx.compose.ui.RemoteCallback.LayerUseCase
    /* renamed from: decodeDigest */
    public final boolean getShouldAutoInvalidate() {
        return this.dispatchTimezone;
    }

    public final boolean detachSample() {
        return androidx.compose.foundation.BounceHandler.releaseHeader(this) || FeatureSampler.injectMetric(this);
    }

    public final boolean executeScope() {
        return this.resumeSignature == null && this.inflateEdge != null;
    }

    @Override // com.goldenboot.saga.zone.ScrollWork
    public final void extractParams() {
        PatternLoader patternLoader;
        ConfigMerger configMerger = this.filterPayload;
        if (configMerger != null && (patternLoader = this.connectComponent) != null) {
            configMerger.injectMetric(new ToastShard(patternLoader));
        }
        this.connectComponent = null;
        EmbeddedGenerator embeddedGenerator = this.attachCallback;
        if (embeddedGenerator != null) {
            embeddedGenerator.extractParams();
        }
    }

    @Override // com.goldenboot.saga.zone.NotificationPatch
    public final boolean formatMessage(KeyEvent keyEvent) {
        return false;
    }

    public final ElevationNode formatState() {
        return this.bindBody;
    }

    public final void insertToken() {
        PatternLoader patternLoader = this.connectComponent;
        if (patternLoader != null) {
            ToastShard toastShard = new ToastShard(patternLoader);
            ConfigMerger configMerger = this.filterPayload;
            if (configMerger != null) {
                BottomBarDrain.detachStream(trimEntry(), null, null, new LayerUseCase(configMerger, toastShard, null), 3, null);
            }
            this.connectComponent = null;
        }
    }

    public abstract Object lookupCurrency(PulseBucket pulseBucket, ServiceRegulator serviceRegulator);

    public final void packField() {
        ReceiverState receiverState;
        if (this.prepareTask == null && (receiverState = this.inflateEdge) != null) {
            if (this.filterPayload == null) {
                this.filterPayload = SaveAlerter.evictLayout();
            }
            this.mapJob.initCurrency(this.filterPayload);
            ConfigMerger configMerger = this.filterPayload;
            Intrinsics.checkNotNull(configMerger);
            CachedDeserializer evictLayout = receiverState.evictLayout(configMerger);
            evictMessage(evictLayout);
            this.prepareTask = evictLayout;
        }
    }

    @Override // com.goldenboot.saga.zone.ScrollWork
    public final void peekField(DrawableCustodian drawableCustodian, TimelineShaper timelineShaper, long j) {
        long growPayload = ProgressPatch.growPayload(j);
        this.formatPosition = FadeDispatcher.evictLayout(FontReporter.serializeOffset(growPayload), FontReporter.notifyMessage(growPayload));
        packField();
        if (this.unlockMessage && timelineShaper == TimelineShaper.notifyMessage) {
            int type = drawableCustodian.getType();
            BoxFabricator.Companion companion = BoxFabricator.INSTANCE;
            if (BoxFabricator.drawField(type, companion.evictLayout())) {
                BottomBarDrain.detachStream(trimEntry(), null, null, new PluginInterpreter(null), 3, null);
            } else if (BoxFabricator.drawField(type, companion.growPayload())) {
                BottomBarDrain.detachStream(trimEntry(), null, null, new RestoreToggle(null), 3, null);
            }
        }
        if (this.attachCallback == null) {
            this.attachCallback = (EmbeddedGenerator) evictMessage(ClientSerializer.growPayload(new MorphDirector(null)));
        }
        EmbeddedGenerator embeddedGenerator = this.attachCallback;
        if (embeddedGenerator != null) {
            embeddedGenerator.peekField(drawableCustodian, timelineShaper, j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r2.prepareTask == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performKey(ConfigMerger configMerger, ReceiverState receiverState, boolean z, String str, PointerInspector pointerInspector, ElevationNode elevationNode) {
        boolean z2;
        CachedDeserializer cachedDeserializer;
        boolean z3 = true;
        if (Intrinsics.areEqual(this.resumeSignature, configMerger)) {
            z2 = false;
        } else {
            acquireModule();
            this.resumeSignature = configMerger;
            this.filterPayload = configMerger;
            z2 = true;
        }
        if (!Intrinsics.areEqual(this.inflateEdge, receiverState)) {
            this.inflateEdge = receiverState;
            z2 = true;
        }
        if (this.unlockMessage != z) {
            if (z) {
                evictMessage(this.parseAsset);
                evictMessage(this.mapJob);
            } else {
                formatAsset(this.parseAsset);
                formatAsset(this.mapJob);
                acquireModule();
            }
            DelegateWriter.growPayload(this);
            this.unlockMessage = z;
        }
        if (!Intrinsics.areEqual(this.queryModel, str)) {
            this.queryModel = str;
            DelegateWriter.growPayload(this);
        }
        if (!Intrinsics.areEqual(this.packPackage, pointerInspector)) {
            this.packPackage = pointerInspector;
            DelegateWriter.growPayload(this);
        }
        this.bindBody = elevationNode;
        if (this.groupArchive != executeScope()) {
            boolean executeScope = executeScope();
            this.groupArchive = executeScope;
            if (!executeScope) {
            }
        }
        z3 = z2;
        if (z3 && ((cachedDeserializer = this.prepareTask) != null || !this.groupArchive)) {
            if (cachedDeserializer != null) {
                formatAsset(cachedDeserializer);
            }
            this.prepareTask = null;
            packField();
        }
        this.mapJob.initCurrency(this.filterPayload);
    }

    public final Object removeParams(JoystickLock joystickLock, long j, ServiceRegulator serviceRegulator) {
        Object releaseHeader;
        ConfigMerger configMerger = this.filterPayload;
        return (configMerger == null || (releaseHeader = LayerArray.releaseHeader(new EndpointList(joystickLock, j, configMerger, this, null), serviceRegulator)) != RotateReceiver.releaseHeader()) ? DpadBuilder.evictLayout : releaseHeader;
    }

    @Override // com.goldenboot.saga.zone.NotificationPatch
    public final boolean resumeOrigin(KeyEvent keyEvent) {
        packField();
        if (this.unlockMessage && FeatureSampler.clipOrigin(keyEvent)) {
            if (this.startResource.containsKey(RuntimeCreator.removePattern(WorkerInstantiator.evictLayout(keyEvent)))) {
                return false;
            }
            ClipboardNegotiator.BounceHandler bounceHandler = new ClipboardNegotiator.BounceHandler(this.formatPosition, null);
            this.startResource.put(RuntimeCreator.removePattern(WorkerInstantiator.evictLayout(keyEvent)), bounceHandler);
            if (this.filterPayload != null) {
                BottomBarDrain.detachStream(trimEntry(), null, null, new StylusConverter(bounceHandler, null), 3, null);
            }
            return true;
        }
        if (!this.unlockMessage || !FeatureSampler.growPayload(keyEvent)) {
            return false;
        }
        ClipboardNegotiator.BounceHandler bounceHandler2 = (ClipboardNegotiator.BounceHandler) this.startResource.remove(RuntimeCreator.removePattern(WorkerInstantiator.evictLayout(keyEvent)));
        if (bounceHandler2 != null && this.filterPayload != null) {
            BottomBarDrain.detachStream(trimEntry(), null, null, new ScopedMigration(bounceHandler2, null), 3, null);
        }
        this.bindBody.invoke();
        return true;
    }

    public final void saveEvent() {
        if (this.connectComponent == null) {
            PatternLoader patternLoader = new PatternLoader();
            ConfigMerger configMerger = this.filterPayload;
            if (configMerger != null) {
                BottomBarDrain.detachStream(trimEntry(), null, null, new FeedbackFlow(configMerger, patternLoader, null), 3, null);
            }
            this.connectComponent = patternLoader;
        }
    }

    @Override // com.goldenboot.saga.zone.KeyboardReducer
    public final boolean savePool() {
        return true;
    }

    @Override // com.goldenboot.saga.zone.LayoutBlock
    /* renamed from: saveSnapshot */
    public Object getTraverseKey() {
        return this.cancelArchive;
    }

    @Override // androidx.compose.ui.RemoteCallback.LayerUseCase
    public final void scatterCounter() {
        if (!this.groupArchive) {
            packField();
        }
        if (this.unlockMessage) {
            evictMessage(this.parseAsset);
            evictMessage(this.mapJob);
        }
    }

    public HeaderUtil(ConfigMerger configMerger, ReceiverState receiverState, boolean z, String str, PointerInspector pointerInspector, ElevationNode elevationNode) {
        this.filterPayload = configMerger;
        this.inflateEdge = receiverState;
        this.queryModel = str;
        this.packPackage = pointerInspector;
        this.unlockMessage = z;
        this.bindBody = elevationNode;
        this.parseAsset = new ShadowDownloader();
        this.mapJob = new WaveMutex(this.filterPayload);
        this.startResource = new LinkedHashMap();
        this.formatPosition = RuntimeHeap.INSTANCE.releaseHeader();
        this.resumeSignature = this.filterPayload;
        this.groupArchive = executeScope();
        this.cancelArchive = resolveDelta;
    }

    public void disposeSnapshot(ServerMerger serverMerger) {
    }
}
