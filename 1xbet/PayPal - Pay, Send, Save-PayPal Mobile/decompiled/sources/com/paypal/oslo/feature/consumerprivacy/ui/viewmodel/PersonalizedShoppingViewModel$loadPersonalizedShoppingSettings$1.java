package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel$loadPersonalizedShoppingSettings$1", f = "PersonalizedShoppingViewModel.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PersonalizedShoppingViewModel$loadPersonalizedShoppingSettings$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedShoppingSettingsUseCase getPersonalizedShoppingSettingsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant Camera2StreamConfigurationMap;
        java.lang.String highSpeedVideoSizes;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant Camera2StreamConfigurationMap2;
        java.lang.String highSpeedVideoSizes2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Loading.INSTANCE);
            getPersonalizedShoppingSettingsUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            obj = getPersonalizedShoppingSettingsUseCase.invoke(this);
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
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel personalizedShoppingViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError personalizedShoppingError = (com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError) ((arrow.core.Ior.Left) ior).getValue();
            mutableStateFlow4 = personalizedShoppingViewModel.getHighSpeedVideoSizes;
            mutableStateFlow4.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error(new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_banner_error_message, null, 2, null), personalizedShoppingError.getDescription()));
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping personalizedShopping = (com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping) ((arrow.core.Ior.Right) ior).getValue();
            mutableStateFlow3 = personalizedShoppingViewModel.getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap2 = com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel.Camera2StreamConfigurationMap(personalizedShopping.getSubjectState());
            boolean isEnabled = personalizedShopping.isEnabled();
            com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType = personalizedShopping.getConsentType();
            highSpeedVideoSizes2 = personalizedShoppingViewModel.getHighSpeedVideoSizes(personalizedShopping.getDataUsageDate());
            mutableStateFlow3.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content(Camera2StreamConfigurationMap2, isEnabled, null, false, false, consentType, highSpeedVideoSizes2, 28, null));
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping personalizedShopping2 = (com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping) both.getRightValue();
            mutableStateFlow2 = personalizedShoppingViewModel.getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel.Camera2StreamConfigurationMap(personalizedShopping2.getSubjectState());
            boolean isEnabled2 = personalizedShopping2.isEnabled();
            com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType2 = personalizedShopping2.getConsentType();
            highSpeedVideoSizes = personalizedShoppingViewModel.getHighSpeedVideoSizes(personalizedShopping2.getDataUsageDate());
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content(Camera2StreamConfigurationMap, isEnabled2, null, false, false, consentType2, highSpeedVideoSizes, 28, null));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel$loadPersonalizedShoppingSettings$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel$loadPersonalizedShoppingSettings$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalizedShoppingViewModel$loadPersonalizedShoppingSettings$1(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel personalizedShoppingViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel$loadPersonalizedShoppingSettings$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = personalizedShoppingViewModel;
    }
}
