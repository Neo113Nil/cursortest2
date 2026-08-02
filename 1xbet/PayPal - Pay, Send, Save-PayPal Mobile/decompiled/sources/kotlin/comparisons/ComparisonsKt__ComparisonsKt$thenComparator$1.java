package kotlin.comparisons;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class ComparisonsKt__ComparisonsKt$thenComparator$1<T> implements java.util.Comparator {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, T, java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Comparator<T> getHighSpeedVideoFpsRanges;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.getHighSpeedVideoFpsRanges.compare(t, t2);
        return compare != 0 ? compare : this.getHighResolutionOutputSizeshNQ4ISI.invoke(t, t2).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$thenComparator$1(java.util.Comparator<T> comparator, kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Integer> function2) {
        this.getHighSpeedVideoFpsRanges = comparator;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }
}
