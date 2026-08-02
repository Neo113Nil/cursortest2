package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/NameValidationHelper;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "Lkotlin/Function1;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;ZZ)Lkotlin/jvm/functions/Function1;", "regex", "businessName", "regexShouldMatch", "caseSensitive", "", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "validateBusinessName", "(Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/util/List;", "Lcom/paypal/oslo/core/i18n/domain/model/PersonName;", androidx.autofill.HintConstants.AUTOFILL_HINT_PERSON_NAME, "validatePersonName", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/PersonName;ZZ)Ljava/util/List;", "givenNameMaxLength", "surnameMaxLength", "validateMaxLength", "(Lcom/paypal/oslo/core/i18n/domain/model/PersonName;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NameValidationHelper {
    @javax.inject.Inject
    public NameValidationHelper() {
    }

    private static kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> getHighSpeedVideoFpsRangesFor(final java.lang.String p0, final boolean p1, boolean p2) {
        final kotlin.text.Regex regex;
        if (p2) {
            regex = new kotlin.text.Regex(p0);
        } else {
            regex = new kotlin.text.Regex(p0, kotlin.text.RegexOption.IGNORE_CASE);
        }
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.util.NameValidationHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(com.paypal.oslo.core.i18n.domain.util.NameValidationHelper.$r8$lambda$7431484bjAeSWQior1T6EQtaEmY(p0, regex, p1, (java.lang.String) obj));
            }
        };
    }

    public static /* synthetic */ java.util.List validateBusinessName$default(com.paypal.oslo.core.i18n.domain.util.NameValidationHelper nameValidationHelper, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return nameValidationHelper.validateBusinessName(str, str2, z, z2);
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> validateBusinessName(java.lang.String regex, java.lang.String businessName, boolean regexShouldMatch, boolean caseSensitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessName, "");
        if (getHighSpeedVideoFpsRangesFor(regex, regexShouldMatch, caseSensitive).invoke(businessName).booleanValue()) {
            return kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.core.i18n.domain.model.BusinessEntityName.m11345boximpl(com.paypal.oslo.core.i18n.domain.model.BusinessEntityName.m11346constructorimpl(businessName)));
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static /* synthetic */ java.util.List validatePersonName$default(com.paypal.oslo.core.i18n.domain.util.NameValidationHelper nameValidationHelper, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.PersonName personName, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return nameValidationHelper.validatePersonName(str, personName, z, z2);
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> validatePersonName(java.lang.String regex, com.paypal.oslo.core.i18n.domain.model.PersonName personName, boolean regexShouldMatch, boolean caseSensitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personName, "");
        kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(regex, regexShouldMatch, caseSensitive);
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        java.lang.String m11446getGivenNamedfzjkSU = personName.m11446getGivenNamedfzjkSU();
        if (m11446getGivenNamedfzjkSU != null && m11446getGivenNamedfzjkSU != null && highSpeedVideoFpsRangesFor.invoke(m11446getGivenNamedfzjkSU).booleanValue()) {
            createListBuilder.add(com.paypal.oslo.core.i18n.domain.model.GivenName.m11413boximpl(com.paypal.oslo.core.i18n.domain.model.GivenName.m11414constructorimpl(m11446getGivenNamedfzjkSU)));
        }
        java.lang.String m11447getMiddleName114sck0 = personName.m11447getMiddleName114sck0();
        if (m11447getMiddleName114sck0 != null && m11447getMiddleName114sck0 != null && highSpeedVideoFpsRangesFor.invoke(m11447getMiddleName114sck0).booleanValue()) {
            createListBuilder.add(com.paypal.oslo.core.i18n.domain.model.MiddleName.m11428boximpl(com.paypal.oslo.core.i18n.domain.model.MiddleName.m11429constructorimpl(m11447getMiddleName114sck0)));
        }
        java.lang.String m11449getSurName5MXJos4 = personName.m11449getSurName5MXJos4();
        if (m11449getSurName5MXJos4 != null && m11449getSurName5MXJos4 != null && highSpeedVideoFpsRangesFor.invoke(m11449getSurName5MXJos4).booleanValue()) {
            createListBuilder.add(com.paypal.oslo.core.i18n.domain.model.Surname.m11522boximpl(com.paypal.oslo.core.i18n.domain.model.Surname.m11523constructorimpl(m11449getSurName5MXJos4)));
        }
        java.lang.String m11448getSecondSurnamedtlYlO0 = personName.m11448getSecondSurnamedtlYlO0();
        if (m11448getSecondSurnamedtlYlO0 != null && m11448getSecondSurnamedtlYlO0 != null && highSpeedVideoFpsRangesFor.invoke(m11448getSecondSurnamedtlYlO0).booleanValue()) {
            createListBuilder.add(com.paypal.oslo.core.i18n.domain.model.SecondSurname.m11477boximpl(com.paypal.oslo.core.i18n.domain.model.SecondSurname.m11478constructorimpl(m11448getSecondSurnamedtlYlO0)));
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Field> validateMaxLength(com.paypal.oslo.core.i18n.domain.model.PersonName personName, java.lang.String givenNameMaxLength, java.lang.String surnameMaxLength) {
        java.lang.Integer intOrNull;
        java.lang.Integer intOrNull2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personName, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        java.lang.String m11446getGivenNamedfzjkSU = personName.m11446getGivenNamedfzjkSU();
        if (m11446getGivenNamedfzjkSU != null) {
            java.lang.String m11419unboximpl = (m11446getGivenNamedfzjkSU != null ? com.paypal.oslo.core.i18n.domain.model.GivenName.m11413boximpl(m11446getGivenNamedfzjkSU) : null).m11419unboximpl();
            if (givenNameMaxLength != null && (intOrNull2 = kotlin.text.StringsKt.toIntOrNull(givenNameMaxLength)) != null) {
                if (m11419unboximpl.length() > intOrNull2.intValue()) {
                    createListBuilder.add(com.paypal.oslo.core.i18n.domain.model.GivenName.m11413boximpl(com.paypal.oslo.core.i18n.domain.model.GivenName.m11414constructorimpl(m11419unboximpl)));
                }
            }
        }
        java.lang.String m11449getSurName5MXJos4 = personName.m11449getSurName5MXJos4();
        if (m11449getSurName5MXJos4 != null) {
            java.lang.String m11528unboximpl = (m11449getSurName5MXJos4 != null ? com.paypal.oslo.core.i18n.domain.model.Surname.m11522boximpl(m11449getSurName5MXJos4) : null).m11528unboximpl();
            if (surnameMaxLength != null && (intOrNull = kotlin.text.StringsKt.toIntOrNull(surnameMaxLength)) != null) {
                if (m11528unboximpl.length() > intOrNull.intValue()) {
                    createListBuilder.add(com.paypal.oslo.core.i18n.domain.model.Surname.m11522boximpl(com.paypal.oslo.core.i18n.domain.model.Surname.m11523constructorimpl(m11528unboximpl)));
                }
            }
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    public static /* synthetic */ boolean $r8$lambda$7431484bjAeSWQior1T6EQtaEmY(java.lang.String str, kotlin.text.Regex regex, boolean z, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = str2;
        if (str3.length() != 0) {
            java.lang.String str4 = str;
            if (((kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str4, (java.lang.CharSequence) "^", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str4, (java.lang.CharSequence) com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD, false, 2, (java.lang.Object) null)) ? regex.containsMatchIn(str3) : regex.matches(str3)) == z) {
                return true;
            }
        }
        return false;
    }
}
