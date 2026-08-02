package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    public static final androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 getHighSpeedVideoFpsRanges = new androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Measurable measurable = list.get(i);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, measureScope.mo1412roundToPx0680j_4(androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.m5113getPeriodSelectorOutlineWidthD9Ej5fM()), 0, 0, 12, null));
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    androidx.compose.ui.layout.Measurable measurable2 = list.get(i2);
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                        arrayList.add(measurable2);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
                int size3 = arrayList2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    arrayList3.add(((androidx.compose.ui.layout.Measurable) arrayList2.get(i3)).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) / 2, 0, 0, 12, null)));
                }
                final java.util.ArrayList arrayList4 = arrayList3;
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.getHighResolutionOutputSizeshNQ4ISI(arrayList4, mo7353measureBRTryo0, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                    }
                }, 4, null);
            }
        }
        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.util.List list, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(0), 0, 0, 0.0f, 4, null);
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(1), ((androidx.compose.ui.layout.Placeable) list.get(0)).getWidth(), 0, 0.0f, 4, null);
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, ((androidx.compose.ui.layout.Placeable) list.get(0)).getWidth() - (placeable.getWidth() / 2), 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1() {
    }
}
