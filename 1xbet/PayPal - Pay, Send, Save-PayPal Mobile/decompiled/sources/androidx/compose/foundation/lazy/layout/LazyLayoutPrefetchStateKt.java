package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "lazyLayoutPrefetchState", "traversablePrefetchState", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;)Landroidx/compose/ui/Modifier;", "", "UnspecifiedNestedPrefetchCount", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/ui/unit/Constraints;", "getHighSpeedVideoFpsRangesFor", "J", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutPrefetchStateKt {
    public static final int UnspecifiedNestedPrefetchCount = -1;
    private static final long getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 5, null);

    public static final androidx.compose.ui.Modifier traversablePrefetchState(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        androidx.compose.ui.Modifier then;
        return (lazyLayoutPrefetchState == null || (then = modifier.then(new androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement(lazyLayoutPrefetchState))) == null) ? modifier : then;
    }
}
