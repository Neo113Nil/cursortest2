package com.paypal.oslo.feature.onboarding.signup.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$navigateToNextStep$1", f = "SignupFlowViewModel.kt", i = {0, 1, 2, 2, 2, 2, 2}, l = {183, 187, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m = "invokeSuspend", n = {"currentFlowState", "currentFlowState", "currentFlowState", "this_$iv", "step", "$i$f$fold", "$i$a$-fold-SignupFlowViewModel$navigateToNextStep$1$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 197}, s = {"L$0", "L$0", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class SignupFlowViewModel$navigateToNextStep$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel getInputSizeshNQ4ISI;
    int getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e0, code lost:
    
        if (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.m16441access$handleLoadStepConfiguration4HgBkxg(r2, r6, r10) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fd, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.access$launchOneOnboarding(r10.getInputSizeshNQ4ISI, true, r10) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
    
        if (r11 != r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState flowState;
        com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService backstackFlowStepService;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i != 0) {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            flowState = (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            arrow.core.Either either = (arrow.core.Either) obj;
            com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel = this.getInputSizeshNQ4ISI;
            if (either instanceof arrow.core.Either.Right) {
                com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step = (com.paypal.oslo.feature.onboarding.steps.nav.domain.Step) ((arrow.core.Either.Right) either).getValue();
                java.lang.String m16524getStepIdeVUBM90 = step.m16524getStepIdeVUBM90();
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowState);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(step);
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoFpsRanges = 0;
                this.getOutputFormats = 3;
            } else if (either instanceof arrow.core.Either.Left) {
                signupFlowViewModel.Camera2StreamConfigurationMap("Failed to navigate to next step", false);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        flowState = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
        if (flowState instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Uninitialized) {
            this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap("Flow must be initialized first", true);
            return kotlin.Unit.INSTANCE;
        }
        if (!(flowState instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized initialized = (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized) flowState;
        if (initialized.getSignupIntent() instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone) {
            str2 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "EMAIL")) {
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowState);
                this.getOutputFormats = 1;
            }
        }
        backstackFlowStepService = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        java.lang.String m16448getFlowId8NcbBzM = initialized.m16448getFlowId8NcbBzM();
        str = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowState);
        this.getOutputFormats = 2;
        obj = backstackFlowStepService.mo16512getFlowStepvm54Raw(m16448getFlowId8NcbBzM, str, new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next(null, false, 3, null), this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$navigateToNextStep$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$navigateToNextStep$1(this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SignupFlowViewModel$navigateToNextStep$1(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$navigateToNextStep$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = signupFlowViewModel;
    }
}
