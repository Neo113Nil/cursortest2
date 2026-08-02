package com.paypal.oslo.feature.wallet.me.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt", f = "ProductOverviewMapperKt.kt", i = {0, 0, 0, 0}, l = {82}, m = "asProductOverview", n = {"$this$asProductOverview", "formatCurrencyUseCase", "overview", "$i$a$-let-ProductOverviewMapperKtKt$asProductOverview$3"}, nl = {81}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes16.dex */
final class ProductOverviewMapperKtKt$asProductOverview$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
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
        return com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.asProductOverview((com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct) null, (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview>) this);
    }

    ProductOverviewMapperKtKt$asProductOverview$2(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$2> continuation) {
        super(continuation);
    }
}
