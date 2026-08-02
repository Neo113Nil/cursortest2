package androidx.compose.foundation.lazy;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyDslKt$items$2 implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> {
    final /* synthetic */ java.util.List<T> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Object> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    public final java.lang.Object invoke(int i) {
        return this.getHighSpeedVideoSizes.invoke(this.getHighSpeedVideoFpsRanges.get(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyDslKt$items$2(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, java.util.List<? extends T> list) {
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRanges = list;
    }
}
