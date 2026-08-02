package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0012\u001a\u00020\u000f*\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0006\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u00020\u0015*\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0006\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\u00020\u0015*\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0006\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0011\u0010\u001c\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d"}, d2 = {"Landroidx/compose/material3/StartIconMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function0;", "", "p0", "Landroidx/compose/ui/unit/Dp;", "p1", "p2", "p3", "<init>", "(Lkotlin/jvm/functions/Function0;FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "maxIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "maxIntrinsicHeight", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class StartIconMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Float> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    private StartIconMeasurePolicy(kotlin.jvm.functions.Function0<java.lang.Float> function0, float f, float f2, float f3) {
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighSpeedVideoSizes = f2;
        this.Camera2StreamConfigurationMap = f3;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        androidx.compose.ui.layout.MeasureScope measureScope2 = measureScope;
        float floatValue = this.getHighSpeedVideoFpsRanges.invoke().floatValue();
        long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size = list2.size();
        int i = 0;
        while (i < size) {
            androidx.compose.ui.layout.Measurable measurable = list.get(i);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), "icon")) {
                androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(m8545copyZbe2FdA$default);
                int size2 = list2.size();
                int i2 = 0;
                while (i2 < size2) {
                    androidx.compose.ui.layout.Measurable measurable2 = list.get(i2);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), "label")) {
                        androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable2.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8574offsetNN6EwU$default(m8545copyZbe2FdA$default, -(mo7353measureBRTryo0.getWidth() + measureScope2.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap)), 0, 2, null));
                        int width = mo7353measureBRTryo0.getWidth() + mo7353measureBRTryo02.getWidth() + measureScope2.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(this.Camera2StreamConfigurationMap + androidx.compose.ui.unit.Dp.m8601constructorimpl(this.getHighSpeedVideoFpsRangesFor * 2.0f)));
                        int max = java.lang.Math.max(mo7353measureBRTryo0.getHeight(), mo7353measureBRTryo02.getHeight()) + measureScope2.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(this.getHighSpeedVideoSizes * 2.0f));
                        int roundToInt = kotlin.math.MathKt.roundToInt(width * floatValue);
                        int size3 = list2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            androidx.compose.ui.layout.Measurable measurable3 = list.get(i3);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                androidx.compose.ui.layout.Placeable mo7353measureBRTryo03 = measurable3.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8569constrainN9IONVI(m8545copyZbe2FdA$default, androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(width, max)));
                                int size4 = list2.size();
                                for (int i4 = 0; i4 < size4; i4++) {
                                    androidx.compose.ui.layout.Measurable measurable4 = list.get(i4);
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable4), "indicator")) {
                                        return androidx.compose.material3.NavigationItemKt.m3553access$placeLabelAndStartIconnru01g4(measureScope, mo7353measureBRTryo02, mo7353measureBRTryo0, mo7353measureBRTryo03, measurable4.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8569constrainN9IONVI(m8545copyZbe2FdA$default, androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(roundToInt, max))), j, this.Camera2StreamConfigurationMap);
                                    }
                                }
                                androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                                throw new kotlin.KotlinNothingValueException();
                            }
                        }
                        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new kotlin.KotlinNothingValueException();
                    }
                    i2++;
                    measureScope2 = measureScope;
                }
                androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new kotlin.KotlinNothingValueException();
            }
            i++;
            measureScope2 = measureScope;
        }
        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = list.get(i2);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material3.internal.LayoutUtilKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i);
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = list.get(i3);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material3.internal.LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        return maxIntrinsicWidth + intrinsicMeasurable2.maxIntrinsicWidth(i) + intrinsicMeasureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(this.getHighSpeedVideoFpsRangesFor * 2.0f) + this.Camera2StreamConfigurationMap));
                    }
                }
                androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new kotlin.KotlinNothingValueException();
            }
        }
        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = list.get(i2);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material3.internal.LayoutUtilKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i);
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = list.get(i3);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material3.internal.LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        return java.lang.Math.max(maxIntrinsicHeight, intrinsicMeasurable2.maxIntrinsicHeight(i)) + intrinsicMeasureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(this.getHighSpeedVideoSizes * 2.0f));
                    }
                }
                androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new kotlin.KotlinNothingValueException();
            }
        }
        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    public /* synthetic */ StartIconMeasurePolicy(kotlin.jvm.functions.Function0 function0, float f, float f2, float f3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, f, f2, f3);
    }
}
