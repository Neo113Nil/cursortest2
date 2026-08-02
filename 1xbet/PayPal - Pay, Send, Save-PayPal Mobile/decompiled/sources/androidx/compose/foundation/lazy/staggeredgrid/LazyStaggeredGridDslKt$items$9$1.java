package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$9$1 implements kotlin.jvm.functions.Function1<java.lang.Integer, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> {
    final /* synthetic */ kotlin.jvm.functions.Function1<T, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ T[] getHighSpeedVideoFpsRangesFor;

    public final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan invoke(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(this.getHighSpeedVideoFpsRangesFor[i]);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$items$9$1(kotlin.jvm.functions.Function1<? super T, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> function1, T[] tArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRangesFor = tArr;
    }
}
