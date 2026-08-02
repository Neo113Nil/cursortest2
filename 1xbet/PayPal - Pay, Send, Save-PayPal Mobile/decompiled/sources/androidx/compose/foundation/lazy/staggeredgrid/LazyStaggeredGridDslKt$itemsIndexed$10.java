package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$10 implements kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function5<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, java.lang.Integer, T, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ T[] getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope lazyStaggeredGridItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
        invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composer.changed(i) ? 32 : 16;
        }
        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(425846862, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:508)");
        }
        this.Camera2StreamConfigurationMap.invoke(lazyStaggeredGridItemScope, java.lang.Integer.valueOf(i), this.getHighResolutionOutputSizeshNQ4ISI[i], composer, java.lang.Integer.valueOf(i3 & 126));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$10(kotlin.jvm.functions.Function5<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, ? super java.lang.Integer, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, T[] tArr) {
        this.Camera2StreamConfigurationMap = function5;
        this.getHighResolutionOutputSizeshNQ4ISI = tArr;
    }
}
