package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/ranges/LongRange;", "other", "", "contains", "(Lkotlin/ranges/LongRange;Lkotlin/ranges/LongRange;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RangesKt {
    public static final boolean contains(kotlin.ranges.LongRange longRange, kotlin.ranges.LongRange longRange2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longRange2, "");
        return longRange2.getFirst() >= longRange.getStart().longValue() && longRange2.getLast() <= longRange.getEndInclusive().longValue();
    }
}
