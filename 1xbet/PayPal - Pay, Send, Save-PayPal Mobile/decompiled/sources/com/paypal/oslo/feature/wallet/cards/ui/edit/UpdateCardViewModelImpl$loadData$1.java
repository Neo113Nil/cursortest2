package com.paypal.oslo.feature.wallet.cards.ui.edit;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl$loadData$1", f = "UpdateCardViewModel.kt", i = {1, 1, 1, 1, 1, 1}, l = {200, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE}, m = "invokeSuspend", n = {"result", "this_$iv", "profileData", "userCountryCode", "$i$f$fold", "$i$a$-fold-UpdateCardViewModelImpl$loadData$1$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 215}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class UpdateCardViewModelImpl$loadData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl getInputFormats;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r12 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase getUserProfileUseCase;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl updateCardViewModelImpl;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardFormState updateCardFormState;
        com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success success;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputFormats.getOutputMinFrameDuration;
            mutableStateFlow.setValue(com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.Loading.INSTANCE);
            getUserProfileUseCase = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Error, com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success>> invoke = getUserProfileUseCase.invoke();
            coroutineDispatcher = this.getInputFormats.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDuration = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(kotlinx.coroutines.flow.FlowKt.flowOn(invoke, coroutineDispatcher), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                success = (com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success) this.getHighSpeedVideoSizesFor;
                updateCardViewModelImpl = (com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl.access$handleProfileLoadSuccess(updateCardViewModelImpl, success.getUser());
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        updateCardViewModelImpl = this.getInputFormats;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success success2 = (com.paypal.oslo.feature.wallet.cards.domain.usecase.UserProfileResult.Success) ((arrow.core.Either.Right) either).getValue();
            java.lang.String accountCountryCode = success2.getUser().getAccountCountryCode();
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighSpeedVideoSizes = updateCardViewModelImpl;
            this.getHighSpeedVideoSizesFor = success2;
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountCountryCode);
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getOutputMinFrameDuration = 2;
            if (com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl.access$applyCardDefinitionValidators(updateCardViewModelImpl, accountCountryCode, this) != coroutine_suspended) {
                success = success2;
                com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl.access$handleProfileLoadSuccess(updateCardViewModelImpl, success.getUser());
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow2 = updateCardViewModelImpl.getOutputMinFrameDuration;
            updateCardFormState = updateCardViewModelImpl.getHighSpeedVideoSizesFor;
            mutableStateFlow2.setValue(com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.FormReady.withError$default(new com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenState.FormReady(updateCardFormState, kotlin.collections.CollectionsKt.emptyList()), com.paypal.pds.components.BannerStyle.Warning.INSTANCE, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_add_error_server, new java.lang.Object[0]), null, 4, null));
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl$loadData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl$loadData$1(this.getInputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateCardViewModelImpl$loadData$1(com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl updateCardViewModelImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl$loadData$1> continuation) {
        super(2, continuation);
        this.getInputFormats = updateCardViewModelImpl;
    }
}
