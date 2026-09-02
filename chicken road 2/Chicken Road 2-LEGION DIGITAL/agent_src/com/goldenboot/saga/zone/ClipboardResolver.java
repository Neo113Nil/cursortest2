package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import androidx.compose.ui.layout.GradientActivator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 Q2\u00020\u0001:\u0002RSB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J'\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J5\u0010$\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b\u0018\u00010!H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b-\u0010.R*\u00106\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010=\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R.\u0010E\u001a\u0004\u0018\u00010>2\b\u0010/\u001a\u0004\u0018\u00010>8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010P\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006T"}, d2 = {"Lcom/goldenboot/saga/zone/ClipboardResolver;", "Lcom/goldenboot/saga/zone/BridgeSerializer;", "Lcom/goldenboot/saga/zone/ContentRepository;", "layoutNode", "Lcom/goldenboot/saga/zone/KeyframeCreator;", "measureNode", "<init>", "(Lcom/goldenboot/saga/zone/ContentRepository;Lcom/goldenboot/saga/zone/KeyframeCreator;)V", "Lcom/goldenboot/saga/zone/DpadBuilder;", "flattenCounter", "()V", "mergeEvent", "Lcom/goldenboot/saga/zone/PagerPlanner;", "constraints", "Landroidx/compose/ui/layout/GradientActivator;", "prependArchive", "(J)Landroidx/compose/ui/layout/GradientActivator;", "", "height", "prepareCount", "(I)I", "protectChannel", "width", "applyData", "attachCallback", "Lcom/goldenboot/saga/zone/FontReporter;", "position", "", "zIndex", "Lcom/goldenboot/saga/zone/BottomBarEvaluator;", "layer", "dispatchLink", "(JFLcom/goldenboot/saga/zone/BottomBarEvaluator;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/ScopedMigration;", "layerBlock", "observeView", "(JFLcom/goldenboot/saga/zone/TouchRecord;)V", "Lcom/goldenboot/saga/zone/BottomBarActivator;", "alignmentLine", "disconnectSession", "(Lcom/goldenboot/saga/zone/BottomBarActivator;)I", "Lcom/goldenboot/saga/zone/PulseCounter;", "canvas", "graphicsLayer", "packField", "(Lcom/goldenboot/saga/zone/PulseCounter;Lcom/goldenboot/saga/zone/BottomBarEvaluator;)V", "value", "growCallback", "Lcom/goldenboot/saga/zone/KeyframeCreator;", "unwrapValue", "()Lcom/goldenboot/saga/zone/KeyframeCreator;", "restartOrigin", "(Lcom/goldenboot/saga/zone/KeyframeCreator;)V", "layoutModifierNode", "drawConfig", "Lcom/goldenboot/saga/zone/PagerPlanner;", "buildValue", "()Lcom/goldenboot/saga/zone/PagerPlanner;", "abortLocale", "(Lcom/goldenboot/saga/zone/PagerPlanner;)V", "lookaheadConstraints", "Lcom/goldenboot/saga/zone/MorphTimer;", "normalizeBundle", "Lcom/goldenboot/saga/zone/MorphTimer;", "compressStrategy", "()Lcom/goldenboot/saga/zone/MorphTimer;", "resolveAdapter", "(Lcom/goldenboot/saga/zone/MorphTimer;)V", "lookaheadDelegate", "Landroidx/compose/ui/layout/LayerUseCase;", "commitBounds", "Landroidx/compose/ui/layout/LayerUseCase;", "approachMeasureScope", "Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "packSnapshot", "()Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "tail", "ensureCallback", "()Lcom/goldenboot/saga/zone/BridgeSerializer;", "wrappedNonNull", "closePayload", "BounceHandler", "ActivityMutator", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClipboardResolver extends BridgeSerializer {

    /* renamed from: closePayload, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int expandScope = 0;
    private static final ScopedProcess formatMessage;

    /* renamed from: commitBounds, reason: from kotlin metadata */
    private androidx.compose.ui.layout.LayerUseCase approachMeasureScope;

    /* renamed from: drawConfig, reason: from kotlin metadata */
    private PagerPlanner lookaheadConstraints;

    /* renamed from: growCallback, reason: from kotlin metadata */
    private KeyframeCreator layoutModifierNode;

    /* renamed from: normalizeBundle, reason: from kotlin metadata */
    private MorphTimer lookaheadDelegate;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/goldenboot/saga/zone/ClipboardResolver$ActivityMutator;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/ScopedProcess;", "modifierBoundsPaint", "Lcom/goldenboot/saga/zone/ScopedProcess;", "evictLayout", "()Lcom/goldenboot/saga/zone/ScopedProcess;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.ClipboardResolver$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ScopedProcess evictLayout() {
            return ClipboardResolver.formatMessage;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/goldenboot/saga/zone/ClipboardResolver$BounceHandler;", "Lcom/goldenboot/saga/zone/MorphTimer;", "<init>", "(Lcom/goldenboot/saga/zone/ClipboardResolver;)V", "Lcom/goldenboot/saga/zone/PagerPlanner;", "constraints", "Landroidx/compose/ui/layout/GradientActivator;", "prependArchive", "(J)Landroidx/compose/ui/layout/GradientActivator;", "Lcom/goldenboot/saga/zone/BottomBarActivator;", "alignmentLine", "", "disconnectSession", "(Lcom/goldenboot/saga/zone/BottomBarActivator;)I", "height", "prepareCount", "(I)I", "protectChannel", "width", "applyData", "attachCallback", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class BounceHandler extends MorphTimer {
        public BounceHandler() {
            super(ClipboardResolver.this);
        }

        @Override // com.goldenboot.saga.zone.MorphTimer, com.goldenboot.saga.zone.FrameRevision
        public int applyData(int width) {
            KeyframeCreator layoutModifierNode = ClipboardResolver.this.getLayoutModifierNode();
            MorphTimer lookaheadDelegate = ClipboardResolver.this.ensureCallback().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.bindBody(this, lookaheadDelegate, width);
        }

        @Override // com.goldenboot.saga.zone.MorphTimer, com.goldenboot.saga.zone.FrameRevision
        public int attachCallback(int width) {
            KeyframeCreator layoutModifierNode = ClipboardResolver.this.getLayoutModifierNode();
            MorphTimer lookaheadDelegate = ClipboardResolver.this.ensureCallback().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.storeCharset(this, lookaheadDelegate, width);
        }

        @Override // com.goldenboot.saga.zone.SlideChannel
        public int disconnectSession(BottomBarActivator alignmentLine) {
            int growPayload;
            growPayload = SheetDecoder.growPayload(this, alignmentLine);
            getCachedAlignmentLinesMap().purgeNode(alignmentLine, growPayload);
            return growPayload;
        }

        @Override // com.goldenboot.saga.zone.MorphTimer, com.goldenboot.saga.zone.FrameRevision
        public int prepareCount(int height) {
            KeyframeCreator layoutModifierNode = ClipboardResolver.this.getLayoutModifierNode();
            MorphTimer lookaheadDelegate = ClipboardResolver.this.ensureCallback().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.handleFooter(this, lookaheadDelegate, height);
        }

        @Override // com.goldenboot.saga.zone.BreadcrumbMerger
        public androidx.compose.ui.layout.GradientActivator prependArchive(long constraints) {
            ClipboardResolver clipboardResolver = ClipboardResolver.this;
            connectAttr(constraints);
            clipboardResolver.abortLocale(PagerPlanner.evictLayout(constraints));
            KeyframeCreator layoutModifierNode = clipboardResolver.getLayoutModifierNode();
            MorphTimer lookaheadDelegate = clipboardResolver.ensureCallback().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            sanitizeBounds(layoutModifierNode.popBlueprint(this, lookaheadDelegate, constraints));
            return this;
        }

        @Override // com.goldenboot.saga.zone.MorphTimer, com.goldenboot.saga.zone.FrameRevision
        public int protectChannel(int height) {
            KeyframeCreator layoutModifierNode = ClipboardResolver.this.getLayoutModifierNode();
            MorphTimer lookaheadDelegate = ClipboardResolver.this.ensureCallback().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.resumeSignature(this, lookaheadDelegate, height);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"com/goldenboot/saga/zone/ClipboardResolver$FeedbackFlow", "Lcom/goldenboot/saga/zone/ContentConfigurator;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "popBlueprint", "()V", "", "growPayload", "I", "getWidth", "()I", "width", "injectMetric", "getHeight", "height", "", "Lcom/goldenboot/saga/zone/BottomBarActivator;", "injectConstraint", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lcom/goldenboot/saga/zone/BoxStage;", "drawField", "()Lcom/goldenboot/saga/zone/TouchRecord;", "rulers", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FeedbackFlow implements ContentConfigurator {
        private final /* synthetic */ ContentConfigurator evictLayout;

        /* renamed from: growPayload, reason: from kotlin metadata */
        private final int width;

        /* renamed from: injectMetric, reason: from kotlin metadata */
        private final int height;

        public FeedbackFlow(ContentConfigurator contentConfigurator, ClipboardResolver clipboardResolver) {
            this.evictLayout = contentConfigurator;
            MorphTimer lookaheadDelegate = clipboardResolver.getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            this.width = lookaheadDelegate.getWidth();
            MorphTimer lookaheadDelegate2 = clipboardResolver.getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate2);
            this.height = lookaheadDelegate2.getHeight();
        }

        @Override // com.goldenboot.saga.zone.ContentConfigurator
        /* renamed from: drawField */
        public TouchRecord getRulers() {
            return this.evictLayout.getRulers();
        }

        @Override // com.goldenboot.saga.zone.ContentConfigurator
        public int getHeight() {
            return this.height;
        }

        @Override // com.goldenboot.saga.zone.ContentConfigurator
        public int getWidth() {
            return this.width;
        }

        @Override // com.goldenboot.saga.zone.ContentConfigurator
        public Map<BottomBarActivator, Integer> injectConstraint() {
            return this.evictLayout.injectConstraint();
        }

        @Override // com.goldenboot.saga.zone.ContentConfigurator
        public void popBlueprint() {
            this.evictLayout.popBlueprint();
        }
    }

    static {
        ScopedProcess evictLayout = ScopeHandler.evictLayout();
        evictLayout.serializeTask(ContainerSource.INSTANCE.injectMetric());
        evictLayout.normalizeBundle(1.0f);
        evictLayout.growCallback(ItemSupervisor.INSTANCE.growPayload());
        formatMessage = evictLayout;
    }

    public ClipboardResolver(ContentRepository contentRepository, KeyframeCreator keyframeCreator) {
        super(contentRepository);
        this.layoutModifierNode = keyframeCreator;
        androidx.compose.ui.layout.LayerUseCase layerUseCase = null;
        this.lookaheadDelegate = contentRepository.getLookaheadRoot() != null ? new BounceHandler() : null;
        if ((keyframeCreator.getNode().getKindSet() & AlphaScheduler.growPayload(ContentOperation.RotationY)) != 0) {
            Intrinsics.checkNotNull(keyframeCreator, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            layerUseCase = new androidx.compose.ui.layout.LayerUseCase(this, (androidx.compose.ui.layout.BounceHandler) keyframeCreator);
        }
        this.approachMeasureScope = layerUseCase;
    }

    private final void flattenCounter() {
        boolean z;
        if (getIsShallowPlacing()) {
            return;
        }
        insertToken();
        androidx.compose.ui.layout.LayerUseCase layerUseCase = this.approachMeasureScope;
        if (layerUseCase != null) {
            androidx.compose.ui.layout.BounceHandler approachNode = layerUseCase.getApproachNode();
            GradientActivator.ActivityMutator placementScope = getPlacementScope();
            MorphTimer lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            if (!approachNode.offerHash(placementScope, lookaheadDelegate.getLookaheadLayoutCoordinates()) && !layerUseCase.getApproachMeasureRequired()) {
                long applyTask = applyTask();
                MorphTimer lookaheadDelegate2 = getLookaheadDelegate();
                if (ScaleSaver.flushSample(applyTask, lookaheadDelegate2 != null ? ScaleSaver.growPayload(lookaheadDelegate2.prependBundle()) : null)) {
                    long applyTask2 = ensureCallback().applyTask();
                    MorphTimer lookaheadDelegate3 = ensureCallback().getLookaheadDelegate();
                    if (ScaleSaver.flushSample(applyTask2, lookaheadDelegate3 != null ? ScaleSaver.growPayload(lookaheadDelegate3.prependBundle()) : null)) {
                        z = true;
                        ensureCallback().lockEndpoint(z);
                    }
                }
            }
            z = false;
            ensureCallback().lockEndpoint(z);
        }
        resolveParams().popBlueprint();
        ensureCallback().lockEndpoint(false);
    }

    public final void abortLocale(PagerPlanner pagerPlanner) {
        this.lookaheadConstraints = pagerPlanner;
    }

    @Override // com.goldenboot.saga.zone.FrameRevision
    public int applyData(int width) {
        androidx.compose.ui.layout.LayerUseCase layerUseCase = this.approachMeasureScope;
        return layerUseCase != null ? layerUseCase.getApproachNode().dispatchLink(layerUseCase, ensureCallback(), width) : this.layoutModifierNode.bindBody(this, ensureCallback(), width);
    }

    @Override // com.goldenboot.saga.zone.FrameRevision
    public int attachCallback(int width) {
        androidx.compose.ui.layout.LayerUseCase layerUseCase = this.approachMeasureScope;
        return layerUseCase != null ? layerUseCase.getApproachNode().findVersion(layerUseCase, ensureCallback(), width) : this.layoutModifierNode.storeCharset(this, ensureCallback(), width);
    }

    /* renamed from: buildValue, reason: from getter */
    public final PagerPlanner getLookaheadConstraints() {
        return this.lookaheadConstraints;
    }

    @Override // com.goldenboot.saga.zone.BridgeSerializer
    /* renamed from: compressStrategy, reason: from getter */
    public MorphTimer getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // com.goldenboot.saga.zone.SlideChannel
    public int disconnectSession(BottomBarActivator alignmentLine) {
        int growPayload;
        MorphTimer lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.verifyComponent(alignmentLine);
        }
        growPayload = SheetDecoder.growPayload(this, alignmentLine);
        return growPayload;
    }

    @Override // com.goldenboot.saga.zone.BridgeSerializer, androidx.compose.ui.layout.GradientActivator
    public void dispatchLink(long position, float zIndex, BottomBarEvaluator layer) {
        super.dispatchLink(position, zIndex, layer);
        flattenCounter();
    }

    public final BridgeSerializer ensureCallback() {
        BridgeSerializer wrapped = getWrapped();
        Intrinsics.checkNotNull(wrapped);
        return wrapped;
    }

    @Override // com.goldenboot.saga.zone.BridgeSerializer
    public void mergeEvent() {
        if (getLookaheadDelegate() == null) {
            resolveAdapter(new BounceHandler());
        }
    }

    @Override // com.goldenboot.saga.zone.BridgeSerializer, androidx.compose.ui.layout.GradientActivator
    public void observeView(long position, float zIndex, TouchRecord layerBlock) {
        super.observeView(position, zIndex, layerBlock);
        flattenCounter();
    }

    @Override // com.goldenboot.saga.zone.BridgeSerializer
    public void packField(PulseCounter canvas, BottomBarEvaluator graphicsLayer) {
        BridgeSerializer wrapped;
        ensureCallback().applyMetric(canvas, graphicsLayer);
        if (!MenuReceiver.injectMetric(getLayoutNode()).getShowLayoutBounds() || (wrapped = getWrapped()) == null) {
            return;
        }
        if (ScaleSaver.updateTimer(applyTask(), wrapped.applyTask()) && FontReporter.drawField(wrapped.getPosition(), FontReporter.INSTANCE.growPayload())) {
            return;
        }
        scatterCounter(canvas, formatMessage);
    }

    @Override // com.goldenboot.saga.zone.BridgeSerializer
    public RemoteCallback.LayerUseCase packSnapshot() {
        return this.layoutModifierNode.getNode();
    }

    @Override // com.goldenboot.saga.zone.FrameRevision
    public int prepareCount(int height) {
        androidx.compose.ui.layout.LayerUseCase layerUseCase = this.approachMeasureScope;
        return layerUseCase != null ? layerUseCase.getApproachNode().emitCharset(layerUseCase, ensureCallback(), height) : this.layoutModifierNode.handleFooter(this, ensureCallback(), height);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r8 == r1.getHeight()) goto L27;
     */
    @Override // com.goldenboot.saga.zone.BreadcrumbMerger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.compose.ui.layout.GradientActivator prependArchive(long constraints) {
        ContentConfigurator popBlueprint;
        if (getForceMeasureWithLookaheadConstraints()) {
            PagerPlanner pagerPlanner = this.lookaheadConstraints;
            if (pagerPlanner == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            constraints = pagerPlanner.getValue();
        }
        connectAttr(constraints);
        androidx.compose.ui.layout.LayerUseCase layerUseCase = this.approachMeasureScope;
        if (layerUseCase != null) {
            androidx.compose.ui.layout.BounceHandler approachNode = layerUseCase.getApproachNode();
            boolean z = true;
            layerUseCase.attachCallback(approachNode.updateConstraint(layerUseCase.transformCurrency()) || !PagerPlanner.clipOrigin(constraints, getLookaheadConstraints()));
            if (!layerUseCase.getApproachMeasureRequired()) {
                ensureCallback().unlockSnapshot(true);
            }
            popBlueprint = approachNode.compressVersion(layerUseCase, ensureCallback(), constraints);
            ensureCallback().unlockSnapshot(false);
            int width = popBlueprint.getWidth();
            MorphTimer lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            if (width == lookaheadDelegate.getWidth()) {
                int height = popBlueprint.getHeight();
                MorphTimer lookaheadDelegate2 = getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate2);
            }
            z = false;
            if (!layerUseCase.getApproachMeasureRequired()) {
                long applyTask = ensureCallback().applyTask();
                MorphTimer lookaheadDelegate3 = ensureCallback().getLookaheadDelegate();
                if (ScaleSaver.flushSample(applyTask, lookaheadDelegate3 != null ? ScaleSaver.growPayload(lookaheadDelegate3.prependBundle()) : null) && !z) {
                    popBlueprint = new FeedbackFlow(popBlueprint, this);
                }
            }
        } else {
            popBlueprint = getLayoutModifierNode().popBlueprint(this, ensureCallback(), constraints);
        }
        drainMetadata(popBlueprint);
        saveEvent();
        return this;
    }

    @Override // com.goldenboot.saga.zone.FrameRevision
    public int protectChannel(int height) {
        androidx.compose.ui.layout.LayerUseCase layerUseCase = this.approachMeasureScope;
        return layerUseCase != null ? layerUseCase.getApproachNode().closePayload(layerUseCase, ensureCallback(), height) : this.layoutModifierNode.resumeSignature(this, ensureCallback(), height);
    }

    @Override // com.goldenboot.saga.zone.BridgeSerializer
    public void resolveAdapter(MorphTimer morphTimer) {
        this.lookaheadDelegate = morphTimer;
    }

    public final void restartOrigin(KeyframeCreator keyframeCreator) {
        if (!Intrinsics.areEqual(keyframeCreator, this.layoutModifierNode)) {
            RemoteCallback.LayerUseCase node = keyframeCreator.getNode();
            if ((node.getKindSet() & AlphaScheduler.growPayload(ContentOperation.RotationY)) != 0) {
                Intrinsics.checkNotNull(keyframeCreator, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                androidx.compose.ui.layout.BounceHandler bounceHandler = (androidx.compose.ui.layout.BounceHandler) keyframeCreator;
                androidx.compose.ui.layout.LayerUseCase layerUseCase = this.approachMeasureScope;
                if (layerUseCase != null) {
                    layerUseCase.updateAction(bounceHandler);
                } else {
                    layerUseCase = new androidx.compose.ui.layout.LayerUseCase(this, bounceHandler);
                }
                this.approachMeasureScope = layerUseCase;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = keyframeCreator;
    }

    /* renamed from: unwrapValue, reason: from getter */
    public final KeyframeCreator getLayoutModifierNode() {
        return this.layoutModifierNode;
    }
}
