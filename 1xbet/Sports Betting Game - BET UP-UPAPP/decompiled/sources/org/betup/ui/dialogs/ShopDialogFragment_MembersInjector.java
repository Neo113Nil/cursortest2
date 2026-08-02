package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class ShopDialogFragment_MembersInjector implements MembersInjector<ShopDialogFragment> {
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<UserService> userServiceProvider;

    public ShopDialogFragment_MembersInjector(Provider<UserService> userServiceProvider, Provider<AnalyticsService> analyticsServiceProvider) {
        this.userServiceProvider = userServiceProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
    }

    public static MembersInjector<ShopDialogFragment> create(Provider<UserService> userServiceProvider, Provider<AnalyticsService> analyticsServiceProvider) {
        return new ShopDialogFragment_MembersInjector(userServiceProvider, analyticsServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ShopDialogFragment instance) {
        injectUserService(instance, this.userServiceProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
    }

    public static void injectUserService(ShopDialogFragment instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectAnalyticsService(ShopDialogFragment instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }
}
