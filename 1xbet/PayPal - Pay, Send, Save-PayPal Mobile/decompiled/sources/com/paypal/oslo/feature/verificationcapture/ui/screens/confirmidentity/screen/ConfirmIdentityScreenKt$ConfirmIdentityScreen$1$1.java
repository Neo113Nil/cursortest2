package com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1", f = "ConfirmIdentityScreen.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, nl = {67}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.Navigator getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1$1", f = "ConfirmIdentityScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.Navigator getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiEffect confirmIdentityUiEffect = (com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiEffect) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(confirmIdentityUiEffect, com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiEffect.NavigateToLivenessCheck.INSTANCE)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(confirmIdentityUiEffect, com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiEffect.NavigateBack.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRangesFor.popBackStack();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiEffect confirmIdentityUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1.AnonymousClass1) create(confirmIdentityUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = navigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.Camera2StreamConfigurationMap.getUiEffect(), new com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1(com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel confirmIdentityViewModel, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen.ConfirmIdentityScreenKt$ConfirmIdentityScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = confirmIdentityViewModel;
        this.getHighSpeedVideoFpsRanges = navigator;
    }
}
