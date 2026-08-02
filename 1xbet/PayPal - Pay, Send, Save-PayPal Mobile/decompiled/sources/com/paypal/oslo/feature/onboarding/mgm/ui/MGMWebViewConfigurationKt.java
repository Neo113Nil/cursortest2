package com.paypal.oslo.feature.onboarding.mgm.ui;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "url", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "rememberMGMWebViewConfiguration", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MGMWebViewConfigurationKt {
    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration rememberMGMWebViewConfiguration(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2043607581, i, -1, "com.paypal.oslo.feature.onboarding.mgm.ui.rememberMGMWebViewConfiguration (MGMWebViewConfiguration.kt:46)");
        }
        final android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler();
            composer.updateRememberedValue(rememberedValue);
        }
        final com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler mGMShareHandler = (com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler) rememberedValue;
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(new com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url(str, "mgm-invite-friends", true, false, null, 24, null), null, null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(null, null, true, false, true, 11, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings("PayPalMobile", true), new com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Android", new com.paypal.oslo.feature.onboarding.mgm.domain.MGMJavaScriptInterface(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.mgm.ui.MGMWebViewConfigurationKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.onboarding.mgm.ui.MGMWebViewConfigurationKt.$r8$lambda$BynY6SMgOQ8rolt4s895UWtrBbY(com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.this, context, (java.lang.String) obj);
                }
            }))), null, 2, null), null, 70, null);
            composer.updateRememberedValue(secureWebViewConfiguration);
            rememberedValue2 = secureWebViewConfiguration;
        }
        com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration2 = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return secureWebViewConfiguration2;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BynY6SMgOQ8rolt4s895UWtrBbY(com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler mGMShareHandler, android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mGMShareHandler.shareInvite(context, str);
        return kotlin.Unit.INSTANCE;
    }
}
