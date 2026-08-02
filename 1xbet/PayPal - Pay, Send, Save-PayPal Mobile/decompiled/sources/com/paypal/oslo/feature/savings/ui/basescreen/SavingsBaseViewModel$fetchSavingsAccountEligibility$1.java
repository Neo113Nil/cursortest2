package com.paypal.oslo.feature.savings.ui.basescreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsAccountEligibility$1", f = "SavingsBaseViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE}, m = "invokeSuspend", n = {}, nl = {450}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsBaseViewModel$fetchSavingsAccountEligibility$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountEligibilityUseCase getSavingsAccountEligibilityUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState savingsBaseUiState;
        com.paypal.oslo.feature.savings.domain.model.IneligibilityReason ineligibilityReason;
        com.paypal.oslo.feature.savings.domain.model.IneligibilityReason ineligibilityReason2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputFormats.getHighSpeedVideoSizes;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(mutableStateFlow.getValue(), com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Loading.INSTANCE)) {
                mutableStateFlow2 = this.getInputFormats.getHighSpeedVideoSizes;
                mutableStateFlow2.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Loading.INSTANCE);
            }
            getSavingsAccountEligibilityUseCase = this.getInputFormats.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            obj = getSavingsAccountEligibilityUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel savingsBaseViewModel = this.getInputFormats;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource = this.getHighSpeedVideoFpsRangesFor;
        boolean z = this.getHighSpeedVideoFpsRanges;
        boolean z2 = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.savings.domain.model.SavingsAccountEligibility savingsAccountEligibility = (com.paypal.oslo.feature.savings.domain.model.SavingsAccountEligibility) ((arrow.core.Either.Right) either).getValue();
            com.paypal.oslo.feature.savings.domain.model.ProductSubscription savingsProductSubscription = savingsAccountEligibility.getSavingsProductSubscription();
            java.lang.String status = savingsProductSubscription != null ? savingsProductSubscription.getStatus() : null;
            com.paypal.oslo.feature.savings.domain.model.ProductSubscription savingsProductSubscription2 = savingsAccountEligibility.getSavingsProductSubscription();
            java.lang.String reasonCode = (savingsProductSubscription2 == null || (ineligibilityReason2 = savingsProductSubscription2.getIneligibilityReason()) == null) ? null : ineligibilityReason2.getReasonCode();
            com.paypal.oslo.feature.savings.domain.model.ProductSubscription savingsProductSubscription3 = savingsAccountEligibility.getSavingsProductSubscription();
            java.lang.String description = (savingsProductSubscription3 == null || (ineligibilityReason = savingsProductSubscription3.getIneligibilityReason()) == null) ? null : ineligibilityReason.getDescription();
            com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource2 = com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource.START_SAVINGS_CLICK;
            if (z) {
                savingsBaseViewModel.fetchSavingsAccountEligibility(str, savingsClientSource2, false, true);
            } else {
                com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel.access$handleEligibilityStatus(savingsBaseViewModel, status, reasonCode, description, str, savingsClientSource2, z2);
            }
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError = (com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue();
            mutableStateFlow3 = savingsBaseViewModel.getHighSpeedVideoSizes;
            if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.NetworkError) {
                savingsBaseUiState = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.NetworkError(new com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctEligibilityCall(str, savingsClientSource, z, z2));
            } else if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) {
                savingsBaseUiState = com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Error.INSTANCE;
            } else {
                if (!(savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.UnknownError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                savingsBaseUiState = com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Error.INSTANCE;
            }
            mutableStateFlow3.setValue(savingsBaseUiState);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsAccountEligibility$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsAccountEligibility$1(this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsBaseViewModel$fetchSavingsAccountEligibility$1(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel savingsBaseViewModel, java.lang.String str, com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource, boolean z, boolean z2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsAccountEligibility$1> continuation) {
        super(2, continuation);
        this.getInputFormats = savingsBaseViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = savingsClientSource;
        this.getHighSpeedVideoFpsRanges = z;
        this.Camera2StreamConfigurationMap = z2;
    }
}
