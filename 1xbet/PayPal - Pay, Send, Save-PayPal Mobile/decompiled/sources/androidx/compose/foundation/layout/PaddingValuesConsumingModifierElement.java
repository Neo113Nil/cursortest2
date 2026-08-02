package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B(\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R%\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesConsumingModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/PaddingValuesConsumingModifierNode;", "Landroidx/compose/foundation/layout/PaddingValues;", "p0", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p1", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/foundation/layout/PaddingValuesConsumingModifierNode;", "(Landroidx/compose/foundation/layout/PaddingValuesConsumingModifierNode;)V", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/layout/PaddingValues;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PaddingValuesConsumingModifierElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.PaddingValuesConsumingModifierNode> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.PaddingValues getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public PaddingValuesConsumingModifierElement(androidx.compose.foundation.layout.PaddingValues paddingValues, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRangesFor = paddingValues;
        this.getHighSpeedVideoSizes = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.PaddingValuesConsumingModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.layout.PaddingValuesConsumingModifierNode(this.getHighSpeedVideoFpsRangesFor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.layout.PaddingValuesConsumingModifierNode p0) {
        p0.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.getHighSpeedVideoSizes.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (p0 == this) {
            return true;
        }
        if (p0 instanceof androidx.compose.foundation.layout.PaddingValuesConsumingModifierElement) {
            return kotlin.jvm.internal.Intrinsics.areEqual(((androidx.compose.foundation.layout.PaddingValuesConsumingModifierElement) p0).getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }
}
