package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/pager/PagerSnapDistanceMaxPages;", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "", "pagesLimit", "<init>", "(I)V", "startPage", "suggestedTargetPage", "", "velocity", "pageSize", "pageSpacing", "calculateTargetPage", "(IIFII)I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerSnapDistanceMaxPages implements androidx.compose.foundation.pager.PagerSnapDistance {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    public PagerSnapDistanceMaxPages(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    @Override // androidx.compose.foundation.pager.PagerSnapDistance
    public final int calculateTargetPage(int startPage, int suggestedTargetPage, float velocity, int pageSize, int pageSpacing) {
        long j = startPage;
        return kotlin.ranges.RangesKt.coerceIn(suggestedTargetPage, (int) kotlin.ranges.RangesKt.coerceAtLeast(j - this.getHighSpeedVideoSizes, 0L), (int) kotlin.ranges.RangesKt.coerceAtMost(j + this.getHighSpeedVideoSizes, androidx.collection.SieveCacheKt.NodeLinkMask));
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof androidx.compose.foundation.pager.PagerSnapDistanceMaxPages) && this.getHighSpeedVideoSizes == ((androidx.compose.foundation.pager.PagerSnapDistanceMaxPages) other).getHighSpeedVideoSizes;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.getHighSpeedVideoSizes);
    }
}
