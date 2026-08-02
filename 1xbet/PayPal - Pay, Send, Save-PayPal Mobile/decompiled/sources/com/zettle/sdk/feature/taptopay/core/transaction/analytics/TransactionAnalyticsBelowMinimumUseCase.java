package com.zettle.sdk.feature.taptopay.core.transaction.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionAnalyticsBelowMinimumUseCase;", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "", "info", "invoke", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface TransactionAnalyticsBelowMinimumUseCase extends kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo, kotlin.Unit> {
    void invoke(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info);
}
