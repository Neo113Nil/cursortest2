package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardSynchronizerKt {
    public static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.SynchronizeCardError access$toSynchronizeCardError(com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError serviceApiError) {
        if (serviceApiError instanceof com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.Offline) {
            return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.SynchronizeCardError.Offline.INSTANCE;
        }
        if (serviceApiError instanceof com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError) {
            com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError responseError = (com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError) serviceApiError;
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.SynchronizeCardError.ResponseError(responseError.getResponseCode(), responseError.getErrorBody());
        }
        if (serviceApiError instanceof com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError) {
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.SynchronizeCardError.NetworkError(((com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError) serviceApiError).getThrowable());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
