package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final class CurrencyPickerKt$EqualWidthRow$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* bridge */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* bridge */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* bridge */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* bridge */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measureScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.size() != 2) {
            throw new java.lang.IllegalArgumentException("EqualWidthRow requires exactly 2 children, got ".concat(java.lang.String.valueOf(list.size())).toString());
        }
        final int i = measureScope.mo1412roundToPx0680j_4(this.getHighResolutionOutputSizeshNQ4ISI);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        java.util.Iterator<T> it = list2.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int maxIntrinsicWidth = ((androidx.compose.ui.layout.Measurable) it.next()).maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j));
        while (it.hasNext()) {
            int maxIntrinsicWidth2 = ((androidx.compose.ui.layout.Measurable) it.next()).maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j));
            if (maxIntrinsicWidth < maxIntrinsicWidth2) {
                maxIntrinsicWidth = maxIntrinsicWidth2;
            }
        }
        final int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(maxIntrinsicWidth, kotlin.ranges.RangesKt.coerceAtLeast((androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) - i) / 2, 0));
        long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, coerceAtMost, coerceAtMost, 0, 0, 12, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((androidx.compose.ui.layout.Measurable) it2.next()).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        int m8571constrainWidthK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, (coerceAtMost * 2) + i);
        java.util.Iterator it3 = arrayList2.iterator();
        if (!it3.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int height = ((androidx.compose.ui.layout.Placeable) it3.next()).getHeight();
        while (it3.hasNext()) {
            int height2 = ((androidx.compose.ui.layout.Placeable) it3.next()).getHeight();
            if (height < height2) {
                height = height2;
            }
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8571constrainWidthK40F9xA, androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, height), null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.commonui.components.CurrencyPickerKt$EqualWidthRow$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.commonui.components.CurrencyPickerKt$EqualWidthRow$1$1.getHighResolutionOutputSizeshNQ4ISI(arrayList2, coerceAtMost, i, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.util.List list, int i, int i2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementScope, "");
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(0), 0, 0, 0.0f, 4, null);
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(1), i + i2, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    CurrencyPickerKt$EqualWidthRow$1$1(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }
}
