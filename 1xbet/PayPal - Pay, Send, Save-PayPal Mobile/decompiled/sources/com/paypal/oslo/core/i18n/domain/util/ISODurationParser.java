package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/ISODurationParser;", "", "<init>", "()V", "", "duration", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeError;", "Lcom/paypal/oslo/core/i18n/domain/model/DurationComponents;", "parse", "(Ljava/lang/String;)Larrow/core/Either;", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ISODurationParser {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes = 10000;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges = 120000;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI = 3650000;

    @javax.inject.Inject
    public ISODurationParser() {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, com.paypal.oslo.core.i18n.domain.model.DurationComponents> parse(java.lang.String duration) {
        boolean z;
        int i;
        boolean z2;
        arrow.core.Either left;
        arrow.core.Either.Right right;
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, com.paypal.oslo.core.i18n.domain.model.DurationComponents> left2;
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, com.paypal.oslo.core.i18n.domain.model.DurationComponents> right2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
        java.lang.String upperCase = duration.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String obj = kotlin.text.StringsKt.trim(upperCase).toString();
        java.lang.String str = obj;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "T", false, 2, (java.lang.Object) null)) {
            java.lang.String substring = obj.substring(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            java.lang.String str2 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(kotlin.text.StringsKt.split$default((java.lang.CharSequence) substring, new java.lang.String[]{"T"}, false, 0, 6, (java.lang.Object) null), 1);
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                z = true;
                java.lang.String str3 = duration;
                boolean contains$default = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str3, ' ', false, 2, (java.lang.Object) null);
                boolean contains$default2 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str3, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, false, 2, (java.lang.Object) null);
                java.util.Set plus = kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{'P', 'T', java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.YEAR), java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.MONTH), 'W', 'D', 'H', 'S'}), (java.lang.Iterable) kotlin.collections.CollectionsKt.toSet(new kotlin.ranges.CharRange(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '9')));
                i = 0;
                while (true) {
                    if (i < str.length()) {
                        z2 = false;
                        break;
                    }
                    if (!plus.contains(java.lang.Character.valueOf(str.charAt(i)))) {
                        z2 = true;
                        break;
                    }
                    i++;
                }
                if (kotlin.text.StringsKt.startsWith$default(obj, "P", false, 2, (java.lang.Object) null) || obj.length() <= 1 || z || contains$default || contains$default2 || z2) {
                    left = arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_ISO_DURATION);
                } else {
                    left = arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                if (!(left instanceof arrow.core.Either.Right)) {
                    java.lang.String upperCase2 = duration.toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                    java.lang.String substring2 = kotlin.text.StringsKt.trim(upperCase2).toString().substring(1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                    java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) substring2, new java.lang.String[]{"T"}, false, 0, 6, (java.lang.Object) null);
                    java.lang.String str4 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(split$default, 0);
                    if (str4 == null) {
                        str4 = "";
                    }
                    java.lang.String str5 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(split$default, 1);
                    java.lang.String str6 = str5 != null ? str5 : "";
                    if (str4.length() == 0) {
                        right = arrow.core.EitherKt.right(new com.paypal.oslo.core.i18n.domain.model.PeriodComponents(0, 0, 0, 0));
                    } else {
                        kotlin.Pair<java.lang.Integer, java.lang.String> parseISOComponent = com.paypal.oslo.core.i18n.domain.util.ISODurationUtilKt.parseISOComponent(str4, "Y");
                        int intValue = parseISOComponent.component1().intValue();
                        kotlin.Pair<java.lang.Integer, java.lang.String> parseISOComponent2 = com.paypal.oslo.core.i18n.domain.util.ISODurationUtilKt.parseISOComponent(parseISOComponent.component2(), "M");
                        int intValue2 = parseISOComponent2.component1().intValue();
                        kotlin.Pair<java.lang.Integer, java.lang.String> parseISOComponent3 = com.paypal.oslo.core.i18n.domain.util.ISODurationUtilKt.parseISOComponent(parseISOComponent2.component2(), "W");
                        int intValue3 = parseISOComponent3.component1().intValue();
                        kotlin.Pair<java.lang.Integer, java.lang.String> parseISOComponent4 = com.paypal.oslo.core.i18n.domain.util.ISODurationUtilKt.parseISOComponent(parseISOComponent3.component2(), "D");
                        int intValue4 = parseISOComponent4.component1().intValue();
                        if (parseISOComponent4.component2().length() > 0) {
                            right = arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_ISO_DURATION);
                        } else {
                            right = arrow.core.EitherKt.right(new com.paypal.oslo.core.i18n.domain.model.PeriodComponents(intValue, intValue2, intValue3, intValue4));
                        }
                    }
                    if (!(right instanceof arrow.core.Either.Right)) {
                        if (!(right instanceof arrow.core.Either.Left)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    } else {
                        com.paypal.oslo.core.i18n.domain.model.PeriodComponents periodComponents = (com.paypal.oslo.core.i18n.domain.model.PeriodComponents) ((arrow.core.Either.Right) right).getValue();
                        if (str6.length() == 0) {
                            right2 = arrow.core.EitherKt.right(new com.paypal.oslo.core.i18n.domain.model.TimeComponents(0, 0, 0));
                        } else {
                            kotlin.Pair<java.lang.Integer, java.lang.String> parseISOComponent5 = com.paypal.oslo.core.i18n.domain.util.ISODurationUtilKt.parseISOComponent(str6, "H");
                            int intValue5 = parseISOComponent5.component1().intValue();
                            kotlin.Pair<java.lang.Integer, java.lang.String> parseISOComponent6 = com.paypal.oslo.core.i18n.domain.util.ISODurationUtilKt.parseISOComponent(parseISOComponent5.component2(), "M");
                            int intValue6 = parseISOComponent6.component1().intValue();
                            kotlin.Pair<java.lang.Integer, java.lang.String> parseISOComponent7 = com.paypal.oslo.core.i18n.domain.util.ISODurationUtilKt.parseISOComponent(parseISOComponent6.component2(), "S");
                            int intValue7 = parseISOComponent7.component1().intValue();
                            if (parseISOComponent7.component2().length() > 0) {
                                right2 = arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_ISO_DURATION);
                            } else {
                                right2 = arrow.core.EitherKt.right(new com.paypal.oslo.core.i18n.domain.model.TimeComponents(intValue5, intValue6, intValue7));
                            }
                        }
                        if (right2 instanceof arrow.core.Either.Right) {
                            com.paypal.oslo.core.i18n.domain.model.TimeComponents timeComponents = (com.paypal.oslo.core.i18n.domain.model.TimeComponents) ((arrow.core.Either.Right) right2).getValue();
                            right = new arrow.core.Either.Right(new com.paypal.oslo.core.i18n.domain.model.DurationComponents(periodComponents.getYears(), periodComponents.getMonths(), periodComponents.getWeeks(), periodComponents.getDays(), timeComponents.getHours(), timeComponents.getMinutes(), timeComponents.getSeconds()));
                        } else {
                            if (!(right2 instanceof arrow.core.Either.Left)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            right = right2;
                        }
                    }
                    if (!(right instanceof arrow.core.Either.Right)) {
                        if (right instanceof arrow.core.Either.Left) {
                            return right;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.core.i18n.domain.model.DurationComponents durationComponents = (com.paypal.oslo.core.i18n.domain.model.DurationComponents) ((arrow.core.Either.Right) right).getValue();
                    if (durationComponents.getYears() < 0 || durationComponents.getMonths() < 0 || durationComponents.getWeeks() < 0 || durationComponents.getDays() < 0 || durationComponents.getHours() < 0 || durationComponents.getMinutes() < 0 || durationComponents.getSeconds() < 0 || durationComponents.getYears() > this.getHighSpeedVideoSizes || durationComponents.getMonths() > this.getHighSpeedVideoFpsRanges || durationComponents.getDays() > this.getHighResolutionOutputSizeshNQ4ISI) {
                        left2 = arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_ISO_DURATION);
                    } else {
                        left2 = arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    if (left2 instanceof arrow.core.Either.Right) {
                        return new arrow.core.Either.Right(durationComponents);
                    }
                    if (left2 instanceof arrow.core.Either.Left) {
                        return left2;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (left instanceof arrow.core.Either.Left) {
                    return arrow.core.EitherKt.left((com.paypal.oslo.core.i18n.domain.model.DateTimeError) ((arrow.core.Either.Left) left).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        z = false;
        java.lang.String str32 = duration;
        boolean contains$default3 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str32, ' ', false, 2, (java.lang.Object) null);
        boolean contains$default22 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str32, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, false, 2, (java.lang.Object) null);
        java.util.Set plus2 = kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{'P', 'T', java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.YEAR), java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.MONTH), 'W', 'D', 'H', 'S'}), (java.lang.Iterable) kotlin.collections.CollectionsKt.toSet(new kotlin.ranges.CharRange(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '9')));
        i = 0;
        while (true) {
            if (i < str.length()) {
            }
            i++;
        }
        if (kotlin.text.StringsKt.startsWith$default(obj, "P", false, 2, (java.lang.Object) null)) {
        }
        left = arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_ISO_DURATION);
        if (!(left instanceof arrow.core.Either.Right)) {
        }
    }
}
