package androidx.compose.ui.platform;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$Wrapper_androidKt {
    public static final androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt INSTANCE = new androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1759434350, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt$lambda$-1759434350$1
        public final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1759434350, i, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda$-1759434350.<anonymous> (Wrapper.android.kt:112)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            getHighSpeedVideoFpsRanges(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    });

    /* renamed from: getLambda$-1759434350$ui, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m7730getLambda$1759434350$ui() {
        return getHighSpeedVideoFpsRanges;
    }
}
