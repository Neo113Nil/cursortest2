package kotlin.comparisons;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\u001aG\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005¢\u0006\u0004\b\u0007\u0010\t\u001aK\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005¢\u0006\u0004\b\u0007\u0010\f\u001aG\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005¢\u0006\u0004\b\r\u0010\b\u001a?\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005¢\u0006\u0004\b\r\u0010\t\u001aK\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005¢\u0006\u0004\b\r\u0010\f"}, d2 = {"T", "a", util.h.xy.cb.b.f1091, "c", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "comparator", "maxOf", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "", "other", "(Ljava/lang/Object;[Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "minOf"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes5.dex */
class ComparisonsKt___ComparisonsKt extends kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt {
    public static final <T> T maxOf(T t, T t2, T t3, java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        return (T) kotlin.comparisons.ComparisonsKt.maxOf(t, kotlin.comparisons.ComparisonsKt.maxOf(t2, t3, comparator), comparator);
    }

    public static final <T> T maxOf(T t, T t2, java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        return comparator.compare(t, t2) >= 0 ? t : t2;
    }

    public static final <T> T maxOf(T t, T[] tArr, java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    public static final <T> T minOf(T t, T t2, T t3, java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        return (T) kotlin.comparisons.ComparisonsKt.minOf(t, kotlin.comparisons.ComparisonsKt.minOf(t2, t3, comparator), comparator);
    }

    public static final <T> T minOf(T t, T t2, java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        return comparator.compare(t, t2) <= 0 ? t : t2;
    }

    public static final <T> T minOf(T t, T[] tArr, java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) > 0) {
                t = t2;
            }
        }
        return t;
    }
}
