package androidx.compose.foundation.text;

/* compiled from: BasicText.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0006J,\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text/TextMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", com.ironsource.C3225pd.c, "Lkotlin/Function0;", "", "Landroidx/compose/ui/geometry/Rect;", "(Lkotlin/jvm/functions/Function0;)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {
    private final kotlin.jvm.functions.Function0<java.util.List<androidx.compose.ui.geometry.Rect>> placements;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextMeasurePolicy(kotlin.jvm.functions.Function0<? extends java.util.List<androidx.compose.ui.geometry.Rect>> function0) {
        this.placements = function0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        java.util.List<androidx.compose.ui.geometry.Rect> invoke = this.placements.invoke();
        final java.util.ArrayList arrayList = null;
        if (invoke != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(invoke.size());
            int size = invoke.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.geometry.Rect rect = invoke.get(i);
                kotlin.Pair pair = rect != null ? new kotlin.Pair(list.get(i).mo3402measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, (int) java.lang.Math.floor(rect.getWidth()), 0, (int) java.lang.Math.floor(rect.getHeight()), 5, null)), androidx.compose.ui.unit.IntOffset.m4601boximpl(androidx.compose.ui.unit.IntOffsetKt.IntOffset(kotlin.math.MathKt.roundToInt(rect.getLeft()), kotlin.math.MathKt.roundToInt(rect.getTop())))) : null;
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            arrayList = arrayList2;
        }
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                java.util.List<kotlin.Pair<androidx.compose.ui.layout.Placeable, androidx.compose.ui.unit.IntOffset>> list2 = arrayList;
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        kotlin.Pair<androidx.compose.ui.layout.Placeable, androidx.compose.ui.unit.IntOffset> pair2 = list2.get(i2);
                        androidx.compose.ui.layout.Placeable.PlacementScope.m3456place70tqf50$default(placementScope, pair2.component1(), pair2.component2().getPackedValue(), 0.0f, 2, null);
                    }
                }
            }
        }, 4, null);
    }
}
