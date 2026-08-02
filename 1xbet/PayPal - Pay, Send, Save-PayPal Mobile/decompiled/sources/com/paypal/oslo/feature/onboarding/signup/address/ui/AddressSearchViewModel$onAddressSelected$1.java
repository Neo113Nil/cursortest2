package com.paypal.oslo.feature.onboarding.signup.address.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$onAddressSelected$1", f = "AddressSearchViewModel.kt", i = {1, 1, 1, 1}, l = {87, 101}, m = "invokeSuspend", n = {"this_$iv", "fullAddress", "$i$f$fold", "$i$a$-fold-AddressSearchViewModel$onAddressSelected$1$2"}, nl = {152, 102}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class AddressSearchViewModel$onAddressSelected$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a9, code lost:
    
        if (r1.emit(r3, r14) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r15 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressDetailsUseCase addressDetailsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            mutableStateFlow2 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState.copy$default((com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState) mutableStateFlow2.getValue(), null, true, null, null, 5, null));
            addressDetailsUseCase = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            this.getOutputMinFrameDuration = 1;
            obj = addressDetailsUseCase.m16213invoke4mJoj18(this.getHighSpeedVideoFpsRanges.m16204getPlaceIdquPJ1pI(), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel addressSearchViewModel = this.getInputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.core.i18n.domain.model.Address address = (com.paypal.oslo.core.i18n.domain.model.Address) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow5 = addressSearchViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow6 = addressSearchViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow5.setValue(com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState.copy$default((com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState) mutableStateFlow6.getValue(), null, false, null, null, 5, null));
            mutableSharedFlow = addressSearchViewModel.getInputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address);
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getOutputMinFrameDuration = 2;
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError = (com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError) ((arrow.core.Either.Left) either).getValue();
            mutableStateFlow3 = addressSearchViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow4 = addressSearchViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow3.setValue(com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState.copy$default((com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState) mutableStateFlow4.getValue(), null, false, kotlin.collections.CollectionsKt.emptyList(), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_address_detail_error, new java.lang.Object[0]), 1, null));
            com.paypal.oslo.feature.onboarding.signup.address.analytics.AddressSearchAnalytics.INSTANCE.trackError$onboarding_prodRelease(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallErrorKt.toErrorDetails(apiCallError));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$onAddressSelected$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$onAddressSelected$1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressSearchViewModel$onAddressSelected$1(com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel addressSearchViewModel, com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion addressSuggestion, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$onAddressSelected$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = addressSearchViewModel;
        this.getHighSpeedVideoFpsRanges = addressSuggestion;
    }
}
