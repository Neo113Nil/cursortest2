package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$2$1 implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Integer, T, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<T> getHighSpeedVideoFpsRanges;

    public final java.lang.Object invoke(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(java.lang.Integer.valueOf(i), this.getHighSpeedVideoFpsRanges.get(i));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$2$1(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, java.util.List<? extends T> list) {
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoFpsRanges = list;
    }
}
