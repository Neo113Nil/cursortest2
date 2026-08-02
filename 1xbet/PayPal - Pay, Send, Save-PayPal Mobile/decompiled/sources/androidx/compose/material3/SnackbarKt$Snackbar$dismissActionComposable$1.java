package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SnackbarKt$Snackbar$dismissActionComposable$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.SnackbarData getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1812633777, intValue, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:223)");
            }
            boolean changed = composer2.changed(this.getHighResolutionOutputSizeshNQ4ISI);
            final androidx.compose.material3.SnackbarData snackbarData = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1.getHighSpeedVideoFpsRanges(androidx.compose.material3.SnackbarData.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.material3.IconButtonKt.IconButton((kotlin.jvm.functions.Function0) rememberedValue, null, false, null, null, null, androidx.compose.material3.ComposableSingletons$SnackbarKt.INSTANCE.getLambda$984817901$material3(), composer2, 1572864, 62);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.material3.SnackbarData snackbarData) {
        snackbarData.dismiss();
        return kotlin.Unit.INSTANCE;
    }

    SnackbarKt$Snackbar$dismissActionComposable$1(androidx.compose.material3.SnackbarData snackbarData) {
        this.getHighResolutionOutputSizeshNQ4ISI = snackbarData;
    }
}
