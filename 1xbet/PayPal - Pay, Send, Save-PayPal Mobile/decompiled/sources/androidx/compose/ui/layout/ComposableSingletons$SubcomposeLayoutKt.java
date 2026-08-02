package androidx.compose.ui.layout;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$SubcomposeLayoutKt {
    public static final androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt INSTANCE = new androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(641200809, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt$lambda$641200809$1
        public final void getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(641200809, i, -1, "androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.lambda$641200809.<anonymous> (SubcomposeLayout.kt:640)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            getHighSpeedVideoSizes(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    });

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$641200809$ui() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
