package com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/checkoutdataprovider/data/datastore/CheckoutOutputDataStoreImpl;", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutOutputDataStore;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;", "checkoutOutputData", "<init>", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "getCheckoutOutputData", "()Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "setCheckoutOutputData", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;)V", "clearCheckoutOutputData", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckoutOutputDataStoreImpl implements com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.model.CheckoutData> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CheckoutOutputDataStoreImpl(java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.model.CheckoutData> atomicReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        this.getHighSpeedVideoSizes = atomicReference;
    }

    @Override // com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore
    public final com.paypal.oslo.feature.identity.api.model.CheckoutData getCheckoutOutputData() {
        return this.getHighSpeedVideoSizes.get();
    }

    @Override // com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore
    public final void setCheckoutOutputData(com.paypal.oslo.feature.identity.api.model.CheckoutData data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        this.getHighSpeedVideoSizes.set(data);
    }

    @Override // com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore
    public final void clearCheckoutOutputData() {
        this.getHighSpeedVideoSizes.set(null);
    }
}
