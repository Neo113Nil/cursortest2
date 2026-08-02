package com.paypal.android.taptopay.domain.di;

/* loaded from: classes10.dex */
public final class ImplementationSelector_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.di.ImplementationSelector> {
    private final javax.inject.Provider<android.content.Context> getHighSpeedVideoSizes;

    public ImplementationSelector_Factory(javax.inject.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.di.ImplementationSelector get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.domain.di.ImplementationSelector_Factory create(javax.inject.Provider<android.content.Context> provider) {
        return new com.paypal.android.taptopay.domain.di.ImplementationSelector_Factory(provider);
    }

    public static com.paypal.android.taptopay.domain.di.ImplementationSelector newInstance(android.content.Context context) {
        return new com.paypal.android.taptopay.domain.di.ImplementationSelector(context);
    }
}
