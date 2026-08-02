package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a)\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "", "Lkotlin/collections/IndexedValue;", "withIndex", "(Ljava/util/Iterator;)Ljava/util/Iterator;", "Lkotlin/Function1;", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "forEach", "(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes5.dex */
class CollectionsKt__IteratorsKt extends kotlin.collections.CollectionsKt__IteratorsJVMKt {
    public static final <T> java.util.Iterator<kotlin.collections.IndexedValue<T>> withIndex(java.util.Iterator<? extends T> it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "");
        return new kotlin.collections.IndexingIterator(it);
    }

    public static final <T> void forEach(java.util.Iterator<? extends T> it, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }
}
