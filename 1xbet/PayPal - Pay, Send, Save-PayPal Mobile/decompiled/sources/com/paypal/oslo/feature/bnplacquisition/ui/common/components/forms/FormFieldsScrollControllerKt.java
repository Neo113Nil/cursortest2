package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldsScrollController;", "rememberFormFieldsScrollController", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldsScrollController;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormFieldsScrollControllerKt {
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsScrollController rememberFormFieldsScrollController(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1659198285, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.rememberFormFieldsScrollController (FormFieldsScrollController.kt:80)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
        boolean changed = composer.changed(coroutineScope);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsScrollController(coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsScrollController formFieldsScrollController = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsScrollController) rememberedValue2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return formFieldsScrollController;
    }
}
