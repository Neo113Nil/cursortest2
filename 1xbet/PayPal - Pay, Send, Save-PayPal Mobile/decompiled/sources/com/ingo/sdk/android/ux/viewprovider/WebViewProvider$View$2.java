package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class WebViewProvider$View$2 implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.WebViewProvider getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.view.MutableLiveData mutableLiveData;
        int i;
        androidx.compose.runtime.MutableState mutableState;
        java.lang.String str;
        java.lang.String str2;
        androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues2, "");
        if ((intValue & 14) == 0) {
            intValue |= composer2.changed(paddingValues2) ? 4 : 2;
        }
        if ((intValue & 91) != 18 || !composer2.getSkipping()) {
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, paddingValues2), 0.0f, 1, null);
            com.ingo.sdk.android.ux.viewprovider.WebViewProvider webViewProvider = this.getHighSpeedVideoFpsRanges;
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            mutableLiveData = webViewProvider.getHighSpeedVideoFpsRanges;
            final androidx.compose.runtime.State observeAsState = androidx.compose.runtime.livedata.LiveDataAdapterKt.observeAsState(mutableLiveData, "", composer2, 56);
            composer2.startReplaceGroup(1608028583);
            java.lang.Object value = observeAsState.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            if (kotlin.text.StringsKt.isBlank((java.lang.CharSequence) value)) {
                i = 1849434622;
            } else {
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Html Content Not Blank", null, 2, null);
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                composer2.startReplaceGroup(1849434622);
                java.lang.Object rememberedValue = composer2.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.viewprovider.WebViewProvider$View$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.ingo.sdk.android.ux.viewprovider.WebViewProvider$View$2.getHighSpeedVideoFpsRangesFor((android.content.Context) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                boolean changed = composer2.changed(observeAsState);
                java.lang.Object rememberedValue2 = composer2.rememberedValue();
                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.viewprovider.WebViewProvider$View$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.ingo.sdk.android.ux.viewprovider.WebViewProvider$View$2.getHighSpeedVideoFpsRanges(androidx.compose.runtime.State.this, (android.webkit.WebView) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                composer2.endReplaceGroup();
                i = 1849434622;
                androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function1, fillMaxWidth$default, (kotlin.jvm.functions.Function1) rememberedValue2, composer2, 6, 0);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer2, 54);
            int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxHeight$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                m5299constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            mutableState = webViewProvider.Camera2StreamConfigurationMap;
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance2, ((java.lang.Boolean) mutableState.getValue()).booleanValue(), (androidx.compose.ui.Modifier) null, (androidx.compose.animation.EnterTransition) null, (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, com.ingo.sdk.android.ux.viewprovider.ComposableSingletons$WebViewProviderKt.INSTANCE.m10725getLambda$1542667457$androidSdkUx_release(), composer2, 1572870, 30);
            composer2.endNode();
            composer2.startReplaceGroup(1296933794);
            if (webViewProvider.getFailure().getValue() != null) {
                com.ingo.sdk.kotlin.common.core.exception.Failure value2 = webViewProvider.getFailure().getValue();
                if (value2 == null || (str = value2.getCamera2StreamConfigurationMap()) == null) {
                    str = "Error";
                }
                java.lang.String str3 = str;
                com.ingo.sdk.kotlin.common.core.exception.Failure value3 = webViewProvider.getFailure().getValue();
                if (value3 == null || (str2 = value3.getGetHighSpeedVideoFpsRangesFor()) == null) {
                    str2 = "There was an unknown error.";
                }
                java.lang.String str4 = str2;
                kotlin.jvm.functions.Function0<kotlin.Unit> value4 = webViewProvider.getRetryAction().getValue();
                kotlin.jvm.functions.Function0<kotlin.Unit> value5 = webViewProvider.getFailureAction().getValue();
                composer2.startReplaceGroup(1296948496);
                if (value5 == null) {
                    composer2.startReplaceGroup(i);
                    java.lang.Object rememberedValue3 = composer2.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.WebViewProvider$View$2$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.ingo.sdk.android.ux.viewprovider.WebViewProvider$View$2.getHighSpeedVideoSizes();
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    value5 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoAlertDialog(null, str3, str4, com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, value5, "Retry", value4, composer2, 199680, 1);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
        } else {
            composer2.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.State state, android.webkit.WebView webView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        webView.loadDataWithBaseURL(null, (java.lang.String) state.getValue(), "text/html", "UTF-8", null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ android.webkit.WebView getHighSpeedVideoFpsRangesFor(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new android.webkit.WebView(context);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes() {
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Dismiss Action Clicked But Empty", null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    WebViewProvider$View$2(com.ingo.sdk.android.ux.viewprovider.WebViewProvider webViewProvider) {
        this.getHighSpeedVideoFpsRanges = webViewProvider;
    }
}
