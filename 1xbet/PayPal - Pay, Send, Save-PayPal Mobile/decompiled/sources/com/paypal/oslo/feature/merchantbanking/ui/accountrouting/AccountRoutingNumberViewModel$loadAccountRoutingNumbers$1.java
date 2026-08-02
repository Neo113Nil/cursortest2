package com.paypal.oslo.feature.merchantbanking.ui.accountrouting;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1", f = "AccountRoutingNumberViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.merchantbanking.domain.usecase.GetAccountRoutingNumberUseCase getAccountRoutingNumberUseCase;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getAccountRoutingNumberUseCase = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(getAccountRoutingNumberUseCase.invoke(), new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, null)), coroutineScope);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "either", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/merchantbanking/api/errors/AccountRoutingError;", "Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1$1", f = "AccountRoutingNumberViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.Either<? extends com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError, ? extends com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
            arrow.core.Either either = (arrow.core.Either) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel accountRoutingNumberViewModel = this.Camera2StreamConfigurationMap;
            if (either instanceof arrow.core.Either.Right) {
                com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData accountRoutingInfoData = (com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData) ((arrow.core.Either.Right) either).getValue();
                mutableStateFlow = accountRoutingNumberViewModel.getHighSpeedVideoSizes;
                mutableStateFlow.setValue(new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success(accountRoutingInfoData.getAccountNumber(), accountRoutingInfoData.getRoutingNumber(), accountRoutingInfoData.getShowAccountCreationToast()));
            } else if (either instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel.access$checkEligibilityOnError(accountRoutingNumberViewModel, (com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError) ((arrow.core.Either.Left) either).getValue());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(arrow.core.Either<? extends com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError, ? extends com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData> either, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1.AnonymousClass1) create(either, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1.AnonymousClass1(this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel accountRoutingNumberViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = accountRoutingNumberViewModel;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1 accountRoutingNumberViewModel$loadAccountRoutingNumbers$1 = new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        accountRoutingNumberViewModel$loadAccountRoutingNumbers$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return accountRoutingNumberViewModel$loadAccountRoutingNumbers$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel accountRoutingNumberViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = accountRoutingNumberViewModel;
    }
}
