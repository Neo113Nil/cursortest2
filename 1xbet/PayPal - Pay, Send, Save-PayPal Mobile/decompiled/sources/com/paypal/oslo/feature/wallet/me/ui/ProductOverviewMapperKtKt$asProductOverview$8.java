package com.paypal.oslo.feature.wallet.me.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt", f = "ProductOverviewMapperKt.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {563, 570, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_TOKEN}, m = "asProductOverview", n = {"$this$asProductOverview", "formatCurrencyUseCase", "overview", "$i$a$-let-ProductOverviewMapperKtKt$asProductOverview$9", "$this$asProductOverview", "formatCurrencyUseCase", "overview", "$i$a$-let-ProductOverviewMapperKtKt$asProductOverview$9", "$this$asProductOverview", "formatCurrencyUseCase", "overview", "nextBestAction", "$i$a$-let-ProductOverviewMapperKtKt$asProductOverview$9", "$i$a$-let-ProductOverviewMapperKtKt$asProductOverview$9$1"}, nl = {562, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$7", "I$0", "I$1"}, v = 2)
/* loaded from: classes16.dex */
final class ProductOverviewMapperKtKt$asProductOverview$8 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    int getValidOutputFormatsForInputhNQ4ISI;
    /* synthetic */ java.lang.Object isOutputSupportedForhNQ4ISI;
    java.lang.Object unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.isOutputSupportedForhNQ4ISI = obj;
        this.getValidOutputFormatsForInputhNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.asProductOverview((com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct) null, (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview>) this);
    }

    ProductOverviewMapperKtKt$asProductOverview$8(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$8> continuation) {
        super(continuation);
    }
}
