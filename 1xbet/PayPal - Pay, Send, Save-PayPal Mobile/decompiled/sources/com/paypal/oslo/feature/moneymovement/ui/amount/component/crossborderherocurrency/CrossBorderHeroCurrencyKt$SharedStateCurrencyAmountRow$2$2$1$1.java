package com.paypal.oslo.feature.moneymovement.ui.amount.component.crossborderherocurrency;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CrossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1 implements androidx.compose.ui.platform.PlatformTextInputInterceptor {
    public static final com.paypal.oslo.feature.moneymovement.ui.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1 Camera2StreamConfigurationMap = new com.paypal.oslo.feature.moneymovement.ui.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.platform.PlatformTextInputInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object interceptStartInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest platformTextInputMethodRequest, androidx.compose.ui.platform.PlatformTextInputSession platformTextInputSession, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.moneymovement.ui.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1 crossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.moneymovement.ui.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1) {
            crossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1 = (com.paypal.oslo.feature.moneymovement.ui.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1) continuation;
            if ((crossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                crossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = crossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = crossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    crossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1.getHighSpeedVideoFpsRanges = 1;
                    if (kotlinx.coroutines.DelayKt.awaitCancellation(crossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        crossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1 = new com.paypal.oslo.feature.moneymovement.ui.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1(this, continuation);
        java.lang.Object obj2 = crossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = crossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1$interceptStartInputMethod$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    CrossBorderHeroCurrencyKt$SharedStateCurrencyAmountRow$2$2$1$1() {
    }
}
