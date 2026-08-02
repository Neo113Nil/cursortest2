package com.paypal.oslo.feature.businesshome.ui.webview;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ab\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052C\b\u0002\u0010\u0006\u001a=\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerConstants.Screens.WEBVIEW_SCREEN, "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "destination", "Lcom/paypal/oslo/feature/businesshome/di/navigation/WebViewDestination;", "webViewContent", "Lkotlin/Function2;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/ParameterName;", "name", "config", "Lkotlin/Function0;", "onBackClick", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/businesshome/di/navigation/WebViewDestination;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "business-home_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WebViewScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WebViewScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesshome.di.navigation.WebViewDestination webViewDestination, kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function42;
        kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function43;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewDestination, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1592197709);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(webViewDestination) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            function42 = function4;
            i3 |= startRestartGroup.changedInstance(function42) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                function43 = function42;
            } else {
                function43 = i4 != 0 ? com.paypal.oslo.feature.businesshome.ui.webview.ComposableSingletons$WebViewScreenKt.INSTANCE.getLambda$190166821$business_home_prodRelease() : function42;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1592197709, i3, -1, "com.paypal.oslo.feature.businesshome.ui.webview.WebViewScreen (WebViewScreen.kt:35)");
                }
                java.lang.String url = webViewDestination.getUrl();
                java.lang.String source = webViewDestination.getSource();
                boolean changed = startRestartGroup.changed(url);
                boolean changed2 = startRestartGroup.changed(source);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(new com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url(webViewDestination.getUrl(), webViewDestination.getSource(), false, false, null, 28, null), null, null, null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, null, 110, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue;
                boolean z = (i3 & 14) == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesshome.ui.webview.WebViewScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.businesshome.ui.webview.WebViewScreenKt.$r8$lambda$1aQ1E8cE8LIlolyC9qCHzSVg4j4(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                function43.invoke(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, java.lang.Integer.valueOf((i3 & 896) | com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function44 = function43;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesshome.ui.webview.WebViewScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesshome.ui.webview.WebViewScreenKt.$r8$lambda$GYJ05k_l9RYjtxkyWysHFQyfzb8(com.paypal.oslo.core.navigation.AppNavigator.this, webViewDestination, function44, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function42 = function4;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1aQ1E8cE8LIlolyC9qCHzSVg4j4(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.ui.webview.WebViewScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.ui.webview.WebViewScreenKt.m12985$r8$lambda$S5_fyL8Okkov9yFtpREl9GjeVc((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GYJ05k_l9RYjtxkyWysHFQyfzb8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesshome.di.navigation.WebViewDestination webViewDestination, kotlin.jvm.functions.Function4 function4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WebViewScreen(appNavigator, webViewDestination, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$S5_fyL-8Okkov9yFtpREl9GjeVc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12985$r8$lambda$S5_fyL8Okkov9yFtpREl9GjeVc(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }
}
