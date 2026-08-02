package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "intervals", "<init>", "(Landroidx/compose/foundation/lazy/layout/IntervalList;)V", "", "itemIndex", "", "isFullSpan", "(I)Z", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyStaggeredGridSpanProvider {
    public static final int $stable = 8;
    private final androidx.compose.foundation.lazy.layout.IntervalList<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridInterval> intervals;

    public LazyStaggeredGridSpanProvider(androidx.compose.foundation.lazy.layout.IntervalList<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridInterval> intervalList) {
        this.intervals = intervalList;
    }

    public final androidx.compose.foundation.lazy.layout.IntervalList<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }

    public final boolean isFullSpan(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= this.intervals.getSize()) {
            return false;
        }
        androidx.compose.foundation.lazy.layout.IntervalList.Interval<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridInterval> interval = this.intervals.get(itemIndex);
        kotlin.jvm.functions.Function1<java.lang.Integer, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> span = interval.getValue().getSpan();
        return span != null && span.invoke(java.lang.Integer.valueOf(itemIndex - interval.getStartIndex())) == androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan.INSTANCE.getFullLine();
    }
}
