package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lkotlin/ranges/ClosedFloatingPointRange;", "", "T", "Lkotlin/ranges/ClosedRange;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "contains", "(Ljava/lang/Comparable;)Z", "isEmpty", "()Z", "a", util.h.xy.cb.b.f1091, "lessThanOrEquals", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ClosedFloatingPointRange<T extends java.lang.Comparable<? super T>> extends kotlin.ranges.ClosedRange<T> {
    @Override // kotlin.ranges.ClosedRange
    boolean contains(T value);

    @Override // kotlin.ranges.ClosedRange
    boolean isEmpty();

    boolean lessThanOrEquals(T a2, T b);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static <T extends java.lang.Comparable<? super T>> boolean contains(kotlin.ranges.ClosedFloatingPointRange<T> closedFloatingPointRange, T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
            return closedFloatingPointRange.lessThanOrEquals(closedFloatingPointRange.getStart(), t) && closedFloatingPointRange.lessThanOrEquals(t, closedFloatingPointRange.getEndInclusive());
        }

        public static <T extends java.lang.Comparable<? super T>> boolean isEmpty(kotlin.ranges.ClosedFloatingPointRange<T> closedFloatingPointRange) {
            return !closedFloatingPointRange.lessThanOrEquals(closedFloatingPointRange.getStart(), closedFloatingPointRange.getEndInclusive());
        }
    }
}
