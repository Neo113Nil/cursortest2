package com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001ab\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0017\u0010\u0012\u001a\u0013\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\u00060\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/addnfc/navigation/AddNfcDestination;", "destination", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;", "postOnboardingNavigator", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;", "viewModel", "", "AddNfcScreen", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/addnfc/navigation/AddNfcDestination;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "nfcRequestId", "Lkotlin/Function0;", "onNext", "onSkip", "onClose", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/NavKey;", "Lkotlin/ParameterName;", "onNavigateToNfcFlow", "AddNfcScreenContent-Nhs6_Ig", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/addnfc/navigation/AddNfcDestination;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AddNfcScreenContent", "Lcom/paypal/oslo/feature/taptopay/api/navigation/OnboardingTapToPayDestination;", "createOnboardingTapToPayDestination", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/addnfc/navigation/AddNfcDestination;)Lcom/paypal/oslo/feature/taptopay/api/navigation/OnboardingTapToPayDestination;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddNfcScreenKt {
    public static final void AddNfcScreen(final com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination addNfcDestination, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addNfcDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1021534248);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(addNfcDestination) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(1021534248, i3, -1, "com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreen (AddNfcScreen.kt:55)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(postOnboardingViewModel);
            boolean changedInstance2 = startRestartGroup.changedInstance(addNfcDestination);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt.$r8$lambda$jPMd5MjNEulJpbpLGhcIBeOxHAc(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this, addNfcDestination);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance3 = startRestartGroup.changedInstance(postOnboardingViewModel);
            boolean changedInstance4 = startRestartGroup.changedInstance(addNfcDestination);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance3 | changedInstance4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt.$r8$lambda$CWPp0nfxLBAV_WIn3mRtvuwuoRM(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this, addNfcDestination);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changedInstance5 = startRestartGroup.changedInstance(postOnboardingViewModel);
            boolean changedInstance6 = startRestartGroup.changedInstance(addNfcDestination);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changedInstance5 | changedInstance6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt.m16091$r8$lambda$GJR5iQKc1ZeOYaMiqqlnIuRQno(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this, addNfcDestination);
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
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt.$r8$lambda$n6rZdOoSoQ9pCKmeu0_71HhZeWU(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, rememberNavResultRequestId, (androidx.navigation3.runtime.NavKey) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> rememberGuardedNavigateForResult = com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.GuardedNavigateForResultKt.rememberGuardedNavigateForResult((kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, 0);
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.m16125PostOnboardingFlowScreenfVxw3D8(addNfcDestination.mo15903getFlowId8NcbBzM(), postOnboardingNavigator, postOnboardingViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(601412483, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt.$r8$lambda$4ke9b7SFtbdRs6FUQA50J1P2kY4(com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination.this, rememberNavResultRequestId, function0, function02, function03, rememberGuardedNavigateForResult, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | 3072 | (i3 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt.$r8$lambda$4b821EIiOFpHEedcrszEQK8yJPI(com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination.this, postOnboardingNavigator, postOnboardingViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r15v6, types: [kotlin.coroutines.Continuation] */
    /* renamed from: AddNfcScreenContent-Nhs6_Ig, reason: not valid java name */
    public static final void m16092AddNfcScreenContentNhs6_Ig(final com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination addNfcDestination, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addNfcDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        ?? startRestartGroup = composer.startRestartGroup(-31089231);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(addNfcDestination) ? 4 : 2) | i;
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
            i2 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-31089231, i3, -1, "com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenContent (AddNfcScreen.kt:94)");
            }
            boolean changed = startRestartGroup.changed(addNfcDestination);
            boolean z = (i3 & 896) == 256;
            boolean z2 = (i3 & 7168) == 2048;
            boolean z3 = (57344 & i3) == 16384;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | z | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.NfcResultHandler(addNfcDestination, function0, function02, function03);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.NfcResultHandler nfcResultHandler = (com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.NfcResultHandler) rememberedValue;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.onboarding.api.testtags.PostOnboardingTestTags.AddNfc.SCREEN);
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
            boolean changed2 = startRestartGroup.changed(addNfcDestination);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = createOnboardingTapToPayDestination(addNfcDestination);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.taptopay.api.navigation.OnboardingTapToPayDestination onboardingTapToPayDestination = (com.paypal.oslo.feature.taptopay.api.navigation.OnboardingTapToPayDestination) rememberedValue2;
            boolean changedInstance = startRestartGroup.changedInstance(nfcResultHandler);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                navResultManager = null;
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$AddNfcScreenContent$1$1$1(nfcResultHandler, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                navResultManager = null;
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue3;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, 0);
            com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$AddNfcScreenContent_Nhs6_Ig$lambda$1$$inlined$NavResultEffectrtGRyWw$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$AddNfcScreenContent_Nhs6_Ig$lambda$1$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m16093invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m16093invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                        return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ?? r15 = navResultManager;
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, ((i3 >> 3) & 14) | 3072);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean z4 = (i3 & 458752) == 131072;
            boolean changedInstance2 = startRestartGroup.changedInstance(onboardingTapToPayDestination);
            com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$AddNfcScreenContent$1$2$1 rememberedValue5 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | z4) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$AddNfcScreenContent$1$2$1(function1, onboardingTapToPayDestination, r15);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, (androidx.compose.runtime.Composer) startRestartGroup, 6);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt.$r8$lambda$CGFK4Npbb8d2ZGoe25C9eTtYkUw(com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination.this, str, function0, function02, function03, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.feature.taptopay.api.navigation.OnboardingTapToPayDestination createOnboardingTapToPayDestination(com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination addNfcDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addNfcDestination, "");
        return new com.paypal.oslo.feature.taptopay.api.navigation.OnboardingTapToPayDestination(new com.paypal.oslo.feature.taptopay.api.domain.model.topbar.TopBarConfig(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.FlowsKt.m16117isBackDisabled786ZxuM(addNfcDestination.getStep().m16523getInitialFlowId8NcbBzM()) ? null : com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction.BACK, com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.TapToPayExtKt.toTapToPayEndNavAction(addNfcDestination.getStep().getSupportedTransitions()), com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.TapToPayProgressMapper.INSTANCE.toTapToPayProgress(addNfcDestination.getStep().getProgress())));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4b821EIiOFpHEedcrszEQK8yJPI(com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination addNfcDestination, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        AddNfcScreen(addNfcDestination, postOnboardingNavigator, postOnboardingViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4ke9b7SFtbdRs6FUQA50J1P2kY4(com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination addNfcDestination, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(601412483, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreen.<anonymous> (AddNfcScreen.kt:72)");
            }
            m16092AddNfcScreenContentNhs6_Ig(addNfcDestination, str, function0, function02, function03, function1, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CGFK4Npbb8d2ZGoe25C9eTtYkUw(com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination addNfcDestination, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        m16092AddNfcScreenContentNhs6_Ig(addNfcDestination, str, function0, function02, function03, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CWPp0nfxLBAV_WIn3mRtvuwuoRM(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination addNfcDestination) {
        postOnboardingViewModel.processEvent(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition(addNfcDestination.getStep(), new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Skip(false, 1, null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EYeZK3ilYKGGzA4RTBVbFuKvAcA(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GJR5iQKc1ZeOYaMi-qqlnIuRQno, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16091$r8$lambda$GJR5iQKc1ZeOYaMiqqlnIuRQno(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination addNfcDestination) {
        postOnboardingViewModel.processEvent(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition(addNfcDestination.getStep(), new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Close(false, 1, null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jPMd5MjNEulJpbpLGhcIBeOxHAc(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination addNfcDestination) {
        postOnboardingViewModel.processEvent(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition(addNfcDestination.getStep(), new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next(null, false, 3, null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n6rZdOoSoQ9pCKmeu0_71HhZeWU(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, java.lang.String str, final androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        postOnboardingNavigator.getAppNavigator().m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.AddNfcScreenKt.$r8$lambda$EYeZK3ilYKGGzA4RTBVbFuKvAcA(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
