package com.ingo.sdk.android.core.ux.composable;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class IngoCoreComposablesKt$TopAppBar$4 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            composer2.startReplaceGroup(5004770);
            boolean changed = composer2.changed(this.getHighSpeedVideoSizes);
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoSizes;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt$TopAppBar$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt$TopAppBar$4.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            composer2.endReplaceGroup();
            boolean z = this.getHighSpeedVideoFpsRanges;
            final int i = this.getHighResolutionOutputSizeshNQ4ISI;
            final java.lang.String str = this.Camera2StreamConfigurationMap;
            final int i2 = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.material3.IconButtonKt.IconButton((kotlin.jvm.functions.Function0) rememberedValue, null, z, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1658968288, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt$TopAppBar$4.2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    if ((num2.intValue() & 11) != 2 || !composer4.getSkipping()) {
                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoIcon(androidx.compose.ui.res.PainterResources_androidKt.painterResource(i, composer4, 0), str, 0, i2, null, false, null, composer4, 8, 116);
                    } else {
                        composer4.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, composer2, 54), composer2, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function0 function0) {
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "TopAppBarIconButtonClick", null, 2, null);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    IngoCoreComposablesKt$TopAppBar$4(kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z, int i, java.lang.String str, int i2) {
        this.getHighSpeedVideoSizes = function0;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = i2;
    }
}
