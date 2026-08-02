package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a"}, d2 = {"Landroidx/compose/material3/ScrollableTabData;", "", "Landroidx/compose/foundation/ScrollState;", "p0", "Lkotlinx/coroutines/CoroutineScope;", "p1", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "p2", "<init>", "(Landroidx/compose/foundation/ScrollState;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "Landroidx/compose/ui/unit/Density;", "", "", "Landroidx/compose/material3/TabPosition;", "p3", "", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/unit/Density;ILjava/util/List;I)V", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/ScrollState;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Integer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ScrollableTabData {
    private java.lang.Integer Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.ScrollState getHighSpeedVideoFpsRanges;

    public ScrollableTabData(androidx.compose.foundation.ScrollState scrollState, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec) {
        this.getHighSpeedVideoFpsRanges = scrollState;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        this.getHighSpeedVideoFpsRangesFor = finiteAnimationSpec;
    }

    public final void Camera2StreamConfigurationMap(androidx.compose.ui.unit.Density p0, int p1, java.util.List<androidx.compose.material3.TabPosition> p2, int p3) {
        java.lang.Integer num = this.Camera2StreamConfigurationMap;
        if (num == null || num.intValue() != p3) {
            this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(p3);
            androidx.compose.material3.TabPosition tabPosition = (androidx.compose.material3.TabPosition) kotlin.collections.CollectionsKt.getOrNull(p2, p3);
            if (tabPosition != null) {
                int mo1412roundToPx0680j_4 = p0.mo1412roundToPx0680j_4(((androidx.compose.material3.TabPosition) kotlin.collections.CollectionsKt.last((java.util.List) p2)).m3870getRightD9Ej5fM()) + p1;
                int maxValue = mo1412roundToPx0680j_4 - this.getHighSpeedVideoFpsRanges.getMaxValue();
                int coerceIn = kotlin.ranges.RangesKt.coerceIn(p0.mo1412roundToPx0680j_4(tabPosition.getLeft()) - ((maxValue / 2) - (p0.mo1412roundToPx0680j_4(tabPosition.getWidth()) / 2)), 0, kotlin.ranges.RangesKt.coerceAtLeast(mo1412roundToPx0680j_4 - maxValue, 0));
                if (this.getHighSpeedVideoFpsRanges.getValue() != coerceIn) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.compose.material3.ScrollableTabData$onLaidOut$1$1(this, coerceIn, null), 3, null);
                }
            }
        }
    }
}
