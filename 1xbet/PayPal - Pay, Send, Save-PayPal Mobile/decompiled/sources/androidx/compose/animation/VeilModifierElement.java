package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR'\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\f8\u0006¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/animation/VeilModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/VeilModifierNode;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "p0", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "p1", "Landroidx/compose/animation/EnterTransition;", "p2", "Landroidx/compose/animation/ExitTransition;", "p3", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroidx/compose/animation/core/Transition;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/EnterTransition;", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/ExitTransition;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class VeilModifierElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.animation.VeilModifierNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.animation.ExitTransition getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.animation.EnterTransition Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> getHighResolutionOutputSizeshNQ4ISI;

    public VeilModifierElement(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D> deferredAnimation, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition) {
        this.getHighResolutionOutputSizeshNQ4ISI = transition;
        this.getHighSpeedVideoSizes = deferredAnimation;
        this.Camera2StreamConfigurationMap = enterTransition;
        this.getHighSpeedVideoFpsRanges = exitTransition;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(androidx.compose.animation.VeilModifierNode veilModifierNode) {
        androidx.compose.animation.VeilModifierNode veilModifierNode2 = veilModifierNode;
        veilModifierNode2.Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        veilModifierNode2.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
        veilModifierNode2.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap;
        veilModifierNode2.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("veil");
        inspectorInfo.getProperties().set("transition", this.getHighResolutionOutputSizeshNQ4ISI);
        inspectorInfo.getProperties().set("veilAnimation", this.getHighSpeedVideoSizes);
        inspectorInfo.getProperties().set("enter", this.Camera2StreamConfigurationMap);
        inspectorInfo.getProperties().set(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.EXIT, this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.animation.VeilModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.animation.VeilModifierNode(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VeilModifierElement(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((((this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.animation.VeilModifierElement)) {
            return false;
        }
        androidx.compose.animation.VeilModifierElement veilModifierElement = (androidx.compose.animation.VeilModifierElement) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, veilModifierElement.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, veilModifierElement.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, veilModifierElement.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, veilModifierElement.getHighSpeedVideoFpsRanges);
    }
}
