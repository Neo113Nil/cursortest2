package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$loadPhoneForEdit$1", f = "AddEditPhoneViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE}, m = "invokeSuspend", n = {}, nl = {314}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddEditPhoneViewModel$loadPhoneForEdit$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase observeUserStoreUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            observeUserStoreUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.userstore.model.UserState> invoke = observeUserStoreUseCase.invoke();
            final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel = this.getHighSpeedVideoSizes;
            final java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = 1;
            if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$loadPhoneForEdit$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) obj2;
                    if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                        java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> profilePhones = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser().getProfilePhones();
                        com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = null;
                        if (profilePhones != null) {
                            java.lang.String str2 = str;
                            java.util.Iterator<T> it = profilePhones.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next = it.next();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.userstore.model.ProfilePhone) next).getId(), str2)) {
                                    profilePhone = next;
                                    break;
                                }
                            }
                            profilePhone = profilePhone;
                        }
                        if (profilePhone != null) {
                            com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel.access$populateFormFromPhone(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel.this, profilePhone);
                        } else {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Phone not found for edit", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneId", str)), 2, null);
                            com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackSystemError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhone(), com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.SCREEN_EDIT_PHONE, "view", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.ErrorCodes.PHONE_NOT_FOUND, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Sources.USER_STORE, "Phone not found for edit", null, null, 96, null);
                        }
                        return kotlin.Unit.INSTANCE;
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$loadPhoneForEdit$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$loadPhoneForEdit$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditPhoneViewModel$loadPhoneForEdit$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$loadPhoneForEdit$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = addEditPhoneViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
