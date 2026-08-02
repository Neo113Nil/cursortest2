package com.ingo.sdk.android.core.ux.composable;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class IngoCoreComposablesKt$debouncedClickable$1 implements kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.Indication getHighSpeedVideoFpsRanges;
    final /* synthetic */ long getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.Composer composer2 = composer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier2, "");
        composer2.startReplaceGroup(-1187836702);
        composer2.startReplaceGroup(1849434622);
        java.lang.Object rememberedValue = composer2.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer2.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        composer2.endReplaceGroup();
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.Indication indication = this.getHighSpeedVideoFpsRanges;
        composer2.startReplaceGroup(-1746271574);
        boolean changed = composer2.changed(this.getHighSpeedVideoFpsRangesFor);
        boolean changed2 = composer2.changed(this.Camera2StreamConfigurationMap);
        final long j = this.getHighSpeedVideoFpsRangesFor;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.Camera2StreamConfigurationMap;
        java.lang.Object rememberedValue2 = composer2.rememberedValue();
        if ((changed | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt$debouncedClickable$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt$debouncedClickable$1.getHighSpeedVideoFpsRangesFor(j, function0, mutableState);
                }
            };
            composer2.updateRememberedValue(rememberedValue2);
        }
        composer2.endReplaceGroup();
        androidx.compose.ui.Modifier m1318clickableO2vRcR0$default = androidx.compose.foundation.ClickableKt.m1318clickableO2vRcR0$default(modifier2, mutableInteractionSource, indication, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, 28, null);
        composer2.endReplaceGroup();
        return m1318clickableO2vRcR0$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(long j, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - ((java.lang.Number) mutableState.getValue()).longValue() >= j) {
            mutableState.setValue(java.lang.Long.valueOf(currentTimeMillis));
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    IngoCoreComposablesKt$debouncedClickable$1(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.Indication indication, long j, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighResolutionOutputSizeshNQ4ISI = mutableInteractionSource;
        this.getHighSpeedVideoFpsRanges = indication;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.Camera2StreamConfigurationMap = function0;
    }
}
