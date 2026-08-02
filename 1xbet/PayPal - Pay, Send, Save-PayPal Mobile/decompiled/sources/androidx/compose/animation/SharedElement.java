package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fJ\u001d\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b \u0010\u001fR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u001a\u001a\u00020+8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00190.8G¢\u0006\u0006\u001a\u0004\b/\u00100R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190.8G¢\u0006\u0006\u001a\u0004\b2\u00100R \u00109\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010:R \u0010=\u001a\b\u0012\u0004\u0012\u0002050<8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0011\u0010B\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bA\u0010\tR\u0011\u0010D\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bC\u0010\tR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190E8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010FR\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00190E8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010FR \u0010G\u001a\b\u0012\u0004\u0012\u00020\n0<8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bG\u0010>\u001a\u0004\bH\u0010@"}, d2 = {"Landroidx/compose/animation/SharedElement;", "", "key", "Landroidx/compose/animation/SharedTransitionScopeImpl;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "", "isAnimating", "()Z", "", "updateMatch$animation", "()V", "Landroidx/compose/ui/unit/Velocity;", "velocity", "updateExitVelocity-TH1AsA0$animation", "(J)V", "updateExitVelocity", "invalidateTargetBoundsProvider", "Landroidx/compose/ui/geometry/Rect;", "tryInitializingCurrentBounds", "()Landroidx/compose/ui/geometry/Rect;", "onSharedTransitionFinished", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementScope", "Landroidx/compose/animation/SharedElementEntry;", "state", "onLookaheadPlaced", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/animation/SharedElementEntry;)V", "sharedElementState", "addEntry", "(Landroidx/compose/animation/SharedElementEntry;)V", "removeEntry", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "getScope", "()Landroidx/compose/animation/SharedTransitionScopeImpl;", "Landroidx/compose/animation/SharedTransitionStateMachine;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/SharedTransitionStateMachine;", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/SharedTransitionStateMachine$State;", "getState$animation", "()Landroidx/compose/animation/SharedTransitionStateMachine$State;", "", "getEnabledEntries", "()Ljava/util/List;", "enabledEntries", "getAllEntries", "allEntries", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/animation/core/AnimationVector2D;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/core/Animatable;", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRanges", "Lkotlin/Function0;", "momentumAnimationOffset", "Lkotlin/jvm/functions/Function0;", "getMomentumAnimationOffset", "()Lkotlin/jvm/functions/Function0;", "getFoundMatch", "foundMatch", "getBoundsTransformIsActive", "boundsTransformIsActive", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "observingVisibilityChange", "getObservingVisibilityChange$animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SharedElement {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;
    private final java.lang.Object key;
    private final androidx.compose.animation.SharedTransitionScopeImpl scope;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.animation.SharedTransitionStateMachine Camera2StreamConfigurationMap = new androidx.compose.animation.SharedTransitionStateMachine(this);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> getHighSpeedVideoSizes = new androidx.compose.animation.core.Animatable<>(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0()), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Offset.INSTANCE), null, null, 12, null);
    private final kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset> momentumAnimationOffset = new kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>() { // from class: androidx.compose.animation.SharedElement$momentumAnimationOffset$1
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ androidx.compose.ui.geometry.Offset invoke() {
            return androidx.compose.ui.geometry.Offset.m5741boximpl(Camera2StreamConfigurationMap());
        }

        public final long Camera2StreamConfigurationMap() {
            boolean z;
            androidx.compose.animation.core.Animatable animatable;
            androidx.compose.animation.core.Animatable animatable2;
            androidx.compose.animation.SharedElementEntry sharedElementEntry;
            z = androidx.compose.animation.SharedElement.this.getHighSpeedVideoFpsRanges;
            if (!z && androidx.compose.animation.SharedElement.this.getScope().isTransitionActive()) {
                animatable2 = androidx.compose.animation.SharedElement.this.getHighSpeedVideoSizes;
                if (animatable2.isRunning()) {
                    java.util.List<androidx.compose.animation.SharedElementEntry> enabledEntries = androidx.compose.animation.SharedElement.this.getEnabledEntries();
                    int size = enabledEntries.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            sharedElementEntry = null;
                            break;
                        }
                        sharedElementEntry = enabledEntries.get(i);
                        if (sharedElementEntry.getTarget()) {
                            break;
                        }
                        i++;
                    }
                    androidx.compose.animation.SharedElementEntry sharedElementEntry2 = sharedElementEntry;
                    if (sharedElementEntry2 != null) {
                        androidx.compose.animation.SharedElement sharedElement = androidx.compose.animation.SharedElement.this;
                        androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.geometry.Rect> animationSpec = sharedElementEntry2.getBoundsAnimation().getAnimationSpec();
                        if (animationSpec instanceof androidx.compose.animation.core.SpringSpec) {
                            androidx.compose.animation.core.SpringSpec springSpec = (androidx.compose.animation.core.SpringSpec) animationSpec;
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(sharedElement.getScope().getCoroutineScope(), null, null, new androidx.compose.animation.SharedElement$momentumAnimationOffset$1$2$1(sharedElement, androidx.compose.animation.core.AnimationSpecKt.spring(springSpec.getDampingRatio(), springSpec.getStiffness(), androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Offset.INSTANCE))), null), 3, null);
                        }
                        sharedElement.getHighSpeedVideoFpsRanges = true;
                    }
                }
            }
            animatable = androidx.compose.animation.SharedElement.this.getHighSpeedVideoSizes;
            return ((androidx.compose.ui.geometry.Offset) animatable.getValue()).m5762unboximpl();
        }

        {
            super(0);
        }
    };

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.SharedElementEntry> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.SharedElementEntry> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
    private final kotlin.jvm.functions.Function0<kotlin.Unit> observingVisibilityChange = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.animation.SharedElement$observingVisibilityChange$1
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            getHighResolutionOutputSizeshNQ4ISI();
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI() {
            java.util.List<androidx.compose.animation.SharedElementEntry> allEntries = androidx.compose.animation.SharedElement.this.getAllEntries();
            int size = allEntries.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.animation.SharedElementEntry sharedElementEntry = allEntries.get(i);
                if (sharedElementEntry.getTarget() && sharedElementEntry.isEnabled()) {
                    return;
                }
            }
        }

        {
            super(0);
        }
    };

    public SharedElement(java.lang.Object obj, androidx.compose.animation.SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.key = obj;
        this.scope = sharedTransitionScopeImpl;
    }

    public final java.lang.Object getKey() {
        return this.key;
    }

    public final androidx.compose.animation.SharedTransitionScopeImpl getScope() {
        return this.scope;
    }

    public final androidx.compose.animation.SharedTransitionStateMachine.State getState$animation() {
        return this.Camera2StreamConfigurationMap.getState();
    }

    public final java.util.List<androidx.compose.animation.SharedElementEntry> getEnabledEntries() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.util.List<androidx.compose.animation.SharedElementEntry> getAllEntries() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean isAnimating() {
        java.util.List<androidx.compose.animation.SharedElementEntry> enabledEntries = getEnabledEntries();
        int size = enabledEntries.size();
        for (int i = 0; i < size; i++) {
            if (enabledEntries.get(i).getBoundsAnimation().isRunning()) {
                return true;
            }
        }
        return false;
    }

    public final void updateMatch$animation() {
        kotlin.jvm.functions.Function0<kotlin.Unit> testBlockToRun = this.scope.getTestBlockToRun();
        if (testBlockToRun != null) {
            testBlockToRun.invoke();
        }
        kotlin.collections.CollectionsKt.removeAll((java.util.List) this.getHighSpeedVideoFpsRangesFor, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.animation.SharedElementEntry, java.lang.Boolean>() { // from class: androidx.compose.animation.SharedElement$updateMatch$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.animation.SharedElementEntry sharedElementEntry) {
                return java.lang.Boolean.valueOf((androidx.compose.animation.SharedElement.this.getAllEntries().contains(sharedElementEntry) && sharedElementEntry.isEnabled()) ? false : true);
            }

            {
                super(1);
            }
        });
        java.util.List<androidx.compose.animation.SharedElementEntry> allEntries = getAllEntries();
        int size = allEntries.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.animation.SharedElementEntry sharedElementEntry = allEntries.get(i);
            if (sharedElementEntry.isEnabled() && !getEnabledEntries().contains(sharedElementEntry)) {
                this.getHighSpeedVideoFpsRangesFor.add(sharedElementEntry);
            }
        }
        this.Camera2StreamConfigurationMap.checkForAndDeferStateUpdates(androidx.compose.animation.SharedElementKt.access$hasVisibleContent(this.getHighSpeedVideoFpsRangesFor));
    }

    /* renamed from: updateExitVelocity-TH1AsA0$animation, reason: not valid java name */
    public final void m1140updateExitVelocityTH1AsA0$animation(long velocity) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope.getCoroutineScope(), null, null, new androidx.compose.animation.SharedElement$updateExitVelocity$1(this, velocity, null), 3, null);
    }

    public final kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset> getMomentumAnimationOffset() {
        return this.momentumAnimationOffset;
    }

    public final void invalidateTargetBoundsProvider() {
        this.Camera2StreamConfigurationMap.invalidateTargetBoundsProvider();
    }

    public final androidx.compose.ui.geometry.Rect tryInitializingCurrentBounds() {
        return this.Camera2StreamConfigurationMap.tryInitializingCurrentBounds();
    }

    public final void onSharedTransitionFinished() {
        if (getEnabledEntries().size() <= 1 || !androidx.compose.animation.SharedElementKt.access$hasVisibleContent(getEnabledEntries())) {
            this.Camera2StreamConfigurationMap.resetState();
        }
    }

    public final boolean getFoundMatch() {
        return getState$animation().getActiveMatchFound() || getState$animation().getMatchIsOrHasBeenConfigured() || this.Camera2StreamConfigurationMap.getActiveMatchDeferred();
    }

    public final boolean getBoundsTransformIsActive() {
        return getState$animation().getMatchIsOrHasBeenConfigured();
    }

    public final void onLookaheadPlaced(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.animation.SharedElementEntry state) {
        androidx.compose.ui.layout.LayoutCoordinates coordinates;
        this.Camera2StreamConfigurationMap.processPendingRequest();
        if (kotlin.jvm.internal.Intrinsics.areEqual(getState$animation(), androidx.compose.animation.NoMatchFound.INSTANCE) || !state.isEnabled()) {
            return;
        }
        androidx.compose.animation.SharedTransitionStateMachine.State state$animation = getState$animation();
        if (state.getBoundsAnimation().getTarget() && state$animation.getActiveMatchFound() && (coordinates = placementScope.getCoordinates()) != null) {
            long m8784toSizeozmzZPI = androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(coordinates.mo7361getSizeYbymL2g());
            long m7379localLookaheadPositionOfauaQtc$default = androidx.compose.ui.layout.LookaheadScope.m7379localLookaheadPositionOfauaQtc$default(state.getSharedElement().scope, state.getSharedElement().scope.getLookaheadRoot$animation(), coordinates, 0L, false, 6, null);
            androidx.compose.animation.SharedTransitionScopeImpl sharedTransitionScopeImpl = state.getSharedElement().scope;
            this.Camera2StreamConfigurationMap.m1146configureActiveMatchL7TYDSY(m8784toSizeozmzZPI, m7379localLookaheadPositionOfauaQtc$default, androidx.compose.ui.layout.LayoutCoordinates.m7360localPositionOfS_NoaFU$default(state.getSharedElement().scope.getLookaheadRoot$animation(), coordinates, 0L, false, 2, null));
        }
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getObservingVisibilityChange$animation() {
        return this.observingVisibilityChange;
    }

    public final void addEntry(androidx.compose.animation.SharedElementEntry sharedElementState) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(sharedElementState);
        updateMatch$animation();
    }

    public final void removeEntry(androidx.compose.animation.SharedElementEntry sharedElementState) {
        this.getHighResolutionOutputSizeshNQ4ISI.remove(sharedElementState);
        this.getHighSpeedVideoFpsRangesFor.remove(sharedElementState);
        updateMatch$animation();
    }
}
