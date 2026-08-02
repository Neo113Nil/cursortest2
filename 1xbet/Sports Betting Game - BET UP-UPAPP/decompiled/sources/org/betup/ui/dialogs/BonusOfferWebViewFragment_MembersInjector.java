package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.billing.BillingService;

/* loaded from: classes2.dex */
public final class BonusOfferWebViewFragment_MembersInjector implements MembersInjector<BonusOfferWebViewFragment> {
    private final Provider<BillingService> billingServiceProvider;

    public BonusOfferWebViewFragment_MembersInjector(Provider<BillingService> billingServiceProvider) {
        this.billingServiceProvider = billingServiceProvider;
    }

    public static MembersInjector<BonusOfferWebViewFragment> create(Provider<BillingService> billingServiceProvider) {
        return new BonusOfferWebViewFragment_MembersInjector(billingServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BonusOfferWebViewFragment instance) {
        injectBillingService(instance, this.billingServiceProvider.get());
    }

    public static void injectBillingService(BonusOfferWebViewFragment instance, BillingService billingService) {
        instance.billingService = billingService;
    }
}
