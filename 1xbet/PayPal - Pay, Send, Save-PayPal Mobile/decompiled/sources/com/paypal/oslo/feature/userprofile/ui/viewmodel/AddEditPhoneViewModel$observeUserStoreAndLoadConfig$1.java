package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$observeUserStoreAndLoadConfig$1", f = "AddEditPhoneViewModel.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, nl = {176}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddEditPhoneViewModel$observeUserStoreAndLoadConfig$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase observeUserStoreUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            observeUserStoreUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.Flow m24097catch = kotlinx.coroutines.flow.FlowKt.m24097catch(observeUserStoreUseCase.invoke(), new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$observeUserStoreAndLoadConfig$1.AnonymousClass1(this.getHighSpeedVideoSizes, null));
            final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = 1;
            if (m24097catch.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$observeUserStoreAndLoadConfig$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) obj2;
                    if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                        com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel.access$determineShowCountryDropdown(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel.this, ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser().getAccountCountryCode());
                    }
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

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/core/userstore/model/UserState;", "exception", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$observeUserStoreAndLoadConfig$1$1", f = "AddEditPhoneViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$observeUserStoreAndLoadConfig$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.core.userstore.model.UserState>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
            java.lang.Throwable th = (java.lang.Throwable) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackSystemError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhone(), com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel.access$getAnalyticsScreen(this.getHighSpeedVideoFpsRangesFor), "view", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.CommonErrorCodes.FAILED_USER_STORE_LOAD, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Sources.USER_STORE, "Failed to observe user store", th, null, 64, null);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getOutputSizes;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.core.userstore.model.UserState> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$observeUserStoreAndLoadConfig$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$observeUserStoreAndLoadConfig$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoSizes = th;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$observeUserStoreAndLoadConfig$1.AnonymousClass1> continuation) {
            super(3, continuation);
            this.getHighSpeedVideoFpsRangesFor = addEditPhoneViewModel;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$observeUserStoreAndLoadConfig$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$observeUserStoreAndLoadConfig$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditPhoneViewModel$observeUserStoreAndLoadConfig$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$observeUserStoreAndLoadConfig$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = addEditPhoneViewModel;
    }
}
