package com.paypal.oslo.feature.webview.ui.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebExternalHandler$1$1", f = "OpenWebDeepLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class OpenWebDeepLinkHandlerKt$OpenWebExternalHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebExternalHandler$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebExternalHandler$1$1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        android.net.Uri parse = android.net.Uri.parse(this.getHighResolutionOutputSizeshNQ4ISI.getUrl());
        if (!kotlin.jvm.internal.Intrinsics.areEqual(parse.getScheme(), "http") && !kotlin.jvm.internal.Intrinsics.areEqual(parse.getScheme(), "https")) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.webview.LoggerKt.log;
            java.lang.String scheme = parse.getScheme();
            com.paypal.android.logger.Logger.w$default(logger, "open_web_external_invalid_scheme", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("scheme", scheme != null ? scheme : "")), null, 4, null);
            return kotlin.Unit.INSTANCE;
        }
        try {
            this.getHighSpeedVideoFpsRanges.startActivity(new android.content.Intent("android.intent.action.VIEW", parse));
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.webview.LoggerKt.log;
            java.lang.String host = parse.getHost();
            com.paypal.android.logger.Logger.e$default(logger2, "open_web_external_no_browser", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url_host", host != null ? host : "")), null, e, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebExternalHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebExternalHandler$1$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenWebDeepLinkHandlerKt$OpenWebExternalHandler$1$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination openWebDeepLinkDestination, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebExternalHandler$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = openWebDeepLinkDestination;
        this.getHighSpeedVideoFpsRanges = context;
    }
}
