package com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aL\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0017\u0010\u0011\u001a\u0013\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00060\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/passkeyenrollment/navigation/OnboardingPasskeyDestination;", "destination", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;", "postOnboardingNavigator", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;", "viewModel", "", "OnboardingPasskeyScreen", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/passkeyenrollment/navigation/OnboardingPasskeyDestination;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "passkeyRequestId", "Lkotlin/Function0;", "onNext", "onBack", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/NavKey;", "Lkotlin/ParameterName;", "onNavigateToPasskeyEnrollment", "OnboardingPasskeyScreenContent-rtGRyWw", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "OnboardingPasskeyScreenContent", "Lcom/paypal/oslo/feature/identity/api/navigation/result/PasskeyEnrollmentNavResult;", "result", "handlePasskeyEnrollmentResult", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/PasskeyEnrollmentNavResult;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnboardingPasskeyScreenKt {
    public static final void OnboardingPasskeyScreen(final com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.OnboardingPasskeyDestination onboardingPasskeyDestination, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardingPasskeyDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1665129917);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(onboardingPasskeyDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(postOnboardingNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(postOnboardingViewModel) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1665129917, i2, -1, "com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreen (OnboardingPasskeyScreen.kt:72)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(postOnboardingViewModel);
            boolean changedInstance2 = startRestartGroup.changedInstance(onboardingPasskeyDestination);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt.$r8$lambda$t7aXxbfyGbfv3LVoW2RohnWZwbU(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this, onboardingPasskeyDestination);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance3 = startRestartGroup.changedInstance(onboardingPasskeyDestination);
            boolean changedInstance4 = startRestartGroup.changedInstance(postOnboardingViewModel);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance3 | changedInstance4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt.$r8$lambda$bFFsEakQitMi67fbhyfDOAcyef8(com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.OnboardingPasskeyDestination.this, postOnboardingViewModel);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            boolean changedInstance5 = startRestartGroup.changedInstance(postOnboardingNavigator);
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changedInstance5 | changed) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt.$r8$lambda$DzVv7rXpMFzMXNRC1Fmdp_jI6cU(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator.this, rememberNavResultRequestId, (androidx.navigation3.runtime.NavKey) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> rememberGuardedNavigateForResult = com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.GuardedNavigateForResultKt.rememberGuardedNavigateForResult((kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, 0);
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.m16125PostOnboardingFlowScreenfVxw3D8(onboardingPasskeyDestination.mo15903getFlowId8NcbBzM(), postOnboardingNavigator, postOnboardingViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1657146216, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt.m16111$r8$lambda$JvJkHJDGI9KEuRhYWUZwzvoxOo(rememberNavResultRequestId, function0, function02, rememberGuardedNavigateForResult, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i2 & 112) | 3072 | (i2 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt.m16112$r8$lambda$_SffXrm4Zpa3uFYNB6AQrgFnD0(com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.OnboardingPasskeyDestination.this, postOnboardingNavigator, postOnboardingViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [kotlin.coroutines.Continuation] */
    /* renamed from: OnboardingPasskeyScreenContent-rtGRyWw, reason: not valid java name */
    public static final void m16114OnboardingPasskeyScreenContentrtGRyWw(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1748924589);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1748924589, i3, -1, "com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenContent (OnboardingPasskeyScreen.kt:129)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "OnboardingPasskeyScreenContent");
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
            com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination passkeyEnrollmentDestination = new com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination(com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.PRODUCT, true);
            boolean z = (i3 & 112) == 32;
            boolean z2 = (i3 & 896) == 256;
            com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt$OnboardingPasskeyScreenContent$1$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z || z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                navResultManager = null;
                rememberedValue = new com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt$OnboardingPasskeyScreenContent$1$1$1(function0, function02, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                navResultManager = null;
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, 0);
            com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt$OnboardingPasskeyScreenContent_rtGRyWw$lambda$0$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt$OnboardingPasskeyScreenContent_rtGRyWw$lambda$0$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m16115invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m16115invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                        return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ?? r14 = navResultManager;
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, (i3 & 14) | 3072);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean z3 = (i3 & 7168) == 2048;
            boolean changedInstance = startRestartGroup.changedInstance(passkeyEnrollmentDestination);
            com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt$OnboardingPasskeyScreenContent$1$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changedInstance | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt$OnboardingPasskeyScreenContent$1$2$1(function1, passkeyEnrollmentDestination, r14);
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt.$r8$lambda$BTW911MDdvtfvintqQ8awxogYkI(str, function0, function02, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void handlePasskeyEnrollmentResult(com.paypal.oslo.feature.identity.api.navigation.result.PasskeyEnrollmentNavResult passkeyEnrollmentNavResult, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyEnrollmentNavResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        com.paypal.oslo.feature.identity.api.navigation.result.PasskeyEnrollmentNavResult.Outcome outcome = passkeyEnrollmentNavResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.identity.api.navigation.result.PasskeyEnrollmentNavResult.Outcome.Success) {
            function0.invoke();
        } else {
            if (!(outcome instanceof com.paypal.oslo.feature.identity.api.navigation.result.PasskeyEnrollmentNavResult.Outcome.Back)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            function02.invoke();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BTW911MDdvtfvintqQ8awxogYkI(java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        m16114OnboardingPasskeyScreenContentrtGRyWw(str, function0, function02, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DzVv7rXpMFzMXNRC1Fmdp_jI6cU(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, java.lang.String str, final androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        postOnboardingNavigator.getAppNavigator().m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.PasskeyEnrollmentNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreenKt.m16113$r8$lambda$cl1ATOGiJ0b7cAJ3VWIgHDdJ3E(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JvJkHJDGI9KEuRhYWUZwzv-oxOo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16111$r8$lambda$JvJkHJDGI9KEuRhYWUZwzvoxOo(java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1657146216, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.ui.OnboardingPasskeyScreen.<anonymous> (OnboardingPasskeyScreen.kt:100)");
            }
            m16114OnboardingPasskeyScreenContentrtGRyWw(str, function0, function02, function1, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_SffXrm4Zpa3uFYNB6AQrgFn-D0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16112$r8$lambda$_SffXrm4Zpa3uFYNB6AQrgFnD0(com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.OnboardingPasskeyDestination onboardingPasskeyDestination, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        OnboardingPasskeyScreen(onboardingPasskeyDestination, postOnboardingNavigator, postOnboardingViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bFFsEakQitMi67fbhyfDOAcyef8(com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.OnboardingPasskeyDestination onboardingPasskeyDestination, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel) {
        com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Skip skip;
        if (com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16023equalsimpl0(onboardingPasskeyDestination.getStep().m16523getInitialFlowId8NcbBzM(), com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.FlowsKt.getActivationFlowId())) {
            skip = new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Close(false, 1, null);
        } else {
            skip = new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Skip(false, 1, null);
        }
        postOnboardingViewModel.processEvent(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition(onboardingPasskeyDestination.getStep(), skip));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cl1A-TOGiJ0b7cAJ3VWIgHDdJ3E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16113$r8$lambda$cl1ATOGiJ0b7cAJ3VWIgHDdJ3E(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$t7aXxbfyGbfv3LVoW2RohnWZwbU(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.onboarding.postonboarding.passkeyenrollment.navigation.OnboardingPasskeyDestination onboardingPasskeyDestination) {
        postOnboardingViewModel.processEvent(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition(onboardingPasskeyDestination.getStep(), new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next(null, false, 3, null)));
        return kotlin.Unit.INSTANCE;
    }
}
