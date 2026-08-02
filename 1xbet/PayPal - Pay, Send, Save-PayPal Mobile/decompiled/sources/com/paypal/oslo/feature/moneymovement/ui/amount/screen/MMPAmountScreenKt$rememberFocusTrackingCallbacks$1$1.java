package com.paypal.oslo.feature.moneymovement.ui.amount.screen;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/amount/screen/MMPAmountScreenKt$rememberFocusTrackingCallbacks$1$1;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionCallbacks;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputCallbacks;", "getAmountInputCallbacks", "()Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputCallbacks;", "amountInputCallbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/crossborderherocurrency/CrossBorderHeroCurrencyCallbacks;", "getCrossBorderCallbacks", "()Lcom/paypal/oslo/feature/moneymovement/api/amount/component/crossborderherocurrency/CrossBorderHeroCurrencyCallbacks;", "crossBorderCallbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerCallbacks;", "getCurrencyPickerCallbacks", "()Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerCallbacks;", "currencyPickerCallbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencyexchangeaction/CurrencyExchangeActionCallbacks;", "getCurrencyExchangeActionCallbacks", "()Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencyexchangeaction/CurrencyExchangeActionCallbacks;", "currencyExchangeActionCallbacks"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MMPAmountScreenKt$rememberFocusTrackingCallbacks$1$1 implements com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks {
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> getHighSpeedVideoFpsRanges;

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks $r8$lambda$QEIRQMtiZEgeX6jPLUppMAefLEA(com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks crossBorderHeroCurrencyCallbacks) {
        return crossBorderHeroCurrencyCallbacks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    MMPAmountScreenKt$rememberFocusTrackingCallbacks$1$1(androidx.compose.runtime.State<? extends com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state2) {
        this.Camera2StreamConfigurationMap = state;
        this.getHighSpeedVideoFpsRanges = state2;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks
    public final com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks getAmountInputCallbacks() {
        com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks access$rememberFocusTrackingCallbacks$lambda$0 = com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.access$rememberFocusTrackingCallbacks$lambda$0(this.Camera2StreamConfigurationMap);
        if (access$rememberFocusTrackingCallbacks$lambda$0 != null) {
            return access$rememberFocusTrackingCallbacks$lambda$0.getAmountInputCallbacks();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks
    public final com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks getCrossBorderCallbacks() {
        final com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks crossBorderCallbacks;
        com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks access$rememberFocusTrackingCallbacks$lambda$0 = com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.access$rememberFocusTrackingCallbacks$lambda$0(this.Camera2StreamConfigurationMap);
        return (access$rememberFocusTrackingCallbacks$lambda$0 == null || (crossBorderCallbacks = access$rememberFocusTrackingCallbacks$lambda$0.getCrossBorderCallbacks()) == null) ? null : new com.paypal.oslo.feature.moneymovement.ui.amount.screen.FocusTrackingCrossBorderCallbacks(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$rememberFocusTrackingCallbacks$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt$rememberFocusTrackingCallbacks$1$1.$r8$lambda$QEIRQMtiZEgeX6jPLUppMAefLEA(com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks.this);
            }
        }, com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.access$rememberFocusTrackingCallbacks$lambda$1(this.getHighSpeedVideoFpsRanges));
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks
    public final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks getCurrencyPickerCallbacks() {
        com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks access$rememberFocusTrackingCallbacks$lambda$0 = com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.access$rememberFocusTrackingCallbacks$lambda$0(this.Camera2StreamConfigurationMap);
        if (access$rememberFocusTrackingCallbacks$lambda$0 != null) {
            return access$rememberFocusTrackingCallbacks$lambda$0.getCurrencyPickerCallbacks();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks
    public final com.paypal.oslo.feature.moneymovement.api.amount.component.currencyexchangeaction.CurrencyExchangeActionCallbacks getCurrencyExchangeActionCallbacks() {
        com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks access$rememberFocusTrackingCallbacks$lambda$0 = com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.access$rememberFocusTrackingCallbacks$lambda$0(this.Camera2StreamConfigurationMap);
        if (access$rememberFocusTrackingCallbacks$lambda$0 != null) {
            return access$rememberFocusTrackingCallbacks$lambda$0.getCurrencyExchangeActionCallbacks();
        }
        return null;
    }
}
