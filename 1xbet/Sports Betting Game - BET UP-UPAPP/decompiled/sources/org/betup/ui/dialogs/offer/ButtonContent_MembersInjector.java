package org.betup.ui.dialogs.offer;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.billing.BillingService;

/* loaded from: classes2.dex */
public final class ButtonContent_MembersInjector implements MembersInjector<ButtonContent> {
    private final Provider<BillingService> billingServiceProvider;

    public ButtonContent_MembersInjector(Provider<BillingService> billingServiceProvider) {
        this.billingServiceProvider = billingServiceProvider;
    }

    public static MembersInjector<ButtonContent> create(Provider<BillingService> billingServiceProvider) {
        return new ButtonContent_MembersInjector(billingServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ButtonContent instance) {
        injectBillingService(instance, this.billingServiceProvider.get());
    }

    public static void injectBillingService(ButtonContent instance, BillingService billingService) {
        instance.billingService = billingService;
    }
}
