package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SnackbarKt$OneRowSnackbar$2$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        float f;
        androidx.compose.ui.layout.Measurable measurable;
        androidx.compose.ui.layout.Measurable measurable2;
        int i;
        float f2;
        int i2;
        int max;
        int height;
        int i3;
        final int i4;
        final int i5;
        int i6;
        float f3;
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        f = androidx.compose.material3.SnackbarKt.getHighSpeedVideoFpsRangesFor;
        int min = java.lang.Math.min(m8554getMaxWidthimpl, measureScope.mo1412roundToPx0680j_4(f));
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i7);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), str)) {
                break;
            }
            i7++;
        }
        androidx.compose.ui.layout.Measurable measurable3 = measurable;
        androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable3 != null ? measurable3.mo7353measureBRTryo0(j) : null;
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        int size2 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i8);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), str2)) {
                break;
            }
            i8++;
        }
        androidx.compose.ui.layout.Measurable measurable4 = measurable2;
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable4 != null ? measurable4.mo7353measureBRTryo0(j) : null;
        int width = mo7353measureBRTryo0 != null ? mo7353measureBRTryo0.getWidth() : 0;
        int height2 = mo7353measureBRTryo0 != null ? mo7353measureBRTryo0.getHeight() : 0;
        int width2 = mo7353measureBRTryo02 != null ? mo7353measureBRTryo02.getWidth() : 0;
        int height3 = mo7353measureBRTryo02 != null ? mo7353measureBRTryo02.getHeight() : 0;
        if (width2 == 0) {
            f3 = androidx.compose.material3.SnackbarKt.getOutputMinFrameDuration;
            i = measureScope.mo1412roundToPx0680j_4(f3);
        } else {
            i = 0;
        }
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(((min - width) - width2) - i, androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j));
        java.lang.String str3 = this.getHighSpeedVideoSizes;
        int size3 = list2.size();
        int i9 = 0;
        while (i9 < size3) {
            androidx.compose.ui.layout.Measurable measurable5 = list.get(i9);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable5), str3)) {
                int i10 = height3;
                final androidx.compose.ui.layout.Placeable mo7353measureBRTryo03 = measurable5.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, coerceAtLeast, 0, 0, 9, null));
                int i11 = mo7353measureBRTryo03.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                int i12 = mo7353measureBRTryo03.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                boolean z = true;
                boolean z2 = (i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE) ? false : true;
                if (i11 != i12 && z2) {
                    z = false;
                }
                final int i13 = min - width2;
                if (!z) {
                    f2 = androidx.compose.material3.SnackbarKt.Camera2StreamConfigurationMap;
                    i2 = measureScope.mo1412roundToPx0680j_4(f2) - i11;
                    max = java.lang.Math.max(measureScope.mo1412roundToPx0680j_4(androidx.compose.material3.tokens.SnackbarTokens.INSTANCE.m5039getTwoLinesContainerHeightD9Ej5fM()), mo7353measureBRTryo03.getHeight() + i2);
                    if (mo7353measureBRTryo0 != null) {
                        height = (max - mo7353measureBRTryo0.getHeight()) / 2;
                        i5 = height;
                        i4 = i2;
                        i3 = max;
                    }
                    i3 = max;
                    i4 = i2;
                    i5 = 0;
                } else {
                    max = java.lang.Math.max(measureScope.mo1412roundToPx0680j_4(androidx.compose.material3.tokens.SnackbarTokens.INSTANCE.m5038getSingleLineContainerHeightD9Ej5fM()), java.lang.Math.max(height2, i10));
                    i2 = (max - mo7353measureBRTryo03.getHeight()) / 2;
                    if (mo7353measureBRTryo0 != null && (i6 = mo7353measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline())) != Integer.MIN_VALUE) {
                        height = (i11 + i2) - i6;
                        i5 = height;
                        i4 = i2;
                        i3 = max;
                    }
                    i3 = max;
                    i4 = i2;
                    i5 = 0;
                }
                final int height4 = mo7353measureBRTryo02 != null ? (i3 - mo7353measureBRTryo02.getHeight()) / 2 : 0;
                final int i14 = i13 - width;
                final androidx.compose.ui.layout.Placeable placeable = mo7353measureBRTryo0;
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, min, i3, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1.getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable.this, i4, mo7353measureBRTryo02, i13, height4, placeable, i14, i5, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                    }
                }, 4, null);
            }
            i9++;
            height3 = height3;
        }
        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable placeable, int i, androidx.compose.ui.layout.Placeable placeable2, int i2, int i3, androidx.compose.ui.layout.Placeable placeable3, int i4, int i5, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i, 0.0f, 4, null);
        if (placeable2 != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2, i3, 0.0f, 4, null);
        }
        if (placeable3 != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i4, i5, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    SnackbarKt$OneRowSnackbar$2$1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoSizes = str3;
    }
}
