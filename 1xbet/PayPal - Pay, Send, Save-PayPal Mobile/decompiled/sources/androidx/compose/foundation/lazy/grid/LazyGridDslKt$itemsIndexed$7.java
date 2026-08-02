package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$7 implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> {
    final /* synthetic */ T[] getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Integer, T, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    public final java.lang.Object invoke(int i) {
        return this.getHighSpeedVideoFpsRangesFor.invoke(java.lang.Integer.valueOf(i), this.getHighSpeedVideoFpsRanges[i]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$7(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, T[] tArr) {
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.getHighSpeedVideoFpsRanges = tArr;
    }
}
