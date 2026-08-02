package org.betup.services;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.experiments.ABTestService;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class MyFirebaseMessagingService_MembersInjector implements MembersInjector<MyFirebaseMessagingService> {
    private final Provider<ABTestService> abTestServiceProvider;
    private final Provider<UserService> userServiceProvider;

    public MyFirebaseMessagingService_MembersInjector(Provider<UserService> userServiceProvider, Provider<ABTestService> abTestServiceProvider) {
        this.userServiceProvider = userServiceProvider;
        this.abTestServiceProvider = abTestServiceProvider;
    }

    public static MembersInjector<MyFirebaseMessagingService> create(Provider<UserService> userServiceProvider, Provider<ABTestService> abTestServiceProvider) {
        return new MyFirebaseMessagingService_MembersInjector(userServiceProvider, abTestServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MyFirebaseMessagingService instance) {
        injectUserService(instance, this.userServiceProvider.get());
        injectAbTestService(instance, this.abTestServiceProvider.get());
    }

    public static void injectUserService(MyFirebaseMessagingService instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectAbTestService(MyFirebaseMessagingService instance, ABTestService abTestService) {
        instance.abTestService = abTestService;
    }
}
