package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/ranges/IntRange;", "itemIndexRange", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "intervalContent", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "LazyLayoutKeyIndexMap", "(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;)Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutKeyIndexMapKt {
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap LazyLayoutKeyIndexMap(kotlin.ranges.IntRange intRange, androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent<?> lazyLayoutIntervalContent) {
        return new androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap(intRange, lazyLayoutIntervalContent);
    }
}
