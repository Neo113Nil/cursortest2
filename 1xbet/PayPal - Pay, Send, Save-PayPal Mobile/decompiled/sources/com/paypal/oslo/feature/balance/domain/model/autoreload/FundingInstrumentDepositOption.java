package com.paypal.oslo.feature.balance.domain.model.autoreload;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentDepositOption;", "", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getMaximumLimit", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "maximumLimit", "", "getFormattedLimit", "()Ljava/lang/String;", "formattedLimit"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FundingInstrumentDepositOption {
    java.lang.String getFormattedLimit();

    com.paypal.oslo.feature.balance.domain.model.Money getMaximumLimit();
}
