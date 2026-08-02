package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0006J#\u0010\u0016\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/layout/InsetsPaddingModifierNode;", "Landroidx/compose/foundation/layout/InsetsConsumingModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/foundation/layout/WindowInsets;", "insets", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "ancestorConsumedInsets", "calculateInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;", "", "insetsInvalidated", "()V", "update", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/layout/WindowInsets;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class InsetsPaddingModifierNode extends androidx.compose.foundation.layout.InsetsConsumingModifierNode implements androidx.compose.ui.node.LayoutModifierNode {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.foundation.layout.WindowInsets getHighSpeedVideoFpsRangesFor;

    public InsetsPaddingModifierNode(androidx.compose.foundation.layout.WindowInsets windowInsets) {
        this.getHighSpeedVideoFpsRangesFor = windowInsets;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public androidx.compose.foundation.layout.WindowInsets calculateInsets(androidx.compose.foundation.layout.WindowInsets ancestorConsumedInsets) {
        return androidx.compose.foundation.layout.WindowInsetsKt.union(ancestorConsumedInsets, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public void insetsInvalidated() {
        super.insetsInvalidated();
        androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    public final void update(androidx.compose.foundation.layout.WindowInsets insets) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(insets, this.getHighSpeedVideoFpsRangesFor)) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = insets;
        insetsInvalidated();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        androidx.compose.ui.layout.MeasureScope measureScope2 = measureScope;
        final int left = getConsumedInsets().getLeft(measureScope2, measureScope.getLayoutDirection()) - getAncestorConsumedInsets().getLeft(measureScope2, measureScope.getLayoutDirection());
        final int top = getConsumedInsets().getTop(measureScope2) - getAncestorConsumedInsets().getTop(measureScope2);
        int right = (getConsumedInsets().getRight(measureScope2, measureScope.getLayoutDirection()) - getAncestorConsumedInsets().getRight(measureScope2, measureScope.getLayoutDirection())) + left;
        int bottom = (getConsumedInsets().getBottom(measureScope2) - getAncestorConsumedInsets().getBottom(measureScope2)) + top;
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8573offsetNN6EwU(j, -right, -bottom));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, mo7353measureBRTryo0.getWidth() + right), androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, mo7353measureBRTryo0.getHeight() + bottom), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.InsetsPaddingModifierNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.layout.InsetsPaddingModifierNode.Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable.this, left, top, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return Camera2StreamConfigurationMap;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable placeable, int i, int i2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, i, i2, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
