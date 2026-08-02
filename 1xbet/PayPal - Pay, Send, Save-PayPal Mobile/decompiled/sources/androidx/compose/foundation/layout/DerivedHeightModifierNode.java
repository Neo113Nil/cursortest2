package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B.\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\u0011\u0010\u000bJ#\u0010\u0018\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR-\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/layout/DerivedHeightModifierNode;", "Landroidx/compose/foundation/layout/InsetsConsumingModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/foundation/layout/WindowInsets;", "p0", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "Lkotlin/ExtensionFunctionType;", "p1", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;)V", "calculateInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;", "", "insetsInvalidated", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/layout/WindowInsets;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DerivedHeightModifierNode extends androidx.compose.foundation.layout.InsetsConsumingModifierNode implements androidx.compose.ui.node.LayoutModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function2<? super androidx.compose.foundation.layout.WindowInsets, ? super androidx.compose.ui.unit.Density, java.lang.Integer> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.layout.WindowInsets Camera2StreamConfigurationMap = androidx.compose.foundation.layout.WindowInsetsKt.WindowInsets();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.foundation.layout.WindowInsets getHighSpeedVideoFpsRanges;

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public final androidx.compose.foundation.layout.WindowInsets calculateInsets(androidx.compose.foundation.layout.WindowInsets p0) {
        return p0;
    }

    public DerivedHeightModifierNode(androidx.compose.foundation.layout.WindowInsets windowInsets, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.layout.WindowInsets, ? super androidx.compose.ui.unit.Density, java.lang.Integer> function2) {
        this.getHighSpeedVideoFpsRanges = windowInsets;
        this.getHighSpeedVideoSizes = function2;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public final void insetsInvalidated() {
        this.Camera2StreamConfigurationMap = androidx.compose.foundation.layout.WindowInsetsKt.exclude(this.getHighSpeedVideoFpsRanges, getAncestorConsumedInsets());
        super.insetsInvalidated();
        androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.layout.WindowInsets p0, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.layout.WindowInsets, ? super androidx.compose.ui.unit.Density, java.lang.Integer> p1) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, p0) && p1 == this.getHighSpeedVideoSizes) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = p0;
        this.getHighSpeedVideoSizes = p1;
        this.Camera2StreamConfigurationMap = androidx.compose.foundation.layout.WindowInsetsKt.exclude(p0, getAncestorConsumedInsets());
        androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        int intValue = this.getHighSpeedVideoSizes.invoke(this.Camera2StreamConfigurationMap, measureScope).intValue();
        if (intValue == 0) {
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, 0, 0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.DerivedHeightModifierNode$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.layout.DerivedHeightModifierNode.getHighSpeedVideoSizes();
                    return highSpeedVideoSizes;
                }
            }, 4, null);
        }
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, intValue, intValue, 3, null));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), intValue, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.DerivedHeightModifierNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.layout.DerivedHeightModifierNode.getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoFpsRanges;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
