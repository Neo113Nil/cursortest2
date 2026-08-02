package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B0\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\t*\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/BoxChildDataNode;", "Landroidx/compose/ui/Alignment;", "p0", "", "p1", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p2", "<init>", "(Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/foundation/layout/BoxChildDataNode;", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/layout/BoxChildDataNode;)V", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/Alignment;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BoxChildDataElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.BoxChildDataNode> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.Alignment getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public BoxChildDataElement(androidx.compose.ui.Alignment alignment, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1) {
        this.getHighResolutionOutputSizeshNQ4ISI = alignment;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.BoxChildDataNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.layout.BoxChildDataNode(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.layout.BoxChildDataNode p0) {
        p0.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI);
        p0.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.getHighSpeedVideoFpsRangesFor.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        androidx.compose.foundation.layout.BoxChildDataElement boxChildDataElement = p0 instanceof androidx.compose.foundation.layout.BoxChildDataElement ? (androidx.compose.foundation.layout.BoxChildDataElement) p0 : null;
        return boxChildDataElement != null && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, boxChildDataElement.getHighResolutionOutputSizeshNQ4ISI) && this.Camera2StreamConfigurationMap == boxChildDataElement.Camera2StreamConfigurationMap;
    }
}
