package com.paypal.oslo.feature.identity.sna.ui.screens;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$AutomaticMobileVerificationScreen$2$1", f = "AutomaticMobileVerificationScreen.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, nl = {98}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AutomaticMobileVerificationScreenKt$AutomaticMobileVerificationScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$AutomaticMobileVerificationScreen$2$1$1", f = "AutomaticMobileVerificationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$AutomaticMobileVerificationScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect automaticMobileVerificationUiEffect = (com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(automaticMobileVerificationUiEffect instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.ShowError)) {
                if (automaticMobileVerificationUiEffect instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.NavigateToPrivacyPolicy) {
                    this.Camera2StreamConfigurationMap.invoke(this.getHighResolutionOutputSizeshNQ4ISI, "Number Verification Policy");
                } else if (!(automaticMobileVerificationUiEffect instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.NavigateToUpdateNumber)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect automaticMobileVerificationUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$AutomaticMobileVerificationScreen$2$1.AnonymousClass1) create(automaticMobileVerificationUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$AutomaticMobileVerificationScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$AutomaticMobileVerificationScreen$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$AutomaticMobileVerificationScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = function2;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.Camera2StreamConfigurationMap.getUiEffect(), new com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$AutomaticMobileVerificationScreen$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$AutomaticMobileVerificationScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$AutomaticMobileVerificationScreen$2$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AutomaticMobileVerificationScreenKt$AutomaticMobileVerificationScreen$2$1(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel automaticMobileVerificationViewModel, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$AutomaticMobileVerificationScreen$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = automaticMobileVerificationViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
