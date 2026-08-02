package com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetPlaidTokenUseCaseKt {
    public static final /* synthetic */ java.lang.String access$toStringError(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError externalBankAccessError) {
        java.lang.Object obj = null;
        if (!(externalBankAccessError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.PartialDataAvailable)) {
            if (externalBankAccessError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.MissingConnectUrl) {
                return null;
            }
            return externalBankAccessError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Network ? "Network issue resulted in failed initiate access GQL call." : "";
        }
        java.util.Iterator<T> it = ((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.PartialDataAvailable) externalBankAccessError).getErrorMessages().iterator();
        if (it.hasNext()) {
            obj = it.next();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append((java.lang.String) obj);
                sb.append(" ");
                sb.append(str);
                obj = sb.toString();
            }
        }
        return (java.lang.String) obj;
    }
}
