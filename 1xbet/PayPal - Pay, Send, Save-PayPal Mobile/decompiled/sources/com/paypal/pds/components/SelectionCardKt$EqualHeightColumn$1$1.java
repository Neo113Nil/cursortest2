package com.paypal.pds.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final class SelectionCardKt$EqualHeightColumn$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
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
        java.lang.Integer num;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measureScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        java.util.Iterator<T> it = list2.iterator();
        if (it.hasNext()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Measurable) it.next()).maxIntrinsicHeight(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j)));
            while (it.hasNext()) {
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Measurable) it.next()).maxIntrinsicHeight(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j)));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        java.lang.Integer num2 = num;
        int intValue = num2 != null ? num2.intValue() : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((androidx.compose.ui.layout.Measurable) it2.next()).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), intValue)));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        java.util.Iterator it3 = arrayList2.iterator();
        int i = 0;
        while (it3.hasNext()) {
            i += ((androidx.compose.ui.layout.Placeable) it3.next()).getHeight();
        }
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i + (this.getHighSpeedVideoSizes * (arrayList2.size() - 1)), 0);
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        final int i2 = this.getHighSpeedVideoSizes;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8554getMaxWidthimpl, coerceAtLeast, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SelectionCardKt$EqualHeightColumn$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.pds.components.SelectionCardKt$EqualHeightColumn$1$1.Camera2StreamConfigurationMap(arrayList2, i2, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(java.util.List list, int i, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementScope, "");
        int i2 = 0;
        int i3 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) obj;
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i3, 0.0f, 4, null);
            i3 += placeable.getHeight();
            if (i2 < kotlin.collections.CollectionsKt.getLastIndex(list)) {
                i3 += i;
            }
            i2++;
        }
        return kotlin.Unit.INSTANCE;
    }

    SelectionCardKt$EqualHeightColumn$1$1(int i) {
        this.getHighSpeedVideoSizes = i;
    }
}
