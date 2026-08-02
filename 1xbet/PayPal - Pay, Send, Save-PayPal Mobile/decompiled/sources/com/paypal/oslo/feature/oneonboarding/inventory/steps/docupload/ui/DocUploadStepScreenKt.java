package com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"DocUploadStepScreen", "", "destination", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/docupload/ui/navigation/DocUploadDestination;", "oneOnboardingNavigator", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "attacher", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/di/DocUploadViewComponentAttacher;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/docupload/ui/navigation/DocUploadDestination;Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/di/DocUploadViewComponentAttacher;Landroidx/compose/runtime/Composer;II)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DocUploadStepScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DocUploadStepScreen(final com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.navigation.DocUploadDestination docUploadDestination, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher docUploadViewComponentAttacher, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher docUploadViewComponentAttacher2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher stepDocUploadViewComponentAttacher = docUploadViewComponentAttacher;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-307988642);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(docUploadDestination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(oneOnboardingNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(oneOnboardingFlowViewModel) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= (32768 & i) == 0 ? startRestartGroup.changed(stepDocUploadViewComponentAttacher) : startRestartGroup.changedInstance(stepDocUploadViewComponentAttacher) ? 16384 : 8192;
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                docUploadViewComponentAttacher2 = stepDocUploadViewComponentAttacher;
            } else {
                final androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (i4 != 0) {
                    stepDocUploadViewComponentAttacher = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.INSTANCE;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-307988642, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreen (DocUploadStepScreen.kt:46)");
                }
                com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(docUploadDestination.getIntentId(), oneOnboardingNavigator, oneOnboardingFlowViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(581825245, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenKt.$r8$lambda$6YnT8YFppOzP2aiDmHpn5gtEIA4(com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.navigation.DocUploadDestination.this, oneOnboardingFlowViewModel, modifier4, stepDocUploadViewComponentAttacher, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | 3072 | (i3 & 896), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                docUploadViewComponentAttacher2 = stepDocUploadViewComponentAttacher;
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenKt.m16741$r8$lambda$4EOpElsqwtEqbJa8NI2SYXsXd8(com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.navigation.DocUploadDestination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier3, docUploadViewComponentAttacher2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$4EOpEls-qwtEqbJa8NI2SYXsXd8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16741$r8$lambda$4EOpElsqwtEqbJa8NI2SYXsXd8(com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.navigation.DocUploadDestination docUploadDestination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher docUploadViewComponentAttacher, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DocUploadStepScreen(docUploadDestination, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier, docUploadViewComponentAttacher, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6YnT8YFppOzP2aiDmHpn5gtEIA4(com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.navigation.DocUploadDestination docUploadDestination, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher docUploadViewComponentAttacher, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(581825245, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreen.<anonymous> (DocUploadStepScreen.kt:52)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.domain.DocUploadStepComponentConfig stepComponentConfig = docUploadDestination.getStepComponentConfig();
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = docUploadDestination.getIntentId();
            boolean changedInstance = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenKt.$r8$lambda$lZLN67KYFmoae7WpZZuyJEdHNKs(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenKt.m16742$r8$lambda$e9I28HYllCaWwNR2UxWTJSIfcY(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, (com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCollectedItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            boolean changedInstance3 = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenKt.m16743$r8$lambda$mmftxh0JzyALVr0dwnpljDNK0M(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt.DocUploadStepScreenContent(stepComponentConfig, function0, function1, intentId, modifier, null, (kotlin.jvm.functions.Function0) rememberedValue3, docUploadViewComponentAttacher, composer, 0, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$e9I28HYllC-aWwNR2UxWTJSIfcY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16742$r8$lambda$e9I28HYllCaWwNR2UxWTJSIfcY(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCollectedItem docUploadCollectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadCollectedItem, "");
        oneOnboardingFlowViewModel.contributeCollectedItem(docUploadCollectedItem);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lZLN67KYFmoae7WpZZuyJEdHNKs(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        oneOnboardingFlowViewModel.stepForward();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mmftxh0J-zyALVr0dwnpljDNK0M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16743$r8$lambda$mmftxh0JzyALVr0dwnpljDNK0M(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        oneOnboardingFlowViewModel.stepBack();
        return kotlin.Unit.INSTANCE;
    }
}
