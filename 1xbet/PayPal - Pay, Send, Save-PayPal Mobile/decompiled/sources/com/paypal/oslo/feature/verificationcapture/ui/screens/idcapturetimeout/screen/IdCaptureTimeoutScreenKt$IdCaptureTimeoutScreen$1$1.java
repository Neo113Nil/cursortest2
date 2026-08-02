package com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.screen.IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$1$1", f = "IdCaptureTimeoutScreen.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, nl = {71}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel.IdCaptureTimeoutViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.Navigator getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.screen.IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$1$1$1", f = "IdCaptureTimeoutScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.screen.IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.Navigator getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiEffect idCaptureTimeoutUiEffect = (com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiEffect) this.Camera2StreamConfigurationMap;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (idCaptureTimeoutUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiEffect.NavigateToRetryAutoCapture) {
                this.getHighSpeedVideoFpsRangesFor.popBackStack();
            } else {
                if (!(idCaptureTimeoutUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiEffect.NavigateToManualCapture)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRangesFor.popBackStack();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiEffect idCaptureTimeoutUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.screen.IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$1$1.AnonymousClass1) create(idCaptureTimeoutUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.screen.IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.screen.IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.Camera2StreamConfigurationMap = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.screen.IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = navigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.Camera2StreamConfigurationMap.getUiEffect(), new com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.screen.IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.screen.IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.screen.IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$1$1(com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel.IdCaptureTimeoutViewModel idCaptureTimeoutViewModel, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.screen.IdCaptureTimeoutScreenKt$IdCaptureTimeoutScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = idCaptureTimeoutViewModel;
        this.getHighSpeedVideoFpsRanges = navigator;
    }
}
