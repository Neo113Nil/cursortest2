package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    public static final androidx.compose.material3.TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1 getHighSpeedVideoSizes = new androidx.compose.material3.TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        int height;
        androidx.compose.ui.layout.MeasureScope measureScope2 = measureScope;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size = list2.size();
        int i = 0;
        while (i < size) {
            androidx.compose.ui.layout.Measurable measurable = list.get(i);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), "title")) {
                int size2 = list2.size();
                int i2 = 0;
                while (i2 < size2) {
                    androidx.compose.ui.layout.Measurable measurable2 = list.get(i2);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), "timePickerContent")) {
                        int size3 = list2.size();
                        int i3 = 0;
                        while (i3 < size3) {
                            androidx.compose.ui.layout.Measurable measurable3 = list.get(i3);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable3), com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY)) {
                                final int i4 = measureScope2.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f));
                                final int i5 = measureScope2.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(384.0f));
                                final int i6 = measureScope2.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f));
                                final int i7 = measureScope2.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f));
                                final int i8 = measureScope2.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f));
                                final int i9 = measureScope2.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f));
                                final int i10 = measureScope2.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f));
                                int i11 = measureScope2.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f));
                                final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable2.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                                final boolean z = mo7353measureBRTryo0.getWidth() > mo7353measureBRTryo0.getHeight() && ((float) mo7353measureBRTryo0.getHeight()) >= kotlin.math.MathKt.truncate(measureScope2.mo1418toPx0680j_4(androidx.compose.material3.TimePickerKt.getClockDialMinContainerSize()));
                                final int width = mo7353measureBRTryo0.getWidth() + (i4 * 2);
                                final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable3.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, mo7353measureBRTryo0.getWidth(), 0, 0, 8, null));
                                final androidx.compose.ui.layout.Placeable mo7353measureBRTryo03 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, mo7353measureBRTryo0.getWidth(), 0, 0, 8, null));
                                if (z) {
                                    int height2 = mo7353measureBRTryo0.getHeight() + mo7353measureBRTryo02.getHeight() + i9 + i7 + i8;
                                    if (androidx.compose.ui.unit.Constraints.m8549getHasBoundedHeightimpl(j)) {
                                        height2 = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
                                    }
                                    height = height2;
                                } else {
                                    height = mo7353measureBRTryo03.getHeight() + i10 + mo7353measureBRTryo0.getHeight() + mo7353measureBRTryo02.getHeight() + i11;
                                }
                                final int i12 = height;
                                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, width, height, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.compose.material3.TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1.getHighResolutionOutputSizeshNQ4ISI(z, i7, mo7353measureBRTryo0, i8, mo7353measureBRTryo02, i9, i12, i5, measureScope, mo7353measureBRTryo03, i6, i4, i10, width, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                                    }
                                }, 4, null);
                            }
                            i3++;
                            measureScope2 = measureScope;
                        }
                        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new kotlin.KotlinNothingValueException();
                    }
                    i2++;
                    measureScope2 = measureScope;
                }
                androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new kotlin.KotlinNothingValueException();
            }
            i++;
            measureScope2 = measureScope;
        }
        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(boolean z, int i, androidx.compose.ui.layout.Placeable placeable, int i2, androidx.compose.ui.layout.Placeable placeable2, int i3, int i4, int i5, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Placeable placeable3, int i6, int i7, int i8, int i9, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        if (z) {
            int height = placeable.getHeight();
            int height2 = placeable2.getHeight();
            int i10 = i4 >= i5 ? measureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)) : 0;
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable3, i6, i6, 0.0f, 4, null);
            int i11 = (i4 - ((((i + height) + i2) + height2) + i3)) / 2;
            int i12 = i + i11;
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, i7, i12, 0.0f, 4, null);
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable2, i7, (((i12 + placeable.getHeight()) + i2) - i10) + i11, 0.0f, 4, null);
        } else {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable3, i6, i8, 0.0f, 4, null);
            int width = (i9 - placeable.getWidth()) / 2;
            int height3 = i8 + placeable3.getHeight();
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, width, height3, 0.0f, 4, null);
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable2, (i9 - placeable2.getWidth()) / 2, height3 + placeable.getHeight(), 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1() {
    }
}
