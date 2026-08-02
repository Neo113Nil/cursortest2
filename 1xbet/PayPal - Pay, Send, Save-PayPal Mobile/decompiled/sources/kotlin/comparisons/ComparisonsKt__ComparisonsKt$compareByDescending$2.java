package kotlin.comparisons;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class ComparisonsKt__ComparisonsKt$compareByDescending$2<T> implements java.util.Comparator {
    final /* synthetic */ kotlin.jvm.functions.Function1<T, K> Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.Comparator<? super K> getHighSpeedVideoFpsRanges;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        java.util.Comparator<? super K> comparator = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.functions.Function1<T, K> function1 = this.Camera2StreamConfigurationMap;
        return comparator.compare(function1.invoke(t2), function1.invoke(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$compareByDescending$2(java.util.Comparator<? super K> comparator, kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        this.getHighSpeedVideoFpsRanges = comparator;
        this.Camera2StreamConfigurationMap = function1;
    }
}
