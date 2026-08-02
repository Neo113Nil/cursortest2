package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ljava/util/Enumeration;", "", "iterator", "(Ljava/util/Enumeration;)Ljava/util/Iterator;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes5.dex */
class CollectionsKt__IteratorsJVMKt extends kotlin.collections.CollectionsKt__IterablesKt {
    public static final <T> java.util.Iterator<T> iterator(java.util.Enumeration<T> enumeration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumeration, "");
        return new kotlin.collections.CollectionsKt__IteratorsJVMKt$iterator$1(enumeration);
    }
}
