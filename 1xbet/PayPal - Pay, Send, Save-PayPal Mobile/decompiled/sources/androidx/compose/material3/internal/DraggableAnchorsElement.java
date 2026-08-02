package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002BS\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00124\u0010\f\u001a0\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\t\u0012\u00070\t¢\u0006\u0002\b\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00028\u00000\n0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dRB\u0010 \u001a0\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\t\u0012\u00070\t¢\u0006\u0002\b\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00028\u00000\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001c\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsElement;", "T", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/internal/DraggableAnchorsNode;", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "p0", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "Landroidx/compose/ui/unit/Constraints;", "Lkotlin/Pair;", "Landroidx/compose/material3/internal/DraggableAnchors;", "p1", "Landroidx/compose/foundation/gestures/Orientation;", "p2", "<init>", "(Landroidx/compose/material3/internal/AnchoredDraggableState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/gestures/Orientation;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/gestures/Orientation;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DraggableAnchorsElement<T> extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.material3.internal.DraggableAnchorsNode<T>> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.Orientation getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.Constraints, kotlin.Pair<androidx.compose.material3.internal.DraggableAnchors<T>, T>> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.AnchoredDraggableState<T> getHighSpeedVideoFpsRanges;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(androidx.compose.ui.Modifier.Node node) {
        androidx.compose.material3.internal.DraggableAnchorsNode draggableAnchorsNode = (androidx.compose.material3.internal.DraggableAnchorsNode) node;
        draggableAnchorsNode.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        draggableAnchorsNode.getHighSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI;
        draggableAnchorsNode.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableAnchorsElement(androidx.compose.material3.internal.AnchoredDraggableState<T> anchoredDraggableState, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.Constraints, ? extends kotlin.Pair<? extends androidx.compose.material3.internal.DraggableAnchors<T>, ? extends T>> function2, androidx.compose.foundation.gestures.Orientation orientation) {
        this.getHighSpeedVideoFpsRanges = anchoredDraggableState;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoFpsRangesFor = orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.material3.internal.DraggableAnchorsElement)) {
            return false;
        }
        androidx.compose.material3.internal.DraggableAnchorsElement draggableAnchorsElement = (androidx.compose.material3.internal.DraggableAnchorsElement) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, draggableAnchorsElement.getHighSpeedVideoFpsRanges) && this.getHighResolutionOutputSizeshNQ4ISI == draggableAnchorsElement.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor == draggableAnchorsElement.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        if (androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()) {
            new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.material3.internal.DraggableAnchorsElement$inspectableProperties$$inlined$debugInspectorInfo$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo2) {
                    invoke2(inspectorInfo2);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo2) {
                    androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState;
                    kotlin.jvm.functions.Function2 function2;
                    androidx.compose.foundation.gestures.Orientation orientation;
                    androidx.compose.ui.platform.ValueElementSequence properties = inspectorInfo2.getProperties();
                    anchoredDraggableState = androidx.compose.material3.internal.DraggableAnchorsElement.this.getHighSpeedVideoFpsRanges;
                    properties.set("state", anchoredDraggableState);
                    androidx.compose.ui.platform.ValueElementSequence properties2 = inspectorInfo2.getProperties();
                    function2 = androidx.compose.material3.internal.DraggableAnchorsElement.this.getHighResolutionOutputSizeshNQ4ISI;
                    properties2.set("anchors", function2);
                    androidx.compose.ui.platform.ValueElementSequence properties3 = inspectorInfo2.getProperties();
                    orientation = androidx.compose.material3.internal.DraggableAnchorsElement.this.getHighSpeedVideoFpsRangesFor;
                    properties3.set("orientation", orientation);
                }

                {
                    super(1);
                }
            };
        } else {
            androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo();
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.ui.Modifier.Node getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.material3.internal.DraggableAnchorsNode(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
    }
}
