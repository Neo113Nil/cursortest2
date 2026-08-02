package com.paypal.oslo.feature.businesscustomers.ui.customerform;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormError;", "", "toErrorMessage", "(Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormError;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerFormErrorToErrorMessageKt {
    public static final java.lang.String toErrorMessage(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError customerFormError, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerFormError, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1683162109, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerform.toErrorMessage (CustomerFormErrorToErrorMessage.kt:19)");
        }
        switch (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormErrorToErrorMessageKt.WhenMappings.$EnumSwitchMapping$0[customerFormError.ordinal()]) {
            case 1:
                composer.startReplaceGroup(-1683880634);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_error_empty_name, composer, 0);
                composer.endReplaceGroup();
                break;
            case 2:
                composer.startReplaceGroup(-1683877113);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_error_empty_email, composer, 0);
                composer.endReplaceGroup();
                break;
            case 3:
                composer.startReplaceGroup(-1683873495);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_error_invalid_email, composer, 0);
                composer.endReplaceGroup();
                break;
            case 4:
                composer.startReplaceGroup(-1683869815);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_error_invalid_phone, composer, 0);
                composer.endReplaceGroup();
                break;
            case 5:
                composer.startReplaceGroup(-1683865669);
                stringResource = com.paypal.oslo.feature.businesscustomers.ui.customerform.components.EditNotesItemKt.makeNotesAreTooLongErrorText(composer, 0);
                composer.endReplaceGroup();
                break;
            case 6:
                composer.startReplaceGroup(-1683863382);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_form_error_server_failure, composer, 0);
                composer.endReplaceGroup();
                break;
            default:
                composer.startReplaceGroup(-1683881608);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.EmptyName.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.EmptyEmail.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.InvalidEmail.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.InvalidPhone.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.InvalidLengthInCustomerNotes.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.ServerFailure.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
