package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$7$1 implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Object> getHighSpeedVideoFpsRanges;
    final /* synthetic */ T[] getHighSpeedVideoFpsRangesFor;

    public final java.lang.Object invoke(int i) {
        return this.getHighSpeedVideoFpsRanges.invoke(this.getHighSpeedVideoFpsRangesFor[i]);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$items$7$1(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, T[] tArr) {
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoFpsRangesFor = tArr;
    }
}
