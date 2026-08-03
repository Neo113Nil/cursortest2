package androidx.compose.animation;

/* compiled from: EnterExitTransition.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008b\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J!\u0010+\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J!\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J!\u0010-\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003J\u009d\u0001\u00101\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00042 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00042 \b\u0002\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\b\u00102\u001a\u00020\u0002H\u0016J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0002H\u0016J\f\u0010>\u001a\u00020<*\u00020?H\u0016R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR2\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R2\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R2\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006@"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/EnterExitTransitionModifierNode;", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "offsetAnimation", "Landroidx/compose/ui/unit/IntOffset;", "slideAnimation", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "graphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "getEnter", "()Landroidx/compose/animation/EnterTransition;", "setEnter", "(Landroidx/compose/animation/EnterTransition;)V", "getExit", "()Landroidx/compose/animation/ExitTransition;", "setExit", "(Landroidx/compose/animation/ExitTransition;)V", "getGraphicsLayerBlock", "()Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "setGraphicsLayerBlock", "(Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "getOffsetAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setOffsetAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "getSizeAnimation", "setSizeAnimation", "getSlideAnimation", "setSlideAnimation", "getTransition", "()Landroidx/compose/animation/core/Transition;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class EnterExitTransitionElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.animation.EnterExitTransitionModifierNode> {
    private androidx.compose.animation.EnterTransition enter;
    private androidx.compose.animation.ExitTransition exit;
    private androidx.compose.animation.GraphicsLayerBlockForEnterExit graphicsLayerBlock;
    private androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> offsetAnimation;
    private androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> sizeAnimation;
    private androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> slideAnimation;
    private final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition;

    public static /* synthetic */ androidx.compose.animation.EnterExitTransitionElement copy$default(androidx.compose.animation.EnterExitTransitionElement enterExitTransitionElement, androidx.compose.animation.core.Transition transition, androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation, androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation2, androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation3, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, androidx.compose.animation.GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            transition = enterExitTransitionElement.transition;
        }
        if ((i & 2) != 0) {
            deferredAnimation = enterExitTransitionElement.sizeAnimation;
        }
        androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation4 = deferredAnimation;
        if ((i & 4) != 0) {
            deferredAnimation2 = enterExitTransitionElement.offsetAnimation;
        }
        androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation5 = deferredAnimation2;
        if ((i & 8) != 0) {
            deferredAnimation3 = enterExitTransitionElement.slideAnimation;
        }
        androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation6 = deferredAnimation3;
        if ((i & 16) != 0) {
            enterTransition = enterExitTransitionElement.enter;
        }
        androidx.compose.animation.EnterTransition enterTransition2 = enterTransition;
        if ((i & 32) != 0) {
            exitTransition = enterExitTransitionElement.exit;
        }
        androidx.compose.animation.ExitTransition exitTransition2 = exitTransition;
        if ((i & 64) != 0) {
            graphicsLayerBlockForEnterExit = enterExitTransitionElement.graphicsLayerBlock;
        }
        return enterExitTransitionElement.copy(transition, deferredAnimation4, deferredAnimation5, deferredAnimation6, enterTransition2, exitTransition2, graphicsLayerBlockForEnterExit);
    }

    public final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> component1() {
        return this.transition;
    }

    public final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> component2() {
        return this.sizeAnimation;
    }

    public final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> component3() {
        return this.offsetAnimation;
    }

    public final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> component4() {
        return this.slideAnimation;
    }

    /* renamed from: component5, reason: from getter */
    public final androidx.compose.animation.EnterTransition getEnter() {
        return this.enter;
    }

    /* renamed from: component6, reason: from getter */
    public final androidx.compose.animation.ExitTransition getExit() {
        return this.exit;
    }

    /* renamed from: component7, reason: from getter */
    public final androidx.compose.animation.GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    public final androidx.compose.animation.EnterExitTransitionElement copy(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> sizeAnimation, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> offsetAnimation, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> slideAnimation, androidx.compose.animation.EnterTransition enter, androidx.compose.animation.ExitTransition exit, androidx.compose.animation.GraphicsLayerBlockForEnterExit graphicsLayerBlock) {
        return new androidx.compose.animation.EnterExitTransitionElement(transition, sizeAnimation, offsetAnimation, slideAnimation, enter, exit, graphicsLayerBlock);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.animation.EnterExitTransitionElement)) {
            return false;
        }
        androidx.compose.animation.EnterExitTransitionElement enterExitTransitionElement = (androidx.compose.animation.EnterExitTransitionElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transition, enterExitTransitionElement.transition) && kotlin.jvm.internal.Intrinsics.areEqual(this.sizeAnimation, enterExitTransitionElement.sizeAnimation) && kotlin.jvm.internal.Intrinsics.areEqual(this.offsetAnimation, enterExitTransitionElement.offsetAnimation) && kotlin.jvm.internal.Intrinsics.areEqual(this.slideAnimation, enterExitTransitionElement.slideAnimation) && kotlin.jvm.internal.Intrinsics.areEqual(this.enter, enterExitTransitionElement.enter) && kotlin.jvm.internal.Intrinsics.areEqual(this.exit, enterExitTransitionElement.exit) && kotlin.jvm.internal.Intrinsics.areEqual(this.graphicsLayerBlock, enterExitTransitionElement.graphicsLayerBlock);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.transition.hashCode() * 31;
        androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> deferredAnimation = this.sizeAnimation;
        int hashCode2 = (hashCode + (deferredAnimation == null ? 0 : deferredAnimation.hashCode())) * 31;
        androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        int hashCode3 = (hashCode2 + (deferredAnimation2 == null ? 0 : deferredAnimation2.hashCode())) * 31;
        androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        return ((((((hashCode3 + (deferredAnimation3 != null ? deferredAnimation3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }

    public java.lang.String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
    }

    public final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> getTransition() {
        return this.transition;
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

    public EnterExitTransitionElement(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> deferredAnimation, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation2, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation3, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, androidx.compose.animation.GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public androidx.compose.animation.EnterExitTransitionModifierNode create() {
        return new androidx.compose.animation.EnterExitTransitionModifierNode(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.graphicsLayerBlock);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(androidx.compose.animation.EnterExitTransitionModifierNode node) {
        node.setTransition(this.transition);
        node.setSizeAnimation(this.sizeAnimation);
        node.setOffsetAnimation(this.offsetAnimation);
        node.setSlideAnimation(this.slideAnimation);
        node.setEnter(this.enter);
        node.setExit(this.exit);
        node.setGraphicsLayerBlock(this.graphicsLayerBlock);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("enterExitTransition");
        inspectorInfo.getProperties().set("transition", this.transition);
        inspectorInfo.getProperties().set("sizeAnimation", this.sizeAnimation);
        inspectorInfo.getProperties().set("offsetAnimation", this.offsetAnimation);
        inspectorInfo.getProperties().set("slideAnimation", this.slideAnimation);
        inspectorInfo.getProperties().set("enter", this.enter);
        inspectorInfo.getProperties().set("exit", this.exit);
        inspectorInfo.getProperties().set("graphicsLayerBlock", this.graphicsLayerBlock);
    }
}
