package com.paypal.oslo.feature.identity.phoneconfirmation.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationScreenKt$OTPVerificationScreen$1$1", f = "OTPVerificationScreen.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, nl = {113}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class OTPVerificationScreenKt$OTPVerificationScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.platform.SoftwareKeyboardController getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel getHighSpeedVideoSizes;
    int getOutputFormats;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationScreenKt$OTPVerificationScreen$1$1$1", f = "OTPVerificationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationScreenKt$OTPVerificationScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.ui.platform.SoftwareKeyboardController getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
        int getOutputFormats;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect oTPVerificationUiEffect = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputFormats != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (oTPVerificationUiEffect instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.VerificationComplete) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke(((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.VerificationComplete) oTPVerificationUiEffect).getPhoneNumber());
            } else if (oTPVerificationUiEffect instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.NavigateBack) {
                this.Camera2StreamConfigurationMap.invoke();
            } else if (oTPVerificationUiEffect instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowSuccessToast) {
                android.widget.Toast.makeText(this.getHighSpeedVideoFpsRanges, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowSuccessToast) oTPVerificationUiEffect).getMessage(), 0).show();
            } else if (oTPVerificationUiEffect instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowErrorToast) {
                android.widget.Toast.makeText(this.getHighSpeedVideoFpsRanges, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowErrorToast) oTPVerificationUiEffect).getMessage(), 0).show();
            } else {
                if (!(oTPVerificationUiEffect instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.HideKeyboard)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = this.getHighSpeedVideoFpsRangesFor;
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.hide();
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect oTPVerificationUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationScreenKt$OTPVerificationScreen$1$1.AnonymousClass1) create(oTPVerificationUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationScreenKt$OTPVerificationScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationScreenKt$OTPVerificationScreen$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, android.content.Context context, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationScreenKt$OTPVerificationScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = function1;
            this.Camera2StreamConfigurationMap = function0;
            this.getHighSpeedVideoFpsRanges = context;
            this.getHighSpeedVideoFpsRangesFor = softwareKeyboardController;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizes.getUiEffect(), new com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationScreenKt$OTPVerificationScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationScreenKt$OTPVerificationScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationScreenKt$OTPVerificationScreen$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OTPVerificationScreenKt$OTPVerificationScreen$1$1(com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel oTPVerificationViewModel, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, android.content.Context context, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationScreenKt$OTPVerificationScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = oTPVerificationViewModel;
        this.getHighSpeedVideoFpsRanges = function1;
        this.Camera2StreamConfigurationMap = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.getHighSpeedVideoFpsRangesFor = softwareKeyboardController;
    }
}
