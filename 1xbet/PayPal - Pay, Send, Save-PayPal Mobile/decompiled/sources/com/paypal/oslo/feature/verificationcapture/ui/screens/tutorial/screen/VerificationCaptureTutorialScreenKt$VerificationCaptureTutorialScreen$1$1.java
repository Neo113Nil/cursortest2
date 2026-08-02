package com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1", f = "VerificationCaptureTutorialScreen.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, nl = {81}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.Navigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/tutorial/contract/VerificationCaptureTutorialUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1$1", f = "VerificationCaptureTutorialScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.Navigator getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiEffect verificationCaptureTutorialUiEffect = (com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiEffect) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (kotlin.jvm.internal.Intrinsics.areEqual(verificationCaptureTutorialUiEffect, com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiEffect.NavigateToDocumentCapture.INSTANCE)) {
                this.getHighSpeedVideoFpsRanges.navigate(new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination("DRIVERS_LICENSE", com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT, (com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(verificationCaptureTutorialUiEffect, com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiEffect.NavigateBack.INSTANCE)) {
                this.getHighSpeedVideoFpsRanges.popBackStack();
            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(verificationCaptureTutorialUiEffect, com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiEffect.RequestCameraPermission.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(verificationCaptureTutorialUiEffect, com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiEffect.ShowPermissionDeniedDialog.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.contract.VerificationCaptureTutorialUiEffect verificationCaptureTutorialUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1.AnonymousClass1) create(verificationCaptureTutorialUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighSpeedVideoSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = navigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRangesFor.getUiEffect(), new com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1(com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel verificationCaptureTutorialViewModel, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.screen.VerificationCaptureTutorialScreenKt$VerificationCaptureTutorialScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = verificationCaptureTutorialViewModel;
        this.getHighSpeedVideoFpsRanges = navigator;
    }
}
