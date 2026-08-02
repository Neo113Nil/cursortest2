package com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/cipw9/domain/CIPW9StepComponentConfig;", "stepComponentConfig", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/cipw9/ui/CIPW9FormState;", "rememberCIPW9FormState", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/cipw9/domain/CIPW9StepComponentConfig;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/cipw9/ui/CIPW9FormState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CIPW9FormStateKt {
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9FormState rememberCIPW9FormState(com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.domain.CIPW9StepComponentConfig cIPW9StepComponentConfig, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cIPW9StepComponentConfig, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2014218830, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.rememberCIPW9FormState (CIPW9FormState.kt:143)");
        }
        boolean changed = composer.changed(cIPW9StepComponentConfig);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9FormState(cIPW9StepComponentConfig);
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9FormState cIPW9FormState = (com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.ui.CIPW9FormState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cIPW9FormState;
    }
}
