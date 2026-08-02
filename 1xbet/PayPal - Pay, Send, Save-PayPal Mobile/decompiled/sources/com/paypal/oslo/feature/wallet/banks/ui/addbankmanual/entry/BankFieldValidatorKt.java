package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a7\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinition;", "definition", "", "", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/entry/DynamicFieldState;", "currentStates", "validateAllFields", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinition;Ljava/util/Map;)Ljava/util/Map;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankInputField;", "field", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "validateField", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankInputField;Ljava/lang/String;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankFieldValidatorKt {
    public static final java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState> validateAllFields(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition bankDefinition, java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDefinition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState> mutableMap = kotlin.collections.MapsKt.toMutableMap(map);
        for (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField bankInputField : bankDefinition.getInputs()) {
            com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState dynamicFieldState = mutableMap.get(bankInputField.getName());
            if (dynamicFieldState == null) {
                dynamicFieldState = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState(null, false, 3, null);
            }
            mutableMap.put(bankInputField.getName(), com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState.copy$default(dynamicFieldState, null, !validateField(bankInputField, dynamicFieldState.getValue()), 1, null));
        }
        return mutableMap;
    }

    public static final boolean validateField(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField bankInputField, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankInputField, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (bankInputField.getRequired() && str.length() == 0) {
            return false;
        }
        if (!bankInputField.getRequired() && str.length() == 0) {
            return true;
        }
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(bankInputField.getMinimumLength(), 0);
        int coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtLeast(bankInputField.getMaximumLength(), coerceAtLeast);
        if (str.length() < coerceAtLeast || str.length() > coerceAtLeast2) {
            return false;
        }
        java.lang.String regex = bankInputField.getRegex();
        if (regex != null) {
            try {
                if (!new kotlin.text.Regex(regex).matches(str)) {
                    return false;
                }
            } catch (java.util.regex.PatternSyntaxException e) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Invalid regex pattern from API", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fieldName", bankInputField.getName()), kotlin.TuplesKt.to("pattern", regex)), null, e, 4, null);
            }
        }
        return true;
    }
}
