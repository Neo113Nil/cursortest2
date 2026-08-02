package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TabKt$TabBaselineLayout$2$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        final androidx.compose.ui.layout.Placeable placeable;
        final androidx.compose.ui.layout.Placeable placeable2;
        long j2;
        if (this.Camera2StreamConfigurationMap != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.layout.Measurable measurable = list.get(i);
                if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), "text")) {
                    placeable = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                }
            }
            androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
            throw new kotlin.KotlinNothingValueException();
        }
        placeable = null;
        if (this.getHighSpeedVideoSizes != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                androidx.compose.ui.layout.Measurable measurable2 = list.get(i2);
                if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), "icon")) {
                    placeable2 = measurable2.mo7353measureBRTryo0(j);
                }
            }
            androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
            throw new kotlin.KotlinNothingValueException();
        }
        placeable2 = null;
        final int max = java.lang.Math.max(placeable != null ? placeable.getWidth() : 0, placeable2 != null ? placeable2.getWidth() : 0);
        int i3 = measureScope.mo1412roundToPx0680j_4((placeable == null || placeable2 == null) ? androidx.compose.material3.TabKt.getOutputFormats : androidx.compose.material3.TabKt.getHighSpeedVideoSizes);
        int height = placeable2 != null ? placeable2.getHeight() : 0;
        int height2 = placeable != null ? placeable.getHeight() : 0;
        j2 = androidx.compose.material3.TabKt.Camera2StreamConfigurationMap;
        final int max2 = java.lang.Math.max(i3, height + height2 + measureScope.mo1411roundToPxR2X_6o(j2));
        final java.lang.Integer valueOf = placeable != null ? java.lang.Integer.valueOf(placeable.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline())) : null;
        final java.lang.Integer valueOf2 = placeable != null ? java.lang.Integer.valueOf(placeable.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline())) : null;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, max, max2, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.TabKt$TabBaselineLayout$2$1.Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable.this, placeable2, measureScope, max, max2, valueOf, valueOf2, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable placeable2, androidx.compose.ui.layout.MeasureScope measureScope, int i, int i2, java.lang.Integer num, java.lang.Integer num2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        if (placeable != null && placeable2 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(num2);
            androidx.compose.material3.TabKt.access$placeTextAndIcon(placementScope, measureScope, placeable, placeable2, i, i2, intValue, num2.intValue());
        } else if (placeable != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i2 - placeable.getHeight()) / 2, 0.0f, 4, null);
        } else if (placeable2 != null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, (i2 - placeable2.getHeight()) / 2, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    TabKt$TabBaselineLayout$2$1(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22) {
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoSizes = function22;
    }
}
