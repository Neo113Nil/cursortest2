package com.paypal.oslo.feature.cashin.manager;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cashin/manager/CashInDynamicConfiguration;", "", "", "getTransactionTimeDelay", "()Ljava/lang/String;", "transactionTimeDelay", "getTransactionMinLimitPerDay", "transactionMinLimitPerDay", "getTransactionMaxLimitPerMonth", "transactionMaxLimitPerMonth", "getMinLimitPerTransaction", "minLimitPerTransaction", "getMaxLimitPerTransaction", "maxLimitPerTransaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CashInDynamicConfiguration {
    java.lang.String getMaxLimitPerTransaction();

    java.lang.String getMinLimitPerTransaction();

    java.lang.String getTransactionMaxLimitPerMonth();

    java.lang.String getTransactionMinLimitPerDay();

    java.lang.String getTransactionTimeDelay();
}
