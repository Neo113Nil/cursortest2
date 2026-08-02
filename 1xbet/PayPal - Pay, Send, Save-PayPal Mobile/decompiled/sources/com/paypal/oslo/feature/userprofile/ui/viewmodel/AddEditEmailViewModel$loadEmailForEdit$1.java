package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1", f = "AddEditEmailViewModel.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, nl = {163}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddEditEmailViewModel$loadEmailForEdit$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        android.content.Context context;
        com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase observeUserStoreUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        android.content.Context context2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                observeUserStoreUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                final kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.userstore.model.UserState> invoke = observeUserStoreUseCase.invoke();
                this.getHighSpeedVideoSizes = 1;
                obj = kotlinx.coroutines.flow.FlowKt.first(new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1$invokeSuspend$$inlined$filterIsInstance$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2(flowCollector), continuation);
                        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                    /* renamed from: com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                            com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) continuation;
                                if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                                    java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.getOutputMinFrameDuration;
                                    if (i != 0) {
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                        if (obj instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                                            anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                            anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                            anonymousClass1.Camera2StreamConfigurationMap = 0;
                                            anonymousClass1.getOutputMinFrameDuration = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        int i2 = anonymousClass1.Camera2StreamConfigurationMap;
                                        java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizes;
                                        java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1(continuation);
                            java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputMinFrameDuration;
                            if (i != 0) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "AddEditEmailViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                        /* renamed from: com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                            int Camera2StreamConfigurationMap;
                            java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object getHighSpeedVideoFpsRanges;
                            java.lang.Object getHighSpeedVideoFpsRangesFor;
                            java.lang.Object getHighSpeedVideoSizes;
                            /* synthetic */ java.lang.Object getOutputFormats;
                            int getOutputMinFrameDuration;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.getOutputFormats = obj;
                                this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                                return com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.this.emit(null, this);
                            }

                            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                            this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                        }
                    }
                }, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            java.util.List<com.paypal.oslo.core.userstore.model.ProfileEmail> profileEmails = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) obj).getUser().getProfileEmails();
            com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail = null;
            if (profileEmails != null) {
                java.lang.String str = this.Camera2StreamConfigurationMap;
                java.util.Iterator<T> it = profileEmails.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.userstore.model.ProfileEmail) next).getId(), str)) {
                        profileEmail = next;
                        break;
                    }
                }
                profileEmail = profileEmail;
            }
            if (profileEmail != null) {
                mutableStateFlow3 = this.getHighSpeedVideoFpsRangesFor.getOutputFormats;
                mutableStateFlow3.setValue(profileEmail.getEmailAddress());
                this.getHighSpeedVideoFpsRangesFor.isOutputSupportedFor = profileEmail.getEmailAddress();
                mutableStateFlow4 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                mutableStateFlow4.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!profileEmail.getPrimary()));
                mutableStateFlow5 = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
                mutableStateFlow5.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(profileEmail.getPrimary()));
            } else {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Email not found in UserStore", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("emailId", this.Camera2StreamConfigurationMap)), 2, null);
                com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackSystemError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getEmail(), com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.SCREEN_EDIT_EMAIL, "view", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.ErrorCodes.EMAIL_NOT_FOUND, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Sources.USER_STORE, "Email not found in UserStore", null, null, 96, null);
                mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
                context2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                java.lang.String string = context2.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_check_the_email_address_and_try_again);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                mutableStateFlow2.setValue(new com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailFormUiState.Error(string));
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackSystemError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getEmail(), com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.SCREEN_EDIT_EMAIL, "view", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.CommonErrorCodes.FAILED_USER_STORE_LOAD, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Sources.USER_STORE, "Failed to observe user store", e2, null, 64, null);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
            context = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            java.lang.String string2 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_error_load_user_profile);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            mutableStateFlow.setValue(new com.paypal.oslo.feature.userprofile.ui.viewmodel.EmailFormUiState.Error(string2));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditEmailViewModel$loadEmailForEdit$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel addEditEmailViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$loadEmailForEdit$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = addEditEmailViewModel;
        this.Camera2StreamConfigurationMap = str;
    }
}
