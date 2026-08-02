package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b \u0010!R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\u0006\n\u0004\b\"\u0010#R.\u0010'\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b%\u0010&R.\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b(\u0010&R.\u0010+\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b*\u0010&R\u0016\u0010(\u001a\u00020\r8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b)\u0010,R\u0016\u0010.\u001a\u00020\u000f8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b+\u0010-R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b$\u0010/R\u0016\u0010*\u001a\u00020\u00148\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b'\u00100"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/EnterExitTransitionModifierNode;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "p0", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "p1", "Landroidx/compose/ui/unit/IntOffset;", "p2", "p3", "Landroidx/compose/animation/EnterTransition;", "p4", "Landroidx/compose/animation/ExitTransition;", "p5", "Lkotlin/Function0;", "", "p6", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "p7", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "getInputFormats", "Landroidx/compose/animation/core/Transition;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "getOutputFormats", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class EnterExitTransitionElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.animation.EnterExitTransitionModifierNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public androidx.compose.animation.EnterTransition getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public androidx.compose.animation.ExitTransition getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    public androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    public kotlin.jvm.functions.Function0<java.lang.Boolean> getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    public androidx.compose.animation.GraphicsLayerBlockForEnterExit getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    public androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    public androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> getHighResolutionOutputSizeshNQ4ISI;

    public EnterExitTransitionElement(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> deferredAnimation, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation2, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation3, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, androidx.compose.animation.GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.getHighSpeedVideoFpsRangesFor = transition;
        this.getHighSpeedVideoSizes = deferredAnimation;
        this.Camera2StreamConfigurationMap = deferredAnimation2;
        this.getHighResolutionOutputSizeshNQ4ISI = deferredAnimation3;
        this.getHighSpeedVideoFpsRanges = enterTransition;
        this.getOutputFormats = exitTransition;
        this.getInputFormats = function0;
        this.getOutputMinFrameDuration = graphicsLayerBlockForEnterExit;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(androidx.compose.animation.EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        androidx.compose.animation.EnterExitTransitionModifierNode enterExitTransitionModifierNode2 = enterExitTransitionModifierNode;
        enterExitTransitionModifierNode2.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor;
        enterExitTransitionModifierNode2.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes;
        enterExitTransitionModifierNode2.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        enterExitTransitionModifierNode2.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI;
        enterExitTransitionModifierNode2.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges;
        enterExitTransitionModifierNode2.getInputSizeshNQ4ISI = this.getOutputFormats;
        enterExitTransitionModifierNode2.getOutputFormats = this.getInputFormats;
        enterExitTransitionModifierNode2.getInputFormats = this.getOutputMinFrameDuration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("enterExitTransition");
        inspectorInfo.getProperties().set("transition", this.getHighSpeedVideoFpsRangesFor);
        inspectorInfo.getProperties().set("sizeAnimation", this.getHighSpeedVideoSizes);
        inspectorInfo.getProperties().set("offsetAnimation", this.Camera2StreamConfigurationMap);
        inspectorInfo.getProperties().set("slideAnimation", this.getHighResolutionOutputSizeshNQ4ISI);
        inspectorInfo.getProperties().set("enter", this.getHighSpeedVideoFpsRanges);
        inspectorInfo.getProperties().set(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.EXIT, this.getOutputFormats);
        inspectorInfo.getProperties().set("graphicsLayerBlock", this.getOutputMinFrameDuration);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRangesFor.hashCode();
        androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> deferredAnimation = this.getHighSpeedVideoSizes;
        int hashCode2 = deferredAnimation != null ? deferredAnimation.hashCode() : 0;
        androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation2 = this.Camera2StreamConfigurationMap;
        int hashCode3 = deferredAnimation2 != null ? deferredAnimation2.hashCode() : 0;
        androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> deferredAnimation3 = this.getHighResolutionOutputSizeshNQ4ISI;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (deferredAnimation3 != null ? deferredAnimation3.hashCode() : 0)) * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + this.getOutputFormats.hashCode()) * 31) + this.getInputFormats.hashCode()) * 31) + this.getOutputMinFrameDuration.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.compose.animation.EnterExitTransitionElement)) {
            return false;
        }
        androidx.compose.animation.EnterExitTransitionElement enterExitTransitionElement = (androidx.compose.animation.EnterExitTransitionElement) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(enterExitTransitionElement.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(enterExitTransitionElement.getHighSpeedVideoSizes, this.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(enterExitTransitionElement.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(enterExitTransitionElement.getHighResolutionOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(enterExitTransitionElement.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(enterExitTransitionElement.getOutputFormats, this.getOutputFormats) && enterExitTransitionElement.getInputFormats == this.getInputFormats && kotlin.jvm.internal.Intrinsics.areEqual(enterExitTransitionElement.getOutputMinFrameDuration, this.getOutputMinFrameDuration);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.animation.EnterExitTransitionModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.animation.EnterExitTransitionModifierNode(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputFormats, this.getInputFormats, this.getOutputMinFrameDuration);
    }
}
