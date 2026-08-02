package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B,\u0012#\u0010\t\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u000e*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R.\u0010\f\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b8\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/LayoutModifierImpl;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/ui/layout/LayoutModifierImpl;", "", "(Landroidx/compose/ui/layout/LayoutModifierImpl;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LayoutElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.layout.LayoutModifierImpl> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function3<androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.MeasureScope, ? super androidx.compose.ui.layout.Measurable, ? super androidx.compose.ui.unit.Constraints, ? extends androidx.compose.ui.layout.MeasureResult> function3) {
        this.getHighSpeedVideoFpsRanges = function3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.layout.LayoutModifierImpl create() {
        return new androidx.compose.ui.layout.LayoutModifierImpl(this.getHighSpeedVideoFpsRanges);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.ui.layout.LayoutModifierImpl p0) {
        p0.setMeasureBlock(this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName(androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE);
        inspectorInfo.getProperties().set("measure", this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.ui.layout.LayoutElement) && this.getHighSpeedVideoFpsRanges == ((androidx.compose.ui.layout.LayoutElement) p0).getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }
}
