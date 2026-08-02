package com.paypal.oslo.feature.businessinventory.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError;", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "toValidationAlert", "(Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/textinput/ValidationAlert;", "", "toErrorMessage", "(Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemLibraryValidatorUtilsKt {
    public static final com.paypal.pds.components.textinput.ValidationAlert toValidationAlert(com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError fieldValidationError, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldValidationError, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-345924905, i, -1, "com.paypal.oslo.feature.businessinventory.ui.utils.toValidationAlert (ItemLibraryValidatorUtils.kt:22)");
        }
        final java.lang.String errorMessage = toErrorMessage(fieldValidationError, composer, i & 14);
        com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
        boolean changed = composer.changed(errorMessage);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.utils.ItemLibraryValidatorUtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businessinventory.ui.utils.ItemLibraryValidatorUtilsKt.$r8$lambda$AgTLa5vcF2_qybnqAiGNLTzCeME(errorMessage, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.pds.components.textinput.ValidationAlert invoke = companion.invoke((kotlin.jvm.functions.Function1) rememberedValue);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return invoke;
    }

    public static final java.lang.String toErrorMessage(com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError fieldValidationError, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldValidationError, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(475563749, i, -1, "com.paypal.oslo.feature.businessinventory.ui.utils.toErrorMessage (ItemLibraryValidatorUtils.kt:34)");
        }
        if (fieldValidationError == com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError.Missing) {
            composer.startReplaceGroup(1750233332);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_name_validation_error_empty, composer, 0);
            composer.endReplaceGroup();
        } else if (fieldValidationError == com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError.TooLong) {
            composer.startReplaceGroup(1750237655);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_name_validation_error_too_long, composer, 0);
            composer.endReplaceGroup();
        } else if (fieldValidationError == com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError.NotUnique) {
            composer.startReplaceGroup(1750242136);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_name_validation_error_duplicate, composer, 0);
            composer.endReplaceGroup();
        } else if (fieldValidationError == com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError.ContainsLink) {
            composer.startReplaceGroup(1750246739);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_name_validation_error_link, composer, 0);
            composer.endReplaceGroup();
        } else if (fieldValidationError == com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError.Missing) {
            composer.startReplaceGroup(1750251061);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_price_validation_error_empty, composer, 0);
            composer.endReplaceGroup();
        } else if (fieldValidationError == com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError.TooLong) {
            composer.startReplaceGroup(1750255668);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_description_validation_error_too_long, composer, 0);
            composer.endReplaceGroup();
        } else if (fieldValidationError == com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError.ContainsLink) {
            composer.startReplaceGroup(1750261392);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_description_validation_error_link, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1750232130);
            composer.endReplaceGroup();
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$AgTLa5vcF2_qybnqAiGNLTzCeME(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, true, null, null, 24, null);
    }
}
