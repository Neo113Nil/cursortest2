package com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1$2", f = "CurrencyPickerViewModel.kt", i = {0, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE}, m = "emit", n = {"result", "result"}, nl = {269, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes13.dex */
final class CurrencyPickerViewModel$loadCurrencies$1$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1.AnonymousClass2<T> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CurrencyPickerViewModel$loadCurrencies$1$2$emit$1(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1.AnonymousClass2<? super T> anonymousClass2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1$2$emit$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = anonymousClass2;
    }
}
