package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001b\u0010\u001e\u001a\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\"\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&\"\u0014\u0010)\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&\"\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&"}, d2 = {"", "", "hasAlphaCharacters", "(Ljava/lang/String;)Z", "isInternationalNumber", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber$Configuration;", "config", "needsMasking", "(Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber$Configuration;)Z", "", "maskedDigitsLength", "firstVisibleDigitsLength", "formattedPhoneNumber", "formatObscured", "(IILjava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/Style;", "Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;", "toPhoneUtilStyle", "(Lcom/paypal/oslo/core/i18n/domain/model/Style;)Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;", "toPhoneUtilNumber", "(Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;)Larrow/core/Either;", "Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;", "error", "convertPhoneUtilErrorToI18nError", "(Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;)Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult;", "(Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult;)Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberType;", "type", "Lcom/paypal/oslo/core/i18n/domain/model/Type;", "convertPhoneUtilTypeToI18nType", "(Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberType;)Lcom/paypal/oslo/core/i18n/domain/model/Type;", "Lkotlin/text/Regex;", "getHighSpeedVideoSizes", "Lkotlin/text/Regex;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PhoneUtilKt {
    private static final kotlin.text.Regex getHighSpeedVideoSizes = new kotlin.text.Regex("^\\s*tel:", kotlin.text.RegexOption.IGNORE_CASE);
    private static final kotlin.text.Regex getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.Regex("\\s*ext[.=]?", kotlin.text.RegexOption.IGNORE_CASE);
    private static final kotlin.text.Regex getHighSpeedVideoFpsRangesFor = new kotlin.text.Regex("[a-zA-Z]");
    private static final kotlin.text.Regex getHighSpeedVideoFpsRanges = new kotlin.text.Regex("\\d");

    public static final boolean hasAlphaCharacters(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return getHighSpeedVideoFpsRangesFor.containsMatchIn(getHighResolutionOutputSizeshNQ4ISI.replace(getHighSpeedVideoSizes.replace(str, ""), ""));
    }

    public static final boolean isInternationalNumber(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.startsWith$default(str, "+", false, 2, (java.lang.Object) null);
    }

    public static final boolean needsMasking(com.paypal.oslo.core.i18n.domain.model.PhoneNumber.Configuration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        if (configuration.getShouldObscure()) {
            return configuration.getStyle() == com.paypal.oslo.core.i18n.domain.model.Style.INTERNATIONAL || configuration.getStyle() == com.paypal.oslo.core.i18n.domain.model.Style.NATIONAL;
        }
        return false;
    }

    public static final java.lang.String formatObscured(int i, int i2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int i3 = 0;
        java.util.List list = kotlin.sequences.SequencesKt.toList(kotlin.text.Regex.findAll$default(getHighSpeedVideoFpsRanges, str, 0, 2, null));
        kotlin.Pair pair = kotlin.TuplesKt.to(0, java.lang.Integer.valueOf(str.length()));
        for (java.lang.Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.text.MatchResult matchResult = (kotlin.text.MatchResult) obj;
            int intValue = ((java.lang.Number) pair.component1()).intValue();
            int intValue2 = ((java.lang.Number) pair.component2()).intValue();
            if (i4 == i2 + 1) {
                intValue = matchResult.getRange().getFirst();
            }
            if (i4 == i2 + i + 1) {
                intValue2 = matchResult.getRange().getFirst();
            }
            pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
            i3 = i4;
        }
        int intValue3 = ((java.lang.Number) pair.component1()).intValue();
        int intValue4 = ((java.lang.Number) pair.component2()).intValue();
        java.lang.String substring = str.substring(intValue3, intValue4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String replace = getHighSpeedVideoFpsRanges.replace(substring, "*");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\u202a");
        sb.append(kotlin.text.StringsKt.take(str, intValue3));
        sb.append(replace);
        java.lang.String substring2 = str.substring(intValue4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        sb.append(substring2);
        sb.append("\u202c");
        return sb.toString();
    }

    public static final com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat toPhoneUtilStyle(com.paypal.oslo.core.i18n.domain.model.Style style) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        int i = com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i == 1) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL;
        }
        if (i == 2) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL;
        }
        if (i == 3) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.RFC3966;
    }

    public static final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber> toPhoneUtilNumber(com.paypal.oslo.core.i18n.domain.model.PhoneNumber phoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(phoneNumber.getNationalNumber());
        if (longOrNull == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.INVALID_PHONE_NUMBER_FOR_REGION);
        }
        long longValue = longOrNull.longValue();
        java.lang.String nationalNumber = phoneNumber.getNationalNumber();
        int length = nationalNumber.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (nationalNumber.charAt(i) != '0') {
                    nationalNumber = nationalNumber.substring(0, i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nationalNumber, "");
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        int length2 = nationalNumber.length();
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber2 = new com.google.i18n.phonenumbers.Phonenumber.PhoneNumber();
        phoneNumber2.setCountryCode(phoneNumber.getCountryCode());
        phoneNumber2.setNationalNumber(longValue);
        java.lang.String extension = phoneNumber.getExtension();
        phoneNumber2.setExtension(extension != null ? extension : "");
        phoneNumber2.setNumberOfLeadingZeros(length2);
        phoneNumber2.setItalianLeadingZero(length2 > 0);
        return arrow.core.EitherKt.right(phoneNumber2);
    }

    public static final com.paypal.oslo.core.i18n.domain.model.PhoneNumberError convertPhoneUtilErrorToI18nError(com.google.i18n.phonenumbers.NumberParseException.ErrorType errorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        int i = com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.WhenMappings.$EnumSwitchMapping$1[errorType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.INVALID_COUNTRY_CODE;
        }
        if (i == 2) {
            return com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.INVALID_PHONE_NUMBER_FOR_REGION;
        }
        if (i == 3 || i == 4) {
            return com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.TOO_SHORT;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.TOO_LONG;
    }

    public static final com.paypal.oslo.core.i18n.domain.model.PhoneNumberError convertPhoneUtilErrorToI18nError(com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult validationResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResult, "");
        int i = com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.WhenMappings.$EnumSwitchMapping$2[validationResult.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.TOO_LONG;
        }
        if (i == 2) {
            return com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.INVALID_LENGTH;
        }
        if (i == 3) {
            return com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.TOO_SHORT;
        }
        if (i == 4) {
            return com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.INVALID_COUNTRY_CODE;
        }
        return com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.UNKNOWN_ERROR;
    }

    public static final com.paypal.oslo.core.i18n.domain.model.Type convertPhoneUtilTypeToI18nType(com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberType, "");
        switch (com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.WhenMappings.$EnumSwitchMapping$3[phoneNumberType.ordinal()]) {
            case 1:
                return com.paypal.oslo.core.i18n.domain.model.Type.FIXED_LINE;
            case 2:
                return com.paypal.oslo.core.i18n.domain.model.Type.MOBILE;
            case 3:
                return com.paypal.oslo.core.i18n.domain.model.Type.FIXED_LINE_OR_MOBILE;
            case 4:
                return com.paypal.oslo.core.i18n.domain.model.Type.TOLL_FREE;
            case 5:
                return com.paypal.oslo.core.i18n.domain.model.Type.PREMIUM_RATE;
            case 6:
                return com.paypal.oslo.core.i18n.domain.model.Type.SHARED_COST;
            case 7:
                return com.paypal.oslo.core.i18n.domain.model.Type.VOIP;
            case 8:
                return com.paypal.oslo.core.i18n.domain.model.Type.PERSONAL_NUMBER;
            case 9:
                return com.paypal.oslo.core.i18n.domain.model.Type.PAGER;
            case 10:
                return com.paypal.oslo.core.i18n.domain.model.Type.UAN;
            case 11:
                return com.paypal.oslo.core.i18n.domain.model.Type.VOICEMAIL;
            default:
                return com.paypal.oslo.core.i18n.domain.model.Type.UNKNOWN;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[com.paypal.oslo.core.i18n.domain.model.Style.values().length];
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.Style.INTERNATIONAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.Style.NATIONAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.Style.E164.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.Style.RFC3966.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.google.i18n.phonenumbers.NumberParseException.ErrorType.values().length];
            try {
                iArr2[com.google.i18n.phonenumbers.NumberParseException.ErrorType.INVALID_COUNTRY_CODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.google.i18n.phonenumbers.NumberParseException.ErrorType.NOT_A_NUMBER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.google.i18n.phonenumbers.NumberParseException.ErrorType.TOO_SHORT_AFTER_IDD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.google.i18n.phonenumbers.NumberParseException.ErrorType.TOO_SHORT_NSN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.google.i18n.phonenumbers.NumberParseException.ErrorType.TOO_LONG.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.values().length];
            try {
                iArr3[com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.TOO_LONG.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.INVALID_LENGTH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.TOO_SHORT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.INVALID_COUNTRY_CODE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.values().length];
            try {
                iArr4[com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr4[com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr4[com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr4[com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.TOLL_FREE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr4[com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PREMIUM_RATE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr4[com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.SHARED_COST.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr4[com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.VOIP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr4[com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PERSONAL_NUMBER.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr4[com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PAGER.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr4[com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UAN.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr4[com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.VOICEMAIL.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }
}
