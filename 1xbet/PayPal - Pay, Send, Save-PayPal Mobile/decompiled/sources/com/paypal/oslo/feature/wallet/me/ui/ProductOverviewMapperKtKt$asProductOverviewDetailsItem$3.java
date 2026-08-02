package com.paypal.oslo.feature.wallet.me.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt", f = "ProductOverviewMapperKt.kt", i = {0, 0}, l = {329}, m = "asProductOverviewDetailsItem", n = {"$this$asProductOverviewDetailsItem", "formatCurrencyUseCase"}, nl = {328}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes16.dex */
final class ProductOverviewMapperKtKt$asProductOverviewDetailsItem$3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.asProductOverviewDetailsItem((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.OnTrack) null, (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item>) this);
    }

    ProductOverviewMapperKtKt$asProductOverviewDetailsItem$3(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverviewDetailsItem$3> continuation) {
        super(continuation);
    }
}
