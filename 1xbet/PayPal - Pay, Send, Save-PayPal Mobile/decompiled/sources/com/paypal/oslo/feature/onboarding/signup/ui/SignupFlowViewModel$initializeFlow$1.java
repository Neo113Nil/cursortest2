package com.paypal.oslo.feature.onboarding.signup.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$initializeFlow$1", f = "SignupFlowViewModel.kt", i = {0, 1, 2, 3, 3, 3, 3, 3}, l = {129, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 135, 140}, m = "invokeSuspend", n = {com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "this_$iv", "step", "$i$f$fold", "$i$a$-fold-SignupFlowViewModel$initializeFlow$1$2"}, nl = {130, 135, 338, 141}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class SignupFlowViewModel$initializeFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f1, code lost:
    
        if (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.m16441access$handleLoadStepConfiguration4HgBkxg(r3, r5, r14) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (r15 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.access$launchOneOnboarding(r14.getHighSpeedVideoSizesFor, false, r14) != r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase determineSignupFlowUseCase;
        com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase preloadSignupFlowUseCase;
        java.lang.String str;
        com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService backstackFlowStepService;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            determineSignupFlowUseCase = this.getHighSpeedVideoSizesFor.getInputSizeshNQ4ISI;
            java.lang.String m16329invokeKtwKm_s = determineSignupFlowUseCase.m16329invokeKtwKm_s(this.getHighResolutionOutputSizeshNQ4ISI);
            com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.access$persistSignupIntentData(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizesFor = new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.FlowState.Initialized(m16329invokeKtwKm_s, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, null);
            if (this.getHighResolutionOutputSizeshNQ4ISI instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone) {
                preloadSignupFlowUseCase = this.getHighSpeedVideoSizesFor.getOutputFormats;
                this.getHighSpeedVideoFpsRanges = m16329invokeKtwKm_s;
                this.getInputSizeshNQ4ISI = 2;
                if (preloadSignupFlowUseCase.m16332invokek3UT_Go(m16329invokeKtwKm_s, this.getHighSpeedVideoFpsRangesFor, this) != coroutine_suspended) {
                    str = m16329invokeKtwKm_s;
                    backstackFlowStepService = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor;
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    this.getInputSizeshNQ4ISI = 3;
                    obj = com.paypal.oslo.feature.onboarding.steps.nav.domain.ReadableFlowStepService.m16514getFlowStepvm54Raw$default(backstackFlowStepService, str, null, null, this, 6, null);
                }
            } else {
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m16329invokeKtwKm_s);
                this.getInputSizeshNQ4ISI = 1;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        if (i == 2) {
            str = (java.lang.String) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            backstackFlowStepService = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
            this.getInputSizeshNQ4ISI = 3;
            obj = com.paypal.oslo.feature.onboarding.steps.nav.domain.ReadableFlowStepService.m16514getFlowStepvm54Raw$default(backstackFlowStepService, str, null, null, this, 6, null);
        } else if (i == 3) {
            str = (java.lang.String) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            arrow.core.Either either = (arrow.core.Either) obj;
            com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel = this.getHighSpeedVideoSizesFor;
            if (either instanceof arrow.core.Either.Right) {
                com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step = (com.paypal.oslo.feature.onboarding.steps.nav.domain.Step) ((arrow.core.Either.Right) either).getValue();
                java.lang.String m16524getStepIdeVUBM90 = step.m16524getStepIdeVUBM90();
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(step);
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getInputSizeshNQ4ISI = 4;
            } else if (either instanceof arrow.core.Either.Left) {
                signupFlowViewModel.Camera2StreamConfigurationMap("Failed to initialize signup flow", false);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            if (i != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$initializeFlow$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$initializeFlow$1(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SignupFlowViewModel$initializeFlow$1(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$initializeFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = signupFlowViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = signupIntent;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
