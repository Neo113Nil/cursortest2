package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0011\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0011\u0010\u001d\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\b!\u0010#R\u0011\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010#"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "p0", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "p1", "Landroidx/compose/foundation/gestures/Orientation;", "p2", "", "p3", "p4", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZ)V", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;", "", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/gestures/Orientation;", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LazyLayoutSemanticsModifier extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.Orientation getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider> getHighSpeedVideoFpsRanges;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutSemanticsModifier(kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider> function0, androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState lazyLayoutSemanticState, androidx.compose.foundation.gestures.Orientation orientation, boolean z, boolean z2) {
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = lazyLayoutSemanticState;
        this.getHighSpeedVideoFpsRangesFor = orientation;
        this.getHighSpeedVideoSizes = z;
        this.Camera2StreamConfigurationMap = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode p0) {
        p0.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier)) {
            return false;
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier) p0;
        return this.getHighSpeedVideoFpsRanges == lazyLayoutSemanticsModifier.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, lazyLayoutSemanticsModifier.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoFpsRangesFor == lazyLayoutSemanticsModifier.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes == lazyLayoutSemanticsModifier.getHighSpeedVideoSizes && this.Camera2StreamConfigurationMap == lazyLayoutSemanticsModifier.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRanges.hashCode();
        int hashCode2 = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        return (((((((hashCode * 31) + hashCode2) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes)) * 31) + java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap);
    }
}
