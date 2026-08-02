package androidx.compose.ui.window;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$AndroidDialog_androidKt {
    public static final androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt INSTANCE = new androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(210148896, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt$lambda$210148896$1
        public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(210148896, i, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt.lambda$210148896.<anonymous> (AndroidDialog.android.kt:249)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            getHighResolutionOutputSizeshNQ4ISI(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    });

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$210148896$ui() {
        return Camera2StreamConfigurationMap;
    }
}
