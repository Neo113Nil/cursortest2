package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0013\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0018\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J#\u0010\u001c\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001d\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\b\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010'\u001a\u0004\b\b\u0010)\"\u0004\b,\u0010+"}, d2 = {"Landroidx/compose/foundation/ScrollNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/ScrollState;", "state", "", "reverseScrolling", "isVertical", "<init>", "(Landroidx/compose/foundation/ScrollState;ZZ)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/foundation/ScrollState;", "getState", "()Landroidx/compose/foundation/ScrollState;", "setState", "(Landroidx/compose/foundation/ScrollState;)V", "Z", "getReverseScrolling", "()Z", "setReverseScrolling", "(Z)V", "setVertical"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode, androidx.compose.ui.node.SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean isVertical;
    private boolean reverseScrolling;
    private androidx.compose.foundation.ScrollState state;

    public ScrollNode(androidx.compose.foundation.ScrollState scrollState, boolean z, boolean z2) {
        this.state = scrollState;
        this.reverseScrolling = z;
        this.isVertical = z2;
    }

    public final androidx.compose.foundation.ScrollState getState() {
        return this.state;
    }

    public final void setState(androidx.compose.foundation.ScrollState scrollState) {
        this.state = scrollState;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final void setReverseScrolling(boolean z) {
        this.reverseScrolling = z;
    }

    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final void setVertical(boolean z) {
        this.isVertical = z;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        androidx.compose.foundation.CheckScrollableContainerConstraintsKt.m1313checkScrollableContainerConstraintsK40F9xA(j, this.isVertical ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal);
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, this.isVertical ? androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j), 5, null));
        int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(mo7353measureBRTryo0.getWidth(), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j));
        int coerceAtMost2 = kotlin.ranges.RangesKt.coerceAtMost(mo7353measureBRTryo0.getHeight(), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j));
        final int height = mo7353measureBRTryo0.getHeight() - coerceAtMost2;
        int width = mo7353measureBRTryo0.getWidth();
        if (!this.isVertical) {
            height = width - coerceAtMost;
        }
        this.state.setMaxValue$foundation(height);
        this.state.setViewportSize$foundation(this.isVertical ? coerceAtMost2 : coerceAtMost);
        this.state.setContentSize$foundation(this.isVertical ? mo7353measureBRTryo0.getHeight() : mo7353measureBRTryo0.getWidth());
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, coerceAtMost, coerceAtMost2, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.ScrollNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.ScrollNode.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.ScrollNode.this, height, mo7353measureBRTryo0, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.ScrollNode scrollNode, int i, final androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int value = scrollNode.state.getValue();
        if (value < 0) {
            value = 0;
        }
        if (value > i) {
            value = i;
        }
        int i2 = scrollNode.reverseScrolling ? value - i : -value;
        boolean z = scrollNode.isVertical;
        final int i3 = z ? 0 : i2;
        final int i4 = z ? i2 : 0;
        placementScope.withMotionFrameOfReferencePlacement(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.ScrollNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.ScrollNode.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable.this, i3, i4, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoFpsRangesFor;
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable placeable, int i, int i2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable, i, i2, 0.0f, (kotlin.jvm.functions.Function1) null, 12, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange = new androidx.compose.ui.semantics.ScrollAxisRange(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.ScrollNode$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                float highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.ScrollNode.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.ScrollNode.this);
                return java.lang.Float.valueOf(highResolutionOutputSizeshNQ4ISI);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.ScrollNode$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                float highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.ScrollNode.getHighSpeedVideoSizes(androidx.compose.foundation.ScrollNode.this);
                return java.lang.Float.valueOf(highSpeedVideoSizes);
            }
        }, this.reverseScrolling);
        if (this.isVertical) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.ScrollNode scrollNode) {
        return scrollNode.state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoSizes(androidx.compose.foundation.ScrollNode scrollNode) {
        return scrollNode.state.getMaxValue();
    }
}
