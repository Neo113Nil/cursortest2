package com.paypal.oslo.feature.p2p.ui.review.mappers;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/mappers/FxQuoteToFormattedAmountMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/domain/model/Money;", "", "Lcom/paypal/oslo/feature/p2p/ui/common/formatter/AmountFormatter;", "amountFormatter", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/common/formatter/AmountFormatter;)V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/domain/model/Money;)Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/ui/common/formatter/AmountFormatter;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FxQuoteToFormattedAmountMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.domain.model.Money, java.lang.String> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public FxQuoteToFormattedAmountMapper(com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter amountFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountFormatter, "");
        this.getHighSpeedVideoFpsRanges = amountFormatter;
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final java.lang.String map(com.paypal.oslo.feature.p2p.domain.model.Money input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String formatAmountWithCurrency$default = com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter.formatAmountWithCurrency$default(this.getHighSpeedVideoFpsRanges, input.getValue(), input.getCurrencyCode(), null, false, 12, null);
        java.lang.String currencyCode = input.getCurrencyCode();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(formatAmountWithCurrency$default);
        sb.append(" ");
        sb.append(currencyCode);
        return sb.toString();
    }
}
