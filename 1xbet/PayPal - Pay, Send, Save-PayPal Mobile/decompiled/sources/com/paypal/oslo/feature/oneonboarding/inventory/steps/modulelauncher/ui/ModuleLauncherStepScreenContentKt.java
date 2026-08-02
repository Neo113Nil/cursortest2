package com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"ModuleLauncherStepScreenContent", "", "stepComponentConfig", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/modulelauncher/domain/ModuleLauncherStepComponentConfig;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "onStepForward", "Lkotlin/Function0;", "attacher", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/stepup/di/StepUpViewComponentAttacher;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/modulelauncher/domain/ModuleLauncherStepComponentConfig;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/stepup/di/StepUpViewComponentAttacher;Landroidx/compose/runtime/Composer;II)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModuleLauncherStepScreenContentKt {
    public static final void ModuleLauncherStepScreenContent(final com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.domain.ModuleLauncherStepComponentConfig moduleLauncherStepComponentConfig, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.di.StepUpViewComponentAttacher stepUpViewComponentAttacher, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleLauncherStepComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1525515520);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(moduleLauncherStepComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(intentId) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(stepUpViewComponentAttacher) : startRestartGroup.changedInstance(stepUpViewComponentAttacher) ? 2048 : 1024;
        }
        int i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                stepUpViewComponentAttacher = com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.di.StepStepUpViewComponentAttacher.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1525515520, i5, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.ModuleLauncherStepScreenContent (ModuleLauncherStepScreenContent.kt:49)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing20(), com.paypal.pds.core.ConstantsKt.getSpacing20()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
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
            com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.domain.StepUpViewComponentConfig stepUpConfig = moduleLauncherStepComponentConfig.getStepUpConfig();
            if (stepUpConfig == null) {
                startRestartGroup.startReplaceGroup(-610045876);
                startRestartGroup.endReplaceGroup();
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "ModuleLauncherStepScreenContent: no recognised view component in step ".concat(java.lang.String.valueOf(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16613toStringimpl(moduleLauncherStepComponentConfig.mo16702getIdfHLlpbY()))), null, null, 6, null);
            } else {
                startRestartGroup.startReplaceGroup(-609911429);
                stepUpViewComponentAttacher.Attach(stepUpConfig, intentId, function0, startRestartGroup, i5 & 8176);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.di.StepUpViewComponentAttacher stepUpViewComponentAttacher2 = stepUpViewComponentAttacher;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.ModuleLauncherStepScreenContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.ui.ModuleLauncherStepScreenContentKt.$r8$lambda$YORBTYbe8RzKjZMP33HdjZayizY(com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.domain.ModuleLauncherStepComponentConfig.this, intentId, function0, stepUpViewComponentAttacher2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YORBTYbe8RzKjZMP33HdjZayizY(com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.domain.ModuleLauncherStepComponentConfig moduleLauncherStepComponentConfig, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.di.StepUpViewComponentAttacher stepUpViewComponentAttacher, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ModuleLauncherStepScreenContent(moduleLauncherStepComponentConfig, intentId, function0, stepUpViewComponentAttacher, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
