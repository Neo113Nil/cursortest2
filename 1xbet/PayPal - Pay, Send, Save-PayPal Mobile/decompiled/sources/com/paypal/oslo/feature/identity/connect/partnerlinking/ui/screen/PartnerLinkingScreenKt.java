package com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen;

@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\f\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0016\u001a\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002"}, d2 = {"PartnerLinkingScreen", "", "request", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;", "requestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingViewModel;", "PartnerLinkingScreen-fgb3AoM", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;Ljava/lang/String;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingViewModel;Landroidx/compose/runtime/Composer;II)V", "handleLinkingCompleted", "activity", "Landroid/app/Activity;", "effect", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect$LinkingComplete;", "RenderLoadingState", "(Landroidx/compose/runtime/Composer;I)V", "RenderWebViewReadyState", "state", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState$WebViewReady;", "(Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState$WebViewReady;Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingViewModel;Landroidx/compose/runtime/Composer;I)V", "mapWebViewEventToPartnerLinkingEvent", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "webViewEvent", "Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent;", "identity_prodRelease", "uiState", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState;", "hasWebViewInitialized", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PartnerLinkingScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0113  */
    /* renamed from: PartnerLinkingScreen-fgb3AoM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15124PartnerLinkingScreenfgb3AoM(final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest, final java.lang.String str, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel2;
        androidx.compose.runtime.Composer composer2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean z;
        boolean changedInstance;
        boolean z2;
        boolean changedInstance2;
        boolean z3;
        boolean changedInstance3;
        com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1 rememberedValue;
        int i4;
        com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel3;
        com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState partnerLinkingUiState;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerLinkingRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-998985642);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(partnerLinkingRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                partnerLinkingViewModel2 = partnerLinkingViewModel;
                if (startRestartGroup.changedInstance(partnerLinkingViewModel2)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                partnerLinkingViewModel2 = partnerLinkingViewModel;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            partnerLinkingViewModel2 = partnerLinkingViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            } else if ((i2 & 8) != 0) {
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
                z = false;
                partnerLinkingViewModel2 = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i3 &= -7169;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-998985642, i3, -1, "com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreen (PartnerLinkingScreen.kt:89)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(partnerLinkingViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                android.app.Activity activity = (android.app.Activity) startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                changedInstance = startRestartGroup.changedInstance(partnerLinkingViewModel2);
                z2 = (i3 & 112) != 32 ? true : z;
                changedInstance2 = startRestartGroup.changedInstance(activity);
                z3 = (i3 & 896) != 256 ? z : true;
                changedInstance3 = startRestartGroup.changedInstance(partnerLinkingRequest);
                rememberedValue = startRestartGroup.rememberedValue();
                if ((!(changedInstance | z2 | changedInstance2 | z3) && !changedInstance3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i4 = i3;
                    partnerLinkingViewModel3 = partnerLinkingViewModel2;
                    composer2 = startRestartGroup;
                    rememberedValue = new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1(partnerLinkingViewModel2, partnerLinkingRequest, str, activity, appNavigator, null);
                    composer2.updateRememberedValue(rememberedValue);
                } else {
                    i4 = i3;
                    partnerLinkingViewModel3 = partnerLinkingViewModel2;
                    composer2 = startRestartGroup;
                }
                partnerLinkingViewModel2 = partnerLinkingViewModel3;
                androidx.compose.runtime.EffectsKt.LaunchedEffect(partnerLinkingViewModel2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, (i4 >> 9) & 14);
                partnerLinkingUiState = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState) collectAsStateWithLifecycle.getValue();
                if (!(partnerLinkingUiState instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Initial) || (partnerLinkingUiState instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.InitializingOAuth)) {
                    composer2.startReplaceGroup(2047574122);
                    getHighSpeedVideoFpsRangesFor(composer2, 0);
                    composer2.endReplaceGroup();
                } else if (partnerLinkingUiState instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady) {
                    composer2.startReplaceGroup(2047576383);
                    getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady) partnerLinkingUiState, partnerLinkingViewModel2, composer2, (i4 >> 6) & 112);
                    composer2.endReplaceGroup();
                } else {
                    if (!(partnerLinkingUiState instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Error)) {
                        composer2.startReplaceGroup(2047570487);
                        composer2.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(-949556408);
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            z = false;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(partnerLinkingViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            android.app.Activity activity2 = (android.app.Activity) startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
            changedInstance = startRestartGroup.changedInstance(partnerLinkingViewModel2);
            if ((i3 & 112) != 32) {
            }
            changedInstance2 = startRestartGroup.changedInstance(activity2);
            if ((i3 & 896) != 256) {
            }
            changedInstance3 = startRestartGroup.changedInstance(partnerLinkingRequest);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z2 | changedInstance2 | z3 | changedInstance3)) {
            }
            i4 = i3;
            partnerLinkingViewModel3 = partnerLinkingViewModel2;
            composer2 = startRestartGroup;
            rememberedValue = new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1(partnerLinkingViewModel2, partnerLinkingRequest, str, activity2, appNavigator, null);
            composer2.updateRememberedValue(rememberedValue);
            partnerLinkingViewModel2 = partnerLinkingViewModel3;
            androidx.compose.runtime.EffectsKt.LaunchedEffect(partnerLinkingViewModel2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, (i4 >> 9) & 14);
            partnerLinkingUiState = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState) collectAsStateWithLifecycle2.getValue();
            if (!(partnerLinkingUiState instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Initial)) {
            }
            composer2.startReplaceGroup(2047574122);
            getHighSpeedVideoFpsRangesFor(composer2, 0);
            composer2.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel4 = partnerLinkingViewModel2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt.$r8$lambda$mZ30jpanXEygLH4MDvpBlcSkoQI(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.this, str, appNavigator, partnerLinkingViewModel4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1357233440);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1357233440, i, -1, "com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.RenderLoadingState (PartnerLinkingScreen.kt:212)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt.$r8$lambda$x9Hj81g4I7XLhw6VvFpo9bo59No(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady webViewReady, final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(352764216);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(webViewReady) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(partnerLinkingViewModel) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(352764216, i2, -1, "com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.RenderWebViewReadyState (PartnerLinkingScreen.kt:238)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.String connectUrl = webViewReady.getConnectUrl();
            java.lang.String returnUrl = webViewReady.getReturnUrl();
            boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            boolean changedInstance = startRestartGroup.changedInstance(partnerLinkingViewModel);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt.$r8$lambda$S7Geg_tS7KQpkuva7NnW156_KWU(androidx.compose.runtime.MutableState.this, partnerLinkingViewModel, (com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt.IdentityConnectWebView(connectUrl, returnUrl, booleanValue, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt.$r8$lambda$wHRtJOaBIfhiMN0rAZo9aHlXdmI(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady.this, partnerLinkingViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent mapWebViewEventToPartnerLinkingEvent(com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent inboundConnectWebViewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboundConnectWebViewEvent, "");
        if (inboundConnectWebViewEvent instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.WebViewInitialized) {
            return null;
        }
        if (inboundConnectWebViewEvent instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadStarted) {
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadStarted(((com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadStarted) inboundConnectWebViewEvent).getUrl());
        }
        if (inboundConnectWebViewEvent instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadFinished) {
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewPageLoadFinished(((com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadFinished) inboundConnectWebViewEvent).getUrl());
        }
        if (inboundConnectWebViewEvent instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.RedirectUrlIntercepted) {
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectUrlIntercepted(((com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.RedirectUrlIntercepted) inboundConnectWebViewEvent).getUrl());
        }
        if (inboundConnectWebViewEvent instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.BackClicked) {
            return com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewBackClicked.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S7Geg_tS7KQpkuva7NnW156_KWU(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel, com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent inboundConnectWebViewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboundConnectWebViewEvent, "");
        if (inboundConnectWebViewEvent instanceof com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.WebViewInitialized) {
            mutableState.setValue(java.lang.Boolean.TRUE);
        } else {
            com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent mapWebViewEventToPartnerLinkingEvent = mapWebViewEventToPartnerLinkingEvent(inboundConnectWebViewEvent);
            if (mapWebViewEventToPartnerLinkingEvent != null) {
                partnerLinkingViewModel.processEvent(mapWebViewEventToPartnerLinkingEvent);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W0NAGrslr0waBLIPlaAp6N0lQzw(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.LinkingComplete linkingComplete, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult(new com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Success(linkingComplete.getRedirectUrl())));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mZ30jpanXEygLH4MDvpBlcSkoQI(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest, java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m15124PartnerLinkingScreenfgb3AoM(partnerLinkingRequest, str, appNavigator, partnerLinkingViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wHRtJOaBIfhiMN0rAZo9aHlXdmI(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady webViewReady, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(webViewReady, partnerLinkingViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x9Hj81g4I7XLhw6VvFpo9bo59No(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$handleLinkingCompleted(android.app.Activity activity, com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.LinkingComplete linkingComplete) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Partner linking completed successfully", null, null, 6, null);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt.$r8$lambda$W0NAGrslr0waBLIPlaAp6N0lQzw(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.LinkingComplete.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        if (activity != null) {
            try {
                activity.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(linkingComplete.getRedirectUrl())));
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Opened OAuth redirect URL in system browser", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", linkingComplete.getRedirectUrl())), 2, null);
                return;
            } catch (android.content.ActivityNotFoundException e) {
                com.paypal.oslo.feature.identity.LoggerKt.log.e("No browser available to open OAuth redirect URL; completing linking flow without browser redirect", e);
                return;
            }
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "No Activity available to open OAuth redirect URL; navigation already completed", null, null, 6, null);
    }
}
