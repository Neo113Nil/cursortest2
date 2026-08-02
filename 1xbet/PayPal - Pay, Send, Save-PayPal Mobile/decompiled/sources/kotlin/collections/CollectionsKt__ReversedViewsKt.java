package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"T", "", "asReversed", "(Ljava/util/List;)Ljava/util/List;", "", "asReversedMutable"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class CollectionsKt__ReversedViewsKt extends kotlin.collections.CollectionsKt__MutableCollectionsKt {
    public static final <T> java.util.List<T> asReversed(java.util.List<? extends T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new kotlin.collections.ReversedListReadOnly(list);
    }

    public static final <T> java.util.List<T> asReversedMutable(java.util.List<T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new kotlin.collections.ReversedList(list);
    }

    public static final /* synthetic */ int access$reverseElementIndex(java.util.List list, int i) {
        if (i >= 0 && i <= kotlin.collections.CollectionsKt.getLastIndex(list)) {
            return kotlin.collections.CollectionsKt.getLastIndex(list) - i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Element index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new kotlin.ranges.IntRange(0, kotlin.collections.CollectionsKt.getLastIndex(list)));
        sb.append("].");
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public static final /* synthetic */ int access$reverseIteratorIndex(java.util.List list, int i) {
        return kotlin.collections.CollectionsKt.getLastIndex(list) - i;
    }

    public static final /* synthetic */ int access$reversePositionIndex(java.util.List list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Position index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new kotlin.ranges.IntRange(0, list.size()));
        sb.append("].");
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }
}
