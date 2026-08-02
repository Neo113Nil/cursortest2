package com.paypal.oslo.feature.wallet.me.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt", f = "ProductOverviewMapperKt.kt", i = {0, 0, 0, 0}, l = {411}, m = "asProductOverview", n = {"$this$asProductOverview", "formatCurrencyUseCase", "overview", "$i$a$-let-ProductOverviewMapperKtKt$asProductOverview$7"}, nl = {410}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes16.dex */
final class ProductOverviewMapperKtKt$asProductOverview$6 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.asProductOverview((com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoProduct) null, (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview>) this);
    }

    ProductOverviewMapperKtKt$asProductOverview$6(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$6> continuation) {
        super(continuation);
    }
}
