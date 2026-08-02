package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel$onLoad$1", f = "PersonalizedAdsViewModel.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, nl = {42}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PersonalizedAdsViewModel$onLoad$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedAdsPreferenceUseCase getPersonalizedAdsPreferenceUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Loading.INSTANCE);
            getPersonalizedAdsPreferenceUseCase = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = getPersonalizedAdsPreferenceUseCase.invoke(this);
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
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel personalizedAdsViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (ior instanceof arrow.core.Ior.Left) {
            mutableStateFlow4 = personalizedAdsViewModel.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow4.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Error(new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_banner_error_message, null, 2, null), false, 2, null));
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedAdsPreference personalizedAdsPreference = (com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedAdsPreference) ((arrow.core.Ior.Right) ior).getValue();
            mutableStateFlow3 = personalizedAdsViewModel.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow3.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content(personalizedAdsPreference != null ? personalizedAdsPreference.getEnabled() : false, null, false, 6, null));
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedAdsPreference personalizedAdsPreference2 = (com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedAdsPreference) both.getRightValue();
            mutableStateFlow2 = personalizedAdsViewModel.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content(personalizedAdsPreference2 != null ? personalizedAdsPreference2.getEnabled() : false, null, false, 6, null));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel$onLoad$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel$onLoad$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalizedAdsViewModel$onLoad$1(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel personalizedAdsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel$onLoad$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = personalizedAdsViewModel;
    }
}
