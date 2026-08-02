package com.paypal.oslo.feature.wallet.banks.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetOpenBankingAggregatorUseCaseKt {
    public static final /* synthetic */ java.lang.String access$toStringError(com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError openBankingAggregatorError) {
        if (!(openBankingAggregatorError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError.Business.Error)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(openBankingAggregatorError, com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError.Business.MissingAggregator.INSTANCE)) {
                return "Bank aggregator fetch failed.";
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(openBankingAggregatorError, com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError.NetworkError.INSTANCE)) {
                return "Network error resulted in failure of fetching Bank Aggregator.";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.Iterator<T> it = ((com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError.Business.Error) openBankingAggregatorError).getErrors().iterator();
        if (!it.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((java.lang.String) next);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            sb.append(str);
            next = sb.toString();
        }
        return (java.lang.String) next;
    }
}
