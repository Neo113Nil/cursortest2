package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TimePickerKt$CircularLayout$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, final long j) {
        androidx.compose.ui.layout.Measurable measurable;
        androidx.compose.ui.layout.Measurable measurable2;
        float m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
        float f = this.getHighSpeedVideoFpsRangesFor;
        int i = 0;
        long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.Measurable measurable3 = list.get(i2);
            androidx.compose.ui.layout.Measurable measurable4 = measurable3;
            if (androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable4) != androidx.compose.material3.LayoutId.getHighSpeedVideoFpsRangesFor && androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable4) != androidx.compose.material3.LayoutId.Camera2StreamConfigurationMap) {
                arrayList.add(measurable3);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList3.add(((androidx.compose.ui.layout.Measurable) arrayList2.get(i3)).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
        }
        final java.util.ArrayList arrayList4 = arrayList3;
        int size3 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                measurable = null;
                break;
            }
            measurable = list.get(i4);
            if (androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable) == androidx.compose.material3.LayoutId.getHighSpeedVideoFpsRangesFor) {
                break;
            }
            i4++;
        }
        androidx.compose.ui.layout.Measurable measurable5 = measurable;
        int size4 = list2.size();
        while (true) {
            if (i >= size4) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i);
            if (androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2) == androidx.compose.material3.LayoutId.Camera2StreamConfigurationMap) {
                break;
            }
            i++;
        }
        androidx.compose.ui.layout.Measurable measurable6 = measurable2;
        final float size5 = 6.2831855f / arrayList4.size();
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable5 != null ? measurable5.mo7353measureBRTryo0(m8545copyZbe2FdA$default) : null;
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable6 != null ? measurable6.mo7353measureBRTryo0(m8545copyZbe2FdA$default) : null;
        final float f2 = m8553getMaxHeightimpl * f;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.TimePickerKt$CircularLayout$1$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable.this, arrayList4, mo7353measureBRTryo02, j, f2, size5, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable placeable, java.util.List list, androidx.compose.ui.layout.Placeable placeable2, long j, float f, float f2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Placeable placeable3 = (androidx.compose.ui.layout.Placeable) list.get(i);
            int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) / 2;
            int width = placeable3.getWidth() / 2;
            int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) / 2;
            int height = placeable3.getHeight() / 2;
            double d = f;
            double d2 = (i * f2) - 1.5707963267948966d;
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable3, kotlin.math.MathKt.roundToInt((java.lang.Math.cos(d2) * d) + (m8554getMaxWidthimpl - width)), kotlin.math.MathKt.roundToInt((d * java.lang.Math.sin(d2)) + (m8553getMaxHeightimpl - height)), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable2, (androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j) - placeable2.getWidth()) / 2, (androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j) - placeable2.getHeight()) / 2, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    TimePickerKt$CircularLayout$1$1(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }
}
