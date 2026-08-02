package org.betup.injection.provider;

import dagger.internal.Factory;

/* loaded from: classes2.dex */
public final class BillingClientProvider_Factory implements Factory<BillingClientProvider> {
    private static final BillingClientProvider_Factory INSTANCE = new BillingClientProvider_Factory();

    @Override // javax.inject.Provider
    public BillingClientProvider get() {
        return new BillingClientProvider();
    }

    public static BillingClientProvider_Factory create() {
        return INSTANCE;
    }
}
