package com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutOutputDataStore;", "", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;", "getCheckoutOutputData", "()Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "setCheckoutOutputData", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;)V", "clearCheckoutOutputData", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CheckoutOutputDataStore {
    void clearCheckoutOutputData();

    com.paypal.oslo.feature.identity.api.model.CheckoutData getCheckoutOutputData();

    void setCheckoutOutputData(com.paypal.oslo.feature.identity.api.model.CheckoutData data);
}
