package com.paypal.oslo.feature.mosaic.ui.webview;

@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001af\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u00010\u000e2&\u0010\u0013\u001a\"\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0011\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00010\u000eH\u0000\u001a\"\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a0\u0019¨\u0006\u001b²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001aX\u008a\u008e\u0002"}, d2 = {"MosaicWebViewContentImpl", "", "config", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "createComplianceChromeClientDelegate", "Lcom/paypal/oslo/core/webview/ui/client/SecureWebChromeClientDelegate;", "context", "Landroid/content/Context;", "onPermissionRequest", "Lkotlin/Function1;", "Landroid/webkit/PermissionRequest;", "onLaunchPermissions", "", "", "onShowFilePicker", "Landroid/webkit/ValueCallback;", "Landroid/net/Uri;", "grantPermissionToWebView", "request", "grants", "", "", "mosaic_prodRelease", "pendingPermissionRequest", "showFilePicker"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicWebViewContentImplKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MosaicWebViewContentImpl(final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.MutableState mutableState;
        com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager fileUploadManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1263859343);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(secureWebViewConfiguration) : startRestartGroup.changedInstance(secureWebViewConfiguration) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(1263859343, i4, -1, "com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentImpl (MosaicWebViewContentImpl.kt:50)");
                }
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue;
                final com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelper rememberRuntimePermissionHelper = com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelperKt.rememberRuntimePermissionHelper(startRestartGroup, 0);
                final com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager rememberFileUploadManager = com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManagerKt.rememberFileUploadManager(startRestartGroup, 0);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue2;
                boolean changed = startRestartGroup.changed(context);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = createComplianceChromeClientDelegate(context, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentImplKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentImplKt.$r8$lambda$SJMELmArTs2Faor1k9NDz5j4zkI(androidx.compose.runtime.MutableState.this, (android.webkit.PermissionRequest) obj);
                        }
                    }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentImplKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentImplKt.m15814$r8$lambda$Ejt_hFitoHqfjlu3QqHbK4NyPQ(com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelper.this, mutableState2, (java.lang.String[]) obj);
                        }
                    }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentImplKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentImplKt.m15815$r8$lambda$zjpDJfbVzEnVuVyvt06stT4Ho(com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager.this, mutableState3, (android.webkit.ValueCallback) obj);
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate = (com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate) rememberedValue3;
                boolean z = (i4 & 14) == 4 || ((i4 & 8) != 0 && startRestartGroup.changed(secureWebViewConfiguration));
                boolean changed2 = startRestartGroup.changed(secureWebChromeClientDelegate);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((z || changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration clients = secureWebViewConfiguration.getClients();
                    mutableState = mutableState3;
                    fileUploadManager = rememberFileUploadManager;
                    rememberedValue4 = com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.copy$default(secureWebViewConfiguration, null, null, null, null, null, null, clients != null ? com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration.copy$default(clients, null, secureWebChromeClientDelegate, 1, null) : null, 63, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    mutableState = mutableState3;
                    fileUploadManager = rememberFileUploadManager;
                }
                com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration2 = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue4;
                final androidx.compose.runtime.MutableState mutableState4 = mutableState;
                boolean booleanValue = ((java.lang.Boolean) mutableState4.getValue()).booleanValue();
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentImplKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentImplKt.$r8$lambda$Y53sIkRrZLGLqR7hSJQAsdMXU3c(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.feature.mosaic.ui.webview.MosaicFilePickerDialogKt.MosaicFilePickerDialog(booleanValue, fileUploadManager, (kotlin.jvm.functions.Function0) rememberedValue5, startRestartGroup, 384);
                com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(secureWebViewConfiguration2, function0, modifier4, null, startRestartGroup, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | (i4 & 112) | (i4 & 896), 8);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentImplKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentImplKt.$r8$lambda$bVSZE35K8RUJMl6Oo5BSk8OkK84(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.this, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static final com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate createComplianceChromeClientDelegate(final android.content.Context context, final kotlin.jvm.functions.Function1<? super android.webkit.PermissionRequest, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.String[], kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super android.webkit.ValueCallback<android.net.Uri[]>, kotlin.Unit> function13) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        return new com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentImplKt$createComplianceChromeClientDelegate$1
            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
                super.onGeolocationPermissionsShowPrompt(str, callback);
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
            public final boolean onJsAlert(java.lang.String url, java.lang.String message, android.webkit.JsResult result) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Mosaic WebView on JsAlert", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("js_alert", message)), null, 4, null);
                if (result == null) {
                    return true;
                }
                result.confirm();
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final void onPermissionRequest(android.webkit.PermissionRequest request) {
                java.lang.String[] resources;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Mosaic WebView permission request", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("permission_request", (request == null || (resources = request.getResources()) == null) ? null : kotlin.collections.ArraysKt.joinToString$default(resources, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 63, (java.lang.Object) null))), null, 4, null);
                if (request == null) {
                    super.onPermissionRequest(request);
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String[] resources2 = request.getResources();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources2, "");
                boolean z = false;
                for (java.lang.String str : resources2) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                        if (com.paypal.oslo.feature.mosaic.ui.webview.Utils.INSTANCE.isCameraAvailable$mosaic_prodRelease(context)) {
                            arrayList.add("android.permission.CAMERA");
                        } else {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Mosaic WebView invalid permission requested", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("permission_resource", str)), null, 4, null);
                        }
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, "android.webkit.resource.AUDIO_CAPTURE")) {
                        if (com.paypal.oslo.feature.mosaic.ui.webview.Utils.INSTANCE.isMicroPhoneAvailable$mosaic_prodRelease(context)) {
                            arrayList.add("android.permission.RECORD_AUDIO");
                        } else {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Mosaic WebView, Microphone not available", null, null, 6, null);
                        }
                    } else {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Mosaic WebView, Invalid permission requested: ".concat(java.lang.String.valueOf(str)), null, null, 6, null);
                        z = true;
                    }
                }
                if (z || arrayList.isEmpty()) {
                    super.onPermissionRequest(request);
                } else {
                    function1.invoke(request);
                    function12.invoke(arrayList.toArray(new java.lang.String[0]));
                }
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final boolean onShowFileChooser(android.webkit.ValueCallback<android.net.Uri[]> filePathCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
                function13.invoke(filePathCallback);
                return true;
            }
        };
    }

    public static final void grantPermissionToWebView(android.webkit.PermissionRequest permissionRequest, java.util.Map<java.lang.String, java.lang.Boolean> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.Set<java.lang.String> keySet = map.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : keySet) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(map.get((java.lang.String) obj), java.lang.Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        permissionRequest.grant((java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
    }

    /* renamed from: $r8$lambda$Ejt_hFitoHqfjlu3QqHbK-4NyPQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15814$r8$lambda$Ejt_hFitoHqfjlu3QqHbK4NyPQ(com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelper runtimePermissionHelper, final androidx.compose.runtime.MutableState mutableState, java.lang.String[] strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        runtimePermissionHelper.requestMultiplePermissions(strArr, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentImplKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentImplKt.$r8$lambda$Z_rSi2YUoX0lYzVpcm2IGGT1FYw(androidx.compose.runtime.MutableState.this, (java.util.Map) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SJMELmArTs2Faor1k9NDz5j4zkI(androidx.compose.runtime.MutableState mutableState, android.webkit.PermissionRequest permissionRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRequest, "");
        mutableState.setValue(permissionRequest);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y53sIkRrZLGLqR7hSJQAsdMXU3c(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$Z_rSi2YUoX0lYzVpcm2IGGT1FYw(androidx.compose.runtime.MutableState mutableState, java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        android.webkit.PermissionRequest permissionRequest = (android.webkit.PermissionRequest) mutableState.getValue();
        if (permissionRequest != null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                boolean booleanValue = ((java.lang.Boolean) entry.getValue()).booleanValue();
                if (kotlin.jvm.internal.Intrinsics.areEqual(str, "android.permission.CAMERA")) {
                    linkedHashMap.put("android.webkit.resource.VIDEO_CAPTURE", java.lang.Boolean.valueOf(booleanValue));
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, "android.permission.RECORD_AUDIO")) {
                    linkedHashMap.put("android.webkit.resource.AUDIO_CAPTURE", java.lang.Boolean.valueOf(booleanValue));
                }
            }
            grantPermissionToWebView(permissionRequest, linkedHashMap);
            mutableState.setValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bVSZE35K8RUJMl6Oo5BSk8OkK84(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MosaicWebViewContentImpl(secureWebViewConfiguration, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$z-jpDJfbVzEnVuVyvt-06stT4Ho, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15815$r8$lambda$zjpDJfbVzEnVuVyvt06stT4Ho(com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager fileUploadManager, androidx.compose.runtime.MutableState mutableState, android.webkit.ValueCallback valueCallback) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        fileUploadManager.setFilePathCallback(valueCallback);
        return kotlin.Unit.INSTANCE;
    }
}
