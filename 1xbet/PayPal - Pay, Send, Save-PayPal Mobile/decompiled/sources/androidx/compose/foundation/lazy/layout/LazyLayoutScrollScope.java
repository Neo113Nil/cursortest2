package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "index", "offset", "", "snapToItem", "(II)V", "targetIndex", "targetOffset", "calculateDistanceTo", "(II)I", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LazyLayoutScrollScope extends androidx.compose.foundation.gestures.ScrollScope {
    int calculateDistanceTo(int targetIndex, int targetOffset);

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    int getItemCount();

    int getLastVisibleItemIndex();

    void snapToItem(int index, int offset);

    static /* synthetic */ void snapToItem$default(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapToItem");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        lazyLayoutScrollScope.snapToItem(i, i2);
    }

    static /* synthetic */ int calculateDistanceTo$default(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateDistanceTo");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyLayoutScrollScope.calculateDistanceTo(i, i2);
    }
}
