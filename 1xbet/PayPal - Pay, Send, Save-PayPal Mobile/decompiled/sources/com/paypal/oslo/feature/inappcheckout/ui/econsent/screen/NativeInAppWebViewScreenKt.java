package com.paypal.oslo.feature.inappcheckout.ui.econsent.screen;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072%\b\u0002\u0010\b\u001a\u001f\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"NativeInAppWebViewScreen", "", "nativeInAppWebViewData", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", "onNavigateBack", "Lkotlin/Function0;", "analyticsTracker", "Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsTracker;", "webViewContent", "Lkotlin/Function2;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsTracker;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NativeInAppWebViewScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NativeInAppWebViewScreen(final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker nativeInAppWebViewAnalyticsTracker, kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function42;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeInAppWebViewData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeInAppWebViewAnalyticsTracker, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1186402267);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(nativeInAppWebViewData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(nativeInAppWebViewAnalyticsTracker) : startRestartGroup.changedInstance(nativeInAppWebViewAnalyticsTracker) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function42 = function4;
            i3 |= startRestartGroup.changedInstance(function42) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    function42 = com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.ComposableSingletons$NativeInAppWebViewScreenKt.INSTANCE.m15513getLambda$413787863$inappcheckout_prodRelease();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1186402267, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.NativeInAppWebViewScreen (NativeInAppWebViewScreen.kt:34)");
                }
                java.lang.String url = nativeInAppWebViewData.getUrl();
                java.lang.String title = nativeInAppWebViewData.getTitle();
                boolean changed = startRestartGroup.changed(url);
                boolean changed2 = startRestartGroup.changed(title);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(nativeInAppWebViewData.getUrl(), nativeInAppWebViewData.getSource(), nativeInAppWebViewData.isAuthRequired(), false, null, 24, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(nativeInAppWebViewData.getTitle(), null, true, true, false, 18, null), null, null, null, 117, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                int i5 = i3 & 896;
                boolean z = i5 == 256 || ((i3 & 512) != 0 && startRestartGroup.changedInstance(nativeInAppWebViewAnalyticsTracker));
                int i6 = i3 & 14;
                boolean z2 = i6 == 4;
                com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.NativeInAppWebViewScreenKt$NativeInAppWebViewScreen$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.NativeInAppWebViewScreenKt$NativeInAppWebViewScreen$1$1(nativeInAppWebViewAnalyticsTracker, nativeInAppWebViewData, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean z3 = i5 == 256 || ((i3 & 512) != 0 && startRestartGroup.changedInstance(nativeInAppWebViewAnalyticsTracker));
                boolean z4 = i6 == 4;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((z4 | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.NativeInAppWebViewScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.NativeInAppWebViewScreenKt.$r8$lambda$_tbw8lJcqWkpX1N7Rco2OpFEcFY(com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker.this, nativeInAppWebViewData, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(unit2, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, startRestartGroup, 6);
                boolean z5 = i5 == 256 || ((i3 & 512) != 0 && startRestartGroup.changedInstance(nativeInAppWebViewAnalyticsTracker));
                boolean z6 = (i3 & 112) == 32;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((z5 | z6) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.NativeInAppWebViewScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.NativeInAppWebViewScreenKt.$r8$lambda$iV3wKzk9IcUcAC9AjLVOgJ27dVw(com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker.this, function0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                function42.invoke(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, java.lang.Integer.valueOf(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | ((i3 >> 3) & 896)));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function43 = function42;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.NativeInAppWebViewScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.NativeInAppWebViewScreenKt.$r8$lambda$PkXvwSA7iuLhLArcj0VuIfp7O6w(com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData.this, function0, nativeInAppWebViewAnalyticsTracker, function43, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function42 = function4;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PkXvwSA7iuLhLArcj0VuIfp7O6w(com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker nativeInAppWebViewAnalyticsTracker, kotlin.jvm.functions.Function4 function4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NativeInAppWebViewScreen(nativeInAppWebViewData, function0, nativeInAppWebViewAnalyticsTracker, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$_tbw8lJcqWkpX1N7Rco2OpFEcFY(final com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker nativeInAppWebViewAnalyticsTracker, final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.NativeInAppWebViewScreenKt$NativeInAppWebViewScreen$lambda$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker.this.trackEvent(new com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenDismissed(nativeInAppWebViewData.getSource()));
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iV3wKzk9IcUcAC9AjLVOgJ27dVw(com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker nativeInAppWebViewAnalyticsTracker, kotlin.jvm.functions.Function0 function0) {
        nativeInAppWebViewAnalyticsTracker.trackEvent(new com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ComponentClicked("back_button", null, 2, null));
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
