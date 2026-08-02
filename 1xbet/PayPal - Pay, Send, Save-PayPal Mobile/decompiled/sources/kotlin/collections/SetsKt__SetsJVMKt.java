package kotlin.collections;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00052\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0007\u0010\u000b\u001a)\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f\"\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aI\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00002\u001a\u0010\u0016\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0014j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u00152\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f\"\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0017"}, d2 = {"T", "element", "", "setOf", "(Ljava/lang/Object;)Ljava/util/Set;", "E", "", "createSetBuilder", "()Ljava/util/Set;", "", "capacity", "(I)Ljava/util/Set;", "builder", "build", "(Ljava/util/Set;)Ljava/util/Set;", "", "elements", "Ljava/util/TreeSet;", "sortedSetOf", "([Ljava/lang/Object;)Ljava/util/TreeSet;", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "comparator", "(Ljava/util/Comparator;[Ljava/lang/Object;)Ljava/util/TreeSet;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
/* loaded from: classes3.dex */
public class SetsKt__SetsJVMKt {
    public static final <T> java.util.Set<T> setOf(T t) {
        java.util.Set<T> singleton = java.util.Collections.singleton(t);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleton, "");
        return singleton;
    }

    public static final <E> java.util.Set<E> createSetBuilder() {
        return new kotlin.collections.builders.SetBuilder();
    }

    public static final <E> java.util.Set<E> createSetBuilder(int i) {
        return new kotlin.collections.builders.SetBuilder(i);
    }

    public static final <E> java.util.Set<E> build(java.util.Set<E> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        return ((kotlin.collections.builders.SetBuilder) set).build();
    }

    public static final <T> java.util.TreeSet<T> sortedSetOf(T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (java.util.TreeSet) kotlin.collections.ArraysKt.toCollection(tArr, new java.util.TreeSet());
    }

    public static final <T> java.util.TreeSet<T> sortedSetOf(java.util.Comparator<? super T> comparator, T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (java.util.TreeSet) kotlin.collections.ArraysKt.toCollection(tArr, new java.util.TreeSet(comparator));
    }
}
