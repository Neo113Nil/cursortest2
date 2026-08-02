package com.paypal.oslo.feature.onboarding.signup.password.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1", f = "PasswordScreen.kt", i = {0}, l = {68}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, nl = {85}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class PasswordScreenKt$PasswordScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

        /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction passwordAction, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1$1$emit$1 passwordScreenKt$PasswordScreen$1$1$1$emit$1;
            int i;
            if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1$1$emit$1) {
                passwordScreenKt$PasswordScreen$1$1$1$emit$1 = (com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1$1$emit$1) continuation;
                if ((passwordScreenKt$PasswordScreen$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    passwordScreenKt$PasswordScreen$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = passwordScreenKt$PasswordScreen$1$1$1$emit$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = passwordScreenKt$PasswordScreen$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (passwordAction instanceof com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.LaunchSavePasswordManager) {
                            com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider saveCredentialProvider = this.getHighResolutionOutputSizeshNQ4ISI;
                            com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.LaunchSavePasswordManager launchSavePasswordManager = (com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.LaunchSavePasswordManager) passwordAction;
                            java.lang.String email = launchSavePasswordManager.getEmail();
                            java.lang.String password = launchSavePasswordManager.getPassword();
                            passwordScreenKt$PasswordScreen$1$1$1$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passwordAction);
                            passwordScreenKt$PasswordScreen$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            obj = saveCredentialProvider.saveCredential(email, password, passwordScreenKt$PasswordScreen$1$1$1$emit$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(passwordAction, com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.NavigateToNextScreen.INSTANCE)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            this.getHighSpeedVideoFpsRanges.getOnNavigateNext().invoke();
                            return kotlin.Unit.INSTANCE;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, null, new com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1.AnonymousClass1.C01251(this.Camera2StreamConfigurationMap, (com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult) obj, null), 3, null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            passwordScreenKt$PasswordScreen$1$1$1$emit$1 = new com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1$1$emit$1(this, continuation);
            java.lang.Object obj2 = passwordScreenKt$PasswordScreen$1$1$1$emit$1.Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = passwordScreenKt$PasswordScreen$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, null, new com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1.AnonymousClass1.C01251(this.Camera2StreamConfigurationMap, (com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult) obj2, null), 3, null);
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1$1$1", f = "PasswordScreen.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, nl = {77}, s = {}, v = 2)
        /* renamed from: com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01251 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel getHighResolutionOutputSizeshNQ4ISI;
            int getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighSpeedVideoFpsRangesFor;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    if (this.getHighResolutionOutputSizeshNQ4ISI.handleCredentialResult(this.getHighSpeedVideoSizes, this) == coroutine_suspended) {
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
                return ((com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1.AnonymousClass1.C01251) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1.AnonymousClass1.C01251(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01251(com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel passwordViewModel, com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult saveCredentialResult, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1.AnonymousClass1.C01251> continuation) {
                super(2, continuation);
                this.getHighResolutionOutputSizeshNQ4ISI = passwordViewModel;
                this.getHighSpeedVideoSizes = saveCredentialResult;
            }
        }

        AnonymousClass1(com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider saveCredentialProvider, kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel passwordViewModel) {
            this.getHighResolutionOutputSizeshNQ4ISI = saveCredentialProvider;
            this.getHighSpeedVideoSizes = coroutineScope;
            this.getHighSpeedVideoFpsRanges = stepCallbacks;
            this.Camera2StreamConfigurationMap = passwordViewModel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.getHighResolutionOutputSizeshNQ4ISI.getPasswordAction().collect(new com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, coroutineScope, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1 passwordScreenKt$PasswordScreen$1$1 = new com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        passwordScreenKt$PasswordScreen$1$1.Camera2StreamConfigurationMap = obj;
        return passwordScreenKt$PasswordScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasswordScreenKt$PasswordScreen$1$1(com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel passwordViewModel, com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider saveCredentialProvider, com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = passwordViewModel;
        this.getHighSpeedVideoSizes = saveCredentialProvider;
        this.getHighSpeedVideoFpsRanges = stepCallbacks;
    }
}
