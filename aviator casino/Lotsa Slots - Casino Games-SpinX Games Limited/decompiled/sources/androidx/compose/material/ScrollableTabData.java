package androidx.compose.material;

/* compiled from: TabRow.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J,\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0007\u001a\u00020\bJ*\u0010\u0012\u001a\u00020\b*\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/ScrollableTabData;", "", "scrollState", "Landroidx/compose/foundation/ScrollState;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/foundation/ScrollState;Lkotlinx/coroutines/CoroutineScope;)V", "selectedTab", "", "Ljava/lang/Integer;", "onLaidOut", "", "density", "Landroidx/compose/ui/unit/Density;", "edgeOffset", "tabPositions", "", "Landroidx/compose/material/TabPosition;", "calculateTabOffset", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableTabData {
    private final kotlinx.coroutines.CoroutineScope coroutineScope;
    private final androidx.compose.foundation.ScrollState scrollState;
    private java.lang.Integer selectedTab;

    public ScrollableTabData(androidx.compose.foundation.ScrollState scrollState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.scrollState = scrollState;
        this.coroutineScope = coroutineScope;
    }

    public final void onLaidOut(androidx.compose.ui.unit.Density density, int edgeOffset, java.util.List<androidx.compose.material.TabPosition> tabPositions, int selectedTab) {
        int calculateTabOffset;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        java.lang.Integer num = this.selectedTab;
        if (num != null && num.intValue() == selectedTab) {
            return;
        }
        this.selectedTab = java.lang.Integer.valueOf(selectedTab);
        androidx.compose.material.TabPosition tabPosition = (androidx.compose.material.TabPosition) kotlin.collections.CollectionsKt.getOrNull(tabPositions, selectedTab);
        if (tabPosition == null || this.scrollState.getValue() == (calculateTabOffset = calculateTabOffset(tabPosition, density, edgeOffset, tabPositions))) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new androidx.compose.material.ScrollableTabData$onLaidOut$1$1(this, calculateTabOffset, null), 3, null);
    }

    private final int calculateTabOffset(androidx.compose.material.TabPosition tabPosition, androidx.compose.ui.unit.Density density, int i, java.util.List<androidx.compose.material.TabPosition> list) {
        int mo309roundToPx0680j_4 = density.mo309roundToPx0680j_4(((androidx.compose.material.TabPosition) kotlin.collections.CollectionsKt.last((java.util.List) list)).m1537getRightD9Ej5fM()) + i;
        int maxValue = mo309roundToPx0680j_4 - this.scrollState.getMaxValue();
        return kotlin.ranges.RangesKt.coerceIn(density.mo309roundToPx0680j_4(tabPosition.getLeft()) - ((maxValue / 2) - (density.mo309roundToPx0680j_4(tabPosition.getWidth()) / 2)), 0, kotlin.ranges.RangesKt.coerceAtLeast(mo309roundToPx0680j_4 - maxValue, 0));
    }
}
