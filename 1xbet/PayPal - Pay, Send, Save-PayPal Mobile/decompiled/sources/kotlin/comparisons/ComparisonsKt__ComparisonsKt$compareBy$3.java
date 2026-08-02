package kotlin.comparisons;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class ComparisonsKt__ComparisonsKt$compareBy$3<T> implements java.util.Comparator {
    final /* synthetic */ java.util.Comparator<? super K> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<T, K> getHighSpeedVideoSizes;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        java.util.Comparator<? super K> comparator = this.Camera2StreamConfigurationMap;
        kotlin.jvm.functions.Function1<T, K> function1 = this.getHighSpeedVideoSizes;
        return comparator.compare(function1.invoke(t), function1.invoke(t2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$compareBy$3(java.util.Comparator<? super K> comparator, kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        this.Camera2StreamConfigurationMap = comparator;
        this.getHighSpeedVideoSizes = function1;
    }
}
