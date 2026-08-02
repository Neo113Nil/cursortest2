package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "Lkotlinx/datetime/internal/format/Predicate;", "predicates", "conjunctionPredicate", "(Ljava/util/List;)Lkotlinx/datetime/internal/format/Predicate;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PredicateKt {
    public static final <T> kotlinx.datetime.internal.format.Predicate<T> conjunctionPredicate(java.util.List<? extends kotlinx.datetime.internal.format.Predicate<? super T>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return list.isEmpty() ? kotlinx.datetime.internal.format.Truth.INSTANCE : list.size() == 1 ? (kotlinx.datetime.internal.format.Predicate) kotlin.collections.CollectionsKt.single((java.util.List) list) : new kotlinx.datetime.internal.format.ConjunctionPredicate(list);
    }
}
