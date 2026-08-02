package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/pager/PagerLayoutInfo;", "", "pageCount", "calculateContentSize", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;I)I", "getMainAxisViewportSize", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;)I", "mainAxisViewportSize"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerLayoutInfoKt {
    public static final int getMainAxisViewportSize(androidx.compose.foundation.pager.PagerLayoutInfo pagerLayoutInfo) {
        return (int) (pagerLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical ? pagerLayoutInfo.mo1926getViewportSizeYbymL2g() & 4294967295L : pagerLayoutInfo.mo1926getViewportSizeYbymL2g() >> 32);
    }

    public static final int calculateContentSize(androidx.compose.foundation.pager.PagerLayoutInfo pagerLayoutInfo, int i) {
        int beforeContentPadding = pagerLayoutInfo.getBeforeContentPadding() + pagerLayoutInfo.getAfterContentPadding();
        if (i == 0) {
            return beforeContentPadding;
        }
        long j = i;
        long pageSize = (pagerLayoutInfo.getPageSize() * j) + ((j - 1) * pagerLayoutInfo.getPageSpacing()) + beforeContentPadding;
        if (pageSize > androidx.collection.SieveCacheKt.NodeLinkMask) {
            pageSize = 2147483647L;
        }
        return (int) pageSize;
    }
}
