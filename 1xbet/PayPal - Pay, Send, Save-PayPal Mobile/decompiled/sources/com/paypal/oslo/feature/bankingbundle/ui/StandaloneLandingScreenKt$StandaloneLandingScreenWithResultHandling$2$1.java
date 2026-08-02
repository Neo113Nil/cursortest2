package com.paypal.oslo.feature.bankingbundle.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$2$1", f = "StandaloneLandingScreen.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, nl = {100}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    int getOutputFormats;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/bankingbundle/ui/mvi/StandaloneLandingEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$2$1$1", f = "StandaloneLandingScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.bankingbundle.ui.mvi.StandaloneLandingEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.bankingbundle.ui.mvi.StandaloneLandingEffect standaloneLandingEffect = (com.paypal.oslo.feature.bankingbundle.ui.mvi.StandaloneLandingEffect) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (standaloneLandingEffect instanceof com.paypal.oslo.feature.bankingbundle.ui.mvi.StandaloneLandingEffect.NavigateBack) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke();
            } else if (standaloneLandingEffect instanceof com.paypal.oslo.feature.bankingbundle.ui.mvi.StandaloneLandingEffect.NavigateToBenefitsComparison) {
                this.Camera2StreamConfigurationMap.invoke();
            } else if (standaloneLandingEffect instanceof com.paypal.oslo.feature.bankingbundle.ui.mvi.StandaloneLandingEffect.ShowTerms) {
                this.getHighSpeedVideoFpsRanges.invoke();
            } else {
                if (!(standaloneLandingEffect instanceof com.paypal.oslo.feature.bankingbundle.ui.mvi.StandaloneLandingEffect.LaunchOneOnboarding)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.invoke();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bankingbundle.ui.mvi.StandaloneLandingEffect standaloneLandingEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$2$1.AnonymousClass1) create(standaloneLandingEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = function0;
            this.Camera2StreamConfigurationMap = function02;
            this.getHighSpeedVideoFpsRanges = function03;
            this.getHighSpeedVideoSizes = function04;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats = 1;
            if (kotlinx.coroutines.flow.FlowKt.collect(kotlinx.coroutines.flow.FlowKt.onEach(this.getHighResolutionOutputSizeshNQ4ISI.getEffect(), new com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, null)), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$2$1(com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel standaloneLandingViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = standaloneLandingViewModel;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.Camera2StreamConfigurationMap = function02;
        this.getHighSpeedVideoSizes = function03;
        this.getHighSpeedVideoFpsRanges = function04;
    }
}
