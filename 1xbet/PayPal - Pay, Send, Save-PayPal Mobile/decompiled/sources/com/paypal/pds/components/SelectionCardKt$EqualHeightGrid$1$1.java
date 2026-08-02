package com.paypal.pds.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final class SelectionCardKt$EqualHeightGrid$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* bridge */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* bridge */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* bridge */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* bridge */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measureScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        int i = this.getHighSpeedVideoSizes;
        final int i2 = (m8554getMaxWidthimpl - ((i - 1) * this.Camera2StreamConfigurationMap)) / i;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((androidx.compose.ui.layout.Measurable) it.next()).maxIntrinsicHeight(i2)));
        }
        java.util.ArrayList arrayList2 = arrayList;
        int size = list.size();
        int i3 = ((size + r6) - 1) / this.getHighSpeedVideoSizes;
        if (this.getHighSpeedVideoFpsRanges) {
            java.util.ArrayList<java.lang.Number> arrayList3 = arrayList2;
            java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) arrayList3);
            int intValue = num != null ? num.intValue() : 0;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            for (java.lang.Number number : arrayList3) {
                arrayList4.add(java.lang.Integer.valueOf(intValue));
            }
            pair = kotlin.TuplesKt.to(arrayList4, java.lang.Integer.valueOf(intValue * i3));
        } else {
            java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList2);
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = this.getHighSpeedVideoSizes;
                int i7 = i5 * i6;
                java.util.List subList = mutableList.subList(i7, kotlin.ranges.RangesKt.coerceAtMost(i6 + i7, mutableList.size()));
                java.util.List list3 = subList;
                int intValue2 = ((java.lang.Number) kotlin.collections.CollectionsKt.maxOrThrow((java.lang.Iterable<java.lang.Double>) list3)).intValue();
                i4 += intValue2;
                int i8 = 0;
                for (java.lang.Object obj : list3) {
                    if (i8 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    subList.set(i8, java.lang.Integer.valueOf(intValue2));
                    i8++;
                }
            }
            pair = kotlin.TuplesKt.to(mutableList, java.lang.Integer.valueOf(i4));
        }
        final java.util.List list4 = (java.util.List) pair.component1();
        int intValue3 = ((java.lang.Number) pair.component2()).intValue();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i9 = 0;
        for (java.lang.Object obj2 : list2) {
            if (i9 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            arrayList5.add(((androidx.compose.ui.layout.Measurable) obj2).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(i2, ((java.lang.Number) list4.get(i9)).intValue())));
            i9++;
        }
        final java.util.ArrayList arrayList6 = arrayList5;
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(intValue3 + ((i3 - 1) * this.getHighSpeedVideoFpsRangesFor), 0);
        int m8554getMaxWidthimpl2 = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        final int i10 = this.getHighSpeedVideoSizes;
        final int i11 = this.getHighSpeedVideoFpsRangesFor;
        final int i12 = this.Camera2StreamConfigurationMap;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8554getMaxWidthimpl2, coerceAtLeast, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SelectionCardKt$EqualHeightGrid$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return com.paypal.pds.components.SelectionCardKt$EqualHeightGrid$1$1.getHighSpeedVideoFpsRangesFor(arrayList6, i10, list4, i11, i2, i12, (androidx.compose.ui.layout.Placeable.PlacementScope) obj3);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.util.List list, int i, java.util.List list2, int i2, int i3, int i4, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementScope, "");
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (java.lang.Object obj : list) {
            int i8 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) obj, i6, i7, 0.0f, 4, null);
            if (i8 % i == 0) {
                i7 += ((java.lang.Number) list2.get(i5)).intValue() + i2;
                i6 = 0;
            } else {
                i6 += i3 + i4;
            }
            i5 = i8;
        }
        return kotlin.Unit.INSTANCE;
    }

    SelectionCardKt$EqualHeightGrid$1$1(int i, int i2, boolean z, int i3) {
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoFpsRangesFor = i3;
    }
}
