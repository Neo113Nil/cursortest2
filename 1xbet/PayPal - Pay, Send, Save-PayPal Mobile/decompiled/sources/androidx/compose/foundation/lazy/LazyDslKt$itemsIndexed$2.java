package androidx.compose.foundation.lazy;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyDslKt$itemsIndexed$2 implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Integer, T, java.lang.Object> Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<T> getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    public final java.lang.Object invoke(int i) {
        return this.Camera2StreamConfigurationMap.invoke(java.lang.Integer.valueOf(i), this.getHighResolutionOutputSizeshNQ4ISI.get(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyDslKt$itemsIndexed$2(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, java.util.List<? extends T> list) {
        this.Camera2StreamConfigurationMap = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }
}
