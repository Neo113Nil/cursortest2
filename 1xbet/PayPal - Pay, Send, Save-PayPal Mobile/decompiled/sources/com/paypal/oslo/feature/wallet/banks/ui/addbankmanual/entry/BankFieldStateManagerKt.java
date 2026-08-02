package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a?\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a;\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u001f\"\u0014\u0010!\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u001f\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinition;", "definition", "", "userGivenName", "userSurname", "", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/entry/DynamicFieldState;", "initializeFieldStates", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinition;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "fieldStates", "", "areAllRequiredFieldsValid", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinition;Ljava/util/Map;)Z", "newRoutingNumber", "currentBankName", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/entry/RoutingNumberAction;", "getRoutingNumberAction", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/entry/RoutingNumberAction;", "currentStates", "fieldName", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "updateFieldState", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "allFieldsValid", "bankName", "shouldShowAuthorizationModal", "(ZLjava/lang/String;)Z", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualParams;", "buildAddBankParams", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinition;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualParams;", "FieldNameRoutingNumber", "Ljava/lang/String;", "FieldNameAccountNumber", "FieldNameAccountType", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankFieldStateManagerKt {
    public static final java.lang.String FieldNameAccountNumber = "accountNumber";
    public static final java.lang.String FieldNameAccountType = "type";
    public static final java.lang.String FieldNameRoutingNumber = "routingNumber1";
    private static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity getHighResolutionOutputSizeshNQ4ISI = com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.PAYPAL;

    public static final boolean shouldShowAuthorizationModal(boolean z, java.lang.String str) {
        return z && str != null;
    }

    public static /* synthetic */ java.util.Map initializeFieldStates$default(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition bankDefinition, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        return initializeFieldStates(bankDefinition, str, str2);
    }

    public static final java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState> initializeFieldStates(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition bankDefinition, java.lang.String str, java.lang.String str2) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDefinition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField> inputs = bankDefinition.getInputs();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(inputs, 10)), 16));
        for (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField bankInputField : inputs) {
            if (!kotlin.text.StringsKt.equals(bankInputField.getName(), "issuerName", true) && !kotlin.text.StringsKt.equals(bankInputField.getName(), "beneficiaryNameAsInIssuer", true) && !kotlin.text.StringsKt.equals(bankInputField.getName(), "Beneficiary Name As In Issuer", true)) {
                java.util.List<java.lang.String> prepopulatedValues = bankInputField.getPrepopulatedValues();
                if (prepopulatedValues != null && !prepopulatedValues.isEmpty()) {
                    obj = (java.lang.String) kotlin.collections.CollectionsKt.first((java.util.List) bankInputField.getPrepopulatedValues());
                }
                obj = "";
            } else {
                obj = kotlin.text.StringsKt.trim(str).toString();
                java.lang.String obj2 = kotlin.text.StringsKt.trim(str2).toString();
                java.lang.String str3 = obj;
                if (str3.length() > 0 && obj2.length() > 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(obj);
                    sb.append(" ");
                    sb.append(obj2);
                    obj = sb.toString();
                } else if (str3.length() <= 0) {
                    if (obj2.length() > 0) {
                        obj = obj2;
                    }
                    obj = "";
                }
            }
            kotlin.Pair pair = kotlin.TuplesKt.to(bankInputField.getName(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState(obj, false, 2, null));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final boolean areAllRequiredFieldsValid(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition bankDefinition, java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDefinition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField> inputs = bankDefinition.getInputs();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : inputs) {
            if (((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField) obj).getRequired()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField bankInputField = (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField) obj2;
            if (!kotlin.text.StringsKt.equals(bankInputField.getName(), "issuerName", true) && !kotlin.text.StringsKt.equals(bankInputField.getName(), "beneficiaryNameAsInIssuer", true) && !kotlin.text.StringsKt.equals(bankInputField.getName(), "Beneficiary Name As In Issuer", true)) {
                arrayList2.add(obj2);
            }
        }
        java.util.ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            return true;
        }
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState dynamicFieldState = map.get(((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField) it.next()).getName());
            if (dynamicFieldState == null || dynamicFieldState.isInvalid() || dynamicFieldState.getValue().length() <= 0) {
                return false;
            }
        }
        return true;
    }

    public static final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction getRoutingNumberAction(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (str.length() >= 9 && str2 == null) {
            return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction.FETCH_DETAILS;
        }
        if (str.length() < 9 && str2 != null) {
            return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction.CLEAR_DETAILS;
        }
        return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction.NONE;
    }

    public static final java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState> updateFieldState(java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState> map, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState> mutableMap = kotlin.collections.MapsKt.toMutableMap(map);
        mutableMap.put(str, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState(str2, false));
        return mutableMap;
    }

    public static final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams buildAddBankParams(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition bankDefinition, java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState> map, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDefinition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState dynamicFieldState = map.get(FieldNameRoutingNumber);
        java.lang.String value = dynamicFieldState != null ? dynamicFieldState.getValue() : null;
        if (value == null) {
            value = "";
        }
        java.lang.String obj = kotlin.text.StringsKt.trim(value).toString();
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState dynamicFieldState2 = map.get(FieldNameAccountNumber);
        java.lang.String value2 = dynamicFieldState2 != null ? dynamicFieldState2.getValue() : null;
        if (value2 == null) {
            value2 = "";
        }
        java.lang.String obj2 = kotlin.text.StringsKt.trim(value2).toString();
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState dynamicFieldState3 = map.get("type");
        java.lang.String value3 = dynamicFieldState3 != null ? dynamicFieldState3.getValue() : null;
        if (value3 == null) {
            value3 = "";
        }
        java.lang.String lowerCase = kotlin.text.StringsKt.trim(value3).toString().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams((kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "checking") || !kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "savings")) ? com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING : com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.SAVINGS, obj2, obj, bankDefinition.getCurrencyCode(), getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.PersonalName(str, str2), "US");
    }
}
