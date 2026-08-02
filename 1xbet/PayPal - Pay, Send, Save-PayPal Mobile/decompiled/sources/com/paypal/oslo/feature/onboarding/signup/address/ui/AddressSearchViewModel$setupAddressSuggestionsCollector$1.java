package com.paypal.oslo.feature.onboarding.signup.address.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$setupAddressSuggestionsCollector$1", f = "AddressSearchViewModel.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AddressSearchViewModel$setupAddressSuggestionsCollector$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(kotlinx.coroutines.flow.FlowKt.debounce(mutableStateFlow, 300L), new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$setupAddressSuggestionsCollector$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "query", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$setupAddressSuggestionsCollector$1$1", f = "AddressSearchViewModel.kt", i = {0}, l = {121}, m = "invokeSuspend", n = {"query"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, s = {"L$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$setupAddressSuggestionsCollector$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
            java.lang.String str = (java.lang.String) this.Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (kotlin.text.StringsKt.isBlank(str)) {
                    mutableStateFlow3 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                    mutableStateFlow4 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                    mutableStateFlow3.setValue(com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState.copy$default((com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState) mutableStateFlow4.getValue(), null, false, kotlin.collections.CollectionsKt.emptyList(), null, 1, null));
                } else {
                    mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                    mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                    mutableStateFlow.setValue(com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState.copy$default((com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState) mutableStateFlow2.getValue(), null, true, null, null, 13, null));
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    this.getHighSpeedVideoFpsRanges = 1;
                    if (com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel.access$searchAddress(this.getHighSpeedVideoFpsRangesFor, str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$setupAddressSuggestionsCollector$1.AnonymousClass1) create(str, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$setupAddressSuggestionsCollector$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$setupAddressSuggestionsCollector$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.Camera2StreamConfigurationMap = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel addressSearchViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$setupAddressSuggestionsCollector$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = addressSearchViewModel;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$setupAddressSuggestionsCollector$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$setupAddressSuggestionsCollector$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressSearchViewModel$setupAddressSuggestionsCollector$1(com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel addressSearchViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$setupAddressSuggestionsCollector$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = addressSearchViewModel;
    }
}
