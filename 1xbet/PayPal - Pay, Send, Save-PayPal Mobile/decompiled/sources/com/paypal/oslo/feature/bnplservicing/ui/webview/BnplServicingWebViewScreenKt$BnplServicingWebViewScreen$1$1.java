package com.paypal.oslo.feature.bnplservicing.ui.webview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewScreenKt$BnplServicingWebViewScreen$1$1", f = "BnplServicingWebViewScreen.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, nl = {102}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BnplServicingWebViewScreenKt$BnplServicingWebViewScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServScreenEvent(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, this.getHighSpeedVideoFpsRangesFor.getSessionStorage().getScreenEventAttributes(false), com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerConstants.Screens.WEBVIEW_SCREEN);
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighSpeedVideoFpsRangesFor.getUiEffect$bnpl_servicing_prodRelease().collect(new com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewScreenKt$BnplServicingWebViewScreen$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewScreenKt$BnplServicingWebViewScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            if (!(((com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiEffect) obj) instanceof com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiEffect.NavigateBack)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewScreenKt$BnplServicingWebViewScreen$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewScreenKt$BnplServicingWebViewScreen$1$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            this.getHighSpeedVideoFpsRangesFor = appNavigator;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewScreenKt$BnplServicingWebViewScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewScreenKt$BnplServicingWebViewScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BnplServicingWebViewScreenKt$BnplServicingWebViewScreen$1$1(com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel bnplServicingWebViewViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewScreenKt$BnplServicingWebViewScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = bnplServicingWebViewViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
    }
}
