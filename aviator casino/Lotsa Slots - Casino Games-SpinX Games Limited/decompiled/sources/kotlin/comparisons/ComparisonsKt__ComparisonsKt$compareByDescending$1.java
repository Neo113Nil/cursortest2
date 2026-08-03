package kotlin.comparisons;

/* compiled from: Comparisons.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class ComparisonsKt__ComparisonsKt$compareByDescending$1<T> implements java.util.Comparator {
    final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> $selector;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$compareByDescending$1(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> function1) {
        this.$selector = function1;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> function1 = this.$selector;
        return kotlin.comparisons.ComparisonsKt.compareValues(function1.invoke(t2), function1.invoke(t));
    }
}
