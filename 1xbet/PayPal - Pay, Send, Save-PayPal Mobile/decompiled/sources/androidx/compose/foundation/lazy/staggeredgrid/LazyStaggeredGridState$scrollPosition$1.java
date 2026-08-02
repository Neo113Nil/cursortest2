package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, int[]> {
    public final int[] getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
        int[] highSpeedVideoSizes;
        highSpeedVideoSizes = ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) this.receiver).getHighSpeedVideoSizes(i, i2);
        return highSpeedVideoSizes;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ int[] invoke(java.lang.Integer num, java.lang.Integer num2) {
        return getHighResolutionOutputSizeshNQ4ISI(num.intValue(), num2.intValue());
    }

    LazyStaggeredGridState$scrollPosition$1(java.lang.Object obj) {
        super(2, obj, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
    }
}
