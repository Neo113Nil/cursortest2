package androidx.core.util;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\f¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u0007\u0010\b\u001a>\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\n¢\u0006\u0004\b\u0007\u0010\n\u001a>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\f¢\u0006\u0004\b\u000b\u0010\n\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"", "T", "that", "Landroid/util/Range;", "rangeTo", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "plus", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "other", "(Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;", "and", "Lkotlin/ranges/ClosedRange;", "toClosedRange", "(Landroid/util/Range;)Lkotlin/ranges/ClosedRange;", "toRange", "(Lkotlin/ranges/ClosedRange;)Landroid/util/Range;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RangeKt {
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> rangeTo(T t, T t2) {
        return new android.util.Range<>(t, t2);
    }

    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> plus(android.util.Range<T> range, T t) {
        return range.extend((android.util.Range<T>) t);
    }

    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> plus(android.util.Range<T> range, android.util.Range<T> range2) {
        return range.extend(range2);
    }

    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> and(android.util.Range<T> range, android.util.Range<T> range2) {
        return range.intersect(range2);
    }

    public static final <T extends java.lang.Comparable<? super T>> kotlin.ranges.ClosedRange<T> toClosedRange(final android.util.Range<T> range) {
        return (kotlin.ranges.ClosedRange) new kotlin.ranges.ClosedRange<T>() { // from class: androidx.core.util.RangeKt$toClosedRange$1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            @Override // kotlin.ranges.ClosedRange
            public final /* bridge */ boolean contains(java.lang.Comparable comparable) {
                return kotlin.ranges.ClosedRange.DefaultImpls.contains(this, comparable);
            }

            @Override // kotlin.ranges.ClosedRange
            public final /* bridge */ boolean isEmpty() {
                return kotlin.ranges.ClosedRange.DefaultImpls.isEmpty(this);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.ranges.ClosedRange
            public final java.lang.Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.ranges.ClosedRange
            public final java.lang.Comparable getStart() {
                return range.getLower();
            }
        };
    }

    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> toRange(kotlin.ranges.ClosedRange<T> closedRange) {
        return new android.util.Range<>(closedRange.getStart(), closedRange.getEndInclusive());
    }
}
