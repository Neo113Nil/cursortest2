package com.paypal.oslo.feature.helpcenter.ui.screens;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001ai\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000b2\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0014H\u0001¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u008a\u0084\u0002²\u0006\u0016\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000bX\u008a\u0084\u0002"}, d2 = {"ArticleFullScreen", "", "articleId", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/helpcenter/ui/viewmodel/ArticleFullScreenViewModel;", "(Ljava/lang/String;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/helpcenter/ui/viewmodel/ArticleFullScreenViewModel;Landroidx/compose/runtime/Composer;II)V", "ArticleFullScreenContent", "articleState", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/Article;", "recommendedArticlesState", "", "Lcom/paypal/oslo/feature/helpcenter/ui/models/RecommendedArticleUiData;", "navigator", "modifier", "Landroidx/compose/ui/Modifier;", "onVideoClick", "Lkotlin/Function1;", "onRecommendedArticleClick", "(Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "helpcenter_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ArticleFullScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ArticleFullScreen(final java.lang.String str, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel articleFullScreenViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel articleFullScreenViewModel2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean z;
        int i4;
        com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel articleFullScreenViewModel3;
        boolean changedInstance;
        boolean z2;
        com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$ArticleFullScreen$1$1 rememberedValue;
        int i5;
        boolean z3;
        java.lang.Object rememberedValue2;
        boolean z4;
        java.lang.Object rememberedValue3;
        boolean z5;
        java.lang.Object rememberedValue4;
        boolean z6;
        java.lang.Object rememberedValue5;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1453056826);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                articleFullScreenViewModel2 = articleFullScreenViewModel;
                if (startRestartGroup.changedInstance(articleFullScreenViewModel2)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                articleFullScreenViewModel2 = articleFullScreenViewModel;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            articleFullScreenViewModel2 = articleFullScreenViewModel;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 147) != 146, i7 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i7 &= -897;
                }
            } else if ((i2 & 4) != 0) {
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
                z = true;
                i4 = i7 & (-897);
                articleFullScreenViewModel3 = (com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1453056826, i4, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreen (ArticleFullScreen.kt:66)");
                }
                changedInstance = startRestartGroup.changedInstance(articleFullScreenViewModel3);
                int i8 = i4 & 14;
                z2 = i8 != 4 ? z ? 1 : 0 : false;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$ArticleFullScreen$1$1(articleFullScreenViewModel3, str, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i8);
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(articleFullScreenViewModel3.getScreenState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(articleFullScreenViewModel3.getRecommendedArticlesState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, z ? 1 : 0, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                i5 = i4 & 112;
                z3 = i5 != 32 ? z ? 1 : 0 : false;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.$r8$lambda$KOj1SgbBH7waW8_lE_2lccqxHvs(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                z4 = i5 != 32 ? z ? 1 : 0 : false;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.m14815$r8$lambda$4ejib6jR1D797CZI5HQVz4a1Z0(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.helpcenter.ui.components.HelpCenterTopBarKt.HelpCenterTopBar(function0, null, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 2);
                com.paypal.oslo.feature.helpcenter.ui.models.ScreenState screenState = (com.paypal.oslo.feature.helpcenter.ui.models.ScreenState) collectAsStateWithLifecycle.getValue();
                com.paypal.oslo.feature.helpcenter.ui.models.ScreenState screenState2 = (com.paypal.oslo.feature.helpcenter.ui.models.ScreenState) collectAsStateWithLifecycle2.getValue();
                z5 = i5 != 32 ? z ? 1 : 0 : false;
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.$r8$lambda$TayPbPjDqXLY44QswL__eDuQLSk(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
                z6 = z;
                if (i5 != 32) {
                    z6 = false;
                }
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!z6 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.m14817$r8$lambda$U3U2i4i2_GyZHVczIIT2ucIU5M(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                ArticleFullScreenContent(screenState, screenState2, appNavigator, null, function1, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, (i4 << 3) & 896, 8);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                articleFullScreenViewModel2 = articleFullScreenViewModel3;
            }
            z = true;
            i4 = i7;
            articleFullScreenViewModel3 = articleFullScreenViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            changedInstance = startRestartGroup.changedInstance(articleFullScreenViewModel3);
            int i82 = i4 & 14;
            if (i82 != 4) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z2)) {
            }
            rememberedValue = new com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$ArticleFullScreen$1$1(articleFullScreenViewModel3, str, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i82);
            androidx.compose.runtime.State collectAsStateWithLifecycle3 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(articleFullScreenViewModel3.getScreenState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.compose.runtime.State collectAsStateWithLifecycle22 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(articleFullScreenViewModel3.getRecommendedArticlesState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, z ? 1 : 0, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            i5 = i4 & 112;
            if (i5 != 32) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.$r8$lambda$KOj1SgbBH7waW8_lE_2lccqxHvs(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            if (i5 != 32) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.m14815$r8$lambda$4ejib6jR1D797CZI5HQVz4a1Z0(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            com.paypal.oslo.feature.helpcenter.ui.components.HelpCenterTopBarKt.HelpCenterTopBar(function02, null, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 2);
            com.paypal.oslo.feature.helpcenter.ui.models.ScreenState screenState3 = (com.paypal.oslo.feature.helpcenter.ui.models.ScreenState) collectAsStateWithLifecycle3.getValue();
            com.paypal.oslo.feature.helpcenter.ui.models.ScreenState screenState22 = (com.paypal.oslo.feature.helpcenter.ui.models.ScreenState) collectAsStateWithLifecycle22.getValue();
            if (i5 != 32) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z5) {
            }
            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.$r8$lambda$TayPbPjDqXLY44QswL__eDuQLSk(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
            z6 = z;
            if (i5 != 32) {
            }
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!z6) {
            }
            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.m14817$r8$lambda$U3U2i4i2_GyZHVczIIT2ucIU5M(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            ArticleFullScreenContent(screenState3, screenState22, appNavigator, null, function12, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, (i4 << 3) & 896, 8);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            articleFullScreenViewModel2 = articleFullScreenViewModel3;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.$r8$lambda$wctRl7n9Zf5Kc93UQTCVjKUolqQ(str, appNavigator, articleFullScreenViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ArticleFullScreenContent(final com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<com.paypal.oslo.feature.helpcenter.domain.models.Article> screenState, final com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<? extends java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData>> screenState2, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        androidx.compose.ui.Modifier modifier4;
        java.lang.Object obj;
        int i5;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenState2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1766654770);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(screenState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(screenState2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
            }
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1766654770, i3, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenContent (ArticleFullScreen.kt:114)");
                }
                if (screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading) {
                    startRestartGroup.startReplaceGroup(-116611308);
                    androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
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
                    modifier4 = companion;
                    composer2 = startRestartGroup;
                } else {
                    boolean z = screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success;
                    if (!z && !(screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure)) {
                        startRestartGroup.startReplaceGroup(1243164655);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-116218104);
                    androidx.compose.ui.Modifier background2 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
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
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing64(), 7, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.oslo.feature.helpcenter.ui.components.HelpCenterSearchBarKt.HelpCenterDecoySearchBar(appNavigator, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, (i3 >> 6) & 14, 0);
                    if (z) {
                        startRestartGroup.startReplaceGroup(1110551039);
                        int i8 = i3 >> 3;
                        com.paypal.oslo.feature.helpcenter.ui.components.ArticleSectionKt.ArticleSection((com.paypal.oslo.feature.helpcenter.domain.models.Article) ((com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success) screenState).getData(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), false, function1, null, startRestartGroup, (i8 & 7168) | 48, 20);
                        i5 = 1;
                        i4 = i3;
                        modifier4 = companion;
                        i6 = 2;
                        composer2 = startRestartGroup;
                        obj = null;
                        com.paypal.oslo.feature.helpcenter.ui.components.RecommendedArticlesSectionKt.RecommendedArticlesSection(screenState2, function12, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0, startRestartGroup, ((i3 >> 12) & 112) | (i8 & 14) | 384, 8);
                        composer2.endReplaceGroup();
                    } else {
                        i4 = i3;
                        modifier4 = companion;
                        composer2 = startRestartGroup;
                        obj = null;
                        i5 = 1;
                        i6 = 2;
                        if (screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure) {
                            composer2.startReplaceGroup(1111157306);
                            int i9 = com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure) screenState).getErrorType().ordinal()];
                            if (i9 == 1) {
                                composer2.startReplaceGroup(35846233);
                                com.paypal.oslo.feature.helpcenter.ui.components.ErrorComponentsKt.ContentNotFoundComponent(null, composer2, 0, 1);
                                composer2.endReplaceGroup();
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            } else if (i9 == 2 || i9 == 3) {
                                composer2.startReplaceGroup(35849462);
                                com.paypal.oslo.feature.helpcenter.ui.components.ErrorComponentsKt.NetworkErrorComponent(null, composer2, 0, 1);
                                composer2.endReplaceGroup();
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            } else {
                                composer2.startReplaceGroup(35843784);
                                composer2.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1111403043);
                            composer2.endReplaceGroup();
                        }
                    }
                    com.paypal.oslo.feature.helpcenter.ui.components.HelpOptionsSectionKt.MoreWaysToGetHelpSection(com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiDataKt.getStandardHelpOptions(), appNavigator, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i5, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, i6, obj), composer2, (i4 >> 3) & 112, 0);
                    composer2.endNode();
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.$r8$lambda$0UOanoZXSu3OyNCXX2a7DmUqNYo(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.this, screenState2, appNavigator, modifier3, function1, function12, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-4ejib6jR1D797CZI5HQVz4a1Z0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14815$r8$lambda$4ejib6jR1D797CZI5HQVz4a1Z0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.$r8$lambda$FVfsi8pUmyL448TTK6xRiJxR0r8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0UOanoZXSu3OyNCXX2a7DmUqNYo(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState screenState, com.paypal.oslo.feature.helpcenter.ui.models.ScreenState screenState2, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ArticleFullScreenContent(screenState, screenState2, appNavigator, modifier, function1, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FVfsi8pUmyL448TTK6xRiJxR0r8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterDestination.class));
        navigationScope.push(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterHome.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$G0Inu-j4qIfiqAsF8DlVH9eXgKQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14816$r8$lambda$G0Inuj4qIfiqAsF8DlVH9eXgKQ(com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData recommendedArticleUiData, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleFullScreenDestination(recommendedArticleUiData.getId()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KOj1SgbBH7waW8_lE_2lccqxHvs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.$r8$lambda$bG3E4TemB3XxIASZfevK6ofrvAs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TayPbPjDqXLY44QswL__eDuQLSk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.m14818$r8$lambda$h7V5oOlW6RmkKQQVo7SCAg0wFI(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$U3U2i4-i2_GyZHVczIIT2ucIU5M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14817$r8$lambda$U3U2i4i2_GyZHVczIIT2ucIU5M(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData recommendedArticleUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedArticleUiData, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.m14816$r8$lambda$G0Inuj4qIfiqAsF8DlVH9eXgKQ(com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bG3E4TemB3XxIASZfevK6ofrvAs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h-7V5oOlW6RmkKQQVo7SCAg0wFI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14818$r8$lambda$h7V5oOlW6RmkKQQVo7SCAg0wFI(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterVideoPlayerDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wctRl7n9Zf5Kc93UQTCVjKUolqQ(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel articleFullScreenViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ArticleFullScreen(str, appNavigator, articleFullScreenViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.NOT_FOUND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.NETWORK_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.GENERIC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
