package com.paypal.oslo.feature.onboarding.signup.personalinfo.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$1$1", f = "PersonalInfoScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PersonalInfoScreenKt$PersonalInfoScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt.access$PersonalInfoScreen$lambda$0(this.getHighSpeedVideoFpsRangesFor).getShowAddressModal()) {
            this.getHighSpeedVideoSizes.setAddressModalVisible(false);
            final com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination addressSearchModalDestination = new com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination(this.getHighSpeedVideoSizes.m16385getSignupCountryCodeALGuh4w(), this.getHighSpeedVideoSizes.getSignupFlowName(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
            this.getHighResolutionOutputSizeshNQ4ISI.m11575navigateForResultInternaluBl809w(this.Camera2StreamConfigurationMap, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$1$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.onboarding.api.navigation.AddressSearchModalDestination addressSearchModalDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(addressSearchModalDestination);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$1$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoScreenKt$PersonalInfoScreen$1$1(com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel personalInfoViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.runtime.State<com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = personalInfoViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = state;
    }
}
