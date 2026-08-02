package com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"CryptoTermsStepScreenContent", "", "stepComponentConfig", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/cryptoterms/domain/CryptoTermsStepComponentConfig;", "onSubmit", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "modifier", "Landroidx/compose/ui/Modifier;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/cryptoterms/domain/CryptoTermsStepComponentConfig;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Landroidx/compose/runtime/Composer;II)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CryptoTermsStepScreenContentKt {
    public static final void CryptoTermsStepScreenContent(final com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.domain.CryptoTermsStepComponentConfig cryptoTermsStepComponentConfig, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.domain.CryptoTermsViewComponentConfig cryptoTermsViewComponentConfig;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoTermsStepComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1113004075);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(cryptoTermsStepComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(intentId) ? 2048 : 1024;
        }
        int i6 = i3;
        if (!startRestartGroup.shouldExecute((i6 & 1171) != 1170, i6 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                intentId = null;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1113004075, i6, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.CryptoTermsStepScreenContent (CryptoTermsStepScreenContent.kt:42)");
            }
            java.util.Iterator<T> it = cryptoTermsStepComponentConfig.getComponents().iterator();
            while (true) {
                if (!it.hasNext()) {
                    cryptoTermsViewComponentConfig = null;
                    break;
                }
                com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig viewComponentConfig = (com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig) it.next();
                if (!(viewComponentConfig instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.domain.CryptoTermsViewComponentConfig)) {
                    viewComponentConfig = null;
                }
                cryptoTermsViewComponentConfig = (com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.domain.CryptoTermsViewComponentConfig) viewComponentConfig;
                if (cryptoTermsViewComponentConfig != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.domain.CryptoTermsViewComponentConfig cryptoTermsViewComponentConfig2 = cryptoTermsViewComponentConfig;
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 2, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
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
            if (cryptoTermsViewComponentConfig2 == null) {
                startRestartGroup.startReplaceGroup(629812123);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(629812124);
                com.paypal.oslo.feature.oneonboarding.inventory.views.cryptoterms.ui.CryptoTermsViewComponentContentKt.CryptoTermsViewComponentContent(cryptoTermsViewComponentConfig2, function1, null, intentId, startRestartGroup, i6 & 7280, 4);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId2 = intentId;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.CryptoTermsStepScreenContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.ui.CryptoTermsStepScreenContentKt.m16736$r8$lambda$BrxHN7Je2msJvaKRuxJRXN8oNw(com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.domain.CryptoTermsStepComponentConfig.this, function1, modifier2, intentId2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$BrxHN7Je-2msJvaKRuxJRXN8oNw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16736$r8$lambda$BrxHN7Je2msJvaKRuxJRXN8oNw(com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.domain.CryptoTermsStepComponentConfig cryptoTermsStepComponentConfig, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoTermsStepScreenContent(cryptoTermsStepComponentConfig, function1, modifier, intentId, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
