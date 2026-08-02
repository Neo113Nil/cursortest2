package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$deleteCard$2$1", f = "PayairCardRepository.kt", i = {}, l = {343}, m = "invokeSuspend", n = {}, nl = {my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class PayairCardRepository$deleteCard$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ arrow.core.raise.Raise<com.paypal.oslo.feature.taptopay.domain.model.card.DeleteCardError> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sdkTokenManager = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = 1;
            obj = sdkTokenManager.deleteCard(this.getHighSpeedVideoSizes, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.payair.model.Response response = (com.payair.model.Response) obj;
        if (response instanceof com.payair.model.Response.Success) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairDelete was successful", null, null, 6, null);
            return kotlin.Unit.INSTANCE;
        }
        if (!(response instanceof com.payair.model.Response.Error)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.payair.model.Response.Error error = (com.payair.model.Response.Error) response;
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayairDelete failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorCode", kotlin.coroutines.jvm.internal.Boxing.boxInt(error.getErrorCode()))), null, null, 12, null);
        this.getHighResolutionOutputSizeshNQ4ISI.raise(new com.paypal.oslo.feature.taptopay.domain.model.card.DeleteCardError.DefaultError("Delete card failed, with error: ".concat(java.lang.String.valueOf(error.getErrorCode())), null, 2, null));
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$deleteCard$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$deleteCard$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PayairCardRepository$deleteCard$2$1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository payairCardRepository, java.lang.String str, arrow.core.raise.Raise<? super com.paypal.oslo.feature.taptopay.domain.model.card.DeleteCardError> raise, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$deleteCard$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = payairCardRepository;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = raise;
    }
}
