package com.paypal.oslo.feature.wallet.cards.ui.add.manual;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$autoDetectCardBrand$1", f = "AddCardsManualViewModel.kt", i = {0}, l = {550}, m = "invokeSuspend", n = {"request"}, nl = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class AddCardsManualViewModelImpl$autoDetectCardBrand$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.cards.domain.usecase.AutodetectCardUseCase autodetectCardUseCase;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.wallet.cards.domain.autodetect.model.AutodetectCardRequest autodetectCardRequest = new com.paypal.oslo.feature.wallet.cards.domain.autodetect.model.AutodetectCardRequest(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
            autodetectCardUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.autodetect.model.AutodetectCardError, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition>>> invoke = autodetectCardUseCase.invoke(autodetectCardRequest);
            coroutineDispatcher = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autodetectCardRequest);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(kotlinx.coroutines.flow.FlowKt.flowOn(invoke, coroutineDispatcher), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List list = (java.util.List) ((arrow.core.Either) obj).getOrNull();
        if (list != null) {
            com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.access$processAndUpdateCardDefinitions(this.Camera2StreamConfigurationMap, list);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$autoDetectCardBrand$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$autoDetectCardBrand$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddCardsManualViewModelImpl$autoDetectCardBrand$1(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$autoDetectCardBrand$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.Camera2StreamConfigurationMap = addCardsManualViewModelImpl;
    }
}
