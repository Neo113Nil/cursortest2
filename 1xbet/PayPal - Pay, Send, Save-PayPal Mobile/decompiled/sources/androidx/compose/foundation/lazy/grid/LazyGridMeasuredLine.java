package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001aR\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "", "", "index", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "items", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "slots", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", com.datadog.android.trace.internal.domain.event.SpanEventSerializer.TAG_SPANS, "", "isVertical", "mainAxisSpacing", "<init>", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Landroidx/compose/foundation/lazy/grid/LazyGridSlots;Ljava/util/List;ZI)V", "isEmpty", "()Z", "offset", "layoutWidth", "layoutHeight", com.daon.sdk.face.license.License.FEATURE_POSITION, "(III)[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", com.visa.cbp.getEncExpo.warmup, "getIndex", "()I", "[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "getItems", "()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyGridMeasuredLine {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.foundation.lazy.grid.GridItemSpan> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.foundation.lazy.grid.LazyGridSlots getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;
    private final int index;
    private final androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] items;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;

    public LazyGridMeasuredLine(int i, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] lazyGridMeasuredItemArr, androidx.compose.foundation.lazy.grid.LazyGridSlots lazyGridSlots, java.util.List<androidx.compose.foundation.lazy.grid.GridItemSpan> list, boolean z, int i2) {
        this.index = i;
        this.items = lazyGridMeasuredItemArr;
        this.getHighSpeedVideoFpsRangesFor = lazyGridSlots;
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = i2;
        int i3 = 0;
        for (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem lazyGridMeasuredItem : lazyGridMeasuredItemArr) {
            i3 = java.lang.Math.max(i3, lazyGridMeasuredItem.getMainAxisSize());
        }
        this.mainAxisSize = i3;
        this.mainAxisSizeWithSpacings = kotlin.ranges.RangesKt.coerceAtLeast(i3 + this.Camera2StreamConfigurationMap, 0);
    }

    public final int getIndex() {
        return this.index;
    }

    public final androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean isEmpty() {
        return this.items.length == 0;
    }

    public final androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] position(int offset, int layoutWidth, int layoutHeight) {
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.items;
        int length = lazyGridMeasuredItemArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i];
            int m1807getCurrentLineSpanimpl = androidx.compose.foundation.lazy.grid.GridItemSpan.m1807getCurrentLineSpanimpl(this.getHighSpeedVideoFpsRanges.get(i2).getGetHighResolutionOutputSizeshNQ4ISI());
            int i4 = this.getHighSpeedVideoFpsRangesFor.getPositions()[i3];
            boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
            lazyGridMeasuredItem.position(offset, i4, layoutWidth, layoutHeight, z ? this.index : i3, z ? i3 : this.index);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            i3 += m1807getCurrentLineSpanimpl;
            i++;
            i2++;
        }
        return this.items;
    }
}
