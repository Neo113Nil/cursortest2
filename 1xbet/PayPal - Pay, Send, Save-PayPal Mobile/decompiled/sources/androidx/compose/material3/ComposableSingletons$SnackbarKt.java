package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$SnackbarKt {
    public static final androidx.compose.material3.ComposableSingletons$SnackbarKt INSTANCE = new androidx.compose.material3.ComposableSingletons$SnackbarKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(984817901, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ComposableSingletons$SnackbarKt$lambda$984817901$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            int intValue = num.intValue();
            if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                composer2.skipToGroupEnd();
            } else {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(984817901, intValue, -1, "androidx.compose.material3.ComposableSingletons$SnackbarKt.lambda$984817901.<anonymous> (Snackbar.kt:226)");
                }
                androidx.compose.ui.graphics.vector.ImageVector close$material3 = androidx.compose.material3.internal.Icons.Filled.INSTANCE.getClose$material3();
                androidx.compose.material3.internal.Strings.Companion companion = androidx.compose.material3.internal.Strings.INSTANCE;
                androidx.compose.material3.IconKt.m3375Iconww6aTOc(close$material3, androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_snackbar_dismiss), composer2, 0), (androidx.compose.ui.Modifier) null, 0L, composer2, 0, 12);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    });

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$984817901$material3() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
