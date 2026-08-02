package androidx.compose.ui.graphics;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\f\u001a\f0\bR\b\u0012\u0004\u0012\u00028\u00000\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree$iterator$1;", "", "Landroidx/compose/ui/graphics/Interval;", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Landroidx/compose/ui/graphics/Interval;", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/IntervalTree;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntervalTree$iterator$1<T> implements java.util.Iterator<androidx.compose.ui.graphics.Interval<T>>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.IntervalTree<T>.Node getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.ui.graphics.IntervalTree<T> getHighSpeedVideoSizes;

    IntervalTree$iterator$1(androidx.compose.ui.graphics.IntervalTree<T> intervalTree) {
        this.getHighSpeedVideoSizes = intervalTree;
        this.getHighSpeedVideoSizes = intervalTree.root.lowestNode();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoSizes != this.getHighSpeedVideoSizes.terminator;
    }

    @Override // java.util.Iterator
    public final androidx.compose.ui.graphics.Interval<T> next() {
        androidx.compose.ui.graphics.IntervalTree<T>.Node node = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = node.next();
        return node;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
