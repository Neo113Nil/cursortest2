package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B(\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b8\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/foundation/layout/PaddingValues;", "p0", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p1", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoSizes", "()Landroidx/compose/foundation/layout/PaddingValuesModifier;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/foundation/layout/PaddingValuesModifier;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/layout/PaddingValues;", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PaddingValuesElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.PaddingValuesModifier> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.PaddingValues getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public PaddingValuesElement(androidx.compose.foundation.layout.PaddingValues paddingValues, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1) {
        this.getHighSpeedVideoSizes = paddingValues;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.PaddingValuesModifier getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.layout.PaddingValuesModifier(this.getHighSpeedVideoSizes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.layout.PaddingValuesModifier p0) {
        p0.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        androidx.compose.foundation.layout.PaddingValuesElement paddingValuesElement = p0 instanceof androidx.compose.foundation.layout.PaddingValuesElement ? (androidx.compose.foundation.layout.PaddingValuesElement) p0 : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, paddingValuesElement.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(inspectorInfo);
    }
}
