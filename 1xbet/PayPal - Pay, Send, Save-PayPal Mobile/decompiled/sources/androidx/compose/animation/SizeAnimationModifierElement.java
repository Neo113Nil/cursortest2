package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012$\u0010\u000b\u001a \u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\t\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR/\u0010\u001f\u001a \u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\t\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/SizeAnimationModifierNode;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "p0", "Landroidx/compose/ui/Alignment;", "p1", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "p2", "<init>", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/Alignment;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SizeAnimationModifierElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.animation.SizeAnimationModifierNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.Alignment getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public SizeAnimationModifierElement(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, androidx.compose.ui.Alignment alignment, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function2) {
        this.Camera2StreamConfigurationMap = finiteAnimationSpec;
        this.getHighSpeedVideoSizes = alignment;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(androidx.compose.animation.SizeAnimationModifierNode sizeAnimationModifierNode) {
        androidx.compose.animation.SizeAnimationModifierNode sizeAnimationModifierNode2 = sizeAnimationModifierNode;
        sizeAnimationModifierNode2.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap;
        sizeAnimationModifierNode2.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
        sizeAnimationModifierNode2.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateContentSize");
        inspectorInfo.getProperties().set("animationSpec", this.Camera2StreamConfigurationMap);
        inspectorInfo.getProperties().set("alignment", this.getHighSpeedVideoSizes);
        inspectorInfo.getProperties().set("finishedListener", this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = this.Camera2StreamConfigurationMap.hashCode();
        int hashCode2 = this.getHighSpeedVideoSizes.hashCode();
        kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize, kotlin.Unit> function2 = this.getHighSpeedVideoFpsRangesFor;
        return (((hashCode * 31) + hashCode2) * 31) + (function2 != null ? function2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.compose.animation.SizeAnimationModifierElement)) {
            return false;
        }
        androidx.compose.animation.SizeAnimationModifierElement sizeAnimationModifierElement = (androidx.compose.animation.SizeAnimationModifierElement) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(sizeAnimationModifierElement.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap) && sizeAnimationModifierElement.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(sizeAnimationModifierElement.getHighSpeedVideoSizes, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.animation.SizeAnimationModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.animation.SizeAnimationModifierNode(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
    }
}
