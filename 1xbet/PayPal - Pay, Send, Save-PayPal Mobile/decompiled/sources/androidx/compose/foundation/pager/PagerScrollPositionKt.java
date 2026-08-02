package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "", "currentAbsoluteScrollOffset", "(Landroidx/compose/foundation/pager/PagerState;)J", "", "NearestItemsSlidingWindowSize", com.visa.cbp.getEncExpo.warmup, "NearestItemsExtraItemCount"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerScrollPositionKt {
    public static final int NearestItemsExtraItemCount = 100;
    public static final int NearestItemsSlidingWindowSize = 30;

    public static final long currentAbsoluteScrollOffset(androidx.compose.foundation.pager.PagerState pagerState) {
        return (pagerState.getCurrentPage() * pagerState.getPageSizeWithSpacing$foundation()) + kotlin.math.MathKt.roundToLong(pagerState.getCurrentPageOffsetFraction() * pagerState.getPageSizeWithSpacing$foundation());
    }
}
