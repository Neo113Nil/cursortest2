package com.paypal.oslo.feature.balance.ui.autoReload.scheduled;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel", f = "AutoReloadScheduledViewModel.kt", i = {0, 0, 0}, l = {163}, m = "formatCurrency", n = {"currencyCode", "amount", "digits"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class AutoReloadScheduledViewModel$formatCurrency$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputFormats.getHighSpeedVideoFpsRangesFor(null, null, 0, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadScheduledViewModel$formatCurrency$1(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$formatCurrency$1> continuation) {
        super(continuation);
        this.getOutputFormats = autoReloadScheduledViewModel;
    }
}
