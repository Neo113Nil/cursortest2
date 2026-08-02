package com.paypal.oslo.feature.cryptocurrency.ui.sell.review;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a3\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000f\u001a)\u0010\u0010\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0003¢\u0006\u0002\u0010\u0015\u001a)\u0010\u0016\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u0017\u001a\u00020\u0018X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0018X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0018X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0018X\u0082T¢\u0006\u0002\n\u0000¨\u0006\"²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"CryptoSellReviewScreen", "", "viewModel", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/CryptoSellReviewViewModel;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/CryptoSellReviewViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoSellReviewScreenContent", "uiState", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SellPaymentAccordion", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "BalanceOnlyDisplay", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;Landroidx/compose/runtime/Composer;I)V", "BottomDockedButton", "PreviewBalanceDetails", "", "PreviewPyusdDetails", "PreviewExchangeRate", "PreviewAmount", "CryptoSellReviewScreenContentBalanceOnlyPreview", "(Landroidx/compose/runtime/Composer;I)V", "CryptoSellReviewScreenContentAccordionCollapsedPreview", "CryptoSellReviewScreenContentAccordionExpandedPreview", "CryptoSellReviewScreenContentLoadingPreview", "CryptoSellReviewScreenContentPyusdSelectedPreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSellReviewScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoSellReviewScreen(final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellReviewViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(803814707);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(cryptoSellReviewViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
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
                modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(803814707, i4, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreen (CryptoSellReviewScreen.kt:81)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(cryptoSellReviewViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                int i6 = i4 & 112;
                boolean z = i6 == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$1$1(appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m14065invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m14065invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(cryptoSellReviewViewModel);
                boolean z2 = i6 == 32;
                boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((changedInstance | z2 | changed) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1(cryptoSellReviewViewModel, appNavigator, rememberNavResultRequestId, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean changedInstance2 = startRestartGroup.changedInstance(cryptoSellReviewViewModel);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$3$1(cryptoSellReviewViewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                boolean changedInstance3 = startRestartGroup.changedInstance(cryptoSellReviewViewModel);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.$r8$lambda$Gi5d9PhsqSDakdvWMCMLeGhABl0(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(unit3, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue5, startRestartGroup, 6);
                com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState = (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState) collectAsStateWithLifecycle.getValue();
                boolean changedInstance4 = startRestartGroup.changedInstance(cryptoSellReviewViewModel);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$5$1$1(cryptoSellReviewViewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                CryptoSellReviewScreenContent(cryptoSellReviewUiState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue6), modifier3, startRestartGroup, i4 & 896, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.$r8$lambda$16a3RtI_NCuv7FyjvfmIuTEXfu8(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel.this, appNavigator, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x042d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoSellReviewScreenContent(final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String stringResource;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellReviewUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-773337388);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(cryptoSellReviewUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-773337388, i4, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenContent (CryptoSellReviewScreen.kt:152)");
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                java.lang.String titleAssetDisplayName = cryptoSellReviewUiState.getTitleAssetDisplayName();
                if (kotlin.text.StringsKt.isBlank(titleAssetDisplayName)) {
                    titleAssetDisplayName = null;
                }
                if (titleAssetDisplayName != null) {
                    startRestartGroup.startReplaceGroup(-490676233);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_title_asset_display_name, new java.lang.Object[]{titleAssetDisplayName}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-490676234);
                    startRestartGroup.endReplaceGroup();
                    stringResource = null;
                }
                java.lang.String str = stringResource == null ? "" : stringResource;
                boolean z = (i4 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.$r8$lambda$TVF9XLh3wHJfPXeGVVJarCLds5M(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.navigation.ui.NavigationBarKt.NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig(str, new com.paypal.oslo.core.navigation.ui.NavigationBarButton((kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_back_button, startRestartGroup, 0)), null, 4, null), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "sell_review_title"), startRestartGroup, com.paypal.oslo.core.navigation.ui.NavigationBarConfig.$stable | 48, 0);
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                if (cryptoSellReviewUiState.shouldShowLoadingOverlay()) {
                    startRestartGroup.startReplaceGroup(-1452488209);
                    com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), "sell_review_screen_loader"), com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 12);
                    startRestartGroup.endReplaceGroup();
                    i5 = i4;
                } else {
                    startRestartGroup.startReplaceGroup(-1452168351);
                    androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor4);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellAmountSummaryKt.CryptoSellAmountSummary(cryptoSellReviewUiState.getAmount(), cryptoSellReviewUiState.getCryptoAmount(), cryptoSellReviewUiState.getAssetLogoUrl(), null, startRestartGroup, 0, 8);
                    if (cryptoSellReviewUiState.getShowPaymentAccordion()) {
                        startRestartGroup.startReplaceGroup(-1959943126);
                        getHighSpeedVideoFpsRanges(cryptoSellReviewUiState, function1, startRestartGroup, i4 & 126);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1959729505);
                        getHighSpeedVideoFpsRanges(cryptoSellReviewUiState.getSelectedPaymentOption(), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (cryptoSellReviewUiState.getCurrentStep() == com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.FINAL_REVIEW && !cryptoSellReviewUiState.isPaymentAccordionExpanded()) {
                        startRestartGroup.startReplaceGroup(-1959217509);
                        i5 = i4;
                        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellReviewTotalKt.CryptoSellReviewTotal(cryptoSellReviewUiState.getAmount(), cryptoSellReviewUiState.getCurrencyCode(), cryptoSellReviewUiState.getCryptoAmount(), cryptoSellReviewUiState.getExchangeRate(), cryptoSellReviewUiState.getTransactionFee(), cryptoSellReviewUiState.getTotalAmount(), null, startRestartGroup, 0, 64);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        i5 = i4;
                        startRestartGroup.startReplaceGroup(-1958726438);
                        startRestartGroup.endReplaceGroup();
                    }
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), startRestartGroup, 0);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                Camera2StreamConfigurationMap(cryptoSellReviewUiState, function1, startRestartGroup, i5 & 126);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.m14055$r8$lambda$0qV1JrSd00LnducH9qn97ASSCQ(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState.this, function1, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(471772629);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(cryptoSellReviewUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(471772629, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.SellPaymentAccordion (CryptoSellReviewScreen.kt:253)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.$r8$lambda$z4nEZy4zGz_SRSuiuA4GA96H3QA(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(fillMaxWidth$default, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 31), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryKt.CryptoSellPaymentOptionSummary(cryptoSellReviewUiState.getSelectedPaymentOption(), cryptoSellReviewUiState.isPaymentAccordionExpanded(), boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterStart()), startRestartGroup, 0, 0);
            com.paypal.pds.core.Icon icon = cryptoSellReviewUiState.isPaymentAccordionExpanded() ? com.paypal.pds.core.Icon.ChevronUp.INSTANCE : com.paypal.pds.core.Icon.ChevronDown.INSTANCE;
            com.paypal.pds.components.IconKt.Icon(icon, null, boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterEnd()), com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentFaint.INSTANCE, startRestartGroup, 27696, 0);
            startRestartGroup.endNode();
            if (cryptoSellReviewUiState.isPaymentAccordionExpanded()) {
                startRestartGroup.startReplaceGroup(-2075559577);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), startRestartGroup, 0);
                java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption> availablePaymentOptions = cryptoSellReviewUiState.getAvailablePaymentOptions();
                com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption selectedPaymentOption = cryptoSellReviewUiState.getSelectedPaymentOption();
                boolean z2 = i3 == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.m14056$r8$lambda$6xBRptZly23bTLJHUBs1i7FBAQ(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt.CryptoSellPaymentOptionSelection(availablePaymentOptions, selectedPaymentOption, (kotlin.jvm.functions.Function1) rememberedValue2, null, startRestartGroup, 0, 8);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-2075163645);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.m14061$r8$lambda$Ub9olu2LFvq1YYHQvNlRYA0Vk0(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1873251996);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(cryptoSellPaymentOption) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1873251996, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.BalanceOnlyDisplay (CryptoSellReviewScreen.kt:297)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSummaryKt.CryptoSellPaymentOptionSummary(cryptoSellPaymentOption, false, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), startRestartGroup, (i2 & 14) | 48, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.$r8$lambda$GDCmJ1DfhA63vvhnN0iPhAkBzlM(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1330087504);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(cryptoSellReviewUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1330087504, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.BottomDockedButton (CryptoSellReviewScreen.kt:311)");
            }
            if (cryptoSellReviewUiState.getCurrentStep() == com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.FINAL_REVIEW && !cryptoSellReviewUiState.isLoading() && !cryptoSellReviewUiState.isPaymentAccordionExpanded()) {
                startRestartGroup.startReplaceGroup(731720420);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_now_button, new java.lang.Object[]{cryptoSellReviewUiState.getAssetSymbol()}, startRestartGroup, 0);
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), "sell_review_cta_button");
                boolean z = (i2 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.m14064$r8$lambda$rbymV11stFAOISzTg5NJWW_VY(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.ButtonSize.Large large2 = large;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, testTag, null, null, null, large2, false, false, startRestartGroup, 1572864, 440);
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(732108850);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.$r8$lambda$iyq4DWrovY1sp2vGQ60GDsoBS1M(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-dYw4vOd_1kmdN7IL5oe-V24_b4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14054$r8$lambda$dYw4vOd_1kmdN7IL5oeV24_b4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-846111600);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-846111600, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenContentBalanceOnlyPreview (CryptoSellReviewScreen.kt:337)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState("BTC", "Bitcoin", "", "100.00", "USD", "0.00094567 BTC", "1 BTC = $105,731.23", "$2.50", "$97.50", null, false, false, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption("balance", "abc123", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.BALANCE, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_balance_display_name, "$279.41 USD available", null, 32, null)), new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption("balance", "abc123", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.BALANCE, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_balance_display_name, "$279.41 USD available", null, 32, null), com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.FINAL_REVIEW, false, 33280, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.$r8$lambda$iv76jduppsoNMiHBUPyX4yqS9Ak((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoSellReviewScreenContent(cryptoSellReviewUiState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.m14054$r8$lambda$dYw4vOd_1kmdN7IL5oeV24_b4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0qV1JrSd00LnducH9-qn97ASSCQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14055$r8$lambda$0qV1JrSd00LnducH9qn97ASSCQ(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoSellReviewScreenContent(cryptoSellReviewUiState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$16a3RtI_NCuv7FyjvfmIuTEXfu8(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoSellReviewScreen(cryptoSellReviewViewModel, appNavigator, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6xBRptZly23bT-LJHUBs1i7FBAQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14056$r8$lambda$6xBRptZly23bTLJHUBs1i7FBAQ(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellPaymentOption, "");
        function1.invoke(new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.PaymentOptionSelected(cryptoSellPaymentOption));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$A4WYNkpDL5nn-VchNzG434xn0t4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14057$r8$lambda$A4WYNkpDL5nnVchNzG434xn0t4(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent cryptoSellReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DzARh0mZAq7ZD-4k8YsJi7QGr6g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14058$r8$lambda$DzARh0mZAq7ZD4k8YsJi7QGr6g(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent cryptoSellReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GDCmJ1DfhA63vvhnN0iPhAkBzlM(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(cryptoSellPaymentOption, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$Gi5d9PhsqSDakdvWMCMLeGhABl0(final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel.this.stopQuotePolling$cryptocurrency_prodRelease();
            }
        };
    }

    /* renamed from: $r8$lambda$In47-rb4mMlt5evjwcaOmcglaZU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14059$r8$lambda$In47rb4mMlt5evjwcaOmcglaZU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1285153537);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1285153537, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenContentAccordionCollapsedPreview (CryptoSellReviewScreen.kt:378)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState("ETH", "Ethereum", "", "250.00", "USD", "0.12345678 ETH", "1 ETH = $2,025.50", "$5.00", "$245.00", null, true, false, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption[]{new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption("balance", "abc123", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.BALANCE, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_balance_display_name, "$279.41 USD available", null, 32, null), new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyusdItemFactoryKt.AccountSnapshotPyUsdId, "def456", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.PYUSD, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_pyusd_display_name, "100.00 PYUSD", null, 32, null)}), new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption("balance", "abc123", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.BALANCE, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_balance_display_name, "$279.41 USD available", null, 32, null), com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.FINAL_REVIEW, false, 33280, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.m14062$r8$lambda$asNEENSUH6PoE55LSNbDgiTOyM((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoSellReviewScreenContent(cryptoSellReviewUiState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.m14059$r8$lambda$In47rb4mMlt5evjwcaOmcglaZU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MziHMDSUfXv1OI-IGfSWyz8eHms, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14060$r8$lambda$MziHMDSUfXv1OIIGfSWyz8eHms(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2024259620);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2024259620, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenContentLoadingPreview (CryptoSellReviewScreen.kt:468)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState("BTC", "Bitcoin", "", "100.00", "USD", "", null, null, null, null, false, false, null, null, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.LOADING, true, 16320, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.m14057$r8$lambda$A4WYNkpDL5nnVchNzG434xn0t4((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoSellReviewScreenContent(cryptoSellReviewUiState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.m14060$r8$lambda$MziHMDSUfXv1OIIGfSWyz8eHms(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TVF9XLh3wHJfPXeGVVJarCLds5M(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.BackClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ub9olu2LFvq1YY-HQvNlRYA0Vk0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14061$r8$lambda$Ub9olu2LFvq1YYHQvNlRYA0Vk0(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(cryptoSellReviewUiState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$asNEENSUH6PoE55LSNbDgiTOy-M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14062$r8$lambda$asNEENSUH6PoE55LSNbDgiTOyM(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent cryptoSellReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fZ-_EmW_AGYv8hSND-AlZGlgvAA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14063$r8$lambda$fZ_EmW_AGYv8hSNDAlZGlgvAA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1841336905);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1841336905, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenContentAccordionExpandedPreview (CryptoSellReviewScreen.kt:426)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState("BTC", "Bitcoin", "", "500.00", "USD", "", "", "", "", null, true, true, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption[]{new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption("balance", "abc123", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.BALANCE, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_balance_display_name, "$279.41 USD available", null, 32, null), new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyusdItemFactoryKt.AccountSnapshotPyUsdId, "def456", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.PYUSD, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_pyusd_display_name, "100.00 PYUSD", null, 32, null)}), null, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.PAYMENT_SELECTION, false, 33280, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.$r8$lambda$q5owXBIuryDYVa12VvC_irKYhrQ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoSellReviewScreenContent(cryptoSellReviewUiState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.m14063$r8$lambda$fZ_EmW_AGYv8hSNDAlZGlgvAA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iv76jduppsoNMiHBUPyX4yqS9Ak(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent cryptoSellReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iyq4DWrovY1sp2vGQ60GDsoBS1M(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(cryptoSellReviewUiState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mwLKoWNKjbWFNzvyjSdtIrWV0r0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2138691968);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2138691968, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenContentPyusdSelectedPreview (CryptoSellReviewScreen.kt:489)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState cryptoSellReviewUiState = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewUiState("BTC", "Bitcoin", "", "100.00", "USD", "0.00094567 BTC", "1 BTC = $105,731.23", "$2.50", "97.50 PYUSD", null, true, false, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption[]{new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption("balance", "abc123", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.BALANCE, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_balance_display_name, "$279.41 USD available", null, 32, null), new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyusdItemFactoryKt.AccountSnapshotPyUsdId, "def456", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.PYUSD, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_pyusd_display_name, "100.00 PYUSD", null, 32, null)}), new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyusdItemFactoryKt.AccountSnapshotPyUsdId, "def456", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.PYUSD, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_pyusd_display_name, "100.00 PYUSD", null, 32, null), com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.FINAL_REVIEW, false, 33280, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.m14058$r8$lambda$DzARh0mZAq7ZD4k8YsJi7QGr6g((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoSellReviewScreenContent(cryptoSellReviewUiState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.$r8$lambda$mwLKoWNKjbWFNzvyjSdtIrWV0r0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q5owXBIuryDYVa12VvC_irKYhrQ(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent cryptoSellReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rbym-V11stFAOISzTg5-NJWW_VY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14064$r8$lambda$rbymV11stFAOISzTg5NJWW_VY(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.CryptoSellNowClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z4nEZy4zGz_SRSuiuA4GA96H3QA(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.PaymentAccordionToggled.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
