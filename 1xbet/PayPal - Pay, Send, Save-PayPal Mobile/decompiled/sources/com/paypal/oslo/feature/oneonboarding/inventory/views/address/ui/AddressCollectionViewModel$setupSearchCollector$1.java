package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$setupSearchCollector$1", f = "AddressCollectionViewModel.kt", i = {}, l = {373}, m = "invokeSuspend", n = {}, nl = {384}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AddressCollectionViewModel$setupSearchCollector$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizes.getOutputFormats;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(kotlinx.coroutines.flow.FlowKt.debounce(mutableStateFlow, 300L), new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$setupSearchCollector$1.AnonymousClass1(this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$setupSearchCollector$1$1", f = "AddressCollectionViewModel.kt", i = {0}, l = {381}, m = "invokeSuspend", n = {"query"}, nl = {383}, s = {"L$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$setupSearchCollector$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            boolean z;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
            com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState copy;
            java.lang.String str = (java.lang.String) this.Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (kotlin.text.StringsKt.isBlank(str)) {
                    mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                    mutableStateFlow3 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                    copy = r3.copy((r28 & 1) != 0 ? r3.searchQuery : null, (r28 & 2) != 0 ? r3.isSearching : false, (r28 & 4) != 0 ? r3.suggestions : kotlin.collections.CollectionsKt.emptyList(), (r28 & 8) != 0 ? r3.searchError : null, (r28 & 16) != 0 ? r3.selectedAddress : null, (r28 & 32) != 0 ? r3.fieldValues : null, (r28 & 64) != 0 ? r3.fieldErrors : null, (r28 & 128) != 0 ? r3.hasValidationError : false, (r28 & 256) != 0 ? r3.hasPOBoxError : false, (r28 & 512) != 0 ? r3.hasPMBError : false, (r28 & 1024) != 0 ? r3.hasUSTerritoryError : false, (r28 & 2048) != 0 ? r3.isManualEntry : false, (r28 & 4096) != 0 ? ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState) mutableStateFlow3.getValue()).verificationState : null);
                    mutableStateFlow2.setValue(copy);
                } else {
                    z = this.getHighSpeedVideoFpsRanges.getInputFormats;
                    if (z) {
                        mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                        if (!((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState) mutableStateFlow.getValue()).isManualEntry()) {
                            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            this.getHighResolutionOutputSizeshNQ4ISI = 1;
                            if (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel.access$setupSearchCollector$searchAddresses(this.getHighSpeedVideoFpsRanges, str, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
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
            return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$setupSearchCollector$1.AnonymousClass1) create(str, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$setupSearchCollector$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$setupSearchCollector$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.Camera2StreamConfigurationMap = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel addressCollectionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$setupSearchCollector$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = addressCollectionViewModel;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$setupSearchCollector$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$setupSearchCollector$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressCollectionViewModel$setupSearchCollector$1(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel addressCollectionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$setupSearchCollector$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = addressCollectionViewModel;
    }
}
