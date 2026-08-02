package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010 \u001a\u00020\u001d*\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b!\u0010\"R.\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b$\u0010%R.\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b'\u0010%R.\u0010*\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010+\u001a\u00020\f8\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020\u000e8\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b#\u0010-R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b&\u0010/R\u0016\u0010$\u001a\u00020\u00138\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b*\u00100R\u0016\u0010!\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u001c8\u0002@CX\u0082\f¢\u0006\u0006\n\u0004\b.\u00104R\u0018\u00103\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b(\u00107R\u0013\u00101\u001a\u0004\u0018\u0001068G¢\u0006\u0006\u001a\u0004\b(\u00108R1\u0010?\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060;09¢\u0006\u0002\b<8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R1\u0010=\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0;09¢\u0006\u0002\b<8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010>"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "p0", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "p1", "Landroidx/compose/ui/unit/IntOffset;", "p2", "p3", "Landroidx/compose/animation/EnterTransition;", "p4", "Landroidx/compose/animation/ExitTransition;", "p5", "Lkotlin/Function0;", "", "p6", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "p7", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "", "onAttach", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "getHighSpeedVideoSizesFor", "Landroidx/compose/animation/core/Transition;", "getHighSpeedVideoFpsRanges", "getInputFormats", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "getInputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "getOutputMinFrameDurationlomOqCM", "Z", "getOutputSizeshNQ4ISI", "J", "getOutputStallDuration", "Landroidx/compose/ui/Alignment;", "Landroidx/compose/ui/Alignment;", "()Landroidx/compose/ui/Alignment;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "getOutputStallDurationlomOqCM", "Lkotlin/jvm/functions/Function1;", "getOutputSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class EnterExitTransitionModifierNode extends androidx.compose.animation.LayoutModifierNodeWithPassThroughIntrinsics {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public androidx.compose.ui.Alignment getOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    kotlin.jvm.functions.Function0<java.lang.Boolean> getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    androidx.compose.animation.ExitTransition getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    androidx.compose.animation.GraphicsLayerBlockForEnterExit getInputFormats;
    androidx.compose.animation.EnterTransition getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long getOutputMinFrameDuration = androidx.compose.animation.AnimationModifierKt.getInvalidSize();

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private long getOutputStallDuration = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize>> getOutputSizes = new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> segment) {
            androidx.compose.animation.core.SpringSpec springSpec;
            androidx.compose.animation.core.SpringSpec springSpec2;
            androidx.compose.animation.core.SpringSpec springSpec3 = null;
            if (segment.isTransitioningTo(androidx.compose.animation.EnterExitState.PreEnter, androidx.compose.animation.EnterExitState.Visible)) {
                androidx.compose.animation.ChangeSize changeSize = androidx.compose.animation.EnterExitTransitionModifierNode.this.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap().getChangeSize();
                if (changeSize != null) {
                    springSpec3 = changeSize.getAnimationSpec();
                }
            } else if (!segment.isTransitioningTo(androidx.compose.animation.EnterExitState.Visible, androidx.compose.animation.EnterExitState.PostExit)) {
                springSpec = androidx.compose.animation.EnterExitTransitionKt.getHighSpeedVideoFpsRanges;
                springSpec3 = springSpec;
            } else {
                androidx.compose.animation.ChangeSize changeSize2 = androidx.compose.animation.EnterExitTransitionModifierNode.this.getInputSizeshNQ4ISI.getGetHighResolutionOutputSizeshNQ4ISI().getChangeSize();
                if (changeSize2 != null) {
                    springSpec3 = changeSize2.getAnimationSpec();
                }
            }
            if (springSpec3 != null) {
                return springSpec3;
            }
            springSpec2 = androidx.compose.animation.EnterExitTransitionKt.getHighSpeedVideoFpsRanges;
            return springSpec2;
        }

        {
            super(1);
        }
    };

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset>> getOutputStallDurationlomOqCM = new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> segment) {
            androidx.compose.animation.core.SpringSpec springSpec;
            androidx.compose.animation.core.SpringSpec springSpec2;
            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> animationSpec;
            androidx.compose.animation.core.SpringSpec springSpec3;
            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> animationSpec2;
            if (segment.isTransitioningTo(androidx.compose.animation.EnterExitState.PreEnter, androidx.compose.animation.EnterExitState.Visible)) {
                androidx.compose.animation.Slide slide = androidx.compose.animation.EnterExitTransitionModifierNode.this.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap().getSlide();
                if (slide != null && (animationSpec2 = slide.getAnimationSpec()) != null) {
                    return animationSpec2;
                }
                springSpec3 = androidx.compose.animation.EnterExitTransitionKt.Camera2StreamConfigurationMap;
                return springSpec3;
            }
            if (!segment.isTransitioningTo(androidx.compose.animation.EnterExitState.Visible, androidx.compose.animation.EnterExitState.PostExit)) {
                springSpec = androidx.compose.animation.EnterExitTransitionKt.Camera2StreamConfigurationMap;
                return springSpec;
            }
            androidx.compose.animation.Slide slide2 = androidx.compose.animation.EnterExitTransitionModifierNode.this.getInputSizeshNQ4ISI.getGetHighResolutionOutputSizeshNQ4ISI().getSlide();
            if (slide2 != null && (animationSpec = slide2.getAnimationSpec()) != null) {
                return animationSpec;
            }
            springSpec2 = androidx.compose.animation.EnterExitTransitionKt.Camera2StreamConfigurationMap;
            return springSpec2;
        }

        {
            super(1);
        }
    };

    public EnterExitTransitionModifierNode(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> deferredAnimation, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation2, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation3, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, androidx.compose.animation.GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.getHighSpeedVideoFpsRanges = transition;
        this.getHighResolutionOutputSizeshNQ4ISI = deferredAnimation;
        this.Camera2StreamConfigurationMap = deferredAnimation2;
        this.getHighSpeedVideoFpsRangesFor = deferredAnimation3;
        this.getHighSpeedVideoSizes = enterTransition;
        this.getInputSizeshNQ4ISI = exitTransition;
        this.getOutputFormats = function0;
        this.getInputFormats = graphicsLayerBlockForEnterExit;
    }

    public final androidx.compose.ui.Alignment Camera2StreamConfigurationMap() {
        androidx.compose.ui.Alignment alignment;
        androidx.compose.ui.Alignment alignment2;
        if (this.getHighSpeedVideoFpsRanges.getSegment().isTransitioningTo(androidx.compose.animation.EnterExitState.PreEnter, androidx.compose.animation.EnterExitState.Visible)) {
            androidx.compose.animation.ChangeSize changeSize = this.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap().getChangeSize();
            if (changeSize != null && (alignment2 = changeSize.getAlignment()) != null) {
                return alignment2;
            }
            androidx.compose.animation.ChangeSize changeSize2 = this.getInputSizeshNQ4ISI.getGetHighResolutionOutputSizeshNQ4ISI().getChangeSize();
            if (changeSize2 != null) {
                return changeSize2.getAlignment();
            }
            return null;
        }
        androidx.compose.animation.ChangeSize changeSize3 = this.getInputSizeshNQ4ISI.getGetHighResolutionOutputSizeshNQ4ISI().getChangeSize();
        if (changeSize3 != null && (alignment = changeSize3.getAlignment()) != null) {
            return alignment;
        }
        androidx.compose.animation.ChangeSize changeSize4 = this.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap().getChangeSize();
        if (changeSize4 != null) {
            return changeSize4.getAlignment();
        }
        return null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        this.getHighSpeedVideoSizesFor = false;
        this.getOutputMinFrameDuration = androidx.compose.animation.AnimationModifierKt.getInvalidSize();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        androidx.compose.runtime.State<androidx.compose.ui.unit.IntOffset> animate;
        androidx.compose.runtime.State<androidx.compose.ui.unit.IntOffset> animate2;
        if (this.getHighSpeedVideoFpsRanges.getCurrentState() == this.getHighSpeedVideoFpsRanges.getTargetState()) {
            this.getOutputSizeshNQ4ISI = null;
        } else if (this.getOutputSizeshNQ4ISI == null) {
            androidx.compose.ui.Alignment Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = androidx.compose.ui.Alignment.INSTANCE.getTopStart();
            }
            this.getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
        }
        if (measureScope.isLookingAhead()) {
            final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
            long m8767constructorimpl = androidx.compose.ui.unit.IntSize.m8767constructorimpl((mo7353measureBRTryo0.getWidth() << 32) | (mo7353measureBRTryo0.getHeight() & 4294967295L));
            this.getOutputMinFrameDuration = m8767constructorimpl;
            this.getHighSpeedVideoSizesFor = true;
            this.getOutputStallDuration = j;
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, (int) (m8767constructorimpl >> 32), (int) (m8767constructorimpl & 4294967295L), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
                public final void Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    Camera2StreamConfigurationMap(placementScope);
                    return kotlin.Unit.INSTANCE;
                }

                {
                    super(1);
                }
            }, 4, null);
        }
        if (this.getOutputFormats.invoke().booleanValue()) {
            final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> init = this.getInputFormats.init();
            final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable.mo7353measureBRTryo0(j);
            long m8767constructorimpl2 = androidx.compose.ui.unit.IntSize.m8767constructorimpl((mo7353measureBRTryo02.getWidth() << 32) | (mo7353measureBRTryo02.getHeight() & 4294967295L));
            final long j2 = androidx.compose.animation.AnimationModifierKt.m1118isValidozmzZPI(this.getOutputMinFrameDuration) ? this.getOutputMinFrameDuration : m8767constructorimpl2;
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> deferredAnimation = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> animate3 = deferredAnimation != null ? deferredAnimation.animate(this.getOutputSizes, new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, androidx.compose.ui.unit.IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
                public final long getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.EnterExitState enterExitState) {
                    kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize> size;
                    kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize> size2;
                    androidx.compose.animation.EnterExitTransitionModifierNode enterExitTransitionModifierNode = androidx.compose.animation.EnterExitTransitionModifierNode.this;
                    long j3 = j2;
                    int i = androidx.compose.animation.EnterExitTransitionModifierNode.WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            androidx.compose.animation.ChangeSize changeSize = enterExitTransitionModifierNode.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap().getChangeSize();
                            if (changeSize != null && (size = changeSize.getSize()) != null) {
                                return size.invoke(androidx.compose.ui.unit.IntSize.m8764boximpl(j3)).m8776unboximpl();
                            }
                        } else {
                            if (i != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            androidx.compose.animation.ChangeSize changeSize2 = enterExitTransitionModifierNode.getInputSizeshNQ4ISI.getGetHighResolutionOutputSizeshNQ4ISI().getChangeSize();
                            if (changeSize2 != null && (size2 = changeSize2.getSize()) != null) {
                                return size2.invoke(androidx.compose.ui.unit.IntSize.m8764boximpl(j3)).m8776unboximpl();
                            }
                        }
                    }
                    return j3;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.animation.EnterExitState enterExitState) {
                    return androidx.compose.ui.unit.IntSize.m8764boximpl(getHighResolutionOutputSizeshNQ4ISI(enterExitState));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            }) : null;
            if (animate3 != null) {
                m8767constructorimpl2 = animate3.getValue().m8776unboximpl();
            }
            long m8568constrain4WqzIAM = androidx.compose.ui.unit.ConstraintsKt.m8568constrain4WqzIAM(j, m8767constructorimpl2);
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation2 = this.Camera2StreamConfigurationMap;
            final long m8740getZeronOccac = (deferredAnimation2 == null || (animate2 = deferredAnimation2.animate(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> segment) {
                    androidx.compose.animation.core.SpringSpec springSpec;
                    springSpec = androidx.compose.animation.EnterExitTransitionKt.Camera2StreamConfigurationMap;
                    return springSpec;
                }
            }, new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
                public final long getHighSpeedVideoFpsRangesFor(androidx.compose.animation.EnterExitState enterExitState) {
                    int i;
                    androidx.compose.animation.EnterExitTransitionModifierNode enterExitTransitionModifierNode = androidx.compose.animation.EnterExitTransitionModifierNode.this;
                    long j3 = j2;
                    if (enterExitTransitionModifierNode.getOutputSizeshNQ4ISI == null || enterExitTransitionModifierNode.Camera2StreamConfigurationMap() == null || kotlin.jvm.internal.Intrinsics.areEqual(enterExitTransitionModifierNode.getOutputSizeshNQ4ISI, enterExitTransitionModifierNode.Camera2StreamConfigurationMap()) || (i = androidx.compose.animation.EnterExitTransitionModifierNode.WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()]) == 1) {
                        return androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
                    }
                    if (i == 2) {
                        return androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
                    }
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    androidx.compose.animation.ChangeSize changeSize = enterExitTransitionModifierNode.getInputSizeshNQ4ISI.getGetHighResolutionOutputSizeshNQ4ISI().getChangeSize();
                    if (changeSize != null) {
                        long m8776unboximpl = changeSize.getSize().invoke(androidx.compose.ui.unit.IntSize.m8764boximpl(j3)).m8776unboximpl();
                        androidx.compose.ui.Alignment Camera2StreamConfigurationMap2 = enterExitTransitionModifierNode.Camera2StreamConfigurationMap();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(Camera2StreamConfigurationMap2);
                        long mo5504alignKFBX0sM = Camera2StreamConfigurationMap2.mo5504alignKFBX0sM(j3, m8776unboximpl, androidx.compose.ui.unit.LayoutDirection.Ltr);
                        androidx.compose.ui.Alignment alignment = enterExitTransitionModifierNode.getOutputSizeshNQ4ISI;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(alignment);
                        return androidx.compose.ui.unit.IntOffset.m8732minusqkQi6aY(mo5504alignKFBX0sM, alignment.mo5504alignKFBX0sM(j3, m8776unboximpl, androidx.compose.ui.unit.LayoutDirection.Ltr));
                    }
                    return androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.animation.EnterExitState enterExitState) {
                    return androidx.compose.ui.unit.IntOffset.m8720boximpl(getHighSpeedVideoFpsRangesFor(enterExitState));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            })) == null) ? androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac() : animate2.getValue().m8738unboximpl();
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation3 = this.getHighSpeedVideoFpsRangesFor;
            long m8740getZeronOccac2 = (deferredAnimation3 == null || (animate = deferredAnimation3.animate(this.getOutputStallDurationlomOqCM, new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
                public final long getHighSpeedVideoSizes(androidx.compose.animation.EnterExitState enterExitState) {
                    kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset> slideOffset;
                    kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset> slideOffset2;
                    androidx.compose.animation.EnterExitTransitionModifierNode enterExitTransitionModifierNode = androidx.compose.animation.EnterExitTransitionModifierNode.this;
                    long j3 = j2;
                    androidx.compose.animation.Slide slide = enterExitTransitionModifierNode.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap().getSlide();
                    long m8740getZeronOccac3 = (slide == null || (slideOffset2 = slide.getSlideOffset()) == null) ? androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac() : slideOffset2.invoke(androidx.compose.ui.unit.IntSize.m8764boximpl(j3)).m8738unboximpl();
                    androidx.compose.animation.Slide slide2 = enterExitTransitionModifierNode.getInputSizeshNQ4ISI.getGetHighResolutionOutputSizeshNQ4ISI().getSlide();
                    long m8740getZeronOccac4 = (slide2 == null || (slideOffset = slide2.getSlideOffset()) == null) ? androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac() : slideOffset.invoke(androidx.compose.ui.unit.IntSize.m8764boximpl(j3)).m8738unboximpl();
                    int i = androidx.compose.animation.EnterExitTransitionModifierNode.WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                    if (i == 1) {
                        return androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
                    }
                    if (i == 2) {
                        return m8740getZeronOccac3;
                    }
                    if (i == 3) {
                        return m8740getZeronOccac4;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.animation.EnterExitState enterExitState) {
                    return androidx.compose.ui.unit.IntOffset.m8720boximpl(getHighSpeedVideoSizes(enterExitState));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            })) == null) ? androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac() : animate.getValue().m8738unboximpl();
            androidx.compose.ui.Alignment alignment = this.getOutputSizeshNQ4ISI;
            final long m8733plusqkQi6aY = androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(alignment != null ? alignment.mo5504alignKFBX0sM(j2, m8568constrain4WqzIAM, androidx.compose.ui.unit.LayoutDirection.Ltr) : androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac(), m8740getZeronOccac2);
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, (int) (m8568constrain4WqzIAM >> 32), (int) (m8568constrain4WqzIAM & 4294967295L), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    getHighSpeedVideoFpsRangesFor(placementScope);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    androidx.compose.ui.layout.Placeable placeable = androidx.compose.ui.layout.Placeable.this;
                    int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8733plusqkQi6aY);
                    int m8729getXimpl2 = androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8740getZeronOccac);
                    placementScope.placeWithLayer(placeable, m8729getXimpl2 + m8729getXimpl, androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8733plusqkQi6aY) + androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8740getZeronOccac), 0.0f, init);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }
            }, 4, null);
        }
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo03 = measurable.mo7353measureBRTryo0(j);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo03.getWidth(), mo7353measureBRTryo03.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$3$1
            public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                getHighSpeedVideoFpsRangesFor(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        }, 4, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.animation.EnterExitState.values().length];
            try {
                iArr[androidx.compose.animation.EnterExitState.Visible.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.animation.EnterExitState.PreEnter.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.animation.EnterExitState.PostExit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
