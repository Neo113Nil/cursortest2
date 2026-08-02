package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\r\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/material3/CenteredContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "<init>", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "p0", "Landroidx/compose/ui/unit/Constraints;", "p1", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CenteredContentMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        final java.util.ArrayList arrayList;
        int i;
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        int m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
        int size = list.size();
        if (size <= 0) {
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8554getMaxWidthimpl, m8555getMinHeightimpl, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            }, 4, null);
        }
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        int i2 = 0;
        if (androidx.compose.ui.unit.Constraints.m8550getHasBoundedWidthimpl(j)) {
            int i3 = m8554getMaxWidthimpl / size;
            intRef.element = androidx.compose.material3.ShortNavigationBarKt.access$calculateCenteredContentHorizontalPadding(size, m8554getMaxWidthimpl);
            int i4 = (m8554getMaxWidthimpl - (intRef.element * 2)) / size;
            java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
            int size2 = list2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                int maxIntrinsicHeight = list.get(i5).maxIntrinsicHeight(i4);
                if (m8555getMinHeightimpl < maxIntrinsicHeight) {
                    m8555getMinHeightimpl = kotlin.ranges.RangesKt.coerceAtMost(maxIntrinsicHeight, androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j));
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
            int size3 = list2.size();
            while (i2 < size3) {
                java.util.ArrayList arrayList3 = arrayList2;
                androidx.compose.ui.layout.Measurable measurable = list.get(i2);
                int maxIntrinsicWidth = measurable.maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j));
                if (i4 < maxIntrinsicWidth) {
                    i = kotlin.ranges.RangesKt.coerceAtMost(maxIntrinsicWidth, i3);
                    intRef.element -= (i - i4) / 2;
                } else {
                    i = i4;
                }
                arrayList3.add(measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8569constrainN9IONVI(j, androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(i, m8555getMinHeightimpl))));
                i2++;
            }
            arrayList = arrayList2;
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(list.size());
            int size4 = list.size();
            while (i2 < size4) {
                arrayList4.add(list.get(i2).mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8569constrainN9IONVI(j, androidx.compose.ui.unit.Constraints.INSTANCE.m8565fixedHeightOenEA2s(m8555getMinHeightimpl))));
                i2++;
            }
            arrayList = arrayList4;
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8554getMaxWidthimpl, m8555getMinHeightimpl, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.CenteredContentMeasurePolicy.getHighSpeedVideoSizes(kotlin.jvm.internal.Ref.IntRef.this, arrayList, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.internal.Ref.IntRef intRef, java.util.List list, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int i = intRef.element;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list.get(i2);
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, 0, 0.0f, 4, null);
            i += placeable.getWidth();
        }
        return kotlin.Unit.INSTANCE;
    }
}
