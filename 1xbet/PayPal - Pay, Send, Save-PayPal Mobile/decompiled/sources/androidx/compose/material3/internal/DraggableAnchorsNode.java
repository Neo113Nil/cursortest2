package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BS\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00124\u0010\f\u001a0\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\t\u0012\u00070\t¢\u0006\u0002\b\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00028\u00000\n0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0019\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bRD\u0010\u001c\u001a0\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\t\u0012\u00070\t¢\u0006\u0002\b\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00028\u00000\n0\u00068\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\r8\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u001e\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\""}, d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsNode;", "T", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "p0", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "Landroidx/compose/ui/unit/Constraints;", "Lkotlin/Pair;", "Landroidx/compose/material3/internal/DraggableAnchors;", "p1", "Landroidx/compose/foundation/gestures/Orientation;", "p2", "<init>", "(Landroidx/compose/material3/internal/AnchoredDraggableState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/gestures/Orientation;)V", "", "onDetach", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Camera2StreamConfigurationMap", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/gestures/Orientation;", "getHighSpeedVideoFpsRangesFor", "", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DraggableAnchorsNode<T> extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    androidx.compose.material3.internal.AnchoredDraggableState<T> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    androidx.compose.foundation.gestures.Orientation getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;
    kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.Constraints, ? extends kotlin.Pair<? extends androidx.compose.material3.internal.DraggableAnchors<T>, ? extends T>> getHighSpeedVideoSizes;

    public DraggableAnchorsNode(androidx.compose.material3.internal.AnchoredDraggableState<T> anchoredDraggableState, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.Constraints, ? extends kotlin.Pair<? extends androidx.compose.material3.internal.DraggableAnchors<T>, ? extends T>> function2, androidx.compose.foundation.gestures.Orientation orientation) {
        this.Camera2StreamConfigurationMap = anchoredDraggableState;
        this.getHighSpeedVideoSizes = function2;
        this.getHighSpeedVideoFpsRangesFor = orientation;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.getHighSpeedVideoFpsRanges = false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
        if (!measureScope.isLookingAhead() || !this.getHighSpeedVideoFpsRanges) {
            kotlin.Pair<? extends androidx.compose.material3.internal.DraggableAnchors<T>, ? extends T> invoke = this.getHighSpeedVideoSizes.invoke(androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.ui.unit.IntSize.m8767constructorimpl((mo7353measureBRTryo0.getHeight() & 4294967295L) | (mo7353measureBRTryo0.getWidth() << 32))), androidx.compose.ui.unit.Constraints.m8542boximpl(j));
            this.Camera2StreamConfigurationMap.updateAnchors(invoke.getFirst(), invoke.getSecond());
        }
        this.getHighSpeedVideoFpsRanges = measureScope.isLookingAhead() || this.getHighSpeedVideoFpsRanges;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.DraggableAnchorsNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.internal.DraggableAnchorsNode.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.MeasureScope.this, this, mo7353measureBRTryo0, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable placeable, float f, float f2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, kotlin.math.MathKt.roundToInt(f), kotlin.math.MathKt.roundToInt(f2), 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.material3.internal.DraggableAnchorsNode draggableAnchorsNode, final androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        final float requireOffset;
        if (measureScope.isLookingAhead()) {
            requireOffset = draggableAnchorsNode.Camera2StreamConfigurationMap.getAnchors().positionOf(draggableAnchorsNode.Camera2StreamConfigurationMap.getTargetValue());
        } else {
            requireOffset = draggableAnchorsNode.Camera2StreamConfigurationMap.requireOffset();
        }
        final float f = draggableAnchorsNode.getHighSpeedVideoFpsRangesFor == androidx.compose.foundation.gestures.Orientation.Horizontal ? requireOffset : 0.0f;
        if (draggableAnchorsNode.getHighSpeedVideoFpsRangesFor != androidx.compose.foundation.gestures.Orientation.Vertical) {
            requireOffset = 0.0f;
        }
        placementScope.withMotionFrameOfReferencePlacement(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.DraggableAnchorsNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.internal.DraggableAnchorsNode.getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable.this, f, requireOffset, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
