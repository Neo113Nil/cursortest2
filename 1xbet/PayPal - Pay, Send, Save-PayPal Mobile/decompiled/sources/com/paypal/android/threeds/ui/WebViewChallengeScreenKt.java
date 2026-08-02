package com.paypal.android.threeds.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"WebViewChallengeScreen", "", "challengeViewModel", "Lcom/paypal/android/threeds/viewmodel/ChallengeViewModel;", "isJavaScriptEnabled", "", "navigateUp", "Lkotlin/Function0;", "(Lcom/paypal/android/threeds/viewmodel/ChallengeViewModel;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "three-ds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WebViewChallengeScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WebViewChallengeScreen(final com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-723445523);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(challengeViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                z3 = z2;
            } else {
                final boolean z4 = i4 != 0 ? false : z2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-723445523, i3, -1, "com.paypal.android.threeds.ui.WebViewChallengeScreen (WebViewChallengeScreen.kt:42)");
                }
                z3 = z4;
                androidx.compose.material.ScaffoldKt.m2719Scaffold27mzLpw(null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-452243150, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.WebViewChallengeScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.android.threeds.ui.WebViewChallengeScreenKt.$r8$lambda$vjImosZyxaFqXW9n7CVWeQJBP7o(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1900274005, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.android.threeds.ui.WebViewChallengeScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.android.threeds.ui.WebViewChallengeScreenKt.m11001$r8$lambda$5iBjnTSqeEnmeTK_gM7k2Y1GVg(com.paypal.android.threeds.viewmodel.ChallengeViewModel.this, z4, (androidx.compose.foundation.layout.PaddingValues) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 384, 12582912, 131067);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final boolean z5 = z3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.WebViewChallengeScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.android.threeds.ui.WebViewChallengeScreenKt.$r8$lambda$g_JfG00S1Bte3FS7tfBnm9XnoCg(com.paypal.android.threeds.viewmodel.ChallengeViewModel.this, z5, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$4VDkRWtxbC-rPryW7gjsLl1O_Ms, reason: not valid java name */
    public static /* synthetic */ android.webkit.WebView m11000$r8$lambda$4VDkRWtxbCrPryW7gjsLl1O_Ms(final com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, final com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, boolean z, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.webkit.WebView webView = new android.webkit.WebView(context);
        webView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        webView.setWebViewClient(new android.webkit.WebViewClient() { // from class: com.paypal.android.threeds.ui.WebViewChallengeScreenKt$WebViewChallengeScreen$2$1$1$1$1$1$1
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
                com.paypal.android.threeds.data.model.ChallengeRequest challengeRequest;
                android.net.Uri url = request != null ? request.getUrl() : null;
                if (!kotlin.text.StringsKt.startsWith$default(java.lang.String.valueOf(url), com.paypal.android.threeds.utils.ConstantUtil.CHALLENGE_WEBVIEW_URL, false, 2, (java.lang.Object) null)) {
                    return true;
                }
                challengeRequest = com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE.getChallengeRequest(com.paypal.android.threeds.data.model.ChallengeResponse.this, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? null : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? url != null ? url.getQuery() : null : null);
                challengeViewModel.initChallenge(challengeRequest);
                return true;
            }
        });
        android.webkit.WebSettings settings = webView.getSettings();
        settings.setCacheMode(2);
        settings.setUserAgentString(com.paypal.android.threeds.utils.NetworkUtil.WEB_VIEW_USER_AGENT);
        settings.setJavaScriptEnabled(z);
        settings.setAllowContentAccess(false);
        java.lang.String acsHtml = challengeResponse.getAcsHtml();
        if (acsHtml != null && acsHtml.length() != 0) {
            webView.loadDataWithBaseURL(null, com.paypal.android.threeds.utils.CryptoUtils.INSTANCE.decodeBase64Url(challengeResponse.getAcsHtml()), "text/html", "UTF-8", null);
        }
        return webView;
    }

    /* renamed from: $r8$lambda$5iBjnTSqeEnmeTK_g-M7k2Y1GVg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11001$r8$lambda$5iBjnTSqeEnmeTK_gM7k2Y1GVg(final com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, final boolean z, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "");
        if ((i & 6) == 0) {
            i |= composer.changed(paddingValues) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1900274005, i, -1, "com.paypal.android.threeds.ui.WebViewChallengeScreen.<anonymous> (WebViewChallengeScreen.kt:46)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(hashCode))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(hashCode));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (challengeViewModel.getProgressDialogState()) {
                composer.startReplaceGroup(67730931);
                com.paypal.android.threeds.ui.ThreeDsChallengeProgressViewKt.ThreeDsChallengeProgressView(composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(67790513);
                composer.endReplaceGroup();
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, paddingValues), 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(hashCode2))) {
                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(hashCode2));
                m5299constructorimpl2.apply(java.lang.Integer.valueOf(hashCode2), setCompositeKeyHash2);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.android.threeds.data.model.ChallengeResponse value = challengeViewModel.getChallengeResponse().getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value);
            final com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse = value;
            boolean changedInstance = composer.changedInstance(challengeResponse);
            boolean changedInstance2 = composer.changedInstance(challengeViewModel);
            boolean changed = composer.changed(z);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.android.threeds.ui.WebViewChallengeScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.android.threeds.ui.WebViewChallengeScreenKt.m11000$r8$lambda$4VDkRWtxbCrPryW7gjsLl1O_Ms(com.paypal.android.threeds.data.model.ChallengeResponse.this, challengeViewModel, z, (android.content.Context) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView((kotlin.jvm.functions.Function1) rememberedValue, null, null, composer, 0, 6);
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g_JfG00S1Bte3FS7tfBnm9XnoCg(com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, boolean z, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WebViewChallengeScreen(challengeViewModel, z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vjImosZyxaFqXW9n7CVWeQJBP7o(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-452243150, i, -1, "com.paypal.android.threeds.ui.WebViewChallengeScreen.<anonymous> (WebViewChallengeScreen.kt:44)");
            }
            com.paypal.android.threeds.ui.ToolbarViewKt.ToolbarView(function0, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
