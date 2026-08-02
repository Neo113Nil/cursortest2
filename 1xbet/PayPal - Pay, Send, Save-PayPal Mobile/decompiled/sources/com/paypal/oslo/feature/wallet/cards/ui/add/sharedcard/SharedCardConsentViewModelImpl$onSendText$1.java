package com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl$onSendText$1", f = "SharedCardConsentViewModelImpl.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class SharedCardConsentViewModelImpl$onSendText$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.cards.domain.usecase.AddCardUseCase addCardUseCase;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            addCardUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError, com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult>> invoke = addCardUseCase.invoke(this.getHighSpeedVideoSizes);
            coroutineDispatcher = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow flowOn = kotlinx.coroutines.flow.FlowKt.flowOn(invoke, coroutineDispatcher);
            final com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl sharedCardConsentViewModelImpl = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (flowOn.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl$onSendText$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
                    arrow.core.Either either = (arrow.core.Either) obj2;
                    com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl sharedCardConsentViewModelImpl2 = com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl.this;
                    if (either instanceof arrow.core.Either.Right) {
                        sharedCardConsentViewModelImpl2.Camera2StreamConfigurationMap = (com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult) ((arrow.core.Either.Right) either).getValue();
                        mutableStateFlow3 = sharedCardConsentViewModelImpl2.getOutputFormats;
                        mutableStateFlow4 = sharedCardConsentViewModelImpl2.getOutputFormats;
                        mutableStateFlow3.setValue(com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState.copy$default((com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState) mutableStateFlow4.getValue(), null, null, null, false, false, null, true, 47, null));
                    } else if (either instanceof arrow.core.Either.Left) {
                        mutableStateFlow = sharedCardConsentViewModelImpl2.getOutputFormats;
                        mutableStateFlow2 = sharedCardConsentViewModelImpl2.getOutputFormats;
                        mutableStateFlow.setValue(com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState.copy$default((com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState) mutableStateFlow2.getValue(), null, null, null, false, false, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_add_error_server, new java.lang.Object[0]), false, 79, null));
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl$onSendText$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl$onSendText$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedCardConsentViewModelImpl$onSendText$1(com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl sharedCardConsentViewModelImpl, com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl$onSendText$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = sharedCardConsentViewModelImpl;
        this.getHighSpeedVideoSizes = creditCard;
    }
}
