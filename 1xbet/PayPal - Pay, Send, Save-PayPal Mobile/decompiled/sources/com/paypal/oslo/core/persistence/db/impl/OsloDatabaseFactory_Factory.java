package com.paypal.oslo.core.persistence.db.impl;

/* loaded from: classes10.dex */
public final class OsloDatabaseFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.core.persistence.db.impl.OsloDatabaseFactory> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private OsloDatabaseFactory_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.persistence.db.impl.OsloDatabaseFactory get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.persistence.db.impl.OsloDatabaseFactory_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.core.persistence.db.impl.OsloDatabaseFactory_Factory(provider);
    }

    public static com.paypal.oslo.core.persistence.db.impl.OsloDatabaseFactory newInstance(android.content.Context context) {
        return new com.paypal.oslo.core.persistence.db.impl.OsloDatabaseFactory(context);
    }
}
