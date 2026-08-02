package org.betup.ui.dialogs.offer;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.billing.BillingService;

/* loaded from: classes2.dex */
public final class PriceContent_MembersInjector implements MembersInjector<PriceContent> {
    private final Provider<BillingService> billingServiceProvider;

    public PriceContent_MembersInjector(Provider<BillingService> billingServiceProvider) {
        this.billingServiceProvider = billingServiceProvider;
    }

    public static MembersInjector<PriceContent> create(Provider<BillingService> billingServiceProvider) {
        return new PriceContent_MembersInjector(billingServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PriceContent instance) {
        injectBillingService(instance, this.billingServiceProvider.get());
    }

    public static void injectBillingService(PriceContent instance, BillingService billingService) {
        instance.billingService = billingService;
    }
}
