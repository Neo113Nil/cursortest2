package com.paypal.oslo.feature.directdeposit.ui.intro.composable;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.intro.composable.DirectDepositIntroScreenKt$DirectDepositIntroScreen$3$1", f = "DirectDepositIntroScreen.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, nl = {74}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DirectDepositIntroScreenKt$DirectDepositIntroScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/directdeposit/ui/intro/effect/IntroEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.intro.composable.DirectDepositIntroScreenKt$DirectDepositIntroScreen$3$1$1", f = "DirectDepositIntroScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.directdeposit.ui.intro.composable.DirectDepositIntroScreenKt$DirectDepositIntroScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.directdeposit.ui.intro.effect.IntroEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.directdeposit.ui.intro.effect.IntroEffect introEffect = (com.paypal.oslo.feature.directdeposit.ui.intro.effect.IntroEffect) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (introEffect instanceof com.paypal.oslo.feature.directdeposit.ui.intro.effect.IntroEffect.NavigateBack) {
                this.Camera2StreamConfigurationMap.invoke();
            } else if (introEffect instanceof com.paypal.oslo.feature.directdeposit.ui.intro.effect.IntroEffect.NavigateToNext) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke();
            } else {
                if (!(introEffect instanceof com.paypal.oslo.feature.directdeposit.ui.intro.effect.IntroEffect.ShowToast)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRanges.setValue(((com.paypal.oslo.feature.directdeposit.ui.intro.effect.IntroEffect.ShowToast) introEffect).getMessage());
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.directdeposit.ui.intro.effect.IntroEffect introEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.directdeposit.ui.intro.composable.DirectDepositIntroScreenKt$DirectDepositIntroScreen$3$1.AnonymousClass1) create(introEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.directdeposit.ui.intro.composable.DirectDepositIntroScreenKt$DirectDepositIntroScreen$3$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.directdeposit.ui.intro.composable.DirectDepositIntroScreenKt$DirectDepositIntroScreen$3$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighSpeedVideoSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.MutableState<java.lang.String> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.intro.composable.DirectDepositIntroScreenKt$DirectDepositIntroScreen$3$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = function0;
            this.getHighResolutionOutputSizeshNQ4ISI = function02;
            this.getHighSpeedVideoFpsRanges = mutableState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.Camera2StreamConfigurationMap.getEffect(), new com.paypal.oslo.feature.directdeposit.ui.intro.composable.DirectDepositIntroScreenKt$DirectDepositIntroScreen$3$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.directdeposit.ui.intro.composable.DirectDepositIntroScreenKt$DirectDepositIntroScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.directdeposit.ui.intro.composable.DirectDepositIntroScreenKt$DirectDepositIntroScreen$3$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectDepositIntroScreenKt$DirectDepositIntroScreen$3$1(com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroViewModel directDepositIntroViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.MutableState<java.lang.String> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.intro.composable.DirectDepositIntroScreenKt$DirectDepositIntroScreen$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = directDepositIntroViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoFpsRangesFor = function02;
        this.getHighSpeedVideoSizes = mutableState;
    }
}
