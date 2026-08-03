package kotlin.collections;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX WARN: Incorrect field signature: TK; */
/* compiled from: Collections.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class CollectionsKt__CollectionsKt$binarySearchBy$1<T> implements kotlin.jvm.functions.Function1<T, java.lang.Integer> {
    final /* synthetic */ java.lang.Comparable $key;
    final /* synthetic */ kotlin.jvm.functions.Function1<T, K> $selector;

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;+TK;>;TK;)V */
    public CollectionsKt__CollectionsKt$binarySearchBy$1(kotlin.jvm.functions.Function1 function1, java.lang.Comparable comparable) {
        this.$selector = function1;
        this.$key = comparable;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Integer invoke(T t) {
        return java.lang.Integer.valueOf(kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Comparable) this.$selector.invoke(t), this.$key));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Object obj) {
        return invoke((kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1<T>) obj);
    }
}
