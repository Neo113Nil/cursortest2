package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TabRowKt$TabRowImpl$1$2$1 implements androidx.compose.ui.layout.MultiContentMeasurePolicy {
    final /* synthetic */ androidx.compose.material3.TabRowKt$TabRowImpl$1$scope$1$1 getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1663measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.Measurable>> list, long j) {
        androidx.compose.ui.layout.MeasureScope measureScope2 = measureScope;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list.get(0);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list3 = list.get(1);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list4 = list.get(2);
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        int size = list2.size();
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        if (size > 0) {
            intRef.element = m8554getMaxWidthimpl / size;
        }
        int i = 0;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list5 = list2;
        int size2 = list5.size();
        for (int i2 = 0; i2 < size2; i2++) {
            i = java.lang.Integer.valueOf(java.lang.Math.max(list2.get(i2).maxIntrinsicHeight(intRef.element), i.intValue()));
        }
        final int intValue = i.intValue();
        androidx.compose.material3.TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = this.getHighSpeedVideoSizes;
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        int i3 = 0;
        while (i3 < size) {
            arrayList.add(new androidx.compose.material3.TabPosition(androidx.compose.ui.unit.Dp.m8601constructorimpl(i3 * measureScope2.mo1415toDpu2uoSUM(intRef.element)), measureScope2.mo1415toDpu2uoSUM(intRef.element), ((androidx.compose.ui.unit.Dp) kotlin.comparisons.ComparisonsKt.maxOf(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(measureScope2.mo1415toDpu2uoSUM(java.lang.Math.min(list2.get(i3).maxIntrinsicWidth(intValue), intRef.element)) - androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.material3.TabKt.getHorizontalTextPadding() * 2.0f))), androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f)))).m8615unboximpl(), null));
            i3++;
            measureScope2 = measureScope;
            size = size;
        }
        tabRowKt$TabRowImpl$1$scope$1$1.setTabPositions(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
        int size3 = list5.size();
        for (int i4 = 0; i4 < size3; i4++) {
            arrayList2.add(list2.get(i4).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8544copyZbe2FdA(j, intRef.element, intRef.element, intValue, intValue)));
        }
        final java.util.ArrayList arrayList3 = arrayList2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(list3.size());
        int size4 = list3.size();
        for (int i5 = 0; i5 < size4; i5++) {
            arrayList4.add(list3.get(i5).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null)));
        }
        final java.util.ArrayList arrayList5 = arrayList4;
        java.util.ArrayList arrayList6 = new java.util.ArrayList(list4.size());
        int size5 = list4.size();
        for (int i6 = 0; i6 < size5; i6++) {
            arrayList6.add(list4.get(i6).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8544copyZbe2FdA(j, intRef.element, intRef.element, 0, intValue)));
        }
        final java.util.ArrayList arrayList7 = arrayList6;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8554getMaxWidthimpl, intValue, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1.getHighResolutionOutputSizeshNQ4ISI(arrayList3, arrayList5, arrayList7, intRef, intValue, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.util.List list, java.util.List list2, java.util.List list3, kotlin.jvm.internal.Ref.IntRef intRef, int i, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(i2), i2 * intRef.element, 0, 0.0f, 4, null);
        }
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list2.get(i3);
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i - placeable.getHeight(), 0.0f, 4, null);
        }
        int size3 = list3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            androidx.compose.ui.layout.Placeable placeable2 = (androidx.compose.ui.layout.Placeable) list3.get(i4);
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, i - placeable2.getHeight(), 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    TabRowKt$TabRowImpl$1$2$1(androidx.compose.material3.TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1) {
        this.getHighSpeedVideoSizes = tabRowKt$TabRowImpl$1$scope$1$1;
    }
}
