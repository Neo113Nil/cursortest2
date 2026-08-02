package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SnackbarKt$OneRowSnackbar$2$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        float f;
        float f2;
        float f3;
        int i;
        final int i2;
        final int height;
        float f4;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.Measurable measurable = list.get(i3);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), str)) {
                final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
                int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
                int width = mo7353measureBRTryo0.getWidth();
                f = androidx.compose.material.SnackbarKt.getInputFormats;
                int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast((m8554getMaxWidthimpl - width) - measureScope.mo1412roundToPx0680j_4(f), androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j));
                java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    androidx.compose.ui.layout.Measurable measurable2 = list.get(i4);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), str2)) {
                        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable2.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, coerceAtLeast, 0, 0, 9, null));
                        int i5 = mo7353measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                        int i6 = mo7353measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                        boolean z = true;
                        boolean z2 = (i5 == Integer.MIN_VALUE || i6 == Integer.MIN_VALUE) ? false : true;
                        if (i5 != i6 && z2) {
                            z = false;
                        }
                        int m8554getMaxWidthimpl2 = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
                        int width2 = mo7353measureBRTryo0.getWidth();
                        if (z) {
                            f4 = androidx.compose.material.SnackbarKt.getHighSpeedVideoSizesFor;
                            i = java.lang.Math.max(measureScope.mo1412roundToPx0680j_4(f4), mo7353measureBRTryo0.getHeight());
                            int height2 = (i - mo7353measureBRTryo02.getHeight()) / 2;
                            int i7 = mo7353measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                            height = i7 != Integer.MIN_VALUE ? (i5 + height2) - i7 : 0;
                            i2 = height2;
                        } else {
                            f2 = androidx.compose.material.SnackbarKt.getHighSpeedVideoSizes;
                            int i8 = measureScope.mo1412roundToPx0680j_4(f2) - i5;
                            f3 = androidx.compose.material.SnackbarKt.getOutputFormats;
                            int max = java.lang.Math.max(measureScope.mo1412roundToPx0680j_4(f3), mo7353measureBRTryo02.getHeight() + i8);
                            i = max;
                            i2 = i8;
                            height = (max - mo7353measureBRTryo0.getHeight()) / 2;
                        }
                        final int i9 = m8554getMaxWidthimpl2 - width2;
                        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), i, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1.getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable.this, i2, mo7353measureBRTryo0, i9, height, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                            }
                        }, 4, null);
                    }
                }
                androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new kotlin.KotlinNothingValueException();
            }
        }
        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable placeable, int i, androidx.compose.ui.layout.Placeable placeable2, int i2, int i3, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i, 0.0f, 4, null);
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2, i3, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    SnackbarKt$OneRowSnackbar$2$1(java.lang.String str, java.lang.String str2) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = str2;
    }
}
