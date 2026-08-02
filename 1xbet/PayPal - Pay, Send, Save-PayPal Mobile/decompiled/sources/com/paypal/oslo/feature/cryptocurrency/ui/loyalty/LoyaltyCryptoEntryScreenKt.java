package com.paypal.oslo.feature.cryptocurrency.ui.loyalty;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"LoyaltyCryptoEntryScreen", "", "viewModel", "Lcom/paypal/oslo/feature/cryptocurrency/ui/loyalty/LoyaltyCryptoEntryViewModel;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/loyalty/LoyaltyCryptoEntryViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V", "cryptocurrency_prodRelease", "uiState", "Lcom/paypal/oslo/feature/cryptocurrency/ui/loyalty/model/LoyaltyCryptoEntryUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltyCryptoEntryScreenKt {
    public static final void LoyaltyCryptoEntryScreen(final com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loyaltyCryptoEntryViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-438092042);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(loyaltyCryptoEntryViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        int i3 = i2;
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-438092042, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreen (LoyaltyCryptoEntryScreen.kt:46)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(loyaltyCryptoEntryViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1(appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m13960invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m13960invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(loyaltyCryptoEntryViewModel);
            boolean z2 = i4 == 32;
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changedInstance | z2 | changed) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1(loyaltyCryptoEntryViewModel, appNavigator, rememberNavResultRequestId, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
            int i5 = com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState) collectAsStateWithLifecycle.getValue()).ordinal()];
            if (i5 == 1) {
                startRestartGroup.startReplaceGroup(1207408249);
                boolean changedInstance2 = startRestartGroup.changedInstance(loyaltyCryptoEntryViewModel);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt.m13959$r8$lambda$fyvuHFYiE3MOOKgu2hLs23MbhM(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
                boolean changedInstance3 = startRestartGroup.changedInstance(loyaltyCryptoEntryViewModel);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt.m13957$r8$lambda$MZ4a9OKek7PYvWKuF3bNosRxLo(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt.m13958$r8$lambda$RMDqbsK1rOSS1Wk3PA1IMrc((java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                com.paypal.oslo.feature.cryptocurrency.ui.error.CryptoErrorScreenKt.CryptoErrorContent(null, null, null, function0, function02, (kotlin.jvm.functions.Function1) rememberedValue6, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 7);
                startRestartGroup.endReplaceGroup();
            } else {
                if (i5 != 2) {
                    startRestartGroup.startReplaceGroup(-99600301);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(1207662418);
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
                com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt.$r8$lambda$LdL2d6SUNzKcCQkpzgEadCw6pBI(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel.this, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LdL2d6SUNzKcCQkpzgEadCw6pBI(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        LoyaltyCryptoEntryScreen(loyaltyCryptoEntryViewModel, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MZ4a9OKek7PYvWKuF-3bNosRxLo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13957$r8$lambda$MZ4a9OKek7PYvWKuF3bNosRxLo(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel) {
        loyaltyCryptoEntryViewModel.navigateBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RMDqbsK--1rOSS1W-k3PA1IM-rc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13958$r8$lambda$RMDqbsK1rOSS1Wk3PA1IMrc(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$f-yvuHFYiE3MOOKgu2hLs23MbhM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13959$r8$lambda$fyvuHFYiE3MOOKgu2hLs23MbhM(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel) {
        loyaltyCryptoEntryViewModel.navigateBack();
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState.ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState.LOADING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
