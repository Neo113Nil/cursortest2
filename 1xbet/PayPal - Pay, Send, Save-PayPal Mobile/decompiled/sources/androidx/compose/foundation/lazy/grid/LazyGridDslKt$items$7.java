package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyGridDslKt$items$7 implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Object> getHighSpeedVideoFpsRanges;
    final /* synthetic */ T[] getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    public final java.lang.Object invoke(int i) {
        return this.getHighSpeedVideoFpsRanges.invoke(this.getHighSpeedVideoSizes[i]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$items$7(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, T[] tArr) {
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoSizes = tArr;
    }
}
