package com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001ap\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u0012\u0012\u0004\u0012\u00020\u00060\u0010H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/addbank/navigation/AddBankDestination;", "destination", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;", "postOnboardingNavigator", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;", "viewModel", "", "AddBankScreen", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/addbank/navigation/AddBankDestination;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "addBankRequestId", "Lkotlin/Function0;", "onBack", "onNext", "onSkip", "onClose", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/NavKey;", "Lkotlin/ParameterName;", "onNavigateToAddBankFlow", "AddBankScreenContent-o3ECnlE", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/addbank/navigation/AddBankDestination;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AddBankScreenContent", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination;", "createAddBankDestination", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/addbank/navigation/AddBankDestination;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddBankScreenKt {
    public static final void AddBankScreen(final com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination addBankDestination, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(722789684);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(addBankDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(postOnboardingNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(postOnboardingViewModel) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(722789684, i3, -1, "com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreen (AddBankScreen.kt:77)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(postOnboardingViewModel);
            boolean changedInstance2 = startRestartGroup.changedInstance(addBankDestination);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt.m16083$r8$lambda$5dzg2HWVIJhy8vSArH2lt2R9ko(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this, addBankDestination);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance3 = startRestartGroup.changedInstance(postOnboardingViewModel);
            boolean changedInstance4 = startRestartGroup.changedInstance(addBankDestination);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance3 | changedInstance4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt.$r8$lambda$ZOx71Y1wDjq5893_4JqvrOdzlj8(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this, addBankDestination);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changedInstance5 = startRestartGroup.changedInstance(postOnboardingViewModel);
            boolean changedInstance6 = startRestartGroup.changedInstance(addBankDestination);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changedInstance5 | changedInstance6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt.$r8$lambda$gFscq8v_C1PlYaVS3oNzYTNMdRI(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this, addBankDestination);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            boolean changedInstance7 = startRestartGroup.changedInstance(postOnboardingNavigator);
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance7 | changed) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt.$r8$lambda$jXdKFKtvZysFFH3Ee6lSiIp4dW0(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, rememberNavResultRequestId, (androidx.navigation3.runtime.NavKey) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> rememberGuardedNavigateForResult = com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.GuardedNavigateForResultKt.rememberGuardedNavigateForResult((kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, 0);
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.m16125PostOnboardingFlowScreenfVxw3D8(addBankDestination.mo15903getFlowId8NcbBzM(), postOnboardingNavigator, postOnboardingViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-384093425, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt.m16082$r8$lambda$ddBil3HKibv_Y0mz5kZvN_a14(com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination.this, rememberNavResultRequestId, postOnboardingNavigator, function0, function02, function03, rememberGuardedNavigateForResult, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | 3072 | (i3 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt.m16084$r8$lambda$rYw9LpLJK94MYTnTG13I9hYMqw(com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination.this, postOnboardingNavigator, postOnboardingViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: AddBankScreenContent-o3ECnlE, reason: not valid java name */
    public static final void m16085AddBankScreenContento3ECnlE(final com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination addBankDestination, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, final kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1164286399);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(addBankDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1164286399, i3, -1, "com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenContent (AddBankScreen.kt:154)");
            }
            com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankResultHandler addBankResultHandler = new com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankResultHandler(addBankDestination, function02, function03, function0, function04);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.onboarding.api.testtags.PostOnboardingTestTags.AddBank.SCREEN);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
            com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination createAddBankDestination = createAddBankDestination(addBankDestination, startRestartGroup, i3 & 14);
            boolean changedInstance = startRestartGroup.changedInstance(addBankResultHandler);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt$AddBankScreenContent$1$1$1(addBankResultHandler, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt$AddBankScreenContent_o3ECnlE$lambda$0$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m16086invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m16086invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, ((i3 >> 3) & 14) | 3072);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean z = (i3 & 3670016) == 1048576;
            boolean changedInstance2 = startRestartGroup.changedInstance(createAddBankDestination);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | z) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt$AddBankScreenContent$1$2$1(function1, createAddBankDestination, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt.$r8$lambda$BGRVNsyDEQjZl6ZX5nc73ey4kbE(com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination.this, str, function0, function02, function03, function04, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination createAddBankDestination(com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination addBankDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-769716262, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.createAddBankDestination (AddBankScreen.kt:279)");
        }
        boolean m16117isBackDisabled786ZxuM = com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.FlowsKt.m16117isBackDisabled786ZxuM(addBankDestination.getStep().m16523getInitialFlowId8NcbBzM());
        com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination addBankDestination2 = new com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.ONBOARDING, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig(false, true, new com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig(com.paypal.oslo.feature.onboarding.postonboarding.addfi.ui.ProgressMapper.INSTANCE.toWalletProgress(addBankDestination.getStep().getProgress()), m16117isBackDisabled786ZxuM ? null : com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK, com.paypal.oslo.feature.onboarding.postonboarding.addfi.ui.WalletExtKt.toEndNavAction(addBankDestination.getStep().getSupportedTransitions())), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return addBankDestination2;
    }

    /* renamed from: $r8$lambda$-ddBil3HKibv_Y0mz-5kZvN_a14, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16082$r8$lambda$ddBil3HKibv_Y0mz5kZvN_a14(com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination addBankDestination, java.lang.String str, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-384093425, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreen.<anonymous> (AddBankScreen.kt:101)");
            }
            boolean changedInstance = composer.changedInstance(postOnboardingNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt.$r8$lambda$Q88NWHZM6bpbG9nGSz0MzhvRW0E(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            m16085AddBankScreenContento3ECnlE(addBankDestination, str, (kotlin.jvm.functions.Function0) rememberedValue, function0, function02, function03, function1, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5dzg2HWV-IJhy8vSArH2lt2R9ko, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16083$r8$lambda$5dzg2HWVIJhy8vSArH2lt2R9ko(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination addBankDestination) {
        postOnboardingViewModel.processEvent(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition(addBankDestination.getStep(), new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next(null, false, 3, null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BGRVNsyDEQjZl6ZX5nc73ey4kbE(com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination addBankDestination, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        m16085AddBankScreenContento3ECnlE(addBankDestination, str, function0, function02, function03, function04, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OnNvx5u07uGyp9rx_CgeQ5N9tOk(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q88NWHZM6bpbG9nGSz0MzhvRW0E(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        postOnboardingNavigator.navigateBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZOx71Y1wDjq5893_4JqvrOdzlj8(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination addBankDestination) {
        postOnboardingViewModel.processEvent(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition(addBankDestination.getStep(), new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Skip(false, 1, null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gFscq8v_C1PlYaVS3oNzYTNMdRI(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination addBankDestination) {
        postOnboardingViewModel.processEvent(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition(addBankDestination.getStep(), new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Close(false, 1, null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jXdKFKtvZysFFH3Ee6lSiIp4dW0(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, java.lang.String str, final androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        postOnboardingNavigator.getAppNavigator().m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.addbank.ui.AddBankScreenKt.$r8$lambda$OnNvx5u07uGyp9rx_CgeQ5N9tOk(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rYw9LpLJK94MYTn-TG13I9hYMqw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16084$r8$lambda$rYw9LpLJK94MYTnTG13I9hYMqw(com.paypal.oslo.feature.onboarding.postonboarding.addbank.navigation.AddBankDestination addBankDestination, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        AddBankScreen(addBankDestination, postOnboardingNavigator, postOnboardingViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
