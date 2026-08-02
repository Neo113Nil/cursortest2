package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieRetrySignal;", "rememberLottieRetrySignal", "(Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieRetrySignal;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LottieRetrySignalKt {
    public static final com.airbnb.lottie.compose.LottieRetrySignal rememberLottieRetrySignal(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1266611990);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1266611990, i, -1, "com.airbnb.lottie.compose.rememberLottieRetrySignal (LottieRetrySignal.kt:17)");
        }
        composer.startReplaceableGroup(1025108850);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.airbnb.lottie.compose.LottieRetrySignal();
            composer.updateRememberedValue(rememberedValue);
        }
        com.airbnb.lottie.compose.LottieRetrySignal lottieRetrySignal = (com.airbnb.lottie.compose.LottieRetrySignal) rememberedValue;
        composer.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieRetrySignal;
    }
}
