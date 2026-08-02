package com.paypal.oslo.feature.identity.checkoutdataprovider.di;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/checkoutdataprovider/di/CheckoutInputDataStoreModule;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/paypal/oslo/feature/identity/api/CheckoutInputData;", "provideCheckoutInputDataReference", "()Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;", "provideCheckoutOutputDataReference", "", "provideAuthCodeReference"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class CheckoutInputDataStoreModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule INSTANCE = new com.paypal.oslo.feature.identity.checkoutdataprovider.di.CheckoutInputDataStoreModule();

    private CheckoutInputDataStoreModule() {
    }

    @dagger.Provides
    public final java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.CheckoutInputData> provideCheckoutInputDataReference() {
        return new java.util.concurrent.atomic.AtomicReference<>(null);
    }

    @dagger.Provides
    public final java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.identity.api.model.CheckoutData> provideCheckoutOutputDataReference() {
        return new java.util.concurrent.atomic.AtomicReference<>(null);
    }

    @dagger.Provides
    public final java.util.concurrent.atomic.AtomicReference<java.lang.String> provideAuthCodeReference() {
        return new java.util.concurrent.atomic.AtomicReference<>(null);
    }
}
