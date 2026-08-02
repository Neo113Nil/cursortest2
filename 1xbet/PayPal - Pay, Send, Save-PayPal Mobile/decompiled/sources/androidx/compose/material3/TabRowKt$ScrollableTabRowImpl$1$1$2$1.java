package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TabRowKt$ScrollableTabRowImpl$1$1$2$1 implements androidx.compose.ui.layout.MultiContentMeasurePolicy {
    final /* synthetic */ androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$scope$1$1 Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.ScrollableTabData getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ float getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1663measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.Measurable>> list, long j) {
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list.get(0);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list3 = list.get(1);
        final int i = measureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoSizes);
        int size = list2.size();
        int i2 = 0;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list4 = list2;
        int size2 = list4.size();
        for (int i3 = 0; i3 < size2; i3++) {
            i2 = java.lang.Integer.valueOf(java.lang.Math.max(i2.intValue(), list2.get(i3).maxIntrinsicHeight(Integer.MAX_VALUE)));
        }
        final int intValue = i2.intValue();
        long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, measureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRanges), 0, intValue, intValue, 2, null);
        final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
        floatRef.element = this.getHighSpeedVideoSizes;
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
        int size3 = list4.size();
        for (int i4 = 0; i4 < size3; i4++) {
            arrayList.add(list2.get(i4).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        androidx.collection.MutableIntList mutableIntList = new androidx.collection.MutableIntList(0, 1, null);
        int size4 = list4.size();
        for (int i5 = 0; i5 < size4; i5++) {
            mutableIntList.add(list2.get(i5).maxIntrinsicWidth(Integer.MAX_VALUE));
        }
        float f = this.getHighSpeedVideoFpsRanges;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
        int i6 = i * 2;
        for (int i7 = 0; i7 < size; i7++) {
            float m8615unboximpl = ((androidx.compose.ui.unit.Dp) kotlin.comparisons.ComparisonsKt.maxOf(androidx.compose.ui.unit.Dp.m8599boximpl(f), androidx.compose.ui.unit.Dp.m8599boximpl(measureScope.mo1415toDpu2uoSUM(((androidx.compose.ui.layout.Placeable) arrayList2.get(i7)).getWidth())))).m8615unboximpl();
            i6 += measureScope.mo1412roundToPx0680j_4(m8615unboximpl);
            androidx.compose.material3.TabPosition tabPosition = new androidx.compose.material3.TabPosition(floatRef.element, m8615unboximpl, ((androidx.compose.ui.unit.Dp) kotlin.comparisons.ComparisonsKt.maxOf(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(measureScope.mo1415toDpu2uoSUM(mutableIntList.get(i7)) - androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.material3.TabKt.getHorizontalTextPadding() * 2.0f))), androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f)))).m8615unboximpl(), null);
            floatRef.element = androidx.compose.ui.unit.Dp.m8601constructorimpl(floatRef.element + m8615unboximpl);
            arrayList3.add(tabPosition);
        }
        final java.util.ArrayList arrayList4 = arrayList3;
        this.Camera2StreamConfigurationMap.setTabPositions(arrayList4);
        int i8 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(list3.size());
        int size5 = list3.size();
        for (int i9 = 0; i9 < size5; i9++) {
            arrayList5.add(list3.get(i9).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8544copyZbe2FdA(j, 0, measureScope.mo1412roundToPx0680j_4(((androidx.compose.material3.TabPosition) arrayList4.get(i8)).getContentWidth()), 0, intValue)));
        }
        final java.util.ArrayList arrayList6 = arrayList5;
        final float f2 = this.getHighSpeedVideoSizes;
        final androidx.compose.material3.ScrollableTabData scrollableTabData = this.getHighSpeedVideoFpsRangesFor;
        final int i10 = this.getHighResolutionOutputSizeshNQ4ISI;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, i6, intValue, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$1$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$1$2$1.getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.FloatRef.this, f2, arrayList2, arrayList6, scrollableTabData, measureScope, i, arrayList4, i10, intValue, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.FloatRef floatRef, float f, java.util.List list, java.util.List list2, androidx.compose.material3.ScrollableTabData scrollableTabData, androidx.compose.ui.layout.MeasureScope measureScope, int i, java.util.List list3, int i2, int i3, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        floatRef.element = f;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(i4), measureScope.mo1412roundToPx0680j_4(floatRef.element), 0, 0.0f, 4, null);
            floatRef.element = androidx.compose.ui.unit.Dp.m8601constructorimpl(floatRef.element + ((androidx.compose.material3.TabPosition) list3.get(i4)).getWidth());
        }
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list2.get(i5);
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, java.lang.Math.max(0, (measureScope.mo1412roundToPx0680j_4(((androidx.compose.material3.TabPosition) list3.get(i2)).getWidth()) - placeable.getWidth()) / 2), i3 - placeable.getHeight(), 0.0f, 4, null);
        }
        scrollableTabData.Camera2StreamConfigurationMap(measureScope, i, list3, i2);
        return kotlin.Unit.INSTANCE;
    }

    TabRowKt$ScrollableTabRowImpl$1$1$2$1(float f, float f2, androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1, int i, androidx.compose.material3.ScrollableTabData scrollableTabData) {
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRanges = f2;
        this.Camera2StreamConfigurationMap = tabRowKt$ScrollableTabRowImpl$1$scope$1$1;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = scrollableTabData;
    }
}
