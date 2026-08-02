package com.paypal.oslo.feature.wallet.cards.ui.expired;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl$initialize$2", f = "ExpiredCardViewModelImpl.kt", i = {1, 1, 1, 1, 1}, l = {125, 137}, m = "invokeSuspend", n = {"profileResult", "this_$iv", "profileData", "$i$f$fold", "$i$a$-fold-ExpiredCardViewModelImpl$initialize$2$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 132}, s = {"L$0", "L$1", "L$4", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class ExpiredCardViewModelImpl$initialize$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0055, code lost:
    
        if (r12 != r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase getUserProfileUseCase;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl expiredCardViewModelImpl;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase getCardDefinitionsUseCase;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand;
        java.util.List list;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getUserProfileUseCase = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Error, com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success>> invoke = getUserProfileUseCase.invoke();
            coroutineDispatcher = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.getOutputMinFrameDuration = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(kotlinx.coroutines.flow.FlowKt.flowOn(invoke, coroutineDispatcher), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cardBrand = (com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand) this.getOutputFormats;
                expiredCardViewModelImpl = (com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                list = (java.util.List) ((arrow.core.Either) obj).getOrNull();
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition) obj2).getBrand() == cardBrand) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition = (com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition) obj2;
                    if (cardDefinition != null) {
                        expiredCardViewModelImpl.getHighSpeedVideoSizes = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.ExpirationDateValidator(new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationMonthRule(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionUpdateValidationExtKt.toExpiryMonthMetadataForUpdate(cardDefinition)), new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationYearRule(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionUpdateValidationExtKt.toExpiryYearMetadataForUpdate(cardDefinition)));
                        expiredCardViewModelImpl.getOutputFormats = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CvvValidator(new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionUpdateValidationExtKt.toCvvMetadataForUpdate(cardDefinition)));
                    }
                }
                mutableStateFlow2 = expiredCardViewModelImpl.getHighSpeedVideoFpsRangesFor;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState.copy$default((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) value2, null, null, null, null, false, false, false, 63, null)));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        expiredCardViewModelImpl = this.getInputSizeshNQ4ISI;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success success = (com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success) ((arrow.core.Either.Right) either).getValue();
            getCardDefinitionsUseCase = expiredCardViewModelImpl.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition>>> invoke2 = getCardDefinitionsUseCase.invoke(new com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsRequest(success.getUser().getAccountCountryCode(), com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.UPDATE));
            coroutineDispatcher2 = expiredCardViewModelImpl.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow flowOn = kotlinx.coroutines.flow.FlowKt.flowOn(invoke2, coroutineDispatcher2);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighSpeedVideoSizesFor = expiredCardViewModelImpl;
            this.getOutputFormats = cardBrand2;
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(success);
            this.getHighSpeedVideoSizes = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getOutputMinFrameDuration = 2;
            obj = kotlinx.coroutines.flow.FlowKt.first(flowOn, this);
            if (obj != coroutine_suspended) {
                cardBrand = cardBrand2;
                list = (java.util.List) ((arrow.core.Either) obj).getOrNull();
                if (list != null) {
                }
                mutableStateFlow2 = expiredCardViewModelImpl.getHighSpeedVideoFpsRangesFor;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState.copy$default((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) value2, null, null, null, null, false, false, false, 63, null)));
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow = expiredCardViewModelImpl.getHighSpeedVideoFpsRangesFor;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState.copy$default((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) value, null, null, null, null, false, false, false, 63, null)));
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl$initialize$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl$initialize$2(this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpiredCardViewModelImpl$initialize$2(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl expiredCardViewModelImpl, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl$initialize$2> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = expiredCardViewModelImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = cardBrand;
    }
}
