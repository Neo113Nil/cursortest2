package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "", "", "index", "", "schedulePrefetch", "(I)V", "schedulePrecomposition", "Landroidx/compose/ui/unit/Constraints;", "constraints", "schedulePrefetch-0kLqBqw", "(IJ)V", "schedulePrecompositionAndPremeasure-0kLqBqw", "schedulePrecompositionAndPremeasure", "getNestedPrefetchItemCount", "()I", "nestedPrefetchItemCount", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$NestedPrefetchScopeImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface NestedPrefetchScope {
    default int getNestedPrefetchItemCount() {
        return -1;
    }

    void schedulePrecomposition(int index);

    /* renamed from: schedulePrecompositionAndPremeasure-0kLqBqw */
    void mo1865schedulePrecompositionAndPremeasure0kLqBqw(int index, long constraints);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Please use schedulePrecomposition(index) instead")
    default void schedulePrefetch(int index) {
        schedulePrecomposition(index);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Please use schedulePremeasure(index, constraints) instead")
    /* renamed from: schedulePrefetch-0kLqBqw, reason: not valid java name */
    default void m1868schedulePrefetch0kLqBqw(int index, long constraints) {
        mo1865schedulePrecompositionAndPremeasure0kLqBqw(index, constraints);
    }
}
