package com.paypal.oslo.feature.settings.webview;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/api/navigation/L2SettingsWebViewDestination;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "toWebViewConfiguration", "(Lcom/paypal/oslo/feature/settings/api/navigation/L2SettingsWebViewDestination;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsWebViewExtensionsKt {
    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration toWebViewConfiguration(final com.paypal.oslo.feature.settings.api.navigation.L2SettingsWebViewDestination l2SettingsWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l2SettingsWebViewDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2145757647, i, -1, "com.paypal.oslo.feature.settings.webview.toWebViewConfiguration (SettingsWebViewExtensions.kt:21)");
        }
        com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest secureWebViewURLRequest = new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(l2SettingsWebViewDestination.getUrl(), l2SettingsWebViewDestination.getSource(), l2SettingsWebViewDestination.isAuthRequired(), l2SettingsWebViewDestination.getBypassUrlValidation(), null, 16, null);
        java.lang.String title = l2SettingsWebViewDestination.getTitle();
        boolean changedInstance = composer.changedInstance(l2SettingsWebViewDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.webview.SettingsWebViewExtensionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.settings.webview.SettingsWebViewExtensionsKt.m19314$r8$lambda$nk6JkWnTcCo0xnZnaEONrc3BWM(com.paypal.oslo.feature.settings.api.navigation.L2SettingsWebViewDestination.this, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, secureWebViewURLRequest, null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(title, (kotlin.jvm.functions.Function1) rememberedValue, false, false, false, 28, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, null, 101, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return secureWebViewConfiguration;
    }

    /* renamed from: $r8$lambda$nk6JkWnTcCo0xnZnaEONrc-3BWM, reason: not valid java name */
    public static /* synthetic */ java.lang.String m19314$r8$lambda$nk6JkWnTcCo0xnZnaEONrc3BWM(com.paypal.oslo.feature.settings.api.navigation.L2SettingsWebViewDestination l2SettingsWebViewDestination, java.lang.String str) {
        java.lang.String title = l2SettingsWebViewDestination.getTitle();
        if (title == null || str == null) {
            return null;
        }
        return kotlin.text.StringsKt.replace$default(str, str, title, false, 4, (java.lang.Object) null);
    }
}
