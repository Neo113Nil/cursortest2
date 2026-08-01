package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.U3;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LazyMeasuredItem.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001Bn\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016J>\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\bR\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0019\u0010\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0014\u001a\u00020\u0015X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyMeasuredItem;", "", "index", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "key", "isVertical", "", "crossAxisSize", "", "mainAxisSpacing", "reverseLayout", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "beforeContentPadding", "afterContentPadding", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;II[Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCrossAxisSize", "()I", "getIndex-VZbfaAc", "I", "getKey", "()Ljava/lang/Object;", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "getMainAxisSpacing", "getPlaceables", "()[Landroidx/compose/ui/layout/Placeable;", "[Landroidx/compose/ui/layout/Placeable;", "J", U3.i.L, "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "rawMainAxisOffset", "rawCrossAxisOffset", "layoutWidth", "layoutHeight", "row", "column", "lineMainAxisSize", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyMeasuredItem {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final Placeable[] placeables;
    private final LazyGridItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final long visualOffset;

    public /* synthetic */ LazyMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, Placeable[] placeableArr, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, z, i2, i3, z2, layoutDirection, i4, i5, placeableArr, lazyGridItemPlacementAnimator, j);
    }

    private LazyMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, Placeable[] placeableArr, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j) {
        this.index = i;
        this.key = obj;
        this.isVertical = z;
        this.crossAxisSize = i2;
        this.mainAxisSpacing = i3;
        this.reverseLayout = z2;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.placeables = placeableArr;
        this.placementAnimator = lazyGridItemPlacementAnimator;
        this.visualOffset = j;
        int i6 = 0;
        for (Placeable placeable : placeableArr) {
            i6 = Math.max(i6, this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = i6;
        this.mainAxisSizeWithSpacings = i6 + this.mainAxisSpacing;
    }

    /* renamed from: getIndex-VZbfaAc, reason: not valid java name and from getter */
    public final int getIndex() {
        return this.index;
    }

    public final Object getKey() {
        return this.key;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LazyGridPositionedItem position(int rawMainAxisOffset, int rawCrossAxisOffset, int layoutWidth, int layoutHeight, int row, int column, int lineMainAxisSize) {
        long IntOffset;
        long IntOffset2;
        long IntSize;
        int i;
        ArrayList arrayList = new ArrayList();
        boolean z = this.isVertical;
        int i2 = z ? layoutHeight : layoutWidth;
        int i3 = this.reverseLayout ? (i2 - rawMainAxisOffset) - this.mainAxisSize : rawMainAxisOffset;
        int i4 = (z && this.layoutDirection == LayoutDirection.Rtl) ? ((z ? layoutWidth : layoutHeight) - rawCrossAxisOffset) - this.crossAxisSize : rawCrossAxisOffset;
        if (this.isVertical) {
            IntOffset = IntOffsetKt.IntOffset(i4, i3);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i3, i4);
        }
        long j = IntOffset;
        int lastIndex = this.reverseLayout ? ArraysKt.getLastIndex(this.placeables) : 0;
        while (true) {
            boolean z2 = this.reverseLayout;
            if (z2) {
                if (lastIndex < 0) {
                    break;
                }
                arrayList.add(!z2 ? 0 : arrayList.size(), new LazyGridPlaceableWrapper(j, this.placeables[lastIndex], this.placeables[lastIndex].getParentData(), null));
                lastIndex = !this.reverseLayout ? lastIndex - 1 : lastIndex + 1;
            } else {
                if (lastIndex >= this.placeables.length) {
                    break;
                }
                arrayList.add(!z2 ? 0 : arrayList.size(), new LazyGridPlaceableWrapper(j, this.placeables[lastIndex], this.placeables[lastIndex].getParentData(), null));
                if (!this.reverseLayout) {
                }
            }
        }
        if (this.isVertical) {
            IntOffset2 = IntOffsetKt.IntOffset(rawCrossAxisOffset, rawMainAxisOffset);
        } else {
            IntOffset2 = IntOffsetKt.IntOffset(rawMainAxisOffset, rawCrossAxisOffset);
        }
        int i5 = this.index;
        Object obj = this.key;
        if (this.isVertical) {
            IntSize = IntSizeKt.IntSize(this.crossAxisSize, this.mainAxisSize);
        } else {
            IntSize = IntSizeKt.IntSize(this.mainAxisSize, this.crossAxisSize);
        }
        long j2 = IntSize;
        int i6 = this.mainAxisSpacing;
        boolean z3 = this.reverseLayout;
        if (!z3) {
            i = this.beforeContentPadding;
        } else {
            i = this.afterContentPadding;
        }
        return new LazyGridPositionedItem(IntOffset2, j, i5, obj, row, column, j2, lineMainAxisSize, i6, -i, i2 + (!z3 ? this.afterContentPadding : this.beforeContentPadding), this.isVertical, arrayList, this.placementAnimator, this.visualOffset, null);
    }
}
