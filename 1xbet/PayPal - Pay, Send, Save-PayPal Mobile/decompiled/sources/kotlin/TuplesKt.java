package kotlin;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0001H\u0086\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0006*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\b\u0010\u000b"}, d2 = {"A", "B", "that", "Lkotlin/Pair;", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "T", "", "toList", "(Lkotlin/Pair;)Ljava/util/List;", "Lkotlin/Triple;", "(Lkotlin/Triple;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TuplesKt {
    public static final <A, B> kotlin.Pair<A, B> to(A a2, B b) {
        return new kotlin.Pair<>(a2, b);
    }

    public static final <T> java.util.List<T> toList(kotlin.Pair<? extends T, ? extends T> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        return kotlin.collections.CollectionsKt.listOf(pair.getFirst(), pair.getSecond());
    }

    public static final <T> java.util.List<T> toList(kotlin.Triple<? extends T, ? extends T, ? extends T> triple) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(triple, "");
        return kotlin.collections.CollectionsKt.listOf(triple.getFirst(), triple.getSecond(), triple.getThird());
    }
}
