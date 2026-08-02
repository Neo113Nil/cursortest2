package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel$onToggleChange$1", f = "PersonalizedAdsViewModel.kt", i = {0, 0}, l = {68}, m = "invokeSuspend", n = {"currentState", "currentValue"}, nl = {69}, s = {"L$0", "Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class PersonalizedAdsViewModel$onToggleChange$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedAdsPreferenceUseCase updatePersonalizedAdsPreferenceUseCase;
        boolean z;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState personalizedAdsUiState = (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState) mutableStateFlow.getValue();
            if (!(personalizedAdsUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content)) {
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content content = (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content) personalizedAdsUiState;
            boolean isEnabled = content.isEnabled();
            this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content.copy$default(content, false, null, true, 1, null));
            updatePersonalizedAdsPreferenceUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(personalizedAdsUiState);
            this.getHighSpeedVideoFpsRanges = isEnabled;
            this.Camera2StreamConfigurationMap = 1;
            obj = updatePersonalizedAdsPreferenceUseCase.invoke(this.getHighSpeedVideoSizes, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = isEnabled;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel personalizedAdsViewModel = this.getHighSpeedVideoFpsRangesFor;
        boolean z2 = this.getHighSpeedVideoSizes;
        if (ior instanceof arrow.core.Ior.Left) {
            personalizedAdsViewModel.getHighSpeedVideoFpsRanges(z);
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel.access$handleUpdateResult(personalizedAdsViewModel, ((java.lang.Boolean) ((arrow.core.Ior.Right) ior).getValue()).booleanValue(), z2, z);
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel.access$handleUpdateResult(personalizedAdsViewModel, ((java.lang.Boolean) both.getRightValue()).booleanValue(), z2, z);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel$onToggleChange$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel$onToggleChange$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalizedAdsViewModel$onToggleChange$1(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel personalizedAdsViewModel, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel$onToggleChange$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = personalizedAdsViewModel;
        this.getHighSpeedVideoSizes = z;
    }
}
