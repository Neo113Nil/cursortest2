package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$9$1 implements kotlin.jvm.functions.Function1<java.lang.Integer, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> {
    final /* synthetic */ T[] getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Integer, T, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> getHighSpeedVideoSizes;

    public final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan invoke(int i) {
        return this.getHighSpeedVideoSizes.invoke(java.lang.Integer.valueOf(i), this.getHighSpeedVideoFpsRanges[i]);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$9$1(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> function2, T[] tArr) {
        this.getHighSpeedVideoSizes = function2;
        this.getHighSpeedVideoFpsRanges = tArr;
    }
}
