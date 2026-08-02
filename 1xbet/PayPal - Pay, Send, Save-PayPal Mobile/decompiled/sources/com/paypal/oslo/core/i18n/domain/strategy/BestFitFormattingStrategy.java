package com.paypal.oslo.core.i18n.domain.strategy;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/strategy/BestFitFormattingStrategy;", "Lcom/paypal/oslo/core/i18n/domain/strategy/RelativeTimeFormattingStrategy;", "Lcom/paypal/oslo/core/i18n/domain/strategy/RelativeTimeFormatter;", "relativeTimeFormatter", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/strategy/RelativeTimeFormatter;)V", "Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;", "unit", "", "canHandle", "(Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;)Z", "Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeFormattingRequest;", "request", "", "format", "(Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeFormattingRequest;)Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/strategy/RelativeTimeFormatter;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BestFitFormattingStrategy implements com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormattingStrategy {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public BestFitFormattingStrategy(com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter relativeTimeFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeTimeFormatter, "");
        this.getHighSpeedVideoFpsRanges = relativeTimeFormatter;
    }

    @Override // com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormattingStrategy
    public final boolean canHandle(com.paypal.oslo.core.i18n.domain.model.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        return unit == com.paypal.oslo.core.i18n.domain.model.DurationUnit.BEST_FIT;
    }

    @Override // com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormattingStrategy
    public final java.lang.String format(com.paypal.oslo.core.i18n.domain.model.RelativeTimeFormattingRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.Pair<android.icu.text.RelativeDateTimeFormatter.RelativeUnit, java.lang.Long> selectBestFitUnit = com.paypal.oslo.core.i18n.domain.util.RelativeTimeUtilKt.selectBestFitUnit(com.paypal.oslo.core.i18n.domain.util.RelativeTimeUtilKt.calculateAllDifferences(request.getNowDateTime(), request.getTargetDateTime()));
        android.icu.text.RelativeDateTimeFormatter.RelativeUnit component1 = selectBestFitUnit.component1();
        long longValue = selectBestFitUnit.component2().longValue();
        if (com.paypal.oslo.core.i18n.domain.util.FormattingConversionUtilKt.isDurationStyle(request.getStyle())) {
            return com.paypal.oslo.core.i18n.domain.util.RelativeTimeUtilKt.formatAsDuration(longValue, component1, request.getStyle(), request.getIcuLocale());
        }
        return this.getHighSpeedVideoFpsRanges.formatRelativeUnit(component1, longValue, request.getFormatter(), request.getStyle(), request.getIcuLocale());
    }
}
