package com.paypal.oslo.feature.verificationcapture.ui.webflow;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010("}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/webflow/DeeplinkWebViewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;", "delegate", "Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewConfigurerImpl;", "configurer", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "restConfig", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "tokenProvider", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewConfigurerImpl;Lcom/paypal/oslo/core/network/rest/config/RestConfig;Lcom/paypal/oslo/core/identity/domain/TokenProvider;)V", "Lkotlin/Function0;", "", "onSuccess", "onFailure", "registerCloseHandler", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "clearCloseHandler", "()V", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/VerificationCaptureDeeplinkDestination;", "destination", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "buildWebViewConfig", "(Lcom/paypal/oslo/feature/verificationcapture/api/navigation/VerificationCaptureDeeplinkDestination;Lcom/paypal/oslo/core/navigation/AppNavigator;)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewDelegateImpl;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/verificationcapture/webview/VerificationCaptureWebViewConfigurerImpl;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;", "getInputFormats", "Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;", "Camera2StreamConfigurationMap", "", "Ljava/lang/String;", "getOutputFormats", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeeplinkWebViewViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.String getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.rest.config.RestConfig getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.domain.TokenProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    @javax.inject.Inject
    public DeeplinkWebViewViewModel(com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl, com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl verificationCaptureWebViewConfigurerImpl, com.paypal.oslo.core.network.rest.config.RestConfig restConfig, com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureWebViewDelegateImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureWebViewConfigurerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProvider, "");
        this.getHighSpeedVideoSizes = verificationCaptureWebViewDelegateImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = verificationCaptureWebViewConfigurerImpl;
        this.getHighSpeedVideoFpsRanges = restConfig;
        this.getHighSpeedVideoFpsRangesFor = tokenProvider;
        this.Camera2StreamConfigurationMap = new com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("idassurance_deeplink", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0))));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel.AnonymousClass1(null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel$1", f = "DeeplinkWebViewViewModel.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes = 1;
                obj = com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel.this.getHighSpeedVideoFpsRangesFor.getToken(com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel.this.Camera2StreamConfigurationMap, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            arrow.core.Either either = (arrow.core.Either) obj;
            com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel deeplinkWebViewViewModel = com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel.this;
            if (either instanceof arrow.core.Either.Right) {
                deeplinkWebViewViewModel.getOutputFormats = ((com.paypal.oslo.core.identity.domain.model.Token) ((arrow.core.Either.Right) either).getValue()).getValue();
            } else if (either instanceof arrow.core.Either.Left) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Failed to prefetch EUAT token", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.identity.domain.model.TokenError) ((arrow.core.Either.Left) either).getValue()).toString())), null, 4, null);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final void registerCloseHandler(final kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, final kotlin.jvm.functions.Function0<kotlin.Unit> onFailure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSuccess, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFailure, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Registering deeplink close handler", null, null, 6, null);
        this.getHighSpeedVideoSizes.setCloseHandler$verification_capture_prodRelease(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel.m20695$r8$lambda$IoJ32Uvf464aFpIm21V_5ZPEqE(kotlin.jvm.functions.Function0.this, onFailure, (java.lang.String) obj);
            }
        });
    }

    public final void clearCloseHandler() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Clearing deeplink close handler", null, null, 6, null);
        this.getHighSpeedVideoSizes.setCloseHandler$verification_capture_prodRelease(null);
    }

    /* renamed from: $r8$lambda$IoJ32Uvf464aFpIm21V-_5ZPEqE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20695$r8$lambda$IoJ32Uvf464aFpIm21V_5ZPEqE(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "success")) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x004f, code lost:
    
        if (r8.length() != 0) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration buildWebViewConfig(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDeeplinkDestination destination, com.paypal.oslo.core.navigation.AppNavigator navigator) {
        java.lang.String host;
        java.lang.String token;
        java.lang.String uuid;
        java.util.Map emptyMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        android.net.Uri.Builder scheme = new android.net.Uri.Builder().scheme("https");
        java.lang.String baseUrl = this.getHighSpeedVideoFpsRanges.getBaseUrl();
        java.lang.String str = baseUrl;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "stage.paypal.com", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "qa.paypal.com", false, 2, (java.lang.Object) null)) {
            host = android.net.Uri.parse(baseUrl).getHost();
            java.lang.String str2 = host;
            if (str2 != null) {
            }
        }
        host = "www.paypal.com";
        android.net.Uri.Builder authority = scheme.authority(host);
        java.lang.String url = destination.getUrl();
        java.lang.String str3 = url;
        if (str3 == null || str3.length() == 0) {
            authority.path("/idassurance");
        } else {
            android.net.Uri parse = android.net.Uri.parse(url);
            java.lang.String scheme2 = parse.getScheme();
            if (kotlin.jvm.internal.Intrinsics.areEqual(scheme2, "https") || kotlin.jvm.internal.Intrinsics.areEqual(scheme2, "http")) {
                authority.path(parse.getPath());
                java.util.Set<java.lang.String> queryParameterNames = parse.getQueryParameterNames();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
                for (java.lang.String str4 : queryParameterNames) {
                    authority.appendQueryParameter(str4, parse.getQueryParameter(str4));
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "url param has no http/https scheme — falling back to default idassurance path", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), null, 4, null);
                authority.path("/idassurance");
            }
        }
        java.lang.String token2 = destination.getToken();
        if (token2 != null && token2.length() != 0) {
            authority.appendQueryParameter(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, destination.getToken());
        }
        java.lang.String uuid2 = destination.getUuid();
        if (uuid2 != null && uuid2.length() != 0) {
            authority.appendQueryParameter(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, destination.getUuid());
        }
        java.lang.String url2 = destination.getUrl();
        if ((url2 == null || url2.length() == 0) && (((token = destination.getToken()) == null || token.length() == 0) && ((uuid = destination.getUuid()) == null || uuid.length() == 0))) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "No uuid, token, or url provided for deeplink destination", null, null, 6, null);
        }
        authority.appendQueryParameter("country.x", locale.getCountry());
        authority.appendQueryParameter("locale.x", locale.toString());
        java.lang.String obj = authority.build().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Building deeplink WebView config", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", obj)), null, 4, null);
        java.lang.String str5 = this.getOutputFormats;
        if (str5 == null || (emptyMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.zettle.sdk.interceptors.auth.AuthenticatorInterceptorKt.PAYPAL_AUTHORIZATION, str5))) == null) {
            emptyMap = kotlin.collections.MapsKt.emptyMap();
        }
        com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig secureWebViewUiConfig = new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(null, null, true, true, false, 19, null);
        return this.getHighResolutionOutputSizeshNQ4ISI.configure(new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(new com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url(obj, "idassurance_deeplink", false, false, emptyMap), 0 == true ? 1 : 0, null, secureWebViewUiConfig, new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, 0 == true ? 1 : 0, 2, null), navigator);
    }
}
