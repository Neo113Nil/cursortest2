package kotlin.collections;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a7\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u00122\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0004\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0007\u001a%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"T", "", "emptySet", "()Ljava/util/Set;", "", "elements", "setOf", "([Ljava/lang/Object;)Ljava/util/Set;", "", "mutableSetOf", "Ljava/util/HashSet;", "Lkotlin/collections/getHighSpeedVideoSizesFor;", "hashSetOf", "([Ljava/lang/Object;)Ljava/util/HashSet;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/Camera2StreamConfigurationMap;", "linkedSetOf", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "", "element", "setOfNotNull", "(Ljava/lang/Object;)Ljava/util/Set;", "optimizeReadOnlySet", "(Ljava/util/Set;)Ljava/util/Set;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
/* loaded from: classes3.dex */
public class SetsKt__SetsKt extends kotlin.collections.SetsKt__SetsJVMKt {
    public static final <T> java.util.Set<T> emptySet() {
        return kotlin.collections.EmptySet.INSTANCE;
    }

    public static final <T> java.util.Set<T> setOf(T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return kotlin.collections.ArraysKt.toSet(tArr);
    }

    public static final <T> java.util.Set<T> mutableSetOf(T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (java.util.Set) kotlin.collections.ArraysKt.toCollection(tArr, new java.util.LinkedHashSet(kotlin.collections.MapsKt.mapCapacity(tArr.length)));
    }

    public static final <T> java.util.HashSet<T> hashSetOf(T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (java.util.HashSet) kotlin.collections.ArraysKt.toCollection(tArr, new java.util.HashSet(kotlin.collections.MapsKt.mapCapacity(tArr.length)));
    }

    public static final <T> java.util.LinkedHashSet<T> linkedSetOf(T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (java.util.LinkedHashSet) kotlin.collections.ArraysKt.toCollection(tArr, new java.util.LinkedHashSet(kotlin.collections.MapsKt.mapCapacity(tArr.length)));
    }

    public static final <T> java.util.Set<T> setOfNotNull(T t) {
        return t != null ? kotlin.collections.SetsKt.setOf(t) : kotlin.collections.SetsKt.emptySet();
    }

    public static final <T> java.util.Set<T> setOfNotNull(T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (java.util.Set) kotlin.collections.ArraysKt.filterNotNullTo(tArr, new java.util.LinkedHashSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.util.Set<T> optimizeReadOnlySet(java.util.Set<? extends T> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : kotlin.collections.SetsKt.setOf(set.iterator().next());
        }
        return kotlin.collections.SetsKt.emptySet();
    }
}
