package com.paypal.oslo.feature.oneonboarding.validators.ui;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/validators/ui/CIPValidationMessages;", "rememberCIPValidationMessages", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/oneonboarding/validators/ui/CIPValidationMessages;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CIPValidationMessagesProviderKt {
    public static final com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages rememberCIPValidationMessages(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1220874630, i, -1, "com.paypal.oslo.feature.oneonboarding.validators.ui.rememberCIPValidationMessages (CIPValidationMessagesProvider.kt:24)");
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_date_of_birth_error_required, composer, 0);
        java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_date_of_birth_error_format, composer, 0);
        java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_date_of_birth_error_future, composer, 0);
        java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_date_of_birth_error_min_age, composer, 0);
        java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_date_of_birth_maximum_age_validation_message, composer, 0);
        java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_taxpayer_id_error_ssn, composer, 0);
        java.lang.String stringResource7 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_taxpayer_id_error_itin, composer, 0);
        java.lang.String stringResource8 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_taxpayer_id_error_invalid_ssn, composer, 0);
        java.lang.String stringResource9 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_taxpayer_id_error_invalid_itin, composer, 0);
        java.lang.String stringResource10 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_taxpayer_id_error_length_ssn, composer, 0);
        java.lang.String stringResource11 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_taxpayer_id_error_length_itin, composer, 0);
        java.lang.String stringResource12 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_taxpayer_id_error_ssn4, composer, 0);
        java.lang.String stringResource13 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_taxpayer_id_error_itin4, composer, 0);
        java.lang.String stringResource14 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_enter_valid_ssn_validation, composer, 0);
        java.lang.String stringResource15 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_address_line1_empty_error, composer, 0);
        boolean changed = composer.changed(stringResource);
        boolean changed2 = composer.changed(stringResource2);
        boolean changed3 = composer.changed(stringResource3);
        boolean changed4 = composer.changed(stringResource4);
        boolean changed5 = composer.changed(stringResource5);
        boolean changed6 = composer.changed(stringResource6);
        boolean changed7 = composer.changed(stringResource7);
        boolean changed8 = composer.changed(stringResource8);
        boolean changed9 = composer.changed(stringResource9);
        boolean changed10 = composer.changed(stringResource10);
        boolean changed11 = composer.changed(stringResource11);
        boolean changed12 = composer.changed(stringResource12);
        boolean changed13 = composer.changed(stringResource13);
        boolean changed14 = composer.changed(stringResource14);
        boolean changed15 = composer.changed(stringResource15);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2 | changed3 | changed4 | changed5 | changed6 | changed7 | changed8 | changed9 | changed10 | changed11 | changed12 | changed13 | changed14 | changed15) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages(stringResource, stringResource2, stringResource3, stringResource4, stringResource5, stringResource6, stringResource7, stringResource8, stringResource9, stringResource10, stringResource11, stringResource12, stringResource13, stringResource14, stringResource15);
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages cIPValidationMessages = (com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cIPValidationMessages;
    }
}
