package org.betup;

import android.app.Service;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;
import org.betup.services.LocaleService;
import org.betup.services.chats.ChatService;
import org.betup.services.push.PushStorageProvider;
import org.betup.services.user.UserService;
import org.betup.utils.balance.BalanceHolder;

/* loaded from: classes2.dex */
public final class BetUpApp_MembersInjector implements MembersInjector<BetUpApp> {
    private final Provider<BalanceHolder> balanceHolderProvider;
    private final Provider<ChatService> chatServiceProvider;
    private final Provider<DispatchingAndroidInjector<Service>> dispatchingServiceInjectorProvider;
    private final Provider<LocaleService> localeServiceProvider;
    private final Provider<PushStorageProvider> pushStorageProvider;
    private final Provider<UserService> userServiceProvider;

    public BetUpApp_MembersInjector(Provider<ChatService> chatServiceProvider, Provider<UserService> userServiceProvider, Provider<PushStorageProvider> pushStorageProvider, Provider<LocaleService> localeServiceProvider, Provider<BalanceHolder> balanceHolderProvider, Provider<DispatchingAndroidInjector<Service>> dispatchingServiceInjectorProvider) {
        this.chatServiceProvider = chatServiceProvider;
        this.userServiceProvider = userServiceProvider;
        this.pushStorageProvider = pushStorageProvider;
        this.localeServiceProvider = localeServiceProvider;
        this.balanceHolderProvider = balanceHolderProvider;
        this.dispatchingServiceInjectorProvider = dispatchingServiceInjectorProvider;
    }

    public static MembersInjector<BetUpApp> create(Provider<ChatService> chatServiceProvider, Provider<UserService> userServiceProvider, Provider<PushStorageProvider> pushStorageProvider, Provider<LocaleService> localeServiceProvider, Provider<BalanceHolder> balanceHolderProvider, Provider<DispatchingAndroidInjector<Service>> dispatchingServiceInjectorProvider) {
        return new BetUpApp_MembersInjector(chatServiceProvider, userServiceProvider, pushStorageProvider, localeServiceProvider, balanceHolderProvider, dispatchingServiceInjectorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BetUpApp instance) {
        injectChatService(instance, DoubleCheck.lazy(this.chatServiceProvider));
        injectUserService(instance, DoubleCheck.lazy(this.userServiceProvider));
        injectPushStorageProvider(instance, DoubleCheck.lazy(this.pushStorageProvider));
        injectLocaleService(instance, DoubleCheck.lazy(this.localeServiceProvider));
        injectBalanceHolder(instance, DoubleCheck.lazy(this.balanceHolderProvider));
        injectDispatchingServiceInjector(instance, this.dispatchingServiceInjectorProvider.get());
    }

    public static void injectChatService(BetUpApp instance, Lazy<ChatService> chatService) {
        instance.chatService = chatService;
    }

    public static void injectUserService(BetUpApp instance, Lazy<UserService> userService) {
        instance.userService = userService;
    }

    public static void injectPushStorageProvider(BetUpApp instance, Lazy<PushStorageProvider> pushStorageProvider) {
        instance.pushStorageProvider = pushStorageProvider;
    }

    public static void injectLocaleService(BetUpApp instance, Lazy<LocaleService> localeService) {
        instance.localeService = localeService;
    }

    public static void injectBalanceHolder(BetUpApp instance, Lazy<BalanceHolder> balanceHolder) {
        instance.balanceHolder = balanceHolder;
    }

    public static void injectDispatchingServiceInjector(BetUpApp instance, DispatchingAndroidInjector<Service> dispatchingServiceInjector) {
        instance.dispatchingServiceInjector = dispatchingServiceInjector;
    }
}
