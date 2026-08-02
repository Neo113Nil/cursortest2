package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0089\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\b*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010\u001e\u001a\u00020\b*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJc\u0010&\u001a\u00020\b*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b&\u0010'JK\u0010)\u001a\u00020\b*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010*JU\u0010+\u001a\u00020\b*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b+\u0010*J\u0017\u0010.\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0000¢\u0006\u0004\b1\u00102Ju\u0010?\u001a\u00020\b\"\u0004\b\u0000\u00103*\u00020\b2\u0006\u00104\u001a\u00020\u00132\u000e\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001052\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n072\u0006\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u001cH\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u0002002\u0006\u0010B\u001a\u00020AH\u0000¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u0002002\u0006\u0010F\u001a\u00020EH\u0000¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u0002002\u0006\u0010F\u001a\u00020EH\u0000¢\u0006\u0004\bI\u0010HJ\u0017\u0010L\u001a\u0002002\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u0002002\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bN\u0010MJ,\u0010V\u001a\u00020Q*\u00020O2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\bT\u0010UJ\u0014\u0010W\u001a\u00020O*\u00020OH\u0096\u0001¢\u0006\u0004\bW\u0010XR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010Y\u001a\u0004\bZ\u0010[R*\u0010\\\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR+\u0010e\u001a\u00020\n2\u0006\u0010b\u001a\u00020\n8W@SX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR0\u0010i\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\bi\u0010]\u0012\u0004\bl\u00102\u001a\u0004\bj\u0010_\"\u0004\bk\u0010aR \u0010m\u001a\b\u0012\u0004\u0012\u0002000\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bm\u0010]\u001a\u0004\bn\u0010_R$\u0010t\u001a\u00020O2\u0006\u0010o\u001a\u00020O8A@AX\u0080\u000e¢\u0006\f\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR(\u0010u\u001a\u0004\u0018\u00010O2\b\u00104\u001a\u0004\u0018\u00010O8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010qR$\u0010z\u001a\u00020O2\u0006\u0010o\u001a\u00020O8A@AX\u0080\u000e¢\u0006\f\u001a\u0004\bx\u0010q\"\u0004\by\u0010sR\u0018\u0010|\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b{\u0010vR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020J0}8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR%\u0010?\u001a\u0011\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0005\u0012\u00030\u0082\u00010\u0080\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0088\u0001\u001a\u00020O*\u00030\u0085\u00018\u0017X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl;", "Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Landroidx/compose/ui/layout/LookaheadScope;Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "", "enabled", "skipToLookaheadSize", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "", "zIndexInOverlay", "renderInOverlay", "renderInSharedTransitionScopeOverlay", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "sharedContentState", "Landroidx/compose/animation/AnimatedVisibilityScope;", "animatedVisibilityScope", "Landroidx/compose/animation/BoundsTransform;", "boundsTransform", "Landroidx/compose/animation/SharedTransitionScope$PlaceholderSize;", "placeholderSize", "renderInOverlayDuringTransition", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "clipInOverlayDuringTransition", "sharedElement", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceholderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/ExitTransition;", com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.EXIT, "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "resizeMode", "sharedBounds", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$ResizeMode;Landroidx/compose/animation/SharedTransitionScope$PlaceholderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;", "visible", "sharedElementWithCallerManagedVisibility", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;ZLandroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceholderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;", "sharedBoundsWithCallerManagedVisibility$animation", "Landroidx/compose/ui/graphics/Shape;", "clipShape", "OverlayClip", "(Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "", "updateTransitionActiveness$animation", "()V", "T", "p0", "Landroidx/compose/animation/core/Transition;", "p1", "Lkotlin/Function1;", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceholderSize;ZZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "drawInOverlay$animation", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/animation/SharedElementEntry;", "sharedElementState", "onEntryRemoved$animation", "(Landroidx/compose/animation/SharedElementEntry;)V", "onEntryAdded$animation", "Landroidx/compose/animation/LayerRenderer;", "renderer", "onLayerRendererCreated$animation", "(Landroidx/compose/animation/LayerRenderer;)V", "onLayerRendererRemoved$animation", "Landroidx/compose/ui/layout/LayoutCoordinates;", "sourceCoordinates", "Landroidx/compose/ui/geometry/Offset;", "relativeToSource", "includeMotionFrameOfReference", "localLookaheadPositionOf-au-aQtc", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "localLookaheadPositionOf", "toLookaheadCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "invalidateOverlay", "Lkotlin/jvm/functions/Function0;", "getInvalidateOverlay", "()Lkotlin/jvm/functions/Function0;", "setInvalidateOverlay", "(Lkotlin/jvm/functions/Function0;)V", "<set-?>", "isTransitionActive$delegate", "Landroidx/compose/runtime/MutableState;", "isTransitionActive", "()Z", "setTransitionActive", "(Z)V", "testBlockToRun", "getTestBlockToRun", "setTestBlockToRun", "getTestBlockToRun$annotations", "observeAnimatingBlock", "getObserveAnimatingBlock$animation", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getRoot$animation", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setRoot$animation", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "root", "nullableRoot", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getNullableRoot$animation", "getLookaheadRoot$animation", "setLookaheadRoot$animation", "lookaheadRoot", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "Landroidx/compose/animation/SharedElement;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadScopeCoordinates", "ShapeBasedClip"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SharedTransitionScopeImpl implements androidx.compose.animation.SharedTransitionScope, androidx.compose.ui.layout.LookaheadScope {
    public static final int $stable = 0;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;
    private final /* synthetic */ androidx.compose.ui.layout.LookaheadScope getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.layout.LayoutCoordinates Camera2StreamConfigurationMap;
    private kotlin.jvm.functions.Function0<kotlin.Unit> invalidateOverlay;
    private androidx.compose.ui.layout.LayoutCoordinates nullableRoot;
    private kotlin.jvm.functions.Function0<kotlin.Unit> testBlockToRun;

    /* renamed from: isTransitionActive$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isTransitionActive = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
    private final kotlin.jvm.functions.Function0<kotlin.Unit> observeAnimatingBlock = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$observeAnimatingBlock$1
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            getHighSpeedVideoFpsRanges();
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighSpeedVideoFpsRanges() {
            androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap;
            snapshotStateMap = androidx.compose.animation.SharedTransitionScopeImpl.this.getHighSpeedVideoFpsRanges;
            androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap2 = snapshotStateMap;
            if (snapshotStateMap2.isEmpty()) {
                return;
            }
            java.util.Iterator it = snapshotStateMap2.entrySet().iterator();
            while (it.hasNext() && !((androidx.compose.animation.SharedElement) ((java.util.Map.Entry) it.next()).getValue()).isAnimating()) {
            }
        }

        {
            super(0);
        }
    };
    private final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.LayerRenderer> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.snapshots.SnapshotStateMap<java.lang.Object, androidx.compose.animation.SharedElement> getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt.mutableStateMapOf();

    public static /* synthetic */ void getTestBlockToRun$annotations() {
    }

    public SharedTransitionScopeImpl(androidx.compose.ui.layout.LookaheadScope lookaheadScope, kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.getHighSpeedVideoFpsRanges = lookaheadScope;
        this.coroutineScope = coroutineScope;
    }

    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getInvalidateOverlay() {
        return this.invalidateOverlay;
    }

    public final void setInvalidateOverlay(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.invalidateOverlay = function0;
    }

    private void setTransitionActive(boolean z) {
        this.isTransitionActive.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    public final boolean isTransitionActive() {
        return ((java.lang.Boolean) this.isTransitionActive.getValue()).booleanValue();
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getTestBlockToRun() {
        return this.testBlockToRun;
    }

    public final void setTestBlockToRun(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.testBlockToRun = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    public final androidx.compose.ui.Modifier skipToLookaheadSize(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        return modifier.then(new androidx.compose.animation.SkipToLookaheadSizeElement(null, function0, 1, 0 == true ? 1 : 0));
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final androidx.compose.ui.Modifier renderInSharedTransitionScopeOverlay(androidx.compose.ui.Modifier modifier, float f, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        return modifier.then(new androidx.compose.animation.RenderInTransitionOverlayNodeElement(this, function0, f));
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final androidx.compose.ui.Modifier sharedElement(androidx.compose.ui.Modifier modifier, androidx.compose.animation.SharedTransitionScope.SharedContentState sharedContentState, androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.animation.BoundsTransform boundsTransform, androidx.compose.animation.SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, float f, androidx.compose.animation.SharedTransitionScope.OverlayClip overlayClip) {
        return getHighSpeedVideoFpsRanges(modifier, sharedContentState, animatedVisibilityScope.getTransition(), new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, java.lang.Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedElement$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.animation.EnterExitState enterExitState) {
                return java.lang.Boolean.valueOf(enterExitState == androidx.compose.animation.EnterExitState.Visible);
            }
        }, boundsTransform, placeholderSize, true, z, f, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final androidx.compose.ui.Modifier sharedBounds(androidx.compose.ui.Modifier modifier, final androidx.compose.animation.SharedTransitionScope.SharedContentState sharedContentState, final androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, final androidx.compose.animation.EnterTransition enterTransition, final androidx.compose.animation.ExitTransition exitTransition, androidx.compose.animation.BoundsTransform boundsTransform, final androidx.compose.animation.SharedTransitionScope.ResizeMode resizeMode, androidx.compose.animation.SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, float f, androidx.compose.animation.SharedTransitionScope.OverlayClip overlayClip) {
        return androidx.compose.ui.ComposedModifierKt.composed$default(getHighSpeedVideoFpsRanges(modifier, sharedContentState, animatedVisibilityScope.getTransition(), new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, java.lang.Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.animation.EnterExitState enterExitState) {
                return java.lang.Boolean.valueOf(enterExitState == androidx.compose.animation.EnterExitState.Visible);
            }
        }, boundsTransform, placeholderSize, false, z, f, overlayClip), null, new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return getHighSpeedVideoSizes(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier getHighSpeedVideoSizes(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.ui.Modifier.Companion companion;
                composer.startReplaceGroup(-233734437);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-233734437, i, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.<anonymous> (SharedTransitionScope.kt:1053)");
                }
                androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition = androidx.compose.animation.AnimatedVisibilityScope.this.getTransition();
                androidx.compose.animation.EnterTransition enterTransition2 = enterTransition;
                androidx.compose.animation.ExitTransition exitTransition2 = exitTransition;
                boolean changedInstance = composer.changedInstance(sharedContentState);
                final androidx.compose.animation.SharedTransitionScope.SharedContentState sharedContentState2 = sharedContentState;
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                        public final java.lang.Boolean invoke() {
                            return java.lang.Boolean.valueOf(androidx.compose.animation.SharedTransitionScope.SharedContentState.this.isMatchFound());
                        }

                        {
                            super(0);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("enter/exit for ");
                sb.append(sharedContentState.getKey());
                androidx.compose.ui.Modifier createModifier = androidx.compose.animation.EnterExitTransitionKt.createModifier(transition, enterTransition2, exitTransition2, (kotlin.jvm.functions.Function0) rememberedValue, sb.toString(), composer, 0, 0);
                if (resizeMode instanceof androidx.compose.animation.ScaleToBoundsImpl) {
                    composer.startReplaceGroup(-1039792755);
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.animation.ScaleToBoundsImpl scaleToBoundsImpl = (androidx.compose.animation.ScaleToBoundsImpl) resizeMode;
                    boolean changedInstance2 = composer.changedInstance(sharedContentState);
                    final androidx.compose.animation.SharedTransitionScope.SharedContentState sharedContentState3 = sharedContentState;
                    java.lang.Object rememberedValue2 = composer.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$2$1
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                            public final java.lang.Boolean invoke() {
                                return java.lang.Boolean.valueOf(androidx.compose.animation.SharedTransitionScope.SharedContentState.this.isMatchFound());
                            }

                            {
                                super(0);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    companion = androidx.compose.animation.SkipToLookaheadSizeNodeKt.createContentScaleModifier(companion2, scaleToBoundsImpl, (kotlin.jvm.functions.Function0) rememberedValue2);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1039175545);
                    composer.endReplaceGroup();
                    companion = androidx.compose.ui.Modifier.INSTANCE;
                }
                androidx.compose.ui.Modifier then = createModifier.then(companion);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return then;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }
        }, 1, null);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final androidx.compose.ui.Modifier sharedElementWithCallerManagedVisibility(androidx.compose.ui.Modifier modifier, androidx.compose.animation.SharedTransitionScope.SharedContentState sharedContentState, final boolean z, androidx.compose.animation.BoundsTransform boundsTransform, androidx.compose.animation.SharedTransitionScope.PlaceholderSize placeholderSize, boolean z2, float f, androidx.compose.animation.SharedTransitionScope.OverlayClip overlayClip) {
        return getHighSpeedVideoFpsRanges(modifier, sharedContentState, null, new kotlin.jvm.functions.Function1<kotlin.Unit, java.lang.Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedElementWithCallerManagedVisibility$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(kotlin.Unit unit) {
                return java.lang.Boolean.valueOf(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, boundsTransform, placeholderSize, true, z2, f, overlayClip);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier sharedBoundsWithCallerManagedVisibility$animation$default(androidx.compose.animation.SharedTransitionScopeImpl sharedTransitionScopeImpl, androidx.compose.ui.Modifier modifier, androidx.compose.animation.SharedTransitionScope.SharedContentState sharedContentState, boolean z, androidx.compose.animation.BoundsTransform boundsTransform, androidx.compose.animation.SharedTransitionScope.PlaceholderSize placeholderSize, boolean z2, float f, androidx.compose.animation.SharedTransitionScope.OverlayClip overlayClip, int i, java.lang.Object obj) {
        androidx.compose.animation.SharedTransitionScope.OverlayClip overlayClip2;
        androidx.compose.animation.SharedTransitionScope.OverlayClip overlayClip3;
        androidx.compose.animation.BoundsTransform boundsTransform2 = (i & 4) != 0 ? androidx.compose.animation.SharedTransitionDefaults.INSTANCE.getBoundsTransform() : boundsTransform;
        androidx.compose.animation.SharedTransitionScope.PlaceholderSize contentSize = (i & 8) != 0 ? androidx.compose.animation.SharedTransitionScope.PlaceholderSize.INSTANCE.getContentSize() : placeholderSize;
        boolean z3 = (i & 16) != 0 ? true : z2;
        float f2 = (i & 32) != 0 ? 0.0f : f;
        if ((i & 64) != 0) {
            overlayClip3 = androidx.compose.animation.SharedTransitionScopeKt.getHighResolutionOutputSizeshNQ4ISI;
            overlayClip2 = overlayClip3;
        } else {
            overlayClip2 = overlayClip;
        }
        return sharedTransitionScopeImpl.sharedBoundsWithCallerManagedVisibility$animation(modifier, sharedContentState, z, boundsTransform2, contentSize, z3, f2, overlayClip2);
    }

    public final androidx.compose.ui.Modifier sharedBoundsWithCallerManagedVisibility$animation(androidx.compose.ui.Modifier modifier, androidx.compose.animation.SharedTransitionScope.SharedContentState sharedContentState, final boolean z, androidx.compose.animation.BoundsTransform boundsTransform, androidx.compose.animation.SharedTransitionScope.PlaceholderSize placeholderSize, boolean z2, float f, androidx.compose.animation.SharedTransitionScope.OverlayClip overlayClip) {
        return getHighSpeedVideoFpsRanges(modifier, sharedContentState, null, new kotlin.jvm.functions.Function1<kotlin.Unit, java.lang.Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(kotlin.Unit unit) {
                return java.lang.Boolean.valueOf(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, boundsTransform, placeholderSize, false, z2, f, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public final androidx.compose.animation.SharedTransitionScope.OverlayClip OverlayClip(androidx.compose.ui.graphics.Shape clipShape) {
        return new androidx.compose.animation.SharedTransitionScopeImpl.ShapeBasedClip(clipShape);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getObserveAnimatingBlock$animation() {
        return this.observeAnimatingBlock;
    }

    public final void updateTransitionActiveness$animation() {
        androidx.compose.runtime.snapshots.SnapshotStateMap<java.lang.Object, androidx.compose.animation.SharedElement> snapshotStateMap = this.getHighSpeedVideoFpsRanges;
        boolean z = false;
        if (!snapshotStateMap.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<java.lang.Object, androidx.compose.animation.SharedElement>> it = snapshotStateMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().getValue().isAnimating()) {
                    z = true;
                    break;
                }
            }
        }
        if (z != isTransitionActive()) {
            setTransitionActive(z);
            if (!z) {
                java.util.Iterator<java.util.Map.Entry<java.lang.Object, androidx.compose.animation.SharedElement>> it2 = this.getHighSpeedVideoFpsRanges.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().onSharedTransitionFinished();
                }
            }
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, androidx.compose.animation.SharedElement>> it3 = this.getHighSpeedVideoFpsRanges.entrySet().iterator();
        while (it3.hasNext()) {
            it3.next().getValue().updateMatch$animation();
        }
    }

    private final <T> androidx.compose.ui.Modifier getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier modifier, final androidx.compose.animation.SharedTransitionScope.SharedContentState sharedContentState, final androidx.compose.animation.core.Transition<T> transition, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, final androidx.compose.animation.BoundsTransform boundsTransform, final androidx.compose.animation.SharedTransitionScope.PlaceholderSize placeholderSize, final boolean z, final boolean z2, final float f, final androidx.compose.animation.SharedTransitionScope.OverlayClip overlayClip) {
        return androidx.compose.ui.ComposedModifierKt.composed$default(modifier, null, new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBoundsImpl$1
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return getHighSpeedVideoSizes(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier getHighSpeedVideoSizes(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.animation.core.Transition rememberTransition;
                composer.startReplaceGroup(-1539505585);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1539505585, i, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous> (SharedTransitionScope.kt:1225)");
                }
                java.lang.Object key = androidx.compose.animation.SharedTransitionScope.SharedContentState.this.getKey();
                composer.startMovableGroup(-1996110529, key);
                androidx.compose.animation.SharedTransitionScopeImpl sharedTransitionScopeImpl = this;
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.animation.SharedTransitionScopeImpl.access$sharedElementsFor(sharedTransitionScopeImpl, key);
                    composer.updateRememberedValue(rememberedValue);
                }
                androidx.compose.animation.SharedElement sharedElement = (androidx.compose.animation.SharedElement) rememberedValue;
                composer.startMovableGroup(-1996106748, transition);
                boolean z3 = false;
                if (transition != null) {
                    composer.startReplaceGroup(-1749734647);
                    androidx.compose.animation.core.Transition<T> transition2 = transition;
                    java.lang.String obj = key.toString();
                    kotlin.jvm.functions.Function1<T, java.lang.Boolean> function12 = function1;
                    boolean changed = composer.changed(transition2);
                    java.lang.Object rememberedValue2 = composer.rememberedValue();
                    if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = transition2.getCurrentState();
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    if (transition2.isSeeking()) {
                        rememberedValue2 = transition2.getCurrentState();
                    }
                    composer.startReplaceGroup(1498260051);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1498260051, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:1234)");
                    }
                    boolean booleanValue = function12.invoke(rememberedValue2).booleanValue();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    java.lang.Object targetState = transition2.getTargetState();
                    composer.startReplaceGroup(1498260051);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1498260051, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:1234)");
                    }
                    boolean booleanValue2 = function12.invoke(targetState).booleanValue();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    rememberTransition = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition2, java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(booleanValue2), obj, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1749482679);
                    kotlin.Function function = function1;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(function, "");
                    boolean booleanValue3 = ((java.lang.Boolean) ((kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function, 1)).invoke(kotlin.Unit.INSTANCE)).booleanValue();
                    java.lang.Object rememberedValue3 = composer.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        if (sharedElement.getEnabledEntries().isEmpty()) {
                            z3 = booleanValue3;
                        } else if (!booleanValue3) {
                            z3 = true;
                        }
                        rememberedValue3 = new androidx.compose.animation.core.MutableTransitionState(java.lang.Boolean.valueOf(z3));
                        composer.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.animation.core.MutableTransitionState mutableTransitionState = (androidx.compose.animation.core.MutableTransitionState) rememberedValue3;
                    mutableTransitionState.setTargetState$animation_core(java.lang.Boolean.valueOf(booleanValue3));
                    rememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, null, composer, androidx.compose.animation.core.MutableTransitionState.$stable, 2);
                    composer.endReplaceGroup();
                }
                androidx.compose.animation.core.Transition transition3 = rememberTransition;
                composer.startMovableGroup(-1996043323, java.lang.Boolean.valueOf(this.isTransitionActive()));
                androidx.compose.animation.core.Transition<java.lang.Boolean>.DeferredAnimation<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition3, androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Rect.INSTANCE), null, composer, 0, 2);
                composer.endMovableGroup();
                boolean changed2 = composer.changed(transition3);
                androidx.compose.animation.SharedTransitionScopeImpl sharedTransitionScopeImpl2 = this;
                androidx.compose.animation.BoundsTransform boundsTransform2 = boundsTransform;
                java.lang.Object rememberedValue4 = composer.rememberedValue();
                if (changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new androidx.compose.animation.BoundsAnimation(sharedTransitionScopeImpl2, transition3, createDeferredAnimation, boundsTransform2, sharedElement.getMomentumAnimationOffset());
                    composer.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.animation.BoundsAnimation boundsAnimation = (androidx.compose.animation.BoundsAnimation) rememberedValue4;
                boundsAnimation.updateAnimation(createDeferredAnimation, boundsTransform);
                composer.endMovableGroup();
                androidx.compose.animation.SharedElementEntry access$rememberSharedElementState = androidx.compose.animation.SharedTransitionScopeImpl.access$rememberSharedElementState(this, sharedElement, boundsAnimation, placeholderSize, z, androidx.compose.animation.SharedTransitionScope.SharedContentState.this, overlayClip, f, z2, composer, 0);
                composer.endMovableGroup();
                androidx.compose.ui.Modifier then = modifier2.then(new androidx.compose.animation.SharedBoundsNodeElement(access$rememberSharedElementState));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return then;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }
        }, 1, null);
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getRoot$animation() {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.nullableRoot;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        throw new java.lang.IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.".toString());
    }

    public final void setRoot$animation(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.nullableRoot = layoutCoordinates;
    }

    /* renamed from: getNullableRoot$animation, reason: from getter */
    public final androidx.compose.ui.layout.LayoutCoordinates getNullableRoot() {
        return this.nullableRoot;
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getLookaheadRoot$animation() {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.Camera2StreamConfigurationMap;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        throw new java.lang.IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.".toString());
    }

    public final void setLookaheadRoot$animation(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.Camera2StreamConfigurationMap = layoutCoordinates;
    }

    public final void drawInOverlay$animation(androidx.compose.ui.graphics.drawscope.ContentDrawScope scope) {
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.LayerRenderer> snapshotStateList = this.getHighResolutionOutputSizeshNQ4ISI;
        if (snapshotStateList.size() > 1) {
            kotlin.collections.CollectionsKt.sortWith(snapshotStateList, new java.util.Comparator() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    androidx.compose.animation.LayerRenderer layerRenderer = (androidx.compose.animation.LayerRenderer) t;
                    androidx.compose.animation.LayerRenderer layerRenderer2 = (androidx.compose.animation.LayerRenderer) t2;
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Float.valueOf((layerRenderer.getZIndex() == 0.0f && (layerRenderer instanceof androidx.compose.animation.SharedElementEntry) && ((androidx.compose.animation.SharedElementEntry) layerRenderer).getParentState() == null) ? -1.0f : layerRenderer.getZIndex()), java.lang.Float.valueOf((layerRenderer2.getZIndex() == 0.0f && (layerRenderer2 instanceof androidx.compose.animation.SharedElementEntry) && ((androidx.compose.animation.SharedElementEntry) layerRenderer2).getParentState() == null) ? -1.0f : layerRenderer2.getZIndex()));
                }
            });
        }
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.LayerRenderer> snapshotStateList2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int size = snapshotStateList2.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList2.get(i).drawInOverlay(scope);
        }
    }

    public final void onEntryRemoved$animation(androidx.compose.animation.SharedElementEntry sharedElementState) {
        androidx.compose.animation.SharedElement sharedElement = sharedElementState.getSharedElement();
        sharedElement.removeEntry(sharedElementState);
        updateTransitionActiveness$animation();
        this.getHighResolutionOutputSizeshNQ4ISI.remove(sharedElementState);
        if (sharedElement.getAllEntries().isEmpty()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(sharedElement.getScope().coroutineScope, null, null, new androidx.compose.animation.SharedTransitionScopeImpl$onEntryRemoved$1$1(sharedElement, sharedElementState, null), 3, null);
        }
    }

    public final void onEntryAdded$animation(androidx.compose.animation.SharedElementEntry sharedElementState) {
        sharedElementState.getSharedElement().addEntry(sharedElementState);
        updateTransitionActiveness$animation();
        java.util.Iterator<androidx.compose.animation.LayerRenderer> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            androidx.compose.animation.LayerRenderer next = it.next();
            androidx.compose.animation.SharedElementEntry sharedElementEntry = next instanceof androidx.compose.animation.SharedElementEntry ? (androidx.compose.animation.SharedElementEntry) next : null;
            if (kotlin.jvm.internal.Intrinsics.areEqual(sharedElementEntry != null ? sharedElementEntry.getSharedElement() : null, sharedElementState.getSharedElement())) {
                break;
            } else {
                i++;
            }
        }
        if (i == this.getHighResolutionOutputSizeshNQ4ISI.size() - 1 || i == -1) {
            this.getHighResolutionOutputSizeshNQ4ISI.add(sharedElementState);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.add(i + 1, sharedElementState);
        }
    }

    public final void onLayerRendererCreated$animation(androidx.compose.animation.LayerRenderer renderer) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(renderer);
    }

    public final void onLayerRendererRemoved$animation(androidx.compose.animation.LayerRenderer renderer) {
        this.getHighResolutionOutputSizeshNQ4ISI.remove(renderer);
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl$ShapeBasedClip;", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "Landroidx/compose/ui/graphics/Shape;", "p0", "<init>", "(Landroidx/compose/ui/graphics/Shape;)V", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "Landroidx/compose/ui/geometry/Rect;", "p1", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "Landroidx/compose/ui/unit/Density;", "p3", "Landroidx/compose/ui/graphics/Path;", "getClipPath", "(Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Path;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/Shape;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/Path;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ShapeBasedClip implements androidx.compose.animation.SharedTransitionScope.OverlayClip {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.compose.ui.graphics.Path Camera2StreamConfigurationMap = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final androidx.compose.ui.graphics.Shape getHighResolutionOutputSizeshNQ4ISI;

        public ShapeBasedClip(androidx.compose.ui.graphics.Shape shape) {
            this.getHighResolutionOutputSizeshNQ4ISI = shape;
        }

        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public final androidx.compose.ui.graphics.Path getClipPath(androidx.compose.animation.SharedTransitionScope.SharedContentState p0, androidx.compose.ui.geometry.Rect p1, androidx.compose.ui.unit.LayoutDirection p2, androidx.compose.ui.unit.Density p3) {
            this.Camera2StreamConfigurationMap.reset();
            androidx.compose.ui.graphics.OutlineKt.addOutline(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI.mo1334createOutlinePq9zytI(p1.m5785getSizeNHjbRc(), p2, p3));
            this.Camera2StreamConfigurationMap.mo5889translatek4lQ0M(p1.m5787getTopLeftF1C5BW0());
            return this.Camera2StreamConfigurationMap;
        }
    }

    public static final /* synthetic */ androidx.compose.animation.SharedElementEntry access$rememberSharedElementState(androidx.compose.animation.SharedTransitionScopeImpl sharedTransitionScopeImpl, androidx.compose.animation.SharedElement sharedElement, androidx.compose.animation.BoundsAnimation boundsAnimation, androidx.compose.animation.SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, androidx.compose.animation.SharedTransitionScope.SharedContentState sharedContentState, androidx.compose.animation.SharedTransitionScope.OverlayClip overlayClip, float f, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(864401334, i, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:1311)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            androidx.compose.animation.SharedElementEntry sharedElementEntry = new androidx.compose.animation.SharedElementEntry(sharedElement, boundsAnimation, placeholderSize, z, overlayClip, z2, sharedContentState, f);
            composer.updateRememberedValue(sharedElementEntry);
            rememberedValue = sharedElementEntry;
        }
        androidx.compose.animation.SharedElementEntry sharedElementEntry2 = (androidx.compose.animation.SharedElementEntry) rememberedValue;
        sharedContentState.setInternalState$animation(sharedElementEntry2);
        sharedElementEntry2.setSharedElement(sharedElement);
        sharedElementEntry2.setRenderOnlyWhenVisible(z);
        sharedElementEntry2.setBoundsAnimation(boundsAnimation);
        sharedElementEntry2.setPlaceholderSize(placeholderSize);
        sharedElementEntry2.setOverlayClip(overlayClip);
        sharedElementEntry2.setZIndex(f);
        sharedElementEntry2.setRenderInOverlayDuringTransition(z2);
        sharedElementEntry2.setUserState(sharedContentState);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return sharedElementEntry2;
    }

    public static final /* synthetic */ androidx.compose.animation.SharedElement access$sharedElementsFor(androidx.compose.animation.SharedTransitionScopeImpl sharedTransitionScopeImpl, java.lang.Object obj) {
        androidx.compose.animation.SharedElement sharedElement = sharedTransitionScopeImpl.getHighSpeedVideoFpsRanges.get(obj);
        if (sharedElement != null) {
            return sharedElement;
        }
        androidx.compose.animation.SharedElement sharedElement2 = new androidx.compose.animation.SharedElement(obj, sharedTransitionScopeImpl);
        sharedTransitionScopeImpl.getHighSpeedVideoFpsRanges.put(obj, sharedElement2);
        return sharedElement2;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public final androidx.compose.ui.layout.LayoutCoordinates toLookaheadCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        return this.getHighSpeedVideoFpsRanges.toLookaheadCoordinates(layoutCoordinates);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    /* renamed from: localLookaheadPositionOf-au-aQtc, reason: not valid java name */
    public final long mo1145localLookaheadPositionOfauaQtc(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2, long j, boolean z) {
        return this.getHighSpeedVideoFpsRanges.mo1145localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j, z);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public final androidx.compose.ui.layout.LayoutCoordinates getLookaheadScopeCoordinates(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        return this.getHighSpeedVideoFpsRanges.getLookaheadScopeCoordinates(placementScope);
    }
}
