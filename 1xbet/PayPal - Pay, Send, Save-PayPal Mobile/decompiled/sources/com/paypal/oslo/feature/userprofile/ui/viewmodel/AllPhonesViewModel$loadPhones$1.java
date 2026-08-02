package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$loadPhones$1", f = "AllPhonesViewModel.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, nl = {117}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AllPhonesViewModel$loadPhones$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "dataResult", "Lcom/paypal/oslo/feature/userprofile/domain/model/DataResult;", "", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$loadPhones$1$1", f = "AllPhonesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$loadPhones$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.userprofile.domain.model.DataResult<? extends java.util.List<? extends com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfilePhone>>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
            java.lang.Object obj2;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
            com.paypal.oslo.feature.userprofile.domain.model.DataResult dataResult = (com.paypal.oslo.feature.userprofile.domain.model.DataResult) this.Camera2StreamConfigurationMap;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (dataResult instanceof com.paypal.oslo.feature.userprofile.domain.model.DataResult.Loading) {
                mutableStateFlow3 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                mutableStateFlow3.setValue(com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Loading.INSTANCE);
            } else if (dataResult instanceof com.paypal.oslo.feature.userprofile.domain.model.DataResult.Success) {
                java.util.List list = (java.util.List) ((com.paypal.oslo.feature.userprofile.domain.model.DataResult.Success) dataResult).getData();
                mutableStateFlow2 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                if (list.isEmpty()) {
                    obj2 = (com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState) com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Empty.INSTANCE;
                } else {
                    obj2 = (com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState) new com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Content(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel.access$sortPhones(this.getHighSpeedVideoSizes, list));
                }
                mutableStateFlow2.setValue(obj2);
            } else {
                if (!(dataResult instanceof com.paypal.oslo.feature.userprofile.domain.model.DataResult.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.userprofile.domain.model.DataResult.Error error = (com.paypal.oslo.feature.userprofile.domain.model.DataResult.Error) dataResult;
                com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackSystemError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhone(), com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.SCREEN_PHONE_LIST, "view", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.ErrorCodes.LIST_LOAD_FAILED, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Sources.USER_STORE, error.getMessage(), null, null, 96, null);
                mutableStateFlow = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                mutableStateFlow.setValue(new com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Error(error.getMessage()));
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.userprofile.domain.model.DataResult<? extends java.util.List<? extends com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfilePhone>>> dataResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$loadPhones$1.AnonymousClass1) create(dataResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$loadPhones$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$loadPhones$1.AnonymousClass1(this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.Camera2StreamConfigurationMap = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel allPhonesViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$loadPhones$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = allPhonesViewModel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.userprofile.domain.usecase.GetPhonesUseCase getPhonesUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getPhonesUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(getPhonesUseCase.invoke(), new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$loadPhones$1.AnonymousClass1(this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$loadPhones$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$loadPhones$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AllPhonesViewModel$loadPhones$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel allPhonesViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$loadPhones$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = allPhonesViewModel;
    }
}
