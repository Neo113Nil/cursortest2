package com.paypal.oslo.app.emw.ui.compose;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001aE\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u000e\u001a3\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\u0014\u001aA\u0010\u0015\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\r2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u0019\u001a+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\u001d¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002²\u0006\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bX\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u0004\u0018\u00010\u0017X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020%X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u008e\u0002"}, d2 = {"EmwScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/app/emw/ui/viewmodel/EmwViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/app/emw/ui/viewmodel/EmwViewModel;Landroidx/compose/runtime/Composer;II)V", "EmwWebViewScreen", "authenticatedUrl", "", "onCloseClick", "Lkotlin/Function0;", "onBackActionChange", "Lkotlin/Function1;", "(Ljava/lang/String;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "EmwErrorScreenWithToolbar", "title", "message", "error", "onBackClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "EmwWebViewContent", "onWebViewReady", "Landroid/webkit/WebView;", "onTitleChange", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberBackHandler", "webView", "onExitWebView", "(Landroid/webkit/WebView;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "app_prodRelease", "uiState", "Lcom/paypal/oslo/app/emw/domain/model/EmwUiState;", "backAction", "webViewRef", "displayTitle", "isLoading", "", "progress", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmwScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if ((r21 & 2) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmwScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel emwViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel emwViewModel2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel emwViewModel3;
        boolean z;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1236230066);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                emwViewModel2 = emwViewModel;
                if (startRestartGroup.changedInstance(emwViewModel2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                emwViewModel2 = emwViewModel;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            emwViewModel2 = emwViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    emwViewModel2 = (com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i3 &= -113;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1236230066, i3, -1, "com.paypal.oslo.app.emw.ui.compose.EmwScreen (EmwScreen.kt:56)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(emwViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(emwViewModel2);
                int i5 = i3 & 14;
                boolean z2 = i5 == 4;
                com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$EmwScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$EmwScreen$1$1(emwViewModel2, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                boolean z3 = i5 == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$fi5rx1QGdYXWsCxrncfhklpFSyE(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    }, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                boolean changed = startRestartGroup.changed(mutableState);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.m11063$r8$lambda$Gvm9hDGIqWXDAAfcCM8xbZWYlI(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 1);
                com.paypal.oslo.app.emw.domain.model.EmwUiState emwUiState = (com.paypal.oslo.app.emw.domain.model.EmwUiState) collectAsStateWithLifecycle.getValue();
                if (kotlin.jvm.internal.Intrinsics.areEqual(emwUiState, com.paypal.oslo.app.emw.domain.model.EmwUiState.Idle.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(emwUiState, com.paypal.oslo.app.emw.domain.model.EmwUiState.Loading.INSTANCE)) {
                    emwViewModel3 = emwViewModel2;
                    startRestartGroup.startReplaceGroup(684465014);
                    androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                } else if (emwUiState instanceof com.paypal.oslo.app.emw.domain.model.EmwUiState.Ready) {
                    startRestartGroup.startReplaceGroup(684818910);
                    java.lang.String authenticatedUrl = ((com.paypal.oslo.app.emw.domain.model.EmwUiState.Ready) emwUiState).getAuthenticatedUrl();
                    boolean changedInstance2 = startRestartGroup.changedInstance(emwViewModel2);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$RG5FV_IsUH5g4pWgOUb7zZDMqV4(com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
                    boolean changed2 = startRestartGroup.changed(mutableState);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.m11062$r8$lambda$GMThpLVm5Wou0_YRVEGvf0XLVU(androidx.compose.runtime.MutableState.this, (kotlin.jvm.functions.Function0) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    emwViewModel3 = emwViewModel2;
                    EmwWebViewScreen(authenticatedUrl, appNavigator, function0, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, (i3 << 3) & 112);
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup = startRestartGroup;
                } else {
                    emwViewModel3 = emwViewModel2;
                    if (emwUiState instanceof com.paypal.oslo.app.emw.domain.model.EmwUiState.UrlValidationFailed) {
                        startRestartGroup.startReplaceGroup(685208952);
                        java.lang.String error = ((com.paypal.oslo.app.emw.domain.model.EmwUiState.UrlValidationFailed) emwUiState).getError();
                        z = i5 == 4;
                        java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if (z || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$zxeWdyvbKVvY5bB0yGw8oElM6_s(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        startRestartGroup = startRestartGroup;
                        EmwErrorScreenWithToolbar("URL Validation Failed", "Unable to validate the requested URL.", error, (kotlin.jvm.functions.Function0) rememberedValue6, startRestartGroup, 54);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup = startRestartGroup;
                        if (!(emwUiState instanceof com.paypal.oslo.app.emw.domain.model.EmwUiState.AuthenticationFailed)) {
                            startRestartGroup.startReplaceGroup(-532110949);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(685574969);
                        java.lang.String error2 = ((com.paypal.oslo.app.emw.domain.model.EmwUiState.AuthenticationFailed) emwUiState).getError();
                        z = i5 == 4;
                        java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                        if (z || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda19
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.m11065$r8$lambda$gPsWJ9BwNZIPifX0KMseUWNXoQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                        }
                        EmwErrorScreenWithToolbar("Authentication Failed", "Unable to authenticate your session.", error2, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 54);
                        startRestartGroup.endReplaceGroup();
                    }
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                emwViewModel2 = emwViewModel3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.m11066$r8$lambda$mQJZGqmSSan8vmeMmPFP92kiqI(com.paypal.oslo.core.navigation.AppNavigator.this, emwViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void EmwWebViewScreen(final java.lang.String str, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2003179844);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2003179844, i2, -1, "com.paypal.oslo.app.emw.ui.compose.EmwWebViewScreen (EmwScreen.kt:124)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("PayPal", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
            boolean z = (i2 & 112) == 32;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$mPXmrNPQahArxbLmQhUCJqTv32U(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            final kotlin.jvm.functions.Function0<kotlin.Unit> rememberBackHandler = rememberBackHandler((android.webkit.WebView) mutableState.getValue(), function02, startRestartGroup, 0);
            boolean z2 = (i2 & 7168) == 2048;
            boolean changed = startRestartGroup.changed(rememberBackHandler);
            boolean changed2 = startRestartGroup.changed(function02);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((z2 | changed | changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$j1UUOcRzCIaahL4KC_yc1ifECJQ(kotlin.jvm.functions.Function1.this, rememberBackHandler, function02, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(rememberBackHandler, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue4, startRestartGroup, 0);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            java.lang.String str2 = (java.lang.String) mutableState2.getValue();
            boolean changed3 = startRestartGroup.changed(rememberBackHandler);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.m11064$r8$lambda$_JnyLkoNnSA9uNMPTzvPeKeg7U(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            com.paypal.oslo.app.emw.ui.compose.EmwToolbarKt.EmwToolbar(str2, (kotlin.jvm.functions.Function0) rememberedValue5, function0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, (i2 & 896) | 3072, 0);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$kKJxyCIe_WVvqaDy8iJKiVxEW70(androidx.compose.runtime.MutableState.this, (android.webkit.WebView) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.m11067$r8$lambda$xe1Jk4k6qigxeZbqQmY7cqg_OI(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            composer2 = startRestartGroup;
            EmwWebViewContent(str, function12, (kotlin.jvm.functions.Function1) rememberedValue7, startRestartGroup, (i2 & 14) | 432, 0);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$SqyBjIsU3ejRwM5O_IfLGiHwJfk(str, appNavigator, function0, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void EmwErrorScreenWithToolbar(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(89679041);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(89679041, i3, -1, "com.paypal.oslo.app.emw.ui.compose.EmwErrorScreenWithToolbar (EmwScreen.kt:167)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.app.emw.ui.compose.EmwToolbarKt.EmwToolbar("PayPal", function0, function0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, ((i3 >> 6) & 112) | 3078 | ((i3 >> 3) & 896), 0);
            com.paypal.oslo.app.emw.ui.compose.EmwErrorScreenKt.EmwErrorScreenContent(str, str2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Details", str3)), function0, androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, i3 & 7294, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$O8mI3mVreTYqN41BANdzpry1W3Y(str, str2, str3, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmwWebViewContent(final java.lang.String str, final kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function15;
        java.lang.Object obj;
        int i4;
        androidx.compose.runtime.Composer composer3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1266252560);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            function13 = function12;
            i3 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                function14 = function13;
            } else {
                if (i5 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function15 = (kotlin.jvm.functions.Function1) rememberedValue;
                } else {
                    function15 = function13;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1266252560, i3, -1, "com.paypal.oslo.app.emw.ui.compose.EmwWebViewContent (EmwScreen.kt:196)");
                }
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                final androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue3;
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                    startRestartGroup.startReplaceGroup(1698605440);
                    obj = null;
                    i4 = 1;
                    com.paypal.pds.components.ProgressBarKt.ProgressBar(100.0f, mutableIntState.getIntValue(), androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f)), com.paypal.pds.components.ProgressBarStyle.Info.INSTANCE, 0, 0, 0L, null, startRestartGroup, 3462, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                    startRestartGroup.endReplaceGroup();
                } else {
                    obj = null;
                    i4 = 1;
                    startRestartGroup.startReplaceGroup(1698869064);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, obj), 1.0f, false, 2, null);
                int i6 = (i3 & 112) == 32 ? i4 : 0;
                int i7 = (i3 & 896) == 256 ? i4 : 0;
                if ((i3 & 14) != 4) {
                    i4 = 0;
                }
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((i4 | i7 | i6) != 0 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function16 = function15;
                    composer3 = startRestartGroup;
                    kotlin.jvm.functions.Function1 function17 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$ez2gBarGscfiGL353YDn6dSSY3E(kotlin.jvm.functions.Function1.this, function16, str, mutableState, mutableIntState, (androidx.compose.foundation.lazy.LazyListScope) obj2);
                        }
                    };
                    composer3.updateRememberedValue(function17);
                    rememberedValue4 = function17;
                } else {
                    composer3 = startRestartGroup;
                }
                kotlin.jvm.functions.Function1 function18 = (kotlin.jvm.functions.Function1) rememberedValue4;
                composer2 = composer3;
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(weight$default, null, null, false, null, null, null, false, null, function18, composer2, 12582912, 382);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function14 = function15;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$TmBlIbb4hdzxAymZ3hv_uSIETfo(str, function1, function14, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        function13 = function12;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> rememberBackHandler(final android.webkit.WebView webView, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-886040521, i, -1, "com.paypal.oslo.app.emw.ui.compose.rememberBackHandler (EmwScreen.kt:307)");
        }
        boolean changed = composer.changed(webView);
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(function0)) || (i & 48) == 32;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$eR9j_wyWfxUkXuXkKZiWDsh4Z5o(webView, function0);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = (kotlin.jvm.functions.Function0) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return function02;
    }

    /* renamed from: $r8$lambda$7EAXBfA-uFsXMvI_wZ7N6hMiagM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11061$r8$lambda$7EAXBfAuFsXMvI_wZ7N6hMiagM(android.webkit.WebView webView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        webView.stopLoading();
        webView.loadUrl("about:blank");
        webView.onPause();
        webView.clearHistory();
        webView.clearFormData();
        webView.clearCache(true);
        android.view.ViewParent parent = webView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.removeAllViews();
        webView.destroy();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7ofUsnA7rfcjhlyVvXSGccp6n3g(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableIntState mutableIntState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        mutableIntState.setIntValue(100);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8_9R4i2pZIrtd6u3rJUzR_oYpkg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FKWAJSk2QwDjeeuP8fDVqDgRrPY(final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, final java.lang.String str, final androidx.compose.runtime.MutableState mutableState, final androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(lazyItemScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-131416155, i2, -1, "com.paypal.oslo.app.emw.ui.compose.EmwWebViewContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EmwScreen.kt:221)");
            }
            androidx.compose.ui.Modifier fillParentMaxSize$default = androidx.compose.foundation.lazy.LazyItemScope.fillParentMaxSize$default(lazyItemScope, androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changed = composer.changed(function1);
            boolean changed2 = composer.changed(function12);
            boolean changed3 = composer.changed(str);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$jgRppuyPihISECX2nXANTYbgk3A(kotlin.jvm.functions.Function1.this, function12, str, mutableState, mutableIntState, (android.content.Context) obj);
                    }
                };
                composer.updateRememberedValue(function13);
                rememberedValue = function13;
            }
            kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.m11061$r8$lambda$7EAXBfAuFsXMvI_wZ7N6hMiagM((android.webkit.WebView) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$_n6tNMW0eu5TDtVK89K9AfE3g28((android.webkit.WebView) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function14, fillParentMaxSize$default, null, function15, (kotlin.jvm.functions.Function1) rememberedValue3, composer, 27648, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GMThpLVm5Wou0_YRVEGvf0XLV-U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11062$r8$lambda$GMThpLVm5Wou0_YRVEGvf0XLVU(androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        mutableState.setValue(function0);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Gvm9hDGIqWXDAAfcCM-8xbZWYlI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11063$r8$lambda$Gvm9hDGIqWXDAAfcCM8xbZWYlI(androidx.compose.runtime.MutableState mutableState) {
        ((kotlin.jvm.functions.Function0) mutableState.getValue()).invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O1N_qmDle6_hqUnUQATVNpAYbYg(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableIntState mutableIntState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        mutableIntState.setIntValue(0);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O8mI3mVreTYqN41BANdzpry1W3Y(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        EmwErrorScreenWithToolbar(str, str2, str3, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OMeDbQo1HXpaao1heMotxH0PeHk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PYhFirUGAGh40ZyjTTUHqgv0N0g(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RG5FV_IsUH5g4pWgOUb7zZDMqV4(com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel emwViewModel) {
        emwViewModel.logout();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SqyBjIsU3ejRwM5O_IfLGiHwJfk(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        EmwWebViewScreen(str, appNavigator, function0, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TmBlIbb4hdzxAymZ3hv_uSIETfo(java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EmwWebViewContent(str, function1, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_JnyLkoNnSA9uNMPTz-vPeKeg7U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11064$r8$lambda$_JnyLkoNnSA9uNMPTzvPeKeg7U(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_d2KedQzvfLArFn1KlUyn6s15Is(androidx.compose.runtime.MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_n6tNMW0eu5TDtVK89K9AfE3g28(android.webkit.WebView webView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eR9j_wyWfxUkXuXkKZiWDsh4Z5o(android.webkit.WebView webView, kotlin.jvm.functions.Function0 function0) {
        if (webView != null && webView.canGoBack()) {
            webView.goBack();
        } else {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ez2gBarGscfiGL353YDn6dSSY3E(final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, final java.lang.String str, final androidx.compose.runtime.MutableState mutableState, final androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-131416155, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$FKWAJSk2QwDjeeuP8fDVqDgRrPY(kotlin.jvm.functions.Function1.this, function12, str, mutableState, mutableIntState, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fi5rx1QGdYXWsCxrncfhklpFSyE(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$pavrrIYhU2v5uJeeg9GqniTestE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gPsWJ9BwNZI-PifX0KMseUWNXoQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11065$r8$lambda$gPsWJ9BwNZIPifX0KMseUWNXoQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$PYhFirUGAGh40ZyjTTUHqgv0N0g((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$j1UUOcRzCIaahL4KC_yc1ifECJQ(final kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        function1.invoke(function0);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$EmwWebViewScreen$lambda$7$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                kotlin.jvm.functions.Function1.this.invoke(function02);
            }
        };
    }

    public static /* synthetic */ android.webkit.WebView $r8$lambda$jgRppuyPihISECX2nXANTYbgk3A(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, java.lang.String str, final androidx.compose.runtime.MutableState mutableState, final androidx.compose.runtime.MutableIntState mutableIntState, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.webkit.WebView webView = new android.webkit.WebView(context);
        function1.invoke(webView);
        webView.setWebViewClient(new com.paypal.oslo.app.emw.ui.compose.EmwWebViewClient(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$O1N_qmDle6_hqUnUQATVNpAYbYg(androidx.compose.runtime.MutableState.this, mutableIntState);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$7ofUsnA7rfcjhlyVvXSGccp6n3g(androidx.compose.runtime.MutableState.this, mutableIntState);
            }
        }));
        webView.setWebChromeClient(new com.paypal.oslo.app.emw.ui.compose.EmwWebChromeClient(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$_d2KedQzvfLArFn1KlUyn6s15Is(androidx.compose.runtime.MutableIntState.this, ((java.lang.Integer) obj).intValue());
            }
        }, function12));
        android.webkit.WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        settings.setMediaPlaybackRequiresUserGesture(true);
        settings.setDomStorageEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        java.lang.String userAgentString = settings.getUserAgentString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(userAgentString);
        sb.append(" PayPalEMW");
        settings.setUserAgentString(sb.toString());
        webView.loadUrl(str);
        return webView;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kKJxyCIe_WVvqaDy8iJKiVxEW70(androidx.compose.runtime.MutableState mutableState, android.webkit.WebView webView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        mutableState.setValue(webView);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mPXmrNPQahArxbLmQhUCJqTv32U(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$OMeDbQo1HXpaao1heMotxH0PeHk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mQJZ-GqmSSan8vmeMmPFP92kiqI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11066$r8$lambda$mQJZGqmSSan8vmeMmPFP92kiqI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel emwViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EmwScreen(appNavigator, emwViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pavrrIYhU2v5uJeeg9GqniTestE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xe1Jk4k6qigxeZbqQm-Y7cqg_OI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11067$r8$lambda$xe1Jk4k6qigxeZbqQmY7cqg_OI(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        java.lang.String str2 = str;
        if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
            mutableState.setValue(str);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zxeWdyvbKVvY5bB0yGw8oElM6_s(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwScreenKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.emw.ui.compose.EmwScreenKt.$r8$lambda$8_9R4i2pZIrtd6u3rJUzR_oYpkg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
