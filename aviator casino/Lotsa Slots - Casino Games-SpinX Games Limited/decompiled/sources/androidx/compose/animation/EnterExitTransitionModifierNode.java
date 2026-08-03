package androidx.compose.animation;

/* compiled from: EnterExitTransition.kt */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\b\u0010E\u001a\u00020FH\u0016J \u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ \u0010L\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010KJ \u0010N\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bO\u0010KJ&\u0010P\u001a\u00020Q*\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bV\u0010WR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0016\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R&\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020(@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\"\u0004\b*\u0010+R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010/\u001a\u00020\u0007X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010,R2\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R2\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00101\"\u0004\b5\u00103R.\u00106\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000408\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070907¢\u0006\u0002\b:¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R2\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00101\"\u0004\b>\u00103R.\u0010?\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000408\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0907¢\u0006\u0002\b:¢\u0006\b\n\u0000\u001a\u0004\b@\u0010<R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "offsetAnimation", "Landroidx/compose/ui/unit/IntOffset;", "slideAnimation", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "graphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "alignment", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "currentAlignment", "getCurrentAlignment", "setCurrentAlignment", "(Landroidx/compose/ui/Alignment;)V", "getEnter", "()Landroidx/compose/animation/EnterTransition;", "setEnter", "(Landroidx/compose/animation/EnterTransition;)V", "getExit", "()Landroidx/compose/animation/ExitTransition;", "setExit", "(Landroidx/compose/animation/ExitTransition;)V", "getGraphicsLayerBlock", "()Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "setGraphicsLayerBlock", "(Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "value", "Landroidx/compose/ui/unit/Constraints;", "lookaheadConstraints", "setLookaheadConstraints-BRTryo0", "(J)V", "J", "lookaheadConstraintsAvailable", "", "lookaheadSize", "getOffsetAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setOffsetAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "getSizeAnimation", "setSizeAnimation", "sizeTransitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "getSizeTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "getSlideAnimation", "setSlideAnimation", "slideSpec", "getSlideSpec", "getTransition", "()Landroidx/compose/animation/core/Transition;", "setTransition", "(Landroidx/compose/animation/core/Transition;)V", "onAttach", "", "sizeByState", "targetState", "fullSize", "sizeByState-Uzc_VyU", "(Landroidx/compose/animation/EnterExitState;J)J", "slideTargetValueByState", "slideTargetValueByState-oFUgxo0", "targetOffsetByState", "targetOffsetByState-oFUgxo0", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode extends androidx.compose.animation.LayoutModifierNodeWithPassThroughIntrinsics {
    private androidx.compose.ui.Alignment currentAlignment;
    private androidx.compose.animation.EnterTransition enter;
    private androidx.compose.animation.ExitTransition exit;
    private androidx.compose.animation.GraphicsLayerBlockForEnterExit graphicsLayerBlock;
    private boolean lookaheadConstraintsAvailable;
    private androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> offsetAnimation;
    private androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> sizeAnimation;
    private androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> slideAnimation;
    private androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition;
    private long lookaheadSize = androidx.compose.animation.AnimationModifierKt.getInvalidSize();
    private long lookaheadConstraints = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize>> sizeTransitionSpec = new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> segment) {
            androidx.compose.animation.core.SpringSpec springSpec;
            androidx.compose.animation.core.SpringSpec springSpec2;
            androidx.compose.animation.core.SpringSpec springSpec3 = null;
            if (segment.isTransitioningTo(androidx.compose.animation.EnterExitState.PreEnter, androidx.compose.animation.EnterExitState.Visible)) {
                androidx.compose.animation.ChangeSize changeSize = androidx.compose.animation.EnterExitTransitionModifierNode.this.getEnter().getData().getChangeSize();
                if (changeSize != null) {
                    springSpec3 = changeSize.getAnimationSpec();
                }
            } else if (!segment.isTransitioningTo(androidx.compose.animation.EnterExitState.Visible, androidx.compose.animation.EnterExitState.PostExit)) {
                springSpec = androidx.compose.animation.EnterExitTransitionKt.DefaultSizeAnimationSpec;
                springSpec3 = springSpec;
            } else {
                androidx.compose.animation.ChangeSize changeSize2 = androidx.compose.animation.EnterExitTransitionModifierNode.this.getExit().getData().getChangeSize();
                if (changeSize2 != null) {
                    springSpec3 = changeSize2.getAnimationSpec();
                }
            }
            if (springSpec3 != null) {
                return springSpec3;
            }
            springSpec2 = androidx.compose.animation.EnterExitTransitionKt.DefaultSizeAnimationSpec;
            return springSpec2;
        }
    };
    private final kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset>> slideSpec = new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> segment) {
            androidx.compose.animation.core.SpringSpec springSpec;
            androidx.compose.animation.core.SpringSpec springSpec2;
            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> animationSpec;
            androidx.compose.animation.core.SpringSpec springSpec3;
            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> animationSpec2;
            if (segment.isTransitioningTo(androidx.compose.animation.EnterExitState.PreEnter, androidx.compose.animation.EnterExitState.Visible)) {
                androidx.compose.animation.Slide slide = androidx.compose.animation.EnterExitTransitionModifierNode.this.getEnter().getData().getSlide();
                if (slide != null && (animationSpec2 = slide.getAnimationSpec()) != null) {
                    return animationSpec2;
                }
                springSpec3 = androidx.compose.animation.EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                return springSpec3;
            }
            if (!segment.isTransitioningTo(androidx.compose.animation.EnterExitState.Visible, androidx.compose.animation.EnterExitState.PostExit)) {
                springSpec = androidx.compose.animation.EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                return springSpec;
            }
            androidx.compose.animation.Slide slide2 = androidx.compose.animation.EnterExitTransitionModifierNode.this.getExit().getData().getSlide();
            if (slide2 != null && (animationSpec = slide2.getAnimationSpec()) != null) {
                return animationSpec;
            }
            springSpec2 = androidx.compose.animation.EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            return springSpec2;
        }
    };

    /* compiled from: EnterExitTransition.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    public final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> getTransition() {
        return this.transition;
    }

    public final void setTransition(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition) {
        this.transition = transition;
    }

    public final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    public final void setSizeAnimation(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> deferredAnimation) {
        this.sizeAnimation = deferredAnimation;
    }

    public final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    public final void setOffsetAnimation(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation) {
        this.offsetAnimation = deferredAnimation;
    }

    public final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> getSlideAnimation() {
        return this.slideAnimation;
    }

    public final void setSlideAnimation(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation) {
        this.slideAnimation = deferredAnimation;
    }

    public final androidx.compose.animation.EnterTransition getEnter() {
        return this.enter;
    }

    public final void setEnter(androidx.compose.animation.EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    public final androidx.compose.animation.ExitTransition getExit() {
        return this.exit;
    }

    public final void setExit(androidx.compose.animation.ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    public final androidx.compose.animation.GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    public final void setGraphicsLayerBlock(androidx.compose.animation.GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public EnterExitTransitionModifierNode(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> deferredAnimation, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation2, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation3, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, androidx.compose.animation.GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    /* renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m90setLookaheadConstraintsBRTryo0(long j) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j;
    }

    public final androidx.compose.ui.Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    public final void setCurrentAlignment(androidx.compose.ui.Alignment alignment) {
        this.currentAlignment = alignment;
    }

    public final androidx.compose.ui.Alignment getAlignment() {
        androidx.compose.ui.Alignment alignment;
        if (this.transition.getSegment().isTransitioningTo(androidx.compose.animation.EnterExitState.PreEnter, androidx.compose.animation.EnterExitState.Visible)) {
            androidx.compose.animation.ChangeSize changeSize = this.enter.getData().getChangeSize();
            if (changeSize == null || (alignment = changeSize.getAlignment()) == null) {
                androidx.compose.animation.ChangeSize changeSize2 = this.exit.getData().getChangeSize();
                if (changeSize2 != null) {
                    return changeSize2.getAlignment();
                }
                return null;
            }
        } else {
            androidx.compose.animation.ChangeSize changeSize3 = this.exit.getData().getChangeSize();
            if (changeSize3 == null || (alignment = changeSize3.getAlignment()) == null) {
                androidx.compose.animation.ChangeSize changeSize4 = this.enter.getData().getChangeSize();
                if (changeSize4 != null) {
                    return changeSize4.getAlignment();
                }
                return null;
            }
        }
        return alignment;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize>> getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    /* renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m92sizeByStateUzc_VyU(androidx.compose.animation.EnterExitState targetState, long fullSize) {
        kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize> size;
        kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize> size2;
        int i = androidx.compose.animation.EnterExitTransitionModifierNode.WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i == 1) {
            return fullSize;
        }
        if (i == 2) {
            androidx.compose.animation.ChangeSize changeSize = this.enter.getData().getChangeSize();
            return (changeSize == null || (size = changeSize.getSize()) == null) ? fullSize : size.invoke(androidx.compose.ui.unit.IntSize.m4644boximpl(fullSize)).getPackedValue();
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        androidx.compose.animation.ChangeSize changeSize2 = this.exit.getData().getChangeSize();
        return (changeSize2 == null || (size2 = changeSize2.getSize()) == null) ? fullSize : size2.invoke(androidx.compose.ui.unit.IntSize.m4644boximpl(fullSize)).getPackedValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = androidx.compose.animation.AnimationModifierKt.getInvalidSize();
    }

    /* renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m94targetOffsetByStateoFUgxo0(androidx.compose.animation.EnterExitState targetState, long fullSize) {
        if (this.currentAlignment != null && getAlignment() != null && !kotlin.jvm.internal.Intrinsics.areEqual(this.currentAlignment, getAlignment())) {
            int i = androidx.compose.animation.EnterExitTransitionModifierNode.WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
            if (i == 1) {
                return androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
            }
            if (i == 2) {
                return androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
            }
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            androidx.compose.animation.ChangeSize changeSize = this.exit.getData().getChangeSize();
            if (changeSize != null) {
                long packedValue = changeSize.getSize().invoke(androidx.compose.ui.unit.IntSize.m4644boximpl(fullSize)).getPackedValue();
                androidx.compose.ui.Alignment alignment = getAlignment();
                kotlin.jvm.internal.Intrinsics.checkNotNull(alignment);
                long mo1748alignKFBX0sM = alignment.mo1748alignKFBX0sM(fullSize, packedValue, androidx.compose.ui.unit.LayoutDirection.Ltr);
                androidx.compose.ui.Alignment alignment2 = this.currentAlignment;
                kotlin.jvm.internal.Intrinsics.checkNotNull(alignment2);
                long mo1748alignKFBX0sM2 = alignment2.mo1748alignKFBX0sM(fullSize, packedValue, androidx.compose.ui.unit.LayoutDirection.Ltr);
                return androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(mo1748alignKFBX0sM) - androidx.compose.ui.unit.IntOffset.m4610getXimpl(mo1748alignKFBX0sM2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(mo1748alignKFBX0sM) - androidx.compose.ui.unit.IntOffset.m4611getYimpl(mo1748alignKFBX0sM2));
            }
            return androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
        }
        return androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public androidx.compose.ui.layout.MeasureResult mo91measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        androidx.compose.runtime.State<androidx.compose.ui.unit.IntOffset> animate;
        androidx.compose.runtime.State<androidx.compose.ui.unit.IntOffset> animate2;
        if (this.transition.getCurrentState() == this.transition.getTargetState()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            androidx.compose.ui.Alignment alignment = getAlignment();
            if (alignment == null) {
                alignment = androidx.compose.ui.Alignment.INSTANCE.getTopStart();
            }
            this.currentAlignment = alignment;
        }
        if (measureScope.isLookingAhead()) {
            final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(j);
            long IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(mo3402measureBRTryo0.getWidth(), mo3402measureBRTryo0.getHeight());
            this.lookaheadSize = IntSize;
            m90setLookaheadConstraintsBRTryo0(j);
            return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(IntSize), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(IntSize), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> init = this.graphicsLayerBlock.init();
        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo02 = measurable.mo3402measureBRTryo0(j);
        long IntSize2 = androidx.compose.ui.unit.IntSizeKt.IntSize(mo3402measureBRTryo02.getWidth(), mo3402measureBRTryo02.getHeight());
        final long j2 = androidx.compose.animation.AnimationModifierKt.m69isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : IntSize2;
        androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> deferredAnimation = this.sizeAnimation;
        androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> animate3 = deferredAnimation != null ? deferredAnimation.animate(this.sizeTransitionSpec, new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, androidx.compose.ui.unit.IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.animation.EnterExitState enterExitState) {
                return androidx.compose.ui.unit.IntSize.m4644boximpl(m95invokeYEO4UFw(enterExitState));
            }

            /* renamed from: invoke-YEO4UFw, reason: not valid java name */
            public final long m95invokeYEO4UFw(androidx.compose.animation.EnterExitState enterExitState) {
                return androidx.compose.animation.EnterExitTransitionModifierNode.this.m92sizeByStateUzc_VyU(enterExitState, j2);
            }
        }) : null;
        if (animate3 != null) {
            IntSize2 = animate3.getValue().getPackedValue();
        }
        long m4435constrain4WqzIAM = androidx.compose.ui.unit.ConstraintsKt.m4435constrain4WqzIAM(j, IntSize2);
        androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        final long m4620getZeronOccac = (deferredAnimation2 == null || (animate2 = deferredAnimation2.animate(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$1
            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> segment) {
                androidx.compose.animation.core.SpringSpec springSpec;
                springSpec = androidx.compose.animation.EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                return springSpec;
            }
        }, new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.animation.EnterExitState enterExitState) {
                return androidx.compose.ui.unit.IntOffset.m4601boximpl(m96invokeBjo55l4(enterExitState));
            }

            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
            public final long m96invokeBjo55l4(androidx.compose.animation.EnterExitState enterExitState) {
                return androidx.compose.animation.EnterExitTransitionModifierNode.this.m94targetOffsetByStateoFUgxo0(enterExitState, j2);
            }
        })) == null) ? androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac() : animate2.getValue().getPackedValue();
        androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        long m4620getZeronOccac2 = (deferredAnimation3 == null || (animate = deferredAnimation3.animate(this.slideSpec, new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.animation.EnterExitState enterExitState) {
                return androidx.compose.ui.unit.IntOffset.m4601boximpl(m97invokeBjo55l4(enterExitState));
            }

            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
            public final long m97invokeBjo55l4(androidx.compose.animation.EnterExitState enterExitState) {
                return androidx.compose.animation.EnterExitTransitionModifierNode.this.m93slideTargetValueByStateoFUgxo0(enterExitState, j2);
            }
        })) == null) ? androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac() : animate.getValue().getPackedValue();
        androidx.compose.ui.Alignment alignment2 = this.currentAlignment;
        long mo1748alignKFBX0sM = alignment2 != null ? alignment2.mo1748alignKFBX0sM(j2, m4435constrain4WqzIAM, androidx.compose.ui.unit.LayoutDirection.Ltr) : androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
        final long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(mo1748alignKFBX0sM) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(m4620getZeronOccac2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(mo1748alignKFBX0sM) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(m4620getZeronOccac2));
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(m4435constrain4WqzIAM), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(m4435constrain4WqzIAM), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                placementScope.placeWithLayer(androidx.compose.ui.layout.Placeable.this, androidx.compose.ui.unit.IntOffset.m4610getXimpl(m4620getZeronOccac) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset), androidx.compose.ui.unit.IntOffset.m4611getYimpl(m4620getZeronOccac) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset), 0.0f, init);
            }
        }, 4, null);
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset>> getSlideSpec() {
        return this.slideSpec;
    }

    /* renamed from: slideTargetValueByState-oFUgxo0, reason: not valid java name */
    public final long m93slideTargetValueByStateoFUgxo0(androidx.compose.animation.EnterExitState targetState, long fullSize) {
        kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset> slideOffset;
        kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset> slideOffset2;
        androidx.compose.animation.Slide slide = this.enter.getData().getSlide();
        long m4620getZeronOccac = (slide == null || (slideOffset2 = slide.getSlideOffset()) == null) ? androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac() : slideOffset2.invoke(androidx.compose.ui.unit.IntSize.m4644boximpl(fullSize)).getPackedValue();
        androidx.compose.animation.Slide slide2 = this.exit.getData().getSlide();
        long m4620getZeronOccac2 = (slide2 == null || (slideOffset = slide2.getSlideOffset()) == null) ? androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac() : slideOffset.invoke(androidx.compose.ui.unit.IntSize.m4644boximpl(fullSize)).getPackedValue();
        int i = androidx.compose.animation.EnterExitTransitionModifierNode.WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i == 1) {
            return androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
        }
        if (i == 2) {
            return m4620getZeronOccac;
        }
        if (i == 3) {
            return m4620getZeronOccac2;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
