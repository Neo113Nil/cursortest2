package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListPrefetchResultScopeImpl;", "Landroidx/compose/foundation/lazy/LazyListPrefetchResultScope;", "", "index", "mainAxisSize", "<init>", "(II)V", com.visa.cbp.getEncExpo.warmup, "getIndex", "()I", "getMainAxisSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyListPrefetchResultScopeImpl implements androidx.compose.foundation.lazy.LazyListPrefetchResultScope {
    public static final int $stable = 0;
    private final int index;
    private final int mainAxisSize;

    public LazyListPrefetchResultScopeImpl(int i, int i2) {
        this.index = i;
        this.mainAxisSize = i2;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchResultScope
    public final int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchResultScope
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }
}
