package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel$onPersonalizationToggleChanged$1", f = "PersonalizedShoppingViewModel.kt", i = {0}, l = {107}, m = "invokeSuspend", n = {"currentState"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class PersonalizedShoppingViewModel$onPersonalizationToggleChanged$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedShoppingPreferenceUseCase updatePersonalizedShoppingPreferenceUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState personalizedShoppingUiState = (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState) mutableStateFlow.getValue();
            if (personalizedShoppingUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) {
                mutableStateFlow2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                mutableStateFlow2.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) personalizedShoppingUiState, null, false, null, false, true, null, null, 99, null));
            }
            updatePersonalizedShoppingPreferenceUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(personalizedShoppingUiState);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = updatePersonalizedShoppingPreferenceUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel personalizedShoppingViewModel = this.Camera2StreamConfigurationMap;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel.access$handleMutationError(personalizedShoppingViewModel, (com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError) ((arrow.core.Ior.Left) ior).getValue());
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel.access$applyMutationSuccessState(personalizedShoppingViewModel, (com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping) ((arrow.core.Ior.Right) ior).getValue());
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel.access$applyMutationSuccessState(personalizedShoppingViewModel, (com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping) both.getRightValue());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel$onPersonalizationToggleChanged$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel$onPersonalizationToggleChanged$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalizedShoppingViewModel$onPersonalizationToggleChanged$1(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel personalizedShoppingViewModel, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel$onPersonalizationToggleChanged$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = personalizedShoppingViewModel;
        this.getHighSpeedVideoFpsRangesFor = z;
    }
}
