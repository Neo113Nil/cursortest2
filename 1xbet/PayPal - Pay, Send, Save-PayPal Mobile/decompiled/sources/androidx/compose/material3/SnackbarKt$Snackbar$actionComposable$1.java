package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SnackbarKt$Snackbar$actionComposable$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.SnackbarData Camera2StreamConfigurationMap;
    final /* synthetic */ long getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1378313599, intValue, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:211)");
            }
            androidx.compose.material3.ButtonColors m2959textButtonColorsro_MJ88 = androidx.compose.material3.ButtonDefaults.INSTANCE.m2959textButtonColorsro_MJ88(0L, this.getHighSpeedVideoFpsRangesFor, 0L, 0L, composer2, 24576, 13);
            boolean changed = composer2.changed(this.Camera2StreamConfigurationMap);
            final androidx.compose.material3.SnackbarData snackbarData = this.Camera2StreamConfigurationMap;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.SnackbarData.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            final java.lang.String str = this.getHighSpeedVideoSizes;
            androidx.compose.material3.ButtonKt.TextButton(function0, null, false, null, m2959textButtonColorsro_MJ88, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(521110564, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue2 = num2.intValue();
                    if (composer4.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(521110564, intValue2, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:214)");
                        }
                        androidx.compose.material3.TextKt.m3985TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 262142);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer4.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, composer2, 54), composer2, 805306368, 494);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.SnackbarData snackbarData) {
        snackbarData.performAction();
        return kotlin.Unit.INSTANCE;
    }

    SnackbarKt$Snackbar$actionComposable$1(long j, androidx.compose.material3.SnackbarData snackbarData, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = j;
        this.Camera2StreamConfigurationMap = snackbarData;
        this.getHighSpeedVideoSizes = str;
    }
}
