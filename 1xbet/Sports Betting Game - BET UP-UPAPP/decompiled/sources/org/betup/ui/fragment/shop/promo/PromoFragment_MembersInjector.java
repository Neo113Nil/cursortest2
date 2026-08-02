package org.betup.ui.fragment.shop.promo;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class PromoFragment_MembersInjector implements MembersInjector<PromoFragment> {
    private final Provider<UserService> userServiceProvider;

    public PromoFragment_MembersInjector(Provider<UserService> userServiceProvider) {
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<PromoFragment> create(Provider<UserService> userServiceProvider) {
        return new PromoFragment_MembersInjector(userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PromoFragment instance) {
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectUserService(PromoFragment instance, UserService userService) {
        instance.userService = userService;
    }
}
