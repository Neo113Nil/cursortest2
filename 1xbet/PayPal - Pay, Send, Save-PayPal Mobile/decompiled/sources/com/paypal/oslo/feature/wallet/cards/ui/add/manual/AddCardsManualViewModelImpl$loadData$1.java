package com.paypal.oslo.feature.wallet.cards.ui.add.manual;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$loadData$1", f = "AddCardsManualViewModel.kt", i = {1, 1, 1, 1, 1}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT, 530}, m = "invokeSuspend", n = {"profileResult", "this_$iv", "profileData", "$i$f$fold", "$i$a$-fold-AddCardsManualViewModelImpl$loadData$1$3"}, nl = {androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X, 523}, s = {"L$0", "L$1", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class AddCardsManualViewModelImpl$loadData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r9 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenStateManager addCardScreenStateManager;
        com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase getUserProfileUseCase;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        final com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenStateManager addCardScreenStateManager2;
        com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase getCardDefinitionsUseCase;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2;
        com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success success;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            addCardScreenStateManager = this.getOutputFormats.getOutputFormats;
            addCardScreenStateManager.transition(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$loadData$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState addCardScreenState;
                    addCardScreenState = com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.Loading.INSTANCE;
                    return addCardScreenState;
                }
            });
            getUserProfileUseCase = this.getOutputFormats.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Error, com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success>> invoke = getUserProfileUseCase.invoke();
            coroutineDispatcher = this.getOutputFormats.getOutputMinFrameDuration;
            this.getInputSizeshNQ4ISI = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(kotlinx.coroutines.flow.FlowKt.flowOn(invoke, coroutineDispatcher), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                success = (com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success) this.getOutputMinFrameDuration;
                addCardsManualViewModelImpl = (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.Either either = (arrow.core.Either) obj;
                com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.access$onDataLoaded(addCardsManualViewModelImpl, success.getUser(), (java.util.List) either.getOrNull(), either.isLeft());
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either2 = (arrow.core.Either) obj;
        addCardsManualViewModelImpl = this.getOutputFormats;
        if (either2 instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success success2 = (com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success) ((arrow.core.Either.Right) either2).getValue();
            getCardDefinitionsUseCase = addCardsManualViewModelImpl.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition>>> invoke2 = getCardDefinitionsUseCase.invoke(new com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsRequest(success2.getUser().getAccountCountryCode(), com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.ADD));
            coroutineDispatcher2 = addCardsManualViewModelImpl.getOutputMinFrameDuration;
            kotlinx.coroutines.flow.Flow flowOn = kotlinx.coroutines.flow.FlowKt.flowOn(invoke2, coroutineDispatcher2);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
            this.getHighSpeedVideoFpsRangesFor = addCardsManualViewModelImpl;
            this.getOutputMinFrameDuration = success2;
            this.getHighSpeedVideoFpsRanges = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getInputSizeshNQ4ISI = 2;
            obj = kotlinx.coroutines.flow.FlowKt.first(flowOn, this);
            if (obj != coroutine_suspended) {
                success = success2;
                arrow.core.Either either3 = (arrow.core.Either) obj;
                com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.access$onDataLoaded(addCardsManualViewModelImpl, success.getUser(), (java.util.List) either3.getOrNull(), either3.isLeft());
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (either2 instanceof arrow.core.Either.Left) {
            addCardScreenStateManager2 = addCardsManualViewModelImpl.getOutputFormats;
            addCardScreenStateManager2.transition(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$loadData$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$loadData$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this);
                }
            });
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState;
        addCardFormState = addCardsManualViewModelImpl.getOutputStallDuration;
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.withError$default(new com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady(addCardFormState, kotlin.collections.CollectionsKt.emptyList(), null, null, 12, null), com.paypal.pds.components.BannerStyle.Warning.INSTANCE, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong, new java.lang.Object[0]), null, 4, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$loadData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$loadData$1(this.getOutputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddCardsManualViewModelImpl$loadData$1(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$loadData$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = addCardsManualViewModelImpl;
    }
}
