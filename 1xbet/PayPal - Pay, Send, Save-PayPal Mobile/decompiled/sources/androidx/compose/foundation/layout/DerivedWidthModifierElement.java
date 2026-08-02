package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b\u0012#\u0010\u000e\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0002\b\b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0004\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR%\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR1\u0010\u0011\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Landroidx/compose/foundation/layout/DerivedWidthModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/DerivedWidthModifierNode;", "Landroidx/compose/foundation/layout/WindowInsets;", "p0", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p1", "Lkotlin/Function3;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "p2", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/foundation/layout/DerivedWidthModifierNode;", "(Landroidx/compose/foundation/layout/DerivedWidthModifierNode;)V", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/layout/WindowInsets;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DerivedWidthModifierElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.DerivedWidthModifierNode> {
    private final androidx.compose.foundation.layout.WindowInsets Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.Density, java.lang.Integer> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedWidthModifierElement(androidx.compose.foundation.layout.WindowInsets windowInsets, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.WindowInsets, ? super androidx.compose.ui.unit.LayoutDirection, ? super androidx.compose.ui.unit.Density, java.lang.Integer> function3) {
        this.Camera2StreamConfigurationMap = windowInsets;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRangesFor = function3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.DerivedWidthModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.layout.DerivedWidthModifierNode(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.layout.DerivedWidthModifierNode p0) {
        p0.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.Camera2StreamConfigurationMap.hashCode() * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.layout.DerivedWidthModifierElement)) {
            return false;
        }
        androidx.compose.foundation.layout.DerivedWidthModifierElement derivedWidthModifierElement = (androidx.compose.foundation.layout.DerivedWidthModifierElement) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, derivedWidthModifierElement.Camera2StreamConfigurationMap) && this.getHighSpeedVideoFpsRangesFor == derivedWidthModifierElement.getHighSpeedVideoFpsRangesFor;
    }
}
