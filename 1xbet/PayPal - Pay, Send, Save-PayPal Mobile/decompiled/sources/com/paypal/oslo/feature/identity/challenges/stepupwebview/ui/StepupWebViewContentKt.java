package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui;

@kotlin.Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\u001ab\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\u001c\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¨\u0006\u0019²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\nX\u008a\u008e\u0002²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u008a\u008e\u0002"}, d2 = {"StepupWebViewContent", "", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "tokenStorage", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEvent;", "isInitialized", "", "webViewRenderer", "Lkotlin/Function2;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "handleCameraPermissionRequest", "permissionHelper", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/RuntimePermissionHelper;", "request", "Landroid/webkit/PermissionRequest;", "createCameraPermissionChromeDelegate", "Lcom/paypal/oslo/core/webview/ui/client/SecureWebChromeClientDelegate;", "onCameraPermissionRequested", "identity_prodRelease", "jsBridge", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewJavaScriptBridge;", "tokenResolved", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.ACCESS_TOKEN, ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepupWebViewContentKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StepupWebViewContent(final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge, final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent, kotlin.Unit> function1, boolean z, kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function42;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        java.lang.String str;
        int i5;
        com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$StepupWebViewContent$1$1 stepupWebViewContentKt$StepupWebViewContent$1$1;
        boolean z3;
        kotlin.coroutines.Continuation continuation;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewChallenge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(408444707);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(webViewChallenge) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(identityTokenStorage) : startRestartGroup.changedInstance(identityTokenStorage) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function42 = function4;
                i3 |= startRestartGroup.changedInstance(function42) ? 16384 : 8192;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    if (i7 != 0) {
                        z2 = false;
                    }
                    if (i4 != 0) {
                        function42 = com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.ComposableSingletons$StepupWebViewContentKt.INSTANCE.m15105getLambda$1728923277$identity_prodRelease();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(408444707, i3, -1, "com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContent (StepupWebViewContent.kt:55)");
                    }
                    int i8 = i3 >> 6;
                    final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, i8 & 14);
                    final com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.RuntimePermissionHelper rememberRuntimePermissionHelper = com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.RuntimePermissionHelperKt.rememberRuntimePermissionHelper(startRestartGroup, 0);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = createCameraPermissionChromeDelegate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt.$r8$lambda$QXXi3oFI29o0EzgMu74cNbDIOL4(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.RuntimePermissionHelper.this, (android.webkit.PermissionRequest) obj);
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate = (com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate) rememberedValue;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                    int i9 = i3 & 14;
                    boolean z4 = i9 == 4;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (z4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt.createStepupWebViewDelegateWithEventHandlers(webViewChallenge, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt.$r8$lambda$6AbZDnl2vWDaA6uqCOsCzC0Eqi8(androidx.compose.runtime.State.this, (com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent) obj);
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate = (com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate) rememberedValue3;
                    boolean changed = startRestartGroup.changed(secureWebViewClientDelegate);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt.wrapDelegateWithPageFinished(secureWebViewClientDelegate, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt.$r8$lambda$UgLIe6tVUWJoyFhKtjwpbZKgbII(androidx.compose.runtime.MutableState.this);
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate2 = (com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate) rememberedValue4;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        str = "";
                        i5 = 2;
                        rememberedValue5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    } else {
                        str = "";
                        i5 = 2;
                    }
                    androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue5;
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i5, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue6;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    boolean z5 = (i3 & 112) == 32 || ((i3 & 64) != 0 && startRestartGroup.changedInstance(identityTokenStorage));
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (z5 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        stepupWebViewContentKt$StepupWebViewContent$1$1 = new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$StepupWebViewContent$1$1(identityTokenStorage, mutableState3, mutableState2, null);
                        startRestartGroup.updateRememberedValue(stepupWebViewContentKt$StepupWebViewContent$1$1);
                    } else {
                        stepupWebViewContentKt$StepupWebViewContent$1$1 = rememberedValue7;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) stepupWebViewContentKt$StepupWebViewContent$1$1, startRestartGroup, 6);
                    if (!((java.lang.Boolean) mutableState2.getValue()).booleanValue()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final boolean z6 = z2;
                            final kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function43 = function42;
                            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt.$r8$lambda$g0dyY1uS5gw85j79NmZbKofXGTc(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge.this, identityTokenStorage, function1, z6, function43, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            };
                            endRestartGroup.updateScope(function2);
                            return;
                        }
                        return;
                    }
                    androidx.compose.runtime.MutableState mutableState4 = mutableState3;
                    java.lang.String str2 = (java.lang.String) mutableState4.getValue();
                    boolean z7 = i9 == 4;
                    boolean changed2 = startRestartGroup.changed(secureWebViewClientDelegate2);
                    boolean changed3 = startRestartGroup.changed(str2);
                    java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if ((changed3 || (z7 | changed2)) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[6];
                        pairArr[0] = kotlin.TuplesKt.to("challengeUri", webViewChallenge.getWebChallengeUrl());
                        java.lang.String flowName = webViewChallenge.getFlowName();
                        if (flowName == null) {
                            flowName = str;
                        }
                        pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, flowName);
                        pairArr[2] = kotlin.TuplesKt.to("accessTokenPresent", java.lang.String.valueOf(((java.lang.String) mutableState4.getValue()) != null));
                        pairArr[3] = kotlin.TuplesKt.to("bypassUrlValidation", "true");
                        pairArr[4] = kotlin.TuplesKt.to("isAuthRequired", "false");
                        pairArr[5] = kotlin.TuplesKt.to("javaScriptEnabled", "true");
                        com.paypal.android.logger.Logger.d$default(logger, "StepupWebView loading URL", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        z3 = false;
                        continuation = null;
                        i6 = i3;
                        rememberedValue8 = com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewKt.createStepupWebViewConfiguration(webViewChallenge.getWebChallengeUrl(), webViewChallenge.getFlowName(), secureWebViewClientDelegate2, webViewChallenge, (java.lang.String) mutableState4.getValue(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt.$r8$lambda$ZGDLyYcdap6XRXNEEvzxB9VSiQc(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge) obj);
                            }
                        }, secureWebChromeClientDelegate);
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    } else {
                        i6 = i3;
                        continuation = null;
                        z3 = false;
                    }
                    com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue8;
                    java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit2;
                                unit2 = kotlin.Unit.INSTANCE;
                                return unit2;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    function42.invoke(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue9, startRestartGroup, java.lang.Integer.valueOf(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | 48 | (i8 & 896)));
                    if (!z2) {
                        startRestartGroup.startReplaceGroup(337557249);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        boolean z8 = (i6 & 896) != 256 ? z3 : true;
                        com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$StepupWebViewContent$4$1 rememberedValue10 = startRestartGroup.rememberedValue();
                        if (z8 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue10 = new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$StepupWebViewContent$4$1(function1, continuation);
                            startRestartGroup.updateRememberedValue(rememberedValue10);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue10, startRestartGroup, 6);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(337647583);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                final boolean z9 = z2;
                final kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function44 = function42;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt.$r8$lambda$Z8gPglP0kFRMgbaU09HhJwWLLvQ(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge.this, identityTokenStorage, function1, z9, function44, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function2);
                    return;
                }
                return;
            }
            function42 = function4;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            final boolean z92 = z2;
            final kotlin.jvm.functions.Function4 function442 = function42;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function42 = function4;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        final boolean z922 = z2;
        final kotlin.jvm.functions.Function4 function4422 = function42;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void handleCameraPermissionRequest(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.RuntimePermissionHelper runtimePermissionHelper, final android.webkit.PermissionRequest permissionRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runtimePermissionHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRequest, "");
        runtimePermissionHelper.requestPermission("android.permission.CAMERA", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt.$r8$lambda$h6vOqJmk7M3At2bUcCAJr24mato(permissionRequest, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate createCameraPermissionChromeDelegate(final kotlin.jvm.functions.Function1<? super android.webkit.PermissionRequest, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate() { // from class: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$createCameraPermissionChromeDelegate$1
            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
                super.onGeolocationPermissionsShowPrompt(str, callback);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onJsAlert(java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
                return super.onJsAlert(str, str2, jsResult);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onJsConfirm(java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
                return super.onJsConfirm(str, str2, jsResult);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onJsPrompt(java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
                return super.onJsPrompt(str, str2, str3, jsPromptResult);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ void onProgressChanged(int i) {
                super.onProgressChanged(i);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ void onReceivedIcon(android.graphics.Bitmap bitmap) {
                super.onReceivedIcon(bitmap);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ void onReceivedTitle(java.lang.String str) {
                super.onReceivedTitle(str);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onShowFileChooser(android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
                return super.onShowFileChooser(valueCallback, fileChooserParams);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final void onPermissionRequest(android.webkit.PermissionRequest request) {
                if (request == null) {
                    super.onPermissionRequest(request);
                    return;
                }
                java.lang.String[] resources = request.getResources();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "");
                if (kotlin.collections.ArraysKt.contains(resources, "android.webkit.resource.VIDEO_CAPTURE")) {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                    java.lang.String[] resources2 = request.getResources();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources2, "");
                    com.paypal.android.logger.Logger.d$default(logger, "StepupWebView camera permission requested", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, kotlin.collections.ArraysKt.joinToString$default(resources2, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 63, (java.lang.Object) null))), null, 4, null);
                    function1.invoke(request);
                    return;
                }
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.identity.LoggerKt.log;
                java.lang.String[] resources3 = request.getResources();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources3, "");
                com.paypal.android.logger.Logger.d$default(logger2, "StepupWebView denying unsupported permission", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, kotlin.collections.ArraysKt.joinToString$default(resources3, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 63, (java.lang.Object) null))), null, 4, null);
                super.onPermissionRequest(request);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6AbZDnl2vWDaA6uqCOsCzC0Eqi8(androidx.compose.runtime.State state, com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent stepupWebViewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupWebViewEvent, "");
        ((kotlin.jvm.functions.Function1) state.getValue()).invoke(stepupWebViewEvent);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QXXi3oFI29o0EzgMu74cNbDIOL4(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.RuntimePermissionHelper runtimePermissionHelper, android.webkit.PermissionRequest permissionRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRequest, "");
        handleCameraPermissionRequest(runtimePermissionHelper, permissionRequest);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UgLIe6tVUWJoyFhKtjwpbZKgbII(androidx.compose.runtime.MutableState mutableState) {
        com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge secureWebViewJavaScriptBridge = (com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge) mutableState.getValue();
        if (secureWebViewJavaScriptBridge != null) {
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge.evaluateJavaScript$default(secureWebViewJavaScriptBridge, com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.Scripts.REMOVE_BLANK_TARGETS, null, 2, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z8gPglP0kFRMgbaU09HhJwWLLvQ(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, kotlin.jvm.functions.Function1 function1, boolean z, kotlin.jvm.functions.Function4 function4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        StepupWebViewContent(webViewChallenge, identityTokenStorage, function1, z, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZGDLyYcdap6XRXNEEvzxB9VSiQc(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge secureWebViewJavaScriptBridge) {
        mutableState.setValue(secureWebViewJavaScriptBridge);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g0dyY1uS5gw85j79NmZbKofXGTc(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, kotlin.jvm.functions.Function1 function1, boolean z, kotlin.jvm.functions.Function4 function4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        StepupWebViewContent(webViewChallenge, identityTokenStorage, function1, z, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h6vOqJmk7M3At2bUcCAJr24mato(android.webkit.PermissionRequest permissionRequest, boolean z) {
        if (z) {
            permissionRequest.grant(new java.lang.String[]{"android.webkit.resource.VIDEO_CAPTURE"});
        } else {
            permissionRequest.deny();
        }
        return kotlin.Unit.INSTANCE;
    }
}
