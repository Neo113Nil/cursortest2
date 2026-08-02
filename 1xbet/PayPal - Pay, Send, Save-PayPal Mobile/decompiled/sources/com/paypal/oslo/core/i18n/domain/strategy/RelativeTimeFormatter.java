package com.paypal.oslo.core.i18n.domain.strategy;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/strategy/RelativeTimeFormatter;", "", "<init>", "()V", "Landroid/icu/text/RelativeDateTimeFormatter$RelativeUnit;", "relativeUnit", "", "diff", "Landroid/icu/text/RelativeDateTimeFormatter;", "formatter", "Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroid/icu/util/ULocale;", "icuLocale", "", "formatRelativeUnit", "(Landroid/icu/text/RelativeDateTimeFormatter$RelativeUnit;JLandroid/icu/text/RelativeDateTimeFormatter;Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;Landroid/icu/util/ULocale;)Ljava/lang/String;", "p0", "", "p1", "p2", "p3", "p4", "Camera2StreamConfigurationMap", "(Landroid/icu/text/RelativeDateTimeFormatter;DLandroid/icu/text/RelativeDateTimeFormatter$RelativeUnit;Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;Landroid/icu/util/ULocale;)Ljava/lang/String;", "", "Landroid/icu/text/RelativeDateTimeFormatter$AbsoluteUnit;", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RelativeTimeFormatter {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<android.icu.text.RelativeDateTimeFormatter.RelativeUnit, android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.SECONDS, android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.NOW), kotlin.TuplesKt.to(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.DAYS, android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.DAY), kotlin.TuplesKt.to(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.MONTHS, android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.MONTH), kotlin.TuplesKt.to(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.YEARS, android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.YEAR));

    @javax.inject.Inject
    public RelativeTimeFormatter() {
    }

    public final java.lang.String formatRelativeUnit(android.icu.text.RelativeDateTimeFormatter.RelativeUnit relativeUnit, long diff, android.icu.text.RelativeDateTimeFormatter formatter, com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle style, android.icu.util.ULocale icuLocale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icuLocale, "");
        int i = com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter.WhenMappings.$EnumSwitchMapping$0[relativeUnit.ordinal()];
        if (i == 1 || i == 2) {
            return Camera2StreamConfigurationMap(formatter, diff, relativeUnit, style, icuLocale);
        }
        android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit absoluteUnit = this.getHighResolutionOutputSizeshNQ4ISI.get(relativeUnit);
        if (absoluteUnit == null) {
            absoluteUnit = android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.NOW;
        }
        android.icu.text.RelativeDateTimeFormatter.Direction directionForDiff = com.paypal.oslo.core.i18n.domain.util.FormattingConversionUtilKt.getDirectionForDiff(diff);
        if ((diff == 0 && absoluteUnit == android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.NOW) || diff == -1 || diff == 1) {
            java.lang.String format = formatter.format(directionForDiff, absoluteUnit);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            return format;
        }
        return Camera2StreamConfigurationMap(formatter, diff, relativeUnit, style, icuLocale);
    }

    private static java.lang.String Camera2StreamConfigurationMap(android.icu.text.RelativeDateTimeFormatter p0, double p1, android.icu.text.RelativeDateTimeFormatter.RelativeUnit p2, com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle p3, android.icu.util.ULocale p4) {
        android.icu.text.RelativeDateTimeFormatter.Direction direction;
        if (com.paypal.oslo.core.i18n.domain.util.FormattingConversionUtilKt.isDurationStyle(p3)) {
            return com.paypal.oslo.core.i18n.domain.util.RelativeTimeUtilKt.formatAsDuration(p1, p2, p3, p4);
        }
        double abs = java.lang.Math.abs(p1);
        if (p1 < 0.0d) {
            direction = android.icu.text.RelativeDateTimeFormatter.Direction.LAST;
        } else {
            direction = android.icu.text.RelativeDateTimeFormatter.Direction.NEXT;
        }
        java.lang.String format = p0.format(abs, direction, p2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[android.icu.text.RelativeDateTimeFormatter.RelativeUnit.values().length];
            try {
                iArr[android.icu.text.RelativeDateTimeFormatter.RelativeUnit.MINUTES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[android.icu.text.RelativeDateTimeFormatter.RelativeUnit.HOURS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
