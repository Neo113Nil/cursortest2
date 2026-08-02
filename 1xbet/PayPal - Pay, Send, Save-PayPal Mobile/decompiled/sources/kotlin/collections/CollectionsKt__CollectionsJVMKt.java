package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00052\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0007\u0010\u000b\u001a)\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014\u001a1\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0015\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001d\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001c0\u0016\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"T", "element", "", "listOf", "(Ljava/lang/Object;)Ljava/util/List;", "E", "", "createListBuilder", "()Ljava/util/List;", "", "capacity", "(I)Ljava/util/List;", "builder", "build", "(Ljava/util/List;)Ljava/util/List;", "", "shuffled", "(Ljava/lang/Iterable;)Ljava/util/List;", "Ljava/util/Random;", "random", "(Ljava/lang/Iterable;Ljava/util/Random;)Ljava/util/List;", "collectionSize", "", "array", "terminateCollectionToArray", "(I[Ljava/lang/Object;)[Ljava/lang/Object;", "", "isVarargs", "", "copyToArrayOfAny", "([Ljava/lang/Object;Z)[Ljava/lang/Object;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class CollectionsKt__CollectionsJVMKt {
    public static final <T> java.util.List<T> listOf(T t) {
        java.util.List<T> singletonList = java.util.Collections.singletonList(t);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singletonList, "");
        return singletonList;
    }

    public static final <E> java.util.List<E> createListBuilder() {
        return new kotlin.collections.builders.ListBuilder(0, 1, null);
    }

    public static final <E> java.util.List<E> createListBuilder(int i) {
        return new kotlin.collections.builders.ListBuilder(i);
    }

    public static final <E> java.util.List<E> build(java.util.List<E> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return ((kotlin.collections.builders.ListBuilder) list).build();
    }

    public static final <T> java.util.List<T> shuffled(java.lang.Iterable<? extends T> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.List<T> mutableList = kotlin.collections.CollectionsKt.toMutableList(iterable);
        java.util.Collections.shuffle(mutableList);
        return mutableList;
    }

    public static final <T> java.util.List<T> shuffled(java.lang.Iterable<? extends T> iterable, java.util.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        java.util.List<T> mutableList = kotlin.collections.CollectionsKt.toMutableList(iterable);
        java.util.Collections.shuffle(mutableList, random);
        return mutableList;
    }

    public static final <T> T[] terminateCollectionToArray(int i, T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        if (i < tArr.length) {
            tArr[i] = null;
        }
        return tArr;
    }

    public static final <T> java.lang.Object[] copyToArrayOfAny(T[] tArr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        if (z && kotlin.jvm.internal.Intrinsics.areEqual(tArr.getClass(), java.lang.Object[].class)) {
            return tArr;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(tArr, tArr.length, java.lang.Object[].class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return copyOf;
    }
}
