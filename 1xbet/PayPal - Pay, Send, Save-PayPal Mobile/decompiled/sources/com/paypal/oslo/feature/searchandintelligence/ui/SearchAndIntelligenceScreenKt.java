package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000eH\u0002\u001a\u008b\u0001\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\f2&\b\u0002\u0010\u0019\u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u001c\u0018\u00010\u001d0\u001a2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u001a2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010!H\u0001¢\u0006\u0002\u0010\"\u001a\r\u0010#\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010$\u001a\r\u0010%\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010$\u001a\r\u0010&\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010$¨\u0006'²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u008e\u0002"}, d2 = {"SearchAndIntelligenceScreen", "", "rendererRegistry", "Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/UiComponentRendererRegistry;", "privacyDisclosureOpener", "Lcom/paypal/oslo/feature/searchandintelligence/ui/PrivacyDisclosureOpener;", "destination", "Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination;", "viewModel", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatViewModel;", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/UiComponentRendererRegistry;Lcom/paypal/oslo/feature/searchandintelligence/ui/PrivacyDisclosureOpener;Lcom/paypal/oslo/feature/searchandintelligence/api/navigation/SearchAndIntelligenceDestination;Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatViewModel;Landroidx/compose/runtime/Composer;II)V", io.ktor.http.LinkHeader.Rel.Next, "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/QuickStartPrompt;", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters$Surface;", "SearchAndIntelligenceScreenContent", "uiState", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiState;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiEffect;", "quickStartPrompts", "getRenderer", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "onEvent", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "onOpenPrivacyDisclosure", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiState;Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SearchAndIntelligenceScreenWelcomePreview", "(Landroidx/compose/runtime/Composer;I)V", "SearchAndIntelligenceScreenMessagesPreview", "SearchAndIntelligenceScreenWithResumeOverlayPreview", "search-and-intelligence_prodRelease", "starters", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters;", "initialMessageConsumed", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SearchAndIntelligenceScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0390  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchAndIntelligenceScreen(final com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry uiComponentRendererRegistry, final com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener privacyDisclosureOpener, com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination searchAndIntelligenceDestination, com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel2;
        int i4;
        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel3;
        boolean booleanValue;
        android.content.Context context;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        boolean changedInstance;
        boolean changed;
        java.lang.Object rememberedValue;
        com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage initialMessage;
        java.lang.Object rememberedValue2;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator2;
        android.content.Context context2;
        boolean z;
        boolean changed2;
        java.lang.Object rememberedValue3;
        final androidx.view.OnBackPressedDispatcher onBackPressedDispatcher;
        final kotlin.jvm.functions.Function0 function0;
        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel4;
        com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage initialMessage2;
        int i5;
        int i6;
        com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination searchAndIntelligenceDestination2 = searchAndIntelligenceDestination;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiComponentRendererRegistry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacyDisclosureOpener, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(544376326);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(uiComponentRendererRegistry) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(privacyDisclosureOpener) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                if ((i & 512) == 0 ? startRestartGroup.changed(searchAndIntelligenceDestination2) : startRestartGroup.changedInstance(searchAndIntelligenceDestination2)) {
                    i6 = 256;
                    i3 |= i6;
                }
            }
            i6 = 128;
            i3 |= i6;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                chatViewModel2 = chatViewModel;
                if (startRestartGroup.changedInstance(chatViewModel2)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                chatViewModel2 = chatViewModel;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            chatViewModel2 = chatViewModel;
        }
        int i7 = 1;
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage initialMessage3 = null;
            java.lang.Object[] objArr = 0;
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    searchAndIntelligenceDestination2 = new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination(initialMessage3, i7, (kotlin.jvm.internal.DefaultConstructorMarker) (objArr == true ? 1 : 0));
                    i3 &= -897;
                }
                int i8 = i3;
                if ((i2 & 8) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel5 = (com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                    i4 = i8 & (-7169);
                    chatViewModel3 = chatViewModel5;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(544376326, i4, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreen (SearchAndIntelligenceScreen.kt:66)");
                    }
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(chatViewModel3.getUiState(), null, startRestartGroup, 0, 1);
                    androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(chatViewModel3.getStarters(), null, startRestartGroup, 0, 1);
                    booleanValue = ((java.lang.Boolean) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.LocalL0VisibilityKt.getLocalL0Visibility())).booleanValue();
                    context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    appNavigator = (com.paypal.oslo.core.navigation.AppNavigator) startRestartGroup.consume(com.paypal.oslo.core.navigation.ui.LocalAppNavigatorKt.getLocalAppNavigator());
                    changedInstance = startRestartGroup.changedInstance(chatViewModel3);
                    changed = startRestartGroup.changed(booleanValue);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$1$1(chatViewModel3, booleanValue, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                    initialMessage = searchAndIntelligenceDestination2.getInitialMessage();
                    java.lang.Object[] objArr2 = {initialMessage};
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                androidx.compose.runtime.MutableState mutableStateOf$default;
                                mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                                return mutableStateOf$default;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr2, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 48);
                    if (initialMessage != null || ((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                        appNavigator2 = appNavigator;
                        context2 = context;
                        z = booleanValue;
                        startRestartGroup.startReplaceGroup(-279157764);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-280111076);
                        boolean changedInstance2 = startRestartGroup.changedInstance(initialMessage);
                        boolean changed3 = startRestartGroup.changed(mutableState);
                        boolean changedInstance3 = startRestartGroup.changedInstance(chatViewModel3);
                        boolean changed4 = startRestartGroup.changed(appNavigator);
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (((changedInstance2 | changed3 | changedInstance3) || changed4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            initialMessage2 = initialMessage;
                            appNavigator2 = appNavigator;
                            context2 = context;
                            z = booleanValue;
                            rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$2$1(initialMessage, chatViewModel3, appNavigator, mutableState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        } else {
                            initialMessage2 = initialMessage;
                            appNavigator2 = appNavigator;
                            context2 = context;
                            z = booleanValue;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(initialMessage2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage.$stable);
                        startRestartGroup.endReplaceGroup();
                    }
                    changed2 = startRestartGroup.changed(((com.paypal.oslo.feature.searchandintelligence.domain.model.Starters) collectAsState2.getValue()).getQuickStartPrompts());
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        java.util.Map<com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface, java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt>> quickStartPrompts = ((com.paypal.oslo.feature.searchandintelligence.domain.model.Starters) collectAsState2.getValue()).getQuickStartPrompts();
                        com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface surface = (com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface) kotlin.collections.CollectionsKt.randomOrNull(quickStartPrompts.keySet(), kotlin.random.Random.INSTANCE);
                        java.lang.Object obj = surface == null ? (java.util.List) quickStartPrompts.get(surface) : null;
                        rememberedValue3 = obj != null ? kotlin.collections.CollectionsKt.emptyList() : obj;
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    java.util.List list = (java.util.List) rememberedValue3;
                    androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                    androidx.view.OnBackPressedDispatcherOwner current2 = androidx.view.compose.LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.compose.LocalOnBackPressedDispatcherOwner.$stable);
                    onBackPressedDispatcher = current2 == null ? current2.getOnBackPressedDispatcher() : null;
                    if (onBackPressedDispatcher == null) {
                        startRestartGroup.startReplaceGroup(-278274326);
                        boolean changedInstance4 = startRestartGroup.changedInstance(onBackPressedDispatcher);
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$9A3YNLd5HNZTFCMTeupGrQJ6ojM(androidx.view.OnBackPressedDispatcher.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-278218743);
                        final com.paypal.oslo.core.navigation.AppNavigator appNavigator3 = appNavigator2;
                        boolean changed5 = startRestartGroup.changed(appNavigator3);
                        java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if (changed5 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$xqhn7UiNz1WJlAM1RWntBb1XdJ4(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        function0 = (kotlin.jvm.functions.Function0) rememberedValue6;
                        startRestartGroup.endReplaceGroup();
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
                        startRestartGroup.useNode();
                    } else {
                        startRestartGroup.createNode(constructor);
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel6 = chatViewModel3;
                    androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, z, (androidx.compose.ui.Modifier) null, androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween(300, 300, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing()), 0.0f, 2, null), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(0, 0, null, 6, null), 0.0f, 2, null), (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(3647480, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function3
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$z7JnaPf7xvJe081tbW91Eevc_BQ(kotlin.jvm.functions.Function0.this, (androidx.compose.animation.AnimatedVisibilityScope) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 1597446, 18);
                    if (z) {
                        chatViewModel4 = chatViewModel6;
                        startRestartGroup.startReplaceGroup(415041042);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(414623658);
                        com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState chatUiState = (com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState) collectAsState.getValue();
                        kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect> uiEffect = chatViewModel6.getUiEffect();
                        chatViewModel4 = chatViewModel6;
                        boolean changedInstance5 = startRestartGroup.changedInstance(chatViewModel4);
                        java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                        if (changedInstance5 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$3$2$1(chatViewModel4);
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                        }
                        kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue7;
                        boolean changedInstance6 = startRestartGroup.changedInstance(uiComponentRendererRegistry);
                        java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                        if (changedInstance6 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$Npx8Dkhy4RUU2kS8bhR4jaLU0Gw(com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry.this, (kotlin.reflect.KClass) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue8);
                        }
                        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue8;
                        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) kFunction;
                        boolean changedInstance7 = startRestartGroup.changedInstance(privacyDisclosureOpener);
                        final android.content.Context context3 = context2;
                        boolean changedInstance8 = startRestartGroup.changedInstance(context3);
                        java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                        if ((changedInstance7 | changedInstance8) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$4xugrIFiciCn4WXBK3dK1NXKa_8(com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener.this, context3);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue9);
                        }
                        SearchAndIntelligenceScreenContent(chatUiState, rememberLazyListState, uiEffect, list, function1, function12, (kotlin.jvm.functions.Function0) rememberedValue9, startRestartGroup, 0, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    chatViewModel2 = chatViewModel4;
                } else {
                    i3 = i8;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            chatViewModel3 = chatViewModel2;
            i4 = i3;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsState3 = androidx.compose.runtime.SnapshotStateKt.collectAsState(chatViewModel3.getUiState(), null, startRestartGroup, 0, 1);
            androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(chatViewModel3.getStarters(), null, startRestartGroup, 0, 1);
            booleanValue = ((java.lang.Boolean) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.LocalL0VisibilityKt.getLocalL0Visibility())).booleanValue();
            context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            appNavigator = (com.paypal.oslo.core.navigation.AppNavigator) startRestartGroup.consume(com.paypal.oslo.core.navigation.ui.LocalAppNavigatorKt.getLocalAppNavigator());
            changedInstance = startRestartGroup.changedInstance(chatViewModel3);
            changed = startRestartGroup.changed(booleanValue);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | changed)) {
            }
            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$SearchAndIntelligenceScreen$1$1(chatViewModel3, booleanValue, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            initialMessage = searchAndIntelligenceDestination2.getInitialMessage();
            java.lang.Object[] objArr22 = {initialMessage};
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr22, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 48);
            if (initialMessage != null) {
            }
            appNavigator2 = appNavigator;
            context2 = context;
            z = booleanValue;
            startRestartGroup.startReplaceGroup(-279157764);
            startRestartGroup.endReplaceGroup();
            changed2 = startRestartGroup.changed(((com.paypal.oslo.feature.searchandintelligence.domain.model.Starters) collectAsState22.getValue()).getQuickStartPrompts());
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            java.util.Map<com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface, java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt>> quickStartPrompts2 = ((com.paypal.oslo.feature.searchandintelligence.domain.model.Starters) collectAsState22.getValue()).getQuickStartPrompts();
            com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface surface2 = (com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface) kotlin.collections.CollectionsKt.randomOrNull(quickStartPrompts2.keySet(), kotlin.random.Random.INSTANCE);
            if (surface2 == null) {
            }
            if (obj != null) {
            }
            startRestartGroup.updateRememberedValue(rememberedValue3);
            java.util.List list2 = (java.util.List) rememberedValue3;
            androidx.compose.foundation.lazy.LazyListState rememberLazyListState2 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
            androidx.view.OnBackPressedDispatcherOwner current22 = androidx.view.compose.LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.compose.LocalOnBackPressedDispatcherOwner.$stable);
            if (current22 == null) {
            }
            if (onBackPressedDispatcher == null) {
            }
            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel62 = chatViewModel3;
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, z, (androidx.compose.ui.Modifier) null, androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween(300, 300, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing()), 0.0f, 2, null), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(0, 0, null, 6, null), 0.0f, 2, null), (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(3647480, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$z7JnaPf7xvJe081tbW91Eevc_BQ(kotlin.jvm.functions.Function0.this, (androidx.compose.animation.AnimatedVisibilityScope) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 1597446, 18);
            if (z) {
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            chatViewModel2 = chatViewModel4;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination searchAndIntelligenceDestination3 = searchAndIntelligenceDestination2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel7 = chatViewModel2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$W3fdbRwLV8iYjt9kJVkFGk7gsmw(com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry.this, privacyDisclosureOpener, searchAndIntelligenceDestination3, chatViewModel7, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x033f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchAndIntelligenceScreenContent(final com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState chatUiState, final androidx.compose.foundation.lazy.LazyListState lazyListState, kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect> flow, java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> list, kotlin.jvm.functions.Function1<? super kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>, ? extends com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect> flow2;
        java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> list2;
        int i4;
        kotlin.jvm.functions.Function1<? super kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>, ? extends com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>> function13;
        int i5;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent, kotlin.Unit> function14;
        int i6;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final kotlin.jvm.functions.Function1<? super kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>, ? extends com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>> function15;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect> flow3;
        kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect> flow4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent, kotlin.Unit> function16;
        boolean z;
        java.lang.Object rememberedValue;
        boolean z2;
        java.lang.Object rememberedValue2;
        boolean z3;
        java.lang.Object rememberedValue3;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1759086458);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(chatUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                flow2 = flow;
                if (startRestartGroup.changedInstance(flow2)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                flow2 = flow;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            flow2 = flow;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            list2 = list;
            i3 |= startRestartGroup.changedInstance(list2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function13 = function1;
                i3 |= startRestartGroup.changedInstance(function13) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function14 = function12;
                    i3 |= startRestartGroup.changedInstance(function14) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if ((i2 & 4) != 0) {
                                    flow3 = kotlinx.coroutines.flow.FlowKt.emptyFlow();
                                    i3 &= -897;
                                } else {
                                    flow3 = flow2;
                                }
                                if (i8 != 0) {
                                    list2 = kotlin.collections.CollectionsKt.emptyList();
                                }
                                if (i4 != 0) {
                                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda15
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.m19165$r8$lambda$NPF5HBktLavteGKdMgMcNuFRcw((kotlin.reflect.KClass) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
                                }
                                if (i5 != 0) {
                                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda16
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$HsVqRqdgV4A3zjIucVtD974GtnI((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    function14 = (kotlin.jvm.functions.Function1) rememberedValue5;
                                }
                                if (i6 != 0) {
                                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda17
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    flow4 = flow3;
                                    function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
                                    java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> list3 = list2;
                                    kotlin.jvm.functions.Function1<? super kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>, ? extends com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>> function17 = function13;
                                    function16 = function14;
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(1759086458, i3, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenContent (SearchAndIntelligenceScreen.kt:199)");
                                    }
                                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (!startRestartGroup.getInserting()) {
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
                                    androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (!startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(constructor2);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                    com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus status = chatUiState.getStatus();
                                    java.util.List<com.paypal.oslo.feature.searchandintelligence.ui.Conversation> conversations = chatUiState.getConversations();
                                    java.lang.String inputText = chatUiState.getInputText();
                                    boolean showDisclaimer = chatUiState.getShowDisclaimer();
                                    androidx.compose.ui.Modifier fillMaxSize$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                    int i9 = i3 & 458752;
                                    z = i9 != 131072;
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda18
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$arv6w6B5UbvVKQRYAiLnXSHiB2g(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    kotlin.jvm.functions.Function1 function18 = (kotlin.jvm.functions.Function1) rememberedValue;
                                    z2 = i9 != 131072;
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda19
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.m19169$r8$lambda$mV0vP57cFa20VT1dlrCD3vdTrw(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    kotlin.jvm.functions.Function1 function19 = (kotlin.jvm.functions.Function1) rememberedValue2;
                                    z3 = i9 != 131072;
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda20
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$kfMkZnAwMI0uEirxawQ4qugMkm4(kotlin.jvm.functions.Function1.this);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt.ChatContent(status, conversations, list3, lazyListState, fillMaxSize$default3, inputText, showDisclaimer, flow4, function17, function18, function19, (kotlin.jvm.functions.Function0) rememberedValue3, function03, null, startRestartGroup, ((i3 >> 3) & 896) | 24576 | ((i3 << 6) & 7168) | ((i3 << 15) & 29360128) | ((i3 << 12) & 234881024), (i3 >> 12) & 896, 8192);
                                    startRestartGroup.endNode();
                                    if (chatUiState.getShowResumeOverlay()) {
                                        composer2 = startRestartGroup;
                                        function14 = function16;
                                        composer2.startReplaceGroup(992726126);
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2 = startRestartGroup;
                                        composer2.startReplaceGroup(992548341);
                                        boolean z4 = i9 == 131072;
                                        java.lang.Object rememberedValue7 = composer2.rememberedValue();
                                        if (z4 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            function14 = function16;
                                            rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Object invoke() {
                                                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.m19168$r8$lambda$eGnikMVeYFgfuwnSPEQuOMsb8(kotlin.jvm.functions.Function1.this);
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue7);
                                        } else {
                                            function14 = function16;
                                        }
                                        kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue7;
                                        boolean z5 = i9 == 131072;
                                        java.lang.Object rememberedValue8 = composer2.rememberedValue();
                                        if (z5 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Object invoke() {
                                                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$1LlSuJRc9UXRjMjFGrE6fhPW46A(kotlin.jvm.functions.Function1.this);
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue8);
                                        }
                                        com.paypal.oslo.feature.searchandintelligence.ui.ResumeChatOverlayKt.ResumeChatOverlay(function04, (kotlin.jvm.functions.Function0) rememberedValue8, null, composer2, 0, 4);
                                        composer2.endReplaceGroup();
                                    }
                                    composer2.endNode();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    flow2 = flow4;
                                    list2 = list3;
                                    function15 = function17;
                                    function02 = function03;
                                } else {
                                    flow2 = flow3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                            }
                            function03 = function0;
                            flow4 = flow2;
                            java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> list32 = list2;
                            kotlin.jvm.functions.Function1<? super kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>, ? extends com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>> function172 = function13;
                            function16 = function14;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            androidx.compose.ui.Modifier fillMaxSize$default4 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default4);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            androidx.compose.ui.Modifier fillMaxSize$default22 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus status2 = chatUiState.getStatus();
                            java.util.List<com.paypal.oslo.feature.searchandintelligence.ui.Conversation> conversations2 = chatUiState.getConversations();
                            java.lang.String inputText2 = chatUiState.getInputText();
                            boolean showDisclaimer2 = chatUiState.getShowDisclaimer();
                            androidx.compose.ui.Modifier fillMaxSize$default32 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                            int i92 = i3 & 458752;
                            if (i92 != 131072) {
                            }
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z) {
                            }
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$arv6w6B5UbvVKQRYAiLnXSHiB2g(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            kotlin.jvm.functions.Function1 function182 = (kotlin.jvm.functions.Function1) rememberedValue;
                            if (i92 != 131072) {
                            }
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2) {
                            }
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda19
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.m19169$r8$lambda$mV0vP57cFa20VT1dlrCD3vdTrw(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            kotlin.jvm.functions.Function1 function192 = (kotlin.jvm.functions.Function1) rememberedValue2;
                            if (i92 != 131072) {
                            }
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!z3) {
                            }
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda20
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$kfMkZnAwMI0uEirxawQ4qugMkm4(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt.ChatContent(status2, conversations2, list32, lazyListState, fillMaxSize$default32, inputText2, showDisclaimer2, flow4, function172, function182, function192, (kotlin.jvm.functions.Function0) rememberedValue3, function03, null, startRestartGroup, ((i3 >> 3) & 896) | 24576 | ((i3 << 6) & 7168) | ((i3 << 15) & 29360128) | ((i3 << 12) & 234881024), (i3 >> 12) & 896, 8192);
                            startRestartGroup.endNode();
                            if (chatUiState.getShowResumeOverlay()) {
                            }
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            flow2 = flow4;
                            list2 = list32;
                            function15 = function172;
                            function02 = function03;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            function02 = function0;
                            function15 = function13;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            final kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect> flow5 = flow2;
                            final java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> list4 = list2;
                            final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent, kotlin.Unit> function110 = function14;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$YJy4xtYuWdDA5is9trwxW5Q1TUU(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.this, lazyListState, flow5, list4, function15, function110, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function14 = function12;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function13 = function1;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function14 = function12;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        list2 = list;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function14 = function12;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0Q_Je0genGg0zNNFsNB7cHqyi5s(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1LlSuJRc9UXRjMjFGrE6fhPW46A(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.ContinueChat.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4xugrIFiciCn4WXBK3dK1NXKa_8(com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener privacyDisclosureOpener, android.content.Context context) {
        privacyDisclosureOpener.open(context);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9A3YNLd5HNZTFCMTeupGrQJ6ojM(androidx.view.OnBackPressedDispatcher onBackPressedDispatcher) {
        onBackPressedDispatcher.onBackPressed();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HsVqRqdgV4A3zjIucVtD974GtnI(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent chatEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LXQXLWbb1Apbrb1dpSUh_vSXdv4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1390320451);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1390320451, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenWelcomePreview (SearchAndIntelligenceScreen.kt:232)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt.INSTANCE.getLambda$2076847638$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$LXQXLWbb1Apbrb1dpSUh_vSXdv4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NPF-5HBktLavteGKdMgMcNuFRcw, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer m19165$r8$lambda$NPF5HBktLavteGKdMgMcNuFRcw(kotlin.reflect.KClass kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer $r8$lambda$Npx8Dkhy4RUU2kS8bhR4jaLU0Gw(com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry uiComponentRendererRegistry, kotlin.reflect.KClass kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return uiComponentRendererRegistry.get(kClass);
    }

    /* renamed from: $r8$lambda$PNkF_y-C_hlUhkTz6_1NslJHM4w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19166$r8$lambda$PNkF_yC_hlUhkTz6_1NslJHM4w(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(446608903, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreen.<anonymous>.<anonymous>.<anonymous> (SearchAndIntelligenceScreen.kt:150)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton(function0, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PPZyMq5W-R7caHFyIBfQ1I9S-3A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19167$r8$lambda$PPZyMq5WR7caHFyIBfQ1I9S3A(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1330472193);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1330472193, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenMessagesPreview (SearchAndIntelligenceScreen.kt:245)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt.INSTANCE.m19152getLambda$1222443834$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.m19167$r8$lambda$PPZyMq5WR7caHFyIBfQ1I9S3A(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W3fdbRwLV8iYjt9kJVkFGk7gsmw(com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry uiComponentRendererRegistry, com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener privacyDisclosureOpener, com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination searchAndIntelligenceDestination, com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SearchAndIntelligenceScreen(uiComponentRendererRegistry, privacyDisclosureOpener, searchAndIntelligenceDestination, chatViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YJy4xtYuWdDA5is9trwxW5Q1TUU(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState chatUiState, androidx.compose.foundation.lazy.LazyListState lazyListState, kotlinx.coroutines.flow.Flow flow, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SearchAndIntelligenceScreenContent(chatUiState, lazyListState, flow, list, function1, function12, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$arv6w6B5UbvVKQRYAiLnXSHiB2g(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage(str, null, 0, 6, null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eGnikMVeYFgfu-wnSPEQ-uOMsb8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19168$r8$lambda$eGnikMVeYFgfuwnSPEQuOMsb8(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StartOver.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kfMkZnAwMI0uEirxawQ4qugMkm4(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.Retry.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mV0v-P57cFa20VT1dlrCD3vdTrw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19169$r8$lambda$mV0vP57cFa20VT1dlrCD3vdTrw(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.InputTextChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$or401UrWxhMyeQxzY1UHYBYsZnQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(923583576);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(923583576, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenWithResumeOverlayPreview (SearchAndIntelligenceScreen.kt:261)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SearchAndIntelligenceScreenKt.INSTANCE.getLambda$663777905$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$or401UrWxhMyeQxzY1UHYBYsZnQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xqhn7UiNz1WJlAM1RWntBb1XdJ4(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.$r8$lambda$0Q_Je0genGg0zNNFsNB7cHqyi5s((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z7JnaPf7xvJe081tbW91Eevc_BQ(final kotlin.jvm.functions.Function0 function0, androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(3647480, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreen.<anonymous>.<anonymous> (SearchAndIntelligenceScreen.kt:147)");
        }
        com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(446608903, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.m19166$r8$lambda$PNkF_yC_hlUhkTz6_1NslJHM4w(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 1572870, 62);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
