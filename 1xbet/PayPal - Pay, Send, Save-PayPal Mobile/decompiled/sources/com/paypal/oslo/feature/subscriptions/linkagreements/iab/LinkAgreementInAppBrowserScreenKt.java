package com.paypal.oslo.feature.subscriptions.linkagreements.iab;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u001e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0080@¢\u0006\u0002\u0010\f\u001a3\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00112\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0013\u001a3\u0010\u0014\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u000e\u001a\u00020\u00152\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0016\u001a$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00152\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u0011H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0019²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"LinkAgreementInAppBrowserSource", "", "LinkAgreementInAppBrowserScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "collectUiEffects", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LinkAgreementInAppBrowserScreenContent", "state", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserEvent;", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LinkAgreementInAppBrowser", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserUiState$Default;", "(Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/LinkAgreementInAppBrowserUiState$Default;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "secureWebViewConfiguration", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkAgreementInAppBrowserScreenKt {
    public static final java.lang.String LinkAgreementInAppBrowserSource = "link-agreements-hub";

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkAgreementInAppBrowserScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel linkAgreementInAppBrowserViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementInAppBrowserViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(18507087);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(linkAgreementInAppBrowserViewModel) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(18507087, i4, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreen (LinkAgreementInAppBrowserScreen.kt:38)");
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(linkAgreementInAppBrowserViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                boolean changedInstance = startRestartGroup.changedInstance(linkAgreementInAppBrowserViewModel);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt.m19945$r8$lambda$rmroh4BAEAa_RK9k_91E4IEzfE(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 1);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance2 = startRestartGroup.changedInstance(linkAgreementInAppBrowserViewModel);
                boolean z = (i4 & 14) == 4;
                com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt$LinkAgreementInAppBrowserScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt$LinkAgreementInAppBrowserScreen$2$1(linkAgreementInAppBrowserViewModel, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState linkAgreementInAppBrowserUiState = (com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState) collectAsStateWithLifecycle.getValue();
                boolean changedInstance3 = startRestartGroup.changedInstance(linkAgreementInAppBrowserViewModel);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt.m19946$r8$lambda$0FScNuBHxFMrjlZrz_fPFfBs(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.this, (com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                modifier3 = modifier5;
                LinkAgreementInAppBrowserScreenContent(linkAgreementInAppBrowserUiState, (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.ui.platform.TestTagKt.testTag(modifier3, "link-agreement-in-app-browser-screen"), startRestartGroup, 0, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier6 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt.m19948$r8$lambda$Mdf4cjJNiJHcg5BQjSRocbeH44(com.paypal.oslo.core.navigation.AppNavigator.this, linkAgreementInAppBrowserViewModel, modifier6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final java.lang.Object collectUiEffects(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel linkAgreementInAppBrowserViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = linkAgreementInAppBrowserViewModel.getUiEffect().collect(new com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt$collectUiEffects$2(appNavigator), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public static final void LinkAgreementInAppBrowserScreenContent(final com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState linkAgreementInAppBrowserUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementInAppBrowserUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-446190584);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(linkAgreementInAppBrowserUiState) : startRestartGroup.changedInstance(linkAgreementInAppBrowserUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-446190584, i3, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenContent (LinkAgreementInAppBrowserScreen.kt:78)");
            }
            if (linkAgreementInAppBrowserUiState instanceof com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState.Default) {
                startRestartGroup.startReplaceGroup(707586694);
                LinkAgreementInAppBrowser(function1, (com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState.Default) linkAgreementInAppBrowserUiState, modifier, startRestartGroup, ((i3 >> 3) & 14) | ((i3 << 3) & 112) | (i3 & 896), 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(linkAgreementInAppBrowserUiState instanceof com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState.Error)) {
                    startRestartGroup.startReplaceGroup(707584744);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(707592519);
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt.m19949$r8$lambda$RFCG6fdlOf1FHSoagZrRppEhRI(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.subscriptions.shared.ui.error.ErrorScreenKt.ErrorScreen((kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, startRestartGroup, 48, 4);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt.$r8$lambda$hhxMOERoJhD11CywcpluST1AnQE(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState.this, function1, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LinkAgreementInAppBrowser(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState.Default r9, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1670763179);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(r9) : startRestartGroup.changedInstance(r9) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1670763179, i3, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowser (LinkAgreementInAppBrowserScreen.kt:98)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt.$r8$lambda$BWuqiqWX95FEvwh8cpXY3eJ9O6Q(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest urlRequest = r9.getUrlRequest();
            java.lang.String merchantName = r9.getMerchantName();
            boolean changed = startRestartGroup.changed(urlRequest);
            boolean changed2 = startRestartGroup.changed(merchantName);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = secureWebViewConfiguration(r9, function1);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView((com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue2, function0, modifier, null, startRestartGroup, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | 48 | (i3 & 896), 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt.$r8$lambda$u45PFmswS8ZwH8gC6UCZ3RCzUig(kotlin.jvm.functions.Function1.this, r9, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState.Default r16, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r16, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, r16.getUrlRequest(), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(r16.getMerchantName(), null, false, false, false, 30, null), r16.getSettings(), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration(com.paypal.oslo.feature.subscriptions.shared.iab.ui.WebViewClientDelegateKt.webViewClientDelegate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt.m19947$r8$lambda$6Rh_Pxjz_0vUia5HkQPd0CLa9c(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
            }
        }), null, 2, null), 37, null);
    }

    /* renamed from: $r8$lambda$-rmroh4BAEAa_RK9k_91E4IEzfE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19945$r8$lambda$rmroh4BAEAa_RK9k_91E4IEzfE(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel linkAgreementInAppBrowserViewModel) {
        linkAgreementInAppBrowserViewModel.onEvent((com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent) com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent.OnSystemBackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0FScNuBHxFM-rjlZ-rz_f-PFfBs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19946$r8$lambda$0FScNuBHxFMrjlZrz_fPFfBs(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel linkAgreementInAppBrowserViewModel, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent linkAgreementInAppBrowserEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementInAppBrowserEvent, "");
        linkAgreementInAppBrowserViewModel.onEvent(linkAgreementInAppBrowserEvent);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6Rh_Pxjz_0vUia5H-kQPd0CLa9c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19947$r8$lambda$6Rh_Pxjz_0vUia5HkQPd0CLa9c(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent.UrlLoadFailed(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BWuqiqWX95FEvwh8cpXY3eJ9O6Q(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent.BackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Mdf4cjJ-NiJHcg5BQjSRocbeH44, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19948$r8$lambda$Mdf4cjJNiJHcg5BQjSRocbeH44(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel linkAgreementInAppBrowserViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkAgreementInAppBrowserScreen(appNavigator, linkAgreementInAppBrowserViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RFCG6fdlOf1FHSoagZrRppEh-RI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19949$r8$lambda$RFCG6fdlOf1FHSoagZrRppEhRI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserEvent.TryAgainClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hhxMOERoJhD11CywcpluST1AnQE(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState linkAgreementInAppBrowserUiState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkAgreementInAppBrowserScreenContent(linkAgreementInAppBrowserUiState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$u45PFmswS8ZwH8gC6UCZ3RCzUig(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserUiState.Default r7, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkAgreementInAppBrowser(function1, r7, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
