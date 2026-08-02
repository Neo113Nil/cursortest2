package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\u0004*\u00020\b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0015\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u0012*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001e\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001cH&¢\u0006\u0004\b!\u0010\u001fJ#\u0010\"\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\"\u0010\u001fJ#\u0010#\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001cH&¢\u0006\u0004\b#\u0010\u001fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/unit/IntSize;", "lookaheadSize", "", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "isMeasurementApproachInProgress", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadCoordinates", "isPlacementApproachInProgress", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/LayoutCoordinates;)Z", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "approachMeasure", "Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minApproachIntrinsicWidth", "(Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minApproachIntrinsicHeight", "maxApproachIntrinsicWidth", "maxApproachIntrinsicHeight"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ApproachLayoutModifierNode extends androidx.compose.ui.node.LayoutModifierNode {
    /* renamed from: approachMeasure-3p2s80s */
    androidx.compose.ui.layout.MeasureResult mo1119approachMeasure3p2s80s(androidx.compose.ui.layout.ApproachMeasureScope approachMeasureScope, androidx.compose.ui.layout.Measurable measurable, long j);

    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    boolean mo1120isMeasurementApproachInProgressozmzZPI(long lookaheadSize);

    default boolean isPlacementApproachInProgress(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    default androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$measure$1$1
            public final void getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                getHighSpeedVideoSizes(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        }, 4, null);
    }

    default int minApproachIntrinsicWidth(androidx.compose.ui.layout.ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.node.NodeCoordinator coordinator = getNode().getCoordinator();
        kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator);
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        if (lookaheadDelegate.getHasMeasureResult()) {
            return androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.minWidth$ui(new androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$minApproachIntrinsicWidth$1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                /* renamed from: measure-3p2s80s */
                public final androidx.compose.ui.layout.MeasureResult mo7336measure3p2s80s(androidx.compose.ui.layout.ApproachMeasureScope approachMeasureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                    return androidx.compose.ui.layout.ApproachLayoutModifierNode.this.mo1119approachMeasure3p2s80s(approachMeasureScope, measurable, j);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    default int minApproachIntrinsicHeight(androidx.compose.ui.layout.ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.node.NodeCoordinator coordinator = getNode().getCoordinator();
        kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator);
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        if (lookaheadDelegate.getHasMeasureResult()) {
            return androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.minHeight$ui(new androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$minApproachIntrinsicHeight$1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                /* renamed from: measure-3p2s80s */
                public final androidx.compose.ui.layout.MeasureResult mo7336measure3p2s80s(androidx.compose.ui.layout.ApproachMeasureScope approachMeasureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                    return androidx.compose.ui.layout.ApproachLayoutModifierNode.this.mo1119approachMeasure3p2s80s(approachMeasureScope, measurable, j);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    default int maxApproachIntrinsicWidth(androidx.compose.ui.layout.ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.node.NodeCoordinator coordinator = getNode().getCoordinator();
        kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator);
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        if (lookaheadDelegate.getHasMeasureResult()) {
            return androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui(new androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$maxApproachIntrinsicWidth$1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                /* renamed from: measure-3p2s80s */
                public final androidx.compose.ui.layout.MeasureResult mo7336measure3p2s80s(androidx.compose.ui.layout.ApproachMeasureScope approachMeasureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                    return androidx.compose.ui.layout.ApproachLayoutModifierNode.this.mo1119approachMeasure3p2s80s(approachMeasureScope, measurable, j);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    default int maxApproachIntrinsicHeight(androidx.compose.ui.layout.ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.node.NodeCoordinator coordinator = getNode().getCoordinator();
        kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator);
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        if (lookaheadDelegate.getHasMeasureResult()) {
            return androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui(new androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$maxApproachIntrinsicHeight$1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                /* renamed from: measure-3p2s80s, reason: not valid java name */
                public final androidx.compose.ui.layout.MeasureResult mo7336measure3p2s80s(androidx.compose.ui.layout.ApproachMeasureScope approachMeasureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                    return androidx.compose.ui.layout.ApproachLayoutModifierNode.this.mo1119approachMeasure3p2s80s(approachMeasureScope, measurable, j);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }
}
