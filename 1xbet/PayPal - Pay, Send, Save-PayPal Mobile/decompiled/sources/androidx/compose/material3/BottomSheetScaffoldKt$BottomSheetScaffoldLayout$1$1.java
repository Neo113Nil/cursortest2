package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 implements androidx.compose.ui.layout.MultiContentMeasurePolicy {
    final /* synthetic */ androidx.compose.material3.SheetState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Float> getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1663measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.Measurable>> list, long j) {
        java.lang.Integer valueOf;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list.get(0);
        int i = 1;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list3 = list.get(1);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list4 = list.get(2);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list5 = list.get(3);
        final int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        final int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
        long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
        int size = list4.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(list4.get(i2).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(list2.size());
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList3.add(list2.get(i3).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
        }
        final java.util.ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList4.get(0)).getHeight());
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(arrayList4);
            if (lastIndex > 0) {
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList4.get(i)).getHeight());
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        java.lang.Integer num = valueOf;
        final int intValue = num != null ? num.intValue() : 0;
        long m8545copyZbe2FdA$default2 = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(m8545copyZbe2FdA$default, 0, 0, 0, m8553getMaxHeightimpl - intValue, 7, null);
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
        final androidx.compose.material3.SheetState sheetState = this.getHighSpeedVideoFpsRangesFor;
        final kotlin.jvm.functions.Function0<java.lang.Float> function0 = this.getHighSpeedVideoSizes;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8554getMaxWidthimpl, m8553getMaxHeightimpl, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.getHighSpeedVideoFpsRangesFor(arrayList2, m8554getMaxWidthimpl, arrayList8, sheetState, function0, m8553getMaxHeightimpl, arrayList6, arrayList4, intValue, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.util.List list, int i, java.util.List list2, androidx.compose.material3.SheetState sheetState, kotlin.jvm.functions.Function0 function0, int i2, java.util.List list3, java.util.List list4, int i3, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        java.lang.Integer valueOf;
        java.lang.Integer valueOf2;
        int roundToInt;
        java.lang.Integer num = null;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) list.get(0)).getWidth());
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i4 = 1;
                while (true) {
                    java.lang.Integer valueOf3 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) list.get(i4)).getWidth());
                    if (valueOf3.compareTo(valueOf) > 0) {
                        valueOf = valueOf3;
                    }
                    if (i4 == lastIndex) {
                        break;
                    }
                    i4++;
                }
            }
        }
        java.lang.Integer num2 = valueOf;
        int max = java.lang.Math.max(0, (i - (num2 != null ? num2.intValue() : 0)) / 2);
        if (list2.isEmpty()) {
            valueOf2 = null;
        } else {
            valueOf2 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) list2.get(0)).getWidth());
            int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(list2);
            if (lastIndex2 > 0) {
                int i5 = 1;
                while (true) {
                    java.lang.Integer valueOf4 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) list2.get(i5)).getWidth());
                    if (valueOf4.compareTo(valueOf2) > 0) {
                        valueOf2 = valueOf4;
                    }
                    if (i5 == lastIndex2) {
                        break;
                    }
                    i5++;
                }
            }
        }
        java.lang.Integer num3 = valueOf2;
        int intValue = num3 != null ? num3.intValue() : 0;
        if (!list2.isEmpty()) {
            num = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) list2.get(0)).getHeight());
            int lastIndex3 = kotlin.collections.CollectionsKt.getLastIndex(list2);
            if (lastIndex3 > 0) {
                int i6 = 1;
                while (true) {
                    java.lang.Integer valueOf5 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) list2.get(i6)).getHeight());
                    if (valueOf5.compareTo(num) > 0) {
                        num = valueOf5;
                    }
                    if (i6 == lastIndex3) {
                        break;
                    }
                    i6++;
                }
            }
        }
        java.lang.Integer num4 = num;
        int intValue2 = num4 != null ? num4.intValue() : 0;
        int i7 = (i - intValue) / 2;
        int i8 = androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.WhenMappings.$EnumSwitchMapping$0[sheetState.getCurrentValue().ordinal()];
        if (i8 == 1) {
            roundToInt = kotlin.math.MathKt.roundToInt(((java.lang.Number) function0.invoke()).floatValue()) - intValue2;
        } else {
            if (i8 != 2 && i8 != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            roundToInt = i2 - intValue2;
        }
        int size = list3.size();
        for (int i9 = 0; i9 < size; i9++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list3.get(i9), 0, i3, 0.0f, 4, null);
        }
        int size2 = list4.size();
        for (int i10 = 0; i10 < size2; i10++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list4.get(i10), 0, 0, 0.0f, 4, null);
        }
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(i11), max, 0, 0.0f, 4, null);
        }
        int size4 = list2.size();
        for (int i12 = 0; i12 < size4; i12++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list2.get(i12), i7, roundToInt, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.material3.SheetValue.values().length];
            try {
                iArr[androidx.compose.material3.SheetValue.PartiallyExpanded.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.material3.SheetValue.Expanded.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.material3.SheetValue.Hidden.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(androidx.compose.material3.SheetState sheetState, kotlin.jvm.functions.Function0<java.lang.Float> function0) {
        this.getHighSpeedVideoFpsRangesFor = sheetState;
        this.getHighSpeedVideoSizes = function0;
    }
}
