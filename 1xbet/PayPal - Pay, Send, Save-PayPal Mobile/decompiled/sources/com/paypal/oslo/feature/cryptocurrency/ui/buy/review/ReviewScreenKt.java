package com.paypal.oslo.feature.cryptocurrency.ui.buy.review;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a3\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000f\u001a)\u0010\u0010\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u0011\u001a)\u0010\u0012\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000¨\u0006 ²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"ReviewScreen", "", "viewModel", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/ReviewViewModel;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/ReviewViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ReviewScreenContent", "uiState", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ReviewScreenAccordion", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "BottomDockedButton", "PreviewPayPalBalanceLabel", "", "PreviewCardDetailsText", "PreviewBankAccountLabel", "PreviewChaseBankText", "PreviewAvailableBalance", "PreviewExchangeRate", "ReviewScreenContentRecurringOptionsPreview", "(Landroidx/compose/runtime/Composer;I)V", "ReviewScreenContentPaymentMethodPreview", "ReviewScreenContentFinalReviewPreview", "ReviewScreenContentCollapsedPreview", "ReviewScreenContentLoadingPreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReviewScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewScreen(final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        kotlin.coroutines.Continuation continuation;
        androidx.compose.runtime.Composer composer3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(500181064);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(reviewViewModel) ? 4 : 2) | i;
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
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(500181064, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreen (ReviewScreen.kt:90)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                boolean changedInstance = startRestartGroup.changedInstance(reviewViewModel);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$ReviewScreen$1$1(reviewViewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$ReviewScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m13768invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m13768invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                int i6 = i3 & 112;
                boolean z = i6 == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$ReviewScreen$2$1(appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue3;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$ReviewScreen$$inlined$NavResultEffect-rtGRyWw$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m13769invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m13769invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance2 = startRestartGroup.changedInstance(reviewViewModel);
                boolean z2 = i6 == 32;
                boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
                boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId2);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (((changed | z2 | changedInstance2) || changed2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i4 = i3;
                    continuation = null;
                    composer3 = startRestartGroup;
                    rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$ReviewScreen$3$1(reviewViewModel, appNavigator, rememberNavResultRequestId, rememberNavResultRequestId2, null);
                    composer3.updateRememberedValue(rememberedValue5);
                } else {
                    i4 = i3;
                    composer3 = startRestartGroup;
                    continuation = null;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, composer3, 6);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean changedInstance3 = composer3.changedInstance(reviewViewModel);
                java.lang.Object rememberedValue6 = composer3.rememberedValue();
                if (changedInstance3 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$ReviewScreen$4$1(reviewViewModel, continuation);
                    composer3.updateRememberedValue(rememberedValue6);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, composer3, 6);
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                boolean changedInstance4 = composer3.changedInstance(reviewViewModel);
                java.lang.Object rememberedValue7 = composer3.rememberedValue();
                if (changedInstance4 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.m13758$r8$lambda$FUKnXkQF9pUsfD6ktFRIF0ExiU(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue7);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(unit3, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue7, composer3, 6);
                com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState = (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) collectAsStateWithLifecycle.getValue();
                boolean changedInstance5 = composer3.changedInstance(reviewViewModel);
                java.lang.Object rememberedValue8 = composer3.rememberedValue();
                if (changedInstance5 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$ReviewScreen$6$1$1(reviewViewModel);
                    composer3.updateRememberedValue(rememberedValue8);
                }
                composer2 = composer3;
                ReviewScreenContent(reviewUiState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue8), modifier4, composer3, i4 & 896, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$fmS4_4HuB7FJRgE5JR9z10Twu14(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel.this, appNavigator, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewScreenContent(final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String stringResource;
        int i5;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1918085811);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(reviewUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1918085811, i4, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenContent (ReviewScreen.kt:193)");
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
                java.lang.String titleAssetDisplayName = reviewUiState.getTitleAssetDisplayName();
                if (kotlin.text.StringsKt.isBlank(titleAssetDisplayName)) {
                    titleAssetDisplayName = null;
                }
                if (titleAssetDisplayName != null) {
                    startRestartGroup.startReplaceGroup(473863344);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_buy_title_asset_display_name, new java.lang.Object[]{titleAssetDisplayName}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(473863343);
                    startRestartGroup.endReplaceGroup();
                    stringResource = null;
                }
                java.lang.String str = stringResource == null ? "" : stringResource;
                int i8 = i4 & 112;
                boolean z = i8 == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$wKmtuxZoZepZPuR3mzwH6Prnbr4(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.navigation.ui.NavigationBarKt.NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig(str, new com.paypal.oslo.core.navigation.ui.NavigationBarButton((kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_back_button, startRestartGroup, 0)), null, 4, null), null, startRestartGroup, com.paypal.oslo.core.navigation.ui.NavigationBarConfig.$stable, 2);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                if ((reviewUiState.isLoading() && reviewUiState.getCurrentStep() == com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.FINAL_REVIEW) || reviewUiState.getCurrentStep() == com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.COMPLETED) {
                    startRestartGroup.startReplaceGroup(968680407);
                    com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), "review_screen_loader"), com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 12);
                    startRestartGroup.endReplaceGroup();
                    i5 = i4;
                } else {
                    startRestartGroup.startReplaceGroup(969011146);
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
                    com.paypal.pds.components.DividerKt.Divider(null, startRestartGroup, 0, 1);
                    java.lang.String amount = reviewUiState.getAmount();
                    java.lang.String cryptoAmount = reviewUiState.getCryptoAmount();
                    java.lang.String currencyCode = reviewUiState.getCurrencyCode();
                    java.lang.String assetLogoUrl = reviewUiState.getAssetLogoUrl();
                    boolean z2 = i8 == 32;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda23
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$eGpBzC84tKWspgK_EizVPz2Pesg(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    i5 = i4;
                    com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.AmountSummaryKt.AmountSummary(amount, cryptoAmount, currencyCode, assetLogoUrl, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 0, 32);
                    com.paypal.pds.components.DividerKt.Divider(null, startRestartGroup, 0, 1);
                    getHighSpeedVideoSizes(reviewUiState, function1, startRestartGroup, i5 & 126);
                    if (reviewUiState.getCurrentStep() == com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.FINAL_REVIEW) {
                        startRestartGroup.startReplaceGroup(-473137311);
                        if (reviewUiState.getShowPyusdRewardsToggle()) {
                            startRestartGroup.startReplaceGroup(-473039568);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                            java.lang.String pyusdRewardsFormattedRate = reviewUiState.getPyusdRewardsFormattedRate();
                            boolean pyusdRewardsOptIn = reviewUiState.getPyusdRewardsOptIn();
                            boolean z3 = i8 == 32;
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda24
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.m13760$r8$lambda$LhvRReYaodyPtm4BOF7b0kaGM(kotlin.jvm.functions.Function1.this, ((java.lang.Boolean) obj).booleanValue());
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsToggleCardKt.CryptoPYUSDRewardsToggleCard(pyusdRewardsFormattedRate, pyusdRewardsOptIn, false, (kotlin.jvm.functions.Function1) rememberedValue3, null, startRestartGroup, 384, 16);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-472431255);
                            startRestartGroup.endReplaceGroup();
                        }
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                        i6 = 0;
                        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.ReviewTotalKt.ReviewTotal(reviewUiState.getAmount(), reviewUiState.getCurrencyCode(), reviewUiState.getCryptoAmount(), reviewUiState.getExchangeRate(), reviewUiState.getTransactionFee(), reviewUiState.getTotalAmount(), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32(), 0.0f, 2, null), startRestartGroup, 0, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        i6 = 0;
                        startRestartGroup.startReplaceGroup(-471776535);
                        startRestartGroup.endReplaceGroup();
                    }
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), startRestartGroup, i6);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                Camera2StreamConfigurationMap(reviewUiState, function1, startRestartGroup, i5 & 126);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$INiYhQPyKCwJ7xw2KwoSY6i5SaY(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState.this, function1, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1232573537);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(reviewUiState) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-1232573537, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenAccordion (ReviewScreen.kt:307)");
            }
            java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem> accordionItems = reviewUiState.getAccordionItems();
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$6Ez_7GnazbSUjIeu5uTzbUATTV4((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem) obj));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean z = (i2 & 112) == 32;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.m13766$r8$lambda$qjs1CDJcZHEaf84pLEqlDT6NQ(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem) obj, ((java.lang.Integer) obj2).intValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.AccordionKt.Accordion(accordionItems, function12, fillMaxWidth$default, (kotlin.jvm.functions.Function2) rememberedValue2, true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(173963701, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function4
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.m13757$r8$lambda$FQE5f_VjASYt_env3OXgNGAY(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState.this, (com.paypal.pds.components.AccordionHeaderScope) obj, (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-46328309, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function4
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$yNQrzaFeWxGM3iHc9y5eR0KeemI(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState.this, function1, (com.paypal.pds.components.AccordionBodyScope) obj, (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, startRestartGroup, 54), null, startRestartGroup, 1794480, 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$ePncx2XmVCaI7rvtPLXmCQ8XWGA(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1685344824);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(reviewUiState) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(1685344824, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.BottomDockedButton (ReviewScreen.kt:374)");
            }
            if (reviewUiState.getCurrentStep() == com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.FINAL_REVIEW && !reviewUiState.isLoading()) {
                startRestartGroup.startReplaceGroup(-59849137);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_buy_now_button, new java.lang.Object[]{reviewUiState.getAssetSymbol()}, startRestartGroup, 0);
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), "buy_review_cta_button");
                boolean z = (i2 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$rZeBXd2qLNPNEQFiI1A8QyMeN6k(kotlin.jvm.functions.Function1.this);
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
                composer2.startReplaceGroup(-59478966);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$O_5HQHuV6ux_NOsKJiTB7qUnUnI(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2Ue8Q7WLIr4xDJAzPRkgKMcZJpc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(268047640);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(268047640, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenContentFinalReviewPreview (ReviewScreen.kt:484)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState("BTC", "Bitcoin", "", "1,000.00", "USD", "0.02456789", "1 BTC = $40,734.28", "$25.00", "$1,025.00", null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem[]{new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.RECURRING_OPTIONS, false), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.PAYMENT_METHOD, false)}), com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.FINAL_REVIEW, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.EVERY_MONTH, new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("pm1", "abc123", "PayPal Balance", "••••1234", null, "$2,500.00", 16, null), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("pm1", "abc123", "PayPal Balance", "••••1234", null, "$2,500.00", 16, null)), false, false, false, null, 492032, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.m13765$r8$lambda$lQyN0mFQn_wM7s6xEQ1zfxJlqU((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ReviewScreenContent(reviewUiState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$2Ue8Q7WLIr4xDJAzPRkgKMcZJpc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5L_X_ujzQNULRJVE0lbJQPohHDU(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RecurringContinueClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$6Ez_7GnazbSUjIeu5uTzbUATTV4(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem accordionItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionItem, "");
        return accordionItem.isExpanded();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6IuytNEe8WWesiknzC9xDSbtlts(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.AddPaymentMethodClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FEn14uZRFRjQtw96y1N8YfmI3C4(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringOption, "");
        function1.invoke(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RecurringOptionSelected(recurringOption));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FQE5f_V-jAS-Yt-_env3OXgNGAY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13757$r8$lambda$FQE5f_VjASYt_env3OXgNGAY(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState, com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem accordionItem, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionItem, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(173963701, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenAccordion.<anonymous> (ReviewScreen.kt:317)");
        }
        int i2 = com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.WhenMappings.$EnumSwitchMapping$0[accordionItem.getStep().ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-1472815105);
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringSummaryKt.RecurringSummary(reviewUiState.getSelectedRecurringOption(), accordionItem.isExpanded(), null, composer, 0, 4);
            composer.endReplaceGroup();
        } else if (i2 != 2) {
            composer.startReplaceGroup(-1472330761);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1472564842);
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSummaryKt.PaymentMethodSummary(reviewUiState.getSelectedPaymentMethod(), accordionItem.isExpanded(), null, composer, 0, 4);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FUKnXkQF9pUs-fD6ktFRIF0ExiU, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m13758$r8$lambda$FUKnXkQF9pUsfD6ktFRIF0ExiU(final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$ReviewScreen$lambda$5$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel.this.stopQuotePolling$cryptocurrency_prodRelease();
            }
        };
    }

    /* renamed from: $r8$lambda$I8cvQoobg958m1qmEPOvWGUx-e8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13759$r8$lambda$I8cvQoobg958m1qmEPOvWGUxe8(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
        function1.invoke(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PaymentMethodSelected(paymentMethod));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$INiYhQPyKCwJ7xw2KwoSY6i5SaY(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ReviewScreenContent(reviewUiState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LhvRRe-Y-aodyPtm4BOF7b0kaGM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13760$r8$lambda$LhvRReYaodyPtm4BOF7b0kaGM(kotlin.jvm.functions.Function1 function1, boolean z) {
        function1.invoke(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PyusdRewardsToggleChange(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Me4YlBso8yrs9AHCPt2Kw4iNZbY(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent reviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O_5HQHuV6ux_NOsKJiTB7qUnUnI(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(reviewUiState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$R4jMG6CNo_vQE5XB_F6Bh-TI5TY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13761$r8$lambda$R4jMG6CNo_vQE5XB_F6BhTI5TY(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent reviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RRuMIt_ZZr2LJ8WaFtC8SJ4_ZRY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1448350474);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1448350474, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenContentLoadingPreview (ReviewScreen.kt:570)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState("BTC", "Bitcoin", "", "1,000.00", "USD", "0.02456789", "1 BTC = $40,734.28", "$25.00", "$1,025.00", null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem[]{new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.RECURRING_OPTIONS, false), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.PAYMENT_METHOD, false)}), com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.FINAL_REVIEW, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.EVERY_MONTH, new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("pm1", "abc123", "PayPal Balance", "••••1234", null, "$2,500.00", 16, null), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("pm1", "abc123", "PayPal Balance", "••••1234", null, "$2,500.00", 16, null)), true, false, false, null, 459264, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.m13761$r8$lambda$R4jMG6CNo_vQE5XB_F6BhTI5TY((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ReviewScreenContent(reviewUiState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$RRuMIt_ZZr2LJ8WaFtC8SJ4_ZRY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SPKfk5eBNhMTGE4rDNj-EcGrOTs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13762$r8$lambda$SPKfk5eBNhMTGE4rDNjEcGrOTs(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent reviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TQej-XvSvVLVRqqreokZ988Nj5s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13763$r8$lambda$TQejXvSvVLVRqqreokZ988Nj5s(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1812629089);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1812629089, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenContentPaymentMethodPreview (ReviewScreen.kt:428)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState("ETH", "Ethereum", "", "250.00", "USD", "0.12345678", "1 ETH = $2,025.50", "$5.00", "$255.00", null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem[]{new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.RECURRING_OPTIONS, false), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.PAYMENT_METHOD, true)}), com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.PAYMENT_METHOD, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.EVERY_WEEK, new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("pm1", "abc123", "PayPal Balance", "••••1234", null, "$500.00", 16, null), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod[]{new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("pm1", "abc123", "PayPal Balance", "••••1234", null, "$500.00", 16, null), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("pm2", "abc123", "Bank Account", "Chase ••••5678", null, null, 48, null), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("pm3", "abc123", "Debit Card", "Visa ••••9012", null, null, 48, null)}), false, false, false, null, 492032, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$zT9W4l1eyhzaMbPisUrNYB_u6pE((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ReviewScreenContent(reviewUiState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.m13763$r8$lambda$TQejXvSvVLVRqqreokZ988Nj5s(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eGpBzC84tKWspgK_EizVPz2Pesg(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BuyAmountClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eI0-o_EcDMy0B-CwNNya5hrQW94, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13764$r8$lambda$eI0o_EcDMy0BCwNNya5hrQW94(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(102656567);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(102656567, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenContentRecurringOptionsPreview (ReviewScreen.kt:398)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState("BTC", "Bitcoin", "", "100.00", "USD", "0.00245678", "1 BTC = $40,734.28", "$2.50", "$102.50", null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem[]{new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.RECURRING_OPTIONS, true), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.PAYMENT_METHOD, false)}), com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.RECURRING_OPTIONS, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.ONE_TIME, null, kotlin.collections.CollectionsKt.emptyList(), false, false, false, null, 492032, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$Me4YlBso8yrs9AHCPt2Kw4iNZbY((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ReviewScreenContent(reviewUiState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.m13764$r8$lambda$eI0o_EcDMy0BCwNNya5hrQW94(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ePncx2XmVCaI7rvtPLXmCQ8XWGA(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(reviewUiState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fmS4_4HuB7FJRgE5JR9z10Twu14(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ReviewScreen(reviewViewModel, appNavigator, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lQyN0mFQn_wM7s6xEQ1zf-xJlqU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13765$r8$lambda$lQyN0mFQn_wM7s6xEQ1zfxJlqU(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent reviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qjs1CDJ-cZHEaf-84pLEqlDT6NQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13766$r8$lambda$qjs1CDJcZHEaf84pLEqlDT6NQ(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem accordionItem, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionItem, "");
        function1.invoke(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.AccordionToggled(accordionItem.getStep()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rZeBXd2qLNPNEQFiI1A8QyMeN6k(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BuyNowClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wKmtuxZoZepZPuR3mzwH6Prnbr4(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BackClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wZvIBdMS07hu7xExI-VUckS8_UE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13767$r8$lambda$wZvIBdMS07hu7xExIVUckS8_UE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-80411825);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-80411825, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenContentCollapsedPreview (ReviewScreen.kt:528)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState("LTC", "Litecoin", "", "50.00", "USD", "0.75123456", "1 LTC = $66.55", "$1.25", "$51.25", null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem[]{new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.RECURRING_OPTIONS, false), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.PAYMENT_METHOD, false)}), com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.FINAL_REVIEW, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.ONE_TIME, new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("pm2", "abc123", "Bank Account", "Chase ••••5678", null, null, 48, null), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("pm2", "abc123", "Bank Account", "Chase ••••5678", null, null, 48, null)), false, false, false, null, 492032, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.m13762$r8$lambda$SPKfk5eBNhMTGE4rDNjEcGrOTs((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ReviewScreenContent(reviewUiState, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.m13767$r8$lambda$wZvIBdMS07hu7xExIVUckS8_UE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yNQrzaFeWxGM3iHc9y5eR0KeemI(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState reviewUiState, final kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.AccordionBodyScope accordionBodyScope, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.AccordionItem accordionItem, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionItem, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-46328309, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenAccordion.<anonymous> (ReviewScreen.kt:336)");
        }
        int i2 = com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.WhenMappings.$EnumSwitchMapping$0[accordionItem.getStep().ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-1482048698);
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption selectedRecurringOption = reviewUiState.getSelectedRecurringOption();
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$FEn14uZRFRjQtw96y1N8YfmI3C4(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changed2 = composer.changed(function1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$5L_X_ujzQNULRJVE0lbJQPohHDU(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.RecurringOptionsSelectionKt.RecurringOptionsSelection(selectedRecurringOption, function12, (kotlin.jvm.functions.Function0) rememberedValue2, null, composer, 0, 8);
            composer.endReplaceGroup();
        } else if (i2 != 2) {
            composer.startReplaceGroup(-1480902845);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1481536640);
            java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod> availablePaymentMethods = reviewUiState.getAvailablePaymentMethods();
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod selectedPaymentMethod = reviewUiState.getSelectedPaymentMethod();
            boolean changed3 = composer.changed(function1);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.m13759$r8$lambda$I8cvQoobg958m1qmEPOvWGUxe8(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue3;
            boolean changed4 = composer.changed(function1);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.$r8$lambda$6IuytNEe8WWesiknzC9xDSbtlts(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.PaymentMethodSelection(availablePaymentMethods, selectedPaymentMethod, function13, (kotlin.jvm.functions.Function0) rememberedValue4, reviewUiState.isLoading(), null, composer, 0, 32);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zT9W4l1eyhzaMbPisUrNYB_u6pE(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent reviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.RECURRING_OPTIONS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.PAYMENT_METHOD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
