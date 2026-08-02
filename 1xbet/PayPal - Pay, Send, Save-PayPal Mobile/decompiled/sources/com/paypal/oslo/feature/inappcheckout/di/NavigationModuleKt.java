package com.paypal.oslo.feature.inappcheckout.di;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\" \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavigationModuleKt {
    private static final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);

    public static /* synthetic */ kotlin.Unit $r8$lambda$208CyWCpZBdST67frPDHQcHFtJ4(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel appSwitchWebViewViewModel, com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge secureWebViewJavaScriptBridge, android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        appSwitchWebViewViewModel.handleWebViewUrlLoaded(secureWebViewJavaScriptBridge, uri);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b9OPG8SbB8wfj2bEMV_SA07YeGE(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel appSwitchWebViewViewModel) {
        appSwitchWebViewViewModel.onUserCancelRequested(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource.BackPress);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hNT9JnT7z8m4dr72JBNdyGvvwFM(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator) {
        inAppCheckoutCoordinator.navigateToPayPalHomeScreen();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ktgHz6ZuBy4iyLqHflUWCXuZ4Zw(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel appSwitchWebViewViewModel) {
        appSwitchWebViewViewModel.onUserCancelRequested(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource.BackPress);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ueed89Y4MAgXX6iTx_Xl0U4Csq4(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel appSwitchWebViewViewModel) {
        appSwitchWebViewViewModel.onUserCancelRequested(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource.ReturnButton);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions access$rememberNonRecoverableActions(final com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel appSwitchWebViewViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1463098333, i, -1, "com.paypal.oslo.feature.inappcheckout.di.rememberNonRecoverableActions (NavigationModule.kt:212)");
        }
        boolean changed = composer.changed(appSwitchWebViewViewModel);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions nonRecoverableScreenActions = new com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions(new com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt$rememberNonRecoverableActions$1$1(appSwitchWebViewViewModel), new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.$r8$lambda$b9OPG8SbB8wfj2bEMV_SA07YeGE(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.this);
                }
            });
            composer.updateRememberedValue(nonRecoverableScreenActions);
            rememberedValue = nonRecoverableScreenActions;
        }
        com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions nonRecoverableScreenActions2 = (com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return nonRecoverableScreenActions2;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions access$rememberWebViewScreenActions(final com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel appSwitchWebViewViewModel, final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(182351445, i, -1, "com.paypal.oslo.feature.inappcheckout.di.rememberWebViewScreenActions (NavigationModule.kt:189)");
        }
        boolean changed = composer.changed(appSwitchWebViewViewModel);
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(inAppCheckoutCoordinator)) || (i & 48) == 32;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions webViewScreenActions = new com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions(new com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt$rememberWebViewScreenActions$1$1(appSwitchWebViewViewModel), new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.$r8$lambda$208CyWCpZBdST67frPDHQcHFtJ4(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.this, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge) obj, (android.net.Uri) obj2);
                }
            }, new com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt$rememberWebViewScreenActions$1$3(appSwitchWebViewViewModel), new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.$r8$lambda$ktgHz6ZuBy4iyLqHflUWCXuZ4Zw(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.this);
                }
            }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.$r8$lambda$hNT9JnT7z8m4dr72JBNdyGvvwFM(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this);
                }
            }, new com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt$rememberWebViewScreenActions$1$6(appSwitchWebViewViewModel), new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.$r8$lambda$ueed89Y4MAgXX6iTx_Xl0U4Csq4(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.this);
                }
            }, new kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlin.Unit>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt$rememberWebViewScreenActions$1$8
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                    com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext2 = checkoutAuthenticationContext;
                    java.lang.String m11592unboximpl = navResultRequestId.m11592unboximpl();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationContext2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m11592unboximpl, "");
                    com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.m15467navigateToCheckoutAuthenticationhN0UB1M(checkoutAuthenticationContext2, m11592unboximpl);
                    return kotlin.Unit.INSTANCE;
                }
            });
            composer.updateRememberedValue(webViewScreenActions);
            rememberedValue = webViewScreenActions;
        }
        com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions webViewScreenActions2 = (com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return webViewScreenActions2;
    }
}
