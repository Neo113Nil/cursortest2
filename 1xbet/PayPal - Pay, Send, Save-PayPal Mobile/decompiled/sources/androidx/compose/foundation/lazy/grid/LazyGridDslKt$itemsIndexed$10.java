package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$10 implements kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.grid.LazyGridItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function5<androidx.compose.foundation.lazy.grid.LazyGridItemScope, java.lang.Integer, T, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ T[] getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.grid.LazyGridItemScope lazyGridItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
        invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.lazy.grid.LazyGridItemScope lazyGridItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i2;
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
            androidx.compose.runtime.ComposerKt.traceEventStart(49283819, i3, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:650)");
        }
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(lazyGridItemScope, java.lang.Integer.valueOf(i), this.getHighSpeedVideoFpsRangesFor[i], composer, java.lang.Integer.valueOf(i3 & 126));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$10(kotlin.jvm.functions.Function5<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super java.lang.Integer, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, T[] tArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = function5;
        this.getHighSpeedVideoFpsRangesFor = tArr;
    }
}
