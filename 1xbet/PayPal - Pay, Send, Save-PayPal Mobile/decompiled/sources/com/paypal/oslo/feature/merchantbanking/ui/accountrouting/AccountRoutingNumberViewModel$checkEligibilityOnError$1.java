package com.paypal.oslo.feature.merchantbanking.ui.accountrouting;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$checkEligibilityOnError$1", f = "AccountRoutingNumberViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AccountRoutingNumberViewModel$checkEligibilityOnError$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase checkAccountRoutingEligibilityUseCase;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            checkAccountRoutingEligibilityUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(checkAccountRoutingEligibilityUseCase.invoke(), new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$checkEligibilityOnError$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, null)), coroutineScope);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "eligibilityResult", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/merchantbanking/api/errors/AccountRoutingError;", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$checkEligibilityOnError$1$1", f = "AccountRoutingNumberViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$checkEligibilityOnError$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.Either<? extends com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError, ? extends java.lang.Boolean>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
            com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState highSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
            arrow.core.Either either = (arrow.core.Either) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel accountRoutingNumberViewModel = this.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError accountRoutingError = this.getHighSpeedVideoFpsRanges;
            if (either instanceof arrow.core.Either.Right) {
                if (((java.lang.Boolean) ((arrow.core.Either.Right) either).getValue()).booleanValue()) {
                    mutableStateFlow3 = accountRoutingNumberViewModel.getHighSpeedVideoSizes;
                    mutableStateFlow3.setValue(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.NavigateToTerms.INSTANCE);
                } else {
                    mutableStateFlow2 = accountRoutingNumberViewModel.getHighSpeedVideoSizes;
                    mutableStateFlow2.setValue(new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.INELIGIBLE));
                }
            } else if (either instanceof arrow.core.Either.Left) {
                mutableStateFlow = accountRoutingNumberViewModel.getHighSpeedVideoSizes;
                highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel.getHighSpeedVideoFpsRangesFor(accountRoutingError);
                mutableStateFlow.setValue(highSpeedVideoFpsRangesFor);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(arrow.core.Either<? extends com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError, ? extends java.lang.Boolean> either, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$checkEligibilityOnError$1.AnonymousClass1) create(either, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$checkEligibilityOnError$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$checkEligibilityOnError$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel accountRoutingNumberViewModel, com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError accountRoutingError, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$checkEligibilityOnError$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = accountRoutingNumberViewModel;
            this.getHighSpeedVideoFpsRanges = accountRoutingError;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$checkEligibilityOnError$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$checkEligibilityOnError$1 accountRoutingNumberViewModel$checkEligibilityOnError$1 = new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$checkEligibilityOnError$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
        accountRoutingNumberViewModel$checkEligibilityOnError$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return accountRoutingNumberViewModel$checkEligibilityOnError$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountRoutingNumberViewModel$checkEligibilityOnError$1(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel accountRoutingNumberViewModel, com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError accountRoutingError, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$checkEligibilityOnError$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = accountRoutingNumberViewModel;
        this.Camera2StreamConfigurationMap = accountRoutingError;
    }
}
