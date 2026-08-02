package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class CaptureCheckImagesViewProvider$View$3$1$1$1$inlineContentMap$1 implements kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if ((intValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            composer2.startReplaceGroup(5004770);
            final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$1$inlineContentMap$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$1$inlineContentMap$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            composer2.endReplaceGroup();
            final com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider = this.getHighSpeedVideoFpsRanges;
            androidx.compose.material3.IconButtonKt.IconButton(function0, null, false, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1786487319, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$3$1$1$1$inlineContentMap$1.2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
                    androidx.compose.runtime.Composer composer4 = composer3;
                    if ((num2.intValue() & 11) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                    } else {
                        androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.ingo.sdk.android.ux.R.drawable.ic_baseline_info_24, composer4, 0);
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.fee_info_content_description, composer4, 0);
                        currentTheme = com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider.this.currentTheme(composer4, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable);
                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoIcon(painterResource, stringResource, 0, android.graphics.Color.parseColor(currentTheme.getSecondaryColor()), null, false, null, composer4, 8, 116);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, composer2, 54), composer2, 196614, 30);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(true));
        return kotlin.Unit.INSTANCE;
    }

    CaptureCheckImagesViewProvider$View$3$1$1$1$inlineContentMap$1(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider) {
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighSpeedVideoFpsRanges = captureCheckImagesViewProvider;
    }
}
