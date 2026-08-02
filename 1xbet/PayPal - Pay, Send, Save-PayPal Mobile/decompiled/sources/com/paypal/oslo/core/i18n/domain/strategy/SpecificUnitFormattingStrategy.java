package com.paypal.oslo.core.i18n.domain.strategy;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/strategy/SpecificUnitFormattingStrategy;", "Lcom/paypal/oslo/core/i18n/domain/strategy/RelativeTimeFormattingStrategy;", "Lcom/paypal/oslo/core/i18n/domain/strategy/RelativeTimeFormatter;", "relativeTimeFormatter", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/strategy/RelativeTimeFormatter;)V", "Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;", "unit", "", "canHandle", "(Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;)Z", "Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeFormattingRequest;", "request", "", "format", "(Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeFormattingRequest;)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/strategy/RelativeTimeFormatter;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SpecificUnitFormattingStrategy implements com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormattingStrategy {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SpecificUnitFormattingStrategy(com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter relativeTimeFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeTimeFormatter, "");
        this.Camera2StreamConfigurationMap = relativeTimeFormatter;
    }

    @Override // com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormattingStrategy
    public final boolean canHandle(com.paypal.oslo.core.i18n.domain.model.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        return unit != com.paypal.oslo.core.i18n.domain.model.DurationUnit.BEST_FIT;
    }

    @Override // com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormattingStrategy
    public final java.lang.String format(com.paypal.oslo.core.i18n.domain.model.RelativeTimeFormattingRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        long calculateDifference = com.paypal.oslo.core.i18n.domain.util.RelativeTimeUtilKt.calculateDifference(request.getUnit(), request.getNowDateTime(), request.getTargetDateTime());
        android.icu.text.RelativeDateTimeFormatter.RelativeUnit icu = com.paypal.oslo.core.i18n.domain.util.RelativeTimeUtilKt.toICU(request.getUnit());
        if (com.paypal.oslo.core.i18n.domain.util.FormattingConversionUtilKt.isDurationStyle(request.getStyle())) {
            return com.paypal.oslo.core.i18n.domain.util.RelativeTimeUtilKt.formatAsDuration(calculateDifference, icu, request.getStyle(), request.getIcuLocale());
        }
        if (calculateDifference == 0) {
            android.icu.text.RelativeDateTimeFormatter formatter = request.getFormatter();
            com.paypal.oslo.core.i18n.domain.model.DurationUnit unit = request.getUnit();
            com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle style = request.getStyle();
            android.icu.util.ULocale icuLocale = request.getIcuLocale();
            int i = com.paypal.oslo.core.i18n.domain.strategy.SpecificUnitFormattingStrategy.WhenMappings.$EnumSwitchMapping$0[unit.ordinal()];
            if (i == 1) {
                java.lang.String format = formatter.format(android.icu.text.RelativeDateTimeFormatter.Direction.PLAIN, com.paypal.oslo.core.i18n.domain.util.FormattingConversionUtilKt.toAbsoluteUnit(unit));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }
            if (i != 2 && i != 3) {
                java.lang.String format2 = formatter.format(android.icu.text.RelativeDateTimeFormatter.Direction.THIS, com.paypal.oslo.core.i18n.domain.util.FormattingConversionUtilKt.toAbsoluteUnit(unit));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
                return format2;
            }
            if (android.os.Build.VERSION.SDK_INT < 31) {
                return this.Camera2StreamConfigurationMap.formatRelativeUnit(com.paypal.oslo.core.i18n.domain.util.FormattingConversionUtilKt.toRelativeUnitForFallback(unit), 0L, formatter, style, icuLocale);
            }
            java.lang.String format3 = formatter.format(android.icu.text.RelativeDateTimeFormatter.Direction.THIS, com.paypal.oslo.core.i18n.domain.util.FormattingConversionUtilKt.toAbsoluteUnit(unit));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "");
            return format3;
        }
        return this.Camera2StreamConfigurationMap.formatRelativeUnit(icu, calculateDifference, request.getFormatter(), request.getStyle(), request.getIcuLocale());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.i18n.domain.model.DurationUnit.values().length];
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.DurationUnit.SECOND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.DurationUnit.MINUTE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.DurationUnit.HOUR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
