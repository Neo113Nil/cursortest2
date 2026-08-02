package com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\n\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\u0013\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"", "p0", "p1", "Lkotlin/Pair;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/ui/DateComponents;", "getHighSpeedVideoSizes", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/ui/ValidationErrorMessages;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/ui/DateComponents;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/ui/ValidationErrorMessages;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/ui/ValidationErrorMessages;)Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "requiredErrorMessage", "formatErrorMessage", "futureErrorMessage", "minAgeErrorMessage", "maxAgeErrorMessage", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/ui/DateOfBirthValidationResult;", "validateDateOfBirth", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/ui/DateOfBirthValidationResult;", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "createDateOfBirthValidationAlert", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/pds/components/textinput/ValidationAlert;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DateOfBirthViewComponentValidatorKt {
    private static final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateComponents, java.lang.String> getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2) {
        java.lang.String substring = str.substring(0, 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(substring);
        java.lang.String substring2 = str.substring(2, 4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        java.lang.Integer intOrNull2 = kotlin.text.StringsKt.toIntOrNull(substring2);
        java.lang.String substring3 = str.substring(4, 8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
        java.lang.Integer intOrNull3 = kotlin.text.StringsKt.toIntOrNull(substring3);
        if (intOrNull == null || intOrNull2 == null || intOrNull3 == null) {
            return kotlin.TuplesKt.to(null, str2);
        }
        return kotlin.TuplesKt.to(new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateComponents(intOrNull3.intValue(), intOrNull.intValue(), intOrNull2.intValue()), null);
    }

    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthValidationResult validateDateOfBirth(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        java.lang.String str7 = str;
        if (str7 == null || str7.length() == 0) {
            return new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthValidationResult.RequiredButEmpty(str2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str7.length();
        for (int i = 0; i < length; i++) {
            char charAt = str7.charAt(i);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        java.lang.String obj = sb.toString();
        if (obj.length() != 8) {
            return new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthValidationResult.Invalid(str3);
        }
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, '-', false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 2, (java.lang.Object) null)) {
            java.lang.String substring = obj.substring(4, 6);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            java.lang.String substring2 = obj.substring(6, 8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            java.lang.String substring3 = obj.substring(0, 4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(substring);
            sb2.append(substring2);
            sb2.append(substring3);
            obj = sb2.toString();
        }
        java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj, new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.ValidationErrorMessages(str3, str4, str5, str6));
        if (highSpeedVideoFpsRanges != null) {
            return new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthValidationResult.Invalid(highSpeedVideoFpsRanges);
        }
        return com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthValidationResult.Valid.INSTANCE;
    }

    public static final com.paypal.pds.components.textinput.ValidationAlert createDateOfBirthValidationAlert(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        return com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentValidatorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentValidatorKt.$r8$lambda$FQTn8Ntjv1wZK2i66uMNdPoR1HM(str, str2, str3, str4, (java.lang.String) obj);
            }
        });
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$FQTn8Ntjv1wZK2i66uMNdPoR1HM(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String highSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        if (str5.length() == 0 || str5.length() != 8 || (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str5, new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.ValidationErrorMessages(str, str2, str3, str4))) == null) {
            return null;
        }
        return new com.paypal.pds.components.textinput.ValidationAlertData(highSpeedVideoFpsRanges, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    private static final java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.ValidationErrorMessages validationErrorMessages) {
        kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateComponents, java.lang.String> highSpeedVideoSizes = getHighSpeedVideoSizes(str, validationErrorMessages.getHighSpeedVideoSizes);
        com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateComponents component1 = highSpeedVideoSizes.component1();
        java.lang.String component2 = highSpeedVideoSizes.component2();
        return (component2 != null || component1 == null) ? component2 : getHighResolutionOutputSizeshNQ4ISI(component1, validationErrorMessages);
    }

    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateComponents dateComponents, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.ValidationErrorMessages validationErrorMessages) {
        java.time.LocalDate localDate;
        try {
            localDate = java.time.LocalDate.of(dateComponents.getHighSpeedVideoFpsRanges, dateComponents.Camera2StreamConfigurationMap, dateComponents.getHighSpeedVideoSizes);
        } catch (java.time.DateTimeException unused) {
            localDate = null;
        }
        if (localDate != null) {
            java.time.LocalDate now = java.time.LocalDate.now();
            if (!localDate.isAfter(now)) {
                int years = java.time.Period.between(localDate, now).getYears();
                if (years < 18) {
                    return validationErrorMessages.getHighSpeedVideoFpsRanges;
                }
                if (years >= 130) {
                    return validationErrorMessages.getHighSpeedVideoFpsRangesFor;
                }
                return null;
            }
            return validationErrorMessages.Camera2StreamConfigurationMap;
        }
        return validationErrorMessages.getHighSpeedVideoSizes;
    }
}
