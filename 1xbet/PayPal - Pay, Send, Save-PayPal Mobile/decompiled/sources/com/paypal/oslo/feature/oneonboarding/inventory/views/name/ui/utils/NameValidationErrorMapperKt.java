package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.utils;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aI\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aK\u0010\u001d\u001a\u00020\u001c2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u001a\u0010\u001b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"", "Lcom/paypal/oslo/core/i18n/domain/model/NameValidationError;", "i18nErrors", "Lcom/paypal/oslo/core/i18n/domain/model/NameLayout;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "Lcom/paypal/oslo/core/i18n/domain/model/PersonName;", "name", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/ui/utils/NameValidationMessages;", "messages", "", "Lkotlin/reflect/KClass;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/personalinfo/analytics/FieldError;", "mapNameValidationErrors", "(Ljava/util/List;Lcom/paypal/oslo/core/i18n/domain/model/NameLayout;Lcom/paypal/oslo/core/i18n/domain/model/PersonName;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/ui/utils/NameValidationMessages;)Ljava/util/Map;", "error", "", "mapI18nErrorToMessage", "(Lcom/paypal/oslo/core/i18n/domain/model/NameValidationError;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/ui/utils/NameValidationMessages;)Ljava/lang/String;", "nameValidationErrorToCode", "(Lcom/paypal/oslo/core/i18n/domain/model/NameValidationError;)Ljava/lang/String;", "field", "mapRequiredFieldToMessage", "(Lcom/paypal/oslo/core/i18n/domain/model/Field;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/ui/utils/NameValidationMessages;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "contextualInfoList", "", "result", "", "addContextualErrorsToNameFieldErrors", "(Ljava/util/List;Lcom/paypal/oslo/core/i18n/domain/model/PersonName;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/ui/utils/NameValidationMessages;Ljava/util/Map;)V", "determineBestNameField", "(Lcom/paypal/oslo/core/i18n/domain/model/PersonName;)Lcom/paypal/oslo/core/i18n/domain/model/Field;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameValidationErrorMapperKt {
    /* JADX WARN: Code restructure failed: missing block: B:103:0x018a, code lost:
    
        if (r4 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015d, code lost:
    
        if (r4 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016c, code lost:
    
        if (r4 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017b, code lost:
    
        if (r4 != null) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError> mapNameValidationErrors(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.NameValidationError> list, com.paypal.oslo.core.i18n.domain.model.NameLayout nameLayout, com.paypal.oslo.core.i18n.domain.model.PersonName personName, com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.utils.NameValidationMessages nameValidationMessages) {
        java.lang.String str;
        java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> fields;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameLayout, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameValidationMessages, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (com.paypal.oslo.core.i18n.domain.model.NameValidationError nameValidationError : list) {
            java.lang.String mapI18nErrorToMessage = mapI18nErrorToMessage(nameValidationError, nameValidationMessages);
            java.lang.String nameValidationErrorToCode = nameValidationErrorToCode(nameValidationError);
            if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllMixedScript) {
                fields = ((com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllMixedScript) nameValidationError).getFields();
            } else if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidNationalityScript) {
                fields = ((com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidNationalityScript) nameValidationError).getFields();
            } else if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllHonorifics) {
                fields = ((com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllHonorifics) nameValidationError).getFields();
            } else if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidBoundaryPattern) {
                fields = ((com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidBoundaryPattern) nameValidationError).getFields();
            } else if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidCharacterRepetition) {
                fields = ((com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidCharacterRepetition) nameValidationError).getFields();
            } else if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidKeyboardBanging) {
                fields = ((com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidKeyboardBanging) nameValidationError).getFields();
            } else if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidSingleCharacter) {
                fields = ((com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidSingleCharacter) nameValidationError).getFields();
            } else if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllNonVowel) {
                fields = ((com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllNonVowel) nameValidationError).getFields();
            } else if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidMaxLengthExceeded) {
                fields = ((com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidMaxLengthExceeded) nameValidationError).getFields();
            } else if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllOffensive) {
                fields = ((com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllOffensive) nameValidationError).getFields();
            } else if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllPunctuation) {
                fields = ((com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllPunctuation) nameValidationError).getFields();
            } else if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRestricted) {
                fields = ((com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRestricted) nameValidationError).getFields();
            } else {
                if (!(nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRegisteredAccount)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                fields = ((com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRegisteredAccount) nameValidationError).getFields();
            }
            java.util.Iterator it = kotlin.collections.CollectionsKt.filterNotNull(fields).iterator();
            while (it.hasNext()) {
                linkedHashMap.putIfAbsent(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.core.i18n.domain.model.Field) it.next()).getClass()), new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError(mapI18nErrorToMessage, nameValidationErrorToCode));
            }
        }
        java.util.List<com.paypal.oslo.core.i18n.domain.model.NameLayout.NameRow> nameRow = nameLayout.getNameRow();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it2 = nameRow.iterator();
        while (it2.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((com.paypal.oslo.core.i18n.domain.model.NameLayout.NameRow) it2.next()).getNameComponent());
        }
        java.util.ArrayList<com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent) obj).getRequired()) {
                arrayList2.add(obj);
            }
        }
        for (com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent nameComponent : arrayList2) {
            com.paypal.oslo.core.i18n.domain.model.Field nameField = nameComponent.getNameField();
            if (nameField instanceof com.paypal.oslo.core.i18n.domain.model.GivenName) {
                java.lang.String m11446getGivenNamedfzjkSU = personName.m11446getGivenNamedfzjkSU();
                str = m11446getGivenNamedfzjkSU != null ? m11446getGivenNamedfzjkSU : null;
            } else if (nameField instanceof com.paypal.oslo.core.i18n.domain.model.MiddleName) {
                java.lang.String m11447getMiddleName114sck0 = personName.m11447getMiddleName114sck0();
                str = m11447getMiddleName114sck0 != null ? m11447getMiddleName114sck0 : null;
            } else if (nameField instanceof com.paypal.oslo.core.i18n.domain.model.Surname) {
                java.lang.String m11449getSurName5MXJos4 = personName.m11449getSurName5MXJos4();
                str = m11449getSurName5MXJos4 != null ? m11449getSurName5MXJos4 : null;
            } else {
                if (nameField instanceof com.paypal.oslo.core.i18n.domain.model.SecondSurname) {
                    java.lang.String m11448getSecondSurnamedtlYlO0 = personName.m11448getSecondSurnamedtlYlO0();
                    str = m11448getSecondSurnamedtlYlO0 != null ? m11448getSecondSurnamedtlYlO0 : null;
                }
                str = "";
                if (kotlin.text.StringsKt.isBlank(str)) {
                    linkedHashMap.putIfAbsent(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(nameComponent.getNameField().getClass()), new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError(mapRequiredFieldToMessage(nameComponent.getNameField(), nameValidationMessages), com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.FIELD_REQUIRED));
                }
            }
        }
        return linkedHashMap;
    }

    public static final java.lang.String mapI18nErrorToMessage(com.paypal.oslo.core.i18n.domain.model.NameValidationError nameValidationError, com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.utils.NameValidationMessages nameValidationMessages) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameValidationError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameValidationMessages, "");
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllMixedScript) {
            return nameValidationMessages.getMixedScript();
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidNationalityScript) {
            return nameValidationMessages.getNationalityScript();
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllHonorifics) {
            return nameValidationMessages.getHonorifics();
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidBoundaryPattern) {
            return nameValidationMessages.getBoundaryPattern();
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidCharacterRepetition) {
            return nameValidationMessages.getCharRepetition();
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidKeyboardBanging) {
            return nameValidationMessages.getKeyboardBanging();
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidSingleCharacter) {
            return nameValidationMessages.getSingleChar();
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllNonVowel) {
            return nameValidationMessages.getNonVowel();
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidMaxLengthExceeded) {
            return nameValidationMessages.getMaxLength();
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllOffensive) {
            return nameValidationMessages.getOffensive();
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllPunctuation) {
            return nameValidationMessages.getPunctuation();
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRestricted) {
            return nameValidationMessages.getRestricted();
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRegisteredAccount) {
            return nameValidationMessages.getRegisteredAccount();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.lang.String nameValidationErrorToCode(com.paypal.oslo.core.i18n.domain.model.NameValidationError nameValidationError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameValidationError, "");
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllMixedScript) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.MIXED_SCRIPTS;
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidNationalityScript) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.INVALID_CHARACTERS;
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllHonorifics) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.BLOCKED_VALUE;
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidBoundaryPattern) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.INVALID_FORMAT;
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidCharacterRepetition) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.REPEATED_CHARACTERS;
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidKeyboardBanging) {
            return "INVALID_CONTENT";
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidSingleCharacter) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.BELOW_MIN_LENGTH;
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllNonVowel) {
            return "INVALID_CONTENT";
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidMaxLengthExceeded) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.EXCEEDS_MAX_LENGTH;
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllOffensive) {
            return "INVALID_CONTENT";
        }
        if (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllPunctuation) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.INVALID_CHARACTERS;
        }
        if ((nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRestricted) || (nameValidationError instanceof com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRegisteredAccount)) {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.BLOCKED_VALUE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.lang.String mapRequiredFieldToMessage(com.paypal.oslo.core.i18n.domain.model.Field field, com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.utils.NameValidationMessages nameValidationMessages) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameValidationMessages, "");
        if (field instanceof com.paypal.oslo.core.i18n.domain.model.GivenName) {
            return nameValidationMessages.getGivenNameRequired();
        }
        if (field instanceof com.paypal.oslo.core.i18n.domain.model.MiddleName) {
            return nameValidationMessages.getFieldRequired();
        }
        if (field instanceof com.paypal.oslo.core.i18n.domain.model.Surname) {
            return nameValidationMessages.getSurnameRequired();
        }
        if (!(field instanceof com.paypal.oslo.core.i18n.domain.model.SecondSurname) && !(field instanceof com.paypal.oslo.core.i18n.domain.model.BusinessEntityName)) {
            return nameValidationMessages.getFieldRequired();
        }
        return nameValidationMessages.getFieldRequired();
    }

    public static final void addContextualErrorsToNameFieldErrors(java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list, com.paypal.oslo.core.i18n.domain.model.PersonName personName, com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.utils.NameValidationMessages nameValidationMessages, java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameValidationMessages, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        for (com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo contextualInfo : list) {
            java.lang.String issue = contextualInfo.getIssue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(issue, com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.error.NameContextualErrorMapperKt.InvalidNameCharacters) || kotlin.jvm.internal.Intrinsics.areEqual(issue, com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.error.NameContextualErrorMapperKt.InvalidNameFormat)) {
                map.putIfAbsent(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(determineBestNameField(personName).getClass()), new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError(nameValidationMessages.getRestricted(), contextualInfo.getIssue()));
            }
        }
    }

    public static final com.paypal.oslo.core.i18n.domain.model.Field determineBestNameField(com.paypal.oslo.core.i18n.domain.model.PersonName personName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personName, "");
        java.lang.String m11446getGivenNamedfzjkSU = personName.m11446getGivenNamedfzjkSU();
        if (m11446getGivenNamedfzjkSU == null) {
            m11446getGivenNamedfzjkSU = null;
        }
        java.lang.String str = m11446getGivenNamedfzjkSU;
        boolean z = true;
        boolean z2 = str == null || kotlin.text.StringsKt.isBlank(str);
        java.lang.String m11449getSurName5MXJos4 = personName.m11449getSurName5MXJos4();
        java.lang.String str2 = m11449getSurName5MXJos4 != null ? m11449getSurName5MXJos4 : null;
        if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
            z = false;
        }
        if (!z2) {
            return com.paypal.oslo.core.i18n.domain.model.GivenName.m11413boximpl(com.paypal.oslo.core.i18n.domain.model.GivenName.m11414constructorimpl(""));
        }
        if (!z) {
            return com.paypal.oslo.core.i18n.domain.model.Surname.m11522boximpl(com.paypal.oslo.core.i18n.domain.model.Surname.m11523constructorimpl(""));
        }
        return com.paypal.oslo.core.i18n.domain.model.GivenName.m11413boximpl(com.paypal.oslo.core.i18n.domain.model.GivenName.m11414constructorimpl(""));
    }
}
