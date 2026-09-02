package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import androidx.compose.ui.layout.GradientActivator;
import com.goldenboot.saga.zone.FeatureConverter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class InterpolatorGraph extends RemoteCallback.LayerUseCase implements KeyframeCreator, DpadFormer, KeyboardReducer {
    public Map bindBody;
    public GlobalShaper dispatchTimezone;
    public int filterPayload;
    public String flattenPackage;
    public boolean inflateEdge;
    public TextStyle injectConstraint;
    public ActivityMutator mapJob;
    public int packPackage;
    public TouchRecord parseAsset;
    public int queryModel;
    public FeatureConverter.BounceHandler storeCharset;
    public EndpointSwitch unlockMessage;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends Lambda implements TouchRecord {
        public BounceHandler() {
            super(1);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List list) {
            TextStyle removeCount;
            GlobalShaper processAdapter = InterpolatorGraph.this.processAdapter();
            TextStyle textStyle = InterpolatorGraph.this.injectConstraint;
            EndpointSwitch endpointSwitch = InterpolatorGraph.this.unlockMessage;
            removeCount = textStyle.removeCount((r60 & 1) != 0 ? ContainerSource.INSTANCE.purgeNode() : endpointSwitch != null ? endpointSwitch.evictLayout() : ContainerSource.INSTANCE.purgeNode(), (r60 & 2) != 0 ? PooledStatus.INSTANCE.growPayload() : 0L, (r60 & 4) != 0 ? null : null, (r60 & 8) != 0 ? null : null, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : null, (r60 & 64) != 0 ? null : null, (r60 & ContentOperation.SpotShadowColor) != 0 ? PooledStatus.INSTANCE.growPayload() : 0L, (r60 & ContentOperation.RotationX) != 0 ? null : null, (r60 & ContentOperation.RotationY) != 0 ? null : null, (r60 & ContentOperation.RotationZ) != 0 ? null : null, (r60 & ContentOperation.CameraDistance) != 0 ? ContainerSource.INSTANCE.purgeNode() : 0L, (r60 & ContentOperation.TransformOrigin) != 0 ? null : null, (r60 & ContentOperation.Shape) != 0 ? null : null, (r60 & ContentOperation.Clip) != 0 ? null : null, (r60 & ContentOperation.CompositingStrategy) != 0 ? LifecycleGenerator.INSTANCE.flushSample() : 0, (r60 & 65536) != 0 ? ModuleChain.INSTANCE.clipOrigin() : 0, (r60 & ContentOperation.RenderEffect) != 0 ? PooledStatus.INSTANCE.growPayload() : 0L, (r60 & ContentOperation.ColorFilter) != 0 ? null : null, (r60 & ContentOperation.BlendMode) != 0 ? null : null, (r60 & 1048576) != 0 ? AccentSerializer.INSTANCE.flushSample() : 0, (r60 & 2097152) != 0 ? SingletonAssembler.INSTANCE.injectMetric() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & 8388608) != 0 ? null : null);
            TextLayoutResult reduceScope = processAdapter.reduceScope(removeCount);
            if (reduceScope != null) {
                list.add(reduceScope);
            } else {
                reduceScope = null;
            }
            return Boolean.valueOf(reduceScope != null);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class EndpointList extends Lambda implements ElevationNode {
        public EndpointList() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            InterpolatorGraph.this.formatAsset();
            InterpolatorGraph.this.initCurrency();
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow extends Lambda implements TouchRecord {
        public FeedbackFlow() {
            super(1);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WatcherDelta watcherDelta) {
            InterpolatorGraph.this.escapeMetadata(watcherDelta.getText());
            InterpolatorGraph.this.initCurrency();
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class LayerUseCase extends Lambda implements TouchRecord {
        public LayerUseCase() {
            super(1);
        }

        public final Boolean evictLayout(boolean z) {
            if (InterpolatorGraph.this.mapJob == null) {
                return Boolean.FALSE;
            }
            ActivityMutator activityMutator = InterpolatorGraph.this.mapJob;
            if (activityMutator != null) {
                activityMutator.releaseHeader(z);
            }
            InterpolatorGraph.this.initCurrency();
            return Boolean.TRUE;
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return evictLayout(((Boolean) obj).booleanValue());
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class StylusConverter extends Lambda implements TouchRecord {
        public final /* synthetic */ androidx.compose.ui.layout.GradientActivator reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StylusConverter(androidx.compose.ui.layout.GradientActivator gradientActivator) {
            super(1);
            this.reduceScope = gradientActivator;
        }

        public final void evictLayout(GradientActivator.ActivityMutator activityMutator) {
            GradientActivator.ActivityMutator.updateAction(activityMutator, this.reduceScope, 0, 0, 0.0f, 4, null);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((GradientActivator.ActivityMutator) obj);
            return DpadBuilder.evictLayout;
        }
    }

    public /* synthetic */ InterpolatorGraph(String str, TextStyle textStyle, FeatureConverter.BounceHandler bounceHandler, int i, boolean z, int i2, int i3, EndpointSwitch endpointSwitch, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, bounceHandler, i, z, i2, i3, endpointSwitch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initCurrency() {
        DelegateWriter.growPayload(this);
        ViewExtractor.growPayload(this);
        ParallelArray.evictLayout(this);
    }

    @Override // com.goldenboot.saga.zone.KeyboardReducer
    public void applyData(ServerMerger serverMerger) {
        TouchRecord touchRecord = this.parseAsset;
        if (touchRecord == null) {
            touchRecord = new BounceHandler();
            this.parseAsset = touchRecord;
        }
        SetupCoordinator.convertFrame(serverMerger, new WatcherDelta(this.flattenPackage, null, null, 6, null));
        ActivityMutator activityMutator = this.mapJob;
        if (activityMutator != null) {
            SetupCoordinator.growState(serverMerger, activityMutator.injectMetric());
            SetupCoordinator.encodeOrigin(serverMerger, new WatcherDelta(activityMutator.growPayload(), null, null, 6, null));
        }
        SetupCoordinator.pauseNode(serverMerger, null, new FeedbackFlow(), 1, null);
        SetupCoordinator.resumeOrigin(serverMerger, null, new LayerUseCase(), 1, null);
        SetupCoordinator.clipOrigin(serverMerger, null, new EndpointList(), 1, null);
        SetupCoordinator.compressVersion(serverMerger, null, touchRecord, 1, null);
    }

    @Override // com.goldenboot.saga.zone.KeyframeCreator
    public int bindBody(ProducerRecovery producerRecovery, FrameRevision frameRevision, int i) {
        return syncSample(producerRecovery).clipOrigin(i, producerRecovery.getLayoutDirection());
    }

    public final boolean collectPayload(TextStyle textStyle, int i, int i2, boolean z, FeatureConverter.BounceHandler bounceHandler, int i3) {
        boolean z2 = !this.injectConstraint.serializeTask(textStyle);
        this.injectConstraint = textStyle;
        if (this.packPackage != i) {
            this.packPackage = i;
            z2 = true;
        }
        if (this.queryModel != i2) {
            this.queryModel = i2;
            z2 = true;
        }
        if (this.inflateEdge != z) {
            this.inflateEdge = z;
            z2 = true;
        }
        if (!Intrinsics.areEqual(this.storeCharset, bounceHandler)) {
            this.storeCharset = bounceHandler;
            z2 = true;
        }
        if (TranslateAction.applyTask(this.filterPayload, i3)) {
            return z2;
        }
        this.filterPayload = i3;
        return true;
    }

    public final boolean computeMessage(EndpointSwitch endpointSwitch, TextStyle textStyle) {
        boolean areEqual = Intrinsics.areEqual(endpointSwitch, this.unlockMessage);
        this.unlockMessage = endpointSwitch;
        return (areEqual && textStyle.resetValue(this.injectConstraint)) ? false : true;
    }

    public final boolean escapeMetadata(String str) {
        DpadBuilder dpadBuilder;
        ActivityMutator activityMutator = this.mapJob;
        if (activityMutator == null) {
            ActivityMutator activityMutator2 = new ActivityMutator(this.flattenPackage, str, false, null, 12, null);
            GlobalShaper globalShaper = new GlobalShaper(str, this.injectConstraint, this.storeCharset, this.filterPayload, this.inflateEdge, this.queryModel, this.packPackage, null);
            globalShaper.peekRevision(processAdapter().evictLayout());
            activityMutator2.detachStream(globalShaper);
            this.mapJob = activityMutator2;
            return true;
        }
        if (Intrinsics.areEqual(str, activityMutator.growPayload())) {
            return false;
        }
        activityMutator.clipOrigin(str);
        GlobalShaper evictLayout = activityMutator.evictLayout();
        if (evictLayout != null) {
            evictLayout.notifyMessage(str, this.injectConstraint, this.storeCharset, this.filterPayload, this.inflateEdge, this.queryModel, this.packPackage);
            dpadBuilder = DpadBuilder.evictLayout;
        } else {
            dpadBuilder = null;
        }
        return dpadBuilder != null;
    }

    public final void formatAsset() {
        this.mapJob = null;
    }

    @Override // com.goldenboot.saga.zone.KeyframeCreator
    public int handleFooter(ProducerRecovery producerRecovery, FrameRevision frameRevision, int i) {
        return syncSample(producerRecovery).drawField(producerRecovery.getLayoutDirection());
    }

    @Override // com.goldenboot.saga.zone.KeyframeCreator
    public ContentConfigurator popBlueprint(androidx.compose.ui.layout.PanelUtil panelUtil, BreadcrumbMerger breadcrumbMerger, long j) {
        GlobalShaper syncSample = syncSample(panelUtil);
        boolean updateTimer = syncSample.updateTimer(j, panelUtil.getLayoutDirection());
        syncSample.detachStream();
        StylusTrigger releaseHeader = syncSample.releaseHeader();
        Intrinsics.checkNotNull(releaseHeader);
        long injectMetric = syncSample.injectMetric();
        if (updateTimer) {
            ViewExtractor.evictLayout(this);
            Map map = this.bindBody;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            map.put(SelectionParser.evictLayout(), Integer.valueOf(Math.round(releaseHeader.peekRevision())));
            map.put(SelectionParser.growPayload(), Integer.valueOf(Math.round(releaseHeader.applyTask())));
            this.bindBody = map;
        }
        androidx.compose.ui.layout.GradientActivator prependArchive = breadcrumbMerger.prependArchive(PagerPlanner.INSTANCE.growPayload(ScaleSaver.peekRevision(injectMetric), ScaleSaver.peekRevision(injectMetric), ScaleSaver.popBlueprint(injectMetric), ScaleSaver.popBlueprint(injectMetric)));
        int peekRevision = ScaleSaver.peekRevision(injectMetric);
        int popBlueprint = ScaleSaver.popBlueprint(injectMetric);
        Map<BottomBarActivator, Integer> map2 = this.bindBody;
        Intrinsics.checkNotNull(map2);
        return panelUtil.removeStrategy(peekRevision, popBlueprint, map2, new StylusConverter(prependArchive));
    }

    public final GlobalShaper processAdapter() {
        if (this.dispatchTimezone == null) {
            this.dispatchTimezone = new GlobalShaper(this.flattenPackage, this.injectConstraint, this.storeCharset, this.filterPayload, this.inflateEdge, this.queryModel, this.packPackage, null);
        }
        GlobalShaper globalShaper = this.dispatchTimezone;
        Intrinsics.checkNotNull(globalShaper);
        return globalShaper;
    }

    public final boolean processValue(String str) {
        if (Intrinsics.areEqual(this.flattenPackage, str)) {
            return false;
        }
        this.flattenPackage = str;
        formatAsset();
        return true;
    }

    public final void removeTarget(boolean z, boolean z2, boolean z3) {
        if (z2 || z3) {
            processAdapter().notifyMessage(this.flattenPackage, this.injectConstraint, this.storeCharset, this.filterPayload, this.inflateEdge, this.queryModel, this.packPackage);
        }
        if (getIsAttached()) {
            if (z2 || (z && this.parseAsset != null)) {
                DelegateWriter.growPayload(this);
            }
            if (z2 || z3) {
                ViewExtractor.growPayload(this);
                ParallelArray.evictLayout(this);
            }
            if (z) {
                ParallelArray.evictLayout(this);
            }
        }
    }

    @Override // com.goldenboot.saga.zone.KeyframeCreator
    public int resumeSignature(ProducerRecovery producerRecovery, FrameRevision frameRevision, int i) {
        return syncSample(producerRecovery).popBlueprint(producerRecovery.getLayoutDirection());
    }

    @Override // com.goldenboot.saga.zone.KeyframeCreator
    public int storeCharset(ProducerRecovery producerRecovery, FrameRevision frameRevision, int i) {
        return syncSample(producerRecovery).clipOrigin(i, producerRecovery.getLayoutDirection());
    }

    public final GlobalShaper syncSample(BackgroundCollection backgroundCollection) {
        GlobalShaper evictLayout;
        ActivityMutator activityMutator = this.mapJob;
        if (activityMutator != null && activityMutator.injectMetric() && (evictLayout = activityMutator.evictLayout()) != null) {
            evictLayout.peekRevision(backgroundCollection);
            return evictLayout;
        }
        GlobalShaper processAdapter = processAdapter();
        processAdapter.peekRevision(backgroundCollection);
        return processAdapter;
    }

    @Override // com.goldenboot.saga.zone.DpadFormer
    public void unlockMessage(PublisherSegment publisherSegment) {
        if (!getIsAttached()) {
            return;
        }
        GlobalShaper syncSample = syncSample(publisherSegment);
        StylusTrigger releaseHeader = syncSample.releaseHeader();
        if (releaseHeader == null) {
            throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.dispatchTimezone + ", textSubstitution=" + this.mapJob + ')').toString());
        }
        PulseCounter applyTask = publisherSegment.getDrawContext().applyTask();
        boolean growPayload = syncSample.growPayload();
        if (growPayload) {
            float peekRevision = ScaleSaver.peekRevision(syncSample.injectMetric());
            float popBlueprint = ScaleSaver.popBlueprint(syncSample.injectMetric());
            applyTask.reduceScope();
            PulseCounter.injectConstraint(applyTask, 0.0f, 0.0f, peekRevision, popBlueprint, 0, 16, null);
        }
        try {
            PatternInspector connectComponent = this.injectConstraint.connectComponent();
            if (connectComponent == null) {
                connectComponent = PatternInspector.INSTANCE.detachStream();
            }
            PatternInspector patternInspector = connectComponent;
            Shadow parseAsset = this.injectConstraint.parseAsset();
            if (parseAsset == null) {
                parseAsset = Shadow.INSTANCE.evictLayout();
            }
            Shadow shadow = parseAsset;
            JoystickUseCase purgeNode = this.injectConstraint.purgeNode();
            if (purgeNode == null) {
                purgeNode = ConsumerMux.evictLayout;
            }
            JoystickUseCase joystickUseCase = purgeNode;
            LayerTunnel resetDelta = this.injectConstraint.resetDelta();
            if (resetDelta != null) {
                StylusTrigger.drawRequest(releaseHeader, applyTask, resetDelta, this.injectConstraint.notifyMessage(), shadow, patternInspector, joystickUseCase, 0, 64, null);
            } else {
                EndpointSwitch endpointSwitch = this.unlockMessage;
                long evictLayout = endpointSwitch != null ? endpointSwitch.evictLayout() : ContainerSource.INSTANCE.purgeNode();
                if (evictLayout == 16) {
                    evictLayout = this.injectConstraint.inflateAdapter() != 16 ? this.injectConstraint.inflateAdapter() : ContainerSource.INSTANCE.evictLayout();
                }
                StylusTrigger.mergeLocale(releaseHeader, applyTask, evictLayout, shadow, patternInspector, joystickUseCase, 0, 32, null);
            }
            if (growPayload) {
                applyTask.queryModel();
            }
        } finally {
        }
    }

    public InterpolatorGraph(String str, TextStyle textStyle, FeatureConverter.BounceHandler bounceHandler, int i, boolean z, int i2, int i3, EndpointSwitch endpointSwitch) {
        this.flattenPackage = str;
        this.injectConstraint = textStyle;
        this.storeCharset = bounceHandler;
        this.filterPayload = i;
        this.inflateEdge = z;
        this.queryModel = i2;
        this.packPackage = i3;
        this.unlockMessage = endpointSwitch;
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public GlobalShaper detachStream;
        public final String evictLayout;
        public String growPayload;
        public boolean injectMetric;

        public ActivityMutator(String str, String str2, boolean z, GlobalShaper globalShaper) {
            this.evictLayout = str;
            this.growPayload = str2;
            this.injectMetric = z;
            this.detachStream = globalShaper;
        }

        public final void clipOrigin(String str) {
            this.growPayload = str;
        }

        public final void detachStream(GlobalShaper globalShaper) {
            this.detachStream = globalShaper;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityMutator)) {
                return false;
            }
            ActivityMutator activityMutator = (ActivityMutator) obj;
            return Intrinsics.areEqual(this.evictLayout, activityMutator.evictLayout) && Intrinsics.areEqual(this.growPayload, activityMutator.growPayload) && this.injectMetric == activityMutator.injectMetric && Intrinsics.areEqual(this.detachStream, activityMutator.detachStream);
        }

        public final GlobalShaper evictLayout() {
            return this.detachStream;
        }

        public final String growPayload() {
            return this.growPayload;
        }

        public int hashCode() {
            int hashCode = ((((this.evictLayout.hashCode() * 31) + this.growPayload.hashCode()) * 31) + Boolean.hashCode(this.injectMetric)) * 31;
            GlobalShaper globalShaper = this.detachStream;
            return hashCode + (globalShaper == null ? 0 : globalShaper.hashCode());
        }

        public final boolean injectMetric() {
            return this.injectMetric;
        }

        public final void releaseHeader(boolean z) {
            this.injectMetric = z;
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.detachStream + ", isShowingSubstitution=" + this.injectMetric + ')';
        }

        public /* synthetic */ ActivityMutator(String str, String str2, boolean z, GlobalShaper globalShaper, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : globalShaper);
        }
    }
}
