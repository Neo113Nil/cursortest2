package com.paypal.oslo.feature.helpcenter.ui.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class HelpCenterTopBarKt$HelpCenterTopBar$1$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ float Camera2StreamConfigurationMap;

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
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, final long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measureScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        final int i = measureScope.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap);
        long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (androidx.compose.ui.layout.Measurable measurable : list2) {
            kotlin.Pair pair = kotlin.TuplesKt.to(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), measurable.mo7353measureBRTryo0(m8545copyZbe2FdA$default));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), i, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.HelpCenterTopBarKt$HelpCenterTopBar$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.helpcenter.ui.components.HelpCenterTopBarKt$HelpCenterTopBar$1$1$1.getHighSpeedVideoFpsRangesFor(linkedHashMap, i, j, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.util.Map map, int i, long j, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementScope, "");
        androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) map.get("back");
        if (placeable != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, (i - placeable.getHeight()) / 2, 0.0f, 4, null);
        }
        androidx.compose.ui.layout.Placeable placeable2 = (androidx.compose.ui.layout.Placeable) map.get("title");
        if (placeable2 != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable2, (androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) - placeable2.getWidth()) / 2, (i - placeable2.getHeight()) / 2, 0.0f, 4, null);
        }
        androidx.compose.ui.layout.Placeable placeable3 = (androidx.compose.ui.layout.Placeable) map.get("home");
        if (placeable3 != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable3, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) - placeable3.getWidth(), (i - placeable3.getHeight()) / 2, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    HelpCenterTopBarKt$HelpCenterTopBar$1$1$1(float f) {
        this.Camera2StreamConfigurationMap = f;
    }
}
