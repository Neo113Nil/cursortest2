package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ androidx.constraintlayout.compose.Measurer2 $Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.constraintlayout.compose.ConstraintSet $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int $getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<kotlin.Unit> $getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, final java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.$getHighSpeedVideoSizes.getValue();
        long m8985performMeasureDjhGOtQ = this.$Camera2StreamConfigurationMap.m8985performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.$getHighResolutionOutputSizeshNQ4ISI, list, linkedHashMap, this.$getHighSpeedVideoFpsRanges);
        int m8772getWidthimpl = androidx.compose.ui.unit.IntSize.m8772getWidthimpl(m8985performMeasureDjhGOtQ);
        int m8771getHeightimpl = androidx.compose.ui.unit.IntSize.m8771getHeightimpl(m8985performMeasureDjhGOtQ);
        final androidx.constraintlayout.compose.Measurer2 measurer2 = this.$Camera2StreamConfigurationMap;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8772getWidthimpl, m8771getHeightimpl, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1.1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.constraintlayout.compose.Measurer2.this.performLayout(placementScope, list, linkedHashMap);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        }, 4, null);
    }

    public ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState, androidx.constraintlayout.compose.Measurer2 measurer2, androidx.constraintlayout.compose.ConstraintSet constraintSet, int i) {
        this.$getHighSpeedVideoSizes = mutableState;
        this.$Camera2StreamConfigurationMap = measurer2;
        this.$getHighResolutionOutputSizeshNQ4ISI = constraintSet;
        this.$getHighSpeedVideoFpsRanges = i;
    }
}
