package com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.screen.LivenessReviewScreenKt$LivenessReviewScreen$1$1", f = "LivenessReviewScreen.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, nl = {70}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class LivenessReviewScreenKt$LivenessReviewScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel.LivenessReviewViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/livenessreview/contract/LivenessReviewUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.screen.LivenessReviewScreenKt$LivenessReviewScreen$1$1$1", f = "LivenessReviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.screen.LivenessReviewScreenKt$LivenessReviewScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiEffect livenessReviewUiEffect = (com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiEffect) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(livenessReviewUiEffect, com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiEffect.NavigateToLivenessCheck.INSTANCE) && !(livenessReviewUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiEffect.NavigateToSuccess) && !(livenessReviewUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiEffect.ShowError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.contract.LivenessReviewUiEffect livenessReviewUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.screen.LivenessReviewScreenKt$LivenessReviewScreen$1$1.AnonymousClass1) create(livenessReviewUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.screen.LivenessReviewScreenKt$LivenessReviewScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.screen.LivenessReviewScreenKt$LivenessReviewScreen$1$1.AnonymousClass1(continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.screen.LivenessReviewScreenKt$LivenessReviewScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizes.getUiEffect(), new com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.screen.LivenessReviewScreenKt$LivenessReviewScreen$1$1.AnonymousClass1(null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.screen.LivenessReviewScreenKt$LivenessReviewScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.screen.LivenessReviewScreenKt$LivenessReviewScreen$1$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LivenessReviewScreenKt$LivenessReviewScreen$1$1(com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel.LivenessReviewViewModel livenessReviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.screen.LivenessReviewScreenKt$LivenessReviewScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = livenessReviewViewModel;
    }
}
