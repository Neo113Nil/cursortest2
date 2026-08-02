package com.paypal.oslo.feature.bankingbundle.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel$observeUserState$1", f = "StandaloneLandingViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class StandaloneLandingViewModel$observeUserState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.userstore.UserStore userStore;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            userStore = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = userStore.getUserState();
            final com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel standaloneLandingViewModel = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (userState.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel$observeUserState$1.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                    java.lang.Object value;
                    com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName;
                    com.paypal.oslo.core.userstore.model.UserState userState2 = (com.paypal.oslo.core.userstore.model.UserState) obj2;
                    if (userState2 instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                        com.paypal.oslo.core.userstore.model.ProfileName legalName = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState2).getUser().getLegalName();
                        java.lang.String givenName = (legalName == null || (personName = legalName.getPersonName()) == null) ? null : personName.getGivenName();
                        mutableStateFlow = com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel.this.getHighResolutionOutputSizeshNQ4ISI;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingState.copy$default((com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingState) value, givenName, false, 2, null)));
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
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel$observeUserState$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel$observeUserState$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StandaloneLandingViewModel$observeUserState$1(com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel standaloneLandingViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel$observeUserState$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = standaloneLandingViewModel;
    }
}
