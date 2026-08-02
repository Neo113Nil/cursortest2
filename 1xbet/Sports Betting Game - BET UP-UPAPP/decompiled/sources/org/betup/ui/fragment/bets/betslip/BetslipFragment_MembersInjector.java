package org.betup.ui.fragment.bets.betslip;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.language.AppLanguageObserver;
import org.betup.ui.fragment.bets.BetsController;

/* loaded from: classes4.dex */
public final class BetslipFragment_MembersInjector implements MembersInjector<BetslipFragment> {
    private final Provider<AppLanguageObserver> appLanguageObserverProvider;
    private final Provider<BetsController> betsControllerProvider;

    public BetslipFragment_MembersInjector(Provider<BetsController> betsControllerProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        this.betsControllerProvider = betsControllerProvider;
        this.appLanguageObserverProvider = appLanguageObserverProvider;
    }

    public static MembersInjector<BetslipFragment> create(Provider<BetsController> betsControllerProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        return new BetslipFragment_MembersInjector(betsControllerProvider, appLanguageObserverProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BetslipFragment instance) {
        injectBetsController(instance, this.betsControllerProvider.get());
        injectAppLanguageObserver(instance, this.appLanguageObserverProvider.get());
    }

    public static void injectBetsController(BetslipFragment instance, BetsController betsController) {
        instance.betsController = betsController;
    }

    public static void injectAppLanguageObserver(BetslipFragment instance, AppLanguageObserver appLanguageObserver) {
        instance.appLanguageObserver = appLanguageObserver;
    }
}
