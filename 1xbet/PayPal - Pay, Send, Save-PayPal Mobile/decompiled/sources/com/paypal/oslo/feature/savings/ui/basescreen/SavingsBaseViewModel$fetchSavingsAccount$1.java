package com.paypal.oslo.feature.savings.ui.basescreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsAccount$1", f = "SavingsBaseViewModel.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, nl = {450}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsBaseViewModel$fetchSavingsAccount$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel getHighSpeedVideoSizes;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r8.equals(com.payair.model.TokenStatusKt.TOKEN_ACTIVE) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        r8 = r0.getHighSpeedVideoSizes;
        r8.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToHubState.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (r8.equals(com.payair.model.TokenStatusKt.TOKEN_INACTIVE) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        r8 = r0.getHighSpeedVideoSizes;
        r8.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveHomeScreenState.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (r8.equals("FDIC_FREEZE") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (r8.equals("FDIC_RELEASED") != false) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountUseCase getSavingsAccountUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState savingsBaseUiState;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Loading.INSTANCE);
            getSavingsAccountUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = getSavingsAccountUseCase.invoke(this);
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
        com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel savingsBaseViewModel = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            if (list.isEmpty()) {
                com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel.fetchSavingsAccountEligibility$default(savingsBaseViewModel, null, savingsClientSource, z, z, 1, null);
            } else {
                java.lang.String accountStatus = ((com.paypal.oslo.feature.savings.domain.model.SavingsAccountInfo) kotlin.collections.CollectionsKt.first(list)).getAccountStatus();
                if (accountStatus != null) {
                    switch (accountStatus.hashCode()) {
                        case -1163771068:
                            break;
                        case 788823646:
                            break;
                        case 807292011:
                            break;
                        case 1925346054:
                            break;
                        case 1990776172:
                            if (accountStatus.equals("CLOSED")) {
                                com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel.fetchSavingsAccountEligibility$default(savingsBaseViewModel, null, savingsClientSource, z, z, 1, null);
                                break;
                            }
                            break;
                    }
                }
                mutableStateFlow3 = savingsBaseViewModel.getHighSpeedVideoSizes;
                mutableStateFlow3.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToHubState.INSTANCE);
            }
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError = (com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue();
            mutableStateFlow2 = savingsBaseViewModel.getHighSpeedVideoSizes;
            if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.NetworkError) {
                savingsBaseUiState = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.NetworkError(new com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall.SavingsAcctStatusCall(savingsClientSource, z));
            } else if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) {
                savingsBaseUiState = com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Error.INSTANCE;
            } else {
                if (!(savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.UnknownError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                savingsBaseUiState = com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Error.INSTANCE;
            }
            mutableStateFlow2.setValue(savingsBaseUiState);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsAccount$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsAccount$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsBaseViewModel$fetchSavingsAccount$1(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel savingsBaseViewModel, com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsAccount$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = savingsBaseViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = savingsClientSource;
        this.getHighSpeedVideoFpsRanges = z;
    }
}
