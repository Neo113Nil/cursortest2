package com.paypal.pds.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final class ButtonGroupKt$AdaptiveButtonLayout$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ com.paypal.pds.components.ButtonGroupAlignment getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;

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

    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        int i;
        int i2;
        int intValue;
        kotlin.Pair pair;
        final java.util.ArrayList arrayList;
        int i3;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measureScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ButtonGroupKt$AdaptiveButtonLayout$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.components.ButtonGroupKt$AdaptiveButtonLayout$1$1.getHighSpeedVideoSizes((androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }
        int size = list.size();
        int i5 = measureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRangesFor);
        final java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(java.lang.Integer.valueOf(((androidx.compose.ui.layout.Measurable) it.next()).maxIntrinsicWidth(Integer.MAX_VALUE)));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        com.paypal.pds.components.ButtonGroupAlignment buttonGroupAlignment = this.getHighSpeedVideoFpsRanges;
        if (kotlin.jvm.internal.Intrinsics.areEqual(buttonGroupAlignment, com.paypal.pds.components.ButtonGroupAlignment.Horizontal.INSTANCE)) {
            java.util.Iterator it2 = arrayList4.iterator();
            if (!it2.hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            int intValue2 = ((java.lang.Number) it2.next()).intValue();
            while (it2.hasNext()) {
                int intValue3 = ((java.lang.Number) it2.next()).intValue();
                if (intValue2 < intValue3) {
                    intValue2 = intValue3;
                }
            }
            i2 = intValue2 * size;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(buttonGroupAlignment, com.paypal.pds.components.ButtonGroupAlignment.Hug.INSTANCE)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(buttonGroupAlignment, com.paypal.pds.components.ButtonGroupAlignment.Vertical.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                i = Integer.MAX_VALUE;
                if (i > androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, com.paypal.pds.components.ButtonGroupAlignment.Hug.INSTANCE)) {
                        pair = kotlin.TuplesKt.to(0, Integer.MAX_VALUE);
                    } else {
                        if (androidx.compose.ui.unit.Constraints.m8552getHasFixedWidthimpl(j)) {
                            intValue = (androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) - ((size - 1) * i5)) / size;
                        } else {
                            java.util.Iterator it3 = arrayList4.iterator();
                            if (!it3.hasNext()) {
                                throw new java.util.NoSuchElementException();
                            }
                            intValue = ((java.lang.Number) it3.next()).intValue();
                            while (it3.hasNext()) {
                                int intValue4 = ((java.lang.Number) it3.next()).intValue();
                                if (intValue < intValue4) {
                                    intValue = intValue4;
                                }
                            }
                        }
                        pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue));
                    }
                    int intValue5 = ((java.lang.Number) pair.component1()).intValue();
                    int intValue6 = ((java.lang.Number) pair.component2()).intValue();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    java.util.Iterator<T> it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(((androidx.compose.ui.layout.Measurable) it4.next()).mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.Constraints(intValue5, intValue6, androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j))));
                    }
                    arrayList = arrayList5;
                    i3 = 0;
                    i4 = 0;
                    int i6 = 0;
                    for (java.lang.Object obj : arrayList) {
                        if (i6 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) obj;
                        if (i6 > 0) {
                            i3 += i5;
                        }
                        arrayList2.add(kotlin.TuplesKt.to(java.lang.Integer.valueOf(i3), 0));
                        i3 += placeable.getMeasuredWidth();
                        i4 = java.lang.Math.max(placeable.getMeasuredHeight(), i4);
                        i6++;
                    }
                } else {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    java.util.Iterator<T> it5 = list2.iterator();
                    while (it5.hasNext()) {
                        arrayList6.add(((androidx.compose.ui.layout.Measurable) it5.next()).mo7353measureBRTryo0(j));
                    }
                    arrayList = arrayList6;
                    i3 = 0;
                    i4 = 0;
                    int i7 = 0;
                    for (java.lang.Object obj2 : arrayList) {
                        if (i7 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        androidx.compose.ui.layout.Placeable placeable2 = (androidx.compose.ui.layout.Placeable) obj2;
                        if (i7 > 0) {
                            i4 += i5;
                        }
                        arrayList2.add(kotlin.TuplesKt.to(0, java.lang.Integer.valueOf(i4)));
                        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
                        i4 += placeable2.getMeasuredHeight();
                        i7++;
                        i3 = m8554getMaxWidthimpl;
                    }
                }
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, kotlin.ranges.RangesKt.coerceIn(i3, androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j)), kotlin.ranges.RangesKt.coerceIn(i4, androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j)), null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ButtonGroupKt$AdaptiveButtonLayout$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return com.paypal.pds.components.ButtonGroupKt$AdaptiveButtonLayout$1$1.getHighSpeedVideoSizes(arrayList2, arrayList, (androidx.compose.ui.layout.Placeable.PlacementScope) obj3);
                    }
                }, 4, null);
            }
            java.util.Iterator it6 = arrayList4.iterator();
            i2 = 0;
            while (it6.hasNext()) {
                i2 += ((java.lang.Number) it6.next()).intValue();
            }
        }
        i = i2 + ((size - 1) * i5);
        if (i > androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j)) {
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, kotlin.ranges.RangesKt.coerceIn(i3, androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j)), kotlin.ranges.RangesKt.coerceIn(i4, androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j)), null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ButtonGroupKt$AdaptiveButtonLayout$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return com.paypal.pds.components.ButtonGroupKt$AdaptiveButtonLayout$1$1.getHighSpeedVideoSizes(arrayList2, arrayList, (androidx.compose.ui.layout.Placeable.PlacementScope) obj3);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.util.ArrayList arrayList, java.util.List list, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementScope, "");
        int i = 0;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.Pair pair = (kotlin.Pair) obj;
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(i), ((java.lang.Number) pair.component1()).intValue(), ((java.lang.Number) pair.component2()).intValue(), 0.0f, 4, null);
            i++;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementScope, "");
        return kotlin.Unit.INSTANCE;
    }

    ButtonGroupKt$AdaptiveButtonLayout$1$1(float f, com.paypal.pds.components.ButtonGroupAlignment buttonGroupAlignment) {
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighSpeedVideoFpsRanges = buttonGroupAlignment;
    }
}
