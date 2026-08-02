package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ay\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\r2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00030\rH\u0007¢\u0006\u0002\u0010\u0013\u001aV\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\r2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00030\rH\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018²\u0006\u0016\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\rX\u008a\u0084\u0002²\u0006\u0016\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\rX\u008a\u0084\u0002²\u0006\u0018\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00030\rX\u008a\u0084\u0002"}, d2 = {"WebViewMaxProgress", "", "ShoppingIABWebView", "", "url", "", "iabState", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABUiState;", "onBackPress", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onStateChange", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingWebViewState;", "overrideLoadingUrl", "", "onNavigationActionsReady", "Lcom/paypal/oslo/core/webview/ui/callback/NavigationWebViewActions;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABUiState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "buildSecureWebViewConfiguration", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "config", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABConfig;", "shopping-rewards_prodRelease", "currentOnStateChange", "currentOverrideLoadingUrl", "currentOnNavigationActionsReady"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShoppingIABWebViewKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShoppingIABWebView(final java.lang.String str, final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState shoppingIABUiState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> function12, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions, kotlin.Unit> function13, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState, kotlin.Unit> function14;
        int i5;
        kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> function15;
        int i6;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions, kotlin.Unit> function16;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState, kotlin.Unit> function17;
        final kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> function18;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingIABUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-463989519);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(shoppingIABUiState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function14 = function1;
                i3 |= startRestartGroup.changedInstance(function14) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function15 = function12;
                    i3 |= startRestartGroup.changedInstance(function15) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        function16 = function13;
                        i3 |= startRestartGroup.changedInstance(function16) ? 1048576 : 524288;
                        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            function17 = function14;
                            function18 = function15;
                        } else {
                            if (i7 != 0) {
                                modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt.m19632$r8$lambda$HC2C82o16Eb5K77p5azqCOC1jk((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                            }
                            if (i5 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return java.lang.Boolean.valueOf(com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt.$r8$lambda$7TIJmO1fUFvD0dX2R9sXugHkq58((java.lang.String) obj));
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function15 = (kotlin.jvm.functions.Function1) rememberedValue2;
                            }
                            if (i6 != 0) {
                                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                function16 = (kotlin.jvm.functions.Function1) rememberedValue3;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-463989519, i3, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebView (ShoppingIABWebView.kt:75)");
                            }
                            com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.logV$default(com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.INSTANCE, "ShoppingIABWebView composable called", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str)), 2, null);
                            com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABConfig webViewConfig = shoppingIABUiState.getWebViewConfig();
                            final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function14, startRestartGroup, (i3 >> 12) & 14);
                            final androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function15, startRestartGroup, (i3 >> 15) & 14);
                            final androidx.compose.runtime.State rememberUpdatedState3 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function16, startRestartGroup, (i3 >> 18) & 14);
                            boolean z = (i3 & 14) == 4;
                            boolean changed = startRestartGroup.changed(webViewConfig);
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if ((z | changed) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = buildSecureWebViewConfiguration(str, webViewConfig, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt.$r8$lambda$H3M9zLjFG8YI7e2k0zzKJ_fWmos(androidx.compose.runtime.State.this, (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState) obj);
                                    }
                                }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt.$r8$lambda$C8S7ART3xkujooGZik6GrII3J_o(androidx.compose.runtime.State.this, (java.lang.String) obj));
                                    }
                                }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt.m19633$r8$lambda$jTBlnGcfIdjFvdKs6wHmb2ZZZU(androidx.compose.runtime.State.this, (com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions) obj);
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue4;
                            if (((java.lang.Boolean) startRestartGroup.consume(androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                                startRestartGroup.startReplaceGroup(-1505755892);
                                androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                androidx.compose.runtime.ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                                if (endRestartGroup2 != null) {
                                    final androidx.compose.ui.Modifier modifier4 = modifier2;
                                    final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState, kotlin.Unit> function19 = function14;
                                    final kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> function110 = function15;
                                    final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions, kotlin.Unit> function111 = function16;
                                    endRestartGroup2.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt.$r8$lambda$qe92cXVYAxIbq4xr2GzEXpIUxgc(str, shoppingIABUiState, function0, modifier4, function19, function110, function111, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            startRestartGroup.startReplaceGroup(-1505689583);
                            startRestartGroup.endReplaceGroup();
                            androidx.compose.ui.Modifier modifier5 = modifier2;
                            kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState, kotlin.Unit> function112 = function14;
                            com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(secureWebViewConfiguration, function0, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, startRestartGroup, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | ((i3 >> 3) & 112), 8);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                            function18 = function15;
                            function17 = function112;
                        }
                        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions, kotlin.Unit> function113 = function16;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABWebViewKt.$r8$lambda$SIX2Pzb17dOwFSArhhs5ORo9Sn8(str, shoppingIABUiState, function0, modifier3, function17, function18, function113, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function16 = function13;
                    if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    final kotlin.jvm.functions.Function1 function1132 = function16;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function15 = function12;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                function16 = function13;
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                final kotlin.jvm.functions.Function1 function11322 = function16;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function14 = function1;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function15 = function12;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            function16 = function13;
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            final kotlin.jvm.functions.Function1 function113222 = function16;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function14 = function1;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function15 = function12;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        function16 = function13;
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        final kotlin.jvm.functions.Function1 function1132222 = function16;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration buildSecureWebViewConfiguration(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABConfig shoppingIABConfig, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> function12, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions, kotlin.Unit> function13) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingIABConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(str, shoppingIABConfig.getSource(), shoppingIABConfig.isAuthRequired(), shoppingIABConfig.getBypassUrlValidation(), shoppingIABConfig.getHeaders()), new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingSecureWebViewCallback(function13), new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(null, null, false, false, true, 11, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(shoppingIABConfig.getUserAgentString(), shoppingIABConfig.getEnableJavaScript()), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration(new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingWebViewClientDelegate(function1, function12), new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingWebChromeClientDelegate(function1)), 33, null);
    }

    public static /* synthetic */ boolean $r8$lambda$7TIJmO1fUFvD0dX2R9sXugHkq58(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$C8S7ART3xkujooGZik6GrII3J_o(androidx.compose.runtime.State state, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return ((java.lang.Boolean) ((kotlin.jvm.functions.Function1) state.getValue()).invoke(str)).booleanValue();
    }

    /* renamed from: $r8$lambda$H-C2C82o16Eb5K77p5azqCOC1jk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19632$r8$lambda$HC2C82o16Eb5K77p5azqCOC1jk(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState shoppingWebViewState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingWebViewState, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H3M9zLjFG8YI7e2k0zzKJ_fWmos(androidx.compose.runtime.State state, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState shoppingWebViewState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingWebViewState, "");
        ((kotlin.jvm.functions.Function1) state.getValue()).invoke(shoppingWebViewState);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SIX2Pzb17dOwFSArhhs5ORo9Sn8(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState shoppingIABUiState, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ShoppingIABWebView(str, shoppingIABUiState, function0, modifier, function1, function12, function13, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jTBlnGcfIdjF-vdKs6wHmb2ZZZU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19633$r8$lambda$jTBlnGcfIdjFvdKs6wHmb2ZZZU(androidx.compose.runtime.State state, com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions navigationWebViewActions) {
        ((kotlin.jvm.functions.Function1) state.getValue()).invoke(navigationWebViewActions);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qe92cXVYAxIbq4xr2GzEXpIUxgc(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState shoppingIABUiState, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ShoppingIABWebView(str, shoppingIABUiState, function0, modifier, function1, function12, function13, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
