package kotlin.comparisons;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class ComparisonsKt__ComparisonsKt$compareBy$2<T> implements java.util.Comparator {
    final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> getHighSpeedVideoSizes;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> function1 = this.getHighSpeedVideoSizes;
        return kotlin.comparisons.ComparisonsKt.compareValues(function1.invoke(t), function1.invoke(t2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$compareBy$2(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> function1) {
        this.getHighSpeedVideoSizes = function1;
    }
}
