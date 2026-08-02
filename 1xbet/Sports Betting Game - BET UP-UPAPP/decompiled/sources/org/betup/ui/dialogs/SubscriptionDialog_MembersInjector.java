package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.billing.BillingService;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class SubscriptionDialog_MembersInjector implements MembersInjector<SubscriptionDialog> {
    private final Provider<BillingService> billingServiceProvider;
    private final Provider<UserService> userServiceProvider;

    public SubscriptionDialog_MembersInjector(Provider<BillingService> billingServiceProvider, Provider<UserService> userServiceProvider) {
        this.billingServiceProvider = billingServiceProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<SubscriptionDialog> create(Provider<BillingService> billingServiceProvider, Provider<UserService> userServiceProvider) {
        return new SubscriptionDialog_MembersInjector(billingServiceProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SubscriptionDialog instance) {
        injectBillingService(instance, this.billingServiceProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectBillingService(SubscriptionDialog instance, BillingService billingService) {
        instance.billingService = billingService;
    }

    public static void injectUserService(SubscriptionDialog instance, UserService userService) {
        instance.userService = userService;
    }
}
