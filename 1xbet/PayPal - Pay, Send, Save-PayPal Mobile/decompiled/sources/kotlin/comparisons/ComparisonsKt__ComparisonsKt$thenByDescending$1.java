package kotlin.comparisons;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class ComparisonsKt__ComparisonsKt$thenByDescending$1<T> implements java.util.Comparator {
    final /* synthetic */ java.util.Comparator<T> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> getHighSpeedVideoFpsRangesFor;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.getHighResolutionOutputSizeshNQ4ISI.compare(t, t2);
        if (compare != 0) {
            return compare;
        }
        kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> function1 = this.getHighSpeedVideoFpsRangesFor;
        return kotlin.comparisons.ComparisonsKt.compareValues(function1.invoke(t2), function1.invoke(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$thenByDescending$1(java.util.Comparator<T> comparator, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> function1) {
        this.getHighResolutionOutputSizeshNQ4ISI = comparator;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
