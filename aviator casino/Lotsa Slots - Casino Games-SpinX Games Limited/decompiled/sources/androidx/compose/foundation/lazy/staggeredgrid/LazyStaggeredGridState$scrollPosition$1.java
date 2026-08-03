package androidx.compose.foundation.lazy.staggeredgrid;

/* compiled from: LazyStaggeredGridState.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, int[]> {
    LazyStaggeredGridState$scrollPosition$1(java.lang.Object obj) {
        super(2, obj, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ int[] invoke(java.lang.Integer num, java.lang.Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }

    public final int[] invoke(int i, int i2) {
        int[] fillNearestIndices;
        fillNearestIndices = ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) this.receiver).fillNearestIndices(i, i2);
        return fillNearestIndices;
    }
}
