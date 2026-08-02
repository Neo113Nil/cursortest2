package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\t\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\bH\u0002¨\u0006\u000b"}, d2 = {"AffiliateWebView", "", "config", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/iab/ui/affiliate/config/AffiliateWebViewConfiguration;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/iab/ui/affiliate/config/AffiliateWebViewConfiguration;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rememberAffiliateWebView", "Landroid/webkit/WebView;", "(Landroidx/compose/runtime/Composer;I)Landroid/webkit/WebView;", "dispose", "shopping-rewards_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AffiliateWebViewKt {
    public static final void AffiliateWebView(final com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate.config.AffiliateWebViewConfiguration affiliateWebViewConfiguration, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affiliateWebViewConfiguration, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1633092601);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(affiliateWebViewConfiguration) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1633092601, i5, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate.AffiliateWebView (AffiliateWebView.kt:43)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-21090450, 0, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate.rememberAffiliateWebView (AffiliateWebView.kt:68)");
            }
            android.content.Context applicationContext = ((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).getApplicationContext();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            java.lang.Object obj = rememberedValue;
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                android.webkit.WebView webView = new android.webkit.WebView(applicationContext);
                android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
                cookieManager.setAcceptCookie(true);
                cookieManager.setAcceptThirdPartyCookies(webView, true);
                webView.setWebViewClient(new android.webkit.WebViewClient());
                webView.setLayoutParams(new android.view.ViewGroup.LayoutParams(0, 0));
                startRestartGroup.updateRememberedValue(webView);
                obj = webView;
            }
            final android.webkit.WebView webView2 = (android.webkit.WebView) obj;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            boolean changedInstance = startRestartGroup.changedInstance(webView2);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate.AffiliateWebViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate.AffiliateWebViewKt.m19634$r8$lambda$1f8Z0nPnE7ymwQ0X9dsPDc8qgU(webView2, (android.content.Context) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView((kotlin.jvm.functions.Function1) rememberedValue2, modifier.then(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f))).then(androidx.compose.ui.draw.AlphaKt.alpha(androidx.compose.ui.Modifier.INSTANCE, 0.0f)), null, startRestartGroup, 0, 4);
            java.lang.String url = affiliateWebViewConfiguration.getUrl();
            boolean changedInstance2 = startRestartGroup.changedInstance(webView2);
            boolean z = (i5 & 14) == 4;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | z) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate.AffiliateWebViewKt$AffiliateWebView$2$1(webView2, affiliateWebViewConfiguration, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(url, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
            boolean changedInstance3 = startRestartGroup.changedInstance(webView2);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate.AffiliateWebViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate.AffiliateWebViewKt.$r8$lambda$YbOBkE3hsWxrrUqucdQHJLuEBqA(webView2, (androidx.compose.runtime.DisposableEffectScope) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(webView2, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue4, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate.AffiliateWebViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate.AffiliateWebViewKt.$r8$lambda$S9DAP8TMO2zMV4XuGzLTHQTf4lM(com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate.config.AffiliateWebViewConfiguration.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$1f8Z0nPnE7ymwQ-0X9dsPDc8qgU, reason: not valid java name */
    public static /* synthetic */ android.webkit.WebView m19634$r8$lambda$1f8Z0nPnE7ymwQ0X9dsPDc8qgU(android.webkit.WebView webView, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return webView;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S9DAP8TMO2zMV4XuGzLTHQTf4lM(com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate.config.AffiliateWebViewConfiguration affiliateWebViewConfiguration, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AffiliateWebView(affiliateWebViewConfiguration, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$YbOBkE3hsWxrrUqucdQHJLuEBqA(final android.webkit.WebView webView, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate.AffiliateWebViewKt$AffiliateWebView$lambda$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.affiliate.AffiliateWebViewKt.access$dispose(webView);
            }
        };
    }

    public static final /* synthetic */ void access$dispose(android.webkit.WebView webView) {
        webView.stopLoading();
        webView.clearHistory();
        webView.setWebViewClient(new android.webkit.WebViewClient());
        android.view.ViewParent parent = webView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.removeAllViews();
        webView.destroy();
    }
}
