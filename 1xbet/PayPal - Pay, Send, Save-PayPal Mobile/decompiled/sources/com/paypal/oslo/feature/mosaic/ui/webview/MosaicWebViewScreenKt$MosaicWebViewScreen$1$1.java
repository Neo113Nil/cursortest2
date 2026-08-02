package com.paypal.oslo.feature.mosaic.ui.webview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$1$1", f = "MosaicWebViewScreen.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, nl = {84}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class MosaicWebViewScreenKt$MosaicWebViewScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEffect complianceWebViewUiEffect = (com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEffect) obj;
            if (complianceWebViewUiEffect instanceof com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEffect.NavigateBack) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$1$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(complianceWebViewUiEffect instanceof com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEffect.NavigateBackWithResult)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEffect.NavigateBackWithResult navigateBackWithResult = (com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEffect.NavigateBackWithResult) complianceWebViewUiEffect;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Mosaic web flow navigate with result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", navigateBackWithResult.getResult().getStatus()), kotlin.TuplesKt.to("processStatus", navigateBackWithResult.getResult().getProcessStatus())), null, 4, null);
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEffect complianceWebViewUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(((com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEffect.NavigateBackWithResult) complianceWebViewUiEffect).getResult());
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            this.getHighSpeedVideoSizes = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.Camera2StreamConfigurationMap.getUiEffect$mosaic_prodRelease().collect(new com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MosaicWebViewScreenKt$MosaicWebViewScreen$1$1(com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel complianceWebViewViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewScreenKt$MosaicWebViewScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = complianceWebViewViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
    }
}
