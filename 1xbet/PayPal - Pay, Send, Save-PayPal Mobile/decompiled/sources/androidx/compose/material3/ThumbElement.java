package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/material3/ThumbElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/ThumbNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "p0", "", "p1", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "p2", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;ZLandroidx/compose/animation/core/FiniteAnimationSpec;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/interaction/InteractionSource;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoFpsRanges", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class ThumbElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.material3.ThumbNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.interaction.InteractionSource getHighSpeedVideoFpsRangesFor;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ void update(androidx.compose.material3.ThumbNode thumbNode) {
        androidx.compose.material3.ThumbNode thumbNode2 = thumbNode;
        thumbNode2.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor;
        if (thumbNode2.getHighSpeedVideoFpsRanges != this.getHighSpeedVideoFpsRanges) {
            androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(thumbNode2);
        }
        thumbNode2.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges;
        thumbNode2.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI;
        if (thumbNode2.getOutputFormats == null && !java.lang.Float.isNaN(thumbNode2.getInputSizeshNQ4ISI)) {
            thumbNode2.getOutputFormats = androidx.compose.animation.core.AnimatableKt.Animatable$default(thumbNode2.getInputSizeshNQ4ISI, 0.0f, 2, null);
        }
        if (thumbNode2.getInputFormats != null || java.lang.Float.isNaN(thumbNode2.getHighSpeedVideoSizesFor)) {
            return;
        }
        thumbNode2.getInputFormats = androidx.compose.animation.core.AnimatableKt.Animatable$default(thumbNode2.getHighSpeedVideoSizesFor, 0.0f, 2, null);
    }

    public ThumbElement(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec) {
        this.getHighSpeedVideoFpsRangesFor = interactionSource;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighResolutionOutputSizeshNQ4ISI = finiteAnimationSpec;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("switchThumb");
        inspectorInfo.getProperties().set("interactionSource", this.getHighSpeedVideoFpsRangesFor);
        inspectorInfo.getProperties().set("checked", java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRanges));
        inspectorInfo.getProperties().set("animationSpec", this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.material3.ThumbNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.material3.ThumbNode(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ThumbElement(getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges)) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.material3.ThumbElement)) {
            return false;
        }
        androidx.compose.material3.ThumbElement thumbElement = (androidx.compose.material3.ThumbElement) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, thumbElement.getHighSpeedVideoFpsRangesFor) && this.getHighSpeedVideoFpsRanges == thumbElement.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, thumbElement.getHighResolutionOutputSizeshNQ4ISI);
    }
}
