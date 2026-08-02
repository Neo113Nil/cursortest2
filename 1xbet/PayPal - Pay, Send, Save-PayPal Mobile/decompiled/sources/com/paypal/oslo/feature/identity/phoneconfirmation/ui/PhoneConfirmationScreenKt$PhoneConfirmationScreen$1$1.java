package com.paypal.oslo.feature.identity.phoneconfirmation.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1", f = "PhoneConfirmationScreen.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, nl = {99}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.phoneconfirmation.navigation.OTPVerificationScreenDestination, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1$1", f = "PhoneConfirmationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.phoneconfirmation.navigation.OTPVerificationScreenDestination, kotlin.Unit> Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect phoneConfirmationUiEffect = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (phoneConfirmationUiEffect instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateToOTPVerification) {
                this.Camera2StreamConfigurationMap.invoke(((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateToOTPVerification) phoneConfirmationUiEffect).getDestination());
            } else if (phoneConfirmationUiEffect instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateBack) {
                this.getHighSpeedVideoFpsRangesFor.invoke();
            } else {
                if (!(phoneConfirmationUiEffect instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.ShowErrorToast)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                android.widget.Toast.makeText(this.getHighSpeedVideoFpsRanges, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.ShowErrorToast) phoneConfirmationUiEffect).getMessage(), 0).show();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect phoneConfirmationUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1.AnonymousClass1) create(phoneConfirmationUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.phoneconfirmation.navigation.OTPVerificationScreenDestination, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = function1;
            this.getHighSpeedVideoFpsRangesFor = function0;
            this.getHighSpeedVideoFpsRanges = context;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.Camera2StreamConfigurationMap.getUiEffect(), new com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1(com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel phoneConfirmationViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.phoneconfirmation.navigation.OTPVerificationScreenDestination, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = phoneConfirmationViewModel;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }
}
