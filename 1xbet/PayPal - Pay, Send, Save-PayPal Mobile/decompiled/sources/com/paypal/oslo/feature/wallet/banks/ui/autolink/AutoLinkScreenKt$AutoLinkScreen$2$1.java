package com.paypal.oslo.feature.wallet.banks.ui.autolink;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$2$1", f = "AutoLinkScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AutoLinkScreenKt$AutoLinkScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction getHighSpeedVideoSizes;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizesFor;
    final /* synthetic */ java.lang.String getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getInputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getOutputFormats;
    final /* synthetic */ java.lang.String getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getOutputSizeshNQ4ISI;
    int getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputStallDuration != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getOutputSizes.initialize(this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getInputFormats, this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$2$1(this.getOutputSizes, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getInputFormats, this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoLinkScreenKt$AutoLinkScreen$2$1(com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel autoLinkViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str7, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$2$1> continuation) {
        super(2, continuation);
        this.getOutputSizes = autoLinkViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getOutputFormats = str2;
        this.getInputFormats = str3;
        this.getOutputSizeshNQ4ISI = integrationType;
        this.getHighSpeedVideoFpsRanges = str4;
        this.getHighResolutionOutputSizeshNQ4ISI = str5;
        this.getOutputMinFrameDuration = str6;
        this.getHighSpeedVideoSizes = externalBankAccessAction;
        this.Camera2StreamConfigurationMap = instantBankConfirmationBankDetails;
        this.getHighSpeedVideoSizesFor = str7;
        this.getInputSizeshNQ4ISI = addFIFlow;
    }
}
