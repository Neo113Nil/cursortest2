package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/material3/carousel/Strategy;", "strategy", "", "itemIndex", "itemCount", "getSnapPositionOffset", "(Landroidx/compose/material3/carousel/Strategy;II)I", "Landroidx/compose/material3/carousel/CarouselPageSize;", "pageSize", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "KeylineSnapPosition", "(Landroidx/compose/material3/carousel/CarouselPageSize;)Landroidx/compose/foundation/gestures/snapping/SnapPosition;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeylineSnapPositionKt {
    public static final int getSnapPositionOffset(androidx.compose.material3.carousel.Strategy strategy, int i, int i2) {
        if (!strategy.getIsValid()) {
            return 0;
        }
        int roundToInt = kotlin.math.MathKt.roundToInt(strategy.getDefaultKeylines().getFirstFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
        if (i <= kotlin.collections.CollectionsKt.getLastIndex(strategy.getStartKeylineSteps())) {
            roundToInt = kotlin.math.MathKt.roundToInt(strategy.getStartKeylineSteps().get(kotlin.ranges.RangesKt.coerceIn(kotlin.collections.CollectionsKt.getLastIndex(strategy.getStartKeylineSteps()) - i, 0, kotlin.collections.CollectionsKt.getLastIndex(strategy.getStartKeylineSteps()))).getFirstFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
        }
        int i3 = i2 - 1;
        if (i < i3 - kotlin.collections.CollectionsKt.getLastIndex(strategy.getEndKeylineSteps()) || i2 <= strategy.getDefaultKeylines().getFocalCount()) {
            return roundToInt;
        }
        return kotlin.math.MathKt.roundToInt(strategy.getEndKeylineSteps().get(kotlin.ranges.RangesKt.coerceIn(kotlin.collections.CollectionsKt.getLastIndex(strategy.getEndKeylineSteps()) - (i3 - i), 0, kotlin.collections.CollectionsKt.getLastIndex(strategy.getEndKeylineSteps()))).getFirstFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
    }

    public static final androidx.compose.foundation.gestures.snapping.SnapPosition KeylineSnapPosition(final androidx.compose.material3.carousel.CarouselPageSize carouselPageSize) {
        return new androidx.compose.foundation.gestures.snapping.SnapPosition() { // from class: androidx.compose.material3.carousel.KeylineSnapPositionKt$KeylineSnapPosition$1
            @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
            public final int position(int layoutSize, int itemSize, int beforeContentPadding, int afterContentPadding, int itemIndex, int itemCount) {
                return androidx.compose.material3.carousel.KeylineSnapPositionKt.getSnapPositionOffset(androidx.compose.material3.carousel.CarouselPageSize.this.getStrategy(), itemIndex, itemCount);
            }
        };
    }
}
