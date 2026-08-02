package com.paypal.oslo.feature.identity.connect.inboundconnect.ui;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u001a\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"InboundConnectScreen", "", "destination", "Lcom/paypal/oslo/feature/identity/api/navigation/InboundConnectDestination;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectViewModel;", "(Lcom/paypal/oslo/feature/identity/api/navigation/InboundConnectDestination;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectViewModel;Landroidx/compose/runtime/Composer;II)V", "LoadingScreen", "(Landroidx/compose/runtime/Composer;I)V", "mapWebViewEventToViewModelEvent", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectEvent;", "event", "Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent;", "findActivity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "openRedirectUrl", "url", "", "identity_prodRelease", "uiState", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InboundConnectScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InboundConnectScreen(final com.paypal.oslo.feature.identity.api.navigation.InboundConnectDestination inboundConnectDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel inboundConnectViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel inboundConnectViewModel2;
        final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel inboundConnectViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel inboundConnectViewModel4;
        boolean changedInstance;
        boolean changedInstance2;
        boolean changedInstance3;
        java.lang.Object rememberedValue;
        boolean changedInstance4;
        java.lang.Object rememberedValue2;
        boolean changedInstance5;
        int i5;
        boolean changedInstance6;
        java.lang.Object rememberedValue3;
        java.lang.String str;
        final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState inboundConnectUiState;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboundConnectDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(34067198);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(inboundConnectDestination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                inboundConnectViewModel2 = inboundConnectViewModel;
                if (startRestartGroup.changedInstance(inboundConnectViewModel2)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                inboundConnectViewModel2 = inboundConnectViewModel;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            inboundConnectViewModel2 = inboundConnectViewModel;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 147) != 146, i7 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
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
                    i4 = 0;
                    i7 &= -897;
                    inboundConnectViewModel4 = (com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(34067198, i7, -1, "com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreen (InboundConnectScreen.kt:65)");
                    }
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    changedInstance = startRestartGroup.changedInstance(context);
                    changedInstance2 = startRestartGroup.changedInstance(inboundConnectViewModel4);
                    changedInstance3 = startRestartGroup.changedInstance(inboundConnectDestination);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changedInstance | changedInstance2 | changedInstance3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$1$1(context, inboundConnectViewModel4, inboundConnectDestination, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(inboundConnectDestination, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i7 & 14);
                    androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(inboundConnectViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    changedInstance4 = startRestartGroup.changedInstance(inboundConnectViewModel4);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance4 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt.$r8$lambda$lI4ahaQwplz518hGm6aXTT1kwn4(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 6, i4);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    changedInstance5 = startRestartGroup.changedInstance(inboundConnectViewModel4);
                    i5 = (i7 & 112) != 32 ? i4 : 1;
                    changedInstance6 = startRestartGroup.changedInstance(context);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((i5 | (changedInstance5 ? 1 : 0) | (changedInstance6 ? 1 : 0)) == 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        str = null;
                        rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$3$1(inboundConnectViewModel4, appNavigator, context, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    } else {
                        str = null;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                    inboundConnectUiState = (com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState) collectAsStateWithLifecycle.getValue();
                    if (!(inboundConnectUiState instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Loading)) {
                        startRestartGroup.startReplaceGroup(1285640637);
                        getHighSpeedVideoSizes(startRestartGroup, i4);
                        startRestartGroup.endReplaceGroup();
                    } else if (inboundConnectUiState instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading) {
                        startRestartGroup.startReplaceGroup(1285761661);
                        com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading webViewLoading = (com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading) inboundConnectUiState;
                        java.lang.String connectUrl = webViewLoading.getConnectUrl();
                        com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest getHighResolutionOutputSizeshNQ4ISI = inboundConnectViewModel4.getGetHighResolutionOutputSizeshNQ4ISI();
                        java.lang.String redirectUri = getHighResolutionOutputSizeshNQ4ISI != null ? getHighResolutionOutputSizeshNQ4ISI.getRedirectUri() : str;
                        if (redirectUri == null) {
                            redirectUri = "";
                        }
                        boolean isInitialized = webViewLoading.isInitialized();
                        boolean changedInstance7 = startRestartGroup.changedInstance(inboundConnectViewModel4);
                        boolean changed = startRestartGroup.changed(inboundConnectUiState);
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if ((changedInstance7 | changed) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt.$r8$lambda$Dsz4QeL0rbQZIN5mAupU4mzxrH8(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.this, inboundConnectUiState, (com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt.IdentityConnectWebView(connectUrl, redirectUri, isInitialized, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, 0, 0);
                        startRestartGroup.endReplaceGroup();
                    } else if (inboundConnectUiState instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Completing) {
                        startRestartGroup.startReplaceGroup(1286776632);
                        getHighSpeedVideoSizes(startRestartGroup, i4);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1621096659);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    inboundConnectViewModel3 = inboundConnectViewModel4;
                }
                i4 = 0;
                inboundConnectViewModel4 = inboundConnectViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                changedInstance = startRestartGroup.changedInstance(context2);
                changedInstance2 = startRestartGroup.changedInstance(inboundConnectViewModel4);
                changedInstance3 = startRestartGroup.changedInstance(inboundConnectDestination);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | changedInstance2 | changedInstance3)) {
                }
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$1$1(context2, inboundConnectViewModel4, inboundConnectDestination, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(inboundConnectDestination, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i7 & 14);
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(inboundConnectViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                changedInstance4 = startRestartGroup.changedInstance(inboundConnectViewModel4);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt.$r8$lambda$lI4ahaQwplz518hGm6aXTT1kwn4(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 6, i4);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance5 = startRestartGroup.changedInstance(inboundConnectViewModel4);
                if ((i7 & 112) != 32) {
                }
                changedInstance6 = startRestartGroup.changedInstance(context2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if ((i5 | (changedInstance5 ? 1 : 0) | (changedInstance6 ? 1 : 0)) == 0) {
                }
                str = null;
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$3$1(inboundConnectViewModel4, appNavigator, context2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                inboundConnectUiState = (com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState) collectAsStateWithLifecycle2.getValue();
                if (!(inboundConnectUiState instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Loading)) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                inboundConnectViewModel3 = inboundConnectViewModel4;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i7 &= -897;
                    inboundConnectViewModel4 = inboundConnectViewModel2;
                    i4 = 0;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    android.content.Context context22 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    changedInstance = startRestartGroup.changedInstance(context22);
                    changedInstance2 = startRestartGroup.changedInstance(inboundConnectViewModel4);
                    changedInstance3 = startRestartGroup.changedInstance(inboundConnectDestination);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changedInstance | changedInstance2 | changedInstance3)) {
                    }
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$1$1(context22, inboundConnectViewModel4, inboundConnectDestination, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(inboundConnectDestination, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i7 & 14);
                    androidx.compose.runtime.State collectAsStateWithLifecycle22 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(inboundConnectViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    changedInstance4 = startRestartGroup.changedInstance(inboundConnectViewModel4);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance4) {
                    }
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt.$r8$lambda$lI4ahaQwplz518hGm6aXTT1kwn4(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 6, i4);
                    kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                    changedInstance5 = startRestartGroup.changedInstance(inboundConnectViewModel4);
                    if ((i7 & 112) != 32) {
                    }
                    changedInstance6 = startRestartGroup.changedInstance(context22);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((i5 | (changedInstance5 ? 1 : 0) | (changedInstance6 ? 1 : 0)) == 0) {
                    }
                    str = null;
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$3$1(inboundConnectViewModel4, appNavigator, context22, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                    inboundConnectUiState = (com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState) collectAsStateWithLifecycle22.getValue();
                    if (!(inboundConnectUiState instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Loading)) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    inboundConnectViewModel3 = inboundConnectViewModel4;
                }
                i4 = 0;
                inboundConnectViewModel4 = inboundConnectViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                android.content.Context context222 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                changedInstance = startRestartGroup.changedInstance(context222);
                changedInstance2 = startRestartGroup.changedInstance(inboundConnectViewModel4);
                changedInstance3 = startRestartGroup.changedInstance(inboundConnectDestination);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | changedInstance2 | changedInstance3)) {
                }
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$1$1(context222, inboundConnectViewModel4, inboundConnectDestination, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(inboundConnectDestination, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i7 & 14);
                androidx.compose.runtime.State collectAsStateWithLifecycle222 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(inboundConnectViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                changedInstance4 = startRestartGroup.changedInstance(inboundConnectViewModel4);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt.$r8$lambda$lI4ahaQwplz518hGm6aXTT1kwn4(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 6, i4);
                kotlin.Unit unit222 = kotlin.Unit.INSTANCE;
                changedInstance5 = startRestartGroup.changedInstance(inboundConnectViewModel4);
                if ((i7 & 112) != 32) {
                }
                changedInstance6 = startRestartGroup.changedInstance(context222);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if ((i5 | (changedInstance5 ? 1 : 0) | (changedInstance6 ? 1 : 0)) == 0) {
                }
                str = null;
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$3$1(inboundConnectViewModel4, appNavigator, context222, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                inboundConnectUiState = (com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState) collectAsStateWithLifecycle222.getValue();
                if (!(inboundConnectUiState instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Loading)) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                inboundConnectViewModel3 = inboundConnectViewModel4;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            inboundConnectViewModel3 = inboundConnectViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt.$r8$lambda$g5cSOj_b3L9FQhCfftElIMylQVY(com.paypal.oslo.feature.identity.api.navigation.InboundConnectDestination.this, appNavigator, inboundConnectViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(883156057);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(883156057, i, -1, "com.paypal.oslo.feature.identity.connect.inboundconnect.ui.LoadingScreen (InboundConnectScreen.kt:146)");
            }
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
            com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt.$r8$lambda$WoAVhEYzBa9CNutATBIT20tN7EI(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent mapWebViewEventToViewModelEvent(com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent inboundConnectWebViewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboundConnectWebViewEvent, "");
        if (inboundConnectWebViewEvent instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.WebViewInitialized) {
            return com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.WebViewInitialized.INSTANCE;
        }
        if (inboundConnectWebViewEvent instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadStarted) {
            return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadStarted(((com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadStarted) inboundConnectWebViewEvent).getUrl());
        }
        if (inboundConnectWebViewEvent instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadFinished) {
            return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.PageLoadFinished(((com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadFinished) inboundConnectWebViewEvent).getUrl());
        }
        if (inboundConnectWebViewEvent instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.RedirectUrlIntercepted) {
            return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.RedirectUrlIntercepted(((com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.RedirectUrlIntercepted) inboundConnectWebViewEvent).getUrl());
        }
        if (!(inboundConnectWebViewEvent instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.BackClicked)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Dismiss.INSTANCE;
    }

    public static final android.app.Activity findActivity(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        }
        return null;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Dsz4QeL0rbQZIN5mAupU4mzxrH8(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel inboundConnectViewModel, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState inboundConnectUiState, com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent inboundConnectWebViewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboundConnectWebViewEvent, "");
        if (inboundConnectWebViewEvent instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.BackClicked) {
            inboundConnectViewModel.userCancelEvent$identity_prodRelease(((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading) inboundConnectUiState).getConnectUrl());
        }
        inboundConnectViewModel.processEvent(mapWebViewEventToViewModelEvent(inboundConnectWebViewEvent));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WoAVhEYzBa9CNutATBIT20tN7EI(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g5cSOj_b3L9FQhCfftElIMylQVY(com.paypal.oslo.feature.identity.api.navigation.InboundConnectDestination inboundConnectDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel inboundConnectViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        InboundConnectScreen(inboundConnectDestination, appNavigator, inboundConnectViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lI4ahaQwplz518hGm6aXTT1kwn4(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel inboundConnectViewModel) {
        inboundConnectViewModel.userCancelEvent$identity_prodRelease(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA);
        inboundConnectViewModel.processEvent(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.Dismiss.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$openRedirectUrl(android.content.Context context, java.lang.String str) {
        try {
            context.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)));
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Opened OAuth redirect URL in system browser", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str)), 2, null);
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to open OAuth redirect URL; Inbound Connect flow will close without browser redirect", e);
        }
    }
}
