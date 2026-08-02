package com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.date;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\t\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\t\u0010\rJ+\u0010\t\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\t\u0010\u000fJ1\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\rR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/formatter/date/DateFormatterFacadeImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "dateTimeFormatUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;)V", "Ljava/time/LocalDate;", "date", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;", "format", "Ljava/util/Locale;", "locale", "", "(Ljava/time/LocalDate;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;Ljava/util/Locale;)Ljava/lang/String;", "Ljava/time/Instant;", "(Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;Ljava/util/Locale;)Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/DateTime;", "p0", "", "p1", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/core/i18n/domain/model/DateTime;ILcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;Ljava/util/Locale;)Ljava/lang/String;", "requireFormat", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DateFormatterFacadeImpl implements com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DateFormatterFacadeImpl(com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatUseCase, "");
        this.getHighSpeedVideoFpsRanges = dateTimeFormatUseCase;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade
    public final java.lang.String format(java.time.LocalDate date, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat format, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        return getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.toDateTime$default(date, (java.time.ZoneId) null, 1, (java.lang.Object) null), date.getDayOfMonth(), format, locale);
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade
    public final java.lang.String format(java.time.Instant date, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat format, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        if (date == null) {
            return null;
        }
        return getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.toDateTime$default(date, (java.time.ZoneId) null, 1, (java.lang.Object) null), date.atZone(java.time.ZoneId.systemDefault()).getDayOfMonth(), format, locale);
    }

    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.i18n.domain.model.DateTime p0, int p1, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat p2, java.util.Locale p3) {
        com.paypal.oslo.core.i18n.domain.model.CustomStyle customStyle;
        java.lang.String str;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DayWithOrdinal.INSTANCE)) {
            com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase = this.getHighSpeedVideoFpsRanges;
            if (kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateAndTimeMonthDayShort.INSTANCE)) {
                customStyle = new com.paypal.oslo.core.i18n.domain.model.CustomStyle("MMM d, h:mm a");
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthLong.INSTANCE)) {
                customStyle = new com.paypal.oslo.core.i18n.domain.model.CustomStyle(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_SUB_HEADER_MONTH_DATE_FORMAT);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateLong.INSTANCE)) {
                customStyle = com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.DATE_LONG;
            } else {
                customStyle = kotlin.jvm.internal.Intrinsics.areEqual(p2, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateYear.INSTANCE) ? new com.paypal.oslo.core.i18n.domain.model.CustomStyle(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_YEAR_FORMAT) : new com.paypal.oslo.core.i18n.domain.model.CustomStyle(com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem.INSTALLMENT_DATE_OUTPUT_PATTERN);
            }
            return dateTimeFormatUseCase.invoke(p0, new com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration(customStyle, p3)).getOrNull();
        }
        java.lang.String select = android.icu.text.PluralRules.forLocale(android.icu.util.ULocale.forLocale(p3), android.icu.text.PluralRules.PluralType.ORDINAL).select(p1);
        if (select != null) {
            int hashCode = select.hashCode();
            if (hashCode != 101272) {
                if (hashCode != 110182) {
                    if (hashCode == 115276 && select.equals("two")) {
                        str = "nd";
                    }
                } else if (select.equals("one")) {
                    str = "st";
                }
            } else if (select.equals("few")) {
                str = "rd";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(p1);
            sb.append(str);
            return sb.toString();
        }
        str = "th";
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(p1);
        sb2.append(str);
        return sb2.toString();
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade
    public final java.lang.String requireFormat(java.time.LocalDate date, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat format, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.lang.String format2 = format(date, format, locale);
        if (format2 != null) {
            return format2;
        }
        throw new java.lang.IllegalStateException("Null format was not expected here ".concat(java.lang.String.valueOf(date)).toString());
    }
}
