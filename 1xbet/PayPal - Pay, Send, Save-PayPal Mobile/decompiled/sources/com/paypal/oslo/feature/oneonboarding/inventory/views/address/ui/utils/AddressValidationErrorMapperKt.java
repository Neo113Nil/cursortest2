package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.utils;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aI\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aC\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u001a\u0010\u0016\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", "i18nErrors", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/utils/AddressValidationMessages;", "messages", "", "Lkotlin/reflect/KClass;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/personalinfo/analytics/FieldError;", "mapValidationErrors", "(Ljava/util/List;Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;Lcom/paypal/oslo/core/i18n/domain/model/Address;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/utils/AddressValidationMessages;)Ljava/util/Map;", "error", "", "addressValidationErrorToCode", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "contextualInfoList", "", "result", "", "addContextualErrorsToAddressFieldErrors", "(Ljava/util/List;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/utils/AddressValidationMessages;Ljava/util/Map;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressValidationErrorMapperKt {
    public static final java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError> mapValidationErrors(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.AddressValidationError> list, com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.utils.AddressValidationMessages addressValidationMessages) {
        java.lang.String postalCodeRequired;
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressLayout, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressValidationMessages, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (com.paypal.oslo.core.i18n.domain.model.AddressValidationError addressValidationError : list) {
            if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired) {
                pair = kotlin.TuplesKt.to(((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired) addressValidationError).getFields(), addressValidationMessages.getFieldRequired());
            } else if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingOneOf) {
                pair = kotlin.TuplesKt.to(((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingOneOf) addressValidationError).getFields(), addressValidationMessages.getMissingOneOf());
            } else if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern) {
                pair = kotlin.TuplesKt.to(((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern) addressValidationError).getFields(), addressValidationMessages.getInvalidPattern());
            } else if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter) {
                pair = kotlin.TuplesKt.to(((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter) addressValidationError).getFields(), addressValidationMessages.getInvalidCharacter());
            } else if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidAllOffensive) {
                pair = kotlin.TuplesKt.to(((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidAllOffensive) addressValidationError).getFields(), addressValidationMessages.getOffensiveContent());
            } else if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsPOBox) {
                pair = kotlin.TuplesKt.to(((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsPOBox) addressValidationError).getFields(), addressValidationMessages.getContainsPOBox());
            } else if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsRuralRoute) {
                pair = kotlin.TuplesKt.to(((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsRuralRoute) addressValidationError).getFields(), addressValidationMessages.getContainsRuralRoute());
            } else if (!(addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> list2 = (java.util.List) pair.component1();
            java.lang.String str = (java.lang.String) pair.component2();
            java.lang.String addressValidationErrorToCode = addressValidationErrorToCode(addressValidationError);
            for (com.paypal.oslo.core.i18n.domain.model.Field field : list2) {
                if (field != null) {
                    linkedHashMap.putIfAbsent(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(field.getClass()), new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError(str, addressValidationErrorToCode));
                }
            }
        }
        java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> fieldMap = com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.utils.AddressFieldUtilsKt.toFieldMap(address);
        java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row> rows = addressLayout.getRows();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = rows.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row) it.next()).getComponents());
        }
        java.util.ArrayList<com.paypal.oslo.core.i18n.domain.model.AddressComponent> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((com.paypal.oslo.core.i18n.domain.model.AddressComponent) obj).getRequired()) {
                arrayList2.add(obj);
            }
        }
        for (com.paypal.oslo.core.i18n.domain.model.AddressComponent addressComponent : arrayList2) {
            java.lang.String str2 = fieldMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(addressComponent.getField().getClass()));
            if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(addressComponent.getField().getClass());
                com.paypal.oslo.core.i18n.domain.model.Field field2 = addressComponent.getField();
                if (field2 instanceof com.paypal.oslo.core.i18n.domain.model.AddressLine1) {
                    postalCodeRequired = addressValidationMessages.getAddressLine1Required();
                } else if (field2 instanceof com.paypal.oslo.core.i18n.domain.model.AdminArea1) {
                    postalCodeRequired = addressValidationMessages.getAdminArea1Required();
                } else if (field2 instanceof com.paypal.oslo.core.i18n.domain.model.AdminArea2) {
                    postalCodeRequired = addressValidationMessages.getAdminArea2Required();
                } else {
                    postalCodeRequired = field2 instanceof com.paypal.oslo.core.i18n.domain.model.PostalCode ? addressValidationMessages.getPostalCodeRequired() : addressValidationMessages.getFieldRequired();
                }
                linkedHashMap.putIfAbsent(orCreateKotlinClass, new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError(postalCodeRequired, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.FIELD_REQUIRED));
            }
        }
        return linkedHashMap;
    }

    public static final java.lang.String addressValidationErrorToCode(com.paypal.oslo.core.i18n.domain.model.AddressValidationError addressValidationError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressValidationError, "");
        if ((addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired) || (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingOneOf)) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.FIELD_REQUIRED;
        }
        if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.INVALID_FORMAT;
        }
        if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.INVALID_CHARACTERS;
        }
        if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidAllOffensive) {
            return "INVALID_CONTENT";
        }
        if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsPOBox) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.CONTAINS_PO_BOX;
        }
        if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsRuralRoute) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.CONTAINS_RURAL_ROUTE;
        }
        if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.UnknownError) {
            return "UNKNOWN_ERROR";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final void addContextualErrorsToAddressFieldErrors(java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list, com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.utils.AddressValidationMessages addressValidationMessages, java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError> map) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressValidationMessages, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        for (com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo contextualInfo : list) {
            java.lang.String issue = contextualInfo.getIssue();
            switch (issue.hashCode()) {
                case -998091122:
                    if (issue.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddressPostalCode)) {
                        pair = kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.PostalCode.class), addressValidationMessages.getCouldNotValidateField());
                        map.putIfAbsent((kotlin.reflect.KClass) pair.component1(), new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError((java.lang.String) pair.component2(), contextualInfo.getIssue()));
                        break;
                    } else {
                        break;
                    }
                case -654580241:
                    if (issue.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.AddressContainsRuralRoute)) {
                        pair = kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AddressLine1.class), addressValidationMessages.getContainsRuralRoute());
                        map.putIfAbsent((kotlin.reflect.KClass) pair.component1(), new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError((java.lang.String) pair.component2(), contextualInfo.getIssue()));
                        break;
                    } else {
                        break;
                    }
                case -620378110:
                    if (issue.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddressAdminArea1)) {
                        pair = kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea1.class), addressValidationMessages.getCouldNotValidateField());
                        map.putIfAbsent((kotlin.reflect.KClass) pair.component1(), new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError((java.lang.String) pair.component2(), contextualInfo.getIssue()));
                        break;
                    } else {
                        break;
                    }
                case -620378109:
                    if (issue.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddressAdminArea2)) {
                        pair = kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea2.class), addressValidationMessages.getCouldNotValidateField());
                        map.putIfAbsent((kotlin.reflect.KClass) pair.component1(), new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError((java.lang.String) pair.component2(), contextualInfo.getIssue()));
                        break;
                    } else {
                        break;
                    }
                case -426068280:
                    if (issue.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddressPostalCodeFormat)) {
                        pair = kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.PostalCode.class), addressValidationMessages.getInvalidPattern());
                        map.putIfAbsent((kotlin.reflect.KClass) pair.component1(), new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError((java.lang.String) pair.component2(), contextualInfo.getIssue()));
                        break;
                    } else {
                        break;
                    }
                case 225296160:
                    if (issue.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.AddressContainsPoBox)) {
                        pair = kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AddressLine1.class), addressValidationMessages.getContainsPOBox());
                        map.putIfAbsent((kotlin.reflect.KClass) pair.component1(), new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError((java.lang.String) pair.component2(), contextualInfo.getIssue()));
                        break;
                    } else {
                        break;
                    }
                case 926582124:
                    if (issue.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddress)) {
                        pair = kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AddressLine1.class), addressValidationMessages.getCouldNotValidateField());
                        map.putIfAbsent((kotlin.reflect.KClass) pair.component1(), new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError((java.lang.String) pair.component2(), contextualInfo.getIssue()));
                        break;
                    } else {
                        break;
                    }
                case 1886817398:
                    if (issue.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.AddressFieldRegexMismatch)) {
                        pair = kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.PostalCode.class), addressValidationMessages.getInvalidPattern());
                        map.putIfAbsent((kotlin.reflect.KClass) pair.component1(), new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError((java.lang.String) pair.component2(), contextualInfo.getIssue()));
                        break;
                    } else {
                        break;
                    }
            }
        }
    }
}
