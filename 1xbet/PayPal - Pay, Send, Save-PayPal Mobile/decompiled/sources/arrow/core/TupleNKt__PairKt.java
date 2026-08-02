package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001aT\u0010\u0006\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "A", "B", "Lkotlin/Pair;", "p0", "", "compareTo", "(Lkotlin/Pair;Lkotlin/Pair;)I"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "arrow/core/TupleNKt")
/* loaded from: classes7.dex */
final /* synthetic */ class TupleNKt__PairKt {
    public static final <A extends java.lang.Comparable<? super A>, B extends java.lang.Comparable<? super B>> int compareTo(kotlin.Pair<? extends A, ? extends B> pair, kotlin.Pair<? extends A, ? extends B> pair2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair2, "");
        int compareTo = pair.getFirst().compareTo(pair2.getFirst());
        return compareTo == 0 ? pair.getSecond().compareTo(pair2.getSecond()) : compareTo;
    }
}
