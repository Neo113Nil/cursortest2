package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$2$1", f = "EmailEntryScreen.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, nl = {117}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class EmailEntryScreenKt$EmailEntryScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailNavigationEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$2$1$1", f = "EmailEntryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect emailNavigationEffect = (com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (kotlin.jvm.internal.Intrinsics.areEqual(emailNavigationEffect, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect.NavigateNext.INSTANCE)) {
                this.Camera2StreamConfigurationMap.getOnNavigateNext().invoke();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(emailNavigationEffect, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect.NavigateBack.INSTANCE)) {
                this.Camera2StreamConfigurationMap.getOnNavigateBack().invoke();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(emailNavigationEffect, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect.NavigateBackWithEmailAlreadyExists.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.Camera2StreamConfigurationMap.getOnExitFlow().invoke(new com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult(new com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.EmailAlreadyExists(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt.access$EmailEntryScreen$lambda$0(this.getHighSpeedVideoFpsRangesFor).getEmailData().m16483getEmailBvNjjI(), (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect emailNavigationEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$2$1.AnonymousClass1) create(emailNavigationEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, androidx.compose.runtime.State<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = stepCallbacks;
            this.getHighSpeedVideoFpsRangesFor = state;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.Camera2StreamConfigurationMap.getNavigationEffects$onboarding_prodRelease(), new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$2$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailEntryScreenKt$EmailEntryScreen$2$1(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel emailViewModel, com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, androidx.compose.runtime.State<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = emailViewModel;
        this.getHighSpeedVideoFpsRanges = stepCallbacks;
        this.getHighSpeedVideoFpsRangesFor = state;
    }
}
