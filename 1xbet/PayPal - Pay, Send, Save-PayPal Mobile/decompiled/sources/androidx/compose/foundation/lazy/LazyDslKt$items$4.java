package androidx.compose.foundation.lazy;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyDslKt$items$4 implements kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ java.util.List<T> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, T, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
            androidx.compose.runtime.ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
        }
        this.getHighSpeedVideoSizes.invoke(lazyItemScope, this.getHighSpeedVideoFpsRangesFor.get(i), composer, java.lang.Integer.valueOf(i3 & 14));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyDslKt$items$4(kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.LazyItemScope, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, java.util.List<? extends T> list) {
        this.getHighSpeedVideoSizes = function4;
        this.getHighSpeedVideoFpsRangesFor = list;
    }
}
