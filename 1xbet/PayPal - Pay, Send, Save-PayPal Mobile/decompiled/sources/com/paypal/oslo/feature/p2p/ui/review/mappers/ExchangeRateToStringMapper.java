package com.paypal.oslo.feature.p2p.ui.review.mappers;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/mappers/ExchangeRateToStringMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/domain/model/ExchangeRate;", "", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/domain/model/ExchangeRate;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExchangeRateToStringMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.domain.model.ExchangeRate, java.lang.String> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ExchangeRateToStringMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final java.lang.String map(com.paypal.oslo.feature.p2p.domain.model.ExchangeRate input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.p2p.domain.model.Money fromCurrency = input.getFromCurrency();
        com.paypal.oslo.feature.p2p.domain.model.Money toCurrency = input.getToCurrency();
        java.lang.String value = fromCurrency.getValue();
        java.lang.String currencyCode = fromCurrency.getCurrencyCode();
        java.lang.String value2 = toCurrency.getValue();
        java.lang.String currencyCode2 = toCurrency.getCurrencyCode();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(value);
        sb.append(" ");
        sb.append(currencyCode);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        sb.append(value2);
        sb.append(" ");
        sb.append(currencyCode2);
        return sb.toString();
    }
}
