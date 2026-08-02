package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 implements androidx.compose.ui.layout.MultiContentMeasurePolicy {
    final /* synthetic */ androidx.compose.material.BottomSheetState Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Float> getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1663measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.Measurable>> list, long j) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list.get(0);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list3 = list.get(1);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list4 = list.get(2);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list5 = list.get(3);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list6 = list.get(4);
        final int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        final int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
        long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
        int size = list4.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list4.get(i).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(list2.size());
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList3.add(list2.get(i2).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
        }
        final java.util.ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList4.get(0);
            int height = ((androidx.compose.ui.layout.Placeable) obj).getHeight();
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(arrayList4);
            if (lastIndex > 0) {
                int i3 = 1;
                while (true) {
                    java.lang.Object obj6 = arrayList4.get(i3);
                    int height2 = ((androidx.compose.ui.layout.Placeable) obj6).getHeight();
                    if (height < height2) {
                        height = height2;
                        obj = obj6;
                    }
                    if (i3 == lastIndex) {
                        break;
                    }
                    i3++;
                }
            }
        }
        androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) obj;
        final int height3 = placeable != null ? placeable.getHeight() : 0;
        long m8545copyZbe2FdA$default2 = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(m8545copyZbe2FdA$default, 0, 0, 0, m8553getMaxHeightimpl - height3, 7, null);
        java.util.ArrayList arrayList5 = new java.util.ArrayList(list3.size());
        int size3 = list3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            arrayList5.add(list3.get(i4).mo7353measureBRTryo0(m8545copyZbe2FdA$default2));
        }
        final java.util.ArrayList arrayList6 = arrayList5;
        java.util.ArrayList arrayList7 = new java.util.ArrayList(list5.size());
        int size4 = list5.size();
        for (int i5 = 0; i5 < size4; i5++) {
            arrayList7.add(list5.get(i5).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
        }
        final java.util.ArrayList arrayList8 = arrayList7;
        if (arrayList8.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList8.get(0);
            int width = ((androidx.compose.ui.layout.Placeable) obj2).getWidth();
            int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(arrayList8);
            if (lastIndex2 > 0) {
                int i6 = 1;
                while (true) {
                    java.lang.Object obj7 = arrayList8.get(i6);
                    int width2 = ((androidx.compose.ui.layout.Placeable) obj7).getWidth();
                    if (width < width2) {
                        obj2 = obj7;
                        width = width2;
                    }
                    if (i6 == lastIndex2) {
                        break;
                    }
                    i6++;
                }
            }
        }
        androidx.compose.ui.layout.Placeable placeable2 = (androidx.compose.ui.layout.Placeable) obj2;
        final int width3 = placeable2 != null ? placeable2.getWidth() : 0;
        if (arrayList8.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList8.get(0);
            int height4 = ((androidx.compose.ui.layout.Placeable) obj3).getHeight();
            int lastIndex3 = kotlin.collections.CollectionsKt.getLastIndex(arrayList8);
            if (lastIndex3 > 0) {
                int i7 = 1;
                while (true) {
                    java.lang.Object obj8 = arrayList8.get(i7);
                    int height5 = ((androidx.compose.ui.layout.Placeable) obj8).getHeight();
                    if (height4 < height5) {
                        obj3 = obj8;
                        height4 = height5;
                    }
                    if (i7 == lastIndex3) {
                        break;
                    }
                    i7++;
                }
            }
        }
        androidx.compose.ui.layout.Placeable placeable3 = (androidx.compose.ui.layout.Placeable) obj3;
        final int height6 = placeable3 != null ? placeable3.getHeight() : 0;
        java.util.ArrayList arrayList9 = new java.util.ArrayList(list6.size());
        int size5 = list6.size();
        for (int i8 = 0; i8 < size5; i8++) {
            arrayList9.add(list6.get(i8).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
        }
        final java.util.ArrayList arrayList10 = arrayList9;
        if (arrayList10.isEmpty()) {
            obj4 = null;
        } else {
            obj4 = arrayList10.get(0);
            int width4 = ((androidx.compose.ui.layout.Placeable) obj4).getWidth();
            int lastIndex4 = kotlin.collections.CollectionsKt.getLastIndex(arrayList10);
            if (lastIndex4 > 0) {
                int i9 = 1;
                while (true) {
                    java.lang.Object obj9 = arrayList10.get(i9);
                    int width5 = ((androidx.compose.ui.layout.Placeable) obj9).getWidth();
                    if (width4 < width5) {
                        obj4 = obj9;
                        width4 = width5;
                    }
                    if (i9 == lastIndex4) {
                        break;
                    }
                    i9++;
                }
            }
        }
        androidx.compose.ui.layout.Placeable placeable4 = (androidx.compose.ui.layout.Placeable) obj4;
        final int width6 = placeable4 != null ? placeable4.getWidth() : 0;
        if (arrayList10.isEmpty()) {
            obj5 = null;
        } else {
            obj5 = arrayList10.get(0);
            int height7 = ((androidx.compose.ui.layout.Placeable) obj5).getHeight();
            int lastIndex5 = kotlin.collections.CollectionsKt.getLastIndex(arrayList10);
            if (lastIndex5 > 0) {
                int i10 = height7;
                int i11 = 1;
                while (true) {
                    java.lang.Object obj10 = arrayList10.get(i11);
                    int height8 = ((androidx.compose.ui.layout.Placeable) obj10).getHeight();
                    if (i10 < height8) {
                        obj5 = obj10;
                        i10 = height8;
                    }
                    if (i11 == lastIndex5) {
                        break;
                    }
                    i11++;
                }
            }
        }
        androidx.compose.ui.layout.Placeable placeable5 = (androidx.compose.ui.layout.Placeable) obj5;
        final int height9 = placeable5 != null ? placeable5.getHeight() : 0;
        final kotlin.jvm.functions.Function0<java.lang.Float> function0 = this.getHighSpeedVideoFpsRanges;
        final int i12 = this.getHighResolutionOutputSizeshNQ4ISI;
        final float f = this.getHighSpeedVideoSizes;
        final androidx.compose.material.BottomSheetState bottomSheetState = this.Camera2StreamConfigurationMap;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8554getMaxWidthimpl, m8553getMaxHeightimpl, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj11) {
                return androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.getHighSpeedVideoSizes(kotlin.jvm.functions.Function0.this, i12, measureScope, m8554getMaxWidthimpl, width3, f, height6, width6, bottomSheetState, height9, m8553getMaxHeightimpl, arrayList6, arrayList4, arrayList2, arrayList8, arrayList10, height3, (androidx.compose.ui.layout.Placeable.PlacementScope) obj11);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.ui.layout.MeasureScope measureScope, int i2, int i3, float f, int i4, int i5, androidx.compose.material.BottomSheetState bottomSheetState, int i6, int i7, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, int i8, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        float f2;
        int i9;
        int i10;
        int i11;
        float f3;
        float f4;
        int roundToInt = kotlin.math.MathKt.roundToInt(((java.lang.Number) function0.invoke()).floatValue());
        if (androidx.compose.material.FabPosition.m2629equalsimpl0(i, androidx.compose.material.FabPosition.INSTANCE.m2635getStart5ygKITE())) {
            f4 = androidx.compose.material.BottomSheetScaffoldKt.getHighSpeedVideoSizes;
            i9 = measureScope.mo1412roundToPx0680j_4(f4);
        } else if (androidx.compose.material.FabPosition.m2629equalsimpl0(i, androidx.compose.material.FabPosition.INSTANCE.m2633getCenter5ygKITE())) {
            i9 = (i2 - i3) / 2;
        } else {
            f2 = androidx.compose.material.BottomSheetScaffoldKt.getHighSpeedVideoSizes;
            i9 = (i2 - i3) - measureScope.mo1412roundToPx0680j_4(f2);
        }
        int i12 = i4 / 2;
        if (measureScope.mo1418toPx0680j_4(f) < i12) {
            f3 = androidx.compose.material.BottomSheetScaffoldKt.getHighSpeedVideoSizes;
            i10 = (roundToInt - i4) - measureScope.mo1412roundToPx0680j_4(f3);
        } else {
            i10 = roundToInt - i12;
        }
        int i13 = (i2 - i5) / 2;
        int i14 = androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.WhenMappings.$EnumSwitchMapping$0[bottomSheetState.getCurrentValue().ordinal()];
        if (i14 == 1) {
            i11 = i10 - i6;
        } else {
            if (i14 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            i11 = i7 - i6;
        }
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(i15), 0, i8, 0.0f, 4, null);
        }
        int size2 = list2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list2.get(i16), 0, 0, 0.0f, 4, null);
        }
        int size3 = list3.size();
        for (int i17 = 0; i17 < size3; i17++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list3.get(i17), 0, 0, 0.0f, 4, null);
        }
        int size4 = list4.size();
        for (int i18 = 0; i18 < size4; i18++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list4.get(i18), i9, i10, 0.0f, 4, null);
        }
        int size5 = list5.size();
        for (int i19 = 0; i19 < size5; i19++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list5.get(i19), i13, i11, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.material.BottomSheetValue.values().length];
            try {
                iArr[androidx.compose.material.BottomSheetValue.Collapsed.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.material.BottomSheetValue.Expanded.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(kotlin.jvm.functions.Function0<java.lang.Float> function0, int i, float f, androidx.compose.material.BottomSheetState bottomSheetState) {
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = f;
        this.Camera2StreamConfigurationMap = bottomSheetState;
    }
}
