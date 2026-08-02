package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenKt$DocumentCaptureScreenContent$3$1", f = "DocumentCaptureScreen.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DocumentCaptureScreenKt$DocumentCaptureScreenContent$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.view.View getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect> uiEffect = this.Camera2StreamConfigurationMap.getUiEffect();
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighResolutionOutputSizeshNQ4ISI;
            final android.view.View view = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenKt$DocumentCaptureScreenContent$3$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    int i2;
                    com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect documentCaptureUiEffect = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect) obj2;
                    if (documentCaptureUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateToResult) {
                        function1.invoke(((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateToResult) documentCaptureUiEffect).getResult());
                    } else if (documentCaptureUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateBack) {
                        function0.invoke();
                    } else if (documentCaptureUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.HapticFeedback) {
                        android.view.View view2 = view;
                        int i3 = com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenKt$DocumentCaptureScreenContent$3$1.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.HapticFeedback) documentCaptureUiEffect).getType().ordinal()];
                        if (i3 == 1) {
                            i2 = android.os.Build.VERSION.SDK_INT >= 30 ? 16 : 4;
                        } else if (i3 == 2) {
                            i2 = android.os.Build.VERSION.SDK_INT >= 30 ? 17 : 0;
                        } else {
                            if (i3 != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            i2 = 6;
                        }
                        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(view2.performHapticFeedback(i2));
                    } else if (!(documentCaptureUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.ShowToast)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                /* renamed from: com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenKt$DocumentCaptureScreenContent$3$1$1$WhenMappings */
                public static final /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType.values().length];
                        try {
                            iArr[com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType.SUCCESS.ordinal()] = 1;
                        } catch (java.lang.NoSuchFieldError unused) {
                        }
                        try {
                            iArr[com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType.ERROR.ordinal()] = 2;
                        } catch (java.lang.NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType.WARNING.ordinal()] = 3;
                        } catch (java.lang.NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }
            }, this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenKt$DocumentCaptureScreenContent$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenKt$DocumentCaptureScreenContent$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DocumentCaptureScreenKt$DocumentCaptureScreenContent$3$1(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel documentCaptureViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, android.view.View view, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenKt$DocumentCaptureScreenContent$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = documentCaptureViewModel;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoFpsRanges = view;
    }
}
