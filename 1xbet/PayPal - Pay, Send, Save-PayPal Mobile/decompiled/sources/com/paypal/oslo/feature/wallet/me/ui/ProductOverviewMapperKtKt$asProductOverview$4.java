package com.paypal.oslo.feature.wallet.me.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt", f = "ProductOverviewMapperKt.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {161, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 174, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 250}, m = "asProductOverview", n = {"$this$asProductOverview", "formatCurrencyUseCase", "overview", "$i$a$-let-ProductOverviewMapperKtKt$asProductOverview$5", "$this$asProductOverview", "formatCurrencyUseCase", "overview", "$i$a$-let-ProductOverviewMapperKtKt$asProductOverview$5", "$this$asProductOverview", "formatCurrencyUseCase", "overview", "$i$a$-let-ProductOverviewMapperKtKt$asProductOverview$5", "$this$asProductOverview", "formatCurrencyUseCase", "overview", "$i$a$-let-ProductOverviewMapperKtKt$asProductOverview$5", "$this$asProductOverview", "formatCurrencyUseCase", "overview", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "plan", "$i$a$-let-ProductOverviewMapperKtKt$asProductOverview$5", "$i$f$map", "$i$f$mapTo", "$i$a$-map-ProductOverviewMapperKtKt$asProductOverview$5$1"}, nl = {160, 167, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 729}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "L$8", "L$9", "L$11", "L$12", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes16.dex */
final class ProductOverviewMapperKtKt$asProductOverview$4 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
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
    /* synthetic */ java.lang.Object isOutputSupportedFor;
    java.lang.Object isOutputSupportedForhNQ4ISI;
    java.lang.Object toString;
    java.lang.Object unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.isOutputSupportedFor = obj;
        this.getValidOutputFormatsForInputhNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt.asProductOverview((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct) null, (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview>) this);
    }

    ProductOverviewMapperKtKt$asProductOverview$4(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverviewMapperKtKt$asProductOverview$4> continuation) {
        super(continuation);
    }
}
