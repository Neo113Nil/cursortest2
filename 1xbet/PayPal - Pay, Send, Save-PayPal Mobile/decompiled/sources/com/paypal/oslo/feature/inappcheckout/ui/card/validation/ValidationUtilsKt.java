package com.paypal.oslo.feature.inappcheckout.ui.card.validation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001ai\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aE\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "Lkotlin/Function1;", "getErrorMessage", "Lkotlin/Pair;", "", "validateEmpty", "(Ljava/lang/String;Landroid/content/res/Resources;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "isValidFormat", "getEmptyError", "getFormatError", "validateFormat", "(Ljava/lang/String;Landroid/content/res/Resources;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;", "cardDetails", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;", "billingAddress", "isBillingAddressExpanded", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;", "cardValidations", "isAddOperation", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ValidationErrors;", "getValidationErrors", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;Landroid/content/res/Resources;ZLcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;Z)Lcom/paypal/oslo/feature/inappcheckout/domain/model/ValidationErrors;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ValidationUtilsKt {
    public static final kotlin.Pair<java.lang.Boolean, java.lang.String> validateEmpty(java.lang.String str, android.content.res.Resources resources, kotlin.jvm.functions.Function1<? super android.content.res.Resources, java.lang.String> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        boolean isBlank = kotlin.text.StringsKt.isBlank(str);
        return new kotlin.Pair<>(java.lang.Boolean.valueOf(!isBlank), isBlank ? function1.invoke(resources) : null);
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.String> validateFormat(java.lang.String str, android.content.res.Resources resources, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super android.content.res.Resources, java.lang.String> function12, kotlin.jvm.functions.Function1<? super android.content.res.Resources, java.lang.String> function13) {
        java.lang.String invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        java.lang.String str2 = str;
        if (kotlin.text.StringsKt.isBlank(str2)) {
            invoke = function12.invoke(resources);
        } else {
            invoke = !function1.invoke(str).booleanValue() ? function13.invoke(resources) : null;
        }
        return new kotlin.Pair<>(java.lang.Boolean.valueOf(!kotlin.text.StringsKt.isBlank(str2) && function1.invoke(str).booleanValue()), invoke);
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors getValidationErrors$default(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress, android.content.res.Resources resources, boolean z, com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition, boolean z2, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            financialInstrumentMetadataDefinition = null;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition2 = financialInstrumentMetadataDefinition;
        if ((i & 32) != 0) {
            z2 = true;
        }
        return getValidationErrors(cardDetails, billingAddress, resources, z, financialInstrumentMetadataDefinition2, z2);
    }

    public static final com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors getValidationErrors(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress, android.content.res.Resources resources, boolean z, com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition, boolean z2) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.lang.String second = z2 ? com.paypal.oslo.feature.inappcheckout.ui.card.validation.NameValidationKt.validateFirstName(cardDetails.getFirstName(), resources).getSecond() : null;
        java.lang.String second2 = z2 ? com.paypal.oslo.feature.inappcheckout.ui.card.validation.NameValidationKt.validateLastName(cardDetails.getLastName(), resources).getSecond() : null;
        if (z2) {
            str = com.paypal.oslo.feature.inappcheckout.ui.card.validation.CardValidationKt.validateCardNumber(cardDetails.getCardNumber(), resources, financialInstrumentMetadataDefinition != null ? financialInstrumentMetadataDefinition.getAccountNumber() : null, financialInstrumentMetadataDefinition != null ? financialInstrumentMetadataDefinition.getRegex() : null).getSecond();
        } else {
            str = null;
        }
        java.lang.String second3 = com.paypal.oslo.feature.inappcheckout.ui.card.validation.ExpirationDateValidationKt.validateExpirationDate(cardDetails.getExpirationDate(), resources).getSecond();
        java.lang.String second4 = com.paypal.oslo.feature.inappcheckout.ui.card.validation.CardValidationKt.validateCvv(cardDetails.getCvv(), resources, financialInstrumentMetadataDefinition != null ? financialInstrumentMetadataDefinition.getCvv() : null).getSecond();
        java.lang.String second5 = z ? com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt.validateStreetAddress(billingAddress.getStreetAddress(), resources).getSecond() : null;
        java.lang.String second6 = z ? com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt.validateCity(billingAddress.getCity(), resources).getSecond() : null;
        if (z) {
            java.lang.String state = billingAddress.getState();
            str2 = com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt.validateState(state != null ? state : "", resources).getSecond();
        } else {
            str2 = null;
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors(second, second2, str, second3, second4, second5, second6, str2, z ? com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt.validateZipCode(billingAddress.getZipCode(), resources).getSecond() : null);
    }
}
