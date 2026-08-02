package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\t\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/IndicationModifierNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "p0", "Landroidx/compose/foundation/IndicationNodeFactory;", "p1", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;)V", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/foundation/IndicationModifierNode;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "(Landroidx/compose/foundation/IndicationModifierNode;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/foundation/IndicationNodeFactory;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class IndicationModifierElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.IndicationModifierNode> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.IndicationNodeFactory getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.foundation.interaction.InteractionSource getHighSpeedVideoFpsRanges;

    public IndicationModifierElement(androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory) {
        this.getHighSpeedVideoFpsRanges = interactionSource;
        this.getHighSpeedVideoFpsRangesFor = indicationNodeFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.IndicationModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.IndicationModifierNode(this.getHighSpeedVideoFpsRangesFor.create(this.getHighSpeedVideoFpsRanges));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("indication");
        inspectorInfo.getProperties().set("interactionSource", this.getHighSpeedVideoFpsRanges);
        inspectorInfo.getProperties().set("indication", this.getHighSpeedVideoFpsRangesFor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.IndicationModifierNode p0) {
        p0.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor.create(this.getHighSpeedVideoFpsRanges));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.IndicationModifierElement)) {
            return false;
        }
        androidx.compose.foundation.IndicationModifierElement indicationModifierElement = (androidx.compose.foundation.IndicationModifierElement) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, indicationModifierElement.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, indicationModifierElement.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
    }
}
