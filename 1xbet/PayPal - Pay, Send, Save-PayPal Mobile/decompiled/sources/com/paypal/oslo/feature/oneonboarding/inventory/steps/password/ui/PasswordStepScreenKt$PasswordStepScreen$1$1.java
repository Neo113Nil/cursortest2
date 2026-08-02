package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepScreenKt$PasswordStepScreen$1$1", f = "PasswordStepScreen.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PasswordStepScreenKt$PasswordStepScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.navigation.PasswordDestination getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.SaveCredentialProvider getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepScreenKt$PasswordStepScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.navigation.PasswordDestination getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.SaveCredentialProvider getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel getHighSpeedVideoSizes;

        /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordStepAction passwordStepAction, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepScreenKt$PasswordStepScreen$1$1$1$emit$1 passwordStepScreenKt$PasswordStepScreen$1$1$1$emit$1;
            int i;
            if (continuation instanceof com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepScreenKt$PasswordStepScreen$1$1$1$emit$1) {
                passwordStepScreenKt$PasswordStepScreen$1$1$1$emit$1 = (com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepScreenKt$PasswordStepScreen$1$1$1$emit$1) continuation;
                if ((passwordStepScreenKt$PasswordStepScreen$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    passwordStepScreenKt$PasswordStepScreen$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = passwordStepScreenKt$PasswordStepScreen$1$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = passwordStepScreenKt$PasswordStepScreen$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (passwordStepAction instanceof com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordStepAction.LaunchSavePasswordManager) {
                            com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.SaveCredentialProvider saveCredentialProvider = this.getHighSpeedVideoFpsRangesFor;
                            com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordStepAction.LaunchSavePasswordManager launchSavePasswordManager = (com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordStepAction.LaunchSavePasswordManager) passwordStepAction;
                            java.lang.String email = launchSavePasswordManager.getEmail();
                            java.lang.String password = launchSavePasswordManager.getPassword();
                            passwordStepScreenKt$PasswordStepScreen$1$1$1$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passwordStepAction);
                            passwordStepScreenKt$PasswordStepScreen$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            obj = saveCredentialProvider.saveCredential(email, password, passwordStepScreenKt$PasswordStepScreen$1$1$1$emit$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(passwordStepAction, com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordStepAction.NavigateNext.INSTANCE)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            this.getHighSpeedVideoSizes.stepForward();
                            return kotlin.Unit.INSTANCE;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    this.Camera2StreamConfigurationMap.handleCredentialResult(this.getHighSpeedVideoFpsRanges.getIntentId(), (com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.SaveCredentialResult) obj);
                    return kotlin.Unit.INSTANCE;
                }
            }
            passwordStepScreenKt$PasswordStepScreen$1$1$1$emit$1 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepScreenKt$PasswordStepScreen$1$1$1$emit$1(this, continuation);
            java.lang.Object obj2 = passwordStepScreenKt$PasswordStepScreen$1$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = passwordStepScreenKt$PasswordStepScreen$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
            }
            this.Camera2StreamConfigurationMap.handleCredentialResult(this.getHighSpeedVideoFpsRanges.getIntentId(), (com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.SaveCredentialResult) obj2);
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.SaveCredentialProvider saveCredentialProvider, com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel passwordStepViewModel, com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.navigation.PasswordDestination passwordDestination, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
            this.getHighSpeedVideoFpsRangesFor = saveCredentialProvider;
            this.Camera2StreamConfigurationMap = passwordStepViewModel;
            this.getHighSpeedVideoFpsRanges = passwordDestination;
            this.getHighSpeedVideoSizes = oneOnboardingFlowViewModel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (this.Camera2StreamConfigurationMap.getPasswordAction().collect(new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepScreenKt$PasswordStepScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepScreenKt$PasswordStepScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepScreenKt$PasswordStepScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasswordStepScreenKt$PasswordStepScreen$1$1(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel passwordStepViewModel, com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.SaveCredentialProvider saveCredentialProvider, com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.navigation.PasswordDestination passwordDestination, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepScreenKt$PasswordStepScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = passwordStepViewModel;
        this.getHighSpeedVideoFpsRangesFor = saveCredentialProvider;
        this.getHighSpeedVideoFpsRanges = passwordDestination;
        this.getHighResolutionOutputSizeshNQ4ISI = oneOnboardingFlowViewModel;
    }
}
