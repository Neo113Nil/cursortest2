package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SearchBarKt$DockedSearchBarLayout$2$2$1 implements androidx.compose.ui.layout.MultiContentMeasurePolicy {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.SearchBarState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1663measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.Measurable>> list, long j) {
        java.lang.Integer valueOf;
        java.lang.Integer valueOf2;
        java.lang.Integer valueOf3;
        java.lang.Integer valueOf4;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list.get(0);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list3 = list.get(1);
        int lerp = androidx.compose.ui.util.MathHelpersKt.lerp(androidx.compose.material3.SearchBarKt.access$getCollapsedBounds(this.getHighResolutionOutputSizeshNQ4ISI).getHeight(), measureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRangesFor), this.getHighResolutionOutputSizeshNQ4ISI.getProgress());
        long m8569constrainN9IONVI = androidx.compose.ui.unit.ConstraintsKt.m8569constrainN9IONVI(j, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, kotlin.ranges.RangesKt.coerceAtMost(measureScope.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap), lerp), lerp, 3, null));
        long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(m8569constrainN9IONVI, 0, 0, 0, 0, 10, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list2.get(i).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList2.get(0)).getWidth());
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(arrayList2);
            if (lastIndex > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer valueOf5 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList2.get(i2)).getWidth());
                    if (valueOf5.compareTo(valueOf) > 0) {
                        valueOf = valueOf5;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        java.lang.Integer num = valueOf;
        int intValue = num != null ? num.intValue() : 0;
        if (arrayList2.isEmpty()) {
            valueOf2 = null;
        } else {
            valueOf2 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList2.get(0)).getHeight());
            int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(arrayList2);
            if (lastIndex2 > 0) {
                int i3 = 1;
                while (true) {
                    java.lang.Integer valueOf6 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList2.get(i3)).getHeight());
                    if (valueOf6.compareTo(valueOf2) > 0) {
                        valueOf2 = valueOf6;
                    }
                    if (i3 == lastIndex2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        java.lang.Integer num2 = valueOf2;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        long m8574offsetNN6EwU$default = androidx.compose.ui.unit.ConstraintsKt.m8574offsetNN6EwU$default(m8545copyZbe2FdA$default, 0, -intValue2, 1, null);
        final int i4 = intValue2;
        long m8545copyZbe2FdA$default2 = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(m8574offsetNN6EwU$default, 0, intValue, 0, 0, 13, null);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(list3.size());
        int size2 = list3.size();
        for (int i5 = 0; i5 < size2; i5++) {
            arrayList3.add(list3.get(i5).mo7353measureBRTryo0(m8545copyZbe2FdA$default2));
        }
        final java.util.ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            valueOf3 = null;
        } else {
            valueOf3 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList4.get(0)).getHeight());
            int lastIndex3 = kotlin.collections.CollectionsKt.getLastIndex(arrayList4);
            if (lastIndex3 > 0) {
                int i6 = 1;
                while (true) {
                    java.lang.Integer valueOf7 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList4.get(i6)).getHeight());
                    if (valueOf7.compareTo(valueOf3) > 0) {
                        valueOf3 = valueOf7;
                    }
                    if (i6 == lastIndex3) {
                        break;
                    }
                    i6++;
                }
            }
        }
        java.lang.Integer num3 = valueOf3;
        int intValue3 = num3 != null ? num3.intValue() : 0;
        if (arrayList4.isEmpty()) {
            valueOf4 = null;
        } else {
            valueOf4 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList4.get(0)).getWidth());
            int lastIndex4 = kotlin.collections.CollectionsKt.getLastIndex(arrayList4);
            if (lastIndex4 > 0) {
                java.lang.Integer num4 = valueOf4;
                int i7 = 1;
                while (true) {
                    java.lang.Integer valueOf8 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList4.get(i7)).getWidth());
                    if (valueOf8.compareTo(num4) > 0) {
                        num4 = valueOf8;
                    }
                    if (i7 == lastIndex4) {
                        break;
                    }
                    i7++;
                }
                valueOf4 = num4;
            }
        }
        java.lang.Integer num5 = valueOf4;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(m8569constrainN9IONVI, java.lang.Math.max(intValue, num5 != null ? num5.intValue() : 0)), androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(m8569constrainN9IONVI, intValue3 + i4), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SearchBarKt$DockedSearchBarLayout$2$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.SearchBarKt$DockedSearchBarLayout$2$2$1.Camera2StreamConfigurationMap(arrayList2, arrayList4, i4, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(java.util.List list, java.util.List list2, int i, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(i2), 0, 0, 0.0f, 4, null);
        }
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, (androidx.compose.ui.layout.Placeable) list2.get(i3), 0, i, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    SearchBarKt$DockedSearchBarLayout$2$2$1(androidx.compose.material3.SearchBarState searchBarState, float f, float f2) {
        this.getHighResolutionOutputSizeshNQ4ISI = searchBarState;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.Camera2StreamConfigurationMap = f2;
    }
}
