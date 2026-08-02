package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.language.AppLanguageObserver;
import org.betup.services.push.PushTokenService;

/* loaded from: classes2.dex */
public final class ChangeLanguageFragment_MembersInjector implements MembersInjector<ChangeLanguageFragment> {
    private final Provider<AppLanguageObserver> appLanguageObserverProvider;
    private final Provider<PushTokenService> pushTokenServiceProvider;

    public ChangeLanguageFragment_MembersInjector(Provider<PushTokenService> pushTokenServiceProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        this.pushTokenServiceProvider = pushTokenServiceProvider;
        this.appLanguageObserverProvider = appLanguageObserverProvider;
    }

    public static MembersInjector<ChangeLanguageFragment> create(Provider<PushTokenService> pushTokenServiceProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        return new ChangeLanguageFragment_MembersInjector(pushTokenServiceProvider, appLanguageObserverProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChangeLanguageFragment instance) {
        injectPushTokenService(instance, this.pushTokenServiceProvider.get());
        injectAppLanguageObserver(instance, this.appLanguageObserverProvider.get());
    }

    public static void injectPushTokenService(ChangeLanguageFragment instance, PushTokenService pushTokenService) {
        instance.pushTokenService = pushTokenService;
    }

    public static void injectAppLanguageObserver(ChangeLanguageFragment instance, AppLanguageObserver appLanguageObserver) {
        instance.appLanguageObserver = appLanguageObserver;
    }
}
