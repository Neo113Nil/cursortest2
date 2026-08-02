package com.paypal.oslo.feature.webview.ui.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebInternalHandler$1$1", f = "OpenWebDeepLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class OpenWebDeepLinkHandlerKt$OpenWebInternalHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r7 == null) goto L10;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final java.lang.String source = this.getHighResolutionOutputSizeshNQ4ISI.getSource();
        if (source != null) {
            if (kotlin.text.StringsKt.isBlank(source)) {
                source = null;
            }
        }
        source = com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt.DefaultSource;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.webview.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = kotlin.TuplesKt.to("source", source);
        java.lang.String type = this.getHighResolutionOutputSizeshNQ4ISI.getType();
        if (type == null) {
            type = "null";
        }
        pairArr[1] = kotlin.TuplesKt.to("type", type);
        pairArr[2] = kotlin.TuplesKt.to("auth_required", java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.getShouldRequireAuth()));
        pairArr[3] = kotlin.TuplesKt.to("url", this.getHighResolutionOutputSizeshNQ4ISI.getUrl());
        com.paypal.android.logger.Logger.d$default(logger, "open_web_internal_routing", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRangesFor;
        final com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination openWebDeepLinkDestination = this.getHighResolutionOutputSizeshNQ4ISI;
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebInternalHandler$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebInternalHandler$1$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.this, source, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination openWebDeepLinkDestination, java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(new com.paypal.oslo.core.webview.navigation.SecureWebViewDestination(new com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData(openWebDeepLinkDestination.getUrl(), str, openWebDeepLinkDestination.getTitle(), openWebDeepLinkDestination.getShouldRequireAuth(), false, true, 16, null)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebInternalHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebInternalHandler$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenWebDeepLinkHandlerKt$OpenWebInternalHandler$1$1(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination openWebDeepLinkDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebInternalHandler$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = openWebDeepLinkDestination;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }
}
