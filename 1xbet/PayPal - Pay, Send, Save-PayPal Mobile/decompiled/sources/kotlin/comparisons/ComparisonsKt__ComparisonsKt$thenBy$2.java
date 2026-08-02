package kotlin.comparisons;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class ComparisonsKt__ComparisonsKt$thenBy$2<T> implements java.util.Comparator {
    final /* synthetic */ java.util.Comparator<? super K> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<T, K> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Comparator<T> getHighSpeedVideoFpsRanges;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.getHighSpeedVideoFpsRanges.compare(t, t2);
        if (compare != 0) {
            return compare;
        }
        java.util.Comparator<? super K> comparator = this.Camera2StreamConfigurationMap;
        kotlin.jvm.functions.Function1<T, K> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
        return comparator.compare(function1.invoke(t), function1.invoke(t2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$thenBy$2(java.util.Comparator<T> comparator, java.util.Comparator<? super K> comparator2, kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        this.getHighSpeedVideoFpsRanges = comparator;
        this.Camera2StreamConfigurationMap = comparator2;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }
}
