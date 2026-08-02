package com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"SubmissionStepScreenContent", "", "uiState", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "onSuccess", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SubmissionStepScreenContentCryptoLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubmissionStepScreenContentKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubmissionStepScreenContent(final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState oneOnboardingUiState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1068281158);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(oneOnboardingUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            } else {
                companion = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1068281158, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenContent (SubmissionStepScreenContent.kt:48)");
                }
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
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
                if (oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting) {
                    startRestartGroup.startReplaceGroup(1343105641);
                    com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting submitting = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting) oneOnboardingUiState;
                    com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = submitting.getFlow().getIntentId();
                    if ((intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings) || (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle)) {
                        startRestartGroup.startReplaceGroup(1343218295);
                        com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.ProgressBarLoadingContentKt.ProgressBarLoadingContent(submitting.getFlow().getIntentId(), null, startRestartGroup, 0, 2);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1343352060);
                        com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.CommonLoadingContentKt.CommonLoadingContent(startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                } else if (!(oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.TerminalStatus)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(oneOnboardingUiState, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Initial.INSTANCE) && !(oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Loading) && !(oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content) && !(oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Error)) {
                        startRestartGroup.startReplaceGroup(736060382);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(736084676);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1343508951);
                    boolean z = (i3 & 112) == 32;
                    com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenContentKt$SubmissionStepScreenContent$1$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenContentKt$SubmissionStepScreenContent$1$1$1(function0, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(oneOnboardingUiState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i3 & 14);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenContentKt.m16856$r8$lambda$paTNjlaFhsCyzCOtAAgIgSziZQ(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.this, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a9Fq3tZ94E2P22d0OSzYd3XRoOw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1661185492);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1661185492, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenContentCryptoLoadingPreview (SubmissionStepScreenContent.kt:82)");
            }
            com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting submitting = new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Submitting(new com.paypal.oslo.feature.oneonboarding.domain.Flow(new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto(null, 1, null), kotlin.collections.CollectionsKt.emptyList(), com.paypal.oslo.feature.oneonboarding.api.domain.Status.IN_PROGRESS, (java.util.List) null, (java.util.Map) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 2, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SubmissionStepScreenContent(submitting, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.ui.SubmissionStepScreenContentKt.$r8$lambda$a9Fq3tZ94E2P22d0OSzYd3XRoOw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$paTNjlaFhsCyzCOtAAgIgSziZ-Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16856$r8$lambda$paTNjlaFhsCyzCOtAAgIgSziZQ(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState oneOnboardingUiState, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SubmissionStepScreenContent(oneOnboardingUiState, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
