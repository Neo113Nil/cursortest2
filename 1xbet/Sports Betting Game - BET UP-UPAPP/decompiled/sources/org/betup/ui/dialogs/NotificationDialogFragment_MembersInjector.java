package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.subscription.DefaultSubscriptionService;

/* loaded from: classes2.dex */
public final class NotificationDialogFragment_MembersInjector implements MembersInjector<NotificationDialogFragment> {
    private final Provider<DefaultSubscriptionService> subscriptionServiceProvider;

    public NotificationDialogFragment_MembersInjector(Provider<DefaultSubscriptionService> subscriptionServiceProvider) {
        this.subscriptionServiceProvider = subscriptionServiceProvider;
    }

    public static MembersInjector<NotificationDialogFragment> create(Provider<DefaultSubscriptionService> subscriptionServiceProvider) {
        return new NotificationDialogFragment_MembersInjector(subscriptionServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NotificationDialogFragment instance) {
        injectSubscriptionService(instance, this.subscriptionServiceProvider.get());
    }

    public static void injectSubscriptionService(NotificationDialogFragment instance, DefaultSubscriptionService subscriptionService) {
        instance.subscriptionService = subscriptionService;
    }
}
