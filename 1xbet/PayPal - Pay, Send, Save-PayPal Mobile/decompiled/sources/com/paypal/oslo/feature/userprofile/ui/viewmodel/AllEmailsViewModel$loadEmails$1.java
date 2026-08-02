package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel$loadEmails$1", f = "AllEmailsViewModel.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, nl = {111}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AllEmailsViewModel$loadEmails$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.userprofile.domain.usecase.GetEmailsUseCase getEmailsUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getEmailsUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.userprofile.domain.model.DataResult<java.util.List<com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfileEmail>>>> invoke = getEmailsUseCase.invoke();
            final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel allEmailsViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel$loadEmails$1.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                    java.lang.Object obj3;
                    com.paypal.oslo.feature.userprofile.domain.model.DataResult dataResult = (com.paypal.oslo.feature.userprofile.domain.model.DataResult) obj2;
                    mutableStateFlow = com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel.this.getHighResolutionOutputSizeshNQ4ISI;
                    if (dataResult instanceof com.paypal.oslo.feature.userprofile.domain.model.DataResult.Loading) {
                        obj3 = (com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState) com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Loading.INSTANCE;
                    } else if (dataResult instanceof com.paypal.oslo.feature.userprofile.domain.model.DataResult.Success) {
                        com.paypal.oslo.feature.userprofile.domain.model.DataResult.Success success = (com.paypal.oslo.feature.userprofile.domain.model.DataResult.Success) dataResult;
                        if (((java.util.List) success.getData()).isEmpty()) {
                            obj3 = (com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState) com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Empty.INSTANCE;
                        } else {
                            obj3 = (com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState) new com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Content(kotlin.collections.CollectionsKt.sortedWith((java.lang.Iterable) success.getData(), new java.util.Comparator() { // from class: com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel$loadEmails$1$1$emit$$inlined$sortedByDescending$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Boolean.valueOf(((com.paypal.oslo.feature.userprofile.domain.ProfileDataItem) t2).isPrimary()), java.lang.Boolean.valueOf(((com.paypal.oslo.feature.userprofile.domain.ProfileDataItem) t).isPrimary()));
                                }
                            }));
                        }
                    } else {
                        if (!(dataResult instanceof com.paypal.oslo.feature.userprofile.domain.model.DataResult.Error)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.userprofile.domain.model.DataResult.Error error = (com.paypal.oslo.feature.userprofile.domain.model.DataResult.Error) dataResult;
                        com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackSystemError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getEmail(), com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.SCREEN_EMAIL_LIST, "view", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.ErrorCodes.LIST_LOAD_FAILED, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Sources.USER_STORE, error.getMessage(), null, null, 96, null);
                        obj3 = (com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState) new com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Error(error.getMessage());
                    }
                    mutableStateFlow.setValue(obj3);
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
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel$loadEmails$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel$loadEmails$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AllEmailsViewModel$loadEmails$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel allEmailsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel$loadEmails$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = allEmailsViewModel;
    }
}
